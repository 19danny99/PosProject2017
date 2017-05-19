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
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View extends Application
{

	public View()
	{

	}

	@Override
	public void start(Stage primaryStage)
	{
		Button button1 = new Button("Start Game");
		Button button2 = new Button ("Options");
		Button button3 = new Button ("Exit");
		
		Button buttonclick = new Button("");
		
		button1.setPrefWidth(150);
		button2.setPrefWidth(150);
		button3.setPrefWidth(150);
		
		buttonclick.setPrefWidth(500);
		buttonclick.setPrefHeight(500);
		
		button1.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		button2.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		button3.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		
		buttonclick.setStyle("-fx-font: 22 arial; -fx-base: #324D46; -fx-background-radius: 10px");
		
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
		
		Border border = new Border(new BorderStroke(Color.GREEN, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(10)));
	
	root1.setPadding(new Insets(100, 100, 100, 100));
	root1.setBorder(border);
		
		
		
		Scene scene = new Scene(root1, 1200, 600);
		
		root1.setStyle("-fx-background-image: url('background.jpg'); -fx-background-position: center; -fx-background-size: auto; -fx-background-repeat: no-repeat;");		
		
		Image image = new Image("dildoschwert.png");
		
		scene.setCursor(new ImageCursor(image, image.getWidth() / 2, image.getHeight() /2));
		
		
		
	
				
		button1.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>()
		{
			@Override
			public void handle(KeyEvent e)
			{
				if(e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.S)
				{
					imageViewLB1.visibleProperty().set(false);
					imageViewRB1.visibleProperty().set(false);
					imageViewLB2.visibleProperty().set(true);
					imageViewRB2.visibleProperty().set(true);
					imageViewLB3.visibleProperty().set(false);
					imageViewRB3.visibleProperty().set(false);
					button2.requestFocus();
				}
				else if( e.getCode() == KeyCode.W)
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
				if(e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.S)
				{
				imageViewLB1.visibleProperty().set(false);
				imageViewRB1.visibleProperty().set(false);
				imageViewLB2.visibleProperty().set(false);
				imageViewRB2.visibleProperty().set(false);
				imageViewLB3.visibleProperty().set(true);
				imageViewRB3.visibleProperty().set(true);
				button3.requestFocus();
				}
				else if( e.getCode() == KeyCode.W)
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
				if(e.getCode() == KeyCode.TAB || e.getCode() == KeyCode.S)
				{
				imageViewLB1.visibleProperty().set(true);
				imageViewRB1.visibleProperty().set(true);
				imageViewLB2.visibleProperty().set(false);
				imageViewRB2.visibleProperty().set(false);
				imageViewLB3.visibleProperty().set(false);
				imageViewRB3.visibleProperty().set(false);
				button1.requestFocus();
				}
				else if( e.getCode() == KeyCode.W)
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
				
				BorderPane root2 = new BorderPane();
				root2.setPadding(new Insets(100, 100, 100, 100));
				Scene scene2 = new Scene(root2, 1200, 600);
				root2.setStyle("-fx-background-image: url('background.jpg'); -fx-background-position: center; -fx-background-size: auto; -fx-background-repeat: no-repeat;");
				
				buttonSetclick.getChildren().add(buttonclick);
				buttonCenterclick.getChildren().add(buttonSetclick);
				StackPane.setAlignment(buttonSetclick, Pos.CENTER);
				root2.setCenter(buttonCenterclick);
				Image image2 = new Image("enemy.gif");
				buttonclick.setGraphic(new ImageView(image2));
				//buttonclick.visibleProperty().set(false);
				
				primaryStage.setScene(scene2);
				primaryStage.show();
				
				
				
				button2.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent e)
					{
						int zahl1 = 0;
						zahl1++;
						System.out.println(zahl1);
						
					}
				});
				
				
				
				
				
			}
		});
		
		
		button2.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
				Stage stage1 = new Stage();
				Parent root;
				try
				{
					root = FXMLLoader.load(getClass().getResource("optionenmenu.fxml"));
					Scene scene = new Scene(root);
					 stage1.setTitle("Optionen");
				     stage1.setScene(scene);
				     stage1.show();
				  
					
				} catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		{
			
		}

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
		
		
		button2.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent e)
			{
				Stage stage1 = new Stage();
				Parent root;
				try
				{
					root = FXMLLoader.load(getClass().getResource("optionenmenu.fxml"));
					Scene scene = new Scene(root);
					 stage1.setTitle("Optionen");
				     stage1.setScene(scene);
				     stage1.show();
				  
					
				} catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		{
			
		}
		
		
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
				
				try
				{
					Thread.sleep(3000);
					
				} catch (InterruptedException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				Platform.exit();
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
