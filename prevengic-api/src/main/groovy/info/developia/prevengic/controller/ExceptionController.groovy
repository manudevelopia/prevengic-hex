package info.developia.prevengic.controller


import info.developia.prevengic.exception.ComposeNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class ExceptionController {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ComposeNotFoundException)
    @ResponseBody
    ErrorMessage handleComposeNotFoundException(Exception ex) {
        return new ErrorMessage(statusCode: HttpStatus.NOT_FOUND.value(), message: ex.getMessage())
    }

    class ErrorMessage {
        int statusCode
        String message
    }
}
