package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jlp {
    public final defpackage.jms a;
    public final int b;
    public final java.util.List c;
    public java.lang.String d;

    public jlp(defpackage.jms jmsVar, int i, java.util.List list) {
        aooh.f(jmsVar, "scamSelector");
        this.a = jmsVar;
        this.b = i;
        this.c = list;
        this.d = "";
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jlp) {
            defpackage.jlp jlpVar = (defpackage.jlp) obj;
            if (aooh.n(this.a, jlpVar.a) && this.b == jlpVar.b && aooh.n(this.c, jlpVar.c) && aooh.n(this.d, jlpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ScamContextSelectorDialogUiState(scamSelector=" + this.a + ", questionIndex=" + this.b + ", checkedChips=" + this.c + ", customChipText=" + this.d + ')';
    }
}
