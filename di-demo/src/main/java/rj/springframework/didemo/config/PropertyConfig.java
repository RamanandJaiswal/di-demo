package rj.springframework.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rj.springframework.didemo.exampleBeans.FakeDataSource;
import rj.springframework.didemo.exampleBeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {


    @Value("${rj.username}")
    String user;

    @Value("${rj.password}")
    String password;

    @Value("${rj.dburl}")
    String dburl;

    @Value("${rj.jms.username}")
    String jmsUsername;

    @Value("${rj.jms.password}")
    String jmsPassword;

    @Value("${rj.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(dburl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }


}
