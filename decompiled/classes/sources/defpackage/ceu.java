package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ceu implements defpackage.cew {
    public final java.lang.Object a;

    public ceu(java.lang.Object obj) {
        this.a = obj;
    }

    @Override // defpackage.cew
    public final java.lang.Object a(defpackage.cje cjeVar) {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ceu) && defpackage.aooh.n(this.a, ((defpackage.ceu) obj).a);
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
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
