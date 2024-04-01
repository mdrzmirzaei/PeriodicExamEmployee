package ir.periodicexaminations.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = EmployeeNotFoundException.class)
    public ResponseEntity<Object> exception(EmployeeNotFoundException exception) {
        return new ResponseEntity<>("Employee not found  employeeId is invalid ", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = SortByIsInvalidException.class)
    public ResponseEntity<Object> exception(SortByIsInvalidException exception) {
        return new ResponseEntity<>("Request rejected SortBy is invalid ", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = SortByDirectionInvalidException.class)
    public ResponseEntity<Object> exception(SortByDirectionInvalidException exception) {
        return new ResponseEntity<>("Request rejected SortBy Direction is invalid ", HttpStatus.BAD_REQUEST);
    }




}
