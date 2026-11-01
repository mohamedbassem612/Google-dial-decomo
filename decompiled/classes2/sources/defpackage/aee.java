package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aee {
    public static final java.lang.Object a = new java.lang.Object();

    public static final java.lang.Object a(aed aedVar, int i) {
        java.lang.Object obj;
        int iA = aei.a(aedVar.b, aedVar.d, i);
        if (iA < 0 || (obj = aedVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(aed aedVar) {
        int i = aedVar.d;
        int[] iArr = aedVar.b;
        java.lang.Object[] objArr = aedVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        aedVar.a = false;
        aedVar.d = i2;
    }
}
