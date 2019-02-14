package com.rockarolla;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rockarolla.jackson.JacksonCustomizationModule;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        try {
            new Main().thing1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private ObjectMapper mapper = mapper();

    private void thing1() throws Exception {

        String jsonResult = mapper.writeValueAsString(testObject());
        System.out.println(jsonResult);

        DataTransferObject deserialized = mapper.readValue(jsonResult, DataTransferObject.class);
        System.out.println(deserialized);
        System.out.println();
        for (int i = 0; i < deserialized.getObjects().size(); i++) {
            System.out.printf("DTO deserialized list item %d, class: %s\n", i, deserialized.getObjects().get(i).getClass().toString());
        }
    }





    private DataTransferObject testObject() {
        Map<Object, Object> genericObject = new HashMap<>();
        genericObject.put("version", "42");
        genericObject.put("id", 72);

        return new DataTransferObject(
                "myTestDto",
                asList(new Customer("joe"), new Item("Slinky toy"), genericObject)
        );
    }

    private static ObjectMapper mapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JacksonCustomizationModule());
        return mapper;
    }
}
