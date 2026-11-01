package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class flo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final ils k;
    private final defpackage.eqy l;

    public flo(byte[] bArr, int i) {
        defpackage.etv etvVar = new defpackage.etv(bArr);
        etvVar.l(i << 3);
        this.a = etvVar.d(16);
        this.b = etvVar.d(16);
        this.c = etvVar.d(24);
        this.d = etvVar.d(24);
        int iD = etvVar.d(20);
        this.e = iD;
        this.f = g(iD);
        this.g = etvVar.d(3) + 1;
        int iD2 = etvVar.d(5) + 1;
        this.h = iD2;
        this.i = f(iD2);
        this.j = etvVar.e(36);
        this.k = null;
        this.l = null;
    }

    private static int f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int g(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long a() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final long b(long j) {
        return eum.s((j * ((long) this.e)) / 1000000, 0L, this.j - 1);
    }

    public final defpackage.eqg c(byte[] bArr, defpackage.eqy eqyVar) {
        bArr[4] = -128;
        defpackage.eqy eqyVarD = d(eqyVar);
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.c("audio/flac");
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        eqfVar.o = i;
        eqfVar.F = this.g;
        eqfVar.H = this.e;
        eqfVar.I = eum.o(this.h);
        eqfVar.q = java.util.Collections.singletonList(bArr);
        eqfVar.k = eqyVarD;
        return new defpackage.eqg(eqfVar);
    }

    public final defpackage.eqy d(defpackage.eqy eqyVar) {
        defpackage.eqy eqyVar2 = this.l;
        return eqyVar2 != null ? eqyVar2.e(eqyVar) : eqyVar;
    }

    public final defpackage.flo e(ils ilsVar) {
        return new defpackage.flo(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, ilsVar, this.l);
    }

    public flo(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, ils ilsVar, defpackage.eqy eqyVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = g(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.k = ilsVar;
        this.l = eqyVar;
    }
}
