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
        
            MaxCDNRequest data = MaxCDN.newRequest("firstname", "Sanjaaaa").append("lastname", "sanjaa");
            MaxCDNObject response = api.put("/users.json/"+id, data);
            System.out.println(response.error ? "Error " + response.getErrorMessage()  : response.get("code")  );
       
       
		    MaxCDNRequest params = MaxCDN.newRequest("street1", "1234");
		    System.out.println(api.put("/account.json/address",params));
	
	
			
		
	}

}
