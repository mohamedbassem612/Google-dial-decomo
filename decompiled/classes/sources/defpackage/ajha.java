package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajha extends defpackage.ajsz {
    public final java.lang.String a;
    public final ajgz b;

    public ajha(java.lang.String str, ajgz ajgzVar) {
        this.a = str;
        this.b = ajgzVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.b != ajgz.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajha)) {
            return false;
        }
        defpackage.ajha ajhaVar = (defpackage.ajha) obj;
        return ajhaVar.a.equals(this.a) && ajhaVar.b.equals(this.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajha.class, this.a, this.b});
    }

    public final java.lang.String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.a + ", variant: " + this.b.c + ')';
    }
}
