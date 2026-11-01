package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fnb implements defpackage.fky {
    private final defpackage.flo a;
    private final int b;
    private final aesq c = new aesq();

    public fnb(defpackage.flo floVar, int i) {
        this.a = floVar;
        this.b = i;
    }

    private final long c(defpackage.flk flkVar) {
        defpackage.flc flcVar;
        long j;
        long j2;
        boolean z;
        while (true) {
            long jE = flkVar.e();
            flcVar = (defpackage.flc) flkVar;
            j = flcVar.a;
            j2 = (-6) + j;
            if (jE >= j2) {
                z = false;
                break;
            }
            defpackage.flo floVar = this.a;
            int i = this.b;
            aesq aesqVar = this.c;
            long jE2 = flkVar.e();
            defpackage.etx etxVar = new defpackage.etx(17);
            flcVar.n(etxVar.b, 0, 2, false);
            if (etxVar.b(java.nio.ByteOrder.BIG_ENDIAN, 0) == i) {
                etxVar.P(defpackage.hgu.al(flkVar, etxVar.b, 2, 15) + 2);
                flkVar.k();
                int i2 = (int) (jE2 - flcVar.b);
                z = false;
                flcVar.m(i2, false);
                if (defpackage.hgu.at(etxVar, floVar, i, aesqVar)) {
                    break;
                }
            } else {
                flkVar.k();
                flcVar.m((int) (jE2 - flcVar.b), false);
                z = false;
            }
            flcVar.m(1, z);
        }
        if (flkVar.e() < j2) {
            return this.c.a;
        }
        flcVar.m((int) (j - flkVar.e()), z);
        return this.a.j;
    }

    @Override // defpackage.fky
    public final defpackage.fkx a(defpackage.flk flkVar, long j) {
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        long j2 = flcVar.b;
        defpackage.flo floVar = this.a;
        long jC = c(flkVar);
        long jE = flkVar.e();
        flcVar.m(java.lang.Math.max(6, floVar.c), false);
        long jC2 = c(flkVar);
        long jE2 = flkVar.e();
        if (jC > j || jC2 <= j) {
            return jC2 <= j ? new defpackage.fkx(-2, jC2, jE2) : new defpackage.fkx(-1, jC, j2);
        }
        return new defpackage.fkx(0, -9223372036854775807L, jE);
    }

    @Override // defpackage.fky
    public final /* synthetic */ void b() {
    }
}
