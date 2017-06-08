package at.spengergasse.view;

import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class View extends Application
{
	public int zahl2;
	
	private GridPane buttonGridPane;
	
	int[] Array = new int[5];
	

	public View()
	{

	}

	@Override
	public void start(Stage primaryStage)
	{
		Button button1 = new Button("Start Game");
		Button button2 = new Button("Options");
		Button button3 = new Button("Exit");
		ToggleButton tbutton4 = new ToggleButton("Mute");
		Button button5 = new Button("Back");
		Button button6 = new Button("Close");
	
		Button buttonclick = new Button("");
		Button buttonclick2 = new Button("");
		Button buttonmain = new Button("");
		
		
		
		
		
		Text score1 = new Text();
		
		button1.setPrefWidth(150);
		button2.setPrefWidth(150);
		button3.setPrefWidth(150);

		tbutton4.setPrefWidth(150);
		
		buttonclick.setPrefWidth(400);
		buttonclick.setPrefHeight(400);
		buttonclick2.setPrefWidth(400);
		buttonclick2.setPrefHeight(400);
		
		buttonmain.setPrefWidth(500);
		buttonmain.setPrefHeight(500);

		button1.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		button2.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		button3.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
	   tbutton4.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		button5.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		button6.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		buttonclick.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		buttonclick2.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");

		buttonclick.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		buttonmain.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");

		Image imageSelectL = new Image("masterschwertL.png");
		Image imageSelectR = new Image("masterschwertR.png");
		ImageView imageViewLB1 = new ImageView();
		ImageView imageViewRB1 = new ImageView();
		imageViewLB1.setImage(imageSelectL);
		imageViewRB1.setImage(imageSelectR);
		ImageView imageViewLB2 = new ImageView();
		ImageView imageViewRB2 = new ImageView();
		imageViewLB2.setImage(imageSelectL);
		imageViewRB2.setImage(imageSelectR);
		ImageView imageViewLB3 = new ImageView();
		ImageView imageViewRB3 = new ImageView();
		imageViewLB3.setImage(imageSelectL);
		imageViewRB3.setImage(imageSelectR);

		BorderPane root1 = new BorderPane();
		StackPane buttonCenter1 = new StackPane();
		StackPane buttonCenter2 = new StackPane();
		StackPane buttonCenter3 = new StackPane();

		StackPane buttonCenterclick = new StackPane();

		HBox buttonSet1 = new HBox();
		HBox buttonSet2 = new HBox();
		HBox buttonSet3 = new HBox();

		HBox buttonSetclick = new HBox();

		buttonSet1.getChildren().add(imageViewLB1);
		buttonSet1.getChildren().add(button1);
		buttonSet1.getChildren().add(imageViewRB1);
		buttonSet1.alignmentProperty().set(Pos.CENTER);
		imageViewLB1.visibleProperty().set(false);
		imageViewRB1.visibleProperty().set(false);

		buttonSet2.getChildren().add(imageViewLB2);
		buttonSet2.getChildren().add(button2);
		buttonSet2.getChildren().add(imageViewRB2);
		buttonSet2.alignmentProperty().set(Pos.CENTER);
		imageViewLB2.visibleProperty().set(false);
		imageViewRB2.visibleProperty().set(false);

		buttonSet3.getChildren().add(imageViewLB3);
		buttonSet3.getChildren().add(button3);
		buttonSet3.getChildren().add(imageViewRB3);
		buttonSet3.alignmentProperty().set(Pos.CENTER);
		imageViewLB3.visibleProperty().set(false);
		imageViewRB3.visibleProperty().set(false);

		buttonCenter1.getChildren().add(buttonSet1);
		buttonCenter2.getChildren().add(buttonSet2);
		buttonCenter3.getChildren().add(buttonSet3);

		StackPane.setAlignment(buttonSet1, Pos.TOP_CENTER);
		StackPane.setAlignment(buttonSet2, Pos.CENTER);
		StackPane.setAlignment(buttonSet3, Pos.BOTTOM_CENTER);

		root1.setTop(buttonCenter1);
		root1.setCenter(buttonCenter2);
		root1.setBottom(buttonCenter3);

		Border border = new Border(
				new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(10)));

		root1.setPadding(new Insets(100, 100, 100, 100));
		root1.setBorder(border);

		Scene scene = new Scene(root1, 1200, 600);

		root1.setStyle(
				"-fx-background-image: url('background.jpg'); -fx-background-position: center; -fx-background-size: auto; -fx-background-repeat: no-repeat;");

		Image image = new Image("mauszeiger.png");

		scene.setCursor(new ImageCursor(image, image.getWidth() / 2, image.getHeight() / 2));
		
		primaryStage.setResizable(false);
		
		
		primaryStage.getIcons().add(new Image("gameicon.png"));
		

		button1.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>()
		{
			@Override
			public void handle(KeyEvent e)
			{
				if (e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.S)
				{
					imageViewLB1.visibleProperty().set(false);
					imageViewRB1.visibleProperty().set(false);
					imageViewLB2.visibleProperty().set(true);
					imageViewRB2.visibleProperty().set(true);
					imageViewLB3.visibleProperty().set(false);
					imageViewRB3.visibleProperty().set(false);
					button2.requestFocus();
				} else if (e.getCode() == KeyCode.W)
				{
					imageViewLB1.visibleProperty().set(false);
					imageViewRB1.visibleProperty().set(false);
					imageViewLB2.visibleProperty().set(false);
					imageViewRB2.visibleProperty().set(false);
					imageViewLB3.visibleProperty().set(true);
					imageViewRB3.visibleProperty().set(true);
					button3.requestFocus();
				}
			}
		});

		button2.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>()
		{
			@Override
			public void handle(KeyEvent e)
			{
				if (e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.S)
				{
					imageViewLB1.visibleProperty().set(false);
					imageViewRB1.visibleProperty().set(false);
					imageViewLB2.visibleProperty().set(false);
					imageViewRB2.visibleProperty().set(false);
					imageViewLB3.visibleProperty().set(true);
					imageViewRB3.visibleProperty().set(true);
					button3.requestFocus();
				} else if (e.getCode() == KeyCode.W)
				{
					imageViewLB1.visibleProperty().set(true);
					imageViewRB1.visibleProperty().set(true);
					imageViewLB2.visibleProperty().set(false);
					imageViewRB2.visibleProperty().set(false);
					imageViewLB3.visibleProperty().set(false);
					imageViewRB3.visibleProperty().set(false);
					button1.requestFocus();
				}
			}
		});

		button3.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>()
		{
			@Override
			public void handle(KeyEvent e)
			{
				if (e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.S)
				{
					imageViewLB1.visibleProperty().set(true);
					imageViewRB1.visibleProperty().set(true);
					imageViewLB2.visibleProperty().set(false);
					imageViewRB2.visibleProperty().set(false);
					imageViewLB3.visibleProperty().set(false);
					imageViewRB3.visibleProperty().set(false);
					button1.requestFocus();
				} else if (e.getCode() == KeyCode.W)
				{
					imageViewLB1.visibleProperty().set(false);
					imageViewRB1.visibleProperty().set(false);
					imageViewLB2.visibleProperty().set(true);
					imageViewRB2.visibleProperty().set(true);
					imageViewLB3.visibleProperty().set(false);
					imageViewRB3.visibleProperty().set(false);
					button2.requestFocus();
				}
			}
		});

		button1.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{

				imageViewLB1.visibleProperty().set(true);
				imageViewRB1.visibleProperty().set(true);
				imageViewLB2.visibleProperty().set(false);
				imageViewRB2.visibleProperty().set(false);
				imageViewLB3.visibleProperty().set(false);
				imageViewRB3.visibleProperty().set(false);
				button1.requestFocus();
			}
		});

		button1.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{

				String musicFile = "anotherone.mp3";

				Media sound = new Media(new File(musicFile).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sound);
				mediaPlayer.play();
				
				
				GridPane root2 = new GridPane();
				root2.setPadding(new Insets(100, 100, 100, 100));
				Scene scene2 = new Scene(root2, 1200, 600);
				
				root2.setStyle("-fx-background-image: url('background.jpg'); -fx-background-position: center; -fx-background-size: auto; -fx-background-repeat: no-repeat;");

				
				
				
				root2.setPadding(new Insets(10,10,10,10));

				// gap between the components
				root2.setHgap(10);
				root2.setVgap(10);
				
				root2.add(new Label("Damage:"),4,4);
				root2.add(buttonclick, 5, 4);
				root2.add(new Label("Attackspeed:"),6,4);
				root2.add(buttonclick2, 7, 4);
			
				
				Image imageclass1 = new Image("klasse1.png");
				Image imageclass2 = new Image("klasse2.png");
				
				buttonclick.setGraphic(new ImageView(imageclass1));
				buttonclick2.setGraphic(new ImageView(imageclass2));
				
				
				
				primaryStage.setScene(scene2);
				primaryStage.show();

			}
		});
		
		buttonclick.setOnAction(new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						
						 
						
						
						GridPane root4 = new GridPane();
						root4.setPadding(new Insets(100, 100, 100, 100));
						Scene scene3 = new Scene(root4, 1200, 600);
						
						root4.setStyle("-fx-background-image: url('background.jpg'); -fx-background-position: center; -fx-background-size: auto; -fx-background-repeat: no-repeat;");

						
						MenuBar menuBar = new MenuBar();
					    menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
					    
						
					    Menu gameMenu = new Menu("Game");
					    MenuItem saveMenuItem = new MenuItem("Save");
					    MenuItem exitMenuItem = new MenuItem("Exit");
					    exitMenuItem.setOnAction(actionEvent -> Platform.exit());

					    
					    gameMenu.getItems().addAll(saveMenuItem, new SeparatorMenuItem(), exitMenuItem);
					    
					    menuBar.getMenus().addAll(gameMenu);
						
						
						root4.setPadding(new Insets(10,10,10,10));

						// gap between the components
						root4.setHgap(10);
						root4.setVgap(10);
						
						root4.add(menuBar, 0,0);
						root4.add(new Label("Klasse 1:"),1,0);
						root4.add(buttonmain, 0, 2);
						
					
						primaryStage.setScene(scene3);
						primaryStage.show();
						
						
					}
			
				});
		
		buttonclick2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent e)
			{
				
				
				GridPane root5 = new GridPane();
				root5.setPadding(new Insets(100, 100, 100, 100));
				Scene scene3 = new Scene(root5, 1200, 600);
				
				root5.setStyle("-fx-background-image: url('background.jpg'); -fx-background-position: center; -fx-background-size: auto; -fx-background-repeat: no-repeat;");

				
				
				MenuBar menuBar1 = new MenuBar();
			    menuBar1.prefWidthProperty().bind(primaryStage.widthProperty());
			    
				
			    Menu gameMenu1 = new Menu("Game");
			    MenuItem saveMenuItem = new MenuItem("Save");
			    MenuItem exitMenuItem = new MenuItem("Exit");
			    exitMenuItem.setOnAction(actionEvent -> Platform.exit());

			    
			    gameMenu1.getItems().addAll(saveMenuItem, new SeparatorMenuItem(), exitMenuItem);
			    
			    menuBar1.getMenus().addAll(gameMenu1);
				
				
				
				
				root5.setPadding(new Insets(10,10,10,10));

				// gap between the components
				root5.setHgap(10);
				root5.setVgap(10);
				
				root5.add(menuBar1, 0,0);
				root5.add(new Label("Klasse 1:"),1,0);
				root5.add(buttonmain, 0, 2);
				
			
				primaryStage.setScene(scene3);
				primaryStage.show();
				
				
			}
	
		});

		button2.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
