package validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy= TypeLessonValidator.class)
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
public @interface TypeLesson {
    String message() default "Not correct type of lesson";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    class FIELD {
    }
}
