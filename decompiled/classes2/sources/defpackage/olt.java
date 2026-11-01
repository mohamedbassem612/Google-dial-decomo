package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class olt {
    public final java.lang.String a;
    public final java.lang.String b;

    public olt(java.lang.String str, java.lang.String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.olt) {
            defpackage.olt oltVar = (defpackage.olt) obj;
            if (this.a.equals(oltVar.a) && this.b.equals(oltVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallSpecificPsd{key=" + this.a + ", value=" + this.b + '}';
    }

    public olt() {
        throw null;
    }
}