//				Stage stage1 = new Stage();
//				Parent root;
//				try
//				{
//					root = FXMLLoader.load(getClass().getResource("optionenmenu.fxml"));
//					Scene scene = new Scene(root);
//					stage1.setTitle("Optionen");
//					stage1.setScene(scene);
//					stage1.show();
//
//				} catch (IOException e1)
//				{
//					e1.printStackTrace();
//				}
				
				String musicFile = "fahrstuhl.mp3";

				Media sound = new Media(new File(musicFile).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sound);
				mediaPlayer.play();

				//StackPane optionen2 = new StackPane();

				
				
				GridPane root3 = new GridPane();
				root3.setPadding(new Insets(100, 100, 100, 100));
				Scene scene3 = new Scene(root3, 1200, 600);
				root3.setStyle("-fx-background-image: url('background.jpg'); -fx-background-position: center; -fx-background-size: auto; -fx-background-repeat: no-repeat;");
				
				
				root3.setHgap(10);
				root3.setVgap(10);
				
//				Label label1 = new Label("How to play: Choose your Class then then click on the enemy to kill it!");
//				HBox hb1 = new HBox();
//				hb1.getChildren().add(label1);
//				optionen2.getChildren().add(label1);
//				hb1.getChildren().add(tbutton4);
//				optionen2.getChildren().add(tbutton4);
				
