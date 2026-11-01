package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffj implements defpackage.evr {
    private final defpackage.evr a;
    private final int b;
    private final byte[] c;
    private int d;
    private final defpackage.fgi e;

    public ffj(defpackage.evr evrVar, int i, defpackage.fgi fgiVar) {
        ahvr.bM(i > 0);
        this.a = evrVar;
        this.b = i;
        this.e = fgiVar;
        this.c = new byte[1];
        this.d = i;
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            defpackage.evr evrVar = this.a;
            byte[] bArr2 = this.c;
            int i4 = 0;
            if (evrVar.a(bArr2, 0, 1) == -1) {
                return -1;
            }
            int i5 = (bArr2[0] & 255) << 4;
            if (i5 != 0) {
                byte[] bArr3 = new byte[i5];
                int i6 = i5;
                while (i6 > 0) {
                    int iA = evrVar.a(bArr3, i4, i6);
                    if (iA == -1) {
                        return -1;
                    }
                    i4 += iA;
                    i6 -= iA;
                }
                while (i5 > 0) {
                    int i7 = i5 - 1;
                    if (bArr3[i7] != 0) {
                        defpackage.fgi fgiVar = this.e;
                        defpackage.etx etxVar = new defpackage.etx(bArr3, i5);
                        long jMax = !fgiVar.j ? fgiVar.g : java.lang.Math.max(fgiVar.k.p(true), fgiVar.g);
                        int iD = etxVar.d();
                        defpackage.fmk fmkVar = fgiVar.i;
                        ahvr.ci(fmkVar);
                        fmkVar.b(etxVar, iD);
                        fmkVar.d(jMax, 1, iD, 0, null);
                        fgiVar.j = true;
                        break;
                    }
                    i5 = i7;
                }
            }
            i3 = this.b;
            this.d = i3;
        }
        int iA2 = this.a.a(bArr, i, java.lang.Math.min(i3, i2));
        if (iA2 != -1) {
            this.d -= iA2;
        }
        return iA2;
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        return this.a.c();
    }

    @Override // defpackage.evr
    public final void d() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.evr
    public final java.util.Map e() {
        return this.a.e();
    }

    @Override // defpackage.evr
    public final void f(defpackage.ewm ewmVar) {
        ahvr.ci(ewmVar);
        this.a.f(ewmVar);
    }
}
