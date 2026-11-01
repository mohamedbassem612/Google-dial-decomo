package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyh {
    public final defpackage.jyd a;
    public final defpackage.jyf b;

    public jyh(defpackage.jyd jydVar, defpackage.jyf jyfVar) {
        aooh.f(jyfVar, "key");
        this.a = jydVar;
        this.b = jyfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jyh) {
            defpackage.jyh jyhVar = (defpackage.jyh) obj;
            if (aooh.n(this.a, jyhVar.a) && this.b == jyhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallLogChipWithKey(chip=" + this.a + ", key=" + this.b + ')';
    }
}
