package top.duanhong.workflowservice.config;

import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

/**
 * @author duanhong
 * @description
 * @date 2020/1/14
 */
@Configuration
public class ActivitiConfig implements ProcessEngineConfigurationConfigurer {
    @Override
    public void configure(SpringProcessEngineConfiguration springProcessEngineConfiguration) {
//        springProcessEngineConfiguration.s(new idGenerator());
    }
}
