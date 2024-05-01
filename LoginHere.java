import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
class LoginHere extends Frame {
    LoginHere() {
        this.setTitle("Login Here");
        this.setSize(300, 250);
        this.setLayout(null);
        this.setVisible(true);
        
        Label Username = new Label();
        Username.setText("Username");
        Username.setBounds(20, 50, 80, 20);
        this.add(Username);

        TextField Uname = new TextField();
        Uname.setBounds(120, 50, 120, 20);
        this.add(Uname);

        Label Password = new Label();
        Password.setText("Password");
        Password.setBounds(20, 80, 80, 20);
        this.add(Password);

        TextField Pword = new TextField();
        Pword.setBounds(120, 80, 120, 20);
        this.add(Pword);

        Label msg = new Label();
        msg.setBounds(80, 150, 200, 20);
        this.add(msg);

        Button submit = new Button("Login");
        submit.setBounds(125, 180, 50, 20);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String UserName = Uname.getText().toString();
                String PassWord = Pword.getText().toString();
                try {
                    FileReader fileRead = new FileReader("Login.txt");
                    BufferedReader bufferRead = new BufferedReader(fileRead);
                    String str;
                    while ((str = bufferRead.readLine()) != null) {
                        if (str.equals(UserName + "\t" + PassWord)) {
                            msg.setText("Login Successfull");
                            break;
                        } else {
                            msg.setText("Incorrect Username or Password");
                        }
                    }
                    fileRead.close();
                } catch (Exception e2) {
                }
            }
        });
        this.add(submit);

        Button close = new Button("Close");
        close.setBounds(125, 210, 50, 20);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        this.add(close);
    }
    public static void main(String[] args){
        LoginHere a= new LoginHere();
    }
}

