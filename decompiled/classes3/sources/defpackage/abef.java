package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abef {
    public final java.lang.Object a;
    public final akc b;

    public abef(java.lang.Object obj, akc akcVar) {
        this.a = obj;
        this.b = akcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abef) {
            defpackage.abef abefVar = (defpackage.abef) obj;
            if (aooh.n(this.a, abefVar.a) && aooh.n(this.b, abefVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ItemWithTransition(item=" + this.a + ", transition=" + this.b + ')';
    }
}
