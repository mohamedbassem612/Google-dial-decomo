package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhf extends defpackage.ajsz {
    public final ajhe a;
    public final java.lang.String b;
    public final defpackage.ajsz c;
    private final ajhd d;

    public ajhf(ajhe ajheVar, java.lang.String str, ajhd ajhdVar, defpackage.ajsz ajszVar) {
        this.a = ajheVar;
        this.b = str;
        this.d = ajhdVar;
        this.c = ajszVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.a != ajhe.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajhf)) {
            return false;
        }
        defpackage.ajhf ajhfVar = (defpackage.ajhf) obj;
        return ajhfVar.d.equals(this.d) && ajhfVar.c.equals(this.c) && ajhfVar.b.equals(this.b) && ajhfVar.a.equals(this.a);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajhf.class, this.b, this.d, this.c, this.a});
    }

    public final java.lang.String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.b + ", dekParsingStrategy: " + this.d.g + ", dekParametersForNewKeys: " + this.c.toString() + ", variant: " + this.a.c + ')';
    }
}
