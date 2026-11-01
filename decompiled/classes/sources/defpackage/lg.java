package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lg {
    private static defpackage.lg b;
    private java.util.WeakHashMap c;
    private final java.util.WeakHashMap d = new java.util.WeakHashMap(0);
    private android.util.TypedValue e;
    private boolean f;
    private defpackage.hn g;
    private static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    private static final defpackage.add h = new defpackage.add(6);

    public static synchronized android.graphics.PorterDuffColorFilter b(int i, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        defpackage.add addVar = h;
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) addVar.a(java.lang.Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized defpackage.lg e() {
        defpackage.lg lgVar;
        lgVar = b;
        if (lgVar == null) {
            lgVar = new defpackage.lg();
            b = lgVar;
        }
        return lgVar;
    }

    static void g(android.graphics.drawable.Drawable drawable, lq lqVar, int[] iArr) {
        android.content.res.ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            android.util.Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof android.graphics.drawable.LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        android.graphics.PorterDuffColorFilter porterDuffColorFilterB = null;
        if (lqVar.d) {
            colorStateList = lqVar.a;
        } else {
            if (!lqVar.c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        android.graphics.PorterDuff.Mode mode = lqVar.c ? lqVar.b : a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterB);
    }

    private final synchronized android.graphics.drawable.Drawable i(android.content.Context context, long j) {
        java.lang.ref.WeakReference weakReference;
        defpackage.adb adbVar = (defpackage.adb) this.d.get(context);
        if (adbVar != null && (weakReference = (java.lang.ref.WeakReference) adbVar.d(j)) != null) {
            android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            adbVar.h(j);
        }
        return null;
    }

    private final synchronized void j(android.content.Context context, long j, android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            java.util.WeakHashMap weakHashMap = this.d;
            defpackage.adb adbVar = (defpackage.adb) weakHashMap.get(context);
            if (adbVar == null) {
                adbVar = new defpackage.adb(10);
                weakHashMap.put(context, adbVar);
            }
            adbVar.g(j, new java.lang.ref.WeakReference(constantState));
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01be A[DONT_GENERATE, PHI: r0
      0x01be: PHI (r0v3 android.content.res.ColorStateList) = (r0v2 android.content.res.ColorStateList), (r0v7 android.content.res.ColorStateList) binds: [B:9:0x0016, B:54:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:77:0x01be, please report this as an issue */
    final synchronized android.content.res.ColorStateList a(android.content.Context context, int i) {
        android.content.res.ColorStateList colorStateListA;
        defpackage.aed aedVar;
        java.util.WeakHashMap weakHashMap = this.c;
        colorStateListA = (weakHashMap == null || (aedVar = (defpackage.aed) weakHashMap.get(context)) == null) ? null : (android.content.res.ColorStateList) aee.a(aedVar, i);
        if (colorStateListA == null) {
            defpackage.hn hnVar = this.g;
            if (hnVar == null) {
                colorStateListA = null;
            } else if (i == 2131230832) {
                colorStateListA = defpackage.dwk.a(context.getResources(), 2131099701, context.getTheme());
            } else if (i == 2131230878) {
                colorStateListA = defpackage.dwk.a(context.getResources(), 2131099704, context.getTheme());
            } else if (i == 2131230877) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                android.content.res.ColorStateList colorStateListC = defpackage.lo.c(context, 2130969116);
                if (colorStateListC == null || !colorStateListC.isStateful()) {
                    iArr[0] = defpackage.lo.a;
                    iArr2[0] = defpackage.lo.a(context, 2130969116);
                    iArr[1] = defpackage.lo.d;
                    iArr2[1] = defpackage.lo.b(context, 2130968944);
                    iArr[2] = defpackage.lo.e;
                    iArr2[2] = defpackage.lo.b(context, 2130969116);
                } else {
                    int[] iArr3 = defpackage.lo.a;
                    iArr[0] = iArr3;
                    iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                    iArr[1] = defpackage.lo.d;
                    iArr2[1] = defpackage.lo.b(context, 2130968944);
                    iArr[2] = defpackage.lo.e;
                    iArr2[2] = colorStateListC.getDefaultColor();
                }
                colorStateListA = new android.content.res.ColorStateList(iArr, iArr2);
            } else if (i == 2131230820) {
                colorStateListA = defpackage.hn.b(context, defpackage.lo.b(context, 2130968932));
            } else if (i == 2131230814) {
                colorStateListA = defpackage.hn.b(context, 0);
            } else if (i == 2131230819) {
                colorStateListA = defpackage.hn.b(context, defpackage.lo.b(context, 2130968918));
            } else if (i == 2131230873 || i == 2131230874) {
                colorStateListA = defpackage.dwk.a(context.getResources(), 2131099703, context.getTheme());
            } else if (defpackage.hn.a(hnVar.b, i)) {
                colorStateListA = defpackage.lo.c(context, 2130968946);
            } else if (defpackage.hn.a(hnVar.e, i)) {
                colorStateListA = defpackage.dwk.a(context.getResources(), 2131099700, context.getTheme());
            } else if (defpackage.hn.a(hnVar.f, i)) {
                colorStateListA = defpackage.dwk.a(context.getResources(), 2131099699, context.getTheme());
            } else if (i == 2131230870) {
                colorStateListA = defpackage.dwk.a(context.getResources(), 2131099702, context.getTheme());
                i = 2131230870;
            } else {
                colorStateListA = null;
            }
            if (colorStateListA != null) {
                java.util.WeakHashMap weakHashMap2 = this.c;
                if (weakHashMap2 == null) {
                    weakHashMap2 = new java.util.WeakHashMap();
                    this.c = weakHashMap2;
                }
                defpackage.aed aedVar2 = (defpackage.aed) weakHashMap2.get(context);
                if (aedVar2 == null) {
                    aedVar2 = new defpackage.aed(null);
                    this.c.put(context, aedVar2);
                }
                int i2 = aedVar2.d;
                if (i2 == 0 || i > aedVar2.b[i2 - 1]) {
                    if (aedVar2.a && i2 >= aedVar2.b.length) {
                        aee.b(aedVar2);
                    }
                    int i3 = aedVar2.d;
                    int[] iArr4 = aedVar2.b;
                    if (i3 >= iArr4.length) {
                        int iC = defpackage.aei.c((i3 + 1) << 2) / 4;
                        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr4, iC);
                        defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
                        aedVar2.b = iArrCopyOf;
                        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(aedVar2.c, iC);
                        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                        aedVar2.c = objArrCopyOf;
                    }
                    aedVar2.b[i3] = i;
                    aedVar2.c[i3] = colorStateListA;
                    aedVar2.d = i3 + 1;
                } else {
                    aedVar2.f(i, colorStateListA);
                }
            }
        }
        return colorStateListA;
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:73:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context context, int i, boolean z) {
        android.graphics.drawable.Drawable drawable;
        int i2;
        int i3 = i;
        synchronized (this) {
            boolean z2 = false;
            if (!this.f) {
                this.f = true;
                android.graphics.drawable.Drawable drawableC = c(context, 2131230890);
                if (drawableC == null || (!(drawableC instanceof defpackage.gmf) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f = false;
                    throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            android.util.TypedValue typedValue = this.e;
            if (typedValue == null) {
                typedValue = new android.util.TypedValue();
                this.e = typedValue;
            }
            context.getResources().getValue(i3, typedValue, true);
            long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
            android.graphics.drawable.Drawable drawableI = i(context, j);
            drawable = null;
            mode = null;
            android.graphics.PorterDuff.Mode mode = null;
            if (drawableI == null) {
                if (this.g == null) {
                    drawableI = null;
                } else if (i3 == 2131230828) {
                    drawableI = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{c(context, 2131230827), c(context, 2131230829)});
                } else if (i3 == 2131230863) {
                    drawableI = defpackage.hn.c(this, context, 2131165245);
                } else if (i3 == 2131230862) {
                    drawableI = defpackage.hn.c(this, context, 2131165246);
                } else if (i3 == 2131230864) {
                    drawableI = defpackage.hn.c(this, context, 2131165247);
                    i3 = 2131230864;
                } else {
                    drawableI = null;
                }
                if (drawableI != null) {
                    drawableI.setChangingConfigurations(typedValue.changingConfigurations);
                    j(context, j, drawableI);
                }
            }
            if (drawableI == null) {
                drawableI = context.getDrawable(i3);
            }
            if (drawableI == null) {
                drawable = drawableI;
            } else {
                android.content.res.ColorStateList colorStateListA = a(context, i3);
                if (colorStateListA != null) {
                    android.graphics.drawable.Drawable drawableMutate = drawableI.mutate();
                    drawableMutate.setTintList(colorStateListA);
                    if (this.g != null && i3 == 2131230877) {
                        mode = android.graphics.PorterDuff.Mode.MULTIPLY;
                    }
                    if (mode != null) {
                        drawableMutate.setTintMode(mode);
                    }
                    drawable = drawableMutate;
                } else {
                    defpackage.hn hnVar = this.g;
                    if (hnVar != null) {
                        int i4 = 2130968946;
                        if (i3 == 2131230872) {
                            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawableI;
                            android.graphics.drawable.Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                            int iB = defpackage.lo.b(context, 2130968946);
                            android.graphics.PorterDuff.Mode mode2 = defpackage.ho.a;
                            defpackage.hn.d(drawableFindDrawableByLayerId, iB, mode2);
                            defpackage.hn.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), defpackage.lo.b(context, 2130968946), mode2);
                            defpackage.hn.d(layerDrawable.findDrawableByLayerId(android.R.id.progress), defpackage.lo.b(context, 2130968944), mode2);
                        } else if (i3 == 2131230863 || i3 == 2131230862 || i3 == 2131230864) {
                            android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) drawableI;
                            android.graphics.drawable.Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                            int iA = defpackage.lo.a(context, 2130968946);
                            android.graphics.PorterDuff.Mode mode3 = defpackage.ho.a;
                            defpackage.hn.d(drawableFindDrawableByLayerId2, iA, mode3);
                            defpackage.hn.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), defpackage.lo.b(context, 2130968944), mode3);
                            defpackage.hn.d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), defpackage.lo.b(context, 2130968944), mode3);
                        } else {
                            int[] iArr = hnVar.a;
                            android.graphics.PorterDuff.Mode mode4 = defpackage.ho.a;
                            if (defpackage.hn.a(iArr, i3)) {
                                i2 = -1;
                                z2 = true;
                            } else {
                                if (defpackage.hn.a(hnVar.c, i3)) {
                                    i2 = -1;
                                    i4 = 2130968944;
                                } else {
                                    boolean zA = defpackage.hn.a(hnVar.d, i3);
                                    i4 = android.R.attr.colorBackground;
                                    if (zA) {
                                        mode4 = android.graphics.PorterDuff.Mode.MULTIPLY;
                                    } else if (i3 == 2131230849) {
                                        i2 = 41;
                                        i4 = 16842800;
                                    } else if (i3 != 2131230831) {
                                        i4 = 0;
                                        i2 = -1;
                                    }
                                    i2 = -1;
                                }
                                z2 = true;
                            }
                            if (z2) {
                                android.graphics.drawable.Drawable drawableMutate2 = drawableI.mutate();
                                drawableMutate2.setColorFilter(defpackage.ho.b(defpackage.lo.b(context, i4), mode4));
                                if (i2 != -1) {
                                    drawableMutate2.setAlpha(i2);
                                }
                            } else if (!z) {
                            }
                        }
                        drawable = drawableI;
                    } else if (!z) {
                        drawable = drawableI;
                    }
                }
            }
            if (drawable != null) {
                defpackage.iz.b(drawable);
            }
        }
        return drawable;
    }

    public final synchronized void f(android.content.Context context) {
        defpackage.adb adbVar = (defpackage.adb) this.d.get(context);
        if (adbVar != null) {
            adbVar.f();
        }
    }

    public final synchronized void h(defpackage.hn hnVar) {
        this.g = hnVar;
    }
}
