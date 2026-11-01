package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aamy {
    private static final java.security.SecureRandom a = new java.security.SecureRandom();

    public static java.lang.String a() {
        byte[] bArr = new byte[16];
        a.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 11);
    }
}
