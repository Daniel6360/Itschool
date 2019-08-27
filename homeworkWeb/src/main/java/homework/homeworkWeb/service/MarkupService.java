package homework.homeworkWeb.service;

import homework.homeworkWeb.model.Markup;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public Markup addMarkup(String docId, Markup markup) {
        markup.setDocumentId(docId);
        markups.add(markup);
        return markup;

    }

    public Markup updateMarkup(String docId, String markupId, Markup markup){
        Markup mark =getMarkupForDoc(markupId,docId);
        markups.remove(mark);
        markups.add(markup);
        return markup;
    }

    public Markup deleteMarkup(String docId, String markupId){
        Markup markup=getMarkupForDoc(markupId, docId);
        markups.remove(markup);
        return markup;
    }

}

