package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cfk {
    public static final int a(defpackage.acm acmVar) {
        int iA;
        int iA2 = acmVar.a(0);
        while (acmVar.b != 0 && acmVar.a(0) == iA2) {
            acmVar.i(0, acmVar.b());
            acmVar.h(acmVar.b - 1);
            int i = acmVar.b;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int iA3 = acmVar.a(i3);
                int i4 = (i3 + 1) << 1;
                int i5 = i4 - 1;
                int iA4 = acmVar.a(i5);
                if (i4 < i && (iA = acmVar.a(i4)) > iA4) {
                    if (iA <= iA3) {
                        break;
                    }
                    acmVar.i(i3, iA);
                    acmVar.i(i4, iA3);
                    i3 = i4;
                } else {
                    if (iA4 <= iA3) {
                        break;
                    }
                    acmVar.i(i3, iA4);
                    acmVar.i(i5, iA3);
                    i3 = i5;
                }
            }
        }
        return iA2;
    }

    public static final void b(defpackage.acm acmVar, int i) {
        if (acmVar.b == 0 || !(acmVar.a(0) == i || acmVar.a(acmVar.b - 1) == i)) {
            int i2 = acmVar.b;
            acmVar.f(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = acmVar.a(i3);
                if (i <= iA) {
                    break;
                }
                acmVar.i(i2, iA);
                i2 = i3;
            }
            acmVar.i(i2, i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
