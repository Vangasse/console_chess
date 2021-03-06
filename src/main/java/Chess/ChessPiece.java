package Chess;

public abstract class ChessPiece {
    private final PieceType type;
    private final PieceColor color;
    private final Move[] moves;
    private final String name;
    private final char charValue;
    private final boolean repeatableMoves;

    protected ChessPiece(PieceType type, PieceColor color, Move[] moves, boolean repeatableMoves){
        this.type = type;
        this.color = color;
        this.moves = moves;
        this.repeatableMoves = repeatableMoves;
        name = type.name();
        charValue = type.name().trim().charAt(0);
    }

    public enum PieceType {
        Pawn, Rook, Knight, Bishop, Queen, King
    }

    public enum PieceColor {
        White, Black
    }
    public Move[] moves(){ return moves; }

    public String name(){ return name; }

    public PieceColor color(){ return color; }

    public char charValue(){ return charValue; }

    public boolean repeatableMoves(){ return repeatableMoves; }

    public PieceType pieceType() {return type; }

    public static PieceColor opponent(PieceColor color) {
        return (color == PieceColor.Black) ? PieceColor.White : PieceColor.Black;
    }

}
