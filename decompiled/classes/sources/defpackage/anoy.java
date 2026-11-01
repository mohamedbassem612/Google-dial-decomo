package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anoy extends defpackage.anpc {
    private final defpackage.anoz e;

    public anoy(java.lang.String str, defpackage.anoz anozVar) {
        super(str, false, anozVar);
        defpackage.ahvr.bW(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        if (anozVar == null) {
            throw new java.lang.NullPointerException("marshaller");
        }
        this.e = anozVar;
    }

    @Override // defpackage.anpc
    public final java.lang.Object a(byte[] bArr) {
        return this.e.a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.US_ASCII));
    }

    @Override // defpackage.anpc
    public final byte[] b(java.lang.Object obj) {
        return this.e.b(obj).getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    }
}
