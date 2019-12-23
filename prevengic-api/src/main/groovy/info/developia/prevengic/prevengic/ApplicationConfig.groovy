package info.developia.prevengic.prevengic

import info.developia.prevengic.ComposeRepositoryImpl
import info.developia.prevengic.repository.ComposeRepository
import info.developia.prevengic.service.ComposeService
import info.developia.prevengic.service.ComposeServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ApplicationConfig {

    @Bean
    public ComposeService getConposeService() {
        return new ComposeServiceImpl(composeRepository)
    }

    @Bean
    public ComposeRepository getComposeRepository() {
        return new ComposeRepositoryImpl()
    }

}
