package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uqb {
    public final defpackage.upt a;
    public final java.lang.String b;

    public uqb(defpackage.upt uptVar, java.lang.String str) {
        if (uptVar == null) {
            throw new java.lang.NullPointerException("Null starredContact");
        }
        this.a = uptVar;
        if (str == null) {
            throw new java.lang.NullPointerException("Null rawContactId");
        }
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uqb) {
            defpackage.uqb uqbVar = (defpackage.uqb) obj;
            if (this.a.equals(uqbVar.a) && this.b.equals(uqbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "StarredContactWithRawContactId{starredContact=" + this.a.toString() + ", rawContactId=" + this.b + '}';
    }

    public uqb() {
        throw null;
    }
}
