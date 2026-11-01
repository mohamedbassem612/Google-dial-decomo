package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fqx {
    public boolean d;
    public boolean e;
    private int g;
    public final defpackage.fqy a = new defpackage.fqy();
    public final defpackage.etx b = new defpackage.etx(new byte[65025], 0);
    public int c = -1;
    public long f = -1;

    private final int b(int i) {
        int i2;
        int i3 = 0;
        this.g = 0;
        do {
            int i4 = this.g;
            int i5 = i + i4;
            defpackage.fqy fqyVar = this.a;
            if (i5 >= fqyVar.c) {
                break;
            }
            this.g = i4 + 1;
            i2 = fqyVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(defpackage.flk flkVar) {
        if (this.d) {
            this.d = false;
            this.b.M(0);
            this.f = -1L;
        }
        while (true) {
            if (this.d) {
                return true;
            }
            int i = this.c;
            if (i < 0) {
                defpackage.fqy fqyVar = this.a;
                if (!fqyVar.c(flkVar, -1L) || !fqyVar.b(flkVar, true)) {
                    return false;
                }
                int iB = fqyVar.d;
                this.e = false;
                if ((fqyVar.a & 1) == 1 && this.b.d == 0) {
                    iB += b(0);
                    int i2 = this.g;
                    this.e = i2 > 0 && fqyVar.f[i2 + (-1)] != 255;
                    i = i2;
                } else {
                    i = 0;
                }
                if (!defpackage.hgu.ao(flkVar, iB)) {
                    return false;
                }
                this.c = i;
            }
            int iB2 = b(i);
            int i3 = this.c + this.g;
            if (iB2 > 0) {
                defpackage.etx etxVar = this.b;
                etxVar.H(etxVar.d + iB2);
                if (!defpackage.hgu.an(flkVar, etxVar.b, etxVar.d, iB2)) {
                    return false;
                }
                etxVar.P(etxVar.d + iB2);
            }
            if (this.b.d > 0 && this.g > 0) {
                this.d = this.a.f[i3 + (-1)] != 255;
            }
            if (this.d) {
                this.e = false;
            } else if (this.e) {
                defpackage.fqy fqyVar2 = this.a;
                if (i3 == fqyVar2.c && (fqyVar2.a & 4) == 0) {
                    long j = fqyVar2.b;
                    if (j >= 0) {
                        this.f = j;
                    }
                }
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
    }
}
