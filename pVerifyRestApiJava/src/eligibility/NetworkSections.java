package eligibility;

public class NetworkSections {
	private NetworkParameters[] InNetworkParameters;

    private String Label;

    private NetworkParameters[] OutNetworkParameters;

    private String Identifier;

    public NetworkParameters[] getInNetworkParameters ()
    {
        return InNetworkParameters;
    }

    public void setInNetworkParameters (NetworkParameters[] InNetworkParameters)
    {
        this.InNetworkParameters = InNetworkParameters;
    }

    public String getLabel ()
    {
        return Label;
    }

    public void setLabel (String Label)
    {
        this.Label = Label;
    }

    public NetworkParameters[] getOutNetworkParameters ()
    {
        return OutNetworkParameters;
    }

    public void setOutNetworkParameters (NetworkParameters[] OutNetworkParameters)
    {
        this.OutNetworkParameters = OutNetworkParameters;
    }

    public String getIdentifier ()
    {
        return Identifier;
    }

    public void setIdentifier (String Identifier)
    {
        this.Identifier = Identifier;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [InNetworkParameters = "+InNetworkParameters+", Label = "+Label+", OutNetworkParameters = "+OutNetworkParameters+", Identifier = "+Identifier+"]";
    }
}
