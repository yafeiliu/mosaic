import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mosaic.Application;
import com.mosaic.entity.User;
import com.mosaic.entity.User2;
import javafx.scene.paint.Color;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 刘亚飞 on 2017/5/18.
 */
@JsonTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes= Application.class)
public class UserJsonSerializerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSerialization() throws JsonProcessingException {
        User user = new User(Color.ALICEBLUE);

        String json = objectMapper.writeValueAsString(user);

        System.out.println(json);

        //assertEquals("{\"favoriteColor\":\"#f0f8ff\"}", json);
    }

    @Test
    public void testSerialization2() throws JsonProcessingException {
        User2 user2 = new User2();
        user2.setAge(11);
        user2.setName("繁华");

        String json = objectMapper.writeValueAsString(user2);

        System.out.println(json);

        //assertEquals("{\"favoriteColor\":\"#f0f8ff\"}", json);
    }

}
