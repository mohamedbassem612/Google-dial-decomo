package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class nb extends defpackage.dzl {
    private final defpackage.na a;
    private final defpackage.emx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(defpackage.na naVar, defpackage.emx emxVar) {
        super(null);
        if (naVar == null) {
            defpackage.aooh.i("callback");
        }
        this.a = naVar;
        this.b = emxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nb) {
            defpackage.nb nbVar = (defpackage.nb) obj;
            if (defpackage.aooh.n(this.a, nbVar.a) && defpackage.aooh.n(this.b, nbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.emx emxVar = this.b;
        return iHashCode + (emxVar == null ? 0 : emxVar.hashCode());
    }

    public final java.lang.String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.a + ", owner=" + this.b + ')';
    }
}
