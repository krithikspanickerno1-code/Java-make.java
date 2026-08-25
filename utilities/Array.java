package utilities;
import java.util.ArrayList;
public class Array{
    //add lob
    public static int[] expand(int[] array, int[] values){
        ArrayList<Integer> holder = new ArrayList<>();
        //adding values from array
        for(int stuff : array){
            holder.add(stuff);
        }
        //adding values from values{variable}
        for(int stuff2 : values){
            holder.add(stuff2);
        }
        //resizing array to its new size by checking arraylist's size
        array = new int[holder.size()];
        //transfering data from arraylist to array
        for(int i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    public static double[] expand(double[] array, double[] values){
        ArrayList<Double> holder = new ArrayList<>();
        for(double stuff : array){
            holder.add(stuff);
        }
        for(double stuff2 : values){
            holder.add(stuff2);
        }
        array = new double[holder.size()];
        for(int i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    public static char[] expand(char[] array, char[] values){
        ArrayList<Character> holder = new ArrayList<>();
        for(char stuff : array){
            //removing unnecessary characters
            if(stuff == '\u0000'){
                continue;
            }
            holder.add(stuff);
        }
        for(char stuff2 : values){
            if(stuff2 == '\u0000'){
                continue;
            }
            holder.add(stuff2);
        }
        array = new char[holder.size()];
        for(int i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    public static String[] expand(String[] array, String[] values){
        ArrayList<String> holder = new ArrayList<>();
        for(String stuff : array){
            //removing unnecessary charectars 
            if(stuff == null){
                continue;
            }
            holder.add(stuff);
        }
        for(String stuff2 : values){
            if(stuff2 == null){
                continue;
            }
            holder.add(stuff2);
        }
        array = new String[holder.size()];
        for(int i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    public static boolean[] expand(boolean[] array, boolean[] values){
        ArrayList<Boolean> holder = new ArrayList<>();
        for(boolean stuff : array){
            holder.add(stuff);
        }
        for(boolean stuff2 : values){
            holder.add(stuff2);
        }
        array = new boolean[holder.size()];
        for(int i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    //remove lob
    public static int[] shrink(int[] array, int[] values){
        ArrayList<Integer> holder = new ArrayList<>();
        int i = 0;
        //addidng values from array
        for(int stuff : array){
            holder.add(stuff);
        }
        //placeholder for auto boxing
        Integer a;
        for(i = 0 ; i < values.length ; i++){
            //autoboxing
            a = values[i];
            //removing the 'Integer' value in a
            holder.remove(a);
        }
        //reassigning memory slot of the array
        array = new int[holder.size()];
        //transfering data
        for(i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    public static double[] shrink(double[] array, double[] values){
        int i = 0;
        ArrayList<Double> holder = new ArrayList<>();
        //addidng values from array
        for(double stuff : array){
            holder.add(stuff);
        }
        //placeholder for auto boxing
        Double a;
        for(i = 0 ; i < values.length ; i++){
            //autoboxing
            a = values[i];
            //removing the 'Integer' value in a
            holder.remove(a);
        }
        //reassigning memory slot of the array
        array = new double[holder.size()];
        //transfering data
        for(i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    public static char[] shrink(char[] array, char[] values){
        int i = 0;
        ArrayList<Character> holder = new ArrayList<>();
        //addidng values from array
        for(char stuff : array){
            holder.add(stuff);
        }
        //placeholder for auto boxing
        Character a;
        for(i = 0 ; i < values.length ; i++){
            //autoboxing
            a = values[i];
            //removing the 'Integer' value in a
            holder.remove(a);
        }
        //reassigning memory slot of the array
        array = new char[holder.size()];
        //transfering data
        for(i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    public static String[] shrink(String[] array, String[] values){
        ArrayList<String> holder = new ArrayList<>();
        int i = 0;
        //addidng values from array
        for(String stuff : array){
            holder.add(stuff);
        }
        //placeholder for auto boxing
        for(i = 0 ; i < values.length ; i++){
            //no need of autoboxing String is already a Reference data type and an object
            //removing the 'Integer' value in a
            holder.remove(values[i]);
        }
        //reassigning memory slot of the array
        array = new String[holder.size()];
        //transfering data
        for(i = 0 ; i < holder.size() ; i++){
            array[i] = holder.get(i);
        }
        return array;
    }
    //feel free to add and customize
}