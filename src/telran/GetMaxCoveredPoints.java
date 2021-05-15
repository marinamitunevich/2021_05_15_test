package telran;

import java.util.List;

public class GetMaxCoveredPoints {
    public int getMaxCoveredPoints(List<Integer> points, List<Cut> cuts){
        int res = 0;
        int point = 0;
        for(int currentNumber :points){
            int maxRepetition = 0;

            for(Cut cut :cuts){
                if( currentNumber >= cut.getLeftEnd() && currentNumber <= cut.getRightEnd()){
                    maxRepetition++;
                }
            }
            if(maxRepetition >= res){
                res = maxRepetition;
                point = currentNumber;
            }
        }
        return point ;
    }
}
