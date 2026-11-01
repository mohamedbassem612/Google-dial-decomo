package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajgm extends defpackage.ajsz {
    public final int a;
    public final int b = 12;
    public final int c = 16;
    public final defpackage.ajgl d;

    public ajgm(int i, defpackage.ajgl ajglVar) {
        this.a = i;
        this.d = ajglVar;
    }

    @Override // defpackage.ajsz
    public final boolean dU() {
        return this.d != defpackage.ajgl.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ajgm)) {
            return false;
        }
        defpackage.ajgm ajgmVar = (defpackage.ajgm) obj;
        if (ajgmVar.a != this.a) {
            return false;
        }
        int i = ajgmVar.b;
        int i2 = ajgmVar.c;
        return ajgmVar.d == this.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.ajgm.class, java.lang.Integer.valueOf(this.a), 12, 16, this.d});
    }

    public final java.lang.String toString() {
        return "AesGcm Parameters (variant: " + java.lang.String.valueOf(this.d) + ", 12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
