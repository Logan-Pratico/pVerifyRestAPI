package eligibility;
import java.io.IOException;

public class GetEligibilityDriver {
	public static void main(String[] args) throws IOException {
		GetEligibility eligibility = new GetEligibility();
		eligibility.setJson("https://www.pverify.net/TestEligibilityRest/API/GetEligibilityResponse/", "6917774", "1JBs-qOasIqUf6HwotJka1Y9fES__JMEJVqIiJ8QjAGOAjF6SxF3TEVhhTU0VraJAtBu_2AiGYUhxwBuxoV-aOzThadgbIBcvMYCZeLAKWjN3I4cSsJ3Ttdo8G97qs4j7ac8B9uDwyYcU2cu2JpTKEsG4K6RC1NxpJW9m4_9l4Pbi1SwVDYMm-lNlEM2lC8A-iiC3jf5Wm1ezgKyBeLEF4Ex4Uf6BlhwTyYEC_n9brE" + 
				"");
		EligibilityResponse response = eligibility.getJson().getEligibilityResponse();
		System.out.println(response.getPayerName());
		System.out.println(response);
		System.out.println(response.getDOS());
		
	}
}
