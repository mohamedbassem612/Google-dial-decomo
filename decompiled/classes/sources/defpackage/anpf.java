package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anpf extends defpackage.anpc {
    private final defpackage.anpg e;

    public anpf(java.lang.String str, boolean z, defpackage.anpg anpgVar) {
        super(str, z, anpgVar);
        defpackage.ahvr.bW(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        if (anpgVar == null) {
            throw new java.lang.NullPointerException("marshaller");
        }
        this.e = anpgVar;
    }

    @Override // defpackage.anpc
    public final java.lang.Object a(byte[] bArr) {
        return this.e.a(bArr);
    }

    @Override // defpackage.anpc
    public final byte[] b(java.lang.Object obj) {
        byte[] bArrB = this.e.b(obj);
        defpackage.ahvr.cj(bArrB, "null marshaller.toAsciiString()");
        return bArrB;
    }
}
