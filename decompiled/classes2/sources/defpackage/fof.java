package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fof extends defpackage.foj {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public fof(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super("COMM");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fof fofVar = (defpackage.fof) obj;
            if (j$.util.Objects.equals(this.b, fofVar.b) && j$.util.Objects.equals(this.a, fofVar.a) && j$.util.Objects.equals(this.c, fofVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.foj
    public final java.lang.String toString() {
        return this.f + ": language=" + this.a + ", description=" + this.b + ", text=" + this.c;
    }
}
