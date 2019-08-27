package homework23.homework.model;

import java.util.Objects;

public class Markup {
    private String markupId;
    private String documentId;
    private String content;
    private int position;

    public Markup(String markupId, String documentId, String content, int position) {
        this.markupId = markupId;
        this.documentId=documentId;
        this.content = content;
        this.position = position;
    }

    public String getMarkupId() {
        return markupId;
    }

    public void setMarkupId(String markupId) {
        this.markupId = markupId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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
