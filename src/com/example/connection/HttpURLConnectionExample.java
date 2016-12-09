package com.example.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
 
public class HttpURLConnectionExample {

	public static void main(String[] args) throws Exception {

		HttpURLConnectionExample http = new HttpURLConnectionExample();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
	}

	// HTTP GET request
	private void sendGet() throws Exception {

		String url = "https://syed-syed.process.us2.oraclecloud.com/bpm/workspace/auth/token?type=jwt_token";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		//con.setRequestProperty("Host", "syed-syed.process.us2.oraclecloud.com");
		//con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:45.0) Gecko/20100101 Firefox/45.0");
		//con.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		//con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		//con.setRequestProperty("Accept-Encoding", "gzip, deflate");
		con.setRequestProperty("Cookie", "token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6IkdLaWJWeEpiQU14dm1CNHItVEpKTUZTaklUdyJ9.eyJleHAiOjE0ODAwNjU5MDgsImlzcyI6InBjc19qd3QiLCJwcm4iOiJhYXNoaXNoLmouamFpbkBvcmFjbGUuY29tIiwiaWF0IjoxNDgwMDUxNTA4fQ.eoMmjh8tlxSxfGoo0iAEKl9PCGLVkTPRjXWLtYvdxSTgl_G3TzTUYkKU1cneG3GOEGZad-4U4HQW0zf7hMbX3GSFWuYBMZjBeqLSoJhSwAWv8jJgBsib4YVKCyWsgN2rIMePL8NuPskf72oSgn1NtpJ28zFdkQ6wbdFE8uukl8U; JSESSIONID=3ZiZ8cZ9Sdj_KzcekOzpzE_ZylwSFle5isEHEvzCPXbguz2H8Oxd!2044147913!NONE; jwt=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIng1dCI6IkdLaWJWeEpiQU14dm1CNHItVEpKTUZTaklUdyJ9.eyJleHAiOjE0ODAwMDA5MjIsImlzcyI6InBjc19qd3QiLCJwcm4iOiJhYXNoaXNoLmouamFpbkBvcmFjbGUuY29tIiwiaWF0IjoxNDc5OTg2NTIyfQ.iyOAquAnNp3pJDhoSpC_4vHbKpxcGBjN6j42x9Wjfg2VSmiVJm9N6-3QoqvNZRP4YY_1AH6T3JaSs7HsUXcOQurRLM_kx9X0aNugoqJXlWaJGrF9yaDCEzGe6iL8QxZrV07NdN_w1ewRLWU9JXJ2_NCjyEPJIiLtt38wixiiTC0; USER_TIMEZONE_COOKIE=330; OAMAuthnCookie_syed-syed.process.us2.oraclecloud.com:443=w%2BoFqX%2F1krCl1kI2OzawQ0J%2FX0ILpFav5qexloqnTpKh10588%2FJrxiE8ux4BxVQDTx3g5DgeWiiJqLdFvVc68%2Bhs1gdAaKOrGdmHtOCt2pTyHE4SD8NACZrWecOyZXpQbbbnCQXFDTud14%2BewMeN0d8KjxtTRdmC5G3mk%2FBoMowvkXT6U80r1gP0aV8NhtigddCr%2BKgfE1rl%2F1CLyOFj4pruSeKYtFExsniYh5P6FcwCHTZFinSZVhsx5IbUGIxD1D7ntRJcaMTeTqTOMEYR2euZUDFCEs5YBoozA%2FXwwTT6pbJ%2FaPAM9keAigVYbuimfHtn%2BEOht593briW8O6zBrZzPhvuDMvNwehKmJ%2FY%2Bxli0WdY5lJR8Mfyw49rojIXQVwmIreTnfV6XdQHbbUM03E8nOqNxPqWQLI3U86KI2UYZ5LFgO794fXvCGp3ob7CkIBc%2F3qEROFqIdSm65WVijcSkEeDbKjRoPTBD1NfW8WaZ3RTwyynzL%2FF8nfZbmNs%2BV00Gkprh8%2FYy78vBiq921%2FpGfCgjVpwYKtxY3Qy5w73hV50DTpLo75r7fLTAC7p; _WL_AUTHCOOKIE_JSESSIONID=jcVhJkBB5.10DIGvSYd-");
		//con.setRequestProperty("Connection", "keep-alive");

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println("Token ::: "+response.toString());

	}
}