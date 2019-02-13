package lqy.bwie.com.fanshe;

/**
 * author lim
 * email:lim@123.com
 * date 2019/2/13
 * desc:
 */
public class Presen {
    public String name;
    private int age;

    public Presen(){
        System.out.println("无参");
    }

    public Presen(String name){
        this.name = name;
       System.out.println("name="+name);
    }

    private Presen(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("name22="+name+"age22="+age);
    }

    private void fun2(String name,String s,int a){

        System.out.println("私有方法，fun2的name="+name);

    }
    private void fun3(String name,String s,int a){

        System.out.println("私有方法，fun3的name="+name);

    }

    public int getAge() {

        System.out.println("age==="+age);

        return -1;
    }

    @Override
    public String toString() {
        return "Presen{" +
                "name111+'" + name + '\'' +
                ", age111+" + age +
                '}';
    }
}
