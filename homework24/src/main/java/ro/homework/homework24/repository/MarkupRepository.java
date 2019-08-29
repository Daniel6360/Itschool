package ro.homework.homework24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.homework.homework24.model.Markup;

import java.util.List;

@Repository
public interface MarkupRepository extends JpaRepository<Markup, Integer> {
    List<Markup> findByDocumentId(int documentId);


}
