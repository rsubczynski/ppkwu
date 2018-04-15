package kolos.controllers;

import kolos.controllers.responseEntry.BaseResponse;
import kolos.controllers.responseEntry.Circle;
import kolos.controllers.responseEntry.Square;
import kolos.controllers.responseEntry.Triangle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.regex.Pattern;

@Controller @RequiredArgsConstructor public class MainControllerKolos {

    @RequestMapping("/v1/drawTheMethod") public @ResponseBody BaseResponse drawTheMethod(
            @RequestParam("mail")
                    String mail) {
        int random = (int) (Math.random() * 2);
        switch (random) {
            case 0:
                return new EmailResponse(isValidEmail(mail));
            case 1:
                return drawFigure();
            default:
                break;
        }
        return null;
    }

    private @ResponseBody BaseResponse drawFigure() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return new Circle(3.6f, "Koło");
            case 1:
                return new Square(3.6f, "Kwadrat");
            case 2:
                return new Triangle(3.6f, 1, "Trójkąt");
            default:
                break;
        }
        return null;
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(com+\\.)+[a-z" + "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        return email != null && pat.matcher(email).matches();
    }

}
