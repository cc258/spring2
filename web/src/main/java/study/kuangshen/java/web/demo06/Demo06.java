package study.kuangshen.java.web.demo06;

public class Demo06 {
    public static void main(String[] args) {

        Pet pet = new Pet();
        Cat cat = new Cat();

        // Person父类不能调用子类独有的方法，下面的使用会报错。
        // person.sound();

        // 调用自身的方法
        pet.sound();

        // 子类重写父类的，叫重写，
        // 类中同一个，定义不同参数，叫重载。

        // 调用自身重写的方法
        cat.sound();

        // 调用自身重载的方法
        cat.sound("中文，喵喵喵");
    }
}
