package models;
import java.util.Map;
import java.util.HashMap;

public class Users {
	
	
	public static Map<String,String> customer;
	public String userId;
	public String passWord;
	
	static {
		customer = new HashMap<String,String>();
		customer.put("Sudheer","LinkinPark");
		customer.put("Sheshagiri","BrunoMars");
		customer.put("Sudhanshu","KatyPerry");
		customer.put("Aditya","SamHunt");		
	}
	
	public Users(){}
	
	public Users(String id, String pw){
		this.userId=id;
		this.passWord=pw;
	}
		
	
	public String authenticate(){
		boolean s = customer.containsKey(this.userId);
		if(s){
			if(customer.get(this.userId).equals(this.passWord))
				return "Successful Login";
			else
				return "Invalid password";
		}				
			return "No user found";
		
	}
	
	

}
