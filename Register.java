import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
class Register extends Frame {
    Register() {
        this.setTitle("Registration Form");
        this.setSize(350, 390);
        this.setLayout(null);
        this.setVisible(true);
        this.setFont(new Font("Calibri", Font.BOLD, 10));

        Label FristName = new Label();
        FristName.setText("First Name");
        FristName.setBounds(20, 50, 80, 20);
        this.add(FristName);

        TextField Fname = new TextField();
        Fname.setBounds(120, 50, 120, 20);
        this.add(Fname);

        Label LastName = new Label();
        LastName.setText("Last Name");
        LastName.setBounds(20, 80, 80, 20);
        this.add(LastName);

        TextField Lname = new TextField();
        Lname.setBounds(120, 80, 120, 20);
        this.add(Lname);

        Label Email = new Label();
        Email.setText("Email");
        Email.setBounds(20, 110, 60, 20);
        this.add(Email);

        TextField mail = new TextField();
        mail.setBounds(120, 110, 120, 20);
        this.add(mail);

        Label Phone = new Label();
        Phone.setText("Phone No");
        Phone.setBounds(20, 140, 60, 20);
        this.add(Phone);

        TextField Pno = new TextField();
        Pno.setBounds(120, 140, 120, 20);
        this.add(Pno);

        Label Gender = new Label();
        Gender.setText("Gender");
        Gender.setBounds(20, 170, 60, 20);
        this.add(Gender);

        TextField gender = new TextField();
        gender.setBounds(120, 170, 60, 20);
        this.add(gender);

        Label DOB = new Label();
        DOB.setText("Date of Birth");
        DOB.setBounds(20, 200, 80, 20);
        this.add(DOB);

        TextField dob= new TextField();
        dob.setBounds(120,200,100,20);
        this.add(dob);



        Label Username = new Label();
        Username.setText("Username");
        Username.setBounds(20, 230, 60, 20);
        this.add(Username);

        TextField Uname = new TextField();
        Uname.setBounds(120, 230, 80, 20);
        this.add(Uname);

        Label Password = new Label();
        Password.setText("Password");
        Password.setBounds(20, 260, 60, 20);
        this.add(Password);

        TextField Pword = new TextField();
        Pword.setBounds(120, 260, 80, 20);
        this.add(Pword);

        Label Success = new Label();
        Success.setBounds(90, 300, 200, 20);
        this.add(Success);

        Button submit = new Button("Submit");
        submit.setBounds(150, 330, 50, 20);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try (FileWriter write = new FileWriter("Login.txt", true)) {
                    write.write(Uname.getText() + "\t" + Pword.getText() + "\n");
                    write.close();
                    Success.setText("You're registered Successfully!");
                } catch (IOException ex) {

                }
            }
        });
        this.add(submit);

        Button close = new Button("Close");
        close.setBounds(150, 360, 50, 20);
        close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        this.add(close);
    }
    public static void main(String[] args){
        Register a= new Register();
    }
}




