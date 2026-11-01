package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqt {
    public final j$.util.Optional a;
    public final defpackage.ajcr b;

    public adqt(j$.util.Optional optional, defpackage.ajcr ajcrVar) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null tag");
        }
        this.a = optional;
        this.b = ajcrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.adqt) {
            defpackage.adqt adqtVar = (defpackage.adqt) obj;
            if (this.a.equals(adqtVar.a) && this.b.equals(adqtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ajcr ajcrVar = this.b;
        return "TaskHolder{tag=" + this.a.toString() + ", task=" + ajcrVar.toString() + '}';
    }

    public adqt() {
        throw null;
    }
}
