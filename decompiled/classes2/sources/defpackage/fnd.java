package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fnd extends defpackage.fnh {
    private static final int[] a = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int e;

    @Override // defpackage.fnh
    protected final boolean a(defpackage.etx etxVar) throws defpackage.fng {
        if (this.b) {
            etxVar.R(1);
        } else {
            int iN = etxVar.n();
            int i = iN >> 4;
            this.e = i;
            if (i == 2) {
                int i2 = a[(iN >> 2) & 3];
                defpackage.eqf eqfVar = new defpackage.eqf();
                eqfVar.a("video/x-flv");
                eqfVar.c("audio/mpeg");
                eqfVar.F = 1;
                eqfVar.H = i2;
                this.d.p(new defpackage.eqg(eqfVar));
                this.c = true;
            } else if (i == 7 || i == 8) {
                defpackage.eqf eqfVar2 = new defpackage.eqf();
                eqfVar2.a("video/x-flv");
                eqfVar2.c(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                eqfVar2.F = 1;
                eqfVar2.H = 8000;
                this.d.p(new defpackage.eqg(eqfVar2));
                this.c = true;
            } else if (i != 10) {
                throw new defpackage.fng(a.bj(i, "Audio format not supported: "));
            }
            this.b = true;
        }
        return true;
    }

    @Override // defpackage.fnh
    protected final boolean b(defpackage.etx etxVar, long j) {
        if (this.e == 2) {
            int iD = etxVar.d();
            defpackage.fmk fmkVar = this.d;
            fmkVar.b(etxVar, iD);
            fmkVar.d(j, 1, iD, 0, null);
            return true;
        }
        int iN = etxVar.n();
        if (iN == 0 && !this.c) {
            int iD2 = etxVar.d();
            byte[] bArr = new byte[iD2];
            etxVar.L(bArr, 0, iD2);
            defpackage.fsi fsiVarA = defpackage.fko.a(bArr);
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.a("video/x-flv");
            eqfVar.c("audio/mp4a-latm");
            eqfVar.j = (java.lang.String) fsiVarA.c;
            eqfVar.F = fsiVarA.b;
            eqfVar.H = fsiVarA.a;
            eqfVar.q = java.util.Collections.singletonList(bArr);
            this.d.p(new defpackage.eqg(eqfVar));
            this.c = true;
        } else if (this.e != 10 || iN == 1) {
            int iD3 = etxVar.d();
            defpackage.fmk fmkVar2 = this.d;
            fmkVar2.b(etxVar, iD3);
            fmkVar2.d(j, 1, iD3, 0, null);
            return true;
        }
        return false;
    }
}
