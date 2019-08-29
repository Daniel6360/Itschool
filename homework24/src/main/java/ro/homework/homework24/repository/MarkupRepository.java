package ro.homework.homework24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.homework.homework24.model.Markup;

import java.util.List;

@Repository
public interface MarkupRepository extends JpaRepository<Markup, Integer> {
    public List<Markup> getAllMarkupsForDocument(int documentId);

    public Markup getMarkupForDocumentWithId(int markupId, int documentId);

    public Markup addMarkupToDocument(int documentId, Markup markup);

    public Markup updateMarkup(int documentId,int markupId, Markup markup);

    void deleteMarkupForDocument(int docId,int markId);
}
