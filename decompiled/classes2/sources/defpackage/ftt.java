package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftt implements defpackage.flj {
    private final int a;
    private final defpackage.etx d;
    private final defpackage.etv e;
    private defpackage.fll f;
    private long g;
    private boolean j;
    private boolean k;
    private boolean l;
    private final defpackage.ftu b = new defpackage.ftu(true, null, 0, "audio/mp4a-latm");
    private final defpackage.etx c = new defpackage.etx(2048);
    private int i = -1;
    private long h = -1;

    public ftt(int i) {
        this.a = i;
        defpackage.etx etxVar = new defpackage.etx(10);
        this.d = etxVar;
        this.e = new defpackage.etv(etxVar.b);
    }

    private final int h(defpackage.flk flkVar) {
        defpackage.flc flcVar;
        int i = 0;
        while (true) {
            defpackage.etx etxVar = this.d;
            flcVar = (defpackage.flc) flkVar;
            flcVar.n(etxVar.b, 0, 10, false);
            etxVar.Q(0);
            if (etxVar.p() != 4801587) {
                break;
            }
            etxVar.R(3);
            int iM = etxVar.m();
            i += iM + 10;
            flcVar.m(iM, false);
        }
        flkVar.k();
        flcVar.m(i, false);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    private final void i(defpackage.flk flkVar) throws defpackage.era {
        if (this.j) {
            return;
        }
        this.i = -1;
        flkVar.k();
        long j = 0;
        int i = 0;
        if (((defpackage.flc) flkVar).b == 0) {
            h(flkVar);
        }
        int i2 = 0;
        while (true) {
            try {
                defpackage.etx etxVar = this.d;
                if (flkVar.n(etxVar.b, 0, 2, true)) {
                    etxVar.Q(0);
                    if (!defpackage.ftu.g(etxVar.s())) {
                        break;
                    }
                    if (flkVar.n(etxVar.b, 0, 4, true)) {
                        defpackage.etv etvVar = this.e;
                        etvVar.l(14);
                        int iD = etvVar.d(13);
                        if (iD <= 6) {
                            this.j = true;
                            throw new defpackage.era("Malformed ADTS stream", null, true, 1);
                        }
                        j += (long) iD;
                        i2++;
                        if (i2 != 1000 && flkVar.m(iD - 6, true)) {
                        }
                    }
                }
            } catch (java.io.EOFException unused) {
            }
            i = i2;
            break;
        }
        flkVar.k();
        if (i > 0) {
            this.i = (int) (j / ((long) i));
        } else {
            this.i = -1;
        }
        this.j = true;
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return aike.a;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        this.f = fllVar;
        this.b.b(fllVar, new defpackage.fvb(Integer.MIN_VALUE, 0, 1));
        fllVar.s();
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        this.k = false;
        this.b.f();
        this.g = j2;
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        int iH = h(flkVar);
        int i = iH;
        int i2 = 0;
        int i3 = 0;
        do {
            defpackage.etx etxVar = this.d;
            defpackage.flc flcVar = (defpackage.flc) flkVar;
            flcVar.n(etxVar.b, 0, 2, false);
            etxVar.Q(0);
            if (defpackage.ftu.g(etxVar.s())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                flcVar.n(etxVar.b, 0, 4, false);
                defpackage.etv etvVar = this.e;
                etvVar.l(14);
                int iD = etvVar.d(13);
                if (iD <= 6) {
                    i++;
                    flkVar.k();
                    flcVar.m(i, false);
                } else {
                    flcVar.m(iD - 6, false);
                    i3 += iD;
                }
            } else {
                i++;
                flkVar.k();
                flcVar.m(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iH < 8192);
        return false;
    }

    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        int i;
        int i2;
        ahvr.ci(this.f);
        long j = ((defpackage.flc) flkVar).a;
        int i3 = this.a;
        if (i3 != 0 && j != -1) {
            i(flkVar);
        }
        defpackage.etx etxVar = this.c;
        int iA = flkVar.a(etxVar.b, 0, 2048);
        if (!this.l) {
            if (i3 == 0 || (i = this.i) <= 0) {
                this.f.y(new defpackage.flz(-9223372036854775807L, 0L));
                this.l = true;
            } else {
                long j2 = this.b.a;
                if (j2 != -9223372036854775807L) {
                    i2 = iA;
                } else if (iA == -1) {
                    i2 = -1;
                }
                if (j2 != -9223372036854775807L) {
                    this.f.y(new defpackage.flb(j, this.h, (int) ((((long) i) * 8000000) / j2), i, false, true));
                    iA = i2;
                } else {
                    iA = i2;
                    this.f.y(new defpackage.flz(-9223372036854775807L, 0L));
                }
                this.l = true;
            }
        }
        if (iA == -1) {
            return -1;
        }
        etxVar.Q(0);
        etxVar.P(iA);
        if (!this.k) {
            this.b.b = this.g;
            this.k = true;
        }
        this.b.a(etxVar);
        return 0;
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