//				buttonSetclick.getChildren().add(buttonclick);
//				buttonCenterclick.getChildren().add(buttonSetclick);
//				StackPane.setAlignment(buttonSetclick, Pos.CENTER);
//				root3.setCenter(buttonCenterclick);
//				Image image2 = new Image("enemy.gif");
//				Image image3 = new Image("zeldalöwe.gif");
//				buttonclick.setGraphic(new ImageView(image2));
				// buttonclick.visibleProperty().set(false);
				
				root3.add(new Label("How to play: Choose your Class and then click on the enemy to kill it!"),0,0);
				root3.add(tbutton4, 1, 2);
				root3.add(button5, 2, 15);
				root3.add(button6, 4, 30);
				
				
//				root3.setTop(label1);
//				root3.setBottom(tbutton4);
//				root3.setBottom(button5);
//				root3.setBottom(button6);
				
				primaryStage.setScene(scene3);
				primaryStage.show();
			}
		});
		{

		}
		
		
		
		button5.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
//				String musicFile = "haveagreattime.mp3";
//
//				Media sound = new Media(new File(musicFile).toURI().toString());
//				MediaPlayer mediaPlayer = new MediaPlayer(sound);
//				mediaPlayer.play();
				
					
					Platform.exit();
			
			}
		});
		
		
		
		
		button6.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
