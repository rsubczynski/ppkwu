package kolos.controllers.responseEntry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Square implements BaseResponse {

    public Square(double field, String figureName) {
        diagonalOfASquare = (field * Math.sqrt(2));
        this.figureName = figureName;
    }
    private String figureName;
    private double diagonalOfASquare;

}
