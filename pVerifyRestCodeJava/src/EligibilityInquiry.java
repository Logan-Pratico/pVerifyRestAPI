import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class EligibilityInquiry {
	OkHttpClient client = new OkHttpClient();
	MediaType mediaType = MediaType.parse("");
	RequestBody body = RequestBody.create(mediaType, "{    \"payerCode\": \"00192\",\r\n    \"provider\": {\r\n        \"firstName\": \"\",\r\n        \"middleName\": \"\",\r\n        \"lastName\": \" last name vaue\",\r\n        \"npi\": \"1234567890\",\r\n    },\r\n    \"subscriber\": {\r\n        \"firstName\": \"\",\r\n        \"middleName\": \"\",\r\n        \"lastName\": \"\",\r\n        \"memberID\": \"913619424\",\r\n    },\r\n    \"dependent\": {\r\n        \"patient\": {\r\n            \"firstName\": \"\",\r\n            \"middleName\": \"\",\r\n            \"lastName\": \"\",\r\n            \"dob\": \"07/04/1985\",\r\n            \"gender\": \"\",\r\n        },\r\n        \"relationWithSubscriber\": \"\"\r\n    },\r\n    \"isSubscriberPatient\": \"False\",\r\n    \"doS_StartDate\": \"01/24/2017\",\r\n    \"doS_EndDate\": \"01/24/2017\",\r\n    \"serviceCodes\": [\r\n        \"30\"\r\n    ],\r\n\r\n    \"requestSource\": \"RestAPI\"\r\n}\r\n");
	
	public String run(String url, String token) throws IOException{
		Request request = new Request.Builder()
	  .url(url)
	  .post(body)
	  .addHeader("content-type", "application/json")
	  .addHeader("authorization", "Bearer " + token)
	  .addHeader("client-user-name", "pverify_demo")
	  .addHeader("client-password", "pverify@949")
	  .addHeader("cache-control", "no-cache")
	  .addHeader("postman-token", "d657cd54-2985-6ee4-14b3-e5be7da7031d")
	  .build();
		try(Response response = client.newCall(request).execute();){
			return response.body().string();
		}
	}
	
	public static void main(String[] args) throws IOException {
		EligibilityInquiry inquiry = new EligibilityInquiry();
		String response = inquiry.run("https://www.pverify.net/TestEligibilityRest/API/EligibilityInquiry", "rfhPfKNUD1niSd34T6--m33ahCSvsJ_yDUik0-_VJfcC4I4iTRKDMBk6AihLfx_9xeV8KuBwcT3tLXEnXXXHd_ByaSAsVP4xJKDs0LlkPbbGt0qg3MJB2glJNXPmgyuMFERJNKD7tWFyjRh_-fXkdxqiog8WBuQ6ldUh_EyPP0EcpbaF1k2JS102rrm13-8tZT1S6SdoUU_thCiHXOHLK80DbClsIqiuHUWmD4cgPYU");
		System.out.println(response);
	}

	

}
