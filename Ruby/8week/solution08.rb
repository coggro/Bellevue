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

def testName(n)
    return (n =~ /([A-Z][A-Za-z]*\s?){2}/)
end

def testPhone(p)
    return (p =~ /\([0-9]{3}\)[0-9]{3}-[0-9]{4}/)
end

def testEmail(e)
    return (e =~ /\w+@\w+\.\w{2,3}/i)
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
        if (!testName(name))
            puts("Name is invalid.")
        end
        if (!testPhone(phone))
            puts("Phone is invalid.")
        end
        if (!testEmail(email))
            puts("Email is invalid.")
        end

        if (testName(name) && testPhone(phone) && testEmail(email))
            puts("Everything was entered correctly!")
            valid = true
        else
            puts("Please try again.")
        end
    
        pause = STDIN.gets
        $cs.cls
        
        if(valid)
            output = "User: @name\nPhone: @phone\nEmail: @email".sub("@name", name).sub("@phone", phone).sub("@email", email)
            puts(output)
            pause = STDIN.gets
            $cs.cls
        end

    end
    
    $cs.cls

end

main()
