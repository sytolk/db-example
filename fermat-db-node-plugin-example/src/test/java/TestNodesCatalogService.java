import com.bitdubai.fermat.db.sqlite.generated.tables.pojos.NodesCatalog;
import com.bitdubai.fermat.node.db.service.NodesCatalogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by stanimir on 07.04.16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring-servlet.xml"})
public class TestNodesCatalogService { //implements ApplicationContextAware {

    @Autowired
    private NodesCatalogService nodesCatalogService;

    @Test
    public void insert() {
        NodesCatalog nodesCatalog = new NodesCatalog();
        nodesCatalog.setIdentityPublicKey("mykey" + Math.random());
        nodesCatalog.setName("testNode"+ Math.random());
        nodesCatalog.setIp("192.168.1.1");
        nodesCatalog.setDefaultPort(8080);
        nodesCatalog.setLatitude((float) 42.34556);
        nodesCatalog.setLongitude((float) 27.54556);
        nodesCatalog.setRegisteredTimestamp((int) (System.currentTimeMillis() / 1000L)); //seconds precision only todo rethink this

        nodesCatalogService.insert(nodesCatalog);
    }
}