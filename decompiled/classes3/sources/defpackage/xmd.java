package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xmd extends defpackage.xkq {
    private final aoir e = aooc.ag(new defpackage.wsn(this, 12));
    private final aoir f = aooc.ag(new defpackage.wsn(this, 13));
    private final aoir g = aooc.ag(new defpackage.wsn(this, 14));
    private final aoir h = aooc.ag(new defpackage.wsn(this, 15));
    public final aoir b = aooc.ag(new defpackage.wsn(this, 16));
    private final aoir i = aooc.ag(new defpackage.wsn(this, 17));
    public final defpackage.xhf d = new defpackage.xmc(0);
    private final defpackage.xhf j = new defpackage.xks(this, 3);
    private final defpackage.xhf k = new defpackage.xks(this, 2);

    @Override // defpackage.xhh
    public final defpackage.xhf a() {
        return this.d;
    }

    @Override // defpackage.xkd
    public final j$.time.Duration b() {
        return (j$.time.Duration) this.i.a();
    }

    @Override // defpackage.xkq
    public final boolean c(defpackage.xfz xfzVar) {
        aooh.f(xfzVar, "reason");
        return ajsz.cY((defpackage.xfz[]) this.f.a(), xfzVar);
    }

    public final com.android.onboarding.contracts.annotations.OnboardingNode d() {
        return (com.android.onboarding.contracts.annotations.OnboardingNode) this.e.a();
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return (java.lang.String) this.g.a();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return (java.lang.String) this.h.a();
    }

    @Override // defpackage.xhi
    public final defpackage.xhf getResultDecoder() {
        return this.k;
    }

    @Override // defpackage.xhj
    public final defpackage.xhf getResultEncoder() {
        return this.j;
    }

    public final java.lang.String toString() {
        return "OnboardingTaskContract(" + defpackage.xfc.b(this) + ')';
    }
}
