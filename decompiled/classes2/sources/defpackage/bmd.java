package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bmd {
    public final java.lang.CharSequence a;
    public final long b;
    public final android.view.textclassifier.TextClassification c;
    public final java.util.List d;

    public bmd(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassification textClassification, java.util.List list) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bmd) {
            defpackage.bmd bmdVar = (defpackage.bmd) obj;
            if (aooh.n(this.a, bmdVar.a)) {
                long j = this.b;
                long j2 = bmdVar.b;
                long j3 = dky.a;
                if (anty.ah(j, j2) && aooh.n(this.c, bmdVar.c) && aooh.n(this.d, bmdVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = dky.a;
        return ((((iHashCode + anty.M(this.b)) * 31) + aa$.ExternalSyntheticApiModelOutline0.m(this.c)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "TextClassificationResult(text=" + ((java.lang.Object) this.a) + ", selection=" + dky.e(this.b) + ", textClassification=" + this.c + ", icons=" + this.d + ')';
    }
}
