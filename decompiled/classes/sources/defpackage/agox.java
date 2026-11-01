package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agox {
    public final java.lang.String a;
    public final defpackage.apnt b;

    public agox(java.lang.String str, defpackage.apnt apntVar) {
        this.a = str;
        this.b = apntVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agox) {
            defpackage.agox agoxVar = (defpackage.agox) obj;
            if (this.a.equals(agoxVar.a) && this.b.equals(agoxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AccountProviderConfig{type=" + this.a + ", provider=" + java.lang.String.valueOf(this.b) + '}';
    }

    public agox() {
        throw null;
    }
}
