package space.bum.junit.spring.tradi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Country {
  private String name;
  private String codeName;
}
