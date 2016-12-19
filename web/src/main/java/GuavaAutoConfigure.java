import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 2016. 12. 19..
 */
@Configuration
public class GuavaAutoConfigure {

  @Bean
  public String str(){
    return "wonwoo";
  }
}
