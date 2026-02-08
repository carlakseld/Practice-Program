import java.awt.*;

class HelloGUI extends Frame {

    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;

    public HelloGUI() {

        super("Login Security");

        l1 = new Label("Username");
        l2 = new Label("Password");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t2.setEchoChar('*');

        b1 = new Button("Okay");
        b2 = new Button("Cancel");

        setLayout(new GridLayout(3, 2));

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new HelloGUI();
    }
}