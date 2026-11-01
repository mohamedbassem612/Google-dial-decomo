package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahtu implements defpackage.afam {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahtu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.afam
    public final void a() {
        if (this.$cid == 0) {
            ((defpackage.ahtt) this.a).a();
            return;
        }
        defpackage.afds afdsVar = new defpackage.afds(new defpackage.afdu());
        defpackage.ahcc ahccVar = new defpackage.ahcc((android.content.Context) this.a);
        synchronized (defpackage.afds.b) {
            if (defpackage.ahcc.c != null) {
                return;
            }
            defpackage.ahcc.c = ahccVar;
            if (defpackage.afds.e == null) {
                defpackage.afds.e = new defpackage.afdw(null);
            }
            if (java.security.Security.insertProviderAt(defpackage.afds.e, 1) != 1) {
                throw new java.lang.RuntimeException("Failed to install SslGuard with top priority.");
            }
            defpackage.afdv afdvVar = afdsVar.f;
            defpackage.afdv afdvVar2 = defpackage.afdy.a;
            if (afdvVar == null) {
                throw new java.lang.AssertionError("Cannot initialize SslGuardSocketFactory will null");
            }
            defpackage.afdy.a = afdvVar;
            defpackage.afdv afdvVar3 = afdsVar.f;
            defpackage.afdv afdvVar4 = defpackage.afdx.a;
            if (afdvVar3 == null) {
                throw new java.lang.AssertionError("Cannot initialize SslGuardSocketFactory will null");
            }
            defpackage.afdx.a = afdvVar3;
            java.security.Security.setProperty("ssl.SocketFactory.provider", defpackage.afds.c);
            java.security.Security.setProperty("ssl.ServerSocketFactory.provider", defpackage.afds.d);
            defpackage.afds.a();
            android.util.Log.i(defpackage.afds.a, "SslGuard completed installation.");
        }
    }
}
