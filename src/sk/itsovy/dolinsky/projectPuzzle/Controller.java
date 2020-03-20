package sk.itsovy.dolinsky.projectPuzzle;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;


public class Controller {

	public Button btnStart;
	public Button btnEnd;
	public Button btnReset;

	public Button btn0;
	public Button btn1;
	public Button btn2;
	public Button btn3;
	public Button btn4;
	public Button btn5;
	public Button btn6;
	public Button btn7;
	public Button btn8;
	public Button btn9;
	public Button btn10;
	public Button btn11;
	public Button btn12;
	public Button btn13;
	public Button btn14;
	public Button btn15;

	private Game game;


	public Controller() {
		game = new Game();

	}

	private void setInvisible(boolean disable) {
		btn0.setDisable(disable);
		btn1.setDisable(disable);
		btn2.setDisable(disable);
		btn3.setDisable(disable);
		btn4.setDisable(disable);
		btn5.setDisable(disable);
		btn6.setDisable(disable);
		btn7.setDisable(disable);
		btn8.setDisable(disable);
		btn9.setDisable(disable);
		btn10.setDisable(disable);
		btn11.setDisable(disable);
		btn12.setDisable(disable);
		btn13.setDisable(disable);
		btn14.setDisable(disable);
		btn15.setDisable(disable);
	}

	public void setButtons() {
		btn0.setText("1");
		btn1.setText("2");
		btn2.setText("3");
		btn3.setText("4");
		btn4.setText("5");
		btn5.setText("6");
		btn6.setText("7");
		btn7.setText("8");
		btn8.setText("9");
		btn9.setText("10");
		btn10.setText("11");
		btn11.setText("12");
		btn12.setText("13");
		btn13.setText("14");
		btn14.setText("15");
		btn15.setText(" ");
		setInvisible(false);
	}

	public void reset(ActionEvent actionEvent) {
		game.resetGame();
		btnStart.setDisable(true);
		setButtons();
	}

	public void start(ActionEvent actionEvent) {
		game.startGame();
		btnStart.setDisable(true);
		setButtons();

	}

	public void end(ActionEvent actionEvent) {
		game.endGame();
		btnStart.setDisable(false);
		setInvisible(true);

	}

	public void clickBtn0(ActionEvent actionEvent) {

		if (btn1.getText().equals(" ")) {
			btn0.setText(" ");
			btn1.setText("1");
		} else if (btn4.getText().equals(" ")) {
			btn0.setText(" ");
			btn4.setText("1");
		}
	}

	public void clickBtn1(ActionEvent actionEvent) {
		if (btn0.getText().equals(" ")) {
			btn0.setText("1");
			btn1.setText(" ");
		}

	}

	public void clickBtn2(ActionEvent actionEvent) {
		if (btn1.getText().equals(" ")) {
			btn2.setText("2");
			btn1.setText(" ");
		}

	}

	public void clickBtn3(ActionEvent actionEvent) {
		if (btn2.getText().equals(" ")) {
			btn2.setText("3");
			btn4.setText(" ");
		}

	}

	public void clickBtn4(ActionEvent actionEvent) {
		if (btn5.getText().equals(" ")) {
			btn4.setText("6");
			btn5.setText(" ");
		}

	}

	public void clickBtn5(ActionEvent actionEvent) {
		if (btn4.getText().equals(" ")) {
			btn5.setText("5");
			btn4.setText(" ");
		}


	}

	public void clickBtn6(ActionEvent actionEvent) {
		if (btn10.getText().equals(" ")) {
			btn10.setText("7");
			btn6.setText(" ");
		}


	}

	public void clickBtn7(ActionEvent actionEvent) {
		if (btn11.getText().equals(" ")) {
			btn11.setText("8");
			btn7.setText(" ");
		} else if (btn6.getText().equals(" ")) {
			btn6.setText("8");
			btn7.setText(" ");
		}


	}

	public void clickBtn8(ActionEvent actionEvent) {
		if (btn12.getText().equals(" ")) {
			btn12.setText("9");
			btn8.setText(" ");
		} else if (btn13.getText().equals(" ")) {
			btn12.setText(" ");
			btn13.setText("13");
		} else if (btn9.getText().equals(" ")) {
			btn9.setText("10");
			btn8.setText(" ");
		}

	}

	public void clickBtn9(ActionEvent actionEvent) {
		if (btn12.getText().equals(" ")) {
			btn12.setText("10");
			btn9.setText(" ");
		} else if (btn10.getText().equals(" ")) {
			btn10.setText("11");
			btn9.setText(" ");
		} else if (btn8.getText().equals(" ")) {
			btn8.setText("10");
			btn9.setText(" ");
		} else if (btn5.getText().equals(" ")) {
			btn5.setText("10");
			btn9.setText(" ");
		} else if (btn13.getText().equals(" ")) {
			btn9.setText(" ");
			btn13.setText("10");
		}


	}

	public void clickBtn10(ActionEvent actionEvent) {
		if (btn14.getText().equals(" ")) {
			btn14.setText("11");
			btn10.setText(" ");
		} else if (btn9.getText().equals(" ")) {
			btn10.setText(" ");
			btn9.setText("11");
		} else if (btn6.getText().equals(" ")) {
			btn10.setText(" ");
			btn6.setText("7");
		} else if (btn11.getText().equals(" ")) {
			btn10.setText(" ");
			btn11.setText("12");
		}


	}

	public void clickBtn11(ActionEvent actionEvent) {

		if (btn15.getText().equals(" ")) {
			btn15.setText("12");
			btn11.setText(" ");
		} else if (btn10.getText().equals(" ")) {
			btn11.setText(" ");
			btn10.setText("12");
		} else if (btn7.getText().equals(" ")) {
			btn7.setText("8");
			btn11.setText(" ");
		}

	}

	public void clickBtn12(ActionEvent actionEvent) {
		if (btn8.getText().equals(" ")) {
			btn12.setText(" ");
			btn8.setText("9");
		} else if (btn13.getText().equals(" ")) {
			btn12.setText(" ");
			btn13.setText("13");
		} else if (btn9.getText().equals(" ")) {
			btn12.setText(" ");
			btn9.setText("13");
		}


	}

	public void clickBtn13(ActionEvent actionEvent) {

		if (btn14.getText().equals(" ")) {
			btn13.setText(" ");
			btn14.setText("14");
		} else if (btn9.getText().equals(" ")) {
			btn13.setText(" ");
			btn9.setText("10");
		} else if (btn12.getText().equals(" ")) {
			btn12.setText("13");
			btn13.setText(" ");
		}

	}

	public void clickBtn14(ActionEvent actionEvent) {

		if (btn15.getText().equals(" ")) {
			btn15.setText("15");
			btn14.setText(" ");
		} else if (btn13.getText().equals(" ")) {
			btn13.setText("14");
			btn14.setText(" ");
		} else if (btn10.getText().equals(" ")) {
			btn10.setText("11");
			btn14.setText(" ");
		}

	}

	public void clickBtn15(ActionEvent actionEvent) {

		if (btn14.getText().equals(" ")) {
			btn15.setText(" ");
			btn14.setText("15");
		} else if (btn11.getText().equals(" ")) {
			btn15.setText(" ");
			btn11.setText("12");
		}
	}


}
