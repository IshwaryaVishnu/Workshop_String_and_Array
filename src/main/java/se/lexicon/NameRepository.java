package se.lexicon;

import java.util.Arrays;

public class NameRepository {

    //store name in String array
    // format "“[first name][whitespace][last name]"

    //first String = "Eriks Svensson"
    //String[] names = new String[3]
    //
    //Workshop-Array Part 1//

    private static String[] names = new String[0];


    //return number of elements in the array

    public static int getSize() {
        return names.length;
    }



        public static void  setNames(String[] Names) {
            String[] combinedArr = Arrays.copyOf(names, names.length + Names.length);
            for (int i=names.length , j=0; i < combinedArr.length; i++, j++){
                combinedArr[i] = Names[j];
            }
            names = combinedArr;
        }

        public  static void clear(){
            String[] emptyArr = new String[0];
            names = emptyArr;
        }

        public static  String[] findAll(){
            return  names;
        }

        //Workshop-Array Part 2//

        public static String find(final  String fullName){
            for(String name : names){
                if(name.equalsIgnoreCase(fullName)){
                    return name;
                }
            }
            return "Null";
        }

        //my own method
        public static void setFullName(String fullNameArr) {
            String[] newArra = Arrays.copyOf(names, names.length + 1);
            newArra[newArra.length-1] = fullNameArr;
            names = newArra;
        }

        public  static boolean add(final String fullName){
            if(find(fullName).equalsIgnoreCase(fullName)){
                return false;

            }else{
                setFullName(fullName);
                return true;
            }

        }



        //Workshop-Array Part 3

        public static String[] findByFirstName(final String firstName) {
            String[] findArr  = new String[0];
            for(String name : names){
                if(name.startsWith(firstName.toLowerCase())){
                    findArr = Arrays.copyOf(findArr, findArr.length + 1);
                    findArr[findArr.length-1] = name;
                }
            }
            return findArr;
        }

        public static String[] findByLastName(final String lastName){
            String[] findArr  = new String[0];
            for(String name : names){
                if(name.endsWith(lastName.toLowerCase())){
                    findArr = Arrays.copyOf(findArr, findArr.length + 1);
                    findArr[findArr.length-1] = name;
                }
            }
            return findArr;
        }


        public static boolean update(final String original, final String updatedName) {

            //find name replace it new full name;
            //return true if name found and update name
            //or false name not found
            //or find name but an existing name matching the updateName
            for (String name : names) {
                if (name.equalsIgnoreCase(original) && find(updatedName) != updatedName) {
                    names[name.indexOf(original)].replace(original, updatedName);
                    return true;
                }
            }
            return false;
        }

        //Workshop-Array Part 4
      public static boolean remove(final String fullName){
            //remove name from array
            //return true if name found else false if not could not be removed
            String[] newArr = new String[names.length-1];
            int count = 0;
            for (String i : names)
                if (!(i.equalsIgnoreCase(fullName)))
                    if (count == names.length - 1) {
                        return false;
                    }
                    else
                    {
                        newArr[count] = i;
                        count++;
                    }

            names = newArr;
            return true;
        }

}
