package com.nikolaev.document.repository;


import com.nikolaev.document.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    @Override
    Document getOne(Long id);
}
