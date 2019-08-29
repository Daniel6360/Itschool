package ro.homework.homework24.service;

import org.springframework.stereotype.Service;
import ro.homework.homework24.model.Document;
import ro.homework.homework24.repository.DocumentRepository;

import java.util.List;


@Service
public class DocumentService {

    private DocumentRepository repo;

    public DocumentService(DocumentRepository repo) {
        this.repo = repo;
    }

    public List<Document> getDocuments() {
        return repo.findAll();
    }

    public List<Document> getByNameOrOwner(String name, String owner) {
        return repo.getByNameOrOwner(name, owner);
    }

    public Document getDocumentById(int documentId) {
        return repo.getDocumentById(documentId);

    }

    public Document addDocument(Document document) {
        repo.save(document);
        return document;
    }

    public Document updateDocument(int documentId, Document document) {
        repo.deleteById(documentId);
        repo.save(document);
        return document;
    }

    public void deleteDocument(int documentId) {
        repo.deleteById(documentId);

    }


}