//				String musicFile = "haveagreattime.mp3";
//
//				Media sound = new Media(new File(musicFile).toURI().toString());
//				MediaPlayer mediaPlayer = new MediaPlayer(sound);
//				mediaPlayer.play();
				
					
					Platform.exit();
			
			}
		});
		
		
		

		button2.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				imageViewLB1.visibleProperty().set(false);
				imageViewRB1.visibleProperty().set(false);
				imageViewLB2.visibleProperty().set(true);
				imageViewRB2.visibleProperty().set(true);
				imageViewLB3.visibleProperty().set(false);
				imageViewRB3.visibleProperty().set(false);
				button2.requestFocus();
			}
		});

		

		button3.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>()
		{
			@Override
			public void handle(MouseEvent e)
			{
				imageViewLB1.visibleProperty().set(false);
				imageViewRB1.visibleProperty().set(false);
				imageViewLB2.visibleProperty().set(false);
				imageViewRB2.visibleProperty().set(false);
				imageViewLB3.visibleProperty().set(true);
				imageViewRB3.visibleProperty().set(true);
				button3.requestFocus();
			}
		});

		button3.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
				String musicFile = "haveagreattime.mp3";

				Media sound = new Media(new File(musicFile).toURI().toString());
				MediaPlayer mediaPlayer = new MediaPlayer(sound);
				mediaPlayer.play();
				if(mediaPlayer.getStatus() == Status.STOPPED){
					
					Platform.exit();
				}
				else{
					
				}

				
			}
		});

		primaryStage.setTitle("The legend of Zelda");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args)
	{
		launch(args);
	}

}
