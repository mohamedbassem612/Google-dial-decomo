package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ura {
    private static final aimz a = aimz.i("com/android/dialer/telecom/call/TelecomCallUtil");

    public static android.net.Uri a(android.telecom.Call.Details details) {
        if (details.getGatewayInfo() == null || details.getGatewayInfo().getOriginalAddress() == null) {
            return details.getHandle();
        }
        hgb.c(a.b(), "Returning handle from GatewayInfo instead of the call handle. This is a redirected call.", "com/android/dialer/telecom/call/TelecomCallUtil", "getHandle", '`', "TelecomCallUtil.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        return details.getGatewayInfo().getOriginalAddress();
    }

    public static java.lang.String b(android.telecom.Call.Details details) {
        if (details != null) {
            if (details.getGatewayInfo() != null) {
                hgb.c(a.b(), "Returning number from GatewayInfo instead of the call handle. This is a redirected call.", "com/android/dialer/telecom/call/TelecomCallUtil", "getNumber", 'A', "TelecomCallUtil.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                return details.getGatewayInfo().getOriginalAddress().getSchemeSpecificPart();
            }
            android.net.Uri handle = details.getHandle();
            if (handle != null) {
                return handle.getSchemeSpecificPart();
            }
        }
        return null;
    }

    public static java.lang.String c(android.telecom.Call call) {
        if (call == null) {
            return null;
        }
        return b(call.getDetails());
    }
}
