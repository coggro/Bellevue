# Corey Gross
# Professor Payne
# Server-Side Scripting with Ruby
# Solution06.rb
# 24 October 2016
# Fibonacci Finder

class Screen
    def cls()
        system('clear') or system('cls')
    end
end

def prompt(message)
    puts(message)
    return STDIN.gets.chomp!
end

$cs = Screen.new
$cs.cls

def main()
    $firstNum = 0
    $secondNum = 1

    # Validate input
    termLoop = false 
    while (!termLoop)
        position = prompt("Enter the position you'd like to reach in\n"\
            "the Fibonnaci sequence, betwen 0 and 100:").to_i
        # It's easier to verify truth here than falsehood, so I test for
        # truth and set the loop to continue on the opposite of the result
        termLoop = (position >= 0 && position <= 100)
        if(!termLoop)
            puts("Your entry is invalid. Try again.")
            pause = STDIN.gets
            $cs.cls
        end
    end

    $cs.cls
    
    # Calculate Fib number at position
    # I want this loop to execute from 0 to position so that I can use 0
    # as a first index, like in matrices
    for i in 0..position
        # If position 0 is the end of the loop, I want to print the
        # Fib number right off the bat.
        if (i == position && i == 0)
            puts("The number at positon 0 is #{$firstNum}.")
        # Otherwise, I only want to print the Fib number if it is equal
        # to the end of the loop.
        elsif (i == position)
            puts("The number at position #{i} is #{$secondNum}.")
        # If it's not the end of the loop and it's not the 0 position, I
        # want to iterate over the process that bumps up the values to
        # the next slot of Fib numbers. I do this by placeholding the
        # higher number, setting the higher number to itself plus the
        # lower number (the next Fib number), and then setting the lower
        # number to the previous Fib number using the placeholder.
        elsif (i >= 1)
            placeholder = $secondNum
            $secondNum += $firstNum
            $firstNum = placeholder
        end
    end

    pause = STDIN.gets
    $cs.cls

end

main()
