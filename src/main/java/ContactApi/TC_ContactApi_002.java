package ContactApi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

/**
 * @author Rakesh
 * Add user proile
 */

public class TC_ContactApi_002 {
    String authToken;

    @Test(priority = 1)
    public void Login() {
        RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com/";
        RestAssured.basePath = "users/login";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("email", "tovuqisy@tutuapp.bid");
        map.put("password", "myPassword");
        Response rep = given().contentType(ContentType.JSON).log().all().body(map).post();
        rep.prettyPrint();
        authToken = rep.then().extract().path("token");
        int statuscode = rep.getStatusCode();
        Assert.assertEquals(statuscode, 200, "status code matched");
    }


    @Test(priority = 2)
    public void add_User_Profile() {
        RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com/";
        RestAssured.basePath = "users";
        String firstname = Utilities.firstname(), lastname = Utilities.lastname(), email = Utilities.email();
        Map<String, Object> map = new HashMap<>();
        map.put("firstName", firstname);
        map.put("lastName", lastname);
        map.put("email", email);
        map.put("password", "mypassword");
        Response rep = given().contentType(ContentType.JSON).log().all().body(map).get();
        rep.prettyPrint();
        authToken = rep.then().extract().path("token");
        int statuscode = rep.getStatusCode();
        Assert.assertEquals(statuscode, 201, "status code matched");

    }



}





