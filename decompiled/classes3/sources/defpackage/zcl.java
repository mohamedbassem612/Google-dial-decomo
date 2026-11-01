package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zcl extends wsc {
    public final long a;

    public zcl(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zcl) && this.a == ((defpackage.zcl) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "LongValue(value=" + this.a + ')';
    }
}
