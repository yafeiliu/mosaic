import com.fasterxml.jackson.databind.ObjectMapper;
import com.mosaic.Application;
import com.mosaic.entity.User;
import javafx.scene.paint.Color;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by 刘亚飞 on 2017/5/18.
 */
@JsonTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class UserJsonDeserializerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testDeserialize() throws IOException {
        String json = "{\"favoriteColor\":\"#f0f8ff\"}";
        User user = objectMapper.readValue(json, User.class);
        System.out.println(user);

        assertEquals(Color.ALICEBLUE, user.getFavoriteColor());
    }
}
