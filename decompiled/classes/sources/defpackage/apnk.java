package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnk {
    public static final java.lang.String a = "xn--";
    public static final defpackage.appb b;

    static {
        defpackage.appb appbVar = defpackage.appb.a;
        b = defpackage.aoov.aQ("xn--");
    }

    public static final int a(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = i3 + (i3 / i2);
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return i5 + ((i4 * 36) / (i4 + 38));
    }

    public static final int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bj(i, "unexpected digit: "));
    }
}
