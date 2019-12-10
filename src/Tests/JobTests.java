package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTests {
    Job new_job, new_job2,new_job3, new_job4;
    @Before
    public void createJobObject(){
        new_job = new Job();
        new_job2 = new Job();
        new_job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        new_job4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingObjectId(){
        assertEquals(1, new_job2.getId() - new_job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(new_job3 instanceof Job);
    }

    @Test
    public void testForEquality(){
        assertFalse(new_job3.equals(new_job4));
    }
}
