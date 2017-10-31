package eligibility;

public class NetworkParameters {
    private String Value;

    private String Key;

    private String Message;

    public String getValue ()
    {
        return Value;
    }

    public void setValue (String Value)
    {
        this.Value = Value;
    }

    public String getKey ()
    {
        return Key;
    }

    public void setKey (String Key)
    {
        this.Key = Key;
    }

    public String getMessage ()
    {
        return Message;
    }

    public void setMessage (String Message)
    {
        this.Message = Message;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Value = "+Value+", Key = "+Key+", Message = "+Message+"]";
    }

}
