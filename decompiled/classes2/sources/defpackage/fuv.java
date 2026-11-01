package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fuv implements defpackage.fky {
    private final defpackage.euk a;
    private final defpackage.etx b = new defpackage.etx();
    private final int c;

    public fuv(int i, defpackage.euk eukVar) {
        this.c = i;
        this.a = eukVar;
    }

    @Override // defpackage.fky
    public final defpackage.fkx a(defpackage.flk flkVar, long j) {
        int iAc;
        int iAc2;
        defpackage.fkx fkxVar;
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        long j2 = flcVar.a;
        long j3 = flcVar.b;
        int iMin = (int) java.lang.Math.min(112800L, j2 - j3);
        defpackage.etx etxVar = this.b;
        etxVar.M(iMin);
        flcVar.n(etxVar.b, 0, iMin, false);
        int i = etxVar.d;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        long j6 = -1;
        while (etxVar.d() >= 188 && (iAc2 = (iAc = defpackage.hgt.ac(etxVar.b, etxVar.c, i)) + 188) <= i) {
            long jAd = defpackage.hgt.ad(etxVar, iAc, this.c);
            if (jAd != -9223372036854775807L) {
                long jB = this.a.b(jAd);
                if (jB <= j) {
                    j6 = iAc;
                    if (100000 + jB > j) {
                        fkxVar = new defpackage.fkx(0, -9223372036854775807L, j3 + j6);
                    } else {
                        j5 = jB;
                    }
                } else {
                    if (j5 == -9223372036854775807L) {
                        return new defpackage.fkx(-1, jB, j3);
                    }
                    fkxVar = new defpackage.fkx(0, -9223372036854775807L, j3 + j6);
                }
                return fkxVar;
            }
            etxVar.Q(iAc2);
            j4 = iAc2;
        }
        return j5 != -9223372036854775807L ? new defpackage.fkx(-2, j5, j3 + j4) : defpackage.fkx.a;
    }

    @Override // defpackage.fky
    public final void b() {
        this.b.N(eum.b);
    }
}
