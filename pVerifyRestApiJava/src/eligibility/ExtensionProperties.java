package eligibility;
public class ExtensionProperties
{
    private String PayerCode;

    private String ResultReport;

    private String VerifiedOn;

    private String PayerID;

    private String VerifiedBy;

    public String getPayerCode ()
    {
        return PayerCode;
    }

    public void setPayerCode (String PayerCode)
    {
        this.PayerCode = PayerCode;
    }

    public String getResultReport ()
    {
        return ResultReport;
    }

    public void setResultReport (String ResultReport)
    {
        this.ResultReport = ResultReport;
    }

    public String getVerifiedOn ()
    {
        return VerifiedOn;
    }

    public void setVerifiedOn (String VerifiedOn)
    {
        this.VerifiedOn = VerifiedOn;
    }

    public String getPayerID ()
    {
        return PayerID;
    }

    public void setPayerID (String PayerID)
    {
        this.PayerID = PayerID;
    }

    public String getVerifiedBy ()
    {
        return VerifiedBy;
    }

    public void setVerifiedBy (String VerifiedBy)
    {
        this.VerifiedBy = VerifiedBy;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [PayerCode = "+PayerCode+", ResultReport = "+ResultReport+", VerifiedOn = "+VerifiedOn+", PayerID = "+PayerID+", VerifiedBy = "+VerifiedBy+"]";
    }
}