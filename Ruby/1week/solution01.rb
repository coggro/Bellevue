class Screen
    def cls
        system("clear") or system("cls")
    end
end

def printOut(num)
    puts ("Number:\t#{num} | Square:\t#{num * num} | Cube:\t#{num * num * num}\n(Press Enter to Continue)")
    pause = STDIN.gets
    Console_Screen.cls
end

Console_Screen = Screen.new
Console_Screen.cls

numbers = [1, 2, 5, 10, 20]

for i in numbers
    printOut(i)
end

puts("END OF PROGRAM")
