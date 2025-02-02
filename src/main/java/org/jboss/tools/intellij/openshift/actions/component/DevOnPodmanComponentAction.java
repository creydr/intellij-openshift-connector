/*******************************************************************************
 * Copyright (c) 2023 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.intellij.openshift.actions.component;

import org.jboss.tools.intellij.openshift.utils.odo.Component;
import org.jboss.tools.intellij.openshift.utils.odo.ComponentFeature;

public class DevOnPodmanComponentAction extends FeatureComponentAction {

    public DevOnPodmanComponentAction() {
        super(ComponentFeature.DEV_ON_PODMAN);
    }

    @Override
    protected boolean needCustomizedPresentation() {
        return true;
    }

    @Override
    protected String getCustomizedPresentation(Component component) {
        if (component.getLiveFeatures().is(ComponentFeature.DEV_ON_PODMAN)) {
            return "Stop " + getActionName();
        } else {
            return "Start " + getActionName();
        }
    }

}
