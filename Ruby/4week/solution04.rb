class Screen
    def cls()
        system('clear') or system('cls')
    end
end

$cs = Screen.new

def prompt(message)
    puts(message)
    return STDIN.gets.chomp!
end

name = prompt("Enter a person's name:");
$cs.cls
movie = prompt("Enter the name of a movie:");
$cs.cls
book = prompt("Enter the name of a book:")
$cs.cls

puts ("Hello! My name is " + name + ". My favorite movie is " + movie \
        + "\nand my favorite book is " + book + ".")

puts %Q{Hello! My name is #{name}. My favorite movie is #{movie} and my favorite book is #{book}.}
pause = STDIN.gets
