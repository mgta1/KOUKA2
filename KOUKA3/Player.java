package KOUKA3;

// プレイヤー情報クラス
public class Player {
    private String name;
    private int rank;
    
    // コンストラクタ
    public Player(String name, int rank) {
        this.name = name; this.rank = rank;
    }

    // getNameに返す
    public String getName() {
        return name;
    }

    // getRankに返す
    public int getRank() {
        return rank;
    }
}
