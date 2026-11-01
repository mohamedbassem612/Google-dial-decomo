package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tiv {
    public final java.lang.String a;
    public final int b;
    public final defpackage.abvz c;
    public final int d;
    public final defpackage.tkd e;

    public tiv(defpackage.tkd tkdVar, java.lang.String str, int i, defpackage.abvz abvzVar, int i2) {
        this.e = tkdVar;
        this.a = str;
        this.b = i;
        this.c = abvzVar;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tiv) {
            defpackage.tiv tivVar = (defpackage.tiv) obj;
            if (this.e.equals(tivVar.e) && this.a.equals(tivVar.a) && this.b == tivVar.b && this.c.equals(tivVar.c) && this.d == tivVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final java.lang.String toString() {
        defpackage.abvz abvzVar = this.c;
        return "DefaultDirectoryContactInfo{rowClickListener=" + java.lang.String.valueOf(this.e) + ", phoneNumber=" + this.a + ", ranking=" + this.b + ", calleeId=" + java.lang.String.valueOf(abvzVar) + ", carrierPresence=" + this.d + '}';
    }

    public tiv() {
        throw null;
    }
}
