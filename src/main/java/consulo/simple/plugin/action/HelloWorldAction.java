package consulo.simple.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import consulo.simple.plugin.localize.SimpleLocalize;
import consulo.ui.Alerts;
import consulo.ui.annotation.RequiredUIAccess;

import javax.annotation.Nonnull;

/**
 * @author VISTALL
 * @since 2020-10-29
 */
public class HelloWorldAction extends AnAction
{
	@RequiredUIAccess
	@Override
	public void actionPerformed(@Nonnull AnActionEvent anActionEvent)
	{
		Alerts.okInfo(SimpleLocalize.SimpleHelloWorldMessage().get()).showAsync();
	}
}
