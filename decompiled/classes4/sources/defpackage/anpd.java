package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anpd extends anpc {
    private final defpackage.anpb e;

    public anpd(java.lang.String str, defpackage.anpb anpbVar) {
        super(str, false, anpbVar);
        ahvr.bW(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        ahvr.bN(str.length() > 4, "empty key name");
        this.e = anpbVar;
    }

    public final java.lang.Object a(byte[] bArr) {
        return this.e.b(new java.io.ByteArrayInputStream(bArr));
    }

    public final byte[] b(java.lang.Object obj) {
        return anph.k(this.e.a(obj));
    }

    public final boolean c() {
        return true;
    }
}
