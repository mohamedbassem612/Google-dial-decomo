package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oib implements defpackage.oid {
    public final aomy a;

    public oib(aomy aomyVar) {
        this.a = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.oib) && aooh.n(this.a, ((defpackage.oib) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Notify(onClick=" + this.a + ')';
    }
}
