package ro.itschool.curs23.firstwebapp.model;

import java.util.Objects;

public class Document {
    private String documentId;
    private String name;

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return documentId.equals(document.documentId) &&
                name.equals(document.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name);
    }

    public Document(String documentId, String name) {
        this.documentId = documentId;
        this.name = name;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
