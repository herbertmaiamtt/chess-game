package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
        // não há necessidade de colocar position como null, o próprio java faz isso automáticamente
        position = null;
    }

    protected Board getBoard(){
        return board;
    }

}
