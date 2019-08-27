package homework.homeworkWeb.service;

import homework.homeworkWeb.model.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class DocumentService {
    private final List<Document> documents = new ArrayList<>();

    public List<Document> getDocument() {
        return documents;
    }

    public List<Document> getByNameOrOwner(String name,String owner) {
        return documents.stream()
                .filter(document -> document.getName().equals(name))
                .filter(document -> document.getOwner().equals(owner))
                .collect(Collectors.toList());


    }

    public Document getDocumentById(String docId){
        return documents.stream()
                .filter(document -> document.getDocumentId().equals(docId))
                .findFirst()
                .orElse(null);
    }

    public Document createDocument(Document doc){
        doc.setDocumentId(UUID.randomUUID().toString());
        documents.add(doc);
        return doc;
    }

    public Document updateDocument(String documentId, Document doc) {
        final Document existingDocument=getDocumentById(documentId);
        if (existingDocument!=null){
            doc.setDocumentId(documentId);
            documents.remove(existingDocument);
            documents.add(doc);
            return existingDocument;
        }else {
            return null;
        }
    }

    public Document deleteDocument(String docId){
        final Document doc=getDocumentById(docId);
        if(documents.remove(doc)){
            return doc;
        }
        else {
            return null;
        }
    }
}

