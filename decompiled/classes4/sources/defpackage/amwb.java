package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class amwb implements defpackage.amur {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("[0-9]+");

    protected static int e(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    protected static void g(java.lang.String str) {
        if (!a.matcher(str).matches()) {
            throw new java.lang.IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    @Override // defpackage.amur
    public final defpackage.amvb a(java.lang.String str, defpackage.amun amunVar, int i) {
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Found empty contents");
        }
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(a.bs(i, "Negative size is not allowed. Input: ", "x1"));
        }
        java.util.Collection collectionB = b();
        if (collectionB != null && !collectionB.contains(amunVar)) {
            throw new java.lang.IllegalArgumentException(a.bK(amunVar, collectionB, "Can only encode ", ", but got "));
        }
        int iF = f();
        boolean[] zArrD = d(str);
        int length = zArrD.length;
        int i2 = iF + length;
        int iMax = java.lang.Math.max(i, i2);
        int i3 = iMax / i2;
        defpackage.amvb amvbVar = new defpackage.amvb(iMax, 1);
        int i4 = (iMax - (length * i3)) / 2;
        int i5 = 0;
        while (i5 < length) {
            if (zArrD[i5]) {
                amvbVar.c(i4, 0, i3, 1);
            }
            i5++;
            i4 += i3;
        }
        return amvbVar;
    }

    protected java.util.Collection b() {
        throw null;
    }

    public abstract boolean[] c(java.lang.String str);

    public boolean[] d(java.lang.String str) {
        return c(str);
    }

    public int f() {
        return 10;
    }
}
