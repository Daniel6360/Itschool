package ro.itschool.curs23.firstwebapp.service;

import org.springframework.stereotype.Service;
import ro.itschool.curs23.firstwebapp.model.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

@Service
public class DocumentService {
    private final List<Document>documents=new ArrayList<>();

    public List<Document> getDocuments(){
        return documents;
    }

    public List<Document>getDocuments(String name){
        return ofNullable(name)
                .map(this::getByName)
                .orElse(documents);
    }

    public List<Document> getByName(String name){
        return documents.stream()
                .filter(doc->doc.getName().equals(name))
                .collect(Collectors.toList());
    }

    public Document addDocument(Document doc) {
        doc.setDocumentId(UUID.randomUUID().toString());
        documents.add(doc);
        return doc;
    }

    public Document getDocument(String documentId) {
        return documents.stream()
                .filter(doc->doc.getDocumentId().equals(documentId))
                .findFirst()
                .orElse(null);
    }

    public Document updateDocument(String documentId, Document doc) {
        final Document existingDocument=getDocument(documentId);
        if (existingDocument!=null){
            doc.setDocumentId(documentId);
            documents.remove(existingDocument);
            documents.add(doc);
            return existingDocument;
        }else {
            return null;
        }
    }

    public Document deleteDocument(String documentId) {
        final Document doc=getDocument(documentId);
        if (documents.remove(doc)){
            return doc;
        }else {
            return null;
        }
    }
}
