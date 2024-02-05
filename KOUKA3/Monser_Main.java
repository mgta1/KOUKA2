package KOUKA3;

// 各インポート
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;


// Mainクラス
public class Monser_Main {
    public static void main(String[] args) {

        // 属性ごとにハッシュマップを作成
        Map<String, String> firemonster = new LinkedHashMap<String, String>();
        firemonster.put("アグナムート", "HP:21576. 攻撃力:25503. スピード:262.87km/h");
        firemonster.put("アポロ", "HP:20201. 攻撃力:26611. スピード:343.50km/h");
        firemonster.put("ノンノ", "HP:20640. 攻撃力:26667. スピード:290.53km/h");
        firemonster.put("坂本龍馬", "HP:20951. 攻撃力:24302. スピード:357.60km/h");

        Map<String, String> watermonster = new LinkedHashMap<String, String>();
        watermonster.put("テキーラ", "HP:20967. 攻撃力:25900. スピード:240.23km/h");
        watermonster.put("ランスロット", "HP:21682. 攻撃力:26648. スピード:370.83km/h");
        watermonster.put("ローレライ", "HP:18167. 攻撃力:19327. スピード:272.10km/h");
        watermonster.put("ナポレオン", "HP:20281. 攻撃力:22369. スピード:335.00km/h");

        Map<String, String> treemonster = new LinkedHashMap<String, String>();
        treemonster.put("ハンターキング", "HP:19744. 攻撃力:23765. スピード:277.27km/h");
        treemonster.put("マーリン", "HP:19226. 攻撃力:17673. スピード:275.27km/h");
        treemonster.put("コルセア", "HP:19027. 攻撃力:23704. スピード:486.13km/h");
        treemonster.put("おりょう", "HP:20488. 攻撃力:20513. スピード:321.13km/h");

        Map<String, String> holymonster = new LinkedHashMap<String, String>();
        holymonster.put("ゴットストライク", "HP:24076. 攻撃力:24814. スピード:330.47km/h");
        holymonster.put("アーサー", "HP:20785. 攻撃力:26936. スピード:342.50km/h");
        holymonster.put("ヒカリ", "HP:20177. 攻撃力:22081. スピード:449.70km/h");
        holymonster.put("ベルゼブブ", "HP:19202. 攻撃力:26077. スピード:451.53km/h");

        Map<String, String> darkmonster = new LinkedHashMap<String, String>();
        darkmonster.put("アナザーワールド", "HP:21909. 攻撃力:23181. スピード:309.63km/h");
        darkmonster.put("ハーレー", "HP:18733. 攻撃力:35003. スピード:249.50km/h");
        darkmonster.put("アリス", "HP:22465. 攻撃力:34014. スピード:440.37km/h");
        darkmonster.put("徳川家康", "HP:21221. 攻撃力:25746. スピード:493.77km/h");

        Scanner sc = new Scanner(System.in);

        // インタフェースのインスタンスを生成
        Monster_selection a = new Monster_selection();
        
        System.out.println("----------------------------------");
        System.out.print("名前を入力してください:");
        String p = sc.nextLine();

        System.out.print("今のランクを入力してください:");
        int r = sc.nextInt();


        Player_display dis = new Player_display(p, r);

        // 1~5の中の数値を入力させ、1~5以外の数値はエラー
        while (true) {
        try {
            dis.introduce();
            System.out.println("----------------------------------");
            System.out.println("0:閉じる. 1:火属性. 2:水属性. 3:木属性. 4:光属性. 5:闇属性");
            System.out.println("----------------------------------");
            System.out.println("");
            System.out.print("何属性のモンスターを調べますか？");
            int x = sc.nextInt();

            if (x == 0) {
                System.out.println("図鑑を閉じます。");
                break;
            }

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
                System.out.println("※ 上から番号順です。");
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

                    case 3:
                    System.out.println("ノンノ");
                    System.out.println(firemonster.get("ノンノ"));
                    break;

                    case 4:
                    System.out.println("坂本龍馬");
                    System.out.println(firemonster.get("坂本龍馬"));
                    break;

                    default: 
                    System.out.println("次回のモンスターの追加をお待ちください...");
                }
                break;

                case 2: 
                a.water_element();
                for (Map.Entry<String, String> entry : watermonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※ 上から番号順です。");
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

                    case 3:
                    System.out.println("ローレライ");
                    System.out.println(watermonster.get("ローレライ"));
                    break;

                    case 4:
                    System.out.println("ナポレオン");
                    System.out.println(watermonster.get("ナポレオン"));
                    break;

                    default: 
                    System.out.println("次回のモンスターの追加をお待ちください...");
                }
                break;

                case 3: 
                a.tree_element();
                for (Map.Entry<String, String> entry : treemonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※ 上から番号順です。");
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

                    case 3:
                    System.out.println("コルセア");
                    System.out.println(treemonster.get("コルセア"));
                    break;

                    case 4:
                    System.out.println("おりょう");
                    System.out.println(treemonster.get("おりょう"));
                    break;

                    default: 
                    System.out.println("次回のモンスターの追加をお待ちください...");
                }
                break;

                case 4: 
                a.holy_element();
                for (Map.Entry<String, String> entry : holymonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※ 上から番号順です。");
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

                    case 3:
                    System.out.println("ヒカリ");
                    System.out.println(holymonster.get("ヒカリ"));
                    break;

                    case 4:
                    System.out.println("ベルゼブブ");
                    System.out.println(holymonster.get("ベルゼブブ"));
                    break;

                    default: 
                    System.out.println("次回のモンスターの追加をお待ちください...");
                }
                break;

                case 5: 
                a.dark_element();
                for (Map.Entry<String, String> entry : darkmonster.entrySet()) {
                    System.out.println(entry.getKey());
                }
                System.out.println("----------------------------------");
                System.out.println("※ 上から番号順です。");
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

                    case 3:
                    System.out.println("アリス");
                    System.out.println(darkmonster.get("アリス"));
                    break;

                    case 4:
                    System.out.println("徳川家康");
                    System.out.println(darkmonster.get("徳川家康"));
                    break;

                    default: 
                    System.out.println("次回のモンスターの追加をお待ちください...");
                }
                break;
            }
            
        // 1~5以外エラー表示
        } catch (Exception_handling e) {
            System.out.println("入力値が範囲外です。正しい数値で入力してださい。");
        } catch (InputMismatchException e) {
            System.out.println("----------------------------------");
            System.out.println("");
            System.out.println("{{{{{  入力エラー  }}}}}");
            System.out.println("");
            System.out.println("----------------------------------");

            break;
        }
    }
}
}


