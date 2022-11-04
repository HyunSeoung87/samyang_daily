package hyun.samyang_daily.Convert;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanToIntConverter implements AttributeConverter<Boolean, Integer> {
    /**
     * Boolean 값을 1 또는 0 으로 컨버트
     *
     * @param attribute boolean 값
     * @return String true 인 경우 1 또는 false 인 경우 0
     */
    @Override
    public Integer convertToDatabaseColumn(Boolean attribute) {
        return (attribute != null && attribute) ? 1 : 0;
    }
    /**
     * Y 또는 N 을 Boolean 으로 컨버트
     *
     * @param dbData 1 또는 0
     * @return Boolean 대소문자 상관없이 1 인 경우 true, 0 인 경우 false
     */
    @Override
    public Boolean convertToEntityAttribute(Integer dbData) {
        return (dbData != null && dbData >= 0) ? true : false;
    }
}
