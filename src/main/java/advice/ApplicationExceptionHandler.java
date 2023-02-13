package advice;

import java.util.HashMap;
import java.util.Map;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.erp.model.Student;
@Validated
@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	
//	@ExceptionHandler(ConstraintViolationException.class)
//	public ResponseEntity<Student> handleInvalidException(ConstraintViolationException ex){
//        return new ResponseEntity<>(new JsonErrorResponse (ex.getMessage()), HttpStatus.BAD_REQUEST);
//
//	}

}
