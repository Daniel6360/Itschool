package ro.homework.homework24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.homework.homework24.model.Document;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document,Integer> {
    List<Document> getByNameOrOwner(String name, String owner);

    Document getDocumentById(int documentId);
}
