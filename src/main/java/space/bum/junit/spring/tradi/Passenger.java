package space.bum.junit.spring.tradi;

import lombok.Getter;

@Getter
public class Passenger {
  private String name;
  private Country country;

  public Passenger(String name) {
    super();
    this.name = name;
    this.country = new Country("대한민국", "KR");
  }
}
