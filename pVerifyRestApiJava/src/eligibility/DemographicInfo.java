package eligibility;

public class DemographicInfo {
	
	    private Subscriber Dependent;

	    private Subscriber Subscriber;

	    public Subscriber getDependent ()
	    {
	        return Dependent;
	    }

	    public void setDependent (Subscriber Dependent)
	    {
	        this.Dependent = Dependent;
	    }

	    public Subscriber getSubscriber ()
	    {
	        return Subscriber;
	    }

	    public void setSubscriber (Subscriber Subscriber)
	    {
	        this.Subscriber = Subscriber;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [Dependent = "+Dependent+", Subscriber = "+Subscriber+"]";
	    }
}
