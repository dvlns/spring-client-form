package com.clientform.Client.Form.service;

import com.clientform.Client.Form.model.Client;
import com.clientform.Client.Form.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    public Client save(Client client){
        return clientRepository.save(client);
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }
}
