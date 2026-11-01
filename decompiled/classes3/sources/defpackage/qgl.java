package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qgl implements defpackage.zoc {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public qgl(defpackage.qgn qgnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qgnVar);
        this.a = qgnVar;
    }

    @Override // defpackage.zoc
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.qgn qgnVar = (defpackage.qgn) this.a;
            return ahvr.I(((defpackage.qgm) aooc.ar(((defpackage.afpl) qgnVar.e.a()).Y(), defpackage.qgm.class)).aM(), new defpackage.qfc(this, 8), qgnVar.d);
        }
        if (i != 1) {
            defpackage.toj tojVar = (defpackage.toj) this.a;
            return tojVar.a(new defpackage.sbm(tojVar, (aoln) null, 12, (float[]) null));
        }
        defpackage.qeg.a.b().l("com/android/dialer/incall/rtt/audiodetector/impl/AudioDetector", "onRttDeactivated", 115, "AudioDetector.java").v("rtt deactivated");
        ((defpackage.qeg) this.a).f.set(false);
        return ajcm.a;
    }

    public /* synthetic */ qgl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
