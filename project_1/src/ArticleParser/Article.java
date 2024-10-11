package ArticleParser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Article {

    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
    

    @JsonCreator
    private Article(@JsonProperty Source source, @JsonProperty String author, @JsonProperty String title, @JsonProperty String description,
    @JsonProperty String url, @JsonProperty String urlToImage, @JsonProperty String publishedAt, @JsonProperty String content){
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publishedAt = publishedAt;
        this.content = content;
    }
    
}
