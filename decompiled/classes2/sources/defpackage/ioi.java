package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ioi implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ioi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v30, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v41, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v44, types: [java.lang.Object, zas] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ahzh ahzhVar = ((defpackage.iok) this.a).g;
                if (ahzhVar.a) {
                    ahzhVar.f();
                }
                break;
            case 1:
                j$.util.Optional optional = ((defpackage.ibk) this.a).i;
                if (true == optional.isPresent()) {
                    defpackage.hzm hzmVar = (defpackage.hzm) optional.get();
                    hzmVar.d();
                    hzmVar.b();
                }
                break;
            case 2:
                ahzh ahzhVar2 = ((defpackage.iok) this.a).g;
                if (!ahzhVar2.a) {
                    ahzhVar2.e();
                }
                break;
            case 3:
                ahzh ahzhVar3 = ((defpackage.iok) this.a).f;
                if (!ahzhVar3.a) {
                    ahzhVar3.e();
                }
                break;
            case 4:
                defpackage.irg irgVar = (defpackage.irg) this.a;
                aoov.an(irgVar.c, (aolr) null, 0, new defpackage.ire(irgVar, null), 3);
                break;
            case 5:
                ((android.widget.TextView) this.a).setTag(2131427565, null);
                break;
            case 6:
                ((android.widget.ImageView) this.a).setTag(2131427561, null);
                break;
            case 7:
                android.widget.ImageView imageView = (android.widget.ImageView) this.a;
                imageView.setVisibility(4);
                imageView.setTag(2131427561, null);
                break;
            case 8:
                defpackage.jny.a.b().l("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "startFlipToSilence", 192, "CallAnnouncer.java").v("flip observed");
                agsm.i(162, ((defpackage.jny) this.a).a(), "failed to cancel announcement", new java.lang.Object[0]);
                break;
            case 9:
                defpackage.jxm jxmVar = (defpackage.jxm) this.a;
                jxmVar.a();
                j$.util.Optional optional2 = jxmVar.t;
                if (true == optional2.isPresent()) {
                    optional2.get().cancel(false);
                }
                break;
            case 10:
                java.lang.Object obj = this.a;
                defpackage.jxm jxmVar2 = (defpackage.jxm) obj;
                ruc rucVar = jxmVar2.d;
                jxmVar2.h = rucVar.a();
                jxmVar2.i = rucVar.a();
                jxmVar2.j = rucVar.a();
                jxmVar2.k = rucVar.a();
                jxmVar2.l = rucVar.a();
                jxmVar2.e.o(rmx.kU);
                try {
                    zhr.b(ruc.ay.a, ((defpackage.jxm) obj).y);
                } catch (java.lang.IllegalStateException e) {
                    defpackage.jxm.a.d().i(zct.b).k(e).l("com/android/dialer/calllauncher/interaction/PlaceOutgoingCallInteractionContext", "onInteractionStarted", 125, "PlaceOutgoingCallInteractionContext.java").w("Failed to begin trace section for PlaceCallToOutgoingResponseLatency with cookie: %d", jxmVar2.y);
                    return;
                }
                break;
            case 11:
                ((kjr) ((ahbv) this.a).d.a()).b();
                break;
            case 12:
                this.a.b(mce.do);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                android.view.animation.Interpolator interpolator = defpackage.kla.a;
                ((android.view.View) this.a).setTranslationY(0.0f);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                android.view.animation.Interpolator interpolator2 = defpackage.kla.a;
                android.view.View view = (android.view.View) this.a;
                view.setTranslationY(0.0f);
                view.setVisibility(4);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.view.animation.Interpolator interpolator3 = defpackage.kla.a;
                ((android.view.View) this.a).setVisibility(0);
                break;
            case 16:
                ((defpackage.klo) this.a).L.i((java.lang.String) null).b(mce.p);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.klo kloVar = (defpackage.klo) this.a;
                if (kloVar.g()) {
                    kloVar.h.h(rua.a, kloVar.f);
                } else if (((java.lang.Boolean) kloVar.o.a()).booleanValue() && kloVar.k.a(kloVar.b)) {
                    kloVar.h.h(rty.a, kloVar.f);
                } else {
                    kloVar.h.h(rtz.a, kloVar.f);
                }
                if (kloVar.g()) {
                    kloVar.h.m(ruc.bx);
                } else {
                    kloVar.h.m(ruc.bw);
                }
                if (!kloVar.f.aH()) {
                    kloVar.L.i((java.lang.String) null).b(mce.o);
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.klo) this.a).D = true;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((defpackage.kma) this.a).I();
                break;
            default:
                java.lang.Object obj2 = this.a;
                defpackage.kug kugVar = (defpackage.kug) obj2;
                if (!kugVar.e) {
                    defpackage.kug.a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "unregisterReceiver", 126, "CallQualityRatingDialogLauncher.java").v("FeedbackRequestReceiver already unregistered");
                } else {
                    try {
                        ((defpackage.kug) obj2).b.unregisterReceiver(((defpackage.kug) obj2).f);
                        defpackage.kug.a.b().l("com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "unregisterReceiver", 113, "CallQualityRatingDialogLauncher.java").v("Unregistered FeedbackRequestReceiver");
                    } catch (java.lang.IllegalArgumentException e2) {
                        a.bq(defpackage.kug.a.d(), "Swallowed 'receiver not registered' exception.", "com/android/dialer/callqualityrating/impl/service/CallQualityRatingDialogLauncher", "unregisterReceiver", 'y', "CallQualityRatingDialogLauncher.java", e2, zct.b);
                    }
                    kugVar.e = false;
                }
                break;
        }
    }
}
