package KOUKA3;

// プレイヤー情報を表示するためのクラス
class Player_display extends Player {

    // コンストラクタ
    public Player_display(String name, int rank) {
        super(name, rank);
    }

    // 表示するためのメソッド
    public void introduce() {
        System.out.println("あなたの名前とランクは:" + getName() + "RANK:" + getRank());
    }
}