package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uoy extends defpackage.aais {
    private final defpackage.aomy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uoy(defpackage.aomy aomyVar) {
        super((short[]) null);
        if (aomyVar == null) {
            defpackage.aooh.i("headerClickHandler");
        }
        this.a = aomyVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.uoy) && defpackage.aooh.n(this.a, ((defpackage.uoy) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Loading(headerClickHandler=" + this.a + ')';
    }
}
