package br.com.emmanuelneri.monolitica.util.converters;

import br.com.emmanuelneri.monolitica.util.Util;
import com.google.common.base.Strings;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@FacesConverter(value = "localDateConverter")
public class LocalDateJSFConverter extends DateTimeConverter {

    @Override
    public LocalDate getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if(!Strings.isNullOrEmpty(value)) {
            try {
                return LocalDate.parse(value, Util.DATE_TIME_FORMAT_DEFAULT);
            } catch (DateTimeParseException dtpex) {
                dtpex.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if(o instanceof LocalDate) {
            return ((LocalDate) o).format(Util.DATE_TIME_FORMAT_DEFAULT);
        }
        return null;
    }
}