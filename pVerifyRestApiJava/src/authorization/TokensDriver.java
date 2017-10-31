package authorization;
import java.io.IOException;

import org.json.JSONObject;

public class TokensDriver {
	

	
	public static void main(String[] args) throws IOException {
		GetToken token = new GetToken();
		token.setJson("https://www.pverify.net/TestEligibilityRest/Token");
		TokenResponse response = token.getJson().getTokenResponse();
	
		System.out.println(response);
		System.out.println(response.getAccess_token());
		System.out.println(response.getExpires_in());
		System.out.println(response.getToken_type());
	}
	
	
	
	
}
