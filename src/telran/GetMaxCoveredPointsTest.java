package telran;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GetMaxCoveredPointsTest {
    List<Integer> points = Arrays.asList(3,5,6,7,8,9);
    Cut [] cuts;
    GetMaxCoveredPoints test = new GetMaxCoveredPoints();
    List<Cut> cut = new ArrayList<>();

    @Test
    void getMaxCoveredPointsTest_Positive() {
        try {
            cuts = new Cut[]{new Cut(0, 6), new Cut(-10, 5), new Cut(3,7)};
        } catch (LessThanLeftEnd lessThanLeftEnd) {
            lessThanLeftEnd.printStackTrace();
        }
        for(int i =0; i< cuts.length;i++ ){
            cut.add(cuts[i]);
        }

       assertTrue(test.getMaxCoveredPoints(points,cut) == 5 || test.getMaxCoveredPoints(points,cut) == 3);


    }
    @Test
    void getMaxCoveredPointsTest_Negative() {
        boolean flag = false;
        try {
            cuts = new Cut[]{new Cut(0, -2), new Cut(-10, 5), new Cut(3,7)};
            for(int i =0; i< cuts.length;i++ ){
                cut.add(cuts[i]);
            }
        } catch (LessThanLeftEnd lessThanLeftEnd) {
            flag = true;
        }

        assertTrue(flag);


    }

}