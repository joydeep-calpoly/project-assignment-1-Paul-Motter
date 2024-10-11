package ArticleParser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Source {

    private String id;
    private String name;

    @JsonCreator
    private Source(@JsonProperty String id, @JsonProperty String name){
        this.id = id;
        this.name = name;
    }

}
