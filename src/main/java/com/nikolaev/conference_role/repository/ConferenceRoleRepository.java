package com.nikolaev.conference_role.repository;

import com.nikolaev.conference_role.domain.ConferenceRole;
import com.nikolaev.conference_role.domain.ConferenceRoleName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRoleRepository extends JpaRepository<ConferenceRole, Long> {
    ConferenceRole findByName(ConferenceRoleName name);
}
