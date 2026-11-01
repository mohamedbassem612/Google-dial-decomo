package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffm implements defpackage.ffs, defpackage.ffr {
    public final defpackage.ffu a;
    public final long b;
    public defpackage.ffw c;
    public defpackage.ffs d;
    public long e = -9223372036854775807L;
    private final defpackage.fio f;
    private defpackage.ffr g;
    private boolean h;

    public ffm(defpackage.ffu ffuVar, defpackage.fio fioVar, long j) {
        this.a = ffuVar;
        this.f = fioVar;
        this.b = j;
    }

    private final long p(long j) {
        long j2 = this.e;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long a() {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        return ffsVar.a();
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final long b() {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        return ffsVar.b();
    }

    @Override // defpackage.fgw
    public final /* bridge */ /* synthetic */ void c(defpackage.fgx fgxVar) {
        defpackage.ffr ffrVar = this.g;
        java.lang.String str = eum.a;
        ffrVar.c(this);
    }

    @Override // defpackage.ffr
    public final void d(defpackage.ffs ffsVar) {
        defpackage.ffr ffrVar = this.g;
        java.lang.String str = eum.a;
        ffrVar.d(this);
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final void dH(long j) {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        ffsVar.dH(j);
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean dI(defpackage.eyo eyoVar) {
        defpackage.ffs ffsVar = this.d;
        return ffsVar != null && ffsVar.dI(eyoVar);
    }

    @Override // defpackage.ffs, defpackage.fgx
    public final boolean e() {
        defpackage.ffs ffsVar = this.d;
        return ffsVar != null && ffsVar.e();
    }

    @Override // defpackage.ffs
    public final long f(long j, defpackage.ezk ezkVar) {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        return ffsVar.f(j, ezkVar);
    }

    @Override // defpackage.ffs
    public final long g() {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        return ffsVar.g();
    }

    @Override // defpackage.ffs
    public final long h(long j) {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        return ffsVar.h(j);
    }

    @Override // defpackage.ffs
    public final long i(defpackage.fii[] fiiVarArr, boolean[] zArr, defpackage.fgv[] fgvVarArr, boolean[] zArr2, long j) {
        long j2 = this.e;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.e = -9223372036854775807L;
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        return ffsVar.i(fiiVarArr, zArr, fgvVarArr, zArr2, j);
    }

    @Override // defpackage.ffs
    public final defpackage.fhg j() {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        return ffsVar.j();
    }

    public final void k(defpackage.ffu ffuVar) {
        long jP = p(this.b);
        defpackage.ffw ffwVar = this.c;
        ahvr.ci(ffwVar);
        defpackage.ffs ffsVarA = ffwVar.A(ffuVar, this.f, jP);
        this.d = ffsVarA;
        if (this.h) {
            ffsVarA.n();
        }
        if (this.g != null) {
            this.d.m(this, jP);
        }
    }

    @Override // defpackage.ffs
    public final void l() {
        defpackage.ffs ffsVar = this.d;
        if (ffsVar != null) {
            ffsVar.l();
            return;
        }
        defpackage.ffw ffwVar = this.c;
        if (ffwVar != null) {
            ffwVar.u();
        }
    }

    @Override // defpackage.ffs
    public final void m(defpackage.ffr ffrVar, long j) {
        this.g = ffrVar;
        defpackage.ffs ffsVar = this.d;
        if (ffsVar != null) {
            ffsVar.m(this, p(this.b));
        }
    }

    @Override // defpackage.ffs
    public final void n() {
        this.h = true;
        defpackage.ffs ffsVar = this.d;
        if (ffsVar != null) {
            ffsVar.n();
        }
    }

    @Override // defpackage.ffs
    public final void o(long j) {
        defpackage.ffs ffsVar = this.d;
        java.lang.String str = eum.a;
        ffsVar.o(j);
    }
}
