package pet;
/*
 *  Alvin Mai  
 */
class dog extends Pet
{
   
    public String dogName;
    public int dogAge;
    public String dogSound;
    public boolean dogHunger;
   
    public dog(String dogName,String dogSound)
    {
        dogName = "fido";
        dogSound = "Wolf";
    }
    public dog(int dogAge)
    {
        dogAge = 5;
    }
    public dog(boolean dogHunger)
    {
        dogHunger = true;
    }
    
    public String returnDogName()
    {
        return dogName;
    }
    public int returnDogAge()
    {
        return dogAge;
    }
    public String returnDogSound()
    {
        return dogSound;
    }
    public boolean returnDogHunger()
    {
        return dogHunger;
    }
    
    
    
}