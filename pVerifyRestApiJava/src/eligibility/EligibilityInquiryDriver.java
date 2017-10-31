package eligibility;
import java.io.IOException;

import org.json.JSONObject;
import authorization.TokenResponse;
import authorization.TokensDriver;
public class EligibilityInquiryDriver {

	
	
	public static void main(String[] args) throws IOException {
	
		EligibilityInquiry eligibilityInquiry = new EligibilityInquiry();
		eligibilityInquiry.setJson("https://www.pverify.net/TestEligibilityRest/API/EligibilityInquiry", "");
		EligibilityResponse response = eligibilityInquiry.getJson().getEligibilityResponse();
		System.out.println(response.getPayerName());
		System.out.println(response.getDemographicInfo().getSubscriber().getCommunicationNumber());
		System.out.println(response);
		
		
		

	}

}
