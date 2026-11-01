package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wil implements oqb {
    public final defpackage.wpx a;
    private final ajct b;

    public wil(ajct ajctVar, defpackage.wpx wpxVar) {
        aooh.f(ajctVar, "lightweightExecutor");
        this.b = ajctVar;
        this.a = wpxVar;
    }

    public final defpackage.acky a(defpackage.aclc aclcVar) {
        android.content.Intent intent = (android.content.Intent) aclcVar.a.get(defpackage.ackw.b);
        if (intent == null || !aooh.n("com.android.dialer.xatu.impl.growthkit.ACTION_SHOW_SETTINGS", intent.getAction())) {
            return null;
        }
        ajcq ajcqVarB = this.a.b();
        final lwl lwlVar = new lwl(this, 15);
        final int i = 0;
        agsm.i(1058, ahvr.H(ajcqVarB, new ahyc() { // from class: wik
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                int i2 = i;
                aonj aonjVar = lwlVar;
                if (i2 != 0) {
                    return aonjVar.a(obj);
                }
                aonjVar.a(obj);
                return null;
            }
        }, this.b), "failed to check/set Xatu enrollment status", new java.lang.Object[0]);
        return new defpackage.acky(true, 1);
    }

    public final /* synthetic */ void b(int i, defpackage.ackw ackwVar) {
    }
}
