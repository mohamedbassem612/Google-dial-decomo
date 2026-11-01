package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fra extends defpackage.frc {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean r;

    public static boolean d(defpackage.etx etxVar, byte[] bArr) {
        if (etxVar.d() < 8) {
            return false;
        }
        byte[] bArr2 = etxVar.b;
        int i = etxVar.c;
        for (int i2 = 0; i2 < 8; i2++) {
            if (bArr2[i + i2] != bArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.frc
    protected final long a(defpackage.etx etxVar) {
        if (d(etxVar, a) || d(etxVar, q)) {
            return -1L;
        }
        byte[] bArr = etxVar.b;
        return g(defpackage.hgt.az(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0));
    }

    @Override // defpackage.frc
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.r = false;
        }
    }

    @Override // defpackage.frc
    protected final boolean c(defpackage.etx etxVar, long j, defpackage.hiz hizVar) {
        if (d(etxVar, a)) {
            byte[] bArrCopyOf = java.util.Arrays.copyOf(etxVar.b, etxVar.d);
            int i = bArrCopyOf[9] & 255;
            java.util.List listAA = defpackage.hgt.aA(bArrCopyOf);
            if (hizVar.b != null) {
                return true;
            }
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.a("audio/ogg");
            eqfVar.c("audio/opus");
            eqfVar.F = i;
            eqfVar.H = 48000;
            eqfVar.q = listAA;
            hizVar.b = new defpackage.eqg(eqfVar);
            return true;
        }
        if (!d(etxVar, q)) {
            ahvr.ci(hizVar.b);
            return false;
        }
        ahvr.ci(hizVar.b);
        if (this.r) {
            return true;
        }
        this.r = true;
        etxVar.R(8);
        defpackage.eqy eqyVarA = defpackage.fmm.a(aify.o((java.lang.Object[]) defpackage.hgu.aE(etxVar, false, false).a));
        if (eqyVarA == null) {
            return true;
        }
        defpackage.eqg eqgVar = (defpackage.eqg) hizVar.b;
        defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar);
        eqfVar2.k = eqyVarA.e(eqgVar.l);
        hizVar.b = new defpackage.eqg(eqfVar2);
        return true;
    }

    @Override // defpackage.frc
    protected final byte[] e(long j) {
        return java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(eum.A(j, 1000000000L, 48000L, java.math.RoundingMode.CEILING)).array();
    }
}
