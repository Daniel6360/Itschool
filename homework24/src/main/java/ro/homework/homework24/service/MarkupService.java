package ro.homework.homework24.service;

import org.springframework.stereotype.Service;
import ro.homework.homework24.model.Markup;
import ro.homework.homework24.repository.MarkupRepository;

import java.util.List;

@Service
public class MarkupService {
    private MarkupRepository repository;

    public MarkupService(MarkupRepository repository) {
        this.repository = repository;
    }

    public List<Markup> getAllMarkupsForDocument(int documentId){
        return repository.findByDocumentId(documentId);
    }

    public Markup getMarkupForDocumentId(int markupId,int documentId){
        return repository.getMarkupForDocumentWithMarkupId(markupId,documentId);
    }

    public Markup addMarkupToDocument(int documentId, Markup markup){
        repository.save(markup);
        return markup;
    }

    public Markup updateMarkup(int docId, int markId, Markup markup){
        return repository.updateMarkupIdbyDocumentId(docId, markId,markup);
    }

    public void deleteMarkupForDocument(int docId, int markId){
        repository.deletebyDocumentId(docId,markId);
    }

}
