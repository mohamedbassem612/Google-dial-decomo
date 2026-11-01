package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sdx {
    public final defpackage.abxt a;
    public final defpackage.amqu b;

    public sdx(defpackage.abxt abxtVar, defpackage.amqu amquVar) {
        this.a = abxtVar;
        this.b = amquVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sdx) {
            defpackage.sdx sdxVar = (defpackage.sdx) obj;
            if (aooh.n(this.a, sdxVar.a) && this.b == sdxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        defpackage.abxt abxtVar = this.a;
        return ((abxtVar == null ? 0 : abxtVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CallingCardDataResult(patrickData=" + this.a + ", callingCardDisplayedType=" + this.b + ')';
    }

    public sdx() {
        this(null, defpackage.amqu.NO_CC_SHOWN);
    }
}
