package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fml {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public final void a(defpackage.fmk fmkVar, defpackage.fmj fmjVar) {
        if (this.c > 0) {
            fmkVar.d(this.d, this.e, this.f, this.g, fmjVar);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(defpackage.fmk fmkVar, long j, int i, int i2, int i3, defpackage.fmj fmjVar) {
        ahvr.bZ(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(fmkVar, fmjVar);
            }
        }
    }

    public final void d(defpackage.flk flkVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        flkVar.i(bArr, 0, 10);
        flkVar.k();
        int[] iArr = defpackage.fkp.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
