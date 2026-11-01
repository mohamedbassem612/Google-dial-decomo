package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fom extends defpackage.foj {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public fom(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fom fomVar = (defpackage.fom) obj;
            if (this.a == fomVar.a && this.b == fomVar.b && this.c == fomVar.c && java.util.Arrays.equals(this.d, fomVar.d) && java.util.Arrays.equals(this.e, fomVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + java.util.Arrays.hashCode(this.d)) * 31) + java.util.Arrays.hashCode(this.e);
    }
}
