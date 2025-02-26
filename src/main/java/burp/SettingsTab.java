package burp;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;

public class SettingsTab {
    private JComboBox comboBoxFingerprint;
    private JPanel panelMain;
    private JLabel labelFingerprint;
    private JTextField textFieldSpoofProxyAddress;
    private JTextField textFieldInterceptProxyAddress;
    private JTextField textFieldBurpProxyAddress;
    private JLabel labelSpoofProxyAddress;
    private JButton buttonSave;
    private JLabel labelTimeout;
    private JSpinner spinnerHttpTimout;
    private JLabel labelInterceptProxyAddress;
    private JLabel labelBurpProxyAddress;
    private JCheckBox checkBoxButtonUseInterceptedFingerprint;
    private JTabbedPane tabbedPaneTab;
    private JPanel panelSettings;
    private JPanel panelAdvanced;
    private JButton buttonSaveAdvanced;
    private JLabel labelHexClientHello;
    private JTextField textFieldHexClientHello;

    public SettingsTab(Settings settings) {
        textFieldInterceptProxyAddress.setText(settings.getInterceptProxyAddress());
        textFieldBurpProxyAddress.setText(settings.getBurpProxyAddress());
        textFieldSpoofProxyAddress.setText(settings.getSpoofProxyAddress());
        textFieldHexClientHello.setText(settings.getHexClientHello());
        spinnerHttpTimout.setValue(settings.getHttpTimeout());
        checkBoxButtonUseInterceptedFingerprint.setSelected(settings.getUseInterceptedFingerprint());
        for (var item : settings.getFingerprints()) {
            comboBoxFingerprint.addItem(item);
        }
        comboBoxFingerprint.setSelectedItem(settings.getFingerprint());

        buttonSave.addActionListener(e -> {
            settings.setSpoofProxyAddress(textFieldSpoofProxyAddress.getText());
            settings.setFingerprint((String) comboBoxFingerprint.getSelectedItem());
            settings.setHexClientHello(textFieldHexClientHello.getText());
            settings.setHttpTimeout((int) spinnerHttpTimout.getValue());
        });

        buttonSaveAdvanced.addActionListener(e -> {
            settings.setInterceptProxyAddress(textFieldInterceptProxyAddress.getText());
            settings.setBurpProxyAddress(textFieldBurpProxyAddress.getText());
            settings.setUseInterceptedFingerprint(checkBoxButtonUseInterceptedFingerprint.isSelected());
        });
    }

    public JPanel getUI() {
        return this.panelMain;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelMain = new JPanel();
        panelMain.setLayout(new GridLayoutManager(3, 5, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPaneTab = new JTabbedPane();
        panelMain.add(tabbedPaneTab, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        panelSettings = new JPanel();
        panelSettings.setLayout(new GridLayoutManager(10, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPaneTab.addTab("settings", panelSettings);
        labelSpoofProxyAddress = new JLabel();
        labelSpoofProxyAddress.setRequestFocusEnabled(false);
        labelSpoofProxyAddress.setText("Listen address:");
        labelSpoofProxyAddress.setToolTipText("");
        panelSettings.add(labelSpoofProxyAddress, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textFieldSpoofProxyAddress = new JTextField();
        textFieldSpoofProxyAddress.setToolTipText("Local address the  proxy server should listen on. Requires extension reload.");
        panelSettings.add(textFieldSpoofProxyAddress, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        labelFingerprint = new JLabel();
        labelFingerprint.setEnabled(true);
        labelFingerprint.setHorizontalAlignment(10);
        labelFingerprint.setText("Fingerprint:");
        labelFingerprint.setVerticalAlignment(0);
        labelFingerprint.setVerticalTextPosition(0);
        panelSettings.add(labelFingerprint, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        comboBoxFingerprint = new JComboBox();
        panelSettings.add(comboBoxFingerprint, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labelTimeout = new JLabel();
        labelTimeout.setText("Http connection timeout (seconds)");
        panelSettings.add(labelTimeout, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        spinnerHttpTimout = new JSpinner();
        spinnerHttpTimout.setToolTipText("The maximum amount of time a dial will wait for a connect to complete.");
        panelSettings.add(spinnerHttpTimout, new GridConstraints(7, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panelSettings.add(panel1, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        labelHexClientHello = new JLabel();
        labelHexClientHello.setRequestFocusEnabled(false);
        labelHexClientHello.setText("Hex Client Hello:");
        labelHexClientHello.setToolTipText("");
        panelSettings.add(labelHexClientHello, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textFieldHexClientHello = new JTextField();
        textFieldHexClientHello.setText("");
        textFieldHexClientHello.setToolTipText("Custom client hello as hex stream. Leave it empty if you want it to be automatically detected.");
        panelSettings.add(textFieldHexClientHello, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonSave = new JButton();
        buttonSave.setText("Save all settings");
        panelSettings.add(buttonSave, new GridConstraints(8, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        panelAdvanced = new JPanel();
        panelAdvanced.setLayout(new GridLayoutManager(7, 1, new Insets(0, 0, 0, 0), -1, -1));
        panelAdvanced.setToolTipText("");
        tabbedPaneTab.addTab("advanced", panelAdvanced);
        labelInterceptProxyAddress = new JLabel();
        labelInterceptProxyAddress.setEnabled(true);
        labelInterceptProxyAddress.setText("Intercept proxy address:");
        panelAdvanced.add(labelInterceptProxyAddress, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textFieldInterceptProxyAddress = new JTextField();
        textFieldInterceptProxyAddress.setToolTipText("Local address the intercept proxy server should listen on. Use it to configure proxy on your client. Requires extension reload.");
        panelAdvanced.add(textFieldInterceptProxyAddress, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labelBurpProxyAddress = new JLabel();
        labelBurpProxyAddress.setText("Burp proxy address:");
        panelAdvanced.add(labelBurpProxyAddress, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        textFieldBurpProxyAddress = new JTextField();
        textFieldBurpProxyAddress.setText("");
        panelAdvanced.add(textFieldBurpProxyAddress, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        buttonSaveAdvanced = new JButton();
        buttonSaveAdvanced.setHideActionText(false);
        buttonSaveAdvanced.setText("Save all settings");
        panelAdvanced.add(buttonSaveAdvanced, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panelAdvanced.add(panel2, new GridConstraints(6, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel2.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        checkBoxButtonUseInterceptedFingerprint = new JCheckBox();
        checkBoxButtonUseInterceptedFingerprint.setText("Use intercepted tls fingerprint");
        panelAdvanced.add(checkBoxButtonUseInterceptedFingerprint, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }
}
