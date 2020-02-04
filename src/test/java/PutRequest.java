import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutRequest {
String bearerToken = "BQDYjqQyO6GwsABu2IcYWaMWIQuCrL9LhbWJ1o-SVacHfN2eDIpjiIWYnkIMrtyLLSiqOAckPy391_nWA8DdMsiMxP1YMNWr5ZkLCnU2foKRM_yA_mUaLBMVTmRMVbcR6QTIR33jcpxHqzX8CbVD0QSLnbIOooys9tD4RnpMWGwKTd43Lg9xaF9osVY50_jxjwCbjzzgkMNQT11KykczVPfJUUrekQHJXC8jCk6pLWhFfHAcYBwL9YRW1I0QbgvXus1X2DGNEOGJ1Z2tVHtolIf13b-qHA";
@Test
    public  void CreateNewAlbumWithPostRequest() {
    Response resp = given().accept("application/json").
            header("Authorization", "Bearer "+bearerToken).body("{\"name\":\"Java Playlist4\"," +
              "\"description\":\"Java2 playlist description using Postman\"," +
              "\"public\":false} ").contentType("application/x-www-form-urlencoded").
              when().
            post("https://api.spotify.com/v1/users/21swton3li64wqlaphunplkai/playlists");
    try {
    Assert.assertEquals(resp.getStatusCode(), 201);
    System.out.println("Playlist is created");}
    catch (Exception e) {
        System.out.println("Playlist wasn't created");
    }


}




}
