
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

/**
 * Created by wonwoo on 2016. 12. 19..
 */

@RunWith(SpringRunner.class)
@AutoConfigureTest
public class ApplicationTest {

  @Autowired(required = false)
  private String str;

  @Test
  public void autoConfigTest() {
    assertThat(str, is("wonwoo"));
  }

  @Test
  public void autoConfigNullTest() {
    assertThat(str, is(nullValue()));
  }
}
