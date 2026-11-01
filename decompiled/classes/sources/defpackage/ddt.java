package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ddt {
    public static final int a(android.view.accessibility.AccessibilityManager accessibilityManager, int i, int i2) {
        return da$.ExternalSyntheticApiModelOutline0.m(accessibilityManager, i, i2);
    }

    public static final void b(ebd ebdVar, defpackage.dij dijVar) {
        defpackage.die dieVar = dijVar.b;
        if (wt.d(dijVar)) {
            defpackage.dhr dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.x);
            if (dhrVar != null) {
                ebdVar.i(new ebc((java.lang.Object) null, android.R.id.accessibilityActionPageUp, dhrVar.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            defpackage.dhr dhrVar2 = (defpackage.dhr) dieVar.g(defpackage.did.z);
            if (dhrVar2 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, android.R.id.accessibilityActionPageDown, dhrVar2.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            defpackage.dhr dhrVar3 = (defpackage.dhr) dieVar.g(defpackage.did.y);
            if (dhrVar3 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, android.R.id.accessibilityActionPageLeft, dhrVar3.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
            defpackage.dhr dhrVar4 = (defpackage.dhr) dieVar.g(defpackage.did.A);
            if (dhrVar4 != null) {
                ebdVar.i(new ebc((java.lang.Object) null, android.R.id.accessibilityActionPageRight, dhrVar4.a, (defpackage.ebo) null, (java.lang.Class) null));
            }
        }
    }

    public static final int c(dco dcoVar, defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cyd dcmVar = new dcm(cxeVar, 2, 2, 0);
        long jC = defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE);
        return ((dbc) dcoVar).a.cX(new cxh(cxfVar, cxfVar.p()), dcmVar, jC).b();
    }

    public static final int d(dco dcoVar, defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cyd dcmVar = new dcm(cxeVar, 2, 1, 0);
        long jC = defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i);
        return ((dbc) dcoVar).a.cX(new cxh(cxfVar, cxfVar.p()), dcmVar, jC).c();
    }

    public static final int e(dco dcoVar, defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cyd dcmVar = new dcm(cxeVar, 1, 2, 0);
        long jC = defpackage.dpe.c(0, i, 0, Integer.MAX_VALUE);
        return ((dbc) dcoVar).a.cX(new cxh(cxfVar, cxfVar.p()), dcmVar, jC).b();
    }

    public static final int f(dco dcoVar, defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cyd dcmVar = new dcm(cxeVar, 1, 1, 0);
        long jC = defpackage.dpe.c(0, Integer.MAX_VALUE, 0, i);
        return ((dbc) dcoVar).a.cX(new cxh(cxfVar, cxfVar.p()), dcmVar, jC).c();
    }

    public static final void g(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }
}
