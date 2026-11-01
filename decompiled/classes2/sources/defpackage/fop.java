package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fop extends defpackage.foj {
    public final java.lang.String a;
    public final java.lang.String b;

    public fop(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fop fopVar = (defpackage.fop) obj;
            if (this.f.equals(fopVar.f) && j$.util.Objects.equals(this.a, fopVar.a) && j$.util.Objects.equals(this.b, fopVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f.hashCode() + 527;
        java.lang.String str = this.a;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.b.hashCode();
    }

    @Override // defpackage.foj
    public final java.lang.String toString() {
        return this.f + ": url=" + this.b;
    }
}
