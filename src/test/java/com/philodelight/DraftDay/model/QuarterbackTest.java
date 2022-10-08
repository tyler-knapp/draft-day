package com.philodelight.DraftDay.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuarterbackTest {
    
    @Test
    void createQuarterbackWithNoArgConstructor(){
        Quarterback quarterback = new Quarterback();
        Assertions.assertNotNull(quarterback);
    }
    
    @Test
    void testQuarterbackWithAllArgsConstructor(){
        Quarterback quarterback = new Quarterback(199.43, 125, 79,
                12, 7, 88.9 );
        
        int actualPassAttempts = quarterback.getPassAttempts();
        int actualPassCompletions = quarterback.getPassCompletions();
        int actualPassingTouchdowns = quarterback.getPassingTouchDowns();
        int actualRushingTouchdowns = quarterback.getRushingTouchdowns();
        double actualRushingYards = quarterback.getRushingYards();
        double actualPassingYards = quarterback.getPassingYards();
        Assertions.assertEquals(125, actualPassAttempts);
        Assertions.assertEquals(199.43, actualPassingYards);
        Assertions.assertEquals(79, actualPassCompletions);
        Assertions.assertEquals(12, actualPassingTouchdowns);
        Assertions.assertEquals(7, actualRushingTouchdowns);
        Assertions.assertEquals(88.9, actualRushingYards);
    }
    
    @Test
    void toStringOverrideTest(){
        Quarterback quarterback = new Quarterback(199.43, 125, 79,
                12, 7, 88.9 );
        Assertions.assertEquals("Passing Yards: 199.43 Passing Attempts: 125 Pass Completions: 79" +
                " Passing Touchdowns: 12 Rushing Yards: 88.9 Rushing Touchdowns: 7", quarterback.toString());
    }
    
}
