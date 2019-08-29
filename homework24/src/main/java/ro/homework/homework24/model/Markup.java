package ro.homework.homework24.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Objects;
@Entity
@Table(name="Markup")
public class Markup {
    private Integer markupId;
    private Integer documentId;
    private String content;
    private Integer position;

    public Markup(Integer documentId, String content, Integer position) {
        this.documentId=documentId;
        this.content = content;
        this.position = position;
    }

    public Integer getMarkupId() {
        return markupId;
    }

    public void setMarkupId(Integer markupId) {
        this.markupId = markupId;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Markup{" +
                "markupId='" + markupId + '\'' +
                ", documentId='" + documentId + '\'' +
                ", content='" + content + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Markup markup = (Markup) o;
        return position == markup.position &&
                markupId.equals(markup.markupId) &&
                documentId.equals(markup.documentId) &&
                content.equals(markup.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markupId, documentId, content, position);
    }
}
