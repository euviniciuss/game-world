package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

public class Controller  {

    @FXML
    private TextField campoEmail;

    @FXML
    private PasswordField campoSenha;

    //Método de autenticação
    public void entrar() {
        boolean emailValido = campoEmail.getText().equals("");
        boolean senhaValida = campoSenha.getText().equals("");

        if (emailValido && senhaValida) {
            System.out.println("Entrou");

            //Trocar tela para home
            Main.changeScreen("home");
        } else {
            System.out.println("Digite um email e uma senha valida!");
        }
    }

}
