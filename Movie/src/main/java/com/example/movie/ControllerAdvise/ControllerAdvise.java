package com.example.movie.ControllerAdvise;

import com.example.movie.ApiExeception.ApiExeception;
import com.example.movie.ApiResponse.ApiResponse;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvise {

    @ExceptionHandler(value = ApiExeception.class)
    public ResponseEntity<ApiResponse> ApiException(ApiExeception e);
    String message=e.getmessage();
       return ResponseEntity.stotus(400).body(new Apiresponse(message)){

    }
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Apiresponse> ApiExcption(ApiExeception e);
    String Message=e.getmessage();
       return ResponseEntity.stotus(400).body(new Apiresponse(message)){

    }

}
}
