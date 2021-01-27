public class DogArray
{

    /**
     *  Returns the index of the youngest dog in the given array
     */
    public static int getYoungestIndex(Dog[] dogs)
{
    int index = 0; // initialize index, pick first one 
    for (int i = 1; i < dogs.length; i++) // loop through all
    {
      if (dogs[i].getAge() < dogs[index].getAge()) // compare ages
        index = i;
    }
    return index; // return requested answer... read the question!
}

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
      int index = getYoungestIndex(dogs);
      return dogs[index].getName();
    }
}
