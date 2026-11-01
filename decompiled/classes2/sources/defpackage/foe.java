package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class foe extends defpackage.foj {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final java.lang.String[] d;
    private final defpackage.foj[] e;

    public foe(java.lang.String str, boolean z, boolean z2, java.lang.String[] strArr, defpackage.foj[] fojVarArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = fojVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.foe foeVar = (defpackage.foe) obj;
            if (this.b == foeVar.b && this.c == foeVar.c && j$.util.Objects.equals(this.a, foeVar.a) && java.util.Arrays.equals(this.d, foeVar.d) && java.util.Arrays.equals(this.e, foeVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ? 1 : 0) + 527) * 31) + (this.c ? 1 : 0)) * 31) + this.a.hashCode();
    }
}
