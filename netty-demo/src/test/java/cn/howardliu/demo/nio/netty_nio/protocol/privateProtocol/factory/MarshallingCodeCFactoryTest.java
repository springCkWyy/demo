package cn.howardliu.demo.nio.netty_nio.protocol.privateProtocol.factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * <br>created at 17-4-18
 *
 * @author liuxh
 * @version 1.0.0
 * @since 1.0.0
 */
public class MarshallingCodeCFactoryTest {

    @Test
    public void testDecoder() throws Exception {
        assertNotNull(MarshallingCodeCFactory.decoder());
    }

    @Test
    public void testEncoder() throws Exception {
        assertNotNull(MarshallingCodeCFactory.encoder());
    }
}