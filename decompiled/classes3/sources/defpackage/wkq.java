package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wkq implements defpackage.qub {
    private final /* synthetic */ int $cid;
    private final defpackage.ahdv a;

    public wkq(defpackage.ahdv ahdvVar, int i) {
        this.$cid = i;
        aooh.f(ahdvVar, "controller");
        this.a = ahdvVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aoss, java.lang.Object] */
    @Override // defpackage.qub
    public final void b(android.view.View view) {
        if (this.$cid != 0) {
            aooh.f(view, "view");
            defpackage.ahdv ahdvVar = this.a;
            ajcq ajcqVarF = aosv.F((aoss) ahdvVar.f, 0, new defpackage.wcj(ahdvVar, (aoln) null, 7, (int[]) null), 3);
            ((agsm) ahdvVar.a).g(ajcqVarF, 5L, java.util.concurrent.TimeUnit.SECONDS);
            return;
        }
        aooh.f(view, "view");
        defpackage.ahdv ahdvVar2 = this.a;
        ajcq ajcqVarF2 = aosv.F((aoss) ahdvVar2.f, 0, new defpackage.wcj(ahdvVar2, (aoln) null, 6, (short[]) null), 3);
        ((agsm) ahdvVar2.a).g(ajcqVarF2, 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    @Override // defpackage.qub
    public final void c() {
        int i = this.$cid;
        defpackage.ahdv ahdvVar = this.a;
        if (i != 0) {
            ahdvVar.d();
        } else {
            ahdvVar.d();
        }
    }

    public wkq(defpackage.ahdv ahdvVar, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(ahdvVar, "controller");
        this.a = ahdvVar;
    }
}
