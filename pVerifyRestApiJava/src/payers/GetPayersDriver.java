package payers;

import java.io.IOException;

public class GetPayersDriver {
	
	public static void main(String[] args) throws IOException{
	GetPayers payers = new GetPayers();
	payers.setJson("https://www.pverify.net/TestEligibilityRest/API/GetPayers", "bCffFHylZbgVFFK-l3KNYv1JxsDB8Jj3SKq2pqOERT82DF72Tt9hIaJFDezu3pRqwpDu1eO_2prLitSGzp-qzDfSkhihVNIDafc5aFZ9fgDveusOJx60tGtWQOKtD-_lY7XUrAWrBxUHss2dMgCZ75eG2GxSloBs-Hu9RarxMqoWK0SMkQE-ucQmAwSTJ9kvl8bB0c4rxf6_fdd0IOahE68vcobAi530dmzLZqt7U_8");
	PayersResponse[] response = payers.getJson().getPayersResponse();
for(PayersResponse payer : response) {
	System.out.println("Payer Name: " + payer.getPayerName() +", Payer Code:  " + payer.getPayerCode());
}

System.out.println("HERE: " + payers.getJson().getPayerCode("administrative services inc"));
//	System.out.println(response.);
//	System.out.println(response.length);
	
	}
}
