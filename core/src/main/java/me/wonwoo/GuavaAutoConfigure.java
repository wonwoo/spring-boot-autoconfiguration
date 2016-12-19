package me.wonwoo;

import com.google.common.eventbus.EventBus;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoo on 2016. 12. 19..
 */
@Configuration
@ConditionalOnClass(EventBus.class)
public class GuavaAutoConfigure {

  @Bean
  public String str(){
    return "wonwoo";
  }
}
