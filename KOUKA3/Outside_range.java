package KOUKA3;

// 例外クラス
class Outside_range {

    // 1~5以外の数値が入力されるとエラー
    static void validateNumber(int x) throws Exception_handling {
        if (x < 0 || x > 5 ) {
            throw new Exception_handling("");
        }
    }
}



