import java.util.Random;

public class RandomPlayer extends Player{
    RandomGenerator randomGenerator;


    public RandomPlayer(String name, char mark) {
        super(name, mark);
        this.randomGenerator = new RandomGenerator();
    }

    public void checkWinner(){
        super.checkWinner();
    }

    public char getMark() {
        return super.getMark();
    }

    @Override
    public void makeMove() {
        boolean flag = false;
        while(true){
            int row = this.randomGenerator.discrete(0,2);
            int column = this.randomGenerator.discrete(0,2);
            if(super.getBoard().checkMark(row,column)){
                flag = super.getBoard().addMark(row,column,super.getMark());
            }
            if(flag == true){
                break;
            }
        }
        super.getBoard().display();
    }
}
