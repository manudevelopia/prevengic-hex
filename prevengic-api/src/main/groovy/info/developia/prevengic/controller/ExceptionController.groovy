package info.developia.prevengic.controller

import info.developia.prevengic.exception.BadRequestException
import info.developia.prevengic.exception.ComposeNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class ExceptionController {
    private class ErrorMessage {
        int statusCode
        String message
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ComposeNotFoundException)
    @ResponseBody
    ErrorMessage handleComposeNotFoundException(ComposeNotFoundException ex) {
        return new ErrorMessage(statusCode: HttpStatus.NOT_FOUND.value(), message: ex.getMessage())
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequestException)
    @ResponseBody
    ErrorMessage handleBadRequestException(BadRequestException ex) {
        return new ErrorMessage(statusCode: HttpStatus.BAD_REQUEST.value(), message: ex.getMessage())
    }
}
