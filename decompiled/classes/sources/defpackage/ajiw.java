package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajiw extends defpackage.ajsz {
    public final int a;
    public final defpackage.ajiv b;

    public ajiw(int i, defpackage.ajiv ajivVar) {
        super((byte[]) null);
        this.a = i;
        this.b = ajivVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.b != defpackage.ajiv.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajiw)) {
            return false;
        }
        defpackage.ajiw ajiwVar = (defpackage.ajiw) obj;
        return ajiwVar.a == this.a && ajiwVar.b == this.b;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajiw.class, java.lang.Integer.valueOf(this.a), this.b});
    }

    public final java.lang.String toString() {
        return "AesSiv Parameters (variant: " + java.lang.String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
