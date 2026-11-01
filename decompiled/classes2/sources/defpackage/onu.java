package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onu {
    public final j$.util.Optional a;
    public final j$.util.Optional b;

    public onu(j$.util.Optional optional, j$.util.Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.onu) {
            defpackage.onu onuVar = (defpackage.onu) obj;
            if (this.a.equals(onuVar.a) && this.b.equals(onuVar.b)) {
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
        return "FidesCallData{callCreationTimeMillis=" + java.lang.String.valueOf(this.a) + ", fidesDetails=" + java.lang.String.valueOf(optional) + '}';
    }

    public onu() {
        throw null;
    }
}
