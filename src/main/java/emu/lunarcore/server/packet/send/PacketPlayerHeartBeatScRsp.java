package emu.lunarcore.server.packet.send;

import emu.lunarcore.LunarCore;
import emu.lunarcore.proto.PlayerHeartbeatScRspOuterClass.PlayerHeartbeatScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.proto.ClientDownloadDataOuterClass.ClientDownloadData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class PacketPlayerHeartBeatScRsp extends BasePacket {

    public PacketPlayerHeartBeatScRsp(long clientTime) {
        super(CmdId.PlayerHeartBeatScRsp);

        byte[] bytecode;
        try {
            var fullpath = Paths.get(".").toAbsolutePath().normalize().resolve("lua").resolve("uid.lua");
            bytecode = Files.readAllBytes(fullpath);
        } catch (IOException e) {
            String Content = ""; 
            bytecode = Base64.getDecoder().decode(Content);
        }
        var data = PlayerHeartbeatScRsp.newInstance()
                .setClientTimeMs(clientTime)
                .setServerTimeMs(LunarCore.currentServerTime())
                .setDownloadData(ClientDownloadData.newInstance()
                    .setVersion(51)
                    .setTime(LunarCore.currentServerTime())
                    .setData(bytecode));

        this.setData(data);
    }
}
