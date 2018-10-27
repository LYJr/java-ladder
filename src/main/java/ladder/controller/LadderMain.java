package ladder.controller;

import ladder.domain.Ladder;
import ladder.domain.Movement;
import ladder.view.InputView;
import ladder.view.ResultView;

import java.util.ArrayList;

public class LadderMain {
    public static void main(String[] args) {
        Movement m = new Movement();
        InputView iv = new InputView();
        ResultView rv = new ResultView();

        String inputName = iv.userInput();
        String[] name = new String[0];
        try {
            name = m.nameCut(inputName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            inputName = iv.userInput();
        }

        int height = iv.heightInput();
        m.ladderObject(height, inputName);
        rv.nameOutput(name);
        rv.transverse(m.temporary(inputName, height), name);
    }
}