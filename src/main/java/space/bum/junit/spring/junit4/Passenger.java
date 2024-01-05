package space.bum.junit.spring.junit4;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import space.bum.junit.spring.tradi.Country;

@Getter
@ToString
@EqualsAndHashCode
public class Passenger {
  private String name;
  private Country country;

  public Passenger(String name) {
    super();
    this.name = name;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
}
