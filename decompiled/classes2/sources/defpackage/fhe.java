package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fhe implements defpackage.ffs, defpackage.ffr {
    public final defpackage.ffs a;
    public long b;
    private defpackage.ffr c;

    public fhe(defpackage.ffs ffsVar, long j) {
        this.a = ffsVar;
        this.b = j;
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long a() {
        long jA = this.a.a();
        if (jA != Long.MIN_VALUE) {
            return this.b + jA;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long b() {
        long jB = this.a.b();
        if (jB != Long.MIN_VALUE) {
            return this.b + jB;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void c(defpackage.fgx fgxVar) {
        defpackage.ffr ffrVar = this.c;
        ahvr.ci(ffrVar);
        ffrVar.c(this);
    }

    @Override // defpackage.ffr
    public final void d(defpackage.ffs ffsVar) {
        defpackage.ffr ffrVar = this.c;
        ahvr.ci(ffrVar);
        ffrVar.d(this);
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final void dH(long j) {
        this.a.dH(j - this.b);
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean dI(defpackage.eyo eyoVar) {
        defpackage.eyn eynVar = new defpackage.eyn(eyoVar);
        eynVar.a = eyoVar.a - this.b;
        return this.a.dI(new defpackage.eyo(eynVar));
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.ffs
    public final long f(long j, defpackage.ezk ezkVar) {
        return this.a.f(j - this.b, ezkVar) + this.b;
    }

    @Override // defpackage.ffs
    public final long g() {
        long jG = this.a.g();
        if (jG != -9223372036854775807L) {
            return this.b + jG;
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.ffs
    public final long h(long j) {
        return this.a.h(j - this.b) + this.b;
    }

    @Override // defpackage.ffs
    public final long i(defpackage.fii[] fiiVarArr, boolean[] zArr, defpackage.fgv[] fgvVarArr, boolean[] zArr2, long j) {
        defpackage.fgv[] fgvVarArr2 = new defpackage.fgv[fgvVarArr.length];
        int i = 0;
        while (true) {
            defpackage.fgv fgvVar = null;
            if (i >= fgvVarArr.length) {
                break;
            }
            defpackage.fhd fhdVar = (defpackage.fhd) fgvVarArr[i];
            if (fhdVar != null) {
                fgvVar = fhdVar.a;
            }
            fgvVarArr2[i] = fgvVar;
            i++;
        }
        long jI = this.a.i(fiiVarArr, zArr, fgvVarArr2, zArr2, j - this.b);
        for (int i2 = 0; i2 < fgvVarArr.length; i2++) {
            defpackage.fgv fgvVar2 = fgvVarArr2[i2];
            if (fgvVar2 == null) {
                fgvVarArr[i2] = null;
            } else {
                defpackage.fgv fgvVar3 = fgvVarArr[i2];
                if (fgvVar3 == null || ((defpackage.fhd) fgvVar3).a != fgvVar2) {
                    fgvVarArr[i2] = new defpackage.fhd(this, fgvVar2);
                }
            }
        }
        return jI + this.b;
    }

    @Override // defpackage.ffs
    public final defpackage.fhg j() {
        return this.a.j();
    }

    @Override // defpackage.ffs
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.ffs
    public final void m(defpackage.ffr ffrVar, long j) {
        this.c = ffrVar;
        this.a.m(this, j - this.b);
    }

    @Override // defpackage.ffs
    public final void n() {
        java.lang.String str = eum.a;
        this.a.n();
    }

    @Override // defpackage.ffs
    public final void o(long j) {
        this.a.o(j - this.b);
    }
}
