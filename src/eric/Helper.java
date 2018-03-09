package eric;


import java.util.Date;

public class Helper
{

    private String name;

    public  Helper() {
        name = new Date().toString();
    }

    public String getName()
    {
        return "Hello " + name;
    }

}
