package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qir {
    public final defpackage.qis a;
    public final defpackage.qiq b;
    private final java.lang.Integer c = null;

    public qir(defpackage.qis qisVar, defpackage.qiq qiqVar) {
        this.a = qisVar;
        this.b = qiqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qir) {
            defpackage.qir qirVar = (defpackage.qir) obj;
            if (this.a == qirVar.a) {
                java.lang.Integer num = qirVar.c;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.b, qirVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LargeIcon(priority=" + this.a + ", iconResId=null, iconBitmapWrapper=" + this.b + ')';
    }
}
