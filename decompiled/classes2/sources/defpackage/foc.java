package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class foc extends defpackage.foj {
    public final byte[] a;

    public foc(java.lang.String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.foc focVar = (defpackage.foc) obj;
            if (this.f.equals(focVar.f) && java.util.Arrays.equals(this.a, focVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.a);
    }
}
