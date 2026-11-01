package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class alci {
    private static volatile int a = 100;

    public static defpackage.alcj b(java.lang.Object obj) {
        return ((defpackage.alad) obj).P;
    }

    public static defpackage.alcj c(defpackage.alcj alcjVar, defpackage.alcj alcjVar2) {
        defpackage.alcj alcjVar3 = defpackage.alcj.a;
        if (alcjVar3.equals(alcjVar2)) {
            return alcjVar;
        }
        if (alcjVar3.equals(alcjVar)) {
            int i = alcjVar.b + alcjVar2.b;
            int[] iArrCopyOf = java.util.Arrays.copyOf(alcjVar.c, i);
            java.lang.System.arraycopy(alcjVar2.c, 0, iArrCopyOf, alcjVar.b, alcjVar2.b);
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(alcjVar.d, i);
            java.lang.System.arraycopy(alcjVar2.d, 0, objArrCopyOf, alcjVar.b, alcjVar2.b);
            return new defpackage.alcj(i, iArrCopyOf, objArrCopyOf, true);
        }
        if (alcjVar2.equals(alcjVar3)) {
            return alcjVar;
        }
        alcjVar.b();
        int i2 = alcjVar.b + alcjVar2.b;
        alcjVar.c(i2);
        java.lang.System.arraycopy(alcjVar2.c, 0, alcjVar.c, alcjVar.b, alcjVar2.b);
        java.lang.System.arraycopy(alcjVar2.d, 0, alcjVar.d, alcjVar.b, alcjVar2.b);
        alcjVar.b = i2;
        return alcjVar;
    }

    public static final defpackage.alcj d(java.lang.Object obj) {
        defpackage.alad aladVar = (defpackage.alad) obj;
        defpackage.alcj alcjVar = aladVar.P;
        if (alcjVar != defpackage.alcj.a) {
            return alcjVar;
        }
        defpackage.alcj alcjVar2 = new defpackage.alcj();
        aladVar.P = alcjVar2;
        return alcjVar2;
    }

    public static final void e(java.lang.Object obj) {
        ((defpackage.alad) obj).P.d();
    }

    final boolean a(java.lang.Object obj, defpackage.akzg akzgVar, int i) throws defpackage.alaz {
        int i2 = akzgVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ((defpackage.alcj) obj).e(i3 << 3, java.lang.Long.valueOf(akzgVar.k()));
            return true;
        }
        if (i4 == 1) {
            ((defpackage.alcj) obj).e((i3 << 3) | 1, java.lang.Long.valueOf(akzgVar.j()));
            return true;
        }
        if (i4 == 2) {
            ((defpackage.alcj) obj).e((i3 << 3) | 2, akzgVar.o());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new defpackage.alaz("Protocol message end-group tag did not match expected tag.");
            }
            if (i4 != 5) {
                throw new defpackage.alay();
            }
            ((defpackage.alcj) obj).e((i3 << 3) | 5, java.lang.Integer.valueOf(akzgVar.e()));
            return true;
        }
        int i5 = i3 << 3;
        defpackage.alcj alcjVar = new defpackage.alcj();
        int i6 = i + 1;
        if (i6 >= a) {
            throw new defpackage.alaz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (akzgVar.c() != Integer.MAX_VALUE && a(alcjVar, akzgVar, i6)) {
        }
        if ((i5 | 4) != akzgVar.b) {
            throw new defpackage.alaz("Protocol message end-group tag did not match expected tag.");
        }
        alcjVar.d();
        ((defpackage.alcj) obj).e(i5 | 3, alcjVar);
        return true;
    }
}
