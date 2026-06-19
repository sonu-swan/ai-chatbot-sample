
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ChatBotUI extends JFrame{
 JTextPane chat=new JTextPane();
 JTextField input=new JTextField();
 JButton send=new JButton("➤");
 BotEngine engine=new BotEngine();

 public ChatBotUI(){
  setTitle("AI Chatbot");
  setSize(820,600);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setLayout(new BorderLayout());

  JPanel top=new JPanel(new BorderLayout());
  top.setBorder(new EmptyBorder(12,16,12,16));
  top.setBackground(new Color(32,33,35));
  JLabel t=new JLabel("Artificial Intelligence Chatbot");
  t.setForeground(Color.WHITE);
  t.setFont(new Font("SansSerif",Font.BOLD,20));
  top.add(t);

  chat.setEditable(false);
  chat.setBackground(new Color(52,53,65));
  chat.setForeground(Color.WHITE);
  chat.setFont(new Font("SansSerif",Font.PLAIN,16));
  chat.setText("🤖 Assistant:\nWelcome! Ask me anything about Java or AI.\n\n");

  JPanel bottom=new JPanel(new BorderLayout(8,8));
  bottom.setBorder(new EmptyBorder(10,10,10,10));
  bottom.setBackground(new Color(52,53,65));
  input.setFont(new Font("SansSerif",Font.PLAIN,16));
  send.setFont(new Font("SansSerif",Font.BOLD,18));

  send.addActionListener(e->go());
  input.addActionListener(e->go());

  bottom.add(input,BorderLayout.CENTER);
  bottom.add(send,BorderLayout.EAST);

  add(top,BorderLayout.NORTH);
  add(new JScrollPane(chat),BorderLayout.CENTER);
  add(bottom,BorderLayout.SOUTH);

  setLocationRelativeTo(null);
  setVisible(true);
 }
 void go(){
  String m=input.getText().trim();
  if(m.isEmpty()) return;
  chat.setText(chat.getText()+"🧑 You:\n"+m+"\n\n🤖 Assistant:\n"+engine.reply(m)+"\n\n");
  input.setText("");
 }
}
