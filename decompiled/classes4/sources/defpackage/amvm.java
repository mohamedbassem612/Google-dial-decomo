package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class amvm {
    static final defpackage.amvm[] a;
    private static final defpackage.amvm[] g;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final boolean h;
    private final int i;
    private final int j;

    static {
        defpackage.amvm[] amvmVarArr = {new defpackage.amvm(false, 3, 5, 8, 8, 1, 3, 5), new defpackage.amvm(false, 5, 7, 10, 10, 1, 5, 7), new defpackage.amvm(true, 5, 7, 16, 6, 1, 5, 7), new defpackage.amvm(false, 8, 10, 12, 12, 1, 8, 10), new defpackage.amvm(true, 10, 11, 14, 6, 2, 10, 11), new defpackage.amvm(false, 12, 12, 14, 14, 1, 12, 12), new defpackage.amvm(true, 16, 14, 24, 10, 1, 16, 14), new defpackage.amvm(false, 18, 14, 16, 16, 1, 18, 14), new defpackage.amvm(false, 22, 18, 18, 18, 1, 22, 18), new defpackage.amvm(true, 22, 18, 16, 10, 2, 22, 18), new defpackage.amvm(false, 30, 20, 20, 20, 1, 30, 20), new defpackage.amvm(true, 32, 24, 16, 14, 2, 32, 24), new defpackage.amvm(false, 36, 24, 22, 22, 1, 36, 24), new defpackage.amvm(false, 44, 28, 24, 24, 1, 44, 28), new defpackage.amvm(true, 49, 28, 22, 14, 2, 49, 28), new defpackage.amvm(false, 62, 36, 14, 14, 4, 62, 36), new defpackage.amvm(false, 86, 42, 16, 16, 4, 86, 42), new defpackage.amvm(false, 114, 48, 18, 18, 4, 114, 48), new defpackage.amvm(false, 144, 56, 20, 20, 4, 144, 56), new defpackage.amvm(false, 174, 68, 22, 22, 4, 174, 68), new defpackage.amvm(false, 204, 84, 24, 24, 4, 102, 42), new defpackage.amvm(false, 280, 112, 14, 14, 16, 140, 56), new defpackage.amvm(false, 368, 144, 16, 16, 16, 92, 36), new defpackage.amvm(false, 456, 192, 18, 18, 16, 114, 48), new defpackage.amvm(false, 576, 224, 20, 20, 16, 144, 56), new defpackage.amvm(false, 696, 272, 22, 22, 16, 174, 68), new defpackage.amvm(false, 816, 336, 24, 24, 16, 136, 56), new defpackage.amvm(false, 1050, 408, 18, 18, 36, 175, 68), new defpackage.amvm(false, 1304, 496, 20, 20, 36, 163, 62), new defpackage.amvi()};
        a = amvmVarArr;
        g = amvmVarArr;
    }

    public amvm(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.h = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.i = i5;
        this.j = i6;
        this.f = i7;
    }

    public static defpackage.amvm g(int i) {
        defpackage.amvm[] amvmVarArr = g;
        int length = amvmVarArr.length;
        for (int i2 = 0; i2 < 30; i2++) {
            defpackage.amvm amvmVar = amvmVarArr[i2];
            if (i <= amvmVar.b) {
                return amvmVar;
            }
        }
        throw new java.lang.IllegalArgumentException(a.bj(i, "Can't find a symbol arrangement that matches the message. Data codewords: "));
    }

    private final int h() {
        int i = this.i;
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new java.lang.IllegalStateException("Cannot handle this number of data regions");
    }

    private final int i() {
        int i = this.i;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new java.lang.IllegalStateException("Cannot handle this number of data regions");
    }

    public int a(int i) {
        return this.j;
    }

    public int b() {
        return this.b / this.j;
    }

    public final int c() {
        return i() * this.e;
    }

    public final int d() {
        return h() * this.d;
    }

    public final int e() {
        return c() + (i() << 1);
    }

    public final int f() {
        return d() + (h() << 1);
    }

    public final java.lang.String toString() {
        return (true != this.h ? "Square Symbol:" : "Rectangular Symbol:") + " data region " + this.d + 'x' + this.e + ", symbol size " + f() + 'x' + e() + ", symbol data size " + d() + 'x' + c() + ", codewords " + this.b + '+' + this.c;
    }
}
