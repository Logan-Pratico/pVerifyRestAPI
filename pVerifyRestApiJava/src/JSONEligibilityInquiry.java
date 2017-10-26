import java.io.IOException;
import org.json.JSONObject;

public class JSONEligibilityInquiry {
	
	public static void main(String[] args) throws IOException {
		EligibilityInquiry eligibilityInquiry = new EligibilityInquiry();
		eligibilityInquiry.setInquiry("https://www.pverify.net/TestEligibilityRest/API/EligibilityInquiry", "rfhPfKNUD1niSd34T6--m33ahCSvsJ_yDUik0-_VJfcC4I4iTRKDMBk6AihLfx_9xeV8KuBwcT3tLXEnXXXHd_ByaSAsVP4xJKDs0LlkPbbGt0qg3MJB2glJNXPmgyuMFERJNKD7tWFyjRh_-fXkdxqiog8WBuQ6ldUh_EyPP0EcpbaF1k2JS102rrm13-8tZT1S6SdoUU_thCiHXOHLK80DbClsIqiuHUWmD4cgPYU");
		JSONObject jsonObj = new JSONObject(eligibilityInquiry);
		
		System.out.println(jsonObj);
	}

}
