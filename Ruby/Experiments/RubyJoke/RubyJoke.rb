#--------------------------------------------------
#
# Script Name: RubyJoke.rb
# Version: 1.0
# Author: Jerry Lee Ford, Jr., Corey Gross
# Date: March 2010, September 2016
#--------------------------------------------------

# Define custom classes ---------------------------

class Screen
    def cls #Define a method that clears the display area
        puts ("\n" * 25) #Scroll the screen 25 times
    end
end

# Main Script Logic -------------------------------

#Initialize a new Screen object
Console_Screen = Screen.new

#Execute the Screen object's cls method to clear the
#screen
Console_Screen.cls

#prompt the player for permission to begin the game
puts "Would you like to hear a few funny jokes? (y/n)"

#Collect the player's response
answer = STDIN.gets

#Remove any extra characters appended to the string
answer.chop!

#Analyze the player's response
#See if the player elected not to play
if answer == "n"
    
    #Clear the display area
    Console_Screen.cls
    
    #Invite the player to return and play again
    puts "Sorry to hear that. Please return and play again" +
        "soon."
else
    
    #Clear the display area
    Console_Screen.cls
    
    #Display the beginning of the first joke
    puts "What is black and white and red all over?" + 
        "(Press Enter)"
    #Force the player to press enter to continue
    pause = STDIN.gets

    #Display the punch line
    puts "A messy penguin eating cherry pie! (Press Enter)"
    #Force the player to press enter to continue
    pause = STDIN.gets

    #Lather, rinse, repeat...-------------------
    Console_Screen.cls

    puts "What is black and white and red all over?" +
        "(Press Enter)"
    pause = STDIN.gets
    
    puts "An embarassed Dalmatin puppy! (Press Enter)"
    pause = STDIN.gets

    Console_Screen.cls

    puts "What is black and white and red all over?" +
        "(Press Enter)"
    pause = STDIN.gets
    
    puts "A zebra with a scratched knee! (Press Enter)"
    pause = STDIN.gets

    Console_Screen.cls

    puts "What is black and white and red all over?" +
        "(Press Enter)"
    pause = STDIN.gets
    
    puts "A skunk with diaper rash! (Press Enter)"
    pause = STDIN.gets

    Console_Screen.cls

    puts "Thanks for playing the Ruby Joke Game!"

end
