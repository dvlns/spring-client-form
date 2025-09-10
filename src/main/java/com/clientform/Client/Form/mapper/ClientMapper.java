package com.clientform.Client.Form.mapper;

import com.clientform.Client.Form.controller.request.ClientRequest;
import com.clientform.Client.Form.controller.response.ClientResponse;
import com.clientform.Client.Form.model.Client;

public class ClientMapper {

    public static Client toEntity(ClientRequest request) {
        return Client.builder()
                .name(request.name())
                .cellphone(request.cellphone())
                .email(request.email())
                .build();
    }

    public static ClientResponse toResponse(Client client) {
        return ClientResponse.builder()
                .id(client.getId())
                .name(client.getName())
                .cellphone(client.getCellphone())
                .email(client.getEmail())
                .build();
    }
}
