package ArticleParser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

    public static void main(String[] args) throws JsonProcessingException, IOException {
        File f = new File("project-assignment-1-Paul-Motter/project_1/inputs/example.json");
        ObjectMapper mapper = new ObjectMapper();
        ArticleList articleList = mapper.readValue(f, ArticleList.class);
            
    }
    

    
}
