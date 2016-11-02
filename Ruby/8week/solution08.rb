

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

def regexValidatedPrompt(string, regex)
    
end

def main()

end

main()
