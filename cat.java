package pet;

/*
 *  Alvin Mai  
 */

public class cat extends Pet
{
    public String catName;
    public int catAge;
    public String catSound;
    public boolean catHunger;

    public cat(String catName,String catSound)
    {
        catName = "Luna";
        catSound = "Meow";
    }
    public cat(int catAge)
    {
        catAge = 3;
    }
    public cat(boolean catHunger)
    {
        catHunger = false;
    }
    
    public String returnCatName()
    {
        return catName;
    }
    public int returnCatAge()
    {
        return catAge;
    }
    public String returnCatSound()
    {
        return catSound;
    }
    public boolean returnCatHunger()
    {
        return catHunger;
    }

}