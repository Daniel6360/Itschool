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

    public Markup getMarkupsById(int markupId){
        return repository.findByMarkupId(markupId);
    }

    public Markup addMarkupToDocument(int documentId, Markup markup){
        repository.save(markup);
        return markup;
    }

    public Markup updateMarkup( int markId, Markup markup){
        Markup mark=repository.findByMarkupId(markId);
        repository.delete(mark);
        repository.save(markup);
        return markup;
    }

    public void deleteMarkupForDocument(int markupId){
        Markup markup=repository.findByMarkupId(markupId);
        repository.delete(markup);

    }

}
