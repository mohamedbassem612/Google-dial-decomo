package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yst implements defpackage.yml {
    final /* synthetic */ defpackage.ysd a;
    final /* synthetic */ defpackage.ysu b;
    private final ahda c = new ahda();

    public yst(defpackage.ysd ysdVar, defpackage.ysu ysuVar) {
        this.a = ysdVar;
        this.b = ysuVar;
    }

    private final void f(aonj aonjVar) {
        defpackage.ysu ysuVar = this.b;
        agsm.i(1184, this.c.h(ahqx.b(new defpackage.wwg(ysuVar, aonjVar, 9, null)), ysuVar.a), "Failed to notify listeners", new java.lang.Object[0]);
    }

    @Override // defpackage.yml
    public final void a(defpackage.ymk ymkVar) {
        aooh.f(ymkVar, "aiFeature");
        f(new defpackage.wbi(this.a, (aoln) null, 6));
    }

    @Override // defpackage.yml
    public final void b(defpackage.ymk ymkVar, defpackage.ymi ymiVar) {
        aooh.f(ymkVar, "aiFeature");
        f(new nhv(this.a, ymiVar, (aoln) null, 10));
    }

    @Override // defpackage.yml
    public final void c(defpackage.ymk ymkVar, int i, defpackage.ymi ymiVar) {
        aooh.f(ymkVar, "aiFeature");
        f(new defpackage.ysr(this.a, i, ymiVar, null));
    }

    @Override // defpackage.yml
    public final void d(defpackage.ymk ymkVar, long j) {
        aooh.f(ymkVar, "aiFeature");
        f(new defpackage.yss(this.a, j, null, 1, null));
    }

    @Override // defpackage.yml
    public final void e(defpackage.ymk ymkVar, long j) {
        aooh.f(ymkVar, "aiFeature");
        f(new defpackage.yss(this.a, j, (aoln) null, 0));
    }
}
