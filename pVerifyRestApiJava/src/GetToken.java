import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class GetToken {
	
	private OkHttpClient client = new OkHttpClient();
	private MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
	private RequestBody body = RequestBody.create(mediaType, "username=pverify_demo&password=pverify@949&grant_type=password");
	private TokenResponse tokenResponse = new TokenResponse();
	private String token;
	
public void setToken(String url) throws IOException{
		Request request = new Request.Builder().url(url)
	  .post(body)
	  .addHeader("content-type", "application/x-www-form-urlencoded")
	  .addHeader("cache-control", "no-cache")
	  .addHeader("postman-token", "a8b54837-13aa-29db-47ea-793130984de5")
	  .build();
		try(Response response = client.newCall(request).execute()){
			token = response.body().string();
			scanToken(token);

		}
	}
	
	public String getToken() {
		return token;
	}

	public TokenResponse getTokenResponse() {
		return tokenResponse;
	}
	
public void scanToken(String input) {
	int a = 0;
	String newToken;
	int product = 1;
	for (int i = 0; i < input.length(); i++) {
		if (input.charAt(i) != '"') {
			int k = indexOf(input, '"', i);
			if (k == -1) {

				newToken = input.substring(i + 1, input.length()-1);
				tokenResponse.setExpiresIn(newToken);

				return;
				
				
			}
			else {

			newToken = input.substring(i,k);
			if(a == 3) {
				
				tokenResponse.setAccessToken(newToken);
			}else if(a == 7) {
				tokenResponse.setTokenType(newToken);
			}
			a++;
			i = k;
			}
		}
	}
	return;
}

private static int indexOf(String s, char ch, int fromIndex) {
	
	for (int i = fromIndex; i < s.length(); i++) {
		if (s.charAt(i) == ch) {
			return i;
		}

	}
	return -1;
}
	
	

	
	}

