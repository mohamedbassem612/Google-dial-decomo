package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aogd extends defpackage.aogh {
    private final defpackage.aogc d;
    private final defpackage.aogc e;
    private final defpackage.aogc f;
    private final defpackage.aogc g;
    private final int h;

    public aogd(defpackage.aogc aogcVar, defpackage.aogc aogcVar2, defpackage.aogc aogcVar3, defpackage.aogc aogcVar4, java.security.Provider provider, int i) {
        super(provider);
        this.d = aogcVar;
        this.e = aogcVar2;
        this.f = aogcVar3;
        this.g = aogcVar4;
        this.h = i;
    }

    @Override // defpackage.aogh
    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        byte[] bArr;
        defpackage.aogc aogcVar = this.f;
        if (!aogcVar.b(sSLSocket) || (bArr = (byte[]) aogcVar.a(sSLSocket, new java.lang.Object[0])) == null) {
            return null;
        }
        return new java.lang.String(bArr, aogk.b);
    }

    @Override // defpackage.aogh
    public final void b(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list) {
        if (str != null) {
            this.d.c(sSLSocket, java.lang.Boolean.TRUE);
            this.e.c(sSLSocket, str);
        }
        defpackage.aogc aogcVar = this.g;
        if (aogcVar.b(sSLSocket)) {
            aogcVar.a(sSLSocket, e(list));
        }
    }

    @Override // defpackage.aogh
    public final int c() {
        return this.h;
    }
}
