package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dzo {
    static java.lang.CharSequence a(android.view.View view) {
        return ft$.ExternalSyntheticApiModelOutline0.m(view);
    }

    public static java.lang.Object b(android.view.View view, int i) {
        return ft$.ExternalSyntheticApiModelOutline0.m(view, i);
    }

    static void c(android.view.View view, boolean z) {
        ft$.ExternalSyntheticApiModelOutline0.m(view, z);
    }

    static void d(android.view.View view, java.lang.CharSequence charSequence) {
        ft$.ExternalSyntheticApiModelOutline0.m(view, charSequence);
    }

    static boolean e(android.view.View view) {
        return ft$.ExternalSyntheticApiModelOutline0.m(view);
    }

    static boolean f(android.view.View view) {
        return ft$.ExternalSyntheticApiModelOutline0.m$1(view);
    }

    static int g(int i) {
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 4) {
            i2 = 8;
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i != 256) {
                if (i == 512) {
                    return 9;
                }
                throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "type needs to be >= FIRST and <= LAST, type="));
            }
        }
        return i2;
    }

    public static final defpackage.cer h(defpackage.aozh aozhVar, defpackage.emq emqVar, defpackage.cav cavVar, int i, int i2) {
        defpackage.emx emxVar = (i2 & 1) != 0 ? (defpackage.emx) cavVar.e(defpackage.eom.a) : null;
        if ((i2 & 2) != 0) {
            emqVar = defpackage.emq.d;
        }
        defpackage.emq emqVar2 = emqVar;
        defpackage.aols aolsVar = defpackage.aols.a;
        java.lang.Object objC = aozhVar.c();
        defpackage.ems emsVarP = emxVar.P();
        int i3 = i & 14;
        int i4 = i << 3;
        java.lang.Object objG = cavVar.g();
        java.lang.Object obj = defpackage.cau.a;
        if (objG == obj) {
            java.lang.Object parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(objC, defpackage.cdu.c);
            cavVar.w(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        int i5 = i3 | (i4 & 7168);
        defpackage.ccp ccpVar = (defpackage.ccp) objG;
        java.lang.Object[] objArr = {aozhVar, emsVarP, emqVar2, aolsVar};
        int i6 = (i5 & 14) | 48 | (i5 & 7168);
        boolean zD = cavVar.D(emsVarP) | ((((i6 & 7168) ^ 3072) > 2048 && cavVar.z(emqVar2.ordinal())) || (i6 & 3072) == 2048) | cavVar.D(aolsVar) | ((((i6 & 14) ^ 6) > 4 && cavVar.D(aozhVar)) || (i6 & 6) == 4);
        java.lang.Object objG2 = cavVar.g();
        if (zD || objG2 == obj) {
            java.lang.Object eojVar = new defpackage.eoj(emsVarP, emqVar2, aolsVar, aozhVar, ccpVar, null);
            cavVar.w(eojVar);
            objG2 = eojVar;
        }
        defpackage.cbp.h(objArr, (defpackage.aonn) objG2, cavVar);
        return ccpVar;
    }

    public static final defpackage.eoi i(android.view.View view) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        while (view != null) {
            java.lang.Object tag = view.getTag(2131429438);
            defpackage.eoi eoiVar = tag instanceof defpackage.eoi ? (defpackage.eoi) tag : null;
            if (eoiVar != null) {
                return eoiVar;
            }
            java.lang.Object objD = defpackage.dzp.d(view);
            view = objD instanceof android.view.View ? (android.view.View) objD : null;
        }
        return null;
    }

    public static final void j(android.view.View view, defpackage.eoi eoiVar) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        view.setTag(2131429438, eoiVar);
    }

    public static final defpackage.emx k(android.view.View view) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        while (view != null) {
            java.lang.Object tag = view.getTag(2131429434);
            defpackage.emx emxVar = tag instanceof defpackage.emx ? (defpackage.emx) tag : null;
            if (emxVar != null) {
                return emxVar;
            }
            java.lang.Object objD = defpackage.dzp.d(view);
            view = objD instanceof android.view.View ? (android.view.View) objD : null;
        }
        return null;
    }

    public static final void l(android.view.View view, defpackage.emx emxVar) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        view.setTag(2131429434, emxVar);
    }

    public static final defpackage.eoe m(defpackage.eoi eoiVar) {
        return eoiVar instanceof defpackage.emn ? ((defpackage.emn) eoiVar).R() : eoz.a;
    }

    public static final defpackage.eoq n(defpackage.eoi eoiVar) {
        return eoiVar instanceof defpackage.emn ? ((defpackage.emn) eoiVar).T() : defpackage.eoo.a;
    }
}
