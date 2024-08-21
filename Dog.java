/*Mohammed Qutu
2/22/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
Practice with setters and getters
*/
public class Dog 

{
    //instance variables
    private String name;
    private double weight;
    
    //Constructer
    public Dog(String newName, double newWeight)
    {
        setName(newName);   //was name = newName;
        setWeight(newWeight);   //was weight =newWeight;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public void setWeight(double newWeight)
    {
        if(newWeight > 0)
        {
            weight = newWeight;    
        }
        else
        {
            System.out.println("Weight cannot be zero or negative");
        }
    }
    public String getName()
    {
        return name;
    }
    public double getWeight()
    {
        return weight;
    }
    public String compare(Dog dogCompare)
    {
       String message; //was added
        if(dogCompare.weight > this.weight)//this.name is reffering to dog 1
        {
            message = dogCompare.name + " weighs more than " + this.name;
        }
        else if(dogCompare.weight < this.weight)
        {
            message = this.name+" weighs more than " + dogCompare.name;
        }
        else
        {
           message = "The dogs weights are equal."; //was: return "The dogs weights are equal.";
        }
        return message; //was added
    }
}//end of class
