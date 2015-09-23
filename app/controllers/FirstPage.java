package controllers;
import play.mvc.Result;
import play.mvc.Controller;
import views.html.*;
import models.Users;
import play.data.*;
import java.util.Map;

public class FirstPage extends Controller {
	
	private static final Form<Users> cust = Form.form(Users.class);
	
	public Result StartPage(){
		return ok(logins.render(cust));
	}
	
public Result WelcomePage(){
	
	Form<Users> boundForm = cust.bindFromRequest();
	Users usr = boundForm.get();
	String message= usr.authenticate();
	if(message.equals("Successful Login"))
		return ok(String.format("%s",message));
	else{
		 	flash("Login Attempt Failed",String.format("%s", message));
			return badRequest(logins.render(boundForm));
		}
	}
	

}

