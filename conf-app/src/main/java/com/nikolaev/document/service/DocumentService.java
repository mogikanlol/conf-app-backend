package com.nikolaev.document.service;

import com.nikolaev.document.domain.Document;
import com.nikolaev.document.dto.DocumentDto;

public interface DocumentService {
    DocumentDto getDocument(Long id);
    Document downloadDocument(Long id);

    void deleteDocument(Long documentId);
}
