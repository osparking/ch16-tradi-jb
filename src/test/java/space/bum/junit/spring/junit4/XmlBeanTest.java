package space.bum.junit.spring.junit4;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import space.bum.junit.spring.tradi.Country;

class XmlBeanTest {

  static ClassPathXmlApplicationContext context;

  @BeforeAll
  static void setupContext() {
    context = new ClassPathXmlApplicationContext(
        "classpath:application-context.xml");
  }

  @Test
  void testCountryBean() {
    Country country = (Country) context.getBean("country");
    assertNotNull(country);
    System.out.println(country);
  }
  @Test
  void testPassengerBean() {
    Passenger passenger = (Passenger) context.getBean("passenger");
    assertNotNull(passenger);
    System.out.println(passenger);
  }
}
