package JSON;

import JSON.POJO.User;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JavaToJson {

    public static void main(String[] args){

        ObjectMapper mapper = new ObjectMapper();

        User user = createDummyUser();

        List<String> check = new ArrayList<String>();

        for (String c: user.getMessages()) {
            System.out.println(c);

        }
        try{

            //Create File JSON
            mapper.writeValue(new File("JSON.json"), user);

            //Convert Object to JSON String
            String jsonString = mapper.writeValueAsString(user);
            System.out.println(jsonString);

            //Convert Object to JSON String Use Pretty
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
            System.out.println(jsonString);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
    private static User createDummyUser(){
        User user = new User();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        user.setNama("Dian Setiyadi");
        user.setUmur(new Date().getYear() - new Date(05,12,1994).getYear());

        List<String> msg = new ArrayList<String>();
        msg.add("Hello "+user.getNama()+" 1");
        msg.add("Hello "+user.getNama()+" 2");
        msg.add("Hello "+user.getNama()+" 3");

        user.setMessages(msg);
        return user;
    }
}
