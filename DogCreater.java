/*Mohammed Qutu
2/22/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
Practice with setters and getters
*/
public class DogCreater
{

    public static void main(String[] args) 
    {
        Dog dog1 = new Dog("Texie",25);
        Dog dog2 = new Dog("Juicy",15);
        Dog dog3 = new Dog("Penny",28);
        System.out.println("Name: " + dog1.getName());
        System.out.println("Weight: " + dog1.getWeight());
        System.out.println("Name: " + dog2.getName());
        System.out.println("Weight: " + dog2.getWeight());
        System.out.println("Name: " + dog3.getName());
        System.out.println("Weight: " + dog3.getWeight());
        
        System.out.println(dog1.compare(dog2));
        System.out.println(dog1.compare(dog3));
        System.out.println(dog3.compare(dog2));
        
        dog3.setWeight(23);//lost weight
        System.out.println(dog1.compare(dog3));
        System.out.println(dog3.compare(dog2));
    }
}
