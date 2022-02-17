public class Internal extends Sequence{
    public Internal(int[] sequence){
        super(sequence);
    }
    public int getCommonDifference(){
        int[] series = super.sequence;
        return series[1] - series[0];
    }
    public int getCommonRatio(){
        int[] series = super.sequence;
        return series[1]/series[0];
    }
}
