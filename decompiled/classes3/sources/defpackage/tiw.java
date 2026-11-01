package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tiw {
    public final java.lang.String a;
    public final int b;
    public final defpackage.abvz c;
    public final java.lang.String d;
    public final boolean e;
    public final defpackage.tkd f;

    public tiw(defpackage.tkd tkdVar, java.lang.String str, int i, defpackage.abvz abvzVar, java.lang.String str2, boolean z) {
        this.f = tkdVar;
        this.a = str;
        this.b = i;
        this.c = abvzVar;
        this.d = str2;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tiw) {
            defpackage.tiw tiwVar = (defpackage.tiw) obj;
            if (this.f.equals(tiwVar.f) && this.a.equals(tiwVar.a) && this.b == tiwVar.b && this.c.equals(tiwVar.c) && ((str = this.d) != null ? str.equals(tiwVar.d) : tiwVar.d == null) && this.e == tiwVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
        java.lang.String str = this.d;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        defpackage.abvz abvzVar = this.c;
        return "ExtendedDirectoryContactInfo{rowClickListener=" + java.lang.String.valueOf(this.f) + ", phoneNumber=" + this.a + ", ranking=" + this.b + ", calleeId=" + java.lang.String.valueOf(abvzVar) + ", displayName=" + this.d + ", callLogSearchContact=" + this.e + '}';
    }

    public tiw() {
        throw null;
    }
}
