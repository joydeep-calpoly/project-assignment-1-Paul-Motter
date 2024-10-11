package ArticleParser;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class ArticleList{

    
    private String status;
    private int totalResults;
    private ArrayList<Article> articleList;

    @JsonCreator
    private ArticleList(@JsonProperty String status, @JsonProperty int totalResults, @JsonProperty ArrayList<Article> articles){
    this.status = status;
    this.totalResults = totalResults;
    this.articleList = articleList;
    
    }
}