package Week2.day3;

public class ApiClient {
	public void sendRequest(String endPoint) {
		
		System.out.println("Value: "+endPoint);
	}
	
	public void sendRequest(String endPoint,String requestBody,Boolean status) {
		System.out.println(endPoint+" "+requestBody+" "+status);
	}
	
	public static void main(String[] args) {
		ApiClient client=new ApiClient();
		client.sendRequest("value");
		client.sendRequest("value2", "requestbody", true);
	}

}
