package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mbf implements defpackage.mbh {
    public final java.lang.Integer a;

    public mbf(java.lang.Integer num) {
        this.a = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.mbf) && aooh.n(this.a, ((defpackage.mbf) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final java.lang.String toString() {
        return "AlwaysLog(semanticEventId=" + this.a + ')';
    }

    public mbf() {
        this(null);
    }
}
