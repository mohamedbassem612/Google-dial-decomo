package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhq {
    public final java.lang.String a;
    public final java.lang.String b;

    public zhq(java.lang.String str, java.lang.String str2) {
        aooh.f(str2, "uniqueCallId");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zhq) {
            defpackage.zhq zhqVar = (defpackage.zhq) obj;
            if (aooh.n(this.a, zhqVar.a) && aooh.n(this.b, zhqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallIdPair(id=" + this.a + ", uniqueCallId=" + this.b + ')';
    }
}
