package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jnv implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jnv(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [ajcs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v53, types: [java.lang.Object, java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                agsm.d("com/android/dialer/callannouncer/impl/service/CallAnnouncer", "speakRepeatedlyWithDelay", 215, ((defpackage.jny) this.a).f((defpackage.jnu) this.b), zct.b, "failed to speak repeatedly with delay", new java.lang.Object[0]);
                break;
            case 1:
                jna.a.b().l("com/android/dialer/broadcastreceiverstrategy/impl/BroadcastReceiverStrategyImpl", "backgroundThenInlineThenForeground", 126, "BroadcastReceiverStrategyImpl.java").x("work has finished within %d milliseconds, canceling scheduled ForegroundService", ((jna) this.b).f.h());
                this.a.cancel(false);
                break;
            case 2:
                ((defpackage.jxm) this.b).t = j$.util.Optional.of(this.a);
                break;
            case 3:
                defpackage.kla klaVar = (defpackage.kla) this.a;
                klaVar.h = null;
                kiu kiuVarE = ((defpackage.kma) this.b).E();
                if (kiuVarE.q == 3 && !kiuVarE.j) {
                    klaVar.f(kiuVarE);
                }
                klaVar.j.i((java.lang.String) null).b(mce.dd);
                break;
            case 4:
                android.view.animation.Interpolator interpolator = defpackage.kla.a;
                ((android.view.View) this.b).setTranslationY(0.0f);
                defpackage.kkw kkwVar = ((defpackage.kkx) this.a).c;
                if (kkwVar != null) {
                    kkwVar.b.setTranslationY(0.0f);
                }
                break;
            case 5:
                defpackage.kla.g((ld) this.b, new defpackage.jpi(this.a, 16));
                break;
            case 6:
                java.lang.Object obj = this.a;
                defpackage.kkx kkxVar = (defpackage.kkx) obj;
                android.view.View view = kkxVar.e.b;
                view.setTranslationY(0.0f);
                view.getLayoutParams().height = -2;
                kkxVar.f.b.getLayoutParams().height = -2;
                defpackage.kla.g((ld) this.b, new defpackage.jpi(obj, 14));
                break;
            case 7:
                defpackage.kla klaVar2 = (defpackage.kla) this.a;
                klaVar2.i = null;
                kiu kiuVarE2 = ((defpackage.kma) this.b).E();
                if (kiuVarE2.q != 3 && kiuVarE2.x != 0) {
                    klaVar2.f(kiuVarE2);
                    break;
                }
                break;
            case 8:
                defpackage.kla.g((ld) this.b, new defpackage.jpi(this.a, 13));
                break;
            case 9:
                java.lang.Object obj2 = this.a;
                defpackage.kkx kkxVar2 = (defpackage.kkx) obj2;
                android.view.View view2 = kkxVar2.e.b;
                view2.setTranslationY(0.0f);
                view2.getLayoutParams().height = -2;
                kkxVar2.f.b.getLayoutParams().height = -2;
                view2.setVisibility(8);
                defpackage.kla.g((ld) this.b, new defpackage.jpi(obj2, 15));
                break;
            case 10:
                android.view.animation.Interpolator interpolator2 = defpackage.kla.a;
                android.view.View view3 = (android.view.View) this.b;
                view3.setVisibility(8);
                view3.setTranslationY(0.0f);
                defpackage.kkw kkwVar2 = ((defpackage.kkx) this.a).c;
                if (kkwVar2 != null) {
                    kkwVar2.b.setTranslationY(0.0f);
                }
                break;
            case 11:
                ((defpackage.lay) this.a).c.aQ((android.content.Intent) this.b, 9);
                break;
            case 12:
                ((com.android.dialer.callscreen.impl.history.CallScreenSessionActivity) this.b).x(((defpackage.lkq) this.a).a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.ldn) this.b).b.add(this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((defpackage.ldn) this.b).d.add(this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((defpackage.ldn) this.b).c.add(this.a);
                break;
            case 16:
                akzx akzxVar = ((defpackage.ldn) this.b).p;
                akzxVar.u();
                defpackage.lkb lkbVar = (defpackage.lkb) akzxVar.b;
                defpackage.lkb lkbVar2 = defpackage.lkb.a;
                java.lang.Object obj3 = this.a;
                j$.util.Objects.requireNonNull(obj3);
                alat alatVar = lkbVar.j;
                if (!alatVar.c()) {
                    lkbVar.j = alad.J(alatVar);
                }
                lkbVar.j.add(obj3);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((defpackage.ldn) this.b).a.add(this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.ldn) this.b).e.add(this.a);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                defpackage.lej.a.b().l("com/android/dialer/callscreen/impl/service/CachedVoicePackInterpreter", "cachedInterpreter", 105, "CachedVoicePackInterpreter.java").v("future finished after timeout");
                ((defpackage.lej) this.b).g.a((ajcq) this.a);
                break;
            default:
                ((pgi) this.b).a.remove(this.a);
                break;
        }
    }

    public /* synthetic */ jnv(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
