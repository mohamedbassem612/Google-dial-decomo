package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lwx implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ lwx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v16, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.a(obj);
                break;
            case 1:
                defpackage.lgn lgnVar = ((defpackage.lev) obj).g;
                java.lang.Object obj2 = this.a;
                defpackage.lgk lgkVar = (defpackage.lgk) obj2;
                alak alakVar = lgkVar.e;
                alal alalVar = defpackage.lgk.a;
                if (new alam(alakVar, alalVar).contains(defpackage.lln.END_CALL)) {
                    lgnVar.e.e(false);
                }
                defpackage.ldn ldnVar = lgnVar.f;
                akzx akzxVarM = defpackage.ljw.a.m();
                akzx akzxVarM2 = defpackage.lkc.a.m();
                aazc aazcVar = lgnVar.h;
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                akzxVarM2.u();
                defpackage.lkc lkcVar = (defpackage.lkc) akzxVarM2.b;
                lkcVar.b |= 1;
                lkcVar.c = jElapsedRealtime;
                java.lang.String str = lgkVar.h;
                akzxVarM2.u();
                defpackage.lkc lkcVar2 = (defpackage.lkc) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                lkcVar2.b |= 2;
                lkcVar2.d = str;
                alam alamVar = new alam(lgkVar.e, alalVar);
                akzxVarM2.u();
                defpackage.lkc lkcVar3 = (defpackage.lkc) akzxVarM2.b;
                alak alakVar2 = lkcVar3.e;
                if (!alakVar2.c()) {
                    lkcVar3.e = alad.H(alakVar2);
                }
                java.util.Iterator it = alamVar.iterator();
                while (it.hasNext()) {
                    lkcVar3.e.g(((defpackage.lln) it.next()).d);
                }
                akzxVarM.u();
                defpackage.ljw ljwVar = (defpackage.ljw) akzxVarM.b;
                defpackage.lkc lkcVar4 = (defpackage.lkc) akzxVarM2.p();
                j$.util.Objects.requireNonNull(lkcVar4);
                ljwVar.c = lkcVar4;
                ljwVar.b = 1;
                ahrv ahrvVarG = ahrv.g(ldnVar.a((defpackage.ljw) akzxVarM.p()));
                byte[] bArr = null;
                defpackage.kwa kwaVar = new defpackage.kwa(lgnVar, obj2, 11, bArr);
                java.util.concurrent.Executor executor = lgnVar.d;
                agsm.i(268, ahrvVarG.i(kwaVar, executor).i(new defpackage.kwa(lgnVar, obj2, 12, bArr), executor).i(new defpackage.kwa(lgnVar, obj2, 13, bArr), executor), "failed to process chip click", new java.lang.Object[0]);
                break;
            case 2:
                ((kh) this.a).f(((java.lang.Integer) obj).intValue());
                break;
            case 3:
                this.a.a(obj);
                break;
            case 4:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.mit mitVar = (defpackage.mit) akzxVar.b;
                defpackage.mit mitVar2 = defpackage.mit.a;
                j$.util.Objects.requireNonNull(str2);
                mitVar.b |= 4;
                mitVar.f = str2;
                break;
            case 5:
                this.a.a(obj);
                break;
            case 6:
                this.a.a(obj);
                break;
            case 7:
                this.a.a(obj);
                break;
            case 8:
                this.a.a(obj);
                break;
            case 9:
                this.a.add((android.telecom.PhoneAccount) obj);
                break;
            case 10:
                this.a.a(obj);
                break;
            case 11:
                this.a.a(obj);
                break;
            case 12:
                aimz aimzVar = nyh.a;
                ((android.os.Bundle) this.a).putString("com.google.android.apps.tachyon.extra.LOCAL_PHONE_NUMBER", (java.lang.String) obj);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                this.a.a(obj);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                this.a.a(obj);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                this.a.a(obj);
                break;
            case 16:
                this.a.a(obj);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((com.airbnb.lottie.LottieAnimationView) this.a).a((android.animation.Animator.AnimatorListener) obj);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((com.airbnb.lottie.LottieAnimationView) this.a).m((java.lang.String) obj);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((android.widget.TextView) this.a).setText((java.lang.String) obj);
                break;
            default:
                ((com.airbnb.lottie.LottieAnimationView) this.a).f((android.animation.Animator.AnimatorListener) obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                break;
            case 16:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
