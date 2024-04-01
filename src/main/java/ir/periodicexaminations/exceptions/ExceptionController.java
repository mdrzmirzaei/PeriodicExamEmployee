package ir.periodicexaminations.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = EmployeeNotFoundException.class)
    public ResponseEntity<Object> exception(EmployeeNotFoundException exception) {
        return new ResponseEntity<>("Employee not found  employeeId is invalid ", HttpStatus.NOT_FOUND);

    }


}
