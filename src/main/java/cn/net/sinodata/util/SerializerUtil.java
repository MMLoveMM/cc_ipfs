package cn.net.sinodata.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.JavaSerializer;


/**
 * String 工具类
 * @author Pangpj
 *
 */
public class SerializerUtil {
	private final static Logger logger = LoggerFactory.getLogger(SerializerUtil.class);
	
	/**
	 * 序列化java对象
	 * @param obj
	 * @return
	 */
	public static <T> String serializationObject(T obj) {
        Kryo kryo = new Kryo();
        kryo.setReferences(false);
        kryo.register(obj.getClass(), new JavaSerializer());
 
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        Output output = new Output(baos);
        kryo.writeClassAndObject(output, obj);
        output.flush();
        output.close();
 
        byte[] b = baos.toByteArray();
        try {
            baos.flush();
            baos.close();
        } catch (IOException e) {
            logger.error("serialize java object error -object:{} - error message:", obj, e);
        }
        return new String(new Base64().encode(b));
    }
	
	/**
	 * 反序列化java对象
	 * @param obj
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T deserializationObject(String obj,
            Class<T> clazz) {
        Kryo kryo = new Kryo();
        kryo.setReferences(false);
        kryo.register(clazz, new JavaSerializer());
 
        ByteArrayInputStream bais = new ByteArrayInputStream(
                new Base64().decode(obj));
        Input input = new Input(bais);
        return (T) kryo.readClassAndObject(input);
    }
}
