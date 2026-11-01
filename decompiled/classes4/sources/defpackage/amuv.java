package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amuv {
    public static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static defpackage.amva a(defpackage.amva amvaVar, int i, int i2) {
        defpackage.amvd amvdVar;
        int i3 = amvaVar.b / i2;
        if (i2 == 4) {
            amvdVar = defpackage.amvd.d;
        } else if (i2 == 6) {
            amvdVar = defpackage.amvd.c;
        } else if (i2 == 8) {
            amvdVar = defpackage.amvd.g;
        } else if (i2 == 10) {
            amvdVar = defpackage.amvd.b;
        } else {
            if (i2 != 12) {
                throw new java.lang.IllegalArgumentException(a.bj(i2, "Unsupported word size "));
            }
            amvdVar = defpackage.amvd.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new defpackage.amve(amvdVar, new int[]{1}));
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = amvaVar.b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= amvaVar.e((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        anar.P(iArr, i4 - i3, amvdVar, arrayList);
        defpackage.amva amvaVar2 = new defpackage.amva();
        amvaVar2.d(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            amvaVar2.d(iArr[i9], i2);
        }
        return amvaVar2;
    }

    public static void b(defpackage.amvb amvbVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    amvbVar.b(i5, i4);
                    amvbVar.b(i5, i6);
                    amvbVar.b(i4, i5);
                    amvbVar.b(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        amvbVar.b(i7, i7);
        int i8 = i7 + 1;
        amvbVar.b(i8, i7);
        amvbVar.b(i7, i8);
        int i9 = i + i2;
        amvbVar.b(i9, i7);
        amvbVar.b(i9, i8);
        amvbVar.b(i9, i9 - 1);
    }
}
