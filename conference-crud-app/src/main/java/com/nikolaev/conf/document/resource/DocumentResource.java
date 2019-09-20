package com.nikolaev.conf.document.resource;

import com.nikolaev.conf.document.dto.DocumentDto;
import com.nikolaev.conf.document.service.DocumentService;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/documents")
public class DocumentResource {

    private final DocumentService documentService;

    private final MapperFacade mapperFacade;

    @GetMapping("{id}")
    public DocumentDto getById(@PathVariable("id") Long id) {
        return mapperFacade.map(documentService.getById(id), DocumentDto.class);
    }


}
