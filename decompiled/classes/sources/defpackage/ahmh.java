package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahmh {
    public final defpackage.ahmi a;
    public final defpackage.ajcq b;

    public ahmh(defpackage.ahmi ahmiVar, defpackage.ajcq ajcqVar) {
        if (ahmiVar == null) {
            throw new java.lang.NullPointerException("Null monitor");
        }
        this.a = ahmiVar;
        this.b = ajcqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahmh) {
            defpackage.ahmh ahmhVar = (defpackage.ahmh) obj;
            if (this.a.equals(ahmhVar.a) && this.b.equals(ahmhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ajcq ajcqVar = this.b;
        return "MonitorReport{monitor=" + this.a.toString() + ", startReport=" + java.lang.String.valueOf(ajcqVar) + '}';
    }

    public ahmh() {
        throw null;
    }
}
