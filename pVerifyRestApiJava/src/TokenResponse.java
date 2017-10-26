

public class TokenResponse {

	    private String expiresIn;

	    private String tokenType;

	    private String accessToken;

	    public String getExpiresIn ()
	    {
	        return expiresIn;
	    }

	    public void setExpiresIn (String expires_in)
	    {
	        expiresIn = expires_in;
	    }

	    public String getTokenType ()
	    {
	        return tokenType;
	    }

	    public void setTokenType (String token_type)
	    {
	        tokenType = token_type;
	    }

	    public String getAccessToken ()
	    {
	        return accessToken;
	    }

	    public void setAccessToken (String access_token)
	    {
	        accessToken = access_token;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [expires_in = "+expiresIn+", token_type = "+tokenType+", access_token = "+accessToken+"]";
	    }
	}


