package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dtb extends defpackage.dsy {
    private boolean as;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public defpackage.dsx d = this.K;
    public int ar = 0;

    public dtb() {
        this.S.clear();
        this.S.add(this.d);
        int length = this.R.length;
        for (int i = 0; i < 6; i++) {
            this.R[i] = this.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f A[PHI: r0
      0x000f: PHI (r0v1 int) = (r0v0 int), (r0v2 int), (r0v0 int) binds: [B:3:0x0003, B:10:0x000e, B:7:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:
    
        if (r3 == 4) goto L10;
     */
    @Override // defpackage.dsy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dsx K(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto Lf
            r1 = 2
            if (r3 == r1) goto Le
            r1 = 3
            if (r3 == r1) goto Lf
            r0 = 4
            if (r3 != r0) goto L16
        Le:
            r0 = 0
        Lf:
            int r3 = r2.ar
            if (r3 != r0) goto L16
            dsx r2 = r2.d
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtb.K(int):dsx");
    }

    @Override // defpackage.dsy
    public final void R(boolean z) {
        if (this.U != null) {
            int iO = defpackage.dsq.o(this.d);
            if (this.ar == 1) {
                this.Z = iO;
                this.aa = 0;
                x(this.U.h());
                C(0);
                return;
            }
            this.Z = 0;
            this.aa = iO;
            C(this.U.j());
            x(0);
        }
    }

    public final void a(int i) {
        this.d.e(i);
        this.as = true;
    }

    @Override // defpackage.dsy
    public final void b(defpackage.dsq dsqVar, boolean z) {
        defpackage.dsy dsyVar = this.U;
        if (dsyVar != null) {
            java.lang.Object objK = dsyVar.K(2);
            java.lang.Object objK2 = dsyVar.K(4);
            defpackage.dsy dsyVar2 = this.U;
            boolean z2 = dsyVar2 != null && dsyVar2.aq[0] == 2;
            if (this.ar == 0) {
                objK = dsyVar.K(3);
                objK2 = dsyVar.K(5);
                z2 = dsyVar2 != null && dsyVar2.aq[1] == 2;
            }
            if (this.as) {
                defpackage.dsx dsxVar = this.d;
                if (dsxVar.c) {
                    defpackage.dst dstVarB = dsqVar.b(dsxVar);
                    dsqVar.f(dstVarB, this.d.a());
                    if (this.b != -1) {
                        if (z2) {
                            dsqVar.g(dsqVar.b(objK2), dstVarB, 0, 5);
                        }
                    } else if (this.c != -1 && z2) {
                        defpackage.dst dstVarB2 = dsqVar.b(objK2);
                        dsqVar.g(dstVarB, dsqVar.b(objK), 0, 5);
                        dsqVar.g(dstVarB2, dstVarB, 0, 5);
                    }
                    this.as = false;
                    return;
                }
            }
            if (this.b != -1) {
                defpackage.dst dstVarB3 = dsqVar.b(this.d);
                dsqVar.m(dstVarB3, dsqVar.b(objK), this.b, 8);
                if (z2) {
                    dsqVar.g(dsqVar.b(objK2), dstVarB3, 0, 5);
                    return;
                }
                return;
            }
            if (this.c != -1) {
                defpackage.dst dstVarB4 = dsqVar.b(this.d);
                defpackage.dst dstVarB5 = dsqVar.b(objK2);
                dsqVar.m(dstVarB4, dstVarB5, -this.c, 8);
                if (z2) {
                    dsqVar.g(dstVarB4, dsqVar.b(objK), 0, 5);
                    dsqVar.g(dstVarB5, dstVarB4, 0, 5);
                    return;
                }
                return;
            }
            if (this.a != -1.0f) {
                defpackage.dst dstVarB6 = dsqVar.b(this.d);
                defpackage.dst dstVarB7 = dsqVar.b(objK2);
                float f = this.a;
                defpackage.dsp dspVarA = dsqVar.a();
                dspVarA.e.g(dstVarB6, -1.0f);
                dspVarA.e.g(dstVarB7, f);
                dsqVar.e(dspVarA);
            }
        }
    }

    public final void c(int i) {
        defpackage.dsx dsxVar;
        if (this.ar != i) {
            this.ar = i;
            java.util.ArrayList arrayList = this.S;
            arrayList.clear();
            if (this.ar == 1) {
                dsxVar = this.J;
                this.d = dsxVar;
            } else {
                dsxVar = this.K;
                this.d = dsxVar;
            }
            arrayList.add(dsxVar);
            defpackage.dsx[] dsxVarArr = this.R;
            int length = dsxVarArr.length;
            for (int i2 = 0; i2 < 6; i2++) {
                dsxVarArr[i2] = this.d;
            }
        }
    }

    @Override // defpackage.dsy
    public final boolean d() {
        return true;
    }

    @Override // defpackage.dsy
    public final boolean e() {
        return this.as;
    }

    @Override // defpackage.dsy
    public final boolean f() {
        return this.as;
    }
}
