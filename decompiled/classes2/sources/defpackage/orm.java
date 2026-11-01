package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class orm {
    public final java.lang.String a;
    public final j$.util.Optional b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    private final j$.util.Optional f;
    private final j$.util.Optional g;

    public orm(java.lang.String str, j$.util.Optional optional, j$.util.Optional optional2, java.lang.String str2, j$.util.Optional optional3, java.lang.String str3, java.lang.String str4) {
        this.a = str;
        this.f = optional;
        this.b = optional2;
        this.c = str2;
        this.g = optional3;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.orm) {
            defpackage.orm ormVar = (defpackage.orm) obj;
            if (this.a.equals(ormVar.a) && this.f.equals(ormVar.f) && this.b.equals(ormVar.b) && this.c.equals(ormVar.c) && this.g.equals(ormVar.g) && this.d.equals(ormVar.d) && this.e.equals(ormVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.g;
        j$.util.Optional optional2 = this.b;
        return "WwwAuthenticateParameters{realm=" + this.a + ", domain=" + java.lang.String.valueOf(this.f) + ", qop=" + java.lang.String.valueOf(optional2) + ", nonce=" + this.c + ", stale=" + java.lang.String.valueOf(optional) + ", opaque=" + this.d + ", algorithm=" + this.e + '}';
    }

    public orm() {
        throw null;
    }
}
