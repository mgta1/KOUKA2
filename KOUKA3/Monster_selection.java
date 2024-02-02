package KOUKA3;

// Elementインタフェースを実装
public class Monster_selection implements Element {

    // 
    @Override public void fire_element() {
        System.out.println("-----火属性のモンスターを表示-----");
    }

    @Override public void water_element() {
        System.out.println("-----水属性のモンスターを表示-----");
    }

    @Override public void tree_element() {
        System.out.println("-----木属性のモンスターを表示-----");
    }

    @Override public void holy_element() {
        System.out.println("-----光属性のモンスターを表示-----");
    }

    @Override public void dark_element() {
        System.out.println("-----闇属性のモンスターを表示-----");
    }
}