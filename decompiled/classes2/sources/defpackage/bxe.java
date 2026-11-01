package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bxe implements defpackage.byq {
    private final cmi a;
    private final cmi b;

    public bxe(cmi cmiVar, cmi cmiVar2) {
        this.a = cmiVar;
        this.b = cmiVar2;
    }

    @Override // defpackage.byq
    public final int a(dpo dpoVar, long j, int i, dpq dpqVar) {
        int iA = this.b.a(0, dpoVar.b(), dpqVar);
        return dpoVar.b + iA + (-this.a.a(0, i, dpqVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bxe) {
            defpackage.bxe bxeVar = (defpackage.bxe) obj;
            if (aooh.n(this.a, bxeVar.a) && aooh.n(this.b, bxeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ')';
    }
}
