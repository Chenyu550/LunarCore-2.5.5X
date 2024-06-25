package emu.lunarcore.server.http.objects;

public class FingerprintResJson {
    public String message;
    public int retcode;
    public FingerprintDataJson data;

    public static class FingerprintDataJson {
        public String device_fp;
        public String msg; // 修改字段名为 msg
        public int code;

        public FingerprintDataJson(String fp) {
            this.code = 200;
            this.msg = "ok"; // 修改字段名为 msg
            this.device_fp = fp;
        }
    }
}
