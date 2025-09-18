package com.clientform.Client.Form.controller;

import com.clientform.Client.Form.controller.request.ClientRequest;
import com.clientform.Client.Form.controller.response.ClientResponse;
import com.clientform.Client.Form.mapper.ClientMapper;
import com.clientform.Client.Form.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientResponse>> getAll(){
        return ResponseEntity.ok(clientService.getAll()
                .stream()
                .map(ClientMapper::toResponse)
                .toList());
    }

    @PostMapping
    public ResponseEntity<ClientResponse> createUser(@RequestBody ClientRequest request){
        var client = ClientMapper.toEntity(request);
        var savedClient = clientService.save(client);
        return ResponseEntity.ok(ClientMapper.toResponse(savedClient));
    }


}
