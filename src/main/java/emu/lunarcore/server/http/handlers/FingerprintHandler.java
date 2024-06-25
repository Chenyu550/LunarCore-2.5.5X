package emu.lunarcore.server.http.handlers;

import org.jetbrains.annotations.NotNull;

import emu.lunarcore.server.http.objects.FingerprintReqJson;
import emu.lunarcore.server.http.objects.FingerprintResJson;
import emu.lunarcore.server.http.objects.FingerprintResJson.FingerprintDataJson;
import emu.lunarcore.util.JsonUtils;
import io.javalin.http.ContentType;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class FingerprintHandler implements Handler {

    @Override
    public void handle(@NotNull Context ctx) throws Exception {
        FingerprintResJson res = new FingerprintResJson();

        FingerprintReqJson req = JsonUtils.decode(ctx.body(), FingerprintReqJson.class);

        // 检查请求体是否成功解析
        if (req == null) {
            res.retcode = -202; // 或其他适当的错误代码
            res.message = "Error";
        } else {
            // 设置成功响应
            res.retcode = 0; // 成功的 retcode
            res.message = "OK";
            res.data = new FingerprintResJson.FingerprintDataJson(req.device_fp);
        }

        // 设置响应类型并返回结果
        ctx.contentType(ContentType.APPLICATION_JSON);
        ctx.result(JsonUtils.encode(res));
    }
}
