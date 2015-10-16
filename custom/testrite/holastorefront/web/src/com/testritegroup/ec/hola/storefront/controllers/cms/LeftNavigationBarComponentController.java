/**
 *
 */
package com.testritegroup.ec.hola.storefront.controllers.cms;

import de.hybris.platform.acceleratorcms.enums.NavigationBarMenuLayout;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testritegroup.ec.core.model.cms2.components.LeftNavigationBarComponentModel;
import com.testritegroup.ec.hola.storefront.controllers.ControllerConstants;


/**
 * @author user
 *
 */
@Controller("LeftNavigationBarComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.LeftNavigationBarComponent)
public class LeftNavigationBarComponentController extends AbstractCMSComponentController<LeftNavigationBarComponentModel>
{

	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final LeftNavigationBarComponentModel component)
	{
		if (component.getDropDownLayout() != null)
		{
			model.addAttribute("dropDownLayout", component.getDropDownLayout().getCode().toLowerCase());
		}
		else if (component.getNavigationNode() != null && component.getNavigationNode().getChildren() != null
				&& !component.getNavigationNode().getChildren().isEmpty())
		{
			// Component has children but not drop down layout, default to auto
			model.addAttribute("dropDownLayout", NavigationBarMenuLayout.AUTO.getCode().toLowerCase());
		}
	}

}
