package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajgh extends defpackage.ajsz {
    public final int a;
    public final int b;
    public final int c = 16;
    public final defpackage.ajgg d;

    public ajgh(int i, int i2, defpackage.ajgg ajggVar) {
        this.a = i;
        this.b = i2;
        this.d = ajggVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.d != defpackage.ajgg.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajgh)) {
            return false;
        }
        defpackage.ajgh ajghVar = (defpackage.ajgh) obj;
        if (ajghVar.a != this.a || ajghVar.b != this.b) {
            return false;
        }
        int i = ajghVar.c;
        return ajghVar.d == this.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajgh.class, java.lang.Integer.valueOf(this.a), java.lang.Integer.valueOf(this.b), 16, this.d});
    }

    public final java.lang.String toString() {
        return "AesEax Parameters (variant: " + java.lang.String.valueOf(this.d) + ", " + this.b + "-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
