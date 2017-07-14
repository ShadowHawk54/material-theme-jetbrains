package com.chrisrm.idea.actions;

import com.chrisrm.idea.themes.MTThemeManager;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;


public class MTDisableThemeAction extends AnAction {

  @Override
  public void actionPerformed(AnActionEvent e) {
    MTThemeManager.toggleMaterialTheme();
  }

}
