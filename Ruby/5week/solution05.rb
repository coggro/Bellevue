# Corey Gross
# Professor Payne
# Server-Side Scripting with Ruby
# solution05.rb
# 17 October 2016

class Screen
    def cls()
        system('clear') or system('cls')
    end
end

$cs = Screen.new
$cs.cls

def prompt(message)
    puts(message)
    return STDIN.gets.chomp!
end

def main()
    contLoop = false

    while (!contLoop)
        number = prompt("Enter a number between 1 and 100 (inclusive):").to_f
        $cs.cls

        if (number >= 1 && number <= 100)
            if (number >= 90)    
                puts("This student deserves an \"A.\"")
            elsif (number >= 80)
                puts("This student deserves a \"B.\"")
            elsif (number >= 70)
                puts("This student deserves a \"C.\"")
            elsif (number >= 60)
                puts("This student deserves a \"D.\"")
            else
                puts("This student has failed. Give them an \"F.\"")
            end
            pause = STDIN.gets
            $cs.cls

            # Test to continue the loop
            continue = prompt("Enter X to exit. Press Enter to Continue.")
            $cs.cls
            contLoop = continue.upcase == "X"
        else
            puts("That number is invalid. Try again. (Press Enter to Continue)")
            pause = STDIN.gets
            $cs.cls
            # Doesn't require a continuation test
        end
    end

    puts("Thank you for using our program!")
    pause = STDIN.gets
    $cs.cls

end

main()
