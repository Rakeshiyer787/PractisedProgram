package ContactApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TC_ContactApi_004 {

    @Test
    public void Verify_delete_user(){
        RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com/";
        RestAssured.basePath = "users/login";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("email", "damionrowei@testmail.com");
        map.put("password", "myPassword");
        Response rep = given().contentType(ContentType.JSON).log().all().body(map).post();

        //authToken = rep.then().extract().path("token");
       // int statuscode = rep.getStatusCode();

    }

    }

