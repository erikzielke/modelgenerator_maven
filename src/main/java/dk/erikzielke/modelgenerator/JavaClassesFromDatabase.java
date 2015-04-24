package dk.erikzielke.modelgenerator;

import com.github.erikzielke.model_generator.CommandLineRunner;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "generate-java-classes")
public class JavaClassesFromDatabase extends AbstractMojo {
    public void execute() throws MojoExecutionException {
        CommandLineRunner.main(new String[]{"model_config.xml"});
    }
}
