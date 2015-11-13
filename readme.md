# MaxCDN REST API Java Client

## Requirements

 - Java 1.6 or Later

## Usage
	import com.maxcdn.MaxCDN;
	import com.maxcdn.MaxCDNObject;
	import com.maxcdn.MaxCDNRequest;
	....
	//Class construction
	MaxCDN api = new MaxCDN(YOUR_ALIAS ,YOUR_CONSUMER_KEY,YOUR_CONSUMER_SECRET);
	//Performing a GET request
	MaxCDNObject data = api.get("/account.json");
	
## Advanced Usage
This section describes how to perform PUT and POST requests.

	//Creating a Push Zone
	try {
		MaxCDNRequest post_parameters = new MaxCDNRequest("name", "NewZone").append("password", "password");
		api.post("/zones/push.json", post_parameters);
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
## Error Handling

	//Attempting to create a Push Zone with the same name
	try {
		MaxCDNRequest post_parameters = new MaxCDNRequest("name", "NewZone").append("password", "password");
		MaxCDNObject data = api.post("/zones/push.json", post_parameters);
		if(data.error) System.out.println(data.getErrorMessage());
		else {
		  System.out.println("Operation successful");
		}
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	