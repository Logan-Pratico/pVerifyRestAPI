import java.io.IOException;

import org.json.JSONObject;

public class JSONGetTokens {
	public static void main(String[] args) throws IOException {
		GetToken token = new GetToken();
		token.setToken("https://www.pverify.net/TestEligibilityRest/Token");
		JSONObject jsonObj = new JSONObject(token.getTokenResponse());
		
		System.out.println("NORMAL TOKEN" + token.getToken());
		System.out.println("ACCESS TOKEN: " + token.getTokenResponse().getAccessToken());
		System.out.println("TOKEN TYPE: " + token.getTokenResponse().getTokenType());
		System.out.println("EXPIRES IN: " + token.getTokenResponse().getExpiresIn());
		System.out.println("FULL STRING: " + token.getTokenResponse().toString());
		
	}
}
