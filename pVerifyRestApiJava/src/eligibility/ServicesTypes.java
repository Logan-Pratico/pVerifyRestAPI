package eligibility;
public class ServicesTypes
{
    private ServiceTypeSections[] ServiceTypeSections;

    private String ServiceTypeName;

    public ServiceTypeSections[] getServiceTypeSections ()
    {
        return ServiceTypeSections;
    }

    public void setServiceTypeSections (ServiceTypeSections[] ServiceTypeSections)
    {
        this.ServiceTypeSections = ServiceTypeSections;
    }

    public String getServiceTypeName ()
    {
        return ServiceTypeName;
    }

    public void setServiceTypeName (String ServiceTypeName)
    {
        this.ServiceTypeName = ServiceTypeName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ServiceTypeSections = "+ServiceTypeSections+", ServiceTypeName = "+ServiceTypeName+"]";
    }
}