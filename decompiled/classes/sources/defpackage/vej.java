package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vej {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/sms/AdnMessageParser");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("\"([^\"]*)\"");
    public final defpackage.ajct c;

    public vej(defpackage.ajct ajctVar) {
        this.c = ajctVar;
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(str));
        defpackage.ahvr.bM(!android.text.TextUtils.isEmpty(str2));
        byte[] bytes = str2.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        byte[] bytes2 = "luckytechnologycompany".getBytes(java.nio.charset.StandardCharsets.US_ASCII);
        for (int i = 0; i < bytes.length && i < bytes2.length; i++) {
            byte b2 = bytes[i];
            byte b3 = bytes2[i];
            if (b2 != b3) {
                byte b4 = (byte) (b2 ^ b3);
                bytes[i] = b4;
                byte b5 = (byte) (b4 | 96);
                bytes[i] = b5;
                bytes[i] = (byte) (b5 & 111);
            }
        }
        byte[] bArrDecode = android.util.Base64.decode(str, 0);
        for (int i2 = 0; i2 < bArrDecode.length && i2 < bytes.length; i2++) {
            byte b6 = bArrDecode[i2];
            byte b7 = bytes[i2];
            if (b6 != b7) {
                bArrDecode[i2] = (byte) (b6 ^ b7);
            }
        }
        return defpackage.akzc.u(bArrDecode).z(java.nio.charset.StandardCharsets.US_ASCII);
    }
}
