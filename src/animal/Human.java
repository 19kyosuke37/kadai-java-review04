package animal;

public class Human extends Animal implements Thinkable{
    
    //フィールド
    private String hobby;
    
    //コンストラクタ引き数なし、あり
    public Human() {
    }
    
    public Human(String fullName,int age,String hobby) {
        super(fullName,age);
        this.hobby = hobby;
        
    }
    
    //setter,getter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    //メソッド
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
    
    

}
