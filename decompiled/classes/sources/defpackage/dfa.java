package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfa {
    public dfa() {
        defpackage.ekb ekbVar = defpackage.ekb.b;
    }

    public static final void a(android.view.View view, float[] fArr, android.graphics.Matrix matrix, int[] iArr) {
        matrix.reset();
        android.view.View view2 = view;
        fn$.ExternalSyntheticApiModelOutline0.m(view2, matrix);
        android.view.ViewParent parent = view2.getParent();
        while (parent instanceof android.view.View) {
            view2 = parent;
            parent = view2.getParent();
        }
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final void b(android.view.View view) {
        fn$.ExternalSyntheticApiModelOutline0.m(view, false);
    }

    public static final boolean c(android.view.MotionEvent motionEvent, int i) {
        return (java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m(motionEvent, i)) & Integer.MAX_VALUE) < 2139095040 && (java.lang.Float.floatToRawIntBits(da$.ExternalSyntheticApiModelOutline0.m$1(motionEvent, i)) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final android.view.View d(android.view.View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = java.lang.Math.min(k(view, 2131429434), k(view, 2131429437));
        android.view.View view2 = view;
        int i = 0;
        android.view.View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                return !(view.getParent() instanceof android.view.ViewGroup) ? view2 : view;
            }
            if (e(view) != null) {
                return view;
            }
            i++;
            java.lang.Object objD = defpackage.dzp.d(view);
            android.view.View view4 = view2;
            view2 = view;
            view = objD instanceof android.view.View ? (android.view.View) objD : null;
            view3 = view4;
        }
        return view3;
    }

    public static final defpackage.dfl e(android.view.View view) {
        java.lang.Object tag = view.getTag(2131427459);
        java.lang.ref.WeakReference weakReference = tag instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) tag : null;
        if (weakReference != null) {
            return (defpackage.dfl) weakReference.get();
        }
        return null;
    }

    public static final java.lang.String f(int i, defpackage.cav cavVar) {
        return ((android.content.res.Resources) cavVar.e(defpackage.dep.c)).getString(i);
    }

    public static final java.lang.String g(int i, java.lang.Object[] objArr, defpackage.cav cavVar) {
        return ((android.content.res.Resources) cavVar.e(defpackage.dep.c)).getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public static final defpackage.aomy h(defpackage.ddl ddlVar, defpackage.ems emsVar) {
        if (emsVar.a().compareTo(defpackage.emq.a) <= 0) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(emsVar, ddlVar, "Cannot configure ", " to disposeComposition at Lifecycle ON_DESTROY: ", "is already destroyed"));
        }
        defpackage.mm mmVar = new defpackage.mm(ddlVar, 4);
        emsVar.c(mmVar);
        return new defpackage.bev(emsVar, mmVar, 8, null);
    }

    public static final android.graphics.Typeface i(java.lang.String str, defpackage.dnd dndVar, int i) {
        if (i == 0) {
            if (defpackage.aooh.n(dndVar, defpackage.dnd.e) && (str == null || str.length() == 0)) {
                return android.graphics.Typeface.DEFAULT;
            }
            i = 0;
        }
        if (i == 0 && defpackage.aooh.n(dndVar, defpackage.dnd.g) && (str == null || str.length() == 0)) {
            return android.graphics.Typeface.DEFAULT_BOLD;
        }
        return ft$.ExternalSyntheticApiModelOutline0.m(str == null ? android.graphics.Typeface.DEFAULT : android.graphics.Typeface.create(str, 0), dndVar.h, i == 1);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    public static final java.lang.Object j(int i, java.lang.Object obj, defpackage.dmp dmpVar, defpackage.dnd dndVar, int i2) {
        boolean z;
        boolean z2;
        int i3;
        if (!(obj instanceof android.graphics.Typeface)) {
            return obj;
        }
        boolean z3 = true;
        if ((i & 1) == 0 || defpackage.aooh.n(dmpVar.b(), dndVar)) {
            z = false;
        } else {
            defpackage.dnd dndVar2 = defpackage.dnd.c;
            if (dndVar.compareTo(dndVar2) < 0 || dmpVar.b().compareTo(dndVar2) >= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if ((i & 2) != 0) {
            dmpVar.c();
            if (i2 == 0) {
                z2 = false;
                i2 = 0;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            if (!z) {
                i3 = dmpVar.b().h;
            }
            if (z2) {
                if (i2 != 1) {
                }
                return ft$.ExternalSyntheticApiModelOutline0.m((android.graphics.Typeface) obj, i3, z3);
            }
            dmpVar.c();
            z3 = false;
            return ft$.ExternalSyntheticApiModelOutline0.m((android.graphics.Typeface) obj, i3, z3);
        }
        if (!z) {
            return obj;
        }
        i3 = dndVar.h;
        if (z2) {
            if (i2 != 1) {
            }
            return ft$.ExternalSyntheticApiModelOutline0.m((android.graphics.Typeface) obj, i3, z3);
        }
        dmpVar.c();
        z3 = false;
        return ft$.ExternalSyntheticApiModelOutline0.m((android.graphics.Typeface) obj, i3, z3);
    }

    private static final int k(android.view.View view, int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        java.lang.Object obj = null;
        while (view != null) {
            java.lang.Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!defpackage.aooh.n(tag, obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i2 = i3;
            }
            i3++;
            java.lang.Object objD = defpackage.dzp.d(view);
            view = objD instanceof android.view.View ? (android.view.View) objD : null;
        }
        return i2;
    }
}
