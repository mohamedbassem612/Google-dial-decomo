package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anpa extends anpc {
    public anpa(java.lang.String str, ajsz ajszVar) {
        super(str, false, ajszVar);
        ahvr.bW(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        ahvr.bN(str.length() > 4, "empty key name");
        ahvr.cj(ajszVar, "marshaller is null");
    }

    public final byte[] b(java.lang.Object obj) {
        return (byte[]) obj;
    }

    public final java.lang.Object a(byte[] bArr) {
        return bArr;
    }
}
