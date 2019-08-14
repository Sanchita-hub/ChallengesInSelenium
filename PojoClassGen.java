/*package businesscomponents;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.GsonAnnotator;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class PojoClassGen {

	public static void main(String[] args) {
		JCodeModel codeModel = new JCodeModel();
		try {
			URL source = new URL("file:/C:/PremAudit/postResponse2.json");
			GenerationConfig config = new DefaultGenerationConfig() {
				@Override
				public boolean isGenerateBuilders() {
					return true;
				}

				public SourceType getSourceType() {
					return SourceType.JSON;
				}
			};
			SchemaMapper mapper = new SchemaMapper(
					new RuleFactory(config, new GsonAnnotator(config), new SchemaStore()), new SchemaGenerator());
			mapper.generate(codeModel, "postResponse", "com.pascService.postResponse", source);
			File dir = new File("C:\\PremAudit\\pojo classes");
			if (dir.exists()) {
				System.out.println("dir available");
				codeModel.build(dir);
			} else {
				System.out.println("dir not available");
			}

			// Accession accession = new Accession();
			// accession.getBusinessUnitId();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}*/