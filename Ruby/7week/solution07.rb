# Prompt user to enter num between 1 and 10 inclusive, read into var
# Test that num is in range, enclose in loop
# Use num to create array with num elements
# Write a loop that will run through array, prompting user for text for
#    each element
# Display array, 3 elements to a line, separating by dashes, no dash at
#    either end of a line
# Sort the array alphabetically, then display it again
# Reverse order, then display it again

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

def dispArray(array, title)
    puts(title)
    arrLen = array.length-1
    for i in 0..arrLen
        if ( i == arrLen )
            print("#{array[i]}")
        elsif ( i % 3 == 2 )
            print("#{array[i]}\n")
        else
            print("#{array[i]}-")
        end
    end
    puts("\n\n")
end

def numInRange(min, max)
    numTest = false
    while ( !numTest )
        num = prompt("Enter a number between #{min} and #{max}, inclusive:").to_i
        numTest = ( num >= min && num <= max)
        if ( !numTest )
            $cs.cls
            puts("The number you entered, #{num}, is invalid. Try again.")
            pause = STDIN.gets
            $cs.cls
        end
    end
    return num
end

def main()

    $cs.cls
    
    num = numInRange(1, 10)

    $cs.cls
    
    stringArray = Array.new(num)
    for i in 0..stringArray.length-1
        stringArray[i] = prompt("Enter text to store at position #{i}")
        # puts("Value at index #{i}: #{stringArray[i]}")
    end
    
    $cs.cls
    
    dispArray(stringArray, "As Entered")
    stringArray.sort!
    dispArray(stringArray, "Alphabetical")
    stringArray.reverse! { |x,y| y <=> x }
    dispArray(stringArray, "Reverse Alphabetical")
    
    pause = STDIN.gets
    $cs.cls

end

main()
