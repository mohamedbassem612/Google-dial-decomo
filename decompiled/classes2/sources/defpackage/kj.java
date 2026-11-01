package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class kj {
    public kj(char[] cArr) {
        this((byte[]) null);
    }

    public static void l(android.view.View view, float f) {
        try {
            mp$.ExternalSyntheticApiModelOutline1.m$1(view, f);
        } catch (java.lang.LinkageError unused) {
        }
    }

    public static void m(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, android.view.View view) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
            if (parent instanceof defpackage.mc) {
                editorInfo.hintText = ((defpackage.mc) parent).a();
                return;
            }
        }
    }

    public static android.content.pm.ResolveInfo n(android.content.Context context) {
        aooh.f(context, "context");
        return context.getPackageManager().resolveActivity(new android.content.Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static java.lang.String o(defpackage.ox oxVar) throws aois {
        aooh.f(oxVar, "input");
        if (oxVar instanceof defpackage.ou) {
            return "image/*";
        }
        if (oxVar instanceof defpackage.ow) {
            return "video/*";
        }
        if (oxVar instanceof defpackage.ov) {
            throw null;
        }
        if (oxVar instanceof defpackage.ot) {
            return null;
        }
        throw new aois();
    }

    public static boolean p() {
        return android.os.Build.VERSION.SDK_INT >= 33 || baa$.ExternalSyntheticApiModelOutline1.m(30) >= 2;
    }

    public static void q() {
        if (p()) {
            ae$.ExternalSyntheticApiModelOutline0.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    public static void r(boolean z, aonn aonnVar, cav cavVar, int i) {
        int i2;
        ?? r6;
        boolean z2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(-642000585);
        if (i3 == 0) {
            i2 = (true != cbtVarB.C(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(aonnVar) : cbtVarB.D(aonnVar)) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            int i4 = defpackage.fyj.a;
            nh nhVarA = defpackage.fyj.a(cbtVarB);
            if (nhVarA == null) {
                cbtVarB.u(1512740606);
                int i5 = defpackage.nv.a;
                nhVarA = defpackage.nv.a(cbtVarB);
            } else {
                cbtVarB.u(1512737723);
            }
            cbtVarB.W(false);
            if (nhVarA == null) {
                throw new java.lang.IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            int i6 = i2 & 14;
            int i7 = i2 & 112;
            boolean zB = cbtVarB.B(nhVarA);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                fxz fxzVar = nhVarA instanceof fxz ? (fxz) nhVarA : null;
                fxy fxyVarFd = fxzVar != null ? fxzVar.fd() : null;
                nh nhVar = nhVarA instanceof nh ? nhVarA : null;
                objR = new vx(fxyVarFd, nhVar != null ? nhVar.fc() : null);
                cbtVar.ab(objR);
            }
            vx vxVar = (vx) objR;
            java.lang.Object objR2 = cbtVar.R();
            java.lang.Object obj = cau.a;
            if (objR2 == obj) {
                objR2 = cbp.a(aols.a, cbtVarB);
                cbtVar.ab(objR2);
            }
            aoss aossVar = (aoss) objR2;
            long j = cbtVar.x;
            boolean zB2 = cbtVarB.B(vxVar) | cbtVarB.A(j);
            java.lang.Object objR3 = cbtVar.R();
            if (zB2 || objR3 == obj) {
                objR3 = new defpackage.np(aossVar, new defpackage.nx(nhVarA, j));
                cbtVar.ab(objR3);
            }
            defpackage.np npVar = (defpackage.np) objR3;
            cbtVarB.u(-348514256);
            boolean zD = cbtVarB.D(npVar) | (i7 == 32 || ((i2 & 64) != 0 && cbtVarB.D(aonnVar)));
            java.lang.Object objR4 = cbtVar.R();
            if (zD || objR4 == obj) {
                objR4 = new defpackage.ny(npVar, aonnVar, 0);
                cbtVar.ab(objR4);
            }
            cbtVarB.r((aomy) objR4);
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            boolean zD2 = cbtVarB.D(npVar) | (i6 == 4);
            java.lang.Object objR5 = cbtVar.R();
            if (zD2 || objR5 == obj) {
                objR5 = new afw(npVar, z, 1);
                cbtVar.ab(objR5);
            }
            defpackage.avo.n(boolValueOf, npVar, null, (aonj) objR5, cbtVarB, i6);
            boolean zD3 = cbtVarB.D(vxVar) | cbtVarB.D(npVar);
            java.lang.Object objR6 = cbtVar.R();
            if (zD3 || objR6 == obj) {
                z2 = false;
                objR6 = new nz(vxVar, npVar, 0, (byte[]) null);
                cbtVar.ab(objR6);
            } else {
                z2 = false;
            }
            cbp.b(vxVar, npVar, (aonj) objR6, cbtVarB);
            cbtVar.W(z2);
            r6 = z2;
        } else {
            r6 = 0;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.oa(z, aonnVar, i, (int) r6);
        }
    }

    public static void s(boolean z, aomy aomyVar, cav cavVar, int i) {
        cbt cbtVarB = cavVar.b(-361453782);
        int i2 = i | 6;
        int i3 = 1;
        if ((i & 48) == 0) {
            i2 |= true != cbtVarB.D(aomyVar) ? 16 : 32;
        }
        if (cbtVarB.H((i2 & 19) != 18, i2 & 1)) {
            int i4 = defpackage.fyj.a;
            nh nhVarA = defpackage.fyj.a(cbtVarB);
            if (nhVarA == null) {
                cbtVarB.u(535274673);
                int i5 = defpackage.nv.a;
                nhVarA = defpackage.nv.a(cbtVarB);
            } else {
                cbtVarB.u(535271790);
            }
            cbtVarB.W(false);
            if (nhVarA == null) {
                throw new java.lang.IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            int i6 = i2 & 14;
            int i7 = i2 & 112;
            boolean zB = cbtVarB.B(nhVarA);
            cbt cbtVar = cbtVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == cau.a) {
                fxz fxzVar = nhVarA instanceof fxz ? (fxz) nhVarA : null;
                fxy fxyVarFd = fxzVar != null ? fxzVar.fd() : null;
                nh nhVar = nhVarA instanceof nh ? nhVarA : null;
                objR = new vx(fxyVarFd, nhVar != null ? nhVar.fc() : null);
                cbtVar.ab(objR);
            }
            vx vxVar = (vx) objR;
            long j = cbtVar.x;
            boolean zB2 = cbtVarB.B(vxVar) | cbtVarB.A(j);
            java.lang.Object objR2 = cbtVar.R();
            if (zB2 || objR2 == cau.a) {
                objR2 = new defpackage.no(new defpackage.nl(nhVarA, j));
                cbtVar.ab(objR2);
            }
            defpackage.no noVar = (defpackage.no) objR2;
            cbtVarB.u(-585307852);
            boolean zD = cbtVarB.D(noVar) | (i7 == 32);
            java.lang.Object objR3 = cbtVar.R();
            if (zD || objR3 == cau.a) {
                objR3 = new defpackage.ny(noVar, aomyVar, i3);
                cbtVar.ab(objR3);
            }
            cbtVarB.r((aomy) objR3);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            boolean zD2 = cbtVarB.D(noVar) | (i6 == 4);
            java.lang.Object objR4 = cbtVar.R();
            if (zD2 || objR4 == cau.a) {
                objR4 = new nm(noVar, 0);
                cbtVar.ab(objR4);
            }
            defpackage.avo.n(bool, noVar, null, (aonj) objR4, cbtVarB, i6);
            boolean zD3 = cbtVarB.D(vxVar) | cbtVarB.D(noVar);
            java.lang.Object objR5 = cbtVar.R();
            if (zD3 || objR5 == cau.a) {
                objR5 = new nz(vxVar, noVar, 1, (byte[]) null);
                cbtVar.ab(objR5);
            }
            cbp.b(vxVar, noVar, (aonj) objR5, cbtVarB);
            cbtVar.W(false);
            z = true;
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.oa(z, aomyVar, i, i3);
        }
    }

    public void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView, la laVar) {
        view.getLayoutParams().eA();
        rect.set(0, 0, 0, 0);
    }

    public kj(byte[] bArr) {
    }

    public kj() {
    }

    public void b(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void i(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
    }
}
