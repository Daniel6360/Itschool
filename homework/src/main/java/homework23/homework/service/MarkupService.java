package homework23.homework.service;

import homework23.homework23.model.Document;
import homework23.homework23.model.Markup;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MarkupService {
    private final List<Markup> markups = new ArrayList<>();

    public Markup getMarkupByDocId(String docId) {
        return markups.stream()
                .filter(markup -> markup.getDocumentId().equals(docId))
                .findFirst()
                .orElse(null);
    }


    public List<Markup> getAllMarkups(String docId) {
        return markups.stream()
                .filter(markup -> markup.getDocumentId().equals(docId))
                .collect(Collectors.toList());

    }

    public Markup getMarkupForDoc(String markupId, String docId) {
        return markups.stream()
                .filter(markup -> markup.getDocumentId().equals(docId))
                .filter(markup -> markup.getMarkupId().equals(markupId))
                .findFirst()
                .orElse(null);
    }

    public void addMarkup(String docId, Markup markup) {
        markup.setDocumentId(docId);
        markups.add(markup);

    }

    public void updateMarkup(String docId, String markupId, Markup markup){
       Markup mark =getMarkupForDoc(markupId,docId);
       markups.remove(mark);
       markups.add(markup);
    }

    public void deleteMarkup(String docId, String markupId){
        Markup markup=getMarkupForDoc(markupId, docId);
        markups.remove(markup);
    }

}
