import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
 
public class Test {
	
	private static String myLocalPath = System.getProperty("user.dir") + "/src/";
	private static String filePath = myLocalPath+"A.java";
	
	
	//use ASTParse to parse string
		public static void parse(String str) {
			ASTParser parser = ASTParser.newParser(AST.JLS3);
			parser.setSource(str.toCharArray());
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
	 
			final CompilationUnit cu = (CompilationUnit) parser.createAST(null);
	 
			cu.accept(new ASTVisitor() {
	 
				Set names = new HashSet();
	 
				public boolean visit(TypeDeclaration node){
					System.out.println("~~~~~~Class~~~~~~~");
					System.out.println("déclaration line " + cu.getLineNumber(node.getStartPosition()));
					if(node.isInterface()){
						System.out.print("Name of interface : ");
					}
					else{
						System.out.print("Name of class : ");
					}
					
					System.out.println(node.getName());
					System.out.println("Superclass : " + node.getSuperclassType());
					
					System.out.println("~~~~~~Attribut~~~~~~~");
					List<FieldDeclaration> fields = Arrays.asList(node.getFields());
					for(FieldDeclaration f : fields){
						System.out.println("Déclaration at line "+ cu.getLineNumber(f.getStartPosition()));
						List<VariableDeclarationFragment> fragments = f.fragments();
						System.out.println(f.modifiers() +" "+ f.getType() + " " + fragments.get(0).getName());
					}
					
					System.out.println("~~~~~~Methods~~~~~~~");
					List<MethodDeclaration> methods = Arrays.asList(node.getMethods());
					int count = 0;
					for(MethodDeclaration m : methods){
						count++;
						System.out.println("~~~~Method "+ count + "~~~~~");
						System.out.println("Déclaration at line "+ cu.getLineNumber(m.getStartPosition()));
						System.out.println("Method name : "+ m.getName() + "\n"
								+ "return type : " + m.getReturnType2() + "\n"
								+ "parameters : " + m.parameters()
								/*+ "receiver : " + m.getReceiverQualifier*/);
					}
					
					
					return true;
				}
				
			/*	
				public boolean visit(VariableDeclarationFragment node) {
					SimpleName name = node.getName();
					this.names.add(name.getIdentifier());
					System.out.println("Declaration of variable '" + name + "' at line "
							+ cu.getLineNumber(name.getStartPosition()));
					
					return false; // do not continue 
				}
				
	 
				public boolean visit(SimpleName node) {
					if (this.names.contains(node.getIdentifier())) {
						System.out.println("Usage of variable '" + node + "' at line "
								+ cu.getLineNumber(node.getStartPosition()));
					}
					return true;
				}
			*/
			});
	 
		}
		
		//read file content into a string
	public static String readFileToString(String filePath) throws IOException {
			StringBuilder fileData = new StringBuilder(1000);
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
	 
			char[] buf = new char[10];
			int numRead = 0;
			while ((numRead = reader.read(buf)) != -1) {
				System.out.println(numRead);
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
				buf = new char[1024];
			}
	 
			reader.close();
	 
			return  fileData.toString();	
		}
	
	public static void main(String args[]) throws IOException{
	
		String classToRead = readFileToString(filePath);
		parse(classToRead);
		
	}
}