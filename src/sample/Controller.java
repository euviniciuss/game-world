package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class Controller {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    public void entrar() {
        boolean emailValido = campoEmail.getText().equals("teste@teste.com");
        boolean senhaValida = campoSenha.getText().equals("123456");

        if (emailValido && senhaValida) {
            System.out.println("Entrou");

            //Trocar tela para home
            Main.changeScreen("home");
        } else {
            System.out.println("Digite um email e uma senha valida!");
        }
    }

}
