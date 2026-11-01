package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agpt {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/account/data/google/GmsAccounts");
    public final defpackage.ajct b;
    public final defpackage.ajct c;
    public final defpackage.aemh d;
    public final defpackage.zxk e;
    public final defpackage.aoin f;
    public final defpackage.zwr g;

    public agpt(defpackage.zwr zwrVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aemh aemhVar, defpackage.zxk zxkVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(ajctVar, "blockingExecutor");
        defpackage.aooh.f(ajctVar2, "lightweightExecutor");
        defpackage.aooh.f(aemhVar, "googleOwnersProvider");
        defpackage.aooh.f(aoinVar, "omitDuplicateGaiaIdInvalidAccountsProvider");
        this.g = zwrVar;
        this.b = ajctVar;
        this.c = ajctVar2;
        this.d = aemhVar;
        this.e = zxkVar;
        this.f = aoinVar;
    }

    public final defpackage.ajcq a(java.lang.String str) throws java.io.IOException {
        defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1295, "GmsAccounts.getAccountId");
        try {
            defpackage.ajas ajasVarB = defpackage.ahqx.b(new adck(this, str, 10, (byte[]) null));
            defpackage.ajct ajctVar = this.b;
            defpackage.ajcq ajcqVarG = defpackage.aizu.g(defpackage.aiql.E(ajasVarB, ajctVar), defpackage.zwj.class, defpackage.ahqx.c(new adot(this, str, 13)), ajctVar);
            ahoqVarW.a(ajcqVarG);
            defpackage.ajsz.ak(ahoqVarW, null);
            return ajcqVarG;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }
}
