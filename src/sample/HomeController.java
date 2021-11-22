package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import sample.model.GameCard;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private HBox cardsLayout;

    private List<GameCard> offersWeek;

    //Método de inicialização dos Cards de jogos
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        offersWeek = new ArrayList<>(getOffersWeek());

        try {
            for (GameCard gameCard : offersWeek) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("card.fxml"));

                HBox cardBox = fxmlLoader.load();
                CardController cardController = fxmlLoader.getController();
                cardController.setData(gameCard); //erro aq

                cardsLayout.getChildren().add(cardBox);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Método que vai armazenar todos os meus cards
    private List<GameCard> getOffersWeek(){
        //Criando um array de gameCards e passando minhas propiedades para cada
        List<GameCard> cards = new ArrayList<>();

        //Instanciando o Card para utilizar dos métodos do GameCard e gerar novos Cards
        GameCard card = new GameCard();

        //JOGO 1
        card.setTitle("Watch Dogs");
        card.setOldPrice("R$ 250");
        card.setDiscount("- 100%");
        card.setPrice("Gratuito");
        card.setFavorite("♥");
        card.setStoreIcon("/img/epicIcon.png");
        card.setImgBanner("/img/gameWD.png");
        cards.add(card);

        //JOGO 2
        card = new GameCard();
        card.setTitle("Teste");
        card.setOldPrice("R$ 250");
        card.setDiscount("- 100%");
        card.setPrice("Gratuito");
        card.setFavorite("♥");
        card.setStoreIcon("/img/psIcon.png");
        card.setImgBanner("/img/gameCP.png");
        cards.add(card);

        return cards;
    }

    public void voltar() {
       Main.changeScreen("login");
    }


}
