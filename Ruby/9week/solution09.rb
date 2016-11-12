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

def main()

    noun = prompt("Enter a noun: ")
    verb = prompt("Enter a verb: ")
    adjective = prompt("Enter an adjective: ")
    adverb = prompt("Enter an adverb: ")
    $cs.cls
    
    mlFile = File.read("madlib.txt")
    puts("Mad Lib Text:")
    puts mlFile
    
    puts("\n\n")
    
    puts("Variables:")
    puts("Noun: #{noun}")
    puts("Verb: #{verb}")
    puts("Adjective: #{adjective}")
    puts("Adverb: #{adverb}")
    
    puts("\n\n")
    
    puts("Mad Lib Text Adjusted:")
    puts mlFile.sub("@noun", noun).sub("@verb", verb).sub("@adjective", adjective).sub("@adverb", adverb)

    STDIN.gets
    $cs.cls

end

main()
