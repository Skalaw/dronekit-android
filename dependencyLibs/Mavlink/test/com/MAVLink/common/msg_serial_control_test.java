/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */
         
// MESSAGE SERIAL_CONTROL PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Parser;
import com.MAVLink.ardupilotmega.CRC;
import java.nio.ByteBuffer;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
* Control a serial port. This can be used for raw access to an onboard serial peripheral such as a GPS or telemetry radio. It is designed to make it possible to update the devices firmware via MAVLink messages or change the devices settings. A message with zero bytes can be used to change just the baudrate.
*/
public class msg_serial_control_test{

public static final int MAVLINK_MSG_ID_SERIAL_CONTROL = 126;
public static final int MAVLINK_MSG_LENGTH = 79;
private static final long serialVersionUID = MAVLINK_MSG_ID_SERIAL_CONTROL;

private Parser parser = new Parser();

public CRC generateCRC(byte[] packet){
    CRC crc = new CRC();
    for (int i = 1; i < packet.length - 2; i++) {
        crc.update_checksum(packet[i] & 0xFF);
    }
    crc.finish_checksum(MAVLINK_MSG_ID_SERIAL_CONTROL);
    return crc;
}

public byte[] generateTestPacket(){
    ByteBuffer payload = ByteBuffer.allocate(6 + MAVLINK_MSG_LENGTH + 2);
    payload.put((byte)MAVLinkPacket.MAVLINK_STX); //stx
    payload.put((byte)MAVLINK_MSG_LENGTH); //len
    payload.put((byte)0); //seq
    payload.put((byte)255); //sysid
    payload.put((byte)190); //comp id
    payload.put((byte)MAVLINK_MSG_ID_SERIAL_CONTROL); //msg id
    payload.putInt((int)963497464); //baudrate
    payload.putShort((short)17443); //timeout
    payload.put((byte)151); //device
    payload.put((byte)218); //flags
    payload.put((byte)29); //count
    //data
    payload.put((byte)96);
    payload.put((byte)97);
    payload.put((byte)98);
    payload.put((byte)99);
    payload.put((byte)100);
    payload.put((byte)101);
    payload.put((byte)102);
    payload.put((byte)103);
    payload.put((byte)104);
    payload.put((byte)105);
    payload.put((byte)106);
    payload.put((byte)107);
    payload.put((byte)108);
    payload.put((byte)109);
    payload.put((byte)110);
    payload.put((byte)111);
    payload.put((byte)112);
    payload.put((byte)113);
    payload.put((byte)114);
    payload.put((byte)115);
    payload.put((byte)116);
    payload.put((byte)117);
    payload.put((byte)118);
    payload.put((byte)119);
    payload.put((byte)120);
    payload.put((byte)121);
    payload.put((byte)122);
    payload.put((byte)123);
    payload.put((byte)124);
    payload.put((byte)125);
    payload.put((byte)126);
    payload.put((byte)127);
    payload.put((byte)128);
    payload.put((byte)129);
    payload.put((byte)130);
    payload.put((byte)131);
    payload.put((byte)132);
    payload.put((byte)133);
    payload.put((byte)134);
    payload.put((byte)135);
    payload.put((byte)136);
    payload.put((byte)137);
    payload.put((byte)138);
    payload.put((byte)139);
    payload.put((byte)140);
    payload.put((byte)141);
    payload.put((byte)142);
    payload.put((byte)143);
    payload.put((byte)144);
    payload.put((byte)145);
    payload.put((byte)146);
    payload.put((byte)147);
    payload.put((byte)148);
    payload.put((byte)149);
    payload.put((byte)150);
    payload.put((byte)151);
    payload.put((byte)152);
    payload.put((byte)153);
    payload.put((byte)154);
    payload.put((byte)155);
    payload.put((byte)156);
    payload.put((byte)157);
    payload.put((byte)158);
    payload.put((byte)159);
    payload.put((byte)160);
    payload.put((byte)161);
    payload.put((byte)162);
    payload.put((byte)163);
    payload.put((byte)164);
    payload.put((byte)165);
    
    CRC crc = generateCRC(payload.array());
    payload.put((byte)crc.getLSB());
    payload.put((byte)crc.getMSB());
    return payload.array();
}

@Test
public void test(){
    byte[] packet = generateTestPacket();
    for(int i = 0; i < packet.length - 1; i++){
        parser.mavlink_parse_char(packet[i] & 0xFF);
    }
    MAVLinkPacket m = parser.mavlink_parse_char(packet[packet.length - 1] & 0xFF);
    byte[] processedPacket = m.encodePacket();
    assertArrayEquals("msg_serial_control", processedPacket, packet);
}
}
        