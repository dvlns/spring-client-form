package com.clientform.Client.Form.controller.request;

import lombok.Builder;

@Builder
public record ClientRequest(String name, String cellphone, String email) {
}
