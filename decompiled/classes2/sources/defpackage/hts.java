package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hts {
    public final java.util.List a;
    private final aonj b;
    private final java.lang.CharSequence c;

    public hts() {
        aokc aokcVar = aokc.a;
        this.b = null;
        this.c = null;
        this.a = aokcVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hts) {
            defpackage.hts htsVar = (defpackage.hts) obj;
            aonj aonjVar = htsVar.b;
            if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                java.lang.CharSequence charSequence = htsVar.c;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.a, htsVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return 1;
    }

    public final java.lang.String toString() {
        return "Customization(photoInfoModifier=null, labelPrefix=null, actions=" + this.a + ')';
    }
}
