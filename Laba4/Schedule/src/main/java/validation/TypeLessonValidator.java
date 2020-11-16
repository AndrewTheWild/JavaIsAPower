package validation;

import validation.TypeLesson;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class TypeLessonValidator  implements ConstraintValidator<TypeLesson, String> {

    private List<String> typeValue = Arrays.asList(new String[]{"лек.","лаб.","сем.","фіз.","ЗВ.","практ."});

    @Override
    public void initialize(TypeLesson constraintAnnotation) {

    }

    @Override
    public boolean isValid(String type, ConstraintValidatorContext constraintValidatorContext) {
        return typeValue.contains(type);
    }
}
