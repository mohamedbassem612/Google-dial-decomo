package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acmu {
    private final int a;
    private final defpackage.acmb[] b;
    private final acmc[] c;
    private final aiwc d;

    public acmu(int i, defpackage.acmb[] acmbVarArr, acmc[] acmcVarArr) {
        aooh.f(acmbVarArr, "metadata");
        aooh.f(acmcVarArr, "sideChannel");
        this.a = i;
        this.b = acmbVarArr;
        this.c = acmcVarArr;
        this.d = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acmu) {
            defpackage.acmu acmuVar = (defpackage.acmu) obj;
            if (this.a == acmuVar.a && java.util.Arrays.equals(this.b, acmuVar.b) && java.util.Arrays.equals(this.c, acmuVar.c)) {
                aiwc aiwcVar = acmuVar.d;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + java.util.Arrays.hashCode(this.b)) * 31) + java.util.Arrays.hashCode(this.c);
    }
}
