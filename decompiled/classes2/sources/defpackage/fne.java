package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fne implements defpackage.flj {
    private defpackage.fll f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private defpackage.fnd o;
    private defpackage.fni p;
    private final defpackage.etx a = new defpackage.etx(4);
    private final defpackage.etx b = new defpackage.etx(9);
    private final defpackage.etx c = new defpackage.etx(11);
    private final defpackage.etx d = new defpackage.etx();
    private final defpackage.fnf e = new defpackage.fnf();
    private int g = 1;

    private final defpackage.etx h(defpackage.flk flkVar) {
        defpackage.etx etxVar = this.d;
        if (this.l > etxVar.e()) {
            etxVar.O(new byte[java.lang.Math.max(etxVar.e() << 1, this.l)], 0);
        } else {
            etxVar.Q(0);
        }
        etxVar.P(this.l);
        ((defpackage.flc) flkVar).o(etxVar.b, 0, this.l, false);
        return etxVar;
    }

    private final void i() {
        if (this.n) {
            return;
        }
        this.f.y(new defpackage.flz(-9223372036854775807L, 0L));
        this.n = true;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.f = fllVar;
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        defpackage.etx etxVar = this.a;
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        flcVar.n(etxVar.b, 0, 3, false);
        etxVar.Q(0);
        if (etxVar.p() != 4607062) {
            return false;
        }
        flcVar.n(etxVar.b, 0, 2, false);
        etxVar.Q(0);
        if ((etxVar.s() & 250) != 0) {
            return false;
        }
        flcVar.n(etxVar.b, 0, 4, false);
        etxVar.Q(0);
        int i = etxVar.i();
        flkVar.k();
        flcVar.m(i, false);
        flcVar.n(etxVar.b, 0, 4, false);
        etxVar.Q(0);
        return etxVar.i() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0009 A[SYNTHETIC] */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) {
        long j;
        boolean zC;
        boolean z;
        long j2;
        ahvr.ci(this.f);
        while (true) {
            int i = this.g;
            int i2 = 8;
            if (i == 1) {
                defpackage.etx etxVar = this.b;
                if (!flkVar.o(etxVar.b, 0, 9, true)) {
                    return -1;
                }
                etxVar.Q(0);
                etxVar.R(4);
                int iN = etxVar.n();
                int i3 = iN & 4;
                int i4 = iN & 1;
                if (i3 != 0 && this.o == null) {
                    this.o = new defpackage.fnd(this.f.r(8, 1));
                }
                if (i4 != 0 && this.p == null) {
                    this.p = new defpackage.fni(this.f.r(9, 2));
                }
                this.f.s();
                this.j = etxVar.i() - 5;
                this.g = 2;
            } else if (i == 2) {
                ((defpackage.flc) flkVar).p(this.j, false);
                this.j = 0;
                this.g = 3;
            } else if (i == 3) {
                defpackage.etx etxVar2 = this.c;
                if (!flkVar.o(etxVar2.b, 0, 11, true)) {
                    return -1;
                }
                etxVar2.Q(0);
                this.k = etxVar2.n();
                this.l = etxVar2.p();
                this.m = etxVar2.p();
                this.m = (((long) (etxVar2.n() << 24)) | this.m) * 1000;
                etxVar2.R(3);
                this.g = 4;
            } else {
                if (i != 4) {
                    throw new java.lang.IllegalStateException();
                }
                if (this.h) {
                    j = this.i + this.m;
                } else {
                    j = this.e.a == -9223372036854775807L ? 0L : this.m;
                }
                int i5 = this.k;
                if (i5 == 8) {
                    if (this.o != null) {
                        i();
                        zC = this.o.c(h(flkVar), j);
                    }
                    z = true;
                    if (!this.h && zC) {
                        this.h = true;
                        if (this.e.a == -9223372036854775807L) {
                            j2 = -this.m;
                        } else {
                            j2 = 0;
                        }
                        this.i = j2;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    i2 = i5;
                }
                if (i2 == 9) {
                    if (this.p != null) {
                        i();
                        zC = this.p.c(h(flkVar), j);
                        z = true;
                    } else {
                        ((defpackage.flc) flkVar).p(this.l, false);
                        zC = false;
                        z = false;
                    }
                } else if (i2 != 18 || this.n) {
                    ((defpackage.flc) flkVar).p(this.l, false);
                    zC = false;
                    z = false;
                } else {
                    defpackage.fnf fnfVar = this.e;
                    zC = fnfVar.c(h(flkVar), j);
                    long j3 = fnfVar.a;
                    if (j3 != -9223372036854775807L) {
                        this.f.y(new defpackage.flu(fnfVar.c, fnfVar.b, j3));
                        this.n = true;
                    }
                    z = true;
                }
                if (!this.h) {
                    this.h = true;
                    if (this.e.a == -9223372036854775807L) {
                        j2 = -this.m;
                    } else {
                        j2 = 0;
                    }
                    this.i = j2;
                }
                this.j = 4;
                this.g = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
