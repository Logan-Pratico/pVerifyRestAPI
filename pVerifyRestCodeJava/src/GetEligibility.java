import java.io.IOException;



import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class GetEligibility {
	
OkHttpClient client = new OkHttpClient();
MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
RequestBody body = RequestBody.create(mediaType, "username=pverify_demo&password=pverify%40949&grant_type=password");

public String run(String url, String urlCode, String token ) throws IOException{
Request request = new Request.Builder()
  .url(url.concat(urlCode))
  .get()
  .addHeader("content-type", "application/json")
  .addHeader("authorization", "Bearer " + token)
  .addHeader("client-user-name", "pverify_demo")
  .addHeader("client-password", "pverify@949")
  .addHeader("cache-control", "no-cache")
  .addHeader("postman-token", "3a1204a9-ad9f-a6f1-3218-2a03e407b099")
  .build();
	
	try(Response response = client.newCall(request).execute()){
		return response.body().string();
	}

}


public static void main(String[] args) throws IOException {
	GetEligibility eligibility = new GetEligibility();
	String response = eligibility.run("https://www.pverify.net/TestEligibilityRest/API/GetEligibilityResponse/", "6917774", "rfhPfKNUD1niSd34T6--m33ahCSvsJ_yDUik0-_VJfcC4I4iTRKDMBk6AihLfx_9xeV8KuBwcT3tLXEnXXXHd_ByaSAsVP4xJKDs0LlkPbbGt0qg3MJB2glJNXPmgyuMFERJNKD7tWFyjRh_-fXkdxqiog8WBuQ6ldUh_EyPP0EcpbaF1k2JS102rrm13-8tZT1S6SdoUU_thCiHXOHLK80DbClsIqiuHUWmD4cgPYU");
	System.out.println(response);
}

}
