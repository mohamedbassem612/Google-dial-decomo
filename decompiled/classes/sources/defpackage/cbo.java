package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbo implements defpackage.cew {
    public final defpackage.ccp a;

    public cbo(defpackage.ccp ccpVar) {
        this.a = ccpVar;
    }

    @Override // defpackage.cew
    public final java.lang.Object a(defpackage.cje cjeVar) {
        return this.a.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cbo) && defpackage.aooh.n(this.a, ((defpackage.cbo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
