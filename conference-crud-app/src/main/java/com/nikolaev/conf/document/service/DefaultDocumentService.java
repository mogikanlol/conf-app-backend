package com.nikolaev.conf.document.service;

import com.nikolaev.conf.DomainEntityNotFoundException;
import com.nikolaev.conf.document.domain.Document;
import com.nikolaev.conf.document.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DefaultDocumentService implements DocumentService {

    private final DocumentRepository documentRepository;

    @Override
    public Document getById(Long id) {
        return documentRepository.findById(id)
                .orElseThrow(() -> new DomainEntityNotFoundException(id));
    }
}
