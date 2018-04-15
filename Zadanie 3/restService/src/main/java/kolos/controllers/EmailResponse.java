package kolos.controllers;

import kolos.controllers.responseEntry.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailResponse implements BaseResponse {

    boolean isValid;

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
