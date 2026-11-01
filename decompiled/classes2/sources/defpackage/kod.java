package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kod {
    public final java.lang.CharSequence a;
    public final int b;

    public kod(java.lang.CharSequence charSequence, int i) {
        aooh.f(charSequence, "text");
        this.a = charSequence;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kod) {
            defpackage.kod kodVar = (defpackage.kod) obj;
            if (aooh.n(this.a, kodVar.a) && this.b == kodVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "TextSnippetLine(text=" + ((java.lang.Object) this.a) + ", textAppearance=" + this.b + ')';
    }
}
