package space.bum.junit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static space.bum.junit.spring.PassengerUtil.getExpectedPassenger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import space.bum.junit.spring.junit4.Passenger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class SpringAppTest {
  @Autowired
  private Passenger passenger1;
  private Passenger expectedPassenger;
  
  @Before
  public void setUp() {
    expectedPassenger = getExpectedPassenger();
  }

  @Test
  public void testInitPassenger() {
    assertEquals(expectedPassenger, passenger1);
    System.out.println(passenger1);
  }
}
