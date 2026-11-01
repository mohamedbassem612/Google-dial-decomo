package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ral implements defpackage.qub {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ral(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.qub
    public final void c() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.rcm rcmVar = (defpackage.rcm) this.a;
            ((java.util.concurrent.atomic.AtomicBoolean) rcmVar.b).set(false);
            ((zpz) rcmVar.c).a(ajcm.a);
            return;
        }
        java.lang.Object obj = this.a;
        if (i == 1) {
            ((java.util.concurrent.atomic.AtomicBoolean) ((her) obj).a).set(true);
            return;
        }
        defpackage.rah rahVar = (defpackage.rah) obj;
        rahVar.g.i(ahvr.ag(rahVar.b, rahVar.f, new defpackage.pbw(rahVar, (aoln) null, 13)));
    }

    @Override // defpackage.qub
    public final void b(android.view.View view) {
    }
}
