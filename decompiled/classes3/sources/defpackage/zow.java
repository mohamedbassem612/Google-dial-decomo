package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zow extends aehj {
    public final java.lang.Object a;

    public zow(java.lang.Object obj) {
        super((char[]) null);
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zow) && aooh.n(this.a, ((defpackage.zow) obj).a);
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
