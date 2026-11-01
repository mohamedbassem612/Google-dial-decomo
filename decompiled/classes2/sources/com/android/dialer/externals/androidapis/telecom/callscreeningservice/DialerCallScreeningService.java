package com.android.dialer.externals.androidapis.telecom.callscreeningservice;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class DialerCallScreeningService extends android.telecom.CallScreeningService {
    private static final aimz a = aimz.i("com/android/dialer/externals/androidapis/telecom/callscreeningservice/DialerCallScreeningService");
    private defpackage.oke b;

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        aooh.f(intent, "intent");
        defpackage.oke okeVarBb = pez.aB(this).bb();
        this.b = okeVarBb;
        if (okeVarBb != null) {
            zjv zjvVar = ((defpackage.lnh) okeVarBb).e;
            zjvVar.a.d();
            zjv.i(zjvVar, mgv.eX, (java.util.List) null, (mhc) null, 3, 14);
        } else {
            a.c().m(aioa.b).i(zct.b).l("com/android/dialer/externals/androidapis/telecom/callscreeningservice/DialerCallScreeningService", "onBind", 55, "DialerCallScreeningService.kt").v("mixin is missing during bind");
        }
        return super.onBind(intent);
    }

    public final void onScreenCall(android.telecom.Call.Details details) {
        ajcq ajcqVarC;
        aooh.f(details, "callDetails");
        okc okcVarAB = pez.aB(this);
        ahok ahokVarF = okcVarAB.fi().f(405, "DialerCallScreeningService.onScreenCall");
        try {
            okcVarAB.bv().j(ruc.aL);
            defpackage.oke okeVar = this.b;
            if (okeVar != null) {
                defpackage.okd okdVar = new defpackage.okd(this);
                aooh.f(details, "callDetails");
                zjv.i(((defpackage.lnh) okeVar).e, mgv.fa, (java.util.List) null, (mhc) null, 0, 30);
                aosy aosyVarAm = aoov.am(((defpackage.lnh) okeVar).b, 0, new defpackage.hyq((defpackage.lnh) okeVar, okdVar, details, (aoln) null, 15), 3);
                ((defpackage.lnh) okeVar).j = aooc.V(aosyVarAm);
                ajcqVarC = aosv.C(aosyVarAm);
            } else {
                ajcqVarC = null;
            }
            agsm.i(1315, ajcqVarC, "failed to screen call", new java.lang.Object[0]);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        defpackage.lnl lnlVarF;
        aooh.f(intent, "intent");
        defpackage.oke okeVar = this.b;
        if (okeVar != null) {
            aimz aimzVar = defpackage.lnh.a;
            aimzVar.b().l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "onUnbind", 159, "DialerCallScreeningServiceMixinImpl.kt").v("Telecom is unbinding call screening service");
            mgv mgvVar = mgv.eX;
            defpackage.lnh lnhVar = (defpackage.lnh) okeVar;
            zjv zjvVar = lnhVar.e;
            zjv.i(zjvVar, mgvVar, (java.util.List) null, (mhc) null, 4, 14);
            aoub aoubVar = lnhVar.j;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            } else {
                aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "onUnbind", 173, "DialerCallScreeningServiceMixinImpl.kt").v("screen call deferred is missing");
            }
            defpackage.lmq lmqVar = lnhVar.i;
            if (lmqVar == null) {
                aimzVar.b().i(zct.b).l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "onUnbind", 180, "DialerCallScreeningServiceMixinImpl.kt").v("no call screening details found");
            } else if (defpackage.lnh.g(lmqVar)) {
                if (lnhVar.g) {
                    lnlVarF = lnhVar.h;
                    if (lnlVarF == null) {
                        throw new java.lang.IllegalStateException("provided call response but screening result is missing");
                    }
                } else {
                    lnlVarF = defpackage.lnh.f(3, null);
                }
                defpackage.lnl lnlVar = lnlVarF;
                if (!lnhVar.g) {
                    aimzVar.d().i(zct.b).l("com/android/dialer/callscreeningservice/impl/DialerCallScreeningServiceMixinImpl", "onUnbind", 201, "DialerCallScreeningServiceMixinImpl.kt").v("service has been unbound prior to responding to call");
                    lnhVar.d.o(rmx.iY);
                    lnhVar.m.i((java.lang.String) null).a(mcd.j);
                    lnhVar.d(lmqVar, lnlVar);
                }
                aimz aimzVar2 = zih.a;
                aoov.al(lnhVar.b, zih.b.plus(aols.a), 1, new defpackage.fxp((aoln) null, lnhVar, lmqVar, lnlVar, 6));
                zjvVar.a.e();
            }
        } else {
            a.c().m(aioa.b).i(zct.b).l("com/android/dialer/externals/androidapis/telecom/callscreeningservice/DialerCallScreeningService", "onUnbind", 65, "DialerCallScreeningService.kt").v("mixin is missing during unbind");
        }
        pez.aB(this).bv().m(ruc.aL);
        return super.onUnbind(intent);
    }
}
