package info.developia.prevengic.prevengic.config

import info.developia.prevengic.ComposeRepositoryImpl
import info.developia.prevengic.mapper.ComposeMapper
import info.developia.prevengic.repository.ComposeRepository
import info.developia.prevengic.service.ComposeService
import info.developia.prevengic.service.ComposeServiceImpl
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@MapperScan("info.developia.prevengic.mapper")
class ApplicationConfig {

    @Autowired
    private final ComposeMapper composeMapper

    @Bean
    public ComposeService getComposeService() {
        return new ComposeServiceImpl(composeRepository)
    }

    @Bean
    public ComposeRepository getComposeRepository() {
        return new ComposeRepositoryImpl(composeMapper)
    }

}
