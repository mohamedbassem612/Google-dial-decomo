package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahja implements defpackage.agnu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ahja(afsq afsqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(afsqVar);
        this.a = afsqVar;
    }

    @Override // defpackage.agnu
    public final void c() {
        if (this.$cid == 0) {
            throw null;
        }
    }

    @Override // defpackage.agnu
    public final void d(xtq xtqVar) {
        if (this.$cid == 0) {
            throw null;
        }
        ahoq ahoqVarX = ahvr.X(1343, "AccountChanged: UserConfigurationCommitter.commitOnAccountChange", ahot.a, true);
        java.lang.Object obj = ((xtq) xtqVar.a).a;
        java.lang.Object obj2 = this.a;
        try {
            aooh.c(obj);
            aooh.f(obj, "accountId");
            ajcq ajcqVarE = ((defpackage.ahdr) obj2).d.e(ahqx.b(new defpackage.adck(obj, obj2, 15, null)), ajbm.a);
            aooh.e(ajcqVarE, "submitAsync(...)");
            ahoqVarX.a(ajcqVarE);
            ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
            agsm.i(1344, ajcqVarE, "Failed to commit to configuration for account %s", new java.lang.Object[]{obj});
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarX, th);
                throw th2;
            }
        }
    }

    public ahja(defpackage.ahdr ahdrVar, int i) {
        this.$cid = i;
        this.a = ahdrVar;
    }

    @Override // defpackage.agnu
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.agnu
    public final /* synthetic */ void b() {
    }
}
