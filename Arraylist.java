import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
 
public class Arraylist{
public static void main(String[] args) {
List<String> programmingLanguages = new ArrayList<>();
programmingLanguages.add("C");
programmingLanguages.add("C++");
programmingLanguages.add("Java");
programmingLanguages.add("Kotlin");
programmingLanguages.add("Python");
programmingLanguages.add("Perl");
programmingLanguages.add("Ruby");
 
System.out.println("Initial List: " + programmingLanguages);
 

programmingLanguages.remove(5);
System.out.println("After remove(5): " + programmingLanguages);
 

boolean isRemoved = programmingLanguages.remove("Kotlin");
System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);
 

List<String> scriptingLanguages = new ArrayList<>();
scriptingLanguages.add("Python");
scriptingLanguages.add("Ruby");
scriptingLanguages.add("Perl");
 
programmingLanguages.removeAll(scriptingLanguages);
System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);
 

programmingLanguages.removeIf(new Predicate<String>() {
@Override
public boolean test(String s) {
return s.startsWith("C");
}
});
 
System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);
 

programmingLanguages.clear();
System.out.println("After clear(): " + programmingLanguages);
}
}