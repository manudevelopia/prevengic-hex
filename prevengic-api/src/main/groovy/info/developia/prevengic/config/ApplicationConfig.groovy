package info.developia.prevengic.config

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
    ComposeService getComposeService() {
        return new ComposeServiceImpl(composeRepository)
    }

    @Bean
    ComposeRepository getComposeRepository() {
        return new ComposeRepositoryImpl(composeMapper)
    }

}
