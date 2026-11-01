package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfk extends snl {
    public final java.lang.Throwable a;
    public final defpackage.sfl b;
    public final defpackage.sfe c;

    public sfk(java.lang.Throwable th, defpackage.sfl sflVar, defpackage.sfe sfeVar) {
        this.a = th;
        this.b = sflVar;
        this.c = sfeVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sfk) {
            defpackage.sfk sfkVar = (defpackage.sfk) obj;
            if (aooh.n(this.a, sfkVar.a) && aooh.n(this.b, sfkVar.b) && aooh.n(this.c, sfkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.sfl sflVar = this.b;
        int iHashCode2 = (iHashCode + (sflVar == null ? 0 : sflVar.hashCode())) * 31;
        defpackage.sfe sfeVar = this.c;
        return iHashCode2 + (sfeVar != null ? sfeVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Failure(cause=" + this.a + ", snackbarModel=" + this.b + ", data=" + this.c + ')';
    }
}
