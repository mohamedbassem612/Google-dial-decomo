package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lye implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lye(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v18, types: [android.hardware.display.DisplayManager$DisplayListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [android.hardware.display.DisplayManager$DisplayListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v63, types: [java.lang.Object, ppq] */
    /* JADX WARN: Type inference failed for: r8v64, types: [java.lang.Object, ppr] */
    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        ajcq ajcqVarM;
        switch (this.$cid) {
            case 0:
                ((defpackage.lyi) this.a).D.i((java.lang.String) null).b(mce.df);
                return;
            case 1:
                ((defpackage.lyi) this.a).j = true;
                return;
            case 2:
                try {
                    java.lang.Object obj = ((tjm) this.a).a;
                    ((defpackage.mjo) obj).b(wsc.bp(((defpackage.mjo) obj).c.a(), urp.d));
                    return;
                } catch (java.lang.RuntimeException e) {
                    a.bq(defpackage.mjo.a.c(), "Error setting animator", "com/android/dialer/dialpadview/easteregg/PseudoEmergencyAnimator$1", "onAnimationEnd", 'v', "PseudoEmergencyAnimator.java", e, zct.b);
                    return;
                }
            case 3:
                ((nnx) this.a).a.d(true, new defpackage.nnm(2));
                return;
            case 4:
                throw ((java.lang.Throwable) this.a);
            case 5:
                ?? r8 = this.a;
                ((defpackage.omk) r8).e.m((android.hardware.display.DisplayManager.DisplayListener) r8, (android.os.Handler) null);
                return;
            case 6:
                ?? r9 = this.a;
                ((defpackage.omk) r9).e.n((android.hardware.display.DisplayManager.DisplayListener) r9);
                return;
            case 7:
                ((defpackage.onz) ((defpackage.ooc) this.a).j.a).b();
                return;
            case 8:
                defpackage.ooc oocVar = (defpackage.ooc) this.a;
                oocVar.i.v();
                defpackage.ooc.a.b().l("com/android/dialer/fliptosilence/impl/FlipToSilenceCallEventListeners", "onCallRingingStarted", 57, "FlipToSilenceCallEventListeners.java").v("flip observed");
                oocVar.g.o(rmx.dx);
                return;
            case 9:
                java.lang.Object obj2 = this.a;
                ((defpackage.onz) ((defpackage.ooc) obj2).j.a).a(new defpackage.lye(obj2, 8));
                return;
            case 10:
                defpackage.ood oodVar = (defpackage.ood) this.a;
                int iC = oodVar.e.c();
                if (iC == 0 || iC == 1) {
                    ipc ipcVar = oodVar.g;
                    ipcVar.bm(rmu.r);
                    ipcVar.bm(rmu.t);
                    return;
                }
                return;
            case 11:
                otq otqVar = (otq) this.a;
                if (anty.Q(otqVar.c, otp.a, otp.b)) {
                    otqVar.c();
                    ruc rucVar = otqVar.b;
                    rucVar.c(ruc.n);
                    rucVar.c(ruc.o);
                    rucVar.c(ruc.p);
                    return;
                }
                return;
            case 12:
                otq otqVar2 = (otq) this.a;
                if (anty.Q(otqVar2.c, otp.a, otp.b)) {
                    otqVar2.c();
                    ruc rucVar2 = otqVar2.b;
                    rucVar2.o(ruc.n);
                    rucVar2.o(ruc.o);
                    rucVar2.o(ruc.p);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                otq otqVar3 = (otq) this.a;
                if (anty.Q(otqVar3.c, otp.a, otp.b)) {
                    otqVar3.b.o(ruc.p);
                    return;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((oud) this.a).c = null;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((android.widget.TextView) this.a).animate().alpha(0.0f).start();
                return;
            case 16:
                android.widget.Toast.makeText(((ozt) this.a).b, 2132018555, 0).show();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                android.widget.Toast.makeText(((ozt) this.a).b, 2132018554, 0).show();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                pff pffVar = (pff) this.a;
                if (pffVar.g) {
                    pffVar.h = true;
                    return;
                }
                pffVar.g = true;
                j$.util.Optional optionalA = pffVar.k.a();
                if (optionalA.isPresent()) {
                    ajcqVarM = ((defpackage.pfe) aooc.ar(optionalA.orElseThrow(), defpackage.pfe.class)).m();
                } else {
                    pfg pfgVar = new pfg();
                    pfgVar.d(false);
                    pfgVar.e(true);
                    pfgVar.c(j$.util.Optional.empty());
                    pfgVar.b(j$.util.Optional.empty());
                    ajcqVarM = aiql.z(j$.util.Optional.of(pfgVar.a()));
                }
                agsm.i(476, ahvr.H(ajcqVarM, new pfc(pffVar), pffVar.d), "failed to fetch BubbleModel", new java.lang.Object[0]);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                this.a.a();
                return;
            default:
                this.a.b();
                return;
        }
    }
}
