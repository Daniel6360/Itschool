package ro.homework.homework24;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.homework.homework24.model.Document;

import java.util.List;

public interface DocumentRepository extends JpaRepository {
     List<Document> getByNameOrOwner(String name, String owner);
}
