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

    @FXML
    private HBox RecommendedLayout;

    private List<GameCard> offersWeek;
    private List<GameCard> recommend;

    //Método de inicialização dos Cards de jogos
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        offersWeek = new ArrayList<>(getOffersWeek());
        recommend = new ArrayList<>(getRecommend());

        try {
            for (GameCard gameCard : offersWeek) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("card.fxml"));

                HBox cardBox = fxmlLoader.load();
                CardController cardController = fxmlLoader.getController();
                cardController.setData(gameCard); //erro aq

                cardsLayout.getChildren().add(cardBox);
            }

            for (GameCard gameCard : recommend) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("card.fxml"));

                HBox cardBox = fxmlLoader.load();
                CardController cardController = fxmlLoader.getController();
                cardController.setData(gameCard); //erro aq

                RecommendedLayout.getChildren().add(cardBox);
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

        //JOGO 1
        GameCard card = new GameCard(
                "Watch Dogs",
                "/img/epicIcon.png",
                "/img/gameWD.png",
                "R$250",
                "- 100%",
                "Gratuito",
                "♥"
        );
        cards.add(card);

        //JOGO 2
        card = new GameCard(
                "Cyberpunk",
                "/img/psIcon.png",
                "/img/gameCP.png",
                "R$250",
                "- 90%",
                "R$25",
                "♥"
        );
        cards.add(card);

        //JOGO 3
        card = new GameCard(
                "Spider-Man",
                "/img/psIcon.png",
                "/img/gameSpiderMan.png",
                "R$250",
                "- 70%",
                "R$75",
                "♥"
        );
        cards.add(card);

        //JOGO 4
        card = new GameCard(
                "Cyberpunk 2077",
                "/img/psIcon.png",
                "/img/gameTerraria.png",
                "R$20",
                "- 50%",
                "R$10",
                "♥"
        );
        cards.add(card);

        return cards;
    }

    private List<GameCard> getRecommend() {
        //Criando um array de gameCards e passando minhas propiedades para cada
        List<GameCard> cards = new ArrayList<>();

        //Instanciando o Card para utilizar dos métodos do GameCard e gerar novos Cards

        //JOGO 1
        GameCard card = new GameCard(
                "Cyberpunk",
                "/img/psIcon.png",
                "/img/gameCP.png",
                "R$250",
                "- 90%",
                "R$25",
                "♥"
        );
        cards.add(card);

        //JOGO 2
        card = new GameCard(
                "Halo 5",
                "/img/MicrosoftIcon.png",
                "/img/gameHalo.png",
                "R$150",
                "- 70%",
                "R$ 45",
                "♥"
        );
        cards.add(card);

        //JOGO 3
        card = new GameCard(
                "Watch Dogs",
                "/img/epicIcon.png",
                "/img/gameWD.png",
                "R$250",
                "- 100%",
                "Gratuito",
                "♥"
        );
        cards.add(card);

        return cards;
    };

    // Redirecionamento para o menu posicionado na parte inferior
    public void redirectCommunity() {
        Main.changeScreen("community");
    }

    public void redirectFavorites() {
        Main.changeScreen("login");
    }

    public void redirectConfig() {
        Main.changeScreen("login");
    }

}