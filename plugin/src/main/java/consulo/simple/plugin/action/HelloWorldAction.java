package consulo.simple.plugin.action;

import consulo.annotation.component.ActionImpl;
import consulo.annotation.component.ActionParentRef;
import consulo.annotation.component.ActionRef;
import consulo.simple.plugin.icon.SimplePluginIconGroup;
import consulo.ui.Alerts;
import consulo.ui.annotation.RequiredUIAccess;
import consulo.ui.ex.action.AnAction;
import consulo.ui.ex.action.AnActionEvent;
import consulo.ui.image.Image;
import consulo.simple.plugin.localize.SimpleLocalize;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * @author VISTALL
 * @since 2020-10-29
 */
@ActionImpl(id = "SimpleHelloWorld", parents =
{
	@ActionParentRef(@ActionRef(id = "ToolsMenu"))
})
public class HelloWorldAction extends AnAction
{
	@Nullable
	@Override
	protected Image getTemplateIcon()
	{
		return SimplePluginIconGroup.plugin();
	}

	@RequiredUIAccess
	@Override
	public void actionPerformed(@Nonnull AnActionEvent e)
	{
		Alerts.okInfo(SimpleLocalize.simplehelloworldMessage()).showAsync();
	}
}
