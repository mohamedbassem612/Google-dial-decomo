package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class anb extends amk implements dan {
    private final acx G;
    public java.lang.String j;
    public aomy k;
    public boolean l;
    public aoub m;
    public boolean n;
    public aoub o;
    public boolean p;
    private defpackage.cvm q;
    private defpackage.cuf r;
    private final acx s;

    public anb(aomy aomyVar, java.lang.String str, aomy aomyVar2, kaw kawVar, boolean z, java.lang.String str2, dib dibVar) {
        super(kawVar, (any) null, z, true, str2, dibVar, aomyVar);
        this.j = str;
        this.k = aomyVar2;
        this.l = true;
        int i = acy.a;
        this.s = new acx(6);
        this.G = new acx(6);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c A[LOOP:2: B:24:0x0071->B:35:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x009f A[EDGE_INSN: B:44:0x009f->B:36:0x009f BREAK  A[LOOP:2: B:24:0x0071->B:35:0x009c], SYNTHETIC] */
    private final void J() {
        char c;
        long j;
        long j2;
        acx acxVar = this.s;
        java.lang.Object[] objArr = acxVar.c;
        long[] jArr = acxVar.a;
        int length = jArr.length - 2;
        char c2 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c2) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            ((aoub) objArr[(i << 3) + i3]).s((java.util.concurrent.CancellationException) null);
                        }
                        j3 >>= 8;
                        i3++;
                        c2 = c2;
                    }
                    c = c2;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        acxVar.g();
        acx acxVar2 = this.G;
        java.lang.Object[] objArr2 = acxVar2.c;
        long[] jArr2 = acxVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        acxVar2.g();
    }

    private final void K(defpackage.cuf cufVar) {
        if (((amk) this).a) {
            h(cufVar.c, true);
            if (!this.p) {
                r();
            }
        }
        this.r = null;
        aoub aoubVar = this.o;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.o = null;
        this.p = false;
    }

    private final void W(defpackage.cvm cvmVar) {
        if (((amk) this).a) {
            h(cvmVar.c, false);
            if (!this.n) {
                r();
            }
        }
        this.q = null;
        aoub aoubVar = this.m;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.m = null;
        this.n = false;
    }

    protected final void E(android.view.KeyEvent keyEvent) {
        acx acxVar = this.s;
        long jK = un.k(keyEvent);
        if (acxVar.a(jK) != null) {
            aoub aoubVar = (aoub) acxVar.a(jK);
            boolean z = false;
            if (aoubVar != null) {
                if (aoubVar.t()) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                } else {
                    z = true;
                }
            }
            acxVar.e(jK);
            if (z) {
                return;
            }
        }
        r();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void F(alic alicVar, defpackage.cvg cvgVar) {
        super.F(alicVar, cvgVar);
        int i = 0;
        if (cvgVar != defpackage.cvg.b) {
            if (cvgVar != defpackage.cvg.c || this.r == null || this.p) {
                return;
            }
            ?? r9 = alicVar.c;
            int size = r9.size();
            while (i < size) {
                defpackage.cuf cufVar = (defpackage.cuf) r9.get(i);
                if (cufVar.g && !aooh.n(cufVar, this.r)) {
                    I(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.r == null) {
            ?? r10 = alicVar.c;
            int size2 = r10.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (defpackage.rq.i((defpackage.cuf) r10.get(i2))) {
                    defpackage.cuf cufVar2 = (defpackage.cuf) r10.get(0);
                    cufVar2.a();
                    this.r = cufVar2;
                    if (((amk) this).a) {
                        this.p = false;
                        i(cufVar2);
                        if (this.k != null) {
                            this.o = aoov.an(M(), (aolr) null, 0, new defpackage.ahb(this, (aoln) null, 7, (byte[]) null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.p) {
            ?? r11 = alicVar.c;
            int size3 = r11.size();
            for (int i3 = 0; i3 < size3; i3++) {
                defpackage.cuf cufVar3 = (defpackage.cuf) r11.get(i3);
                if (!cufVar3.f || cufVar3.d) {
                    int size4 = r11.size();
                    while (i < size4) {
                        ((defpackage.cuf) r11.get(i)).a();
                        i++;
                    }
                    return;
                }
            }
            defpackage.cuf cufVar4 = (defpackage.cuf) r11.get(0);
            cufVar4.a();
            long j = cufVar4.b;
            defpackage.cuf cufVar5 = this.r;
            if (cufVar5 == null) {
                aooh.g();
            }
            K(cufVar5);
            return;
        }
        ?? r12 = alicVar.c;
        int size5 = r12.size();
        for (int i4 = 0; i4 < size5; i4++) {
            if (!den.bi((defpackage.cuf) r12.get(i4))) {
                float fB = ((dgk) cfo.G(this, dfo.n)).b();
                int size6 = r12.size();
                while (i < size6) {
                    defpackage.cuf cufVar6 = (defpackage.cuf) r12.get(i);
                    long j2 = cufVar6.c;
                    defpackage.cuf cufVar7 = this.r;
                    if (cufVar7 == null) {
                        aooh.g();
                    }
                    float fAbs = java.lang.Math.abs(cpm.a(mni.aM(j2, cufVar7.c)));
                    if (cufVar6.g || fAbs > fB) {
                        I(true);
                        return;
                    }
                    i++;
                }
                return;
            }
        }
        defpackage.cuf cufVar8 = (defpackage.cuf) r12.get(0);
        cufVar8.a();
        long j3 = cufVar8.b;
        defpackage.cuf cufVar9 = this.r;
        if (cufVar9 == null) {
            aooh.g();
        }
        K(cufVar9);
    }

    public final void H() {
        I(true);
    }

    public final void I(boolean z) {
        if (z) {
            this.r = null;
            aoub aoubVar = this.o;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            this.o = null;
            this.p = false;
        } else {
            this.q = null;
            aoub aoubVar2 = this.m;
            if (aoubVar2 != null) {
                aoubVar2.s((java.util.concurrent.CancellationException) null);
            }
            this.m = null;
            this.n = false;
        }
        g(z);
    }

    public final void cZ() {
        J();
    }

    public final void d(diq diqVar) {
        if (this.k != null) {
            diqVar.a(did.c, new dhr(this.j, new defpackage.mq(this, 9)));
        }
    }

    public final void m() {
        J();
    }

    public final void n() {
        super.n();
        I(false);
    }

    public final void p(cvf cvfVar, defpackage.cvg cvgVar, long j) {
        super.p(cvfVar, cvgVar, j);
        if (cvgVar != defpackage.cvg.b) {
            if (cvgVar != defpackage.cvg.c || this.q == null || this.n) {
                return;
            }
            java.util.List list = cvfVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                defpackage.cvm cvmVar = (defpackage.cvm) list.get(i);
                if (cvmVar.c() && !aooh.n(cvmVar, this.q)) {
                    I(false);
                    return;
                }
            }
            return;
        }
        if (this.q == null) {
            if (defpackage.atv.a(cvfVar, true, false)) {
                defpackage.cvm cvmVar2 = (defpackage.cvm) cvfVar.a.get(0);
                cvmVar2.b();
                this.q = cvmVar2;
                if (((amk) this).a) {
                    this.n = false;
                    j(cvmVar2);
                    if (this.k != null) {
                        this.m = aoov.an(M(), (aolr) null, 0, new defpackage.ahb(this, (aoln) null, 6), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (defpackage.rs.c(cvfVar) && !this.n && ((amk) this).a && this.k != null) {
            aoub aoubVar = this.m;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            this.m = null;
            aomy aomyVar = this.k;
            if (aomyVar != null) {
                aomyVar.a();
            }
            if (this.l) {
                ((kaw) cfo.G(this, dfo.h)).ar(0);
            }
            this.n = true;
        }
        if (this.n) {
            java.util.List list2 = cvfVar.a;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!uu.t((defpackage.cvm) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((defpackage.cvm) list2.get(i3)).b();
                    }
                    return;
                }
            }
            defpackage.cvm cvmVar3 = (defpackage.cvm) list2.get(0);
            cvmVar3.b();
            long j2 = cvmVar3.b;
            defpackage.cvm cvmVar4 = this.q;
            if (cvmVar4 == null) {
                aooh.g();
            }
            W(cvmVar4);
            return;
        }
        java.util.List list3 = cvfVar.a;
        int size4 = list3.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!uu.s((defpackage.cvm) list3.get(i4))) {
                long jA = a(j);
                int size5 = list3.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    defpackage.cvm cvmVar5 = (defpackage.cvm) list3.get(i5);
                    if (cvmVar5.c() || uu.u(cvmVar5, j, jA)) {
                        I(false);
                        return;
                    }
                }
                return;
            }
        }
        defpackage.cvm cvmVar6 = (defpackage.cvm) list3.get(0);
        cvmVar6.b();
        long j3 = cvmVar6.b;
        defpackage.cvm cvmVar7 = this.q;
        if (cvmVar7 == null) {
            aooh.g();
        }
        W(cvmVar7);
    }

    protected final boolean z(android.view.KeyEvent keyEvent) {
        long jK = un.k(keyEvent);
        boolean z = false;
        if (this.k != null) {
            acx acxVar = this.s;
            if (acxVar.a(jK) == null) {
                acxVar.h(jK, aoov.an(M(), (aolr) null, 0, new defpackage.ahb(this, (aoln) null, 8, (char[]) null), 3));
                z = true;
            }
        }
        if (((defpackage.yv) this.G.a(jK)) == null) {
            return z;
        }
        throw null;
    }
}
