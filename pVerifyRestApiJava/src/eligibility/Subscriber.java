package eligibility;

public class Subscriber {


 
    private String Middlename;

    private String Suffix;

    private String CommunicationNumber;

    private Identification[] Identification;

    private String City;

    private String Lastname_R;

    private String State;

    private String Address2;

    private String Date;

    private String Address1;

    private String Gender_R;

    private String Firstname;

    private String Zip;

    private String DOB_R;

    public String getMiddlename ()
    {
        return Middlename;
    }

    public void setMiddlename (String Middlename)
    {
        this.Middlename = Middlename;
    }

    public String getSuffix ()
    {
        return Suffix;
    }

    public void setSuffix (String Suffix)
    {
        this.Suffix = Suffix;
    }

    public String getCommunicationNumber ()
    {
        return CommunicationNumber;
    }

    public void setCommunicationNumber (String CommunicationNumber)
    {
        this.CommunicationNumber = CommunicationNumber;
    }

    public Identification[] getIdentification ()
    {
        return Identification;
    }

    public void setIdentification (Identification[] Identification)
    {
        this.Identification = Identification;
    }

    public String getCity ()
    {
        return City;
    }

    public void setCity (String City)
    {
        this.City = City;
    }

    public String getLastname_R ()
    {
        return Lastname_R;
    }

    public void setLastname_R (String Lastname_R)
    {
        this.Lastname_R = Lastname_R;
    }

    public String getState ()
    {
        return State;
    }

    public void setState (String State)
    {
        this.State = State;
    }

    public String getAddress2 ()
    {
        return Address2;
    }

    public void setAddress2 (String Address2)
    {
        this.Address2 = Address2;
    }

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    public String getAddress1 ()
    {
        return Address1;
    }

    public void setAddress1 (String Address1)
    {
        this.Address1 = Address1;
    }

    public String getGender_R ()
    {
        return Gender_R;
    }

    public void setGender_R (String Gender_R)
    {
        this.Gender_R = Gender_R;
    }

    public String getFirstname ()
    {
        return Firstname;
    }

    public void setFirstname (String Firstname)
    {
        this.Firstname = Firstname;
    }

    public String getZip ()
    {
        return Zip;
    }

    public void setZip (String Zip)
    {
        this.Zip = Zip;
    }

    public String getDOB_R ()
    {
        return DOB_R;
    }

    public void setDOB_R (String DOB_R)
    {
        this.DOB_R = DOB_R;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Middlename = "+Middlename+", Suffix = "+Suffix+", CommunicationNumber = "+CommunicationNumber+", Identification = "+Identification+", City = "+City+", Lastname_R = "+Lastname_R+", State = "+State+", Address2 = "+Address2+", Date = "+Date+", Address1 = "+Address1+", Gender_R = "+Gender_R+", Firstname = "+Firstname+", Zip = "+Zip+", DOB_R = "+DOB_R+"]";
    }
}
			
			


