package eligibility;

public class EligibilityPeriod {
    private String Label;

    private String EffectiveFromDate;

    private String ExpiredOnDate;

    public String getLabel ()
    {
        return Label;
    }

    public void setLabel (String Label)
    {
        this.Label = Label;
    }

    public String getEffectiveFromDate ()
    {
        return EffectiveFromDate;
    }

    public void setEffectiveFromDate (String EffectiveFromDate)
    {
        this.EffectiveFromDate = EffectiveFromDate;
    }

    public String getExpiredOnDate ()
    {
        return ExpiredOnDate;
    }

    public void setExpiredOnDate (String ExpiredOnDate)
    {
        this.ExpiredOnDate = ExpiredOnDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Label = "+Label+", EffectiveFromDate = "+EffectiveFromDate+", ExpiredOnDate = "+ExpiredOnDate+"]";
    }
}
