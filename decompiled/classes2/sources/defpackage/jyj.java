package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyj extends defpackage.jlr {
    public final java.lang.CharSequence a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyj(java.lang.CharSequence charSequence) {
        super(null);
        aooh.f(charSequence, "chipCharSequence");
        this.a = charSequence;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.jyj) && aooh.n(this.a, ((defpackage.jyj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ChipCharSequence(chipCharSequence=" + ((java.lang.Object) this.a) + ')';
    }
}
