package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nti implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public /* synthetic */ nti(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [aoss, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = 2;
        java.lang.Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                aooh.f(view, "view");
                defpackage.nth nthVar = (defpackage.nth) this.a;
                nthVar.e.o(rmx.kG);
                defpackage.nte nteVar = nthVar.b;
                defpackage.maj majVar = nthVar.g;
                nthVar.d.i(zoe.N(aosv.F((aoss) majVar.b, 0, new defpackage.lnb(majVar, nteVar, (aoln) null, 2), 3)), nthVar.f);
                return;
            case 1:
                aooh.f(view, "view");
                ((defpackage.nth) this.a).c.f();
                return;
            case 2:
                defpackage.obd obdVarD = ((defpackage.oby) this.a).d();
                if (obdVarD != null) {
                    obdVarD.f();
                    return;
                }
                return;
            case 3:
                defpackage.oby obyVar = (defpackage.oby) this.a;
                defpackage.obf obfVar = obyVar.o;
                obyVar.u.i(obfVar != null ? obfVar.g : null).b(mce.bI);
                defpackage.obd obdVarD2 = obyVar.d();
                if (obdVarD2 != null) {
                    ahoq ahoqVarW = ahvr.W(397, "EmergencyVoiceController_onEndCallClicked");
                    try {
                        zzx zzxVar = obdVarD2.l;
                        if (zzxVar.e().isEmpty()) {
                            obdVarD2.d.g(obdVarD2.j.f(), 5L, java.util.concurrent.TimeUnit.SECONDS);
                        } else {
                            ailj ailjVarK = zzxVar.e().k();
                            aooh.e(ailjVarK, "iterator(...)");
                            while (ailjVarK.hasNext()) {
                                defpackage.ocy ocyVar = (defpackage.ocy) ailjVarK.next();
                                ocyVar.e.b(mce.fa);
                                aoov.an(ocyVar.d, (aolr) null, 0, new defpackage.mva(ocyVar, (aoln) null, 12), 3);
                                defpackage.ocy.a.b().l("com/android/dialer/emergencycalling/satellitesos/impl/service/SatelliteSOSEndCallButtonBehavior", "onEndCallButtonClicked", 54, "SatelliteSOSEndCallButtonBehavior.kt").v("The end call button is overridden.");
                            }
                            defpackage.obd.a.b().l("com/android/dialer/emergencycalling/impl/service/EmergencyVoiceController", "onEndCallClicked$<anonymous>", 150, "EmergencyVoiceController.kt").v("Override the end call button behavior successful.");
                        }
                        ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                        return;
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            ajsz.ak(ahoqVarW, th);
                            throw th2;
                        }
                    }
                }
                return;
            case 4:
                defpackage.oji.a.b().l("com/android/dialer/externals/aicore/ui/DialerAiCorePreferenceViewPeer", "<anonymous>", 70, "DialerAiCorePreferenceViewPeer.kt").v("astrea container clicked");
                ((defpackage.oji) this.a).e("com.google.android.as.oss");
                return;
            case 5:
                defpackage.oll ollVar = (defpackage.oll) this.a;
                ahvr.bZ(ollVar.l > 0, "No more pages to show.");
                ollVar.b(ollVar.l - 1);
                return;
            case 6:
                defpackage.oll ollVar2 = (defpackage.oll) this.a;
                int size = ollVar2.a.b().size();
                int i2 = size - 1;
                int i3 = ollVar2.l;
                ahvr.cd(i3 < i2, "No more pages to show. Current page index: %s. Number of pages: %s.", i3, size);
                ollVar2.b(ollVar2.l + 1);
                return;
            case 7:
                defpackage.oll ollVar3 = (defpackage.oll) this.a;
                j$.util.Optional optionalD = ollVar3.a.d();
                if (true == optionalD.isPresent()) {
                    ((java.lang.Runnable) optionalD.get()).run();
                }
                ollVar3.i.finish();
                return;
            case 8:
                defpackage.oll ollVar4 = (defpackage.oll) this.a;
                j$.util.Optional optionalF = ollVar4.a.f();
                if (true == optionalF.isPresent()) {
                    ((java.lang.Runnable) optionalF.get()).run();
                }
                ollVar4.i.finish();
                return;
            case 9:
                ((oyp) this.a).k();
                return;
            case 10:
                ((oyp) this.a).k();
                return;
            case 11:
                java.lang.Object obj = this.a;
                oyp oypVar = (oyp) obj;
                own ownVar = oypVar.h;
                oypVar.j.i(ownVar != null ? ownVar.a : null).b(mce.aH);
                oypVar.j("answer as RTT animation finished", new defpackage.opy(obj, i));
                return;
            case 12:
                ((oyp) this.a).l();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((oyp) this.a).l();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((oyu) this.a).g();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj2 = this.a;
                oyu oyuVar = (oyu) obj2;
                j$.util.Optional optionalOfNullable = oyuVar.i;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((own) optionalOfNullable.get()).a);
                }
                oyuVar.k.i((java.lang.String) optionalOfNullable.orElse((java.lang.Object) null)).b(mce.aH);
                android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new defpackage.mh(obj2, 8, objArr == true ? 1 : 0));
                valueAnimatorOfFloat.addListener(new ahpv(defpackage.hrz.a(oyuVar.d, new oxr(obj2, 10)), oyuVar.e, 456, "answer as RTT animation finished"));
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.play(valueAnimatorOfFloat).with(oyuVar.a());
                animatorSet.start();
                return;
            case 16:
                ((oyu) this.a).h();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                pbh pbhVar = (pbh) this.a;
                android.app.KeyguardManager keyguardManager = pbhVar.d;
                if (keyguardManager.isKeyguardLocked()) {
                    pbh.a.b().l("com/android/dialer/incall/answer/sms/ui/SmsBottomSheetFragmentPeer", "onCustomSmsClicked", 237, "SmsBottomSheetFragmentPeer.java").v("dismissing keyguard");
                    da$.ExternalSyntheticApiModelOutline1.m(keyguardManager, pbhVar.c.G(), new pbd(pbhVar));
                    return;
                } else {
                    pbh.a.b().l("com/android/dialer/incall/answer/sms/ui/SmsBottomSheetFragmentPeer", "onCustomSmsClicked", 229, "SmsBottomSheetFragmentPeer.java").v("not locked, showing dialog directly");
                    pbhVar.b();
                    return;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                qgs qgsVar = (qgs) this.a;
                qgsVar.dismiss();
                qgsVar.b.a();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                qhj.a.b().l("com/android/dialer/incall/rtt/ui/RttChatFragmentPeer", "onCreateView", 572, "RttChatFragmentPeer.java").v("end call button clicked");
                view.performHapticFeedback(1);
                j$.util.Optional optionalF2 = ((qhj) this.a).f();
                if (true == optionalF2.isPresent()) {
                    agsm.i(601, ((qfj) optionalF2.get()).m.f(), "Failed to disconnect.", new java.lang.Object[0]);
                    return;
                }
                return;
            default:
                qhj qhjVar = (qhj) this.a;
                qhjVar.h.hideSoftInputFromWindow(qhjVar.c().getWindowToken(), 0);
                if (android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1) {
                    qhjVar.m.showAtLocation(view, 51, 0, 0);
                    return;
                } else {
                    qhjVar.m.showAtLocation(view, 53, 0, 0);
                    return;
                }
        }
    }

    public nti(defpackage.nth nthVar, int i) {
        this.$cid = i;
        this.a = nthVar;
    }
}
