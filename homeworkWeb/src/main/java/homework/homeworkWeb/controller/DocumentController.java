package homework.homeworkWeb.controller;

import homework.homeworkWeb.model.Document;
import homework.homeworkWeb.model.Markup;
import homework.homeworkWeb.service.DocumentService;
import homework.homeworkWeb.service.MarkupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("documents")
public class DocumentController {
    private final DocumentService documentService;
    private final MarkupService markupService;

    public DocumentController(DocumentService documentService, MarkupService markupService) {
        this.documentService = documentService;
        this.markupService = markupService;
    }

    @GetMapping
    List<Document> getByNameOrOwner(@RequestParam(required = false) String name, String owner) {
        return documentService.getByNameOrOwner(name, owner);
    }

    @GetMapping
    Document getDocumentById(@RequestParam(required = false) String docId) {
        return documentService.getDocumentById(docId);
    }

    @PutMapping
    public Document createDocument(@RequestBody Document doc) {
        return documentService.createDocument(doc);
    }

    @PutMapping
    Document updateDocument(@PathVariable String documentId, Document doc) {
        return documentService.updateDocument(documentId, doc);
    }

    @DeleteMapping
    public Document deleteDocument(@PathVariable String documentId) {
        return documentService.deleteDocument(documentId);
    }

    @GetMapping
    Markup getMarkupByDocId(@RequestParam(required = false) String docId) {
        return markupService.getMarkupByDocId(docId);
    }

    @GetMapping
    List<Markup> getAllMarkups(@RequestParam(required = false) String docId){
        return markupService.getAllMarkups(docId);
    }

    @GetMapping
    Markup getMarkupForDoc(@RequestParam(required = false) String markupId, String docId){
        return markupService.getMarkupForDoc(markupId,docId);
    }

    @PostMapping
    Markup addMarkup(@RequestBody String docId, Markup markup){
        return markupService.addMarkup(docId,markup);
    }

    @PutMapping
    Markup updateMarkup(@PathVariable String docId, String markupId, Markup markup){
        return markupService.updateMarkup(docId,markupId,markup);
    }

    @DeleteMapping
    Markup deleteMarkup(@PathVariable String docId, String markupId){
        return markupService.deleteMarkup(docId,markupId);
    }



}
