package com.clientform.Client.Form.controller.response;

import lombok.Builder;

@Builder
public record ClientResponse(Long id, String name, String cellphone, String email) {
}
