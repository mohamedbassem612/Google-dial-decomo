package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class giy implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ giy(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0279  */
    /* JADX WARN: Code duplicated, block: B:160:0x031b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0374  */
    /* JADX WARN: Code duplicated, block: B:230:0x044e  */
    /* JADX WARN: Code duplicated, block: B:296:0x0541  */
    /* JADX WARN: Code duplicated, block: B:316:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:355:0x063b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    @Override // defpackage.aomy
    public final java.lang.Object a() throws java.lang.NoSuchFieldException, java.lang.NoSuchMethodException {
        java.lang.Class<?> returnType;
        boolean z;
        java.lang.reflect.Method declaredMethod = null;
        try {
            switch (this.$cid) {
                case 0:
                    defpackage.aoir aoirVar = defpackage.giz.a;
                    java.lang.reflect.Method methodJ = defpackage.dzk.J();
                    if (methodJ != null && (returnType = methodJ.getReturnType()) != null) {
                        java.lang.Class<?> cls = java.lang.Integer.TYPE;
                        declaredMethod = returnType.getDeclaredMethod("beginTransaction", cls, android.database.sqlite.SQLiteTransactionListener.class, cls, android.os.CancellationSignal.class);
                    }
                    break;
                case 1:
                    defpackage.aoir aoirVar2 = defpackage.giz.a;
                    java.lang.reflect.Method declaredMethod2 = android.database.sqlite.SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod2.setAccessible(true);
                    declaredMethod = declaredMethod2;
                    break;
                case 2:
                    java.lang.Class<?>[] clsArr = {ddz$.ExternalSyntheticApiModelOutline0.m$7(), ddz$.ExternalSyntheticApiModelOutline0.m$7(), ddz$.ExternalSyntheticApiModelOutline0.m$7()};
                    java.lang.Class clsM$22 = ddz$.ExternalSyntheticApiModelOutline0.m$22();
                    java.lang.reflect.Constructor declaredConstructor = clsM$22.getDeclaredConstructor(clsArr);
                    java.lang.reflect.Method method = clsM$22.getMethod("setDefaultSplitAttributes", ddz$.ExternalSyntheticApiModelOutline0.m$2());
                    java.lang.reflect.Method method2 = clsM$22.getMethod("setTag", java.lang.String.class);
                    if (declaredConstructor == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.E(declaredConstructor)) {
                        if (method == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.G(method) && defpackage.gus.D(method, ddz$.ExternalSyntheticApiModelOutline0.m$22())) {
                            if (method2 == null) {
                                defpackage.aooh.g();
                            }
                            z = defpackage.gus.G(method2) && defpackage.gus.D(method2, ddz$.ExternalSyntheticApiModelOutline0.m$22());
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                case 3:
                    java.lang.Class<?>[] clsArr2 = {java.lang.Float.TYPE};
                    java.lang.Class clsM$23 = ddz$.ExternalSyntheticApiModelOutline0.m$22();
                    java.lang.reflect.Method method3 = clsM$23.getMethod("setSplitRatio", clsArr2);
                    java.lang.reflect.Method method4 = clsM$23.getMethod("setLayoutDirection", java.lang.Integer.TYPE);
                    if (method3 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.G(method3) && defpackage.gus.D(method3, ddz$.ExternalSyntheticApiModelOutline0.m$22())) {
                        if (method4 == null) {
                            defpackage.aooh.g();
                        }
                        z = defpackage.gus.G(method4) && defpackage.gus.D(method4, ddz$.ExternalSyntheticApiModelOutline0.m$22());
                    }
                    return java.lang.Boolean.valueOf(z);
                case 4:
                    java.lang.reflect.Method method5 = ddz$.ExternalSyntheticApiModelOutline0.m$16().getMethod("getSplitInfoToken", null);
                    if (method5 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method5) && defpackage.gus.D(method5, ddz$.ExternalSyntheticApiModelOutline0.m$1()));
                case 5:
                    java.lang.reflect.Method method6 = defpackage.gow.class.getMethod("a", null);
                    if (method6 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method6) && defpackage.gus.D(method6, java.lang.String.class));
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    java.lang.reflect.Method method7 = ddz$.ExternalSyntheticApiModelOutline0.m$16().getMethod("getToken", null);
                    if (method7 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method7) && defpackage.gus.D(method7, android.os.IBinder.class));
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    java.lang.reflect.Method method8 = ddz$.ExternalSyntheticApiModelOutline0.m$21().getMethod("shouldAlwaysExpand", null);
                    if (method8 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method8) && defpackage.gus.D(method8, java.lang.Boolean.TYPE));
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    java.lang.reflect.Method method9 = ddz$.ExternalSyntheticApiModelOutline0.m$20().getMethod("getFinishPrimaryWithPlaceholder", null);
                    if (method9 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method9) && defpackage.gus.D(method9, java.lang.Integer.TYPE));
                case 9:
                    java.lang.Class<?>[] clsArr3 = {java.lang.Float.TYPE};
                    java.lang.Class clsM$19 = ddz$.ExternalSyntheticApiModelOutline0.m$19();
                    java.lang.reflect.Method method10 = clsM$19.getMethod("setSplitRatio", clsArr3);
                    java.lang.reflect.Method method11 = clsM$19.getMethod("setLayoutDirection", java.lang.Integer.TYPE);
                    java.lang.reflect.Method method12 = clsM$19.getMethod("setSticky", java.lang.Boolean.TYPE);
                    java.lang.reflect.Method method13 = clsM$19.getMethod("setFinishPrimaryWithSecondary", java.lang.Integer.TYPE);
                    if (method10 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.G(method10) && defpackage.gus.D(method10, ddz$.ExternalSyntheticApiModelOutline0.m$19())) {
                        if (method11 == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.G(method11) && defpackage.gus.D(method11, ddz$.ExternalSyntheticApiModelOutline0.m$19())) {
                            if (method12 == null) {
                                defpackage.aooh.g();
                            }
                            if (defpackage.gus.G(method12) && defpackage.gus.D(method12, ddz$.ExternalSyntheticApiModelOutline0.m$19())) {
                                if (method13 == null) {
                                    defpackage.aooh.g();
                                }
                                z = defpackage.gus.G(method13) && defpackage.gus.D(method13, ddz$.ExternalSyntheticApiModelOutline0.m$19());
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                case 10:
                    java.lang.reflect.Method method14 = ddz$.ExternalSyntheticApiModelOutline0.m$2().getMethod("getAnimationParams", null);
                    if (method14 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method14) && defpackage.gus.D(method14, ddz$.ExternalSyntheticApiModelOutline0.m$18()));
                case 11:
                    java.lang.reflect.Method method15 = ddz$.ExternalSyntheticApiModelOutline0.m$11().getMethod("setDraggingToFullscreenAllowed", java.lang.Boolean.TYPE);
                    if (method15 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method15) && defpackage.gus.D(method15, ddz$.ExternalSyntheticApiModelOutline0.m$11()));
                case 12:
                    java.lang.Class clsM$16 = ddz$.ExternalSyntheticApiModelOutline0.m$16();
                    java.lang.reflect.Method method16 = clsM$16.getMethod("getPrimaryActivityStack", null);
                    java.lang.reflect.Method method17 = clsM$16.getMethod("getSecondaryActivityStack", null);
                    java.lang.reflect.Method method18 = clsM$16.getMethod("getSplitRatio", null);
                    if (method16 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.G(method16) && defpackage.gus.D(method16, ddz$.ExternalSyntheticApiModelOutline0.m$17())) {
                        if (method17 == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.G(method17) && defpackage.gus.D(method17, ddz$.ExternalSyntheticApiModelOutline0.m$17())) {
                            if (method18 == null) {
                                defpackage.aooh.g();
                            }
                            z = defpackage.gus.G(method18) && defpackage.gus.D(method18, java.lang.Float.TYPE);
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                case 13:
                    java.lang.Class clsM$15 = ddz$.ExternalSyntheticApiModelOutline0.m$15();
                    java.lang.reflect.Method method19 = clsM$15.getMethod("getParentWindowMetrics", null);
                    java.lang.reflect.Method method20 = clsM$15.getMethod("getParentConfiguration", null);
                    java.lang.reflect.Method method21 = clsM$15.getMethod("getDefaultSplitAttributes", null);
                    java.lang.reflect.Method method22 = clsM$15.getMethod("areDefaultConstraintsSatisfied", null);
                    java.lang.reflect.Method method23 = clsM$15.getMethod("getParentWindowLayoutInfo", null);
                    java.lang.reflect.Method method24 = clsM$15.getMethod("getSplitRuleTag", null);
                    if (method19 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.G(method19) && defpackage.gus.D(method19, baa$.ExternalSyntheticApiModelOutline1.m())) {
                        if (method20 == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.G(method20) && defpackage.gus.D(method20, android.content.res.Configuration.class)) {
                            if (method21 == null) {
                                defpackage.aooh.g();
                            }
                            if (defpackage.gus.G(method21) && defpackage.gus.D(method21, ddz$.ExternalSyntheticApiModelOutline0.m$2())) {
                                if (method22 == null) {
                                    defpackage.aooh.g();
                                }
                                if (defpackage.gus.G(method22) && defpackage.gus.D(method22, java.lang.Boolean.TYPE)) {
                                    if (method23 == null) {
                                        defpackage.aooh.g();
                                    }
                                    if (defpackage.gus.G(method23) && defpackage.gus.D(method23, androidx.window.extensions.layout.WindowLayoutInfo.class)) {
                                        if (method24 == null) {
                                            defpackage.aooh.g();
                                        }
                                        z = defpackage.gus.G(method24) && defpackage.gus.D(method24, java.lang.String.class);
                                    }
                                }
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                case 14:
                    java.lang.Class clsM$14 = ddz$.ExternalSyntheticApiModelOutline0.m$14();
                    java.lang.reflect.Method method25 = clsM$14.getMethod("getDimAreaBehavior", null);
                    java.lang.reflect.Method method26 = ddz$.ExternalSyntheticApiModelOutline0.m$2().getMethod("getWindowAttributes", null);
                    java.lang.reflect.Method method27 = ddz$.ExternalSyntheticApiModelOutline0.m$10().getMethod("setWindowAttributes", ddz$.ExternalSyntheticApiModelOutline0.m$14());
                    if (method25 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.G(method25) && defpackage.gus.D(method25, java.lang.Integer.TYPE)) {
                        if (method26 == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.G(method26) && defpackage.gus.D(method26, clsM$14)) {
                            if (method27 == null) {
                                defpackage.aooh.g();
                            }
                            z = defpackage.gus.G(method27) && defpackage.gus.D(method27, ddz$.ExternalSyntheticApiModelOutline0.m$10());
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                case 15:
                    java.lang.Class clsM$1 = ddz$.ExternalSyntheticApiModelOutline0.m$1();
                    java.lang.reflect.Method method28 = clsM$1.getMethod("createFromBinder", android.os.IBinder.class);
                    if (method28 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method28) && defpackage.gus.D(method28, clsM$1));
                case 16:
                    java.lang.reflect.Method method29 = ddz$.ExternalSyntheticApiModelOutline0.m$13().getMethod("setShouldAlwaysExpand", java.lang.Boolean.TYPE);
                    if (method29 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method29) && defpackage.gus.D(method29, ddz$.ExternalSyntheticApiModelOutline0.m$13()));
                case 17:
                    java.lang.Class<?>[] clsArr4 = {java.lang.Integer.TYPE};
                    java.lang.Class clsM$11 = ddz$.ExternalSyntheticApiModelOutline0.m$11();
                    java.lang.reflect.Constructor declaredConstructor2 = clsM$11.getDeclaredConstructor(clsArr4);
                    java.lang.reflect.Constructor declaredConstructor3 = clsM$11.getDeclaredConstructor(ddz$.ExternalSyntheticApiModelOutline0.m$9());
                    java.lang.reflect.Method method30 = clsM$11.getMethod("setWidthDp", java.lang.Integer.TYPE);
                    java.lang.reflect.Method method31 = clsM$11.getMethod("setPrimaryMinRatio", java.lang.Float.TYPE);
                    java.lang.reflect.Method method32 = clsM$11.getMethod("setPrimaryMaxRatio", java.lang.Float.TYPE);
                    java.lang.reflect.Method method33 = clsM$11.getMethod("setDividerColor", java.lang.Integer.TYPE);
                    if (declaredConstructor2 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.E(declaredConstructor2)) {
                        if (declaredConstructor3 == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.E(declaredConstructor3)) {
                            if (method30 == null) {
                                defpackage.aooh.g();
                            }
                            if (defpackage.gus.G(method30) && defpackage.gus.D(method30, ddz$.ExternalSyntheticApiModelOutline0.m$11())) {
                                if (method31 == null) {
                                    defpackage.aooh.g();
                                }
                                if (defpackage.gus.G(method31) && defpackage.gus.D(method31, ddz$.ExternalSyntheticApiModelOutline0.m$11())) {
                                    if (method32 == null) {
                                        defpackage.aooh.g();
                                    }
                                    if (defpackage.gus.G(method32) && defpackage.gus.D(method32, ddz$.ExternalSyntheticApiModelOutline0.m$11())) {
                                        if (method33 == null) {
                                            defpackage.aooh.g();
                                        }
                                        z = defpackage.gus.G(method33) && defpackage.gus.D(method33, ddz$.ExternalSyntheticApiModelOutline0.m$11());
                                    }
                                }
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                case 18:
                    java.lang.reflect.Method method34 = ddz$.ExternalSyntheticApiModelOutline0.m$10().getMethod("setDividerAttributes", ddz$.ExternalSyntheticApiModelOutline0.m$9());
                    if (method34 == null) {
                        defpackage.aooh.g();
                    }
                    return java.lang.Boolean.valueOf(defpackage.gus.G(method34) && defpackage.gus.D(method34, ddz$.ExternalSyntheticApiModelOutline0.m$10()));
                case 19:
                    java.lang.Class<?>[] clsArr5 = {ddz$.ExternalSyntheticApiModelOutline0.m$6()};
                    java.lang.Class clsM$8 = ddz$.ExternalSyntheticApiModelOutline0.m$8();
                    java.lang.reflect.Method method35 = clsM$8.getMethod("setAnimationBackground", clsArr5);
                    java.lang.reflect.Method method36 = clsM$8.getMethod("setOpenAnimationResId", java.lang.Integer.TYPE);
                    java.lang.reflect.Method method37 = clsM$8.getMethod("setCloseAnimationResId", java.lang.Integer.TYPE);
                    java.lang.reflect.Method method38 = clsM$8.getMethod("setChangeAnimationResId", java.lang.Integer.TYPE);
                    if (method35 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.G(method35) && defpackage.gus.D(method35, ddz$.ExternalSyntheticApiModelOutline0.m$8())) {
                        if (method36 == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.G(method36) && defpackage.gus.D(method36, ddz$.ExternalSyntheticApiModelOutline0.m$8())) {
                            if (method37 == null) {
                                defpackage.aooh.g();
                            }
                            if (defpackage.gus.G(method37) && defpackage.gus.D(method37, ddz$.ExternalSyntheticApiModelOutline0.m$8())) {
                                if (method38 == null) {
                                    defpackage.aooh.g();
                                }
                                z = defpackage.gus.G(method38) && defpackage.gus.D(method38, ddz$.ExternalSyntheticApiModelOutline0.m$8());
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                default:
                    java.lang.Class<?>[] clsArr6 = {java.lang.Integer.TYPE};
                    java.lang.Class clsM$6 = ddz$.ExternalSyntheticApiModelOutline0.m$6();
                    java.lang.reflect.Method method39 = clsM$6.getMethod("createColorBackground", clsArr6);
                    java.lang.reflect.Field declaredField = clsM$6.getDeclaredField("ANIMATION_BACKGROUND_DEFAULT");
                    java.lang.Class clsM$12 = ddz$.ExternalSyntheticApiModelOutline0.m$12();
                    java.lang.reflect.Method method40 = clsM$12.getMethod("getColor", null);
                    java.lang.reflect.Method method41 = ddz$.ExternalSyntheticApiModelOutline0.m$2().getMethod("getAnimationBackground", null);
                    java.lang.reflect.Method method42 = ddz$.ExternalSyntheticApiModelOutline0.m$10().getMethod("setAnimationBackground", ddz$.ExternalSyntheticApiModelOutline0.m$6());
                    if (method39 == null) {
                        defpackage.aooh.g();
                    }
                    if (defpackage.gus.G(method39) && defpackage.gus.D(method39, clsM$12)) {
                        if (declaredField == null) {
                            defpackage.aooh.g();
                        }
                        if (defpackage.gus.F(declaredField)) {
                            if (method40 == null) {
                                defpackage.aooh.g();
                            }
                            if (defpackage.gus.G(method40) && defpackage.gus.D(method40, java.lang.Integer.TYPE)) {
                                if (method41 == null) {
                                    defpackage.aooh.g();
                                }
                                if (defpackage.gus.G(method41) && defpackage.gus.D(method41, clsM$6)) {
                                    if (method42 == null) {
                                        defpackage.aooh.g();
                                    }
                                    z = defpackage.gus.G(method42) && defpackage.gus.D(method42, ddz$.ExternalSyntheticApiModelOutline0.m$10());
                                }
                            }
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
            }
            return declaredMethod;
        } catch (java.lang.Throwable unused) {
            return declaredMethod;
        }
    }
}
