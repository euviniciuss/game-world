package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import sample.model.GameCard;

import java.util.Objects;


public class CardController {

    @FXML
    private Label cardLabel;

    @FXML
    private ImageView gameBanner;

    @FXML
    private Label gameDiscount;

    @FXML
    private Button gameFavorite;

    @FXML
    private Label gamePrice;

    @FXML
    private Label oldPrice;

    @FXML
    private ImageView storeIcon;

    //Método para Gerar Cards
    public void setData(GameCard gameCard) {
        //Criando modelo para suportar imagem
        Image iconSt = new Image(Objects.requireNonNull(getClass().getResourceAsStream(gameCard.getStoreIcon())));
        Image banner = new Image(Objects.requireNonNull(getClass().getResourceAsStream(gameCard.getImgBanner())));

        //Setando as propiedades do Sciene Builder para os atributos do meu Model
        storeIcon.setImage(iconSt);
        gameBanner.setImage(banner);
        cardLabel.setText(gameCard.getTitle());
        oldPrice.setText(gameCard.getOldPrice());
        gameDiscount.setText(gameCard.getDiscount());
        gamePrice.setText(gameCard.getPrice());
        gameFavorite.setText(gameCard.getFavorite());

    }

}
