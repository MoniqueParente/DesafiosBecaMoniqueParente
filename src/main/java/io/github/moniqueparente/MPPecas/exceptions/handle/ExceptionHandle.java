package io.github.moniqueparente.MPPecas.exceptions.handle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.UnexpectedTypeException;
import java.time.LocalDateTime;

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<DefaultException> Error500 (MethodArgumentNotValidException e) {
        DefaultException defaultException = new DefaultException();

        defaultException.setMessagem(e.getBindingResult().getAllErrors().stream()
                .findFirst().get().getDefaultMessage());
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);

    }

    @ExceptionHandler(UnexpectedTypeException.class)
    public ResponseEntity<DefaultException> Error404 (UnexpectedTypeException e){
        DefaultException defaultException = new DefaultException();

        defaultException.setMessagem("Por favor, preencha todos os campos.");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<DefaultException> Error400 (HttpMessageNotReadableException e){
        DefaultException defaultException = new DefaultException();

        defaultException.setMessagem("Apague a vírgula obsoleta");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }

    }

