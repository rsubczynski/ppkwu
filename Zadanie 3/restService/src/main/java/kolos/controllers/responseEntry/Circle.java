package kolos.controllers.responseEntry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Circle implements BaseResponse {

    public Circle(float sideFigure, String figureName) {
        radius = sideFigure;
        this.figureName = figureName;
    }

    private String figureName;
    private float radius;
}
