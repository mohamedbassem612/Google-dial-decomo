package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fon extends defpackage.foj {
    public final java.lang.String a;
    public final byte[] b;

    public fon(java.lang.String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fon fonVar = (defpackage.fon) obj;
            if (j$.util.Objects.equals(this.a, fonVar.a) && java.util.Arrays.equals(this.b, fonVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + java.util.Arrays.hashCode(this.b);
    }

    @Override // defpackage.foj
    public final java.lang.String toString() {
        return this.f + ": owner=" + this.a;
    }
}
