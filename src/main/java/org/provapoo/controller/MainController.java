package org.provapoo.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.provapoo.model.Paciente;

public class MainController {
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private DatePicker txtDataNascimento;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtPesquisar;

    @FXML private TableView<Paciente> tablePacientes;

    @FXML private TableColumn<Paciente, Integer> colId;
    @FXML private TableColumn<Paciente, String> colNome;
    @FXML private TableColumn<Paciente, String> colCPF;
    @FXML private TableColumn<Paciente, String> colFone;


    @FXML
    protected void onCadastrarClick() {
        System.out.println( this.txtNome.getText());
    }
}