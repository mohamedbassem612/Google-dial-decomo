package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xyw implements defpackage.xvb {
    private final java.lang.String a;
    private java.lang.Object b;

    public xyw(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // defpackage.xvb
    public final void e() {
        try {
            ((java.io.InputStream) this.b).close();
        } catch (java.io.IOException unused) {
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        try {
            java.lang.String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new java.lang.IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new java.lang.IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new java.lang.IllegalArgumentException("Not a base64 image data URL.");
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(android.util.Base64.decode(str.substring(iIndexOf + 1), 0));
            this.b = byteArrayInputStream;
            xvaVar.c(byteArrayInputStream);
        } catch (java.lang.IllegalArgumentException e) {
            xvaVar.f(e);
        }
    }

    @Override // defpackage.xvb
    public final void d() {
    }
}
