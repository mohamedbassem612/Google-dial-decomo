package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzz implements defpackage.ahjd {
    private static final aimz b = aimz.i("com/android/dialer/sonic/impl/service/SonicGatewayHandler");
    public final ipc a;
    private final aaco c;
    private final tzc d;

    public tzz(ipc ipcVar, aaco aacoVar, tzc tzcVar) {
        this.a = ipcVar;
        this.c = aacoVar;
        this.d = tzcVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        aaco aacoVar = this.c;
        java.lang.Object obj = apjbVar.b;
        if (!aacoVar.b((java.lang.String) obj)) {
            throw new java.lang.SecurityException("Access not allowed for package: ".concat(java.lang.String.valueOf(obj)));
        }
        if (this.d.a()) {
            return new iwz(this, 10);
        }
        b.b().l("com/android/dialer/sonic/impl/service/SonicGatewayHandler", "getRedirector", 50, "SonicGatewayHandler.java").v("Cannot handle action. Sonic is not enabled.");
        return null;
    }
}
