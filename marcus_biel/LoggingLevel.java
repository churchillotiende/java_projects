
public enum LoggingLevel
{

    PENDING(1 , "") , PROCESSING(2 , "") , PROCCESSED(3 , "");
    private int i;
    private String s;
    private LoggingLevel(int i, String s)
    {
        this.i = i;
        this.s = s;
    }
    public int code()
    {
        return i;
    }
    public String Code()
    {
        return s;
    }

}