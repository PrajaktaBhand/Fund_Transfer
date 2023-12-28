//package Conation;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class Connection {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		
//		URL url = new URL("http://localhost:8080/storeData");
//		HttpURLConnection con = (HttpURLConnection) url.openConnection();
//		con.setRequestMethod("POST");
//		con.setRequestProperty("Content-Type", "application/json");
//		con.setRequestProperty("Accept", "application/json");
//		con.setDoOutput(true);
//		String jsonInputString = "{\"fromAccountNumber\":1111,\"toAccountNumber00\":2222,\"fAmount\":5000}";
//
//		try (OutputStream os = con.getOutputStream()) {
//			byte[] input = jsonInputString.getBytes("utf-8");
//			os.write(input, 0, input.length);
//		}
//
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
//			StringBuilder response = new StringBuilder();
//			String responseLine = null;
//			while ((responseLine = br.readLine()) != null) {
//				response.append(responseLine.trim());
//			}
//			System.out.println(response.toString());
//		}
//
//	}
//
//}
