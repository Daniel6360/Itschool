package ro.homework.homework24.controller;

import org.springframework.web.bind.annotation.*;
import ro.homework.homework24.model.Markup;
import ro.homework.homework24.service.MarkupService;

import java.util.List;


@RestController
@RequestMapping("/markups")
public class MarkupController {
    private final MarkupService markupService;

    public MarkupController(MarkupService markupService) {
        this.markupService = markupService;
    }

    @GetMapping("{markups}")
    List<Markup> getAllMarkupForDocument(@RequestParam(required = false) int documentId) {
        return markupService.getAllMarkupsForDocument(documentId);
    }

    @GetMapping
    Markup getMarkupForDocumentWithId(@PathVariable int markupId, @RequestParam int documentId) {
        return markupService.getMarkupForDocumentWithId(markupId, documentId);
    }

    @PostMapping
    Markup addMarkupForDocument(@PathVariable int documentId, @RequestBody Markup markup) {
        return markupService.addMarkupToDocument(documentId, markup);
    }

    @PutMapping
    Markup updateMarkup(@PathVariable int docId, @PathVariable int markId, @RequestBody Markup markup) {
        return markupService.updateMarkup(docId,markId,markup);
    }

    @DeleteMapping("{markupId}")
    void deleteMarkupForDocument(@PathVariable int docId, @PathVariable int markId){
        markupService.deleteMarkupForDocument(docId, markId);
    }

}
