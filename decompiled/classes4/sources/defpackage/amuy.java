package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amuy {
    public static final defpackage.amuy a = new defpackage.amuy(defpackage.amuz.a, 0, 0, 0);
    public final int b;
    public final defpackage.amuz c;
    public final int d;
    public final int e;
    private final int f;

    public amuy(defpackage.amuz amuzVar, int i, int i2, int i3) {
        this.c = amuzVar;
        this.b = i;
        this.d = i2;
        this.e = i3;
        this.f = i2 > 62 ? 21 : i2 > 31 ? 20 : i2 > 0 ? 10 : 0;
    }

    public final defpackage.amuy a(int i) {
        int i2 = this.b;
        defpackage.amuz amuzVar = this.c;
        int i3 = this.e;
        if (i2 == 4) {
            int i4 = defpackage.amuw.b[i2][0];
            char c = (char) i4;
            int i5 = i4 >> 16;
            defpackage.amux amuxVar = new defpackage.amux(amuzVar, c, i5);
            i3 += i5;
            i2 = 0;
            amuzVar = amuxVar;
        } else if (i2 == 2) {
            i2 = 2;
            int i6 = defpackage.amuw.b[i2][0];
            char c2 = (char) i6;
            int i7 = i6 >> 16;
            defpackage.amux amuxVar2 = new defpackage.amux(amuzVar, c2, i7);
            i3 += i7;
            i2 = 0;
            amuzVar = amuxVar2;
        }
        int i8 = this.d;
        int i9 = 18;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i9 = 9;
                i8 = 62;
            } else {
                i9 = 8;
            }
        }
        defpackage.amuy amuyVar = new defpackage.amuy(amuzVar, i2, i8 + 1, i3 + i9);
        return amuyVar.d == 2078 ? amuyVar.b(i + 1) : amuyVar;
    }

    public final defpackage.amuy b(int i) {
        int i2 = this.d;
        return i2 != 0 ? new defpackage.amuy(new defpackage.amuu(this.c, i - i2, i2), this.b, 0, this.e) : this;
    }

    public final defpackage.amuy c(int i, int i2) {
        int i3 = this.e;
        defpackage.amuz amuxVar = this.c;
        int i4 = this.b;
        if (i != i4) {
            int i5 = defpackage.amuw.b[i4][i];
            char c = (char) i5;
            int i6 = i5 >> 16;
            i3 += i6;
            amuxVar = new defpackage.amux(amuxVar, c, i6);
        }
        int i7 = i == 2 ? 4 : 5;
        return new defpackage.amuy(new defpackage.amux(amuxVar, i2, i7), i, 0, i3 + i7);
    }

    public final defpackage.amuy d(int i, int i2) {
        int[][] iArr = defpackage.amuw.d;
        int i3 = this.b;
        int i4 = iArr[i3][i];
        int i5 = i3 == 2 ? 4 : 5;
        return new defpackage.amuy(new defpackage.amux(new defpackage.amux(this.c, i4, i5), i2, 5), i3, 0, this.e + i5 + 5);
    }

    final boolean e(defpackage.amuy amuyVar) {
        int i = this.e + (defpackage.amuw.b[this.b][amuyVar.b] >> 16);
        int i2 = this.d;
        int i3 = amuyVar.d;
        if (i2 < i3) {
            i += amuyVar.f - this.f;
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= amuyVar.e;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s bits=%d bytes=%d", defpackage.amuw.a[this.b], java.lang.Integer.valueOf(this.e), java.lang.Integer.valueOf(this.d));
    }
}
