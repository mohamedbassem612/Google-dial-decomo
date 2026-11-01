package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvd {
    public static final defpackage.amvd a = new defpackage.amvd(4201, 4096, 1);
    public static final defpackage.amvd b = new defpackage.amvd(1033, 1024, 1);
    public static final defpackage.amvd c = new defpackage.amvd(67, 64, 1);
    public static final defpackage.amvd d = new defpackage.amvd(19, 16, 1);
    public static final defpackage.amvd e = new defpackage.amvd(285, 256, 0);
    public static final defpackage.amvd f;
    public static final defpackage.amvd g;
    public final int[] h;
    public final int[] i;
    public final defpackage.amve j;
    public final int k;
    public final int l;
    private final int m;

    static {
        defpackage.amvd amvdVar = new defpackage.amvd(301, 256, 1);
        f = amvdVar;
        g = amvdVar;
    }

    public amvd(int i, int i2, int i3) {
        int i4;
        this.m = i;
        this.k = i2;
        this.l = i3;
        this.h = new int[i2];
        this.i = new int[i2];
        int i5 = 0;
        int i6 = 1;
        while (true) {
            i4 = i2 - 1;
            if (i5 >= i2) {
                break;
            }
            this.h[i5] = i6;
            i6 <<= 1;
            if (i6 >= i2) {
                i6 = (i6 ^ i) & i4;
            }
            i5++;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            this.i[this.h[i7]] = i7;
        }
        this.j = new defpackage.amve(this, new int[]{0});
        new defpackage.amve(this, new int[]{1});
    }

    public final int a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.h;
        int[] iArr2 = this.i;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.k - 1)];
    }

    public final java.lang.String toString() {
        return "GF(0x" + java.lang.Integer.toHexString(this.m) + ',' + this.k + ')';
    }
}
