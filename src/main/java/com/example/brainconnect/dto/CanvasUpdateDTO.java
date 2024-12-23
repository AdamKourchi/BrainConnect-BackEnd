package com.example.brainconnect.dto;

import lombok.Getter;
import lombok.Setter;

// Create a DTO for canvas updates
@Setter
@Getter
public class CanvasUpdateDTO {
    // Getters and setters
    private Long roomId;
    private String canvasData;

}