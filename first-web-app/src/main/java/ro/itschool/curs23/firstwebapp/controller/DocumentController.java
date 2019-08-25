package ro.itschool.curs23.firstwebapp.controller;


import org.springframework.web.bind.annotation.*;
import ro.itschool.curs23.firstwebapp.model.Document;
import ro.itschool.curs23.firstwebapp.service.DocumentService;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {
    private final DocumentService documentService;

    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping
    List<Document> getDocuments(@RequestParam(required = false) String name) {
        System.out.println("Getting all documents");
        return documentService.getDocuments();
    }

    @PostMapping
    Document addDocument(@RequestBody Document doc) {
        return documentService.addDocument(doc);
    }

    @GetMapping("{documentId}")
    Document getDocumentId(@PathVariable String documentId) {
        return documentService.getDocument(documentId);
    }

    @PutMapping("{documentId}")
    Document updateDocument(@PathVariable String documentId, @RequestBody Document doc) {
        return documentService.updateDocument(documentId, doc);
    }
        @DeleteMapping("{documentId}")
        Document deleteDocument (@PathVariable String documentId){
        return documentService.deleteDocument(documentId);
    }

}
