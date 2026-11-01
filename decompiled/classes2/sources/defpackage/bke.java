package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bke {
    public final long a;
    public final aomy b;
    public final aomy c;
    public final defpackage.bfl d;
    private final aomy e;
    private dkw g;
    private final java.lang.Object f = this;
    private int h = -1;

    public bke(long j, aomy aomyVar, aomy aomyVar2, aomy aomyVar3, defpackage.bfl bflVar) {
        this.a = j;
        this.e = aomyVar;
        this.b = aomyVar2;
        this.c = aomyVar3;
        this.d = bflVar;
    }

    public final float a(int i) {
        java.lang.Object objA = this.b.a();
        if (objA == null || i < 0) {
            return 0.0f;
        }
        dkw dkwVar = (dkw) objA;
        if (dkwVar.a.a.a() == 0) {
            return 0.0f;
        }
        djy djyVar = dkwVar.b;
        int iMin = java.lang.Math.min(djyVar.b(i), java.lang.Math.min(djyVar.b - 1, djyVar.f - 1));
        if (i > djyVar.a(iMin, false)) {
            return 0.0f;
        }
        djyVar.e(iMin);
        java.util.List list = djyVar.h;
        dka dkaVar = (dka) list.get(defpackage.xa.g(list, iMin));
        djb djbVar = dkaVar.g;
        return djbVar.e ? djbVar.d : djbVar.b.c(dkaVar.f(iMin));
    }

    public final float b(int i) {
        dkw dkwVar;
        int iE;
        java.lang.Object objA = this.b.a();
        if (objA == null || (iE = (dkwVar = (dkw) objA).e(i)) >= dkwVar.c()) {
            return -1.0f;
        }
        djy djyVar = dkwVar.b;
        djyVar.e(iE);
        java.util.List list = djyVar.h;
        dka dkaVar = (dka) list.get(defpackage.xa.g(list, iE));
        djb djbVar = dkaVar.g;
        int iF = dkaVar.f(iE);
        dll dllVar = djbVar.b;
        return dllVar.f.getLineLeft(iF) + (iF == dllVar.g + (-1) ? dllVar.i : 0.0f);
    }

    public final int c() {
        java.lang.Object objA = this.b.a();
        if (objA == null) {
            return 0;
        }
        return d((dkw) objA);
    }

    public final int d(dkw dkwVar) {
        int i;
        int iC;
        synchronized (this.f) {
            if (this.g != dkwVar) {
                if (!dkwVar.l() || dkwVar.b.c) {
                    iC = dkwVar.c() - 1;
                } else {
                    float f = (int) (dkwVar.c & 4294967295L);
                    int iU = aooc.u(dkwVar.f(f), dkwVar.c() - 1);
                    while (iU >= 0 && dkwVar.b(iU) >= f) {
                        iU--;
                    }
                    iC = aooc.t(iU, 0);
                }
                this.h = dkwVar.d(iC, true);
                this.g = dkwVar;
            }
            i = this.h;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    public final long e(defpackage.bko bkoVar, boolean z) {
        java.lang.Object objA;
        boolean z2;
        boolean z3;
        int iMax;
        int iN;
        int iO;
        djy djyVar;
        int iF;
        djb djbVar;
        int iE;
        float f;
        if (z) {
            if (bkoVar.a.b != this.a) {
                return 9205357640488583168L;
            }
        } else if (bkoVar.b.b != this.a) {
            return 9205357640488583168L;
        }
        if (g() == null || (objA = this.b.a()) == null) {
            return 9205357640488583168L;
        }
        dkw dkwVar = (dkw) objA;
        int iW = aooc.w(z ? bkoVar.a.a : bkoVar.b.a, 0, d(dkwVar));
        boolean z4 = bkoVar.c;
        int iE2 = dkwVar.e(iW);
        if (iE2 >= dkwVar.c()) {
            return 9205357640488583168L;
        }
        if (z) {
            if (z4) {
                z3 = true;
                z2 = true;
            } else {
                iMax = iW;
            }
            iN = dkwVar.n(iMax);
            iO = dkwVar.o(iW);
            djyVar = dkwVar.b;
            djyVar.d(iW);
            if (iW == djyVar.c().a()) {
                iF = djyVar.h.size() - 1;
            } else {
                iF = defpackage.xa.f(djyVar.h, iW);
            }
            dka dkaVar = (dka) djyVar.h.get(iF);
            djbVar = dkaVar.g;
            iE = dkaVar.e(iW);
            if (iN == iO) {
                f = djbVar.b.e(iE, false);
            } else {
                f = djbVar.b.f(iE, false);
            }
            long j = dkwVar.c;
            return (((long) java.lang.Float.floatToRawIntBits(aooc.s(f, 0.0f, (int) (j >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(aooc.s(dkwVar.a(iE2), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
        }
        z2 = z4;
        z3 = false;
        if (z3 || !z2) {
            iMax = java.lang.Math.max(iW - 1, 0);
        } else {
            iMax = iW;
        }
        iN = dkwVar.n(iMax);
        iO = dkwVar.o(iW);
        djyVar = dkwVar.b;
        djyVar.d(iW);
        if (iW == djyVar.c().a()) {
            iF = djyVar.h.size() - 1;
        } else {
            iF = defpackage.xa.f(djyVar.h, iW);
        }
        dka dkaVar2 = (dka) djyVar.h.get(iF);
        djbVar = dkaVar2.g;
        iE = dkaVar2.e(iW);
        if (iN == iO) {
            f = djbVar.b.e(iE, false);
        } else {
            f = djbVar.b.f(iE, false);
        }
        long j2 = dkwVar.c;
        return (((long) java.lang.Float.floatToRawIntBits(aooc.s(f, 0.0f, (int) (j2 >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(aooc.s(dkwVar.a(iE2), 0.0f, (int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public final defpackage.bko f() {
        java.lang.Object objA = this.b.a();
        if (objA == null) {
            return null;
        }
        dkw dkwVar = (dkw) objA;
        int iA = dkwVar.a.a.a();
        int iN = dkwVar.n(0);
        long j = this.a;
        return new defpackage.bko(new defpackage.bkn(iN, 0, j), new defpackage.bkn(dkwVar.n(java.lang.Math.max(iA - 1, 0)), iA, j), false);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cxi, java.lang.Object] */
    public final cxi g() {
        ?? A = this.e.a();
        if (A == 0 || !A.u()) {
            return null;
        }
        return A;
    }

    public final dji h() {
        java.lang.Object objA = this.b.a();
        return objA == null ? new dji("") : ((dkw) objA).a.a;
    }
}
