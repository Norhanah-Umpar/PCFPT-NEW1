import javax.swing.*;
import java.awt.*;

public class UserPanel {
    private JPanel userPanel;

    public UserPanel() {
        userPanel = new JPanel(new BorderLayout());
        userPanel.setBackground(Color.WHITE);
        // Label for "User Profile" at the top
        JLabel userLabelTop = new JLabel("User Profile");
        userLabelTop.setFont(new Font("SansSerif", Font.PLAIN, 40));
        userLabelTop.setForeground(new Color(0, 100, 0));
        userPanel.add(userLabelTop, BorderLayout.NORTH);

        // Panel for the image with GridBagLayout
        JPanel imagePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;

        ImageIcon image = new ImageIcon("photos/chicken.png");
        Image scaledImage = image.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        JLabel imageLabel = new JLabel(scaledImageIcon);
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH; // Align to the top
        imagePanel.add(imageLabel, gbc);

        // Label for the username below the image (centered)
        String username = new String(LoginGUI.getUsername());
        JLabel usernameLabel = new JLabel(username);
        usernameLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
        usernameLabel.setForeground(new Color(0, 100, 0));

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        imagePanel.add(usernameLabel, gbc);

        // Add the imagePanel to the userPanel
        userPanel.add(imagePanel, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return userPanel;
    }
}
