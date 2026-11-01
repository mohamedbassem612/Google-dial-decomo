package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fvi {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(defpackage.flk flkVar) {
        defpackage.etx etxVar = new defpackage.etx(8);
        int i = ygr.b(flkVar, etxVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((defpackage.flc) flkVar).n(etxVar.b, 0, 4, false);
        etxVar.Q(0);
        int i2 = etxVar.i();
        if (i2 == 1463899717) {
            return true;
        }
        defpackage.etr.c("WavHeaderReader", a.bj(i2, "Unsupported form type: "));
        return false;
    }

    public static ygr b(int i, defpackage.flk flkVar, defpackage.etx etxVar) throws defpackage.era {
        ygr ygrVarB = ygr.b(flkVar, etxVar);
        while (true) {
            int i2 = ygrVarB.a;
            if (i2 == i) {
                return ygrVarB;
            }
            defpackage.etr.f("WavHeaderReader", a.bj(i2, "Ignoring unknown WAV chunk: "));
            long j = ygrVarB.b;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw new defpackage.era(a.bj(i2, "Chunk is too large (~2GB+) to skip; id: "), null, false, 1);
            }
            ((defpackage.flc) flkVar).p((int) j2, false);
            ygrVarB = ygr.b(flkVar, etxVar);
        }
    }
}
