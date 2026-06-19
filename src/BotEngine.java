
import java.time.*;
public class BotEngine{
 public String reply(String m){
  String s=m.toLowerCase();
  if(s.contains("hello")||s.contains("hi")) return "👋 Hello! How can I help you?";
  if(s.contains("java")) return "Java is an object-oriented programming language.";
  if(s.contains("ai")) return "AI enables computers to learn and solve problems.";
  if(s.contains("time")) return "Current time: "+LocalTime.now().withNano(0);
  if(s.contains("date")) return "Today's date: "+LocalDate.now();
  if(s.contains("bye")) return "Goodbye! 👋";
  return "I understood: '"+m+"'. Ask me about Java, AI, date or time.";
 }
}
