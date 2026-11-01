package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yzn implements defpackage.yzo {
    public final defpackage.yoq a;
    private final defpackage.yza b;

    public yzn(defpackage.yza yzaVar, defpackage.yoq yoqVar) {
        aooh.f(yzaVar, "record");
        aooh.f(yoqVar, "summarizationResult");
        this.b = yzaVar;
        this.a = yoqVar;
    }

    @Override // defpackage.yzp
    public final defpackage.yza a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yzn) {
            defpackage.yzn yznVar = (defpackage.yzn) obj;
            if (aooh.n(this.b, yznVar.b) && aooh.n(this.a, yznVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.a * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Summarization(record=" + this.b + ", summarizationResult=" + this.a + ')';
    }
}
