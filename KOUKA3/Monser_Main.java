package KOUKA3;

// 各インポート
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Monser_Main {
    public static void main(String[] args) {

        // 属性ごとにハッシュマップを作成
        Map<String, String> firemonster = new LinkedHashMap<String, String>();
        firemonster.put("アグナムート", "HP:21576. 攻撃力:25503. スピード:262.87km/h");
        firemonster.put("アポロ", "HP:20201. 攻撃力:26611. スピード:343.50km/h");

        Map<String, String> watermonster = new LinkedHashMap<String, String>();
        watermonster.put("テキーラ", "HP:20967. 攻撃力:25900. スピード:240.23km/h");
        watermonster.put("ランスロット", "HP:21682. 攻撃力:26648. スピード:370.83km/h");

        Map<String, String> treemonster = new LinkedHashMap<String, String>();
        treemonster.put("ハンターキング", "HP:19744. 攻撃力:23765. スピード:277.27km/h");
        treemonster.put("マーリン", "HP:19226. 攻撃力:17673. スピード:275.27km/h");

        Map<String, String> holymonster = new LinkedHashMap<String, String>();
        holymonster.put("ゴットストライク", "HP:24076. 攻撃力:24814. スピード:330.47km/h");
        holymonster.put("アーサー", "HP:20785. 攻撃力:26936. スピード:342.50km/h");

        Map<String, String> darkmonster = new LinkedHashMap<String, String>();
        darkmonster.put("アナザーワールド", "HP:21909. 攻撃力:23181. スピード:309.63km/h");
        darkmonster.put("ハーレー", "HP:18733. 攻撃力:35003. スピード:249.50km/h");

        Scanner sc = new Scanner(System.in);

        // インタフェースのインスタンスを生成
        Monster_selection a = new Monster_selection();

        // 1~5の中の数値を入力させ、1~5以外の数値はエラー
        try {
            System.out.println("1:火属性. 2:水属性. 3:木属性. 4:光属性. 5:闇属性");
            System.out.print("何属性のモンスターを調べますか？");
            int x = sc.nextInt();

            // 例外クラスを実装
            Outside_range.validateNumber(x);

            // 検索機能、一覧表示
            switch (x) {
                case 1: 
                a.fire_element();
                for (Map.Entry<String, String> entry : firemonster.entrySet()) {
                    System.out.println(entry.getKey());

                }
                System.out.println("----------------------------------");
                System.out.println("※上から番号順です。");
                System.out.print("どのモンスターのステータスを表示しますか？:");
                int f = sc.nextInt();
                switch (f) {
                    case 1:
                    System.out.println("アグナムート");
                    System.out.println(firemonster.get("アグナムート"));
                    break;

                    case 2:
                    System.out.println("アポロ");
                    System.out.println(firemonster.get("アポロ"));
                    break;
                }
                break;

                case 2: 
                a.water_element();
                for (Map.Entry<String, String> entry : watermonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※上から番号順です。");
                System.out.print("どのモンスターのステータスを表示しますか？:");
                int w = sc.nextInt();
                switch (w) {
                    case 1:
                    System.out.println("テキーラ");
                    System.out.println(watermonster.get("テキーラ"));
                    break;

                    case 2:
                    System.out.println("ランスロット");
                    System.out.println(watermonster.get("ランスロット"));
                    break;
                }
                break;

                case 3: 
                a.tree_element();
                for (Map.Entry<String, String> entry : treemonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※上から番号順です。");
                System.out.print("どのモンスターのステータスを表示しますか？:");
                int t = sc.nextInt();
                switch (t) {
                    case 1:
                    System.out.println("ハンターキング");
                    System.out.println(treemonster.get("ハンターキング"));
                    break;

                    case 2:
                    System.out.println("マーリン");
                    System.out.println(treemonster.get("マーリン"));
                    break;
                }
                break;

                case 4: 
                a.holy_element();
                for (Map.Entry<String, String> entry : holymonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※上から番号順です。");
                System.out.print("どのモンスターのステータスを表示しますか？:");
                int h = sc.nextInt();
                switch (h) {
                    case 1:
                    System.out.println("ゴットストライク");
                    System.out.println(holymonster.get("ゴットストライク"));
                    break;

                    case 2:
                    System.out.println("アーサー");
                    System.out.println(holymonster.get("アーサー"));
                    break;
                }
                break;

                case 5: 
                a.dark_element();
                for (Map.Entry<String, String> entry : darkmonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※上から番号順です。");
                System.out.print("どのモンスターのステータスを表示しますか？:");
                int d = sc.nextInt();
                switch (d) {
                    case 1:
                    System.out.println("アナザーワールド");
                    System.out.println(darkmonster.get("アナザーワールド"));
                    break;

                    case 2:
                    System.out.println("ハーレー");
                    System.out.println(darkmonster.get("ハーレー"));
                    break;
                }
                break;
            }
            
        // 1~5以外エラー表示
        } catch (Exception_handling e) {
            System.out.println("入力値が範囲外です。");
        } 
    }
}


