import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.firstspringboot.service.SpeakerServiceImpl;
import com.firstspringboot.repository.HibernateSpeakerImpl;
import com.firstspringboot.repository.SpeakerRepository;
import com.firstspringboot.service.SpeakerService;

@Configuration
@ComponentScan("com.firstspringboot")
public class AppConfig {
//	
//	@Bean(name = "speakerService")
//	@Scope(value=BeanDefinition.SCOPE_SINGLETON)
//	public SpeakerService getSpeakerService() {
//		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//		//service.setRepository(getSpeakerRepository());
//		return service;
//	}
//	
//	@Bean(name = "speakerRepository")
//	public SpeakerRepository getSpeakerRepository() {
//		return new HibernateSpeakerImpl();
//	}
}
