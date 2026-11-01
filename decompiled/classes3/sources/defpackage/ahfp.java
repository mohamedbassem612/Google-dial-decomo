package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahfp {
    private static final aimz c = aimz.i("com/google/apps/tiktok/inject/account/TikTokActivityAccountRetainedComponentManager");
    public final ahgd a;
    public final apjb b;

    public ahfp(apjb apjbVar, ahyn ahynVar, ahgd ahgdVar) {
        this.b = apjbVar;
        if (ahynVar.f()) {
            ahvr.bY(ahynVar.b() instanceof mp);
        }
        this.a = ahgdVar;
    }

    public final defpackage.ahfn a(com.google.apps.tiktok.account.AccountId accountId) {
        try {
            return (defpackage.ahfn) new eog(this.a, new defpackage.ahfo(this, accountId)).c("tt_activity_account_retained:".concat(java.lang.Integer.valueOf(((com.google.apps.tiktok.account.AutoValue_AccountId) accountId).a).toString()), defpackage.ahfn.class);
        } catch (java.lang.IllegalArgumentException e) {
            ahgd ahgdVar = this.a;
            c.c().k(e).l("com/google/apps/tiktok/inject/account/TikTokActivityAccountRetainedComponentManager", "getViewModel", 89, "TikTokActivityAccountRetainedComponentManager.java").I("Failed to get ViewModel for ActivityAccountRetained, fragmentHost: %s, lifecycle: %s", new aepg(ahgdVar instanceof ahgd ? ahgdVar.a.getClass() : ahgdVar.getClass()), new aepg(ahgdVar.P().a()));
            throw e;
        }
    }

    public final java.lang.Object b(com.google.apps.tiktok.account.AccountId accountId) {
        java.lang.Object obj;
        defpackage.ahfn ahfnVarA = a(accountId);
        synchronized (ahfnVarA.e) {
            if (ahfnVarA.f == null) {
                ahoq ahoqVarW = ahvr.W(1380, "ActAccRet#comp");
                try {
                    hhy hhyVarX = ((defpackage.ahfl) aooc.ar(ahfnVarA.g.B(ahfnVarA.b), defpackage.ahfl.class)).x();
                    hhyVarX.b = ahfnVarA.a;
                    amwx amwxVar = ahfnVarA.c;
                    aooc.ao(amwxVar);
                    hhyVarX.c = amwxVar;
                    hhyVarX.d = ahfnVarA.d;
                    aooc.an(hhyVarX.b, enr.class);
                    aooc.an(hhyVarX.c, amwx.class);
                    aooc.an(hhyVarX.d, amyl.class);
                    ahfnVarA.f = new hkf((him) hhyVarX.a, (hkr) hhyVarX.e);
                    ahoqVarW.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            obj = ahfnVarA.f;
        }
        return obj;
    }
}
