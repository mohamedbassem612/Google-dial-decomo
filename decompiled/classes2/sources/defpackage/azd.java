package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class azd implements azz {
    private final ayy a;

    public azd(ayy ayyVar) {
        this.a = ayyVar;
    }

    public final int a(dpf dpfVar) {
        return dpfVar.dp(this.a.b);
    }

    public final int b(dpf dpfVar, dpq dpqVar) {
        return dpfVar.dp(this.a.b(dpqVar));
    }

    public final int c(dpf dpfVar, dpq dpqVar) {
        return dpfVar.dp(this.a.c(dpqVar));
    }

    public final int d(dpf dpfVar) {
        return dpfVar.dp(this.a.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.azd) {
            return aooh.n(((defpackage.azd) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        azc azcVar = this.a;
        dpq dpqVar = dpq.a;
        float fB = azcVar.b(dpqVar);
        float fC = azcVar.c(dpqVar);
        azc azcVar2 = azcVar;
        return "PaddingValues(" + dpi.b(fB) + ", " + dpi.b(azcVar2.a) + ", " + dpi.b(fC) + ", " + dpi.b(azcVar2.b) + ')';
    }
}
