package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kcu {
    public final aify a;
    public final kiu b;
    private final int c;

    public kcu(aify aifyVar, kiu kiuVar) {
        aooh.f(aifyVar, "chips");
        aooh.f(kiuVar, "coalescedRow");
        this.a = aifyVar;
        this.b = kiuVar;
        this.c = 2131428497;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kcu) {
            defpackage.kcu kcuVar = (defpackage.kcu) obj;
            if (aooh.n(this.a, kcuVar.a) && aooh.n(this.b, kcuVar.b)) {
                int i = kcuVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 2131428497;
    }

    public final java.lang.String toString() {
        return "ChipConfig(chips=" + this.a + ", coalescedRow=" + this.b + ", snackbarCoordinatorLayoutId=2131428497)";
    }
}
