import java.util.Arrays;
public class Sequence implements Initialize{
    protected int[] sequence;
    public Sequence(int[] sequence){
        this.sequence = sequence;
        for(int i = 1; i < sequence.length; i++){
            int temp = sequence[i];
            int k = i;
            while(k > 0 && temp < sequence[k - 1]){
                sequence[k] = sequence[k - 1];
                k--;
            }
            sequence[k] = temp;
        }
    }
    public void print(){
        System.out.println(Arrays.toString(sequence));
    }
    @Override
    public boolean isArithmetic(){
        int diff = sequence[1] - sequence[0];
        for(int i = 0; i < sequence.length - 1; i++){
            if(diff != sequence[i + 1] - sequence[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isGeometric(){
        int rate = sequence[1]/sequence[0];
        for(int i = 0; i < sequence.length - 1; i++){
            if(rate != sequence[i + 1]/sequence[i]){
                return false;
            }
        }
     return true;
    }
    public String specifySequence(){
        boolean geo = isGeometric();
        boolean arith = isArithmetic();
        if(geo == true){
            return "Geometric";
        }
        else if(arith == true){
            return "Arithmetic";
        }
        return "neither";
    }
}