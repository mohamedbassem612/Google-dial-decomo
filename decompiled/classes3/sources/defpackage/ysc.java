package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ysc {
    public final defpackage.yta a;
    public final boolean b;

    public ysc(defpackage.yta ytaVar, boolean z) {
        aooh.f(ytaVar, "aiCoreModelAvailabilityStatus");
        this.a = ytaVar;
        this.b = z;
    }

    public final boolean a() {
        return this.a == defpackage.yta.f && this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ysc) {
            defpackage.ysc yscVar = (defpackage.ysc) obj;
            if (this.a == yscVar.a && this.b == yscVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "AiCoreAvailabilityStatus(aiCoreModelAvailabilityStatus=" + this.a + ", isAstreaUpToDate=" + this.b + ')';
    }
}
