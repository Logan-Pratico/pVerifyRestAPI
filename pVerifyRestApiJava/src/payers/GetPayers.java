package payers;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class GetPayers {
	OkHttpClient client = new OkHttpClient();
	MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
	RequestBody body = RequestBody.create(mediaType, "username=pverify_demo&password=pverify%40949&grant_type=password");
	private String payer;
	private StringToJsonPayers json = new StringToJsonPayers();
	
	
public void setJson(String url, String token) throws IOException {
	Request request = new Request.Builder()
	  .url(url)
	  .get()
	  .addHeader("content-type", "application/json")
	  .addHeader("authorization", "Bearer " + token)
	  .addHeader("client-user-name", "pverify_demo")
	  .addHeader("client-password", "pverify@949")
	  .addHeader("cache-control", "no-cache")
	  .addHeader("postman-token", "fa82e2d5-4acc-df1f-bccb-6838df4e0704")
	  .build();
	try(Response response = client.newCall(request).execute()){
		payer = response.body().string();
		System.out.println(payer);
		json.convert(payer);
		
		
	}
	
}

public StringToJsonPayers getJson() {
	return json;
}
//	public static void main(String[] args) throws IOException {
//		GetPayers payers = new GetPayers();
//		String response = payers.run("https://www.pverify.net/TestEligibilityRest/API/GetPayers", "1JBs-qOasIqUf6HwotJka1Y9fES__JMEJVqIiJ8QjAGOAjF6SxF3TEVhhTU0VraJAtBu_2AiGYUhxwBuxoV-aOzThadgbIBcvMYCZeLAKWjN3I4cSsJ3Ttdo8G97qs4j7ac8B9uDwyYcU2cu2JpTKEsG4K6RC1NxpJW9m4_9l4Pbi1SwVDYMm-lNlEM2lC8A-iiC3jf5Wm1ezgKyBeLEF4Ex4Uf6BlhwTyYEC_n9brE");
//		System.out.println(response);
//	}
}
