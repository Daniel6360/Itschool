package ro.homework.homework24.controller;

import org.springframework.web.bind.annotation.*;
import ro.homework.homework24.model.Document;
import ro.homework.homework24.service.DocumentService;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    List<Document> getallDocuments() {
        return documentService.getDocuments();
    }

    @GetMapping("{documentId}")
    Document getDocumentById(@PathVariable int documentId) {
        return documentService.getDocumentById(documentId);
    }

    @PostMapping
    Document addDocument(@RequestBody Document document) {
        return documentService.addDocument(document);
    }

    @PutMapping("{documentId}")
    Document updateDocument(@PathVariable int documentId, @RequestBody Document document) {
        return documentService.updateDocument(documentId, document);
    }

    @DeleteMapping("{documentId}")
    void deleteDocument(@PathVariable int documentId){
        documentService.deleteDocument(documentId);
    }
}
