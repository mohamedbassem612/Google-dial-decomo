package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyg {
    public final kiu a;
    public final defpackage.jyd b;
    public final az c;
    private final int d;

    public jyg(kiu kiuVar, defpackage.jyd jydVar, az azVar) {
        aooh.f(kiuVar, "coalescedRow");
        this.a = kiuVar;
        this.b = jydVar;
        this.d = 2131428497;
        this.c = azVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jyg) {
            defpackage.jyg jygVar = (defpackage.jyg) obj;
            if (aooh.n(this.a, jygVar.a) && aooh.n(this.b, jygVar.b)) {
                int i = jygVar.d;
                if (aooh.n(this.c, jygVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 2131428497) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogChipOnClickContext(coalescedRow=" + this.a + ", chip=" + this.b + ", snackbarCoordinatorLayoutId=2131428497, activity=" + this.c + ')';
    }
}
