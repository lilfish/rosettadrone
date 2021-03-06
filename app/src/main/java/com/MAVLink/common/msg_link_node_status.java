/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LINK_NODE_STATUS PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Status generated in each node in the communication chain and injected into MAVLink stream.
 */
public class msg_link_node_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LINK_NODE_STATUS = 8;
    public static final int MAVLINK_MSG_LENGTH = 36;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LINK_NODE_STATUS;


    /**
     * Timestamp (time since system boot).
     */
    public long timestamp;

    /**
     * Transmit rate
     */
    public long tx_rate;

    /**
     * Receive rate
     */
    public long rx_rate;

    /**
     * Messages sent
     */
    public long messages_sent;

    /**
     * Messages received (estimated from counting seq)
     */
    public long messages_received;

    /**
     * Messages lost (estimated from counting seq)
     */
    public long messages_lost;

    /**
     * Number of bytes that could not be parsed correctly.
     */
    public int rx_parse_err;

    /**
     * Transmit buffer overflows. This number wraps around as it reaches UINT16_MAX
     */
    public int tx_overflows;

    /**
     * Receive buffer overflows. This number wraps around as it reaches UINT16_MAX
     */
    public int rx_overflows;

    /**
     * Remaining free transmit buffer space
     */
    public short tx_buf;

    /**
     * Remaining free receive buffer space
     */
    public short rx_buf;


    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_LINK_NODE_STATUS;

        packet.payload.putUnsignedLong(timestamp);

        packet.payload.putUnsignedInt(tx_rate);

        packet.payload.putUnsignedInt(rx_rate);

        packet.payload.putUnsignedInt(messages_sent);

        packet.payload.putUnsignedInt(messages_received);

        packet.payload.putUnsignedInt(messages_lost);

        packet.payload.putUnsignedShort(rx_parse_err);

        packet.payload.putUnsignedShort(tx_overflows);

        packet.payload.putUnsignedShort(rx_overflows);

        packet.payload.putUnsignedByte(tx_buf);

        packet.payload.putUnsignedByte(rx_buf);

        return packet;
    }

    /**
     * Decode a link_node_status message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.timestamp = payload.getUnsignedLong();

        this.tx_rate = payload.getUnsignedInt();

        this.rx_rate = payload.getUnsignedInt();

        this.messages_sent = payload.getUnsignedInt();

        this.messages_received = payload.getUnsignedInt();

        this.messages_lost = payload.getUnsignedInt();

        this.rx_parse_err = payload.getUnsignedShort();

        this.tx_overflows = payload.getUnsignedShort();

        this.rx_overflows = payload.getUnsignedShort();

        this.tx_buf = payload.getUnsignedByte();

        this.rx_buf = payload.getUnsignedByte();

    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_link_node_status() {
        msgid = MAVLINK_MSG_ID_LINK_NODE_STATUS;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_link_node_status(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_LINK_NODE_STATUS;
        unpack(mavLinkPacket.payload);
    }


    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_LINK_NODE_STATUS - sysid:" + sysid + " compid:" + compid + " timestamp:" + timestamp + " tx_rate:" + tx_rate + " rx_rate:" + rx_rate + " messages_sent:" + messages_sent + " messages_received:" + messages_received + " messages_lost:" + messages_lost + " rx_parse_err:" + rx_parse_err + " tx_overflows:" + tx_overflows + " rx_overflows:" + rx_overflows + " tx_buf:" + tx_buf + " rx_buf:" + rx_buf + "";
    }
}
        