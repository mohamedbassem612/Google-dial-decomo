package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kbo implements defpackage.kbu {
    public final kiu a;
    public final defpackage.kbf b;

    public kbo(kiu kiuVar, defpackage.kbf kbfVar) {
        aooh.f(kiuVar, "coalescedRow");
        aooh.f(kbfVar, "callButton");
        this.a = kiuVar;
        this.b = kbfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kbo) {
            defpackage.kbo kboVar = (defpackage.kbo) obj;
            if (aooh.n(this.a, kboVar.a) && aooh.n(this.b, kboVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallButtonClick(coalescedRow=" + this.a + ", callButton=" + this.b + ')';
    }
}
