package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yts {
    public final defpackage.yse a;
    public final java.lang.Integer b;
    public final int c;

    public yts(defpackage.yse yseVar, java.lang.Integer num, int i) {
        aooh.f(yseVar, "feature");
        this.a = yseVar;
        this.b = num;
        this.c = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yts) {
            defpackage.yts ytsVar = (defpackage.yts) obj;
            if (this.a == ytsVar.a && aooh.n(this.b, ytsVar.b) && this.c == ytsVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.Integer num = this.b;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AiCoreSessionConfig(feature=");
        sb.append(this.a);
        sb.append(", targetModelVersion=");
        sb.append(this.b);
        sb.append(", backpressureStrategy=");
        int i = this.c;
        if (i != 1) {
            str = i != 2 ? "KEEP_LATEST" : "RETRY_WITH_EXPONENTIAL_BACKOFF";
        } else {
            str = "NONE";
        }
        sb.append((java.lang.Object) str);
        sb.append(')');
        return sb.toString();
    }
}
