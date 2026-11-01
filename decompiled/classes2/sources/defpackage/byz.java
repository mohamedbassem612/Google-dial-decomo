package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class byz implements defpackage.byq {
    private final cmi a;

    public byz(cmi cmiVar) {
        this.a = cmiVar;
    }

    @Override // defpackage.byq
    public final int a(dpo dpoVar, long j, int i, dpq dpqVar) {
        return java.lang.Math.round(((((int) (j >> 32)) - i) / 2.0f) * (((defpackage.cmk) this.a).a + 1.0f));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.byz) && aooh.n(this.a, ((defpackage.byz) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Horizontal(alignment=" + this.a + ')';
    }
}
