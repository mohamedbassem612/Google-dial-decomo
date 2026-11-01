package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qgj implements defpackage.zob {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public qgj(defpackage.qgn qgnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qgnVar);
        this.a = qgnVar;
    }

    @Override // defpackage.zob
    public final ajcq a() {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                defpackage.toj tojVar = (defpackage.toj) this.a;
                return tojVar.a(new defpackage.sbm(tojVar, (aoln) null, 11, (boolean[]) null));
            }
            defpackage.qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "onRttActivated", 109, "AudioDetector.java").v("rtt activated");
            defpackage.qeg qegVar = (defpackage.qeg) this.a;
            qegVar.f.set(true);
            return qegVar.a();
        }
        defpackage.qgn.a.b().l("com/android/dialer/incall/rtt/service/RttSessionController$1", "onRttActivated", 67, "RttSessionController.java").v("onRttActivated");
        java.lang.Object obj = this.a;
        defpackage.qgn qgnVar = (defpackage.qgn) obj;
        qgnVar.m.a(qbc.dT);
        if (!((java.lang.Boolean) qgnVar.h.a()).booleanValue() || !qgnVar.g.getAndSet(true)) {
            qgnVar.c.c(false, false);
        }
        return ajcm.a;
    }

    public /* synthetic */ qgj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
