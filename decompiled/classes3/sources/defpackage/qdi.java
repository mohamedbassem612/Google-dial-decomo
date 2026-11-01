package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qdi implements znu {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qdi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq c() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.qdl qdlVar = ((defpackage.qdj) this.a).e;
            if (qdlVar.e.getAndSet(false)) {
                defpackage.qdl.a.b().l("com/android/dialer/incall/proximitysensor/impl/answer/PseudoProximityWakeLock", "release", 153, "PseudoProximityWakeLock.java").v("releasing lock");
                zjv.i(qdlVar.d, mgv.dT, (java.util.List) null, (mhc) null, 0, 30);
                qdlVar.b.unregisterListener(qdlVar.g);
                qdlVar.j.a(qbc.dD);
            }
            return ajcm.a;
        }
        if (i == 1) {
            ooc.a.b().l("com/android/dialer/fliptosilence/impl/FlipToSilenceCallEventListeners", "onCallRingingEnded", 64, "FlipToSilenceCallEventListeners.java").v("call answered cancelling flipObserver");
            java.lang.Object obj = this.a;
            return ahvr.E(new lye(obj, 7), ((ooc) obj).f);
        }
        defpackage.zcy zcyVar = defpackage.zcy.a;
        defpackage.qnd qndVar = (defpackage.qnd) this.a;
        int iOrdinal = qndVar.m.a().ordinal();
        if (iOrdinal != 6 && iOrdinal != 9) {
            qndVar.h.set(false);
            qndVar.p.a(ajcm.a);
        }
        return ajcm.a;
    }
}
