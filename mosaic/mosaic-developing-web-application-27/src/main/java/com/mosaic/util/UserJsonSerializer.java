package com.mosaic.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.mosaic.entity.User;
import javafx.scene.paint.Color;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * Created by 刘亚飞 on 2017/5/18.
 */
//@JsonComponent
public class UserJsonSerializer extends JsonSerializer<User> {

    @Override
    public void serialize(User user, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {

        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField(
                "favoriteColor",
                getColorAsWebColor(user.getFavoriteColor())

        );
        jsonGenerator.writeEndObject();
    }

    private static String getColorAsWebColor(Color color) {
        int r = (int) Math.round(color.getRed() * 255.0);
        int g = (int) Math.round(color.getGreen() * 255.0);
        int b = (int) Math.round(color.getBlue() * 255.0);
        return String.format("#%02x%02x%02x", r, g, b);
    }
}
