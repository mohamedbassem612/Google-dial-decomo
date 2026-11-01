package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yut extends defpackage.yuu {
    public final java.util.Locale a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yut(java.util.Locale locale) {
        super(defpackage.yuv.a);
        aooh.f(locale, "locale");
        this.a = locale;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yut) && aooh.n(this.a, ((defpackage.yut) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "BertHades(locale=" + this.a + ')';
    }
}
