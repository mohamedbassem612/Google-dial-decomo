package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sub {
    public final j$.util.Optional a;
    public final j$.util.Optional b;

    public sub(j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.sub) {
            defpackage.sub subVar = (defpackage.sub) obj;
            if (this.a.equals(subVar.a) && this.b.equals(subVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.b;
        return "LightweightQueryResult{selectedPhoneAccountHandle=" + java.lang.String.valueOf(this.a) + ", dataId=" + java.lang.String.valueOf(optional) + '}';
    }

    public sub() {
        throw null;
    }
}
