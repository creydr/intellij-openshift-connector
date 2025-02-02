/*******************************************************************************
 * Copyright (c) 2020 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.intellij.openshift.validation;

import com.intellij.testFramework.fixtures.BasePlatformTestCase;
import org.jetbrains.yaml.schema.YamlJsonSchemaHighlightingInspection;


public class DevfileSchemasTest extends BasePlatformTestCase {

    public void testQuarkusDevfile() {
        myFixture.setTestDataPath("src/test/resources");
        myFixture.enableInspections(YamlJsonSchemaHighlightingInspection.class);
        myFixture.configureByFile("devfiles/java-quarkus.yaml");
        myFixture.checkHighlighting();
    }

}
