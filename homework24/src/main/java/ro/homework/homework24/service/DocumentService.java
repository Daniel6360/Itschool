package ro.homework.homework24.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ro.homework.homework24.DocumentRepository;
import ro.homework.homework24.controller.DocumentController;
import ro.homework.homework24.model.Document;

import java.util.ArrayList;
import java.util.List;


@Service
public class DocumentService {

    private final List<Document> documents = new ArrayList<>();

    public DocumentService(DocumentRepository repo) {
        this.repo = repo;
    }

    DocumentRepository repo;

    public List<Document> getByNameOrOwner(String name, String owner) {
        return repo.getByNameOrOwner(name, owner);
    }


}
