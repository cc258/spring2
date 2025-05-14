package study.kuangshen.java.web.demo06;

public class Cat extends Pet {

    @Override
    public void sound(){
        System.out.println("Cat's Sound is miao,miao,miao");
    }

    // 这里是方法的重载
    public void sound(String type){
        System.out.println("Cat's Sound is miao,miao,miao, type:"+type);
    }

    public void eyes(){
        System.out.println("Cat's eyes is big");
    }

}
