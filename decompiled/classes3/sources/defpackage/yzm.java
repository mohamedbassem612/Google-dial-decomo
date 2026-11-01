package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yzm implements defpackage.yzo {
    public final defpackage.ynp a;
    private final defpackage.yza b;

    public yzm(defpackage.yza yzaVar, defpackage.ynp ynpVar) {
        aooh.f(yzaVar, "record");
        aooh.f(ynpVar, "llmResult");
        this.b = yzaVar;
        this.a = ynpVar;
    }

    @Override // defpackage.yzp
    public final defpackage.yza a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yzm) {
            defpackage.yzm yzmVar = (defpackage.yzm) obj;
            if (aooh.n(this.b, yzmVar.b) && aooh.n(this.a, yzmVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.a * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Llm(record=" + this.b + ", llmResult=" + this.a + ')';
    }
}
