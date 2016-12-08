import java.awt.*;

public class myDebug
{
    private String message;

    public static void main(String[] args)
    {
    
        myDebug.JOPMessage("HELLO WORLD!");
    
    }

    public myDebug(String message)
    {
    
        this.message = message;
    
    }
    
    public void JOPMessage(String message)
    {
    
        JOptionPane.showMessageDialog(null, message);
    
    }

    public String getMessage()
    {
        
        return this.message;

    }

    public void setMessage()
    {
    
        this.message = message;
    
    }

}
