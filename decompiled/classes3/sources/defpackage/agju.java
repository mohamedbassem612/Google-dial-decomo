package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agju {
    public final java.util.List a;
    public final boolean b;
    public final defpackage.alln c;

    public agju(java.util.List list, boolean z, defpackage.alln allnVar) {
        this.a = list;
        this.b = z;
        this.c = allnVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agju) {
            defpackage.agju agjuVar = (defpackage.agju) obj;
            if (aooh.n(this.a, agjuVar.a) && this.b == agjuVar.b && aooh.n(this.c, agjuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.alln allnVar = this.c;
        return ((iHashCode + anty.L(this.b)) * 31) + (allnVar == null ? 0 : allnVar.hashCode());
    }

    public final java.lang.String toString() {
        return "KeyframeSequence(transitions=" + this.a + ", isRepeatable=" + this.b + ", shaderUpdater=" + this.c + ')';
    }

    public agju() {
        this(aokc.a, false, null);
    }
}
