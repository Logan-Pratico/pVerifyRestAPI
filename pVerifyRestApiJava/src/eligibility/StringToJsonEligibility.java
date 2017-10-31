package eligibility;
import com.google.gson.Gson;

public class StringToJsonEligibility {
	private EligibilityResponse tokenResponse = new EligibilityResponse();

	public void convert(String jString) {
	
		Gson gToken = new Gson();
		
		tokenResponse = gToken.fromJson(jString, EligibilityResponse.class);
		
	}

	public EligibilityResponse getEligibilityResponse() {
		return tokenResponse;
	}
	
	

}
