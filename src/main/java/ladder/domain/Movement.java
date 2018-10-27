package ladder.domain;

import java.util.ArrayList;
import java.util.Random;

public class Movement {
    private Random r = new Random();
    private ArrayList<Ladder> lineObject = new ArrayList<>();
    private static final int MAX = 5;

    public String[] nameCut(String inputName) {
        String[] cut = inputName.split(",");
        for (String s : cut) {
            nameException(s);
        }
        return cut;
    }

    private void nameException(String s) {
        if (s.length() > MAX) {
            throw new IllegalArgumentException("자리수가 잘못되었습니다. 다시 입력하세요.");
        }
    }

    public ArrayList<Ladder> ladderObject(int height, String inputName) {
        for (int i = 0; i < height; i++) {
            lineObject.add(new Ladder(r.nextBoolean()));
        }
        return lineObject;
    }

    public ArrayList<Ladder> temporary(String inputName, int height) {
        for (int i = 0; i < height; i++) {
            lineObject.get(i).randomInput(nameCut(inputName));
        }
        return lineObject;
    }
}