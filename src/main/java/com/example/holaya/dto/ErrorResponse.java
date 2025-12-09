package com.example.holaya.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ErrorResponse {
    String error;
    String detail;
}