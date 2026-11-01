package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqv extends defpackage.frc {
    private defpackage.flo a;
    private defpackage.fqu q;

    private static boolean d(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // defpackage.frc
    protected final long a(defpackage.etx etxVar) {
        if (!d(etxVar.b)) {
            return -1L;
        }
        int i = (etxVar.b[2] & 255) >> 4;
        if (i == 6) {
            etxVar.R(4);
            etxVar.y();
        } else if (i == 7) {
            i = 7;
            etxVar.R(4);
            etxVar.y();
        }
        int iAi = defpackage.hgu.ai(etxVar, i);
        etxVar.Q(0);
        return iAi;
    }

    @Override // defpackage.frc
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.q = null;
        }
    }

    @Override // defpackage.frc
    protected final boolean c(defpackage.etx etxVar, long j, defpackage.hiz hizVar) {
        byte[] bArr = etxVar.b;
        defpackage.flo floVar = this.a;
        if (floVar == null) {
            defpackage.flo floVar2 = new defpackage.flo(bArr, 17);
            this.a = floVar2;
            defpackage.eqf eqfVar = new defpackage.eqf(floVar2.c(java.util.Arrays.copyOfRange(bArr, 9, etxVar.d), null));
            eqfVar.a("audio/ogg");
            hizVar.b = new defpackage.eqg(eqfVar);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            ils ilsVarAF = defpackage.hgu.aF(etxVar);
            defpackage.flo floVarE = floVar.e(ilsVarAF);
            this.a = floVarE;
            this.q = new defpackage.fqu(floVarE, ilsVarAF);
            return true;
        }
        if (!d(bArr)) {
            return true;
        }
        defpackage.fqu fquVar = this.q;
        if (fquVar != null) {
            fquVar.a = j;
            hizVar.a = fquVar;
        }
        ahvr.ci(hizVar.b);
        return false;
    }
}
