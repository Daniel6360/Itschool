package ro.homework.homework24.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;


@Entity
@Table(name="Document")
public class Document {

    @Id
    @GeneratedValue
    private Integer documentId;
    private String name;
    private String content;
    private String owner;

    public Document( String name, String content, String owner) {

        this.name = name;
        this.content = content;
        this.owner = owner;
    }

    public Integer getDocumentId() {
        return documentId;
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

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return documentId.equals(document.documentId) &&
                name.equals(document.name) &&
                content.equals(document.content) &&
                owner.equals(document.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, content, owner);
    }
}
