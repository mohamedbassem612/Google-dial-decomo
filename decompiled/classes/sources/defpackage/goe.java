package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class goe {
    public static final java.lang.String a;
    private static final java.lang.String d;
    public final defpackage.gne b;
    public final defpackage.god c;
    private final defpackage.apnt f = new defpackage.apnt(this, (byte[]) null);
    private final defpackage.apnt e = new defpackage.apnt(this, (byte[]) null);

    static {
        defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
        d = new defpackage.aooa(defpackage.goe.class).c();
        a = "ae-gen:";
        new android.os.Binder();
    }

    public goe(defpackage.gne gneVar) {
        this.b = gneVar;
        this.c = new defpackage.god(this, gneVar);
    }

    public static final int e() {
        return new defpackage.gms().a;
    }

    public static final int f(defpackage.gps gpsVar) {
        if (defpackage.aooh.n(gpsVar, defpackage.gps.a)) {
            return 0;
        }
        if (defpackage.aooh.n(gpsVar, defpackage.gps.b)) {
            return 1;
        }
        if (defpackage.aooh.n(gpsVar, defpackage.gps.c)) {
            return 2;
        }
        java.util.Objects.toString(gpsVar);
        throw new java.lang.IllegalArgumentException("Unknown finish behavior:".concat(gpsVar.d));
    }

    public static final androidx.window.extensions.embedding.WindowAttributes g() {
        new defpackage.gms().a(5);
        return new androidx.window.extensions.embedding.WindowAttributes(2);
    }

    private final androidx.window.extensions.embedding.SplitAttributes.SplitType h(defpackage.gpk gpkVar) {
        androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType ratioSplitType;
        if (new defpackage.gms().a < 2) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        if (defpackage.aooh.n(gpkVar, defpackage.gpk.c)) {
            ratioSplitType = new androidx.window.extensions.embedding.SplitAttributes.SplitType.HingeSplitType(h(defpackage.gpk.b));
        } else {
            if (defpackage.aooh.n(gpkVar, defpackage.gpk.a)) {
                return new androidx.window.extensions.embedding.SplitAttributes.SplitType.ExpandContainersSplitType();
            }
            float f = gpkVar.d;
            double d2 = f;
            if (d2 <= 0.0d || d2 >= 1.0d) {
                throw new java.lang.IllegalArgumentException("Unsupported SplitType: " + gpkVar + " with value: " + f);
            }
            ratioSplitType = new androidx.window.extensions.embedding.SplitAttributes.SplitType.RatioSplitType(f);
        }
        return (androidx.window.extensions.embedding.SplitAttributes.SplitType) ratioSplitType;
    }

    private static final defpackage.goh i(androidx.window.extensions.embedding.AnimationBackground animationBackground) {
        new defpackage.gms().a(5);
        if (!ddz$.ExternalSyntheticApiModelOutline0.m$1(animationBackground)) {
            return defpackage.goh.b;
        }
        defpackage.goh gohVar = defpackage.goh.b;
        return new defpackage.gof(ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m(animationBackground)));
    }

    private static final defpackage.goi j(int i) {
        new defpackage.gms().a(7);
        return i == 0 ? defpackage.goi.b : defpackage.goi.a;
    }

    private static final androidx.window.extensions.embedding.AnimationBackground k(defpackage.goh gohVar) {
        new defpackage.gms().a(5);
        if (gohVar instanceof defpackage.gof) {
            androidx.window.extensions.embedding.AnimationBackground animationBackgroundM = ddz$.ExternalSyntheticApiModelOutline0.m(((defpackage.gof) gohVar).a);
            if (animationBackgroundM != null) {
                return animationBackgroundM;
            }
            defpackage.aooh.g();
            return null;
        }
        androidx.window.extensions.embedding.AnimationBackground animationBackgroundM2 = ddz$.ExternalSyntheticApiModelOutline0.m();
        if (animationBackgroundM2 != null) {
            return animationBackgroundM2;
        }
        defpackage.aooh.g();
        return null;
    }

    private static final int l(defpackage.goi goiVar) {
        new defpackage.gms().a(7);
        return defpackage.aooh.n(goiVar, defpackage.goi.b) ? 0 : -1;
    }

    public final gnn a(androidx.window.extensions.embedding.ActivityStack activityStack) {
        defpackage.aooh.f(activityStack, "activityStack");
        int iE = e();
        if (iE > 0 && iE < 5) {
            return defpackage.god.a(activityStack);
        }
        java.util.List listM = ddz$.ExternalSyntheticApiModelOutline0.m(activityStack);
        defpackage.aooh.e(listM, "getActivities(...)");
        return new gnn(listM, ddz$.ExternalSyntheticApiModelOutline0.m(activityStack), ddz$.ExternalSyntheticApiModelOutline0.m(activityStack));
    }

    public final defpackage.gpl b(androidx.window.extensions.embedding.SplitAttributes splitAttributes) {
        defpackage.gpk gpkVarK;
        defpackage.gpi gpiVar;
        defpackage.gnw gnwVarA;
        defpackage.aooh.f(splitAttributes, "splitAttributes");
        defpackage.gph gphVar = new defpackage.gph();
        androidx.window.extensions.embedding.SplitAttributes.SplitType splitTypeM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes);
        defpackage.aooh.e(splitTypeM, "getSplitType(...)");
        if (ddz$.ExternalSyntheticApiModelOutline0.m$2(splitTypeM)) {
            gpkVarK = defpackage.gpk.c;
        } else if (ddz$.ExternalSyntheticApiModelOutline0.m$3(splitTypeM)) {
            gpkVarK = defpackage.gpk.a;
        } else {
            if (!ddz$.ExternalSyntheticApiModelOutline0.m$4(splitTypeM)) {
                java.util.Objects.toString(splitTypeM);
                throw new java.lang.IllegalArgumentException("Unknown split type: ".concat(java.lang.String.valueOf(splitTypeM)));
            }
            defpackage.gpk gpkVar = defpackage.gpk.a;
            gpkVarK = defpackage.gus.K(ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m(splitTypeM)));
        }
        gphVar.b(gpkVarK);
        int iM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes);
        if (iM == 0) {
            gpiVar = defpackage.gpi.b;
        } else if (iM == 1) {
            gpiVar = defpackage.gpi.c;
        } else if (iM == 3) {
            gpiVar = defpackage.gpi.a;
        } else if (iM == 4) {
            gpiVar = defpackage.gpi.d;
        } else {
            if (iM != 5) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bj(iM, "Unknown layout direction: "));
            }
            gpiVar = defpackage.gpi.e;
        }
        gphVar.a = gpiVar;
        int iE = e();
        if (iE >= 5 && iE < 7) {
            defpackage.goh gohVar = defpackage.goh.b;
            defpackage.goi goiVar = defpackage.goi.a;
            androidx.window.extensions.embedding.AnimationBackground animationBackgroundM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes);
            defpackage.aooh.e(animationBackgroundM, "getAnimationBackground(...)");
            gphVar.b = defpackage.gus.N(i(animationBackgroundM), goiVar, goiVar, goiVar);
        }
        if (e() >= 7) {
            defpackage.goh gohVar2 = defpackage.goh.b;
            androidx.window.extensions.embedding.AnimationBackground animationBackgroundM2 = ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes));
            defpackage.aooh.e(animationBackgroundM2, "getAnimationBackground(...)");
            gphVar.b = defpackage.gus.N(i(animationBackgroundM2), j(ddz$.ExternalSyntheticApiModelOutline0.m$1(ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes))), j(ddz$.ExternalSyntheticApiModelOutline0.m$2(ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes))), j(ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes))));
        }
        if (e() >= 6) {
            androidx.window.extensions.embedding.DividerAttributes dividerAttributesM = ddz$.ExternalSyntheticApiModelOutline0.m(splitAttributes);
            new defpackage.gms().a(6);
            if (dividerAttributesM == null) {
                gnwVarA = defpackage.gnw.c;
            } else {
                int iM2 = ddz$.ExternalSyntheticApiModelOutline0.m(dividerAttributesM);
                if (iM2 == 1) {
                    gnu gnuVar = new gnu();
                    gnuVar.c(ddz$.ExternalSyntheticApiModelOutline0.m$1(dividerAttributesM));
                    gnuVar.b(ddz$.ExternalSyntheticApiModelOutline0.m$2(dividerAttributesM));
                    gnwVarA = gnuVar.a();
                } else if (iM2 != 2) {
                    android.util.Log.w(d, defpackage.a.bg(dividerAttributesM, "Unknown divider type ", ".dividerType, default to fixed divider type"));
                    gnu gnuVar2 = new gnu();
                    gnuVar2.c(ddz$.ExternalSyntheticApiModelOutline0.m$1(dividerAttributesM));
                    gnuVar2.b(ddz$.ExternalSyntheticApiModelOutline0.m$2(dividerAttributesM));
                    gnwVarA = gnuVar2.a();
                } else {
                    gns gnsVar = gns.c;
                    int iM$1 = ddz$.ExternalSyntheticApiModelOutline0.m$1(dividerAttributesM);
                    defpackage.gnw gnwVar = defpackage.gnw.c;
                    defpackage.gus.Q(iM$1);
                    int iM$2 = ddz$.ExternalSyntheticApiModelOutline0.m$2(dividerAttributesM);
                    defpackage.gus.P(iM$2);
                    gnwVarA = new gnt(iM$1, iM$2, (ddz$.ExternalSyntheticApiModelOutline0.m(dividerAttributesM) == -1.0f && ddz$.ExternalSyntheticApiModelOutline0.m$1(dividerAttributesM) == -1.0f) ? gns.c : new gnr(ddz$.ExternalSyntheticApiModelOutline0.m(dividerAttributesM), ddz$.ExternalSyntheticApiModelOutline0.m$1(dividerAttributesM)), e() >= 7 && ddz$.ExternalSyntheticApiModelOutline0.m(dividerAttributesM));
                }
            }
            gphVar.c = gnwVarA;
        }
        return gphVar.a();
    }

    public final androidx.window.extensions.embedding.SplitAttributes c(defpackage.gpl gplVar) {
        int i;
        androidx.window.extensions.embedding.DividerAttributes dividerAttributesM;
        if (gplVar == null) {
            defpackage.aooh.i("splitAttributes");
        }
        int i2 = 2;
        if (new defpackage.gms().a < 2) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        androidx.window.extensions.embedding.SplitAttributes.Builder builderM = ddz$.ExternalSyntheticApiModelOutline0.m(new androidx.window.extensions.embedding.SplitAttributes.Builder(), h(gplVar.b));
        defpackage.gpi gpiVar = gplVar.c;
        if (defpackage.aooh.n(gpiVar, defpackage.gpi.a)) {
            i = 3;
        } else if (defpackage.aooh.n(gpiVar, defpackage.gpi.b)) {
            i = 0;
        } else if (defpackage.aooh.n(gpiVar, defpackage.gpi.c)) {
            i = 1;
        } else if (defpackage.aooh.n(gpiVar, defpackage.gpi.d)) {
            i = 4;
        } else {
            if (!defpackage.aooh.n(gpiVar, defpackage.gpi.e)) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bg(gplVar, "Unsupported layoutDirection:", ".layoutDirection"));
            }
            i = 5;
        }
        androidx.window.extensions.embedding.SplitAttributes.Builder builderM2 = ddz$.ExternalSyntheticApiModelOutline0.m(builderM, i);
        defpackage.aooh.e(builderM2, "setLayoutDirection(...)");
        if (new defpackage.gms().a >= 5) {
            ddz$.ExternalSyntheticApiModelOutline0.m(builderM2, g());
        }
        int i3 = new defpackage.gms().a;
        if (i3 >= 5 && i3 < 7) {
            ddz$.ExternalSyntheticApiModelOutline0.m(builderM2, k(gplVar.d.a));
        }
        if (new defpackage.gms().a >= 7) {
            androidx.window.extensions.embedding.AnimationParams.Builder builder = new androidx.window.extensions.embedding.AnimationParams.Builder();
            defpackage.goj gojVar = gplVar.d;
            androidx.window.extensions.embedding.AnimationParams animationParamsM = ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m$2(ddz$.ExternalSyntheticApiModelOutline0.m$1(ddz$.ExternalSyntheticApiModelOutline0.m(ddz$.ExternalSyntheticApiModelOutline0.m(builder, k(gojVar.a)), l(gojVar.b)), l(gojVar.c)), l(gojVar.d)));
            defpackage.aooh.e(animationParamsM, "build(...)");
            ddz$.ExternalSyntheticApiModelOutline0.m(builderM2, animationParamsM);
        }
        if (new defpackage.gms().a >= 6) {
            gnt gntVar = gplVar.e;
            if (gntVar == null) {
                defpackage.aooh.i("dividerAttributes");
            }
            new defpackage.gms().a(6);
            if (gntVar == defpackage.gnw.c) {
                dividerAttributesM = null;
            } else {
                if (gntVar instanceof gnv) {
                    i2 = 1;
                } else if (!(gntVar instanceof gnt)) {
                    java.util.Objects.toString(gntVar);
                    throw new java.lang.IllegalArgumentException("Unknown divider attributes ".concat(java.lang.String.valueOf(gntVar)));
                }
                androidx.window.extensions.embedding.DividerAttributes.Builder builderM3 = ddz$.ExternalSyntheticApiModelOutline0.m(new androidx.window.extensions.embedding.DividerAttributes.Builder(i2), gntVar.e);
                int i4 = gntVar.d;
                androidx.window.extensions.embedding.DividerAttributes.Builder builderM$1 = ddz$.ExternalSyntheticApiModelOutline0.m$1(builderM3, i4);
                defpackage.aooh.e(builderM$1, "setWidthDp(...)");
                if (gntVar instanceof gnt) {
                    gnt gntVar2 = gntVar;
                    gnr gnrVar = gntVar2.a;
                    if (gnrVar instanceof gnr) {
                        gnr gnrVar2 = gnrVar;
                        ddz$.ExternalSyntheticApiModelOutline0.m$1(ddz$.ExternalSyntheticApiModelOutline0.m(builderM$1, gnrVar2.a), gnrVar2.b);
                    }
                    if (new defpackage.gms().a >= 7) {
                        ddz$.ExternalSyntheticApiModelOutline0.m(builderM$1, gntVar2.b);
                    }
                }
                if (new defpackage.gms().a == 7 && i4 == 0) {
                    ddz$.ExternalSyntheticApiModelOutline0.m$1(builderM$1, 1);
                }
                dividerAttributesM = ddz$.ExternalSyntheticApiModelOutline0.m(builderM$1);
            }
            ddz$.ExternalSyntheticApiModelOutline0.m(builderM2, dividerAttributesM);
        }
        androidx.window.extensions.embedding.SplitAttributes splitAttributesM = ddz$.ExternalSyntheticApiModelOutline0.m(builderM2);
        defpackage.aooh.e(splitAttributesM, "build(...)");
        return splitAttributesM;
    }

    public final java.util.List d(java.util.List list) {
        gpo gpoVar;
        gpo gpoVar2;
        defpackage.aooh.f(list, "splitInfoList");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.window.extensions.embedding.SplitInfo splitInfoM = ddz$.ExternalSyntheticApiModelOutline0.m(it.next());
            int iE = e();
            if (iE == 1) {
                defpackage.aooh.f(splitInfoM, "splitInfo");
                androidx.window.extensions.embedding.ActivityStack activityStackM = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                defpackage.aooh.e(activityStackM, "getPrimaryActivityStack(...)");
                gnn gnnVarA = defpackage.god.a(activityStackM);
                androidx.window.extensions.embedding.ActivityStack activityStackM$1 = ddz$.ExternalSyntheticApiModelOutline0.m$1(splitInfoM);
                defpackage.aooh.e(activityStackM$1, "getSecondaryActivityStack(...)");
                gnn gnnVarA2 = defpackage.god.a(activityStackM$1);
                defpackage.aooh.f(splitInfoM, "splitInfo");
                defpackage.gph gphVar = new defpackage.gph();
                defpackage.gpk gpkVar = defpackage.gpk.a;
                float fM = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                defpackage.gpk gpkVarK = defpackage.gpk.a;
                if (fM != gpkVarK.d) {
                    gpkVarK = defpackage.gus.K(fM);
                }
                gphVar.b(gpkVarK);
                gphVar.a = defpackage.gpi.a;
                gpoVar2 = new gpo(gnnVarA, gnnVarA2, gphVar.a(), (android.os.IBinder) null, (androidx.window.extensions.embedding.SplitInfo.Token) null);
            } else {
                if (iE == 2) {
                    defpackage.apnt apntVar = this.f;
                    defpackage.aooh.f(splitInfoM, "splitInfo");
                    java.lang.Object obj = apntVar.a;
                    androidx.window.extensions.embedding.ActivityStack activityStackM2 = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(activityStackM2, "getPrimaryActivityStack(...)");
                    gnn gnnVarA3 = defpackage.god.a(activityStackM2);
                    androidx.window.extensions.embedding.ActivityStack activityStackM$2 = ddz$.ExternalSyntheticApiModelOutline0.m$1(splitInfoM);
                    defpackage.aooh.e(activityStackM$2, "getSecondaryActivityStack(...)");
                    gnn gnnVarA4 = defpackage.god.a(activityStackM$2);
                    androidx.window.extensions.embedding.SplitAttributes splitAttributesM = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(splitAttributesM, "getSplitAttributes(...)");
                    gpoVar = new gpo(gnnVarA3, gnnVarA4, ((defpackage.goe) obj).b(splitAttributesM), (android.os.IBinder) null, (androidx.window.extensions.embedding.SplitInfo.Token) null);
                } else if (iE < 3 || iE >= 5) {
                    androidx.window.extensions.embedding.ActivityStack activityStackM3 = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(activityStackM3, "getPrimaryActivityStack(...)");
                    gnn gnnVarA5 = a(activityStackM3);
                    androidx.window.extensions.embedding.ActivityStack activityStackM$3 = ddz$.ExternalSyntheticApiModelOutline0.m$1(splitInfoM);
                    defpackage.aooh.e(activityStackM$3, "getSecondaryActivityStack(...)");
                    gnn gnnVarA6 = a(activityStackM$3);
                    androidx.window.extensions.embedding.SplitAttributes splitAttributesM2 = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(splitAttributesM2, "getSplitAttributes(...)");
                    defpackage.gpl gplVarB = b(splitAttributesM2);
                    androidx.window.extensions.embedding.SplitInfo.Token tokenM = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(tokenM, "getSplitInfoToken(...)");
                    defpackage.aooh.f(tokenM, "token");
                    gpoVar = new gpo(gnnVarA5, gnnVarA6, gplVarB, (android.os.IBinder) null, tokenM);
                } else {
                    defpackage.apnt apntVar2 = this.e;
                    defpackage.aooh.f(splitInfoM, "splitInfo");
                    java.lang.Object obj2 = apntVar2.a;
                    androidx.window.extensions.embedding.ActivityStack activityStackM4 = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(activityStackM4, "getPrimaryActivityStack(...)");
                    gnn gnnVarA7 = defpackage.god.a(activityStackM4);
                    androidx.window.extensions.embedding.ActivityStack activityStackM$4 = ddz$.ExternalSyntheticApiModelOutline0.m$1(splitInfoM);
                    defpackage.aooh.e(activityStackM$4, "getSecondaryActivityStack(...)");
                    gnn gnnVarA8 = defpackage.god.a(activityStackM$4);
                    androidx.window.extensions.embedding.SplitAttributes splitAttributesM3 = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(splitAttributesM3, "getSplitAttributes(...)");
                    defpackage.gpl gplVarB2 = ((defpackage.goe) obj2).b(splitAttributesM3);
                    android.os.IBinder iBinderM = ddz$.ExternalSyntheticApiModelOutline0.m(splitInfoM);
                    defpackage.aooh.e(iBinderM, "getToken(...)");
                    gpoVar2 = new gpo(gnnVarA7, gnnVarA8, gplVarB2, iBinderM);
                }
                gpoVar2 = gpoVar;
            }
            arrayList.add(gpoVar2);
        }
        return arrayList;
    }
}
