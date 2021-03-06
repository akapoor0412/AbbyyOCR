package org.alfresco.eisenvault.test;


import org.alfresco.repo.security.authentication.AuthenticationUtil;
import org.alfresco.service.cmr.repository.NodeService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tradeshift.test.remote.Remote;
import com.tradeshift.test.remote.RemoteTestRunner;

/**
 * A simple class demonstrating how to run out-of-container tests 
 * loading Alfresco application context.
 * 
 * This class uses the RemoteTestRunner to try and connect to 
 * localhost:4578 and send the test name and method to be executed on 
 * a running Alfresco. One or more hostnames can be configured in the @Remote
 * annotation.
 * 
 * If there is no available remote server to run the test, it falls 
 * back on local running of JUnits.
 * 
 * For proper functioning the test class file must match exactly 
 * the one deployed in the webapp (either via JRebel or static deployment)
 * otherwise "incompatible magic value XXXXX" class error loading issues will arise.  
 * 
 * @author Gabriele Columbro 
 * @author Maurizio Pillitu
 *
 

@RunWith(RemoteTestRunner.class)
@Remote(runnerClass=SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:alfresco/application-context.xml")
public class EvExtensionTest {
    
    private static final String ADMIN_USER_NAME = "admin";

    static Logger log = Logger.getLogger(EvExtensionTest.class);

    @Autowired
    @Qualifier("NodeService")
    protected NodeService nodeService;
    
    @Test
    public void testWiring() {
        //assertNotNull(demoComponent);
    }
    
    @Test
    public void testGetCompanyHome() {
    	AuthenticationUtil.setFullyAuthenticatedUser(ADMIN_USER_NAME);
        //NodeRef companyHome = demoComponent.getCompanyHome();
        //assertNotNull(companyHome);
        //String companyHomeName = (String) nodeService.getProperty(companyHome, ContentModel.PROP_NAME);
        //assertNotNull(companyHomeName);
        //assertEquals("Company Home", companyHomeName);
    }

}

*/