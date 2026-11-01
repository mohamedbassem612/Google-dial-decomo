package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agvs extends defpackage.agwm {
    public final java.lang.Object a;

    public agvs(java.lang.Object obj) {
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.agvs) && aooh.n(this.a, ((defpackage.agvs) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(value=" + this.a + ')';
    }
}
