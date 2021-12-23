package dio.springbeans.utilizandoBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livros getLivros() {
        return new Livros();
    }

    //<bean id="livros" class="com.springbeans.Livros/>"
    @Bean
    public AutorLivro getAutorLivro() {
        return new Autor();
        }
    }