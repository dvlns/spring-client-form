package com.clientform.Client.Form.repository;

import com.clientform.Client.Form.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
