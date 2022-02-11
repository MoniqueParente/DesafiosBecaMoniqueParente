# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
______________________________________________________________________________________________________________________________________________________________________________

⭕ Tratamento de Erros.
______________________________________________________________________________________________________________________________________________________________________________

⚜ Tratamento de Erros.

Interessante passar ao usuário mensagens de erro suscintas e esclarecedoras.

Na classe correspondente para tratamento de erros é necessário a assinatura: @ControllerAdvice

Exemplo:

@ExceptionHandler(UnexpectedTypeException.class)

    public ResponseEntity<DefaultException> Error404 (UnexpectedTypeException e){
        DefaultException defaultException = new DefaultException();

        defaultException.setMessagem("Por favor, preencha todos os campos.");
        defaultException.setDataHora(LocalDateTime.now());
        defaultException.setStatus(HttpStatus.BAD_REQUEST.value());

        return ResponseEntity.status(defaultException.getStatus()).body(defaultException);
    }
 
 Tipos tratados:
 `/MethodArgumentNotValidException`
 `/UnexpectedTypeException`
 `/HttpMessageNotReadableException`
 
 ______________________________________________________________________________________________________________________________________________________________________________
✨ [Menu](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/main/README.md)<br/>
