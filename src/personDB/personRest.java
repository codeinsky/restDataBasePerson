package personDB;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import dataBase.connection;

@Path("person")
public class personRest {
	@Path("createPerson")
	@GET
	public String createPerson() {
		connection.createPerson("George" , 30 ); 
		return "person was created";
		
	}
	@Path("getAge")
	@GET
	public int getPersonAge() {
		return connection.getPersonAge("peter");
		
	}
	@Path ("test")
	@GET 
	public String test() {
		return "it works"; 
	}
	

}


// Configured  http://localhost:8080/personDB/rest/person/test
// https://crunchify.com/how-to-fix-java-lang-classnotfoundexception-org-springframework-web-servlet-dispatcherservlet-exception-spring-mvc-tomcat-and-404-error/ 




