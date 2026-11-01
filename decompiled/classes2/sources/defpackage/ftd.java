package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ftd {
    public boolean d;
    public boolean e;
    public int[] f;
    public int g;
    public int h;
    public android.graphics.Rect i;
    public long b = -9223372036854775807L;
    public long c = -9223372036854775807L;
    public final int[] a = new int[4];
    public int j = -1;
    public int k = -1;

    public static int a(int[] iArr, int i) {
        if (i >= iArr.length) {
            i = 0;
        }
        return iArr[i];
    }

    public final void b(defpackage.etv etvVar, boolean z, android.graphics.Rect rect, int[] iArr) {
        int i;
        int i2;
        int i3 = !z ? 1 : 0;
        int iWidth = rect.width();
        int i4 = i3 * iWidth;
        int iHeight = rect.height();
        while (true) {
            int i5 = 0;
            do {
                int i6 = 1;
                int iD = 0;
                while (true) {
                    if (iD >= i6 || i6 > 64) {
                        i = iD & 3;
                        if (iD >= 4) {
                            i2 = iD >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (etvVar.a() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    } else {
                        iD = (iD << 4) | etvVar.d(4);
                        i6 <<= 2;
                    }
                }
                int iMin = java.lang.Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    java.util.Arrays.fill(iArr, i4, i7, this.a[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            etvVar.h();
        }
    }
}
