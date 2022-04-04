import java.util.HashSet;

public class FirstRecurringCharacter {
    public Integer firstRecuringChar(int[] array){
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < array.length; i++){
            int recurringChar = array[i];
            
            if(set.contains(recurringChar)){
                return recurringChar;
            }else
                set.add(recurringChar);
        }
            return -1;
    }
    
    public static void main(String[] args) {
           int[] array = {};
           int[] array2 = {2,5,1,2,3,5,1,2,4};
           FirstRecurringCharacter frc = new FirstRecurringCharacter();
           System.out.println(frc.firstRecuringChar(array));
           System.out.println(frc.firstRecuringChar(array2));
    }
}


