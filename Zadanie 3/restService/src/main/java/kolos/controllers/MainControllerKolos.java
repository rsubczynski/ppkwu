package kolos.controllers;

import kolos.controllers.responseEntry.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Controller @RequiredArgsConstructor public class MainControllerKolos {

    @RequestMapping("/v2/drawTheMethod") public @ResponseBody BaseResponse drawTheMethod(
            @RequestParam("mail")
                    String mail) {
        int random = (int) (Math.random() * 2 );
        switch (random) {
            case 0:
                return new EmailResponse(isValidEmail(mail));
            case 1:
                List<String> apiList = new ArrayList<>();
                apiList.add("/v2/checkMail");
                apiList.add("/v2/drawFigure");
                return ApiListResponse.builder().apiListResponse(apiList).randomFigure("Wylosowano figurę").build();
            default:
                break;
        }
        return null;
    }

    @RequestMapping("/v2/checkMail") public @ResponseBody EmailResponse sendMail(
            @RequestParam("mail")
                    String mail) {
        return new EmailResponse(isValidEmail(mail));
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(com+\\.)+[a-z" + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        return email != null && pat.matcher(email).matches();
    }

}
