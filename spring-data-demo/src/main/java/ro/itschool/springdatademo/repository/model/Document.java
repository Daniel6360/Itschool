package ro.itschool.springdatademo.repository.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Document")
public class Document {
    @Id
    @GeneratedValue

    private Integer documentId;
    private String name;
    private String content;
    private String owner;

    public Document(){

    }

    public Document( String name, String content, String owner) {
        this.name = name;
        this.content = content;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
