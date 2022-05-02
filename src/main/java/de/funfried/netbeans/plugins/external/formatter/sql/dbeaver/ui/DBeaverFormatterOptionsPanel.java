/*
 * Copyright (c) 2021 bahlef.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * Contributors:
 * bahlef - initial API and implementation and/or initial documentation
 */
package de.funfried.netbeans.plugins.external.formatter.sql.dbeaver.ui;

import java.util.prefs.Preferences;

import javax.swing.SpinnerNumberModel;

import org.netbeans.api.project.Project;

import de.funfried.netbeans.plugins.external.formatter.sql.dbeaver.DBeaverFormatterSettings;
import de.funfried.netbeans.plugins.external.formatter.ui.options.AbstractFormatterOptionsPanel;

/**
 *
 * @author bahlef
 */
public class DBeaverFormatterOptionsPanel extends AbstractFormatterOptionsPanel {
	private static final long serialVersionUID = -7567475629479033730L;

	/**
	 * Creates new form {@link DBeaverFormatterOptionsPanel}.
	 *
	 * @param project the {@link Project} if the panel is used to modify project
	 *        specific settings, otherwise {@code null}
	 */
	public DBeaverFormatterOptionsPanel(Project project) {
		super(project);

		initComponents();
	}

	/**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spellingLbl = new javax.swing.JLabel();
        keywordsLbl = new javax.swing.JLabel();
        keywordsCmbBox = new javax.swing.JComboBox<>();
        dialectLbl = new javax.swing.JLabel();
        statementDelimiterLbl = new javax.swing.JLabel();
        statementDelimiterTxtFld = new javax.swing.JTextField();
        indentWidthLbl = new javax.swing.JLabel();
        indentWidthSpnr = new javax.swing.JSpinner();
        positioningLbl = new javax.swing.JLabel();
        expandTabsToSpacesChkBox = new javax.swing.JCheckBox();

        spellingLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(spellingLbl, org.openide.util.NbBundle.getMessage(DBeaverFormatterOptionsPanel.class, "DBeaverFormatterOptionsPanel.spellingLbl.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(keywordsLbl, org.openide.util.NbBundle.getMessage(DBeaverFormatterOptionsPanel.class, "DBeaverFormatterOptionsPanel.keywordsLbl.text")); // NOI18N

        keywordsCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPPER", "LOWER", "ORIGINAL" }));
        keywordsCmbBox.setSelectedItem(DBeaverFormatterSettings.KEYWORD_CASE_DEFAULT);

        dialectLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(dialectLbl, org.openide.util.NbBundle.getMessage(DBeaverFormatterOptionsPanel.class, "DBeaverFormatterOptionsPanel.dialectLbl.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(statementDelimiterLbl, org.openide.util.NbBundle.getMessage(DBeaverFormatterOptionsPanel.class, "DBeaverFormatterOptionsPanel.statementDelimiterLbl.text")); // NOI18N

        statementDelimiterTxtFld.setText(DBeaverFormatterSettings.STATEMENT_DELIMITER_DEFAULT);

        org.openide.awt.Mnemonics.setLocalizedText(indentWidthLbl, org.openide.util.NbBundle.getMessage(DBeaverFormatterOptionsPanel.class, "DBeaverFormatterOptionsPanel.indentWidthLbl.text")); // NOI18N

        indentWidthSpnr.setModel(new SpinnerNumberModel(DBeaverFormatterSettings.INDENT_SIZE_DEFAULT, 1, 24, 1));

        positioningLbl.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(positioningLbl, org.openide.util.NbBundle.getMessage(DBeaverFormatterOptionsPanel.class, "DBeaverFormatterOptionsPanel.positioningLbl.text")); // NOI18N

        expandTabsToSpacesChkBox.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(expandTabsToSpacesChkBox, org.openide.util.NbBundle.getMessage(DBeaverFormatterOptionsPanel.class, "DBeaverFormatterOptionsPanel.expandTabsToSpacesChkBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spellingLbl)
                            .addComponent(positioningLbl))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dialectLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(statementDelimiterLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(statementDelimiterTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(indentWidthLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(indentWidthSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(expandTabsToSpacesChkBox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(keywordsLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(keywordsCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spellingLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keywordsLbl)
                    .addComponent(keywordsCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(positioningLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indentWidthLbl)
                    .addComponent(indentWidthSpnr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expandTabsToSpacesChkBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dialectLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statementDelimiterLbl)
                    .addComponent(statementDelimiterTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dialectLbl;
    private javax.swing.JCheckBox expandTabsToSpacesChkBox;
    private javax.swing.JLabel indentWidthLbl;
    private javax.swing.JSpinner indentWidthSpnr;
    private javax.swing.JComboBox<String> keywordsCmbBox;
    private javax.swing.JLabel keywordsLbl;
    private javax.swing.JLabel positioningLbl;
    private javax.swing.JLabel spellingLbl;
    private javax.swing.JLabel statementDelimiterLbl;
    private javax.swing.JTextField statementDelimiterTxtFld;
    // End of variables declaration//GEN-END:variables

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void load(Preferences preferences) {
		keywordsCmbBox.setSelectedItem(preferences.get(DBeaverFormatterSettings.KEYWORD_CASE, DBeaverFormatterSettings.KEYWORD_CASE_DEFAULT));
		indentWidthSpnr.setValue(preferences.getInt(DBeaverFormatterSettings.INDENT_SIZE, DBeaverFormatterSettings.INDENT_SIZE_DEFAULT));
		expandTabsToSpacesChkBox.setSelected("space".equals(preferences.get(DBeaverFormatterSettings.INDENT_TYPE, DBeaverFormatterSettings.INDENT_TYPE_DEFAULT)));
		statementDelimiterTxtFld.setText(preferences.get(DBeaverFormatterSettings.STATEMENT_DELIMITER, DBeaverFormatterSettings.STATEMENT_DELIMITER_DEFAULT));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void store(Preferences preferences) {
		preferences.put(DBeaverFormatterSettings.KEYWORD_CASE, String.valueOf(keywordsCmbBox.getSelectedItem()));
		preferences.putInt(DBeaverFormatterSettings.INDENT_SIZE, Integer.parseInt(String.valueOf(indentWidthSpnr.getValue())));
		preferences.put(DBeaverFormatterSettings.INDENT_TYPE, expandTabsToSpacesChkBox.isSelected() ? "space" : "tab");
		preferences.put(DBeaverFormatterSettings.STATEMENT_DELIMITER, statementDelimiterTxtFld.getText());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean valid() {
		return true;
	}
}
