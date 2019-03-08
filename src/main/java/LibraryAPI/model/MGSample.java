package LibraryAPI.model;
import java.io.File;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
public class MGSample {
	 // ...
	public static JsonNode sendSimpleMessage(String correo) throws UnirestException {
		HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + "YOUR_DOMAIN_NAME" + "/messages")
			.basicAuth("api", "f16441a66d2639c3e7740d7be6c08e7a-acb0b40c-67428b16")
			.queryString("from", "Excited User <USER@YOURDOMAIN.COM>")
			.queryString("to", correo)
			.queryString("subject", "hello")
			.queryString("text", "la libreria a sido añadida")
			.asJson();
		return request.getBody();
	}
}