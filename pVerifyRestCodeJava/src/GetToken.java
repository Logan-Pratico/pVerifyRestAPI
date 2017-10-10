import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class GetToken {
	
	OkHttpClient client = new OkHttpClient();
	MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
	RequestBody body = RequestBody.create(mediaType, "username=pverify_demo&password=pverify@949&grant_type=password");
	
public String run(String url) throws IOException{
		Request request = new Request.Builder().url(url)
	  .post(body)
	  .addHeader("content-type", "application/x-www-form-urlencoded")
	  .addHeader("cache-control", "no-cache")
	  .addHeader("postman-token", "a8b54837-13aa-29db-47ea-793130984de5")
	  .build();
		try(Response response = client.newCall(request).execute()){
			return response.body().string();
		}
	}
	
	

	
	
public static void main(String[] args) throws IOException {
		GetToken token = new GetToken();
		String response = token.run("https://www.pverify.net/TestEligibilityRest/Token");
		System.out.println(response);
	}
	
	}

