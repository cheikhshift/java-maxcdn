package tests;





import com.maxcdn.Console;
import com.maxcdn.MaxCDN;
import com.maxcdn.MaxCDNObject;

public class ApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console.log("Attempting Request ---");
		MaxCDN api = new MaxCDN("" , //alias
				"" , //Cons. key
				"");	// Cons. Secret
		
		    //Console.log(api.getAuthUrl(api.getRequestToken()));
			String id = "33706";
			MaxCDNObject data = api.delete("/users.json/"+id);
			if(!data.error)
			Console.log(data);
			else {
				Console.log("Error " + data.getErrorMessage());
			}
			
	
			
		
	}

}
