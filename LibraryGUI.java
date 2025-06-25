import javax.swing.*;
import java.awt.event.*;

public class LibraryGUI extends JFrame implements ActionListener {
    JTextField txtName, txtId, txtEstablished, txtBooks, txtAddress;
    JButton btnRegister, btnShowAll;
    JTextArea txtShowAll;

    public LibraryGUI() {
        setSize(600, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbTitle = new JLabel("Library Registration");
        lbTitle.setBounds(20, 0, 150, 20);
        add(lbTitle);

        JLabel lbName = new JLabel("Name");
        lbName.setBounds(20, 30, 100, 20);
        add(lbName);

        txtName = new JTextField();
        txtName.setBounds(120, 30, 100, 20);
        add(txtName);

        JLabel lbId = new JLabel("ID");
        lbId.setBounds(20, 60, 100, 20);
        add(lbId);

        txtId = new JTextField();
        txtId.setBounds(120, 60, 100, 20);
        add(txtId);

        JLabel lbEstablished = new JLabel("Established");
        lbEstablished.setBounds(20, 90, 100, 20);
        add(lbEstablished);

        txtEstablished = new JTextField();
        txtEstablished.setBounds(120, 90, 100, 20);
        add(txtEstablished);

        JLabel lbBooks = new JLabel("Total Books");
        lbBooks.setBounds(20, 120, 100, 20);
        add(lbBooks);

        txtBooks = new JTextField();
        txtBooks.setBounds(120, 120, 100, 20);
        add(txtBooks);

        JLabel lbAddress = new JLabel("Address");
        lbAddress.setBounds(20, 150, 100, 20);
        add(lbAddress);

        txtAddress = new JTextField();
        txtAddress.setBounds(120, 150, 100, 20);
        add(txtAddress);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(120, 180, 100, 20);
        add(btnRegister);
        btnRegister.addActionListener(this);

        btnShowAll = new JButton("Show All");
        btnShowAll.setBounds(120, 210, 100, 20);
        add(btnShowAll);
        btnShowAll.addActionListener(this);

        txtShowAll = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtShowAll);
        scroll.setBounds(250, 30, 300, 500);
        add(scroll);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegister) {
            registerClicked();
        } else if (e.getSource() == btnShowAll) {
            showAllClicked();
        }
    }

    private void registerClicked() {
        String name = txtName.getText();
        String id = txtId.getText();
        String established = txtEstablished.getText();
        String books = txtBooks.getText();
        String address = txtAddress.getText();

        Library lib = new Library(id, name, established, books, address);
        LibraryManager manager = new LibraryManager();
        manager.writeLibrary(lib);
        JOptionPane.showMessageDialog(null, "Library Registered!");
        refreshFields();
        showAllClicked();
    }

    private void showAllClicked() {
        LibraryManager manager = new LibraryManager();
        Library[] libraries = manager.getAllLibraries();
        String output = "";
        for (Library lib : libraries) {
            output += lib.showInfoGUI();
        }
        txtShowAll.setText(output);
    }

    private void refreshFields() {
        txtName.setText("");
        txtId.setText("");
        txtEstablished.setText("");
        txtBooks.setText("");
        txtAddress.setText("");
    }
}