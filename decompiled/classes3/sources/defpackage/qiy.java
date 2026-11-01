package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qiy {
    public final boolean a;
    public final java.lang.Long b;

    public qiy(boolean z, java.lang.Long l) {
        this.a = z;
        this.b = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qiy) {
            defpackage.qiy qiyVar = (defpackage.qiy) obj;
            if (this.a == qiyVar.a && aooh.n(this.b, qiyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Long l = this.b;
        return (anty.L(this.a) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final java.lang.String toString() {
        return "NotificationWhen(usesChronometer=" + this.a + ", callConnectTimeMillis=" + this.b + ')';
    }
}
