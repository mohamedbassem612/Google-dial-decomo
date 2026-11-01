package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jym implements ahth {
    public final kiu a;
    public final defpackage.jyh b;

    public jym(kiu kiuVar, defpackage.jyh jyhVar) {
        aooh.f(kiuVar, "coalescedRow");
        aooh.f(jyhVar, "chipWithKey");
        this.a = kiuVar;
        this.b = jyhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jym) {
            defpackage.jym jymVar = (defpackage.jym) obj;
            if (aooh.n(this.a, jymVar.a) && aooh.n(this.b, jymVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ChipClickedEvent(coalescedRow=" + this.a + ", chipWithKey=" + this.b + ')';
    }
}
