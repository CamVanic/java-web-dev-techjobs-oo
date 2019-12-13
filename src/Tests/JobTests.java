package org.launchcode.techjobs_oo.tests;



import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;




public class JobTests {
    Job job, job2,job3, job4;
    @Before
    public void createJobObject(){
        job = new Job();
        job2 = new Job();
        job3 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job4 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testSettingObjectId(){
        assertEquals(1, job2.getId() - job.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().getValue());
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality Control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());
    }

    @Test
    public void testForEquality(){
        assertFalse(job3.equals(job4));
    }

    @Test
    public void returnJobInfo(){
        String output = String.format("\nId: %d\n" + "Name: %s\n" +"Employer: %s\n" +
                "Location: %s\n" + "Position Type: %s\n" + "Core Competency: %s\n", job3.getId(), job3.getName(), job3.getEmployer(),
                job3.getLocation(), job3.getPositionType(), job3.getCoreCompetency());
        assertEquals(output, job3.toString());
    }
}
