package animal;

public class Animal {
    //フィールド
    private String fullName;
    private int age;

    //コンストラクタ引数なし、あり
    public Animal() {
    }
    
    public Animal(String fullName,int age) {
        this.fullName = fullName;
        this.age = age;
    }

    //各setter,getter
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    //メソッド
    public void say() {
        System.out.println(fullName + "です。" + age + "歳です。");
        
    }


}
