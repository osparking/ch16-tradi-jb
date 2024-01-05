package space.bum.junit.spring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static space.bum.junit.spring.PassengerUtil.getExpectedPassenger;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import space.bum.junit.spring.junit4.Passenger;

public class SimpleAppTest {
  // @formatter:off
  private static final String APP_CONTEXT_XML_FILE
                              = "classpath:application-context.xml";
  // @formatter:on
  private ClassPathXmlApplicationContext context;
  private Passenger expectedPassenger;

  @Before
  public void setUp() {
    context = new ClassPathXmlApplicationContext(APP_CONTEXT_XML_FILE);
    expectedPassenger = getExpectedPassenger();
  }

  @Test
  public void testInitPassenger() {
    Passenger passenger = (Passenger) context.getBean("passenger");
    assertEquals(expectedPassenger, passenger);
  }
}
