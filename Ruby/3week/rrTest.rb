PI = 3.14159

class Screen
    def cls()
        system('clear') or system('cls')
    end
end

$cs = Screen.new

def decPlace(dec, num)
    return ("%.#{dec}f" % num)
end

def printOut(num, ang)
    puts ("Number: #{num} | Angle: #{decPlace(4, ang)}\nSine: "\
        "#{decPlace(4, Math.sin(ang))} | Cosine: "\
        "#{decPlace(4, Math.cos(ang))} | Tangent: #{decPlace(4, Math.tan(ang))}")
    pause = STDIN.gets
end

def input()
    puts ("Enter a number between 1 and 6")
    number = STDIN.gets.chomp!.to_f
    if number >= 1 && number <= 6
        return number
    else
        puts ("That number choice was invalid. Try again.")
        pause = STDIN.gets
        $cs.cls
        return input()
    end
end

number =input()
$cs.cls

angle = PI/number
printOut(number, angle)
$cs.cls

puts("END OF PROGRAM")
