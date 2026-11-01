package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ldf implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ldf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                com.android.dialer.callscreen.impl.history.CallScreenSessionActivity callScreenSessionActivity = (com.android.dialer.callscreen.impl.history.CallScreenSessionActivity) this.a;
                callScreenSessionActivity.x(callScreenSessionActivity.o.a);
                break;
            case 1:
                defpackage.kug kugVar = (defpackage.kug) this.a;
                if (!kugVar.e) {
                    kugVar.d.eZ();
                    dvx.f(kugVar.b, kugVar.f, kugVar.g, "android.permission.MODIFY_PHONE_STATE", 2);
                    kugVar.e = true;
                    defpackage.kug.a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "registerReceiver", 95, "CallQualityRatingDialogLauncher.java").v("Registered FeedbackRequestReceiver");
                }
                break;
            case 2:
                ((defpackage.ldn) this.a).l = j$.time.Instant.now().toEpochMilli();
                break;
            case 3:
                ((defpackage.ldn) this.a).o = android.os.SystemClock.elapsedRealtime();
                break;
            case 4:
                ((defpackage.ldn) this.a).n = android.os.SystemClock.elapsedRealtime();
                break;
            case 5:
                ((defpackage.ldn) this.a).k++;
                break;
            case 6:
                ((defpackage.ldn) this.a).m = j$.time.Instant.now().toEpochMilli();
                break;
            case 7:
                ((defpackage.lei) this.a).e.n(rmw.jW);
                break;
            case 8:
                defpackage.lev levVar = (defpackage.lev) this.a;
                levVar.d.a();
                levVar.e.n(rmw.kt);
                break;
            case 9:
                ((defpackage.lgi) this.a).k = j$.util.Optional.empty();
                break;
            case 10:
                java.lang.Object obj = this.a;
                aenj aenjVar = defpackage.lgv.b;
                ruc rucVar = ((defpackage.lgv) obj).q;
                rucVar.e(aenjVar);
                rucVar.f(defpackage.lgv.c);
                break;
            case 11:
                defpackage.oii oiiVar = ((defpackage.lhl) this.a).c;
                if (oiiVar.o()) {
                    oiiVar.n();
                }
                break;
            case 12:
                defpackage.ljs ljsVar = (defpackage.ljs) this.a;
                defpackage.adpe adpeVar = ljsVar.i;
                if (adpeVar.h()) {
                    ljsVar.q();
                    adpeVar.g();
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.lmk) this.a).p.i((java.lang.String) null).b(mce.az);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.view.View view = (android.view.View) this.a;
                if (view.getLayoutParams().height != -2) {
                    view.getLayoutParams().height = -2;
                    view.requestLayout();
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((defpackage.loi) this.a).x.i((java.lang.String) null).b(mce.r);
                break;
            case 16:
                ((defpackage.loi) this.a).x.i((java.lang.String) null).b(mce.r);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.loi loiVar = (defpackage.loi) this.a;
                if (loiVar.f()) {
                    loiVar.i.h(rua.b, loiVar.d);
                } else {
                    loiVar.i.h(rtz.b, loiVar.d);
                }
                if (!loiVar.d.aH()) {
                    loiVar.x.i((java.lang.String) null).b(mce.q);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.lsn lsnVar = (defpackage.lsn) this.a;
                ahvr.ag(lsnVar.b, lsnVar.v, new defpackage.lsm(lsnVar, null));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((defpackage.lya) this.a).E = false;
                break;
            default:
                ((defpackage.lya) this.a).D();
                break;
        }
    }
}
