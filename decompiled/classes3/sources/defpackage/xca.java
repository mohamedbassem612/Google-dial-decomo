package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xca {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioroutecontroller/HoldForMeCallAudioRouteController");
    public final ajcu b;
    public final zmq c;
    public final java.util.concurrent.Executor d;
    public final zmt g;
    public final ajwr i = new ajwr();
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional f = j$.util.Optional.empty();
    public j$.util.Optional h = j$.util.Optional.empty();

    public xca(ajcu ajcuVar, zmq zmqVar) {
        final int i = 0;
        this.g = new zmt() { // from class: xby
            public final void f(android.telecom.CallAudioState callAudioState, android.telecom.CallAudioState callAudioState2) {
                if (i == 0) {
                    java.lang.Object obj = this;
                    agsm.i(1170, ahvr.E(new defpackage.wdm(obj, callAudioState2, 6, null), ((defpackage.xca) obj).d), "failed to reset completer", new java.lang.Object[0]);
                    return;
                }
                aooh.f(callAudioState, "p0");
                aooh.f(callAudioState2, "p1");
                nej nejVar = (nej) this;
                if (((java.lang.Boolean) nejVar.F.a()).booleanValue() && callAudioState2.getRoute() == 2 && callAudioState.getRoute() != 2) {
                    nejVar.S((aenj) null, new kqu(nejVar, (aoln) null, 13));
                }
            }
        };
        this.b = ajcuVar;
        this.c = zmqVar;
        this.d = new ajdc(ajcuVar);
    }

    public final ajcq a(boolean z) {
        if (z) {
            zmq zmqVar = this.c;
            ajcq ajcqVarB = ajcm.a;
            java.lang.Object objOrElseThrow = zmqVar.a().orElseThrow();
            defpackage.zmw zmwVar = defpackage.zmw.ROUTE_SPEAKER;
            if (objOrElseThrow == zmwVar) {
                this.f = j$.util.Optional.of(zmwVar);
                ajcqVarB = b(defpackage.zmw.ROUTE_EARPIECE);
            }
            return ahrv.g(ajcqVarB).i(new defpackage.xbv(this, 3), this.b);
        }
        if (!this.f.isPresent()) {
            return ajcm.a;
        }
        j$.util.Optional optionalA = this.c.a();
        if (!optionalA.isPresent()) {
            return ajcm.a;
        }
        if (optionalA.orElseThrow() != defpackage.zmw.ROUTE_SPEAKER) {
            this.f = j$.util.Optional.empty();
            a.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioroutecontroller/HoldForMeCallAudioRouteController", "configCallAudioRoute", 112, "HoldForMeCallAudioRouteController.java").w("audio route changed to %d; shouldn't restore it", ((defpackage.zmw) optionalA.orElseThrow()).f);
            return ajcm.a;
        }
        if (this.f.orElseThrow() != optionalA.orElseThrow()) {
            return ahrv.g(b((defpackage.zmw) this.f.orElseThrow())).h(new defpackage.xbh(this, 10), this.b);
        }
        this.f = j$.util.Optional.empty();
        return ajcm.a;
    }

    public final ajcq b(defpackage.zmw zmwVar) {
        return dff.m(new jnr(this, zmwVar, 6));
    }
}
