class Screen
    def cls()
        system('clear') or system('cls')
    end
end

def prompt(message)
    print(message)
    return STDIN.gets.chomp!
    print("\n")
end

$cs = Screen.new
$cs.cls

def regexValidatedPrompt(string, regex)
    
end

def main()

    valid = false
    
    while (!valid)
        puts("Fill out the prompts, or enter \'&\' to exit the program.")
        name = prompt("Enter your name: ")
        if (name == '&')
            break
        end
        phone = prompt("Enter your phone number: ")
        if (phone == '&')
            break
        end
        email = prompt("Enter your email address: ")
        if (email == '&')
            break
        end
   
        $cs.cls

        if (name !~ /([A-Za-z]+\.?\s?)+/)
            puts("Name is invalid.")
        end
        if (phone !~ /\(?\d{3}\)?-?\d{3}-?\d{4}/)
            puts("Phone is invalid.")
        end
        if (email !~ /\w+@\w+\.(com|net|org|edu)/i)
            puts("Email is invalid.")
        end
    
        if (name =~ /([A-Za-z]+\.?\s?)+/ && phone =~ /\(?\d{3}\)?-?\d{3}-?\d{4}/ && email =~ /\w+@\w+\.(com|net|org|edu)/i)
            puts("Everything was entered correctly!")
            valid = true
        else
            puts("Please try again.")
        end
    
        pause = STDIN.gets
        $cs.cls
        
    end
    
    output = "User: @name\nPhone: @phone\nEmail: @email".sub("@name", name).sub("@phone", phone).sub("@email", email)
    puts(output)

    pause = STDIN.gets
    $cs.cls


end

main()
