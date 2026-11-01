package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class fhs implements defpackage.fii {
    public static final java.util.Comparator a = new defpackage.djh(7);
    protected final defpackage.ern b;
    protected final int c;
    protected final int[] d;
    private final defpackage.eqg[] e;
    private int f;

    public fhs(defpackage.ern ernVar, int[] iArr, java.util.Comparator comparator) {
        defpackage.eqg[] eqgVarArr;
        int length = iArr.length;
        ahvr.bY(length > 0);
        ahvr.ci(ernVar);
        this.b = ernVar;
        this.c = length;
        this.e = new defpackage.eqg[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            eqgVarArr = this.e;
            if (i >= length2) {
                break;
            }
            eqgVarArr[i] = ernVar.a(iArr[i]);
            i++;
        }
        java.util.Arrays.sort(eqgVarArr, comparator);
        this.d = new int[this.c];
        for (int i2 = 0; i2 < this.c; i2++) {
            int[] iArr2 = this.d;
            defpackage.eqg eqgVar = this.e[i2];
            int i3 = 0;
            while (true) {
                defpackage.eqg[] eqgVarArr2 = ernVar.d;
                if (i3 >= eqgVarArr2.length) {
                    i3 = -1;
                    break;
                } else if (eqgVar == eqgVarArr2[i3]) {
                    break;
                } else {
                    i3++;
                }
            }
            iArr2[i2] = i3;
        }
    }

    @Override // defpackage.fik
    public final defpackage.eqg a(int i) {
        return this.e[i];
    }

    @Override // defpackage.fii
    public final defpackage.eqg b() {
        return this.e[0];
    }

    @Override // defpackage.fik
    public final defpackage.ern c() {
        return this.b;
    }

    @Override // defpackage.fik
    public final int e(int i) {
        return this.d[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fhs fhsVar = (defpackage.fhs) obj;
            if (this.b.equals(fhsVar.b) && java.util.Arrays.equals(this.d, fhsVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fii
    public final int f() {
        return this.d[0];
    }

    @Override // defpackage.fik
    public final int g(int i) {
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.d[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.fik
    public final int h() {
        return this.d.length;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (java.lang.System.identityHashCode(this.b) * 31) + java.util.Arrays.hashCode(this.d);
        this.f = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
