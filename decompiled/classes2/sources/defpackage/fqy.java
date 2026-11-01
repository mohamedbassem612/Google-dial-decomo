package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqy {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final defpackage.etx g = new defpackage.etx(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(defpackage.flk flkVar, boolean z) throws defpackage.era {
        a();
        defpackage.etx etxVar = this.g;
        etxVar.M(27);
        if (!defpackage.hgu.ap(flkVar, etxVar.b, 27, z) || etxVar.w() != 1332176723) {
            return false;
        }
        if (etxVar.n() != 0) {
            if (z) {
                return false;
            }
            throw new defpackage.era("unsupported bit stream revision", null, false, 1);
        }
        this.a = etxVar.n();
        this.b = etxVar.t();
        etxVar.u();
        etxVar.u();
        etxVar.u();
        int iN = etxVar.n();
        this.c = iN;
        this.d = iN + 27;
        etxVar.M(iN);
        if (!defpackage.hgu.ap(flkVar, etxVar.b, this.c, z)) {
            return false;
        }
        for (int i = 0; i < this.c; i++) {
            int[] iArr = this.f;
            int iN2 = etxVar.n();
            iArr[i] = iN2;
            this.e += iN2;
        }
        return true;
    }

    public final boolean c(defpackage.flk flkVar, long j) {
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        ahvr.bM(flcVar.b == flkVar.e());
        defpackage.etx etxVar = this.g;
        etxVar.M(4);
        while (true) {
            if ((j != -1 && flcVar.b + 4 >= j) || !defpackage.hgu.ap(flkVar, etxVar.b, 4, true)) {
                break;
            }
            etxVar.Q(0);
            if (etxVar.w() == 1332176723) {
                flkVar.k();
                return true;
            }
            flcVar.p(1, false);
        }
        do {
            if (j != -1 && flcVar.b >= j) {
                return false;
            }
        } while (flkVar.c(1) != -1);
        return false;
    }
}
