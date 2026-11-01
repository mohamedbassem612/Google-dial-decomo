package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ers {
    public final int a;
    public final defpackage.ern b;
    public final boolean[] c;
    private final boolean d;
    private final int[] e;

    static {
        java.lang.String str = eum.a;
    }

    public ers(defpackage.ern ernVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = ernVar.a;
        this.a = i;
        ahvr.bM(i == iArr.length && i == zArr.length);
        this.b = ernVar;
        this.d = z && i > 1;
        this.e = (int[]) iArr.clone();
        this.c = (boolean[]) zArr.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ers ersVar = (defpackage.ers) obj;
            if (this.d == ersVar.d && this.b.equals(ersVar.b) && java.util.Arrays.equals(this.e, ersVar.e) && java.util.Arrays.equals(this.c, ersVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + (this.d ? 1 : 0)) * 31) + java.util.Arrays.hashCode(this.e)) * 31) + java.util.Arrays.hashCode(this.c);
    }
}
