package kolos.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    boolean isValid;

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
