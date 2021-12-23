package dio.springbeans.utilizandoBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public abstract class App {

    public static void main(String[] args) {

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livros livro1 = factory.getBean(Livros.class);
        livro1.setNome("A Bella e a Fera");
        livro1.setCodigo("HI467");

        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Elizabeth Rudnick");
        livro1.exibir();

        Livros livro2 = factory.getBean(Livros.class);
        livro2.setNome("Como poeira ao vento");
        livro2.setCodigo("BN86");

        Autor autor2 = factory.getBean(Autor.class);
        autor2.setNome("Leonardo Padura");
        livro2.exibir();
        }
    }
