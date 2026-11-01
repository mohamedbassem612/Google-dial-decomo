package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vlv {
    public final int a;
    public final int b;

    public vlv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vlv) {
            defpackage.vlv vlvVar = (defpackage.vlv) obj;
            if (this.a == vlvVar.a && this.b == vlvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "VvmInboxQuota{vvmOccupiedMessages=" + this.a + ", vvmMessagesQuota=" + this.b + '}';
    }

    public vlv() {
        throw null;
    }
}
