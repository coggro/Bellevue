class Screen
    def cls
        system("clear") or system("cls")
    end
end

def printOut(num)
    puts ("Number:\t#{num} | Square:\t#{num * num} | Sq. Root:\t#{Math.sqrt(num).round(2)}\n(Press Enter to Continue)")
    pause = STDIN.gets
    Console_Screen.cls
end

def input()
    puts ("Enter a number between 1 and 100:")
    number = STDIN.gets.chomp!.to_f
    if number >= 1 && number <= 100
        return number
    else
        puts ("That number choice was invalid. Try Again.")
        pause = STDIN.gets
        Console_Screen.cls
        return input()
    end
end
        
Console_Screen = Screen.new
Console_Screen.cls

number = input()
Console_Screen.cls

printOut(number)

puts("END OF PROGRAM")
