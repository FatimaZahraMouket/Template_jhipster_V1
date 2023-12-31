package com.appbiomedicale.repository;

import com.appbiomedicale.domain.ExtraUser;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ExtraUser entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ExtraUserRepository extends JpaRepository<ExtraUser, Long> {}
