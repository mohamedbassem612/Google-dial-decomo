package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fxt implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ fxt(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0272  */
    /* JADX WARN: Code duplicated, block: B:133:0x0324  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ee  */
    /* JADX WARN: Type inference failed for: r9v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v63, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v81, types: [cer, java.lang.Object] */
    public final java.lang.Object a() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        boolean z = true;
        switch (this.$cid) {
            case 0:
                return defpackage.hgt.Z((java.lang.String) this.a);
            case 1:
                return a.r((aomy) this.a);
            case 2:
                defpackage.gni gniVar = (defpackage.gni) this.a;
                return java.math.BigInteger.valueOf(gniVar.b).shiftLeft(32).or(java.math.BigInteger.valueOf(gniVar.c)).shiftLeft(32).or(java.math.BigInteger.valueOf(gniVar.d));
            case 3:
                izg izgVar = (izg) this.a;
                java.lang.reflect.Method method = ((kaw) izgVar.c).ab().getMethod("getWindowLayoutComponent", null);
                java.lang.Class clsR = izgVar.r();
                aooh.c(method);
                return java.lang.Boolean.valueOf(gus.G(method) && gus.D(method, clsR));
            case 4:
                java.lang.Class<?> clsLoadClass = ((java.lang.ClassLoader) ((izg) this.a).b).loadClass("androidx.window.extensions.layout.FoldingFeature");
                aooh.e(clsLoadClass, "loadClass(...)");
                java.lang.reflect.Method method2 = clsLoadClass.getMethod("getBounds", null);
                java.lang.reflect.Method method3 = clsLoadClass.getMethod("getType", null);
                java.lang.reflect.Method method4 = clsLoadClass.getMethod("getState", null);
                aooh.c(method2);
                aopu[] aopuVarArr = aoou.a;
                if (gus.H(method2, new aooa(android.graphics.Rect.class)) && gus.G(method2)) {
                    aooh.c(method3);
                    if (gus.H(method3, new aooa(java.lang.Integer.TYPE)) && gus.G(method3)) {
                        aooh.c(method4);
                        z = gus.H(method4, new aooa(java.lang.Integer.TYPE)) && gus.G(method4);
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 5:
                izg izgVar2 = (izg) this.a;
                java.lang.reflect.Method method5 = izgVar2.q().getMethod("getDisplayFoldFeatures", null);
                java.lang.reflect.Type genericReturnType = method5.getGenericReturnType();
                aooh.d(genericReturnType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                java.lang.reflect.Type type = ((java.lang.reflect.ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                aooh.d(type, "null cannot be cast to non-null type java.lang.Class<*>");
                java.lang.Class cls = (java.lang.Class) type;
                aooh.c(method5);
                return java.lang.Boolean.valueOf(gus.G(method5) && gus.D(method5, java.util.List.class) && aooh.n(cls, izgVar2.p()));
            case 6:
                java.lang.Class clsP = ((izg) this.a).p();
                java.lang.reflect.Method method6 = clsP.getMethod("getType", null);
                java.lang.reflect.Method method7 = clsP.getMethod("hasProperty", java.lang.Integer.TYPE);
                java.lang.reflect.Method method8 = clsP.getMethod("hasProperties", int[].class);
                aooh.c(method6);
                if (gus.G(method6) && gus.D(method6, java.lang.Integer.TYPE)) {
                    aooh.c(method7);
                    if (gus.G(method7) && gus.D(method7, java.lang.Boolean.TYPE)) {
                        aooh.c(method8);
                        z = gus.G(method8) && gus.D(method8, java.lang.Boolean.TYPE);
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 7:
                izg izgVar3 = (izg) this.a;
                java.lang.reflect.Method method9 = izgVar3.r().getMethod("getSupportedWindowFeatures", null);
                aooh.c(method9);
                return java.lang.Boolean.valueOf(gus.G(method9) && gus.D(method9, izgVar3.q()));
            case 8:
                izg izgVar4 = (izg) this.a;
                java.lang.Class<?> clsD = ((gne) izgVar4.a).d();
                if (clsD != null) {
                    java.lang.Class clsR2 = izgVar4.r();
                    java.lang.reflect.Method method10 = clsR2.getMethod("addWindowLayoutInfoListener", android.app.Activity.class, clsD);
                    java.lang.reflect.Method method11 = clsR2.getMethod("removeWindowLayoutInfoListener", clsD);
                    aooh.c(method10);
                    if (gus.G(method10)) {
                        aooh.c(method11);
                        z = gus.G(method11);
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                java.lang.ClassLoader classLoader = (java.lang.ClassLoader) ((izg) this.a).b;
                java.lang.Class<?> clsLoadClass2 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutInfo");
                aooh.e(clsLoadClass2, "loadClass(...)");
                java.lang.reflect.Method method12 = clsLoadClass2.getMethod("getEngagementModeFlags", null);
                java.lang.reflect.Method method13 = clsLoadClass2.getMethod("hasEngagementModeFlag", java.lang.Integer.TYPE);
                java.lang.Class<?> clsLoadClass3 = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutInfo$Builder");
                aooh.e(clsLoadClass3, "loadClass(...)");
                java.lang.reflect.Method method14 = clsLoadClass3.getMethod("setEngagementModeFlags", java.lang.Integer.TYPE);
                java.lang.reflect.Method method15 = clsLoadClass3.getMethod("build", null);
                aooh.c(method12);
                if (gus.G(method12)) {
                    java.lang.Class cls2 = java.lang.Integer.TYPE;
                    aopu[] aopuVarArr2 = aoou.a;
                    if (gus.H(method12, new aooa(cls2))) {
                        aooh.c(method13);
                        if (gus.G(method13) && gus.H(method13, new aooa(java.lang.Boolean.TYPE))) {
                            aooh.c(method14);
                            if (gus.G(method14)) {
                                aooh.c(method15);
                                z = gus.G(method15) && gus.D(method15, clsLoadClass2);
                            }
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 10:
                java.lang.Class clsR3 = ((izg) this.a).r();
                java.lang.reflect.Method method16 = clsR3.getMethod("addWindowLayoutInfoListener", android.content.Context.class, ddz$.ExternalSyntheticApiModelOutline0.m());
                java.lang.reflect.Method method17 = clsR3.getMethod("removeWindowLayoutInfoListener", ddz$.ExternalSyntheticApiModelOutline0.m());
                aooh.c(method16);
                if (gus.G(method16)) {
                    aooh.c(method17);
                    z = gus.G(method17);
                }
                return java.lang.Boolean.valueOf(z);
            case 11:
                return ((androidx.work.Worker) this.a).c();
            case 12:
                return a.r((aomy) this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.hcb hcbVar = (defpackage.hcb) this.a;
                return java.lang.Float.valueOf((((java.lang.Boolean) hcbVar.b.a()).booleanValue() && hcbVar.e() % 2 == 0) ? -hcbVar.d() : hcbVar.d());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.hcb hcbVar2 = (defpackage.hcb) this.a;
                float f = 0.0f;
                if (hcbVar2.g() != null) {
                    if (hcbVar2.d() < 0.0f) {
                        defpackage.hch hchVarH = hcbVar2.h();
                        if (hchVarH != null) {
                            f = hchVarH.a;
                        }
                    } else {
                        hcbVar2.h();
                        f = 1.0f;
                    }
                }
                return java.lang.Float.valueOf(f);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.hcb hcbVar3 = (defpackage.hcb) this.a;
                return java.lang.Boolean.valueOf(hcbVar3.e() == ((java.lang.Number) hcbVar3.a.a()).intValue() && hcbVar3.c() == hcbVar3.b());
            case 16:
                return java.lang.Float.valueOf(((java.lang.Number) this.a.a()).floatValue());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                defpackage.hci hciVar = (defpackage.hci) this.a;
                return java.lang.Boolean.valueOf(hciVar.b() == null && hciVar.c() == null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.hci hciVar2 = (defpackage.hci) this.a;
                if (hciVar2.b() == null && hciVar2.c() == null) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return java.lang.Boolean.valueOf(((defpackage.hci) this.a).c() != null);
            default:
                return java.lang.Boolean.valueOf(((defpackage.hci) this.a).b() != null);
        }
    }
}
