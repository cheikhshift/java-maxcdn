package tests;



import com.maxcdn.Console;
import com.maxcdn.MaxCDN;
import com.maxcdn.MaxCDNObject;
import com.maxcdn.MaxCDNRequest;

public class ApiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console.log("Attempting Request ---");
		MaxCDN api = new MaxCDN("jvmstix" , //alias
				"" , //Cons. key
				"");	// Cons. Secret
		
	
			String id = "62698";
        
            MaxCDNRequest data = MaxCDN.newRequest("firstname", "Sanjaaaa").append("lastname", "sanjaa").append("email", "cheikh@orkiv.com").append("password", "azerty123");
            MaxCDNObject response = api.post("/users.json", data);
            Console.log(response);
            Console.log(response.error ? "Error " + response.getErrorMessage()  : response.code  );
            
       
		    MaxCDNRequest params = MaxCDN.newRequest("street1", "1234").append("street2", "Put testing");
		    System.out.println(api.put("/account.json/address",params));
	
	
			
		
	}

}
