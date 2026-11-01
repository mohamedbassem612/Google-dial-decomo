package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbh implements defpackage.cew {
    public final defpackage.aonj a;

    public cbh(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // defpackage.cew
    public final java.lang.Object a(defpackage.cje cjeVar) {
        return this.a.a(cjeVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cbh) && defpackage.aooh.n(this.a, ((defpackage.cbh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
