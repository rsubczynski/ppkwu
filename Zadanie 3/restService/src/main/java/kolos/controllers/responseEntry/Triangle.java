package kolos.controllers.responseEntry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Triangle implements BaseResponse {

    public Triangle(double height, double base, String figureName) {
        filed = 0.5 * height * base;
        heightTriagle = height;
        this.figureName = figureName;
    }

    private String figureName;

    private double heightTriagle;

    private double filed;

}
