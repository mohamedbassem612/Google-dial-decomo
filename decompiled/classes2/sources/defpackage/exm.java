package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class exm implements ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ exm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v66, types: [aoin, java.lang.Object] */
    public final java.lang.Object eZ() {
        android.view.animation.Animation animationLoadAnimation;
        android.view.animation.Animation animationLoadAnimation2;
        switch (this.$cid) {
            case 0:
                int i = defpackage.exo.a;
                return new defpackage.fih((android.content.Context) this.a);
            case 1:
                return defpackage.hgt.aH((android.content.Context) this.a);
            case 2:
                int i2 = defpackage.exo.a;
                return defpackage.fir.f((android.content.Context) this.a);
            case 3:
                int i3 = defpackage.exo.a;
                return new izg((android.content.Context) this.a);
            case 4:
                int i4 = defpackage.exo.a;
                return this.a;
            case 5:
                try {
                    return (defpackage.fft) ((java.lang.Class) this.a).getConstructor(null).newInstance(null);
                } catch (java.lang.Exception e) {
                    throw new java.lang.IllegalStateException(e);
                }
            case 6:
                return rlt.b(((defpackage.huz) this.a).a);
            case 7:
                aigb aigbVar = new aigb(4);
                for (ypu ypuVar : ((ypt) this.a.a()).b) {
                    aigbVar.i(ahvr.q(ypuVar.b), ypuVar.c);
                }
                return aigbVar.e(true);
            case 8:
                defpackage.kug kugVar = (defpackage.kug) this.a;
                kugVar.f = new defpackage.kuf(kugVar);
                kugVar.g = new android.content.IntentFilter("com.android.dialer.feedback.impl.action.REQUEST_FEEDBACK");
                return null;
            case 9:
                return (acve) ((lcx) this.a).c().orElse(acve.a);
            case 10:
                return (acux) this.a.a();
            case 11:
                return afsq.bJ((aoin) this.a);
            case 12:
                pvf pvfVar = (pvf) this.a;
                aify aifyVarA = pvfVar.a();
                pvd pvdVar = new pvd(pvfVar.e(aifyVarA, pur.b), pvfVar.e(aifyVarA, pur.c));
                aimz aimzVar = pvf.a;
                aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameras", 343, "CameraController.java").y("Optimal front camera: %s", pvdVar.a);
                aimzVar.b().l("com/android/dialer/incall/core/video/impl/CameraController", "getOptimalCameras", 344, "CameraController.java").y("Optimal back camera: %s", pvdVar.b);
                return pvdVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                pyj pyjVar = (pyj) this.a;
                aw awVar = pyjVar.a;
                boolean z = awVar.dX().getBoolean(2131034122);
                if (pyjVar.d() || pyjVar.e()) {
                    z = false;
                }
                boolean z2 = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
                if (z) {
                    animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(awVar.z(), z2 ? 2130772002 : 2130772003);
                    animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(awVar.z(), true != z2 ? 2130772006 : 2130772005);
                } else {
                    animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(awVar.z(), 2130772001);
                    animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(awVar.z(), 2130772004);
                }
                animationLoadAnimation.setInterpolator(defpackage.hrm.a);
                animationLoadAnimation2.setInterpolator(defpackage.hrm.b);
                if (animationLoadAnimation == null) {
                    throw new java.lang.NullPointerException("Null slideInAnimation");
                }
                if (animationLoadAnimation2 != null) {
                    return new pyf(animationLoadAnimation, animationLoadAnimation2);
                }
                throw new java.lang.NullPointerException("Null slideOutAnimation");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return ((qdu) this.a).l.i("dialer:InCallProximitySensorWakeLock");
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj = this.a;
                return ahvr.F(new sws(obj, 1), ((svm) obj).d);
            case 16:
                return this.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                tvv tvvVar = (tvv) this.a;
                java.lang.String string = (java.lang.String) tvvVar.e.z().orElse((java.lang.Object) null);
                if (string != null) {
                    tvvVar.d.a().edit().putString("DialtactsActivity_user_sim_country_code", string).apply();
                } else {
                    string = tvvVar.d.a().getString("DialtactsActivity_user_sim_country_code", null);
                }
                if (string != null) {
                    return j$.util.Optional.of(string);
                }
                a.bI(tvv.a.d(), "Could not load userSimCountryCode.", "com/android/dialer/smartdial/util/SmartDialPrefix", "getUserSimCountryCode", 'p', "SmartDialPrefix.java", zct.b);
                return j$.util.Optional.empty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return (acux) this.a.a();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((vyd) this.a).d.inflate();
                return new vyc(viewGroup, (android.widget.FrameLayout) viewGroup.findViewById(2131427674), (android.widget.LinearLayout) viewGroup.findViewById(2131429461), (android.widget.LinearLayout) viewGroup.findViewById(2131429476), (android.widget.ImageView) viewGroup.findViewById(2131429478), (android.widget.ImageView) viewGroup.findViewById(2131429477), (android.widget.TextView) viewGroup.findViewById(2131429474), (android.widget.TextView) viewGroup.findViewById(2131429475), (android.widget.TextView) viewGroup.findViewById(2131428701));
            default:
                return ((vze) this.a).d();
        }
    }
}
