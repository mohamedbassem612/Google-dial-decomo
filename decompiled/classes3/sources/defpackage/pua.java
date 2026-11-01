package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pua implements defpackage.ptv {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ pua(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // defpackage.ptv
    public final defpackage.ptu a(java.lang.Object obj) {
        if (this.$cid != 0) {
            final jyn jynVar = (jyn) obj;
            final int i = this.a;
            final int i2 = 0;
            return new defpackage.ptu() { // from class: ptz
                /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.concurrent.Executor] */
                @Override // defpackage.ptu
                public final ajcq a() {
                    if (i2 == 0) {
                        int i3 = i;
                        java.lang.Object obj2 = jynVar;
                        java.util.concurrent.Callable callableI = ahqx.i(new lqh(obj2, i3, 0));
                        jyn jynVar2 = (jyn) obj2;
                        return ((ajwr) jynVar2.d).d(callableI, (java.util.concurrent.Executor) jynVar2.b);
                    }
                    defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) jynVar).a;
                    defpackage.pqm pqmVar = qgnVar.n;
                    android.telecom.Call call = pqmVar.b;
                    if (rs$.ExternalSyntheticApiModelOutline0.m(call)) {
                        a.bI(defpackage.pqm.a.c().m(aioa.b), "RTT is already active.", "com/android/dialer/incall/core/call/CallControllerImpl", "acceptRttUpgradeRequest", (char) 616, "CallControllerImpl.java", zct.b);
                    } else {
                        int i4 = i;
                        defpackage.pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "acceptRttUpgradeRequest", 620, "CallControllerImpl.java").v("Accept RTT upgrade request.");
                        pqmVar.f.b(mfy.en, aify.p(gus.ax(true)));
                        rs$.ExternalSyntheticApiModelOutline0.m(call, i4, true);
                    }
                    qgnVar.m.a(qbc.ec);
                    return ajcm.a;
                }
            };
        }
        final defpackage.rai raiVar = (defpackage.rai) obj;
        final int i3 = this.a;
        final int i4 = 1;
        return new defpackage.ptu() { // from class: ptz
            /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.concurrent.Executor] */
            @Override // defpackage.ptu
            public final ajcq a() {
                if (i4 == 0) {
                    int i5 = i3;
                    java.lang.Object obj2 = raiVar;
                    java.util.concurrent.Callable callableI = ahqx.i(new lqh(obj2, i5, 0));
                    jyn jynVar2 = (jyn) obj2;
                    return ((ajwr) jynVar2.d).d(callableI, (java.util.concurrent.Executor) jynVar2.b);
                }
                defpackage.qgn qgnVar = (defpackage.qgn) ((defpackage.rai) raiVar).a;
                defpackage.pqm pqmVar = qgnVar.n;
                android.telecom.Call call = pqmVar.b;
                if (rs$.ExternalSyntheticApiModelOutline0.m(call)) {
                    a.bI(defpackage.pqm.a.c().m(aioa.b), "RTT is already active.", "com/android/dialer/incall/core/call/CallControllerImpl", "acceptRttUpgradeRequest", (char) 616, "CallControllerImpl.java", zct.b);
                } else {
                    int i6 = i3;
                    defpackage.pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "acceptRttUpgradeRequest", 620, "CallControllerImpl.java").v("Accept RTT upgrade request.");
                    pqmVar.f.b(mfy.en, aify.p(gus.ax(true)));
                    rs$.ExternalSyntheticApiModelOutline0.m(call, i6, true);
                }
                qgnVar.m.a(qbc.ec);
                return ajcm.a;
            }
        };
    }
}
