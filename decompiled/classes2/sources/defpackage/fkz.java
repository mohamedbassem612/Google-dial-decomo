package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fkz {
    public final defpackage.fkt a;
    protected final defpackage.fky b;
    protected defpackage.fkv c;
    private final int d;

    public fkz(defpackage.fkw fkwVar, defpackage.fky fkyVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fkyVar;
        this.d = i;
        this.a = new defpackage.fkt(fkwVar, j, j2, j3, j4, j5);
    }

    protected static final boolean d(defpackage.flk flkVar, long j) {
        defpackage.flc flcVar = (defpackage.flc) flkVar;
        long j2 = j - flcVar.b;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        flcVar.p((int) j2, false);
        return true;
    }

    public static int e(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    protected static final int g(defpackage.flk flkVar, long j, aesq aesqVar) {
        if (j == ((defpackage.flc) flkVar).b) {
            return 0;
        }
        aesqVar.a = j;
        return 1;
    }

    public final void a(long j) {
        defpackage.fkv fkvVar = this.c;
        if (fkvVar == null || fkvVar.a != j) {
            defpackage.fkt fktVar = this.a;
            this.c = new defpackage.fkv(j, fktVar.a.a(j), fktVar.b, fktVar.c, fktVar.d, fktVar.e);
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    protected final void c() {
        this.c = null;
        this.b.b();
    }

    public final int f(defpackage.flk flkVar, aesq aesqVar) {
        while (true) {
            defpackage.fkv fkvVar = this.c;
            ahvr.ci(fkvVar);
            long j = fkvVar.e;
            long j2 = fkvVar.f - j;
            int i = this.d;
            long j3 = fkvVar.g;
            if (j2 <= i) {
                c();
                return g(flkVar, j, aesqVar);
            }
            if (!d(flkVar, j3)) {
                return g(flkVar, j3, aesqVar);
            }
            flkVar.k();
            defpackage.fkx fkxVarA = this.b.a(flkVar, fkvVar.b);
            int i2 = fkxVarA.b;
            if (i2 == -3) {
                c();
                return g(flkVar, j3, aesqVar);
            }
            if (i2 == -2) {
                long j4 = fkxVarA.c;
                long j5 = fkxVarA.d;
                fkvVar.c = j4;
                fkvVar.e = j5;
                fkvVar.b();
            } else {
                if (i2 != -1) {
                    long j6 = fkxVarA.d;
                    d(flkVar, j6);
                    c();
                    return g(flkVar, j6, aesqVar);
                }
                long j7 = fkxVarA.c;
                long j8 = fkxVarA.d;
                fkvVar.d = j7;
                fkvVar.f = j8;
                fkvVar.b();
            }
        }
    }
}
