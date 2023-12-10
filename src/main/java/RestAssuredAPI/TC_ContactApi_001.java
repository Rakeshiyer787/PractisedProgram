package RestAssuredAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TC_ContactApi_001 {
    String  authtoken;
    @Test(enabled = false)
    public void Login(){
    RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com/";
    RestAssured.basePath="users/login";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("email","rolis19292@notedns.com");
        map.put("password","MyPassword");
        Response rep = given().contentType(ContentType.JSON).log().all().body(map).post();
        rep.prettyPrint();
        authtoken =rep.then().extract().path("token");
        int statuscode = rep.getStatusCode();
        System.out.println("Your status code"+statuscode);
        //Assert.assertEquals(200,"Status code matched");
    }

    @Test
    public void AddUser(){
        RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
        RestAssured.basePath="/users";
        Map<String,Object> map = new HashMap<>();
        map.put("firstname","Jeshwik");
        map.put("lastname","Gowda");
        map.put("email","rolis19292@notedns.com");
        map.put("password","myPassword");
        Response rep=given().contentType(ContentType.JSON).log().all().post();
        rep.prettyPrint();
        authtoken=rep.then().extract().path("token");
        int stauscode = rep.getStatusCode();
        System.out.println("Your status code"+stauscode);


    }
}
