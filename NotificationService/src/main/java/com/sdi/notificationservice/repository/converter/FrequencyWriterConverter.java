package com.sdi.notificationservice.repository.converter;

import com.sdi.notificationservice.domain.Frequency;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FrequencyWriterConverter implements Converter<Frequency, Integer> {

    @Override
    public Integer convert(Frequency frequency) {
        return frequency.getDays();
    }
}
