package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zby implements defpackage.zcc {
    public final zal a;

    public zby(zal zalVar) {
        this.a = zalVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zby) && aooh.n(this.a, ((defpackage.zby) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(error=" + this.a + ')';
    }
}
