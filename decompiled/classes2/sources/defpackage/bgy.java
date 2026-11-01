package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgy {
    public final ccp a = new androidx.compose.runtime.ParcelableSnapshotMutableState((java.lang.Object) null, cdu.c);
    public dji b;
    public final androidx.compose.runtime.snapshots.SnapshotStateList c;
    private final dji d;

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public bgy(dji djiVar) {
        this.d = djiVar;
        defpackage.bcm bcmVar = new defpackage.bcm(5);
        defpackage.djf djfVar = new defpackage.djf(djiVar);
        java.util.List list = djfVar.c;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ?? A = bcmVar.a(((defpackage.dje) list.get(i)).a(Integer.MIN_VALUE));
            java.util.ArrayList arrayList2 = new java.util.ArrayList(A.size());
            int size2 = A.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(defpackage.wx.i((djg) A.get(i2)));
            }
            ajsz.bv(arrayList, arrayList2);
        }
        djfVar.c.clear();
        djfVar.c.addAll(arrayList);
        this.b = djfVar.c();
        this.c = new androidx.compose.runtime.snapshots.SnapshotStateList();
    }

    public static final djg d(djg djgVar, dkw dkwVar) {
        int iC = dkwVar.c() - 1;
        int i = djgVar.b;
        int iD = dkwVar.d(iC, false);
        if (i < iD) {
            return djg.a(djgVar, (java.lang.Object) null, java.lang.Math.min(djgVar.c, iD), 11);
        }
        return null;
    }

    public final dkw a() {
        return (dkw) this.a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    public final void b(cav cavVar, int i) {
        int i2;
        int i3;
        char c;
        char c2;
        ?? r0;
        int i4 = i & 6;
        cbt cbtVarB = cavVar.b(1154651354);
        char c3 = 2;
        char c4 = 1;
        if (i4 == 0) {
            i2 = (true != cbtVarB.D(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        ?? r12 = 0;
        if (cbtVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.oq oqVar = (defpackage.oq) cbtVarB.e(dfo.m);
            dji djiVar = this.b;
            java.util.List listE = djiVar.e(djiVar.a());
            int size = listE.size();
            int i5 = 0;
            while (i5 < size) {
                djg djgVar = (djg) listE.get(i5);
                if (djgVar.b != djgVar.c) {
                    cbtVarB.u(725516538);
                    cbt cbtVar = cbtVarB;
                    java.lang.Object objR = cbtVar.R();
                    java.lang.Object obj = cau.a;
                    c = c3;
                    if (objR == obj) {
                        objR = new kaw((byte[]) null, (char[]) null, (byte[]) null);
                        cbtVar.ab(objR);
                    }
                    kaw kawVar = (kaw) objR;
                    c2 = c4;
                    cja cjaVarJ = cfo.j(1731209863, new defpackage.bit(this, djgVar, kawVar, oqVar, 1), cbtVarB);
                    cbtVarB.u(727333386);
                    cjaVarJ.a(cbtVarB, 6);
                    cbtVar.W((boolean) r12);
                    defpackage.djw djwVar = (defpackage.djw) djgVar.a;
                    if (defpackage.wx.h(djwVar.b())) {
                        ?? r1 = r12;
                        cbtVarB.u(729535006);
                        cbtVar.W((boolean) r1);
                        r0 = r1;
                    } else {
                        cbtVarB.u(727506335);
                        java.lang.Object objR2 = cbtVar.R();
                        if (objR2 == obj) {
                            objR2 = new vx(kawVar);
                            cbtVar.ab(objR2);
                        }
                        vx vxVar = (vx) objR2;
                        aojh aojhVar = aojh.a;
                        boolean zD = cbtVarB.D(vxVar);
                        java.lang.Object objR3 = cbtVar.R();
                        if (zD || objR3 == obj) {
                            objR3 = new defpackage.bgx(vxVar, (aoln) null, (int) r12);
                            cbtVar.ab(objR3);
                        }
                        cbp.g(aojhVar, (aonn) objR3, cbtVarB);
                        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(vxVar.o());
                        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(vxVar.n());
                        java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(vxVar.p());
                        ?? r22 = r12;
                        defpackage.dkx dkxVarB = djwVar.b();
                        dks dksVar = dkxVarB != null ? dkxVarB.a : null;
                        defpackage.dkx dkxVarB2 = djwVar.b();
                        dks dksVar2 = dkxVarB2 != null ? dkxVarB2.b : null;
                        defpackage.dkx dkxVarB3 = djwVar.b();
                        dks dksVar3 = dkxVarB3 != null ? dkxVarB3.c : null;
                        defpackage.dkx dkxVarB4 = djwVar.b();
                        dks dksVar4 = dkxVarB4 != null ? dkxVarB4.d : null;
                        java.lang.Object[] objArr = new java.lang.Object[7];
                        objArr[r22 == true ? 1 : 0] = boolValueOf;
                        objArr[c2] = boolValueOf2;
                        objArr[c] = boolValueOf3;
                        objArr[3] = dksVar;
                        objArr[4] = dksVar2;
                        objArr[5] = dksVar3;
                        objArr[6] = dksVar4;
                        boolean zD2 = cbtVarB.D(this) | cbtVarB.B(djgVar) | cbtVarB.D(vxVar);
                        java.lang.Object objR4 = cbtVar.R();
                        if (zD2 || objR4 == obj) {
                            objR4 = new defpackage.aum(djgVar, vxVar, 16, null);
                            cbtVar.ab(objR4);
                        }
                        c(objArr, (aonj) objR4, cbtVarB, (i2 << 6) & 896);
                        boolean z = r22 == true ? 1 : 0;
                        cbtVar.W(z);
                        r0 = z;
                    }
                    cbtVar.W((boolean) r0);
                } else {
                    c = c3;
                    c2 = c4;
                    r0 = r12;
                    cbtVarB.u(729548894);
                    cbtVarB.W((boolean) r0);
                }
                r12 = r0;
                i5++;
                c3 = c;
                c4 = c2;
            }
            i3 = 5;
        } else {
            i3 = 5;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ajs(this, i, i3);
        }
    }

    public final void c(java.lang.Object[] objArr, aonj aonjVar, cav cavVar, int i) {
        int i2 = i & 48;
        cbt cbtVarB = cavVar.b(-2083052099);
        int i3 = i2 == 0 ? (true != cbtVarB.D(aonjVar) ? 16 : 32) | i : i;
        if ((i & 384) == 0) {
            i3 |= true != cbtVarB.D(this) ? 128 : 256;
        }
        cbt cbtVar = cbtVarB;
        cbtVar.Z(-358306546, 7, 0, (java.lang.Object) null);
        int i4 = i3 | (true != cbtVarB.z(7) ? 0 : 4);
        for (int i5 = 0; i5 < 7; i5++) {
            i4 |= true != cbtVarB.D(objArr[i5]) ? 0 : 4;
        }
        cbtVar.W(false);
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if (cbtVarB.H((i4 & 147) != 146, i4 & 1)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(2);
            arrayList.add(aonjVar);
            aodc.p(objArr, arrayList);
            java.lang.Object[] array = arrayList.toArray(new java.lang.Object[arrayList.size()]);
            boolean zD = cbtVarB.D(this) | ((i4 & 112) == 32);
            java.lang.Object objR = cbtVar.R();
            if (zD || objR == cau.a) {
                objR = new defpackage.aum(this, aonjVar, 15);
                cbtVar.ab(objR);
            }
            cbp.d(array, (aonj) objR, cbtVarB);
        } else {
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.aoz(this, objArr, aonjVar, i, 5, (char[]) null);
        }
    }
}
