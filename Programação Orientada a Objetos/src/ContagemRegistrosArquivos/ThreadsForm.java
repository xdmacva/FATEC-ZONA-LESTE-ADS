package ContagemRegistrosArquivos;

import java.time.LocalTime;
import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ThreadsForm extends Application {

	private TextField txtDiretorioOrigem = new TextField();
	private TableView<Lista> tvListaArquivos = new TableView<>();
	private Button btnCarregar = new Button("Carregar");
	private Button btnProcessar = new Button("Processar");
	
	private ContagemRegistrosArquivoController control = new ContagemRegistrosArquivoController();
	private visualizarArquivos vs = new visualizarArquivos();

	public void start(Stage stage) throws Exception {
		
		BorderPane principal = new BorderPane();
		principal.setPadding(new Insets(50));
		Scene scn = new Scene(principal, 700, 300);
		GridPane painelForm = new GridPane();
		principal.setTop(painelForm);
		principal.setCenter(tvListaArquivos);

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(30);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(70);
		painelForm.getColumnConstraints().addAll(col1, col2);

		painelForm.add(new Label("Diretorio de Origem:"), 0, 1);
		painelForm.add(txtDiretorioOrigem, 1, 1);
		txtDiretorioOrigem.setText(vs.diretorio);
		
		
		btnCarregar.setOnAction((e) -> {
			carregarLista();		
		});
		
		btnProcessar.setOnAction((e)->{
 			processarArquivo();

		});

		FlowPane fpBotoes = new FlowPane();
		fpBotoes.getChildren().addAll(btnCarregar,btnProcessar);
		painelForm.add(fpBotoes, 1, 4);

		stage.setScene(scn);
		stage.setTitle("Registros de Arquivo");
		stage.show();
		
		prepararTabela();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	public void carregarLista() {
		
		control.carregarListaArquivos(vs);
		Alert a = new Alert(AlertType.INFORMATION, "Arquivos carregados com sucesso.", ButtonType.OK);
		a.showAndWait();
		control.novo();
	}
	
	public void processarArquivo() {

		control.processarListaArquivos(vs);
		Alert a = new Alert(AlertType.INFORMATION, "Arquivos processados com sucesso.", ButtonType.OK);
		a.showAndWait();
		control.novo();
	}

	@SuppressWarnings("unchecked")
	public void prepararTabela() {
		
		TableColumn<Lista, Integer> col1 = new TableColumn<>("id");
		col1.setCellValueFactory(new PropertyValueFactory<Lista, Integer>("id"));
		TableColumn<Lista, String> col2 = new TableColumn<>("Arquivo");
		col2.setCellValueFactory(new PropertyValueFactory<Lista, String>("Arquivo"));
		col2.setPrefWidth(130);
		TableColumn<Lista, String> col3 = new TableColumn<>("Tamanho");
		col3.setCellValueFactory(new PropertyValueFactory<Lista, String>("Tamanho"));
		TableColumn<Lista, String> col4 = new TableColumn<>("Quantidade");
		col4.setCellValueFactory(new PropertyValueFactory<Lista, String>("Quantidade"));
		TableColumn<Lista, String> col5 = new TableColumn<>("Threads");
		col5.setCellValueFactory(new PropertyValueFactory<Lista, String>("Threads"));
		TableColumn<Lista, LocalTime> col7 = new TableColumn<>("Tempo");
		col7.setCellValueFactory(new PropertyValueFactory<Lista, LocalTime>("Tempo"));
		
		col3.setStyle("-fx-alignment: CENTER-RIGHT;");		
		col4.setStyle("-fx-alignment: CENTER-RIGHT;");		
		col7.setStyle("-fx-alignment: CENTER-RIGHT;");

		tvListaArquivos.getColumns().addAll(col1, col2, col3, col5, col4, col7);
		tvListaArquivos.setItems(control.getList());
		tvListaArquivos.getSelectionModel().getSelectedItems().addListener(new ListChangeListener<Lista>() {
			@Override
			public void onChanged(Change<? extends Lista> d) {
				if (!d.getList().isEmpty()) {
					control.fromEntity(d.getList().get(0));
				}
			}
		});
	}

}
