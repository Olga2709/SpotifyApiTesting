import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class GetRequests {
String bearerToken = "BQB9nYcQUtKxGkKOB6t5gCULEm-HyJxup65ZJPhiB9DVnlVw7Bw6s5kiWq0nTBH6dYJZKB_pt-w68YaU6BcqsZIXD9YwZkmFhhdVXZB7iKPSvvorHNtJkUK0OgrqRM3H19bYYL0EXQVoD62Ts6D0rBADIFlPDzAg2VE76Hb1u4xfVw3Kzd7Fm6y7YlAz4jtUARptbOePXsfx1epQQfcVPiM9CAlfeIVE72cVk8-nNX55RkONJ0EPZzkfn8eZOTRU";
    //Status code: 200
    @Test
    public void GetApiResponse200() {
        Response resp = given().
                header("Authorization", "Bearer "+bearerToken).
                get("https://api.spotify.com/v1/browse/categories/party/playlists?country=US&limit=1&offset=1");
        System.out.println(resp.getStatusCode());
        Assert.assertEquals(resp.getStatusCode(), 201);

    }
}
