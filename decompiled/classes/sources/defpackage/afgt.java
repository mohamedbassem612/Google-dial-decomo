package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afgt extends defpackage.afhd {
    public final defpackage.afgk a;

    public afgt(defpackage.afgk afgkVar) {
        this.a = afgkVar;
    }

    @Override // defpackage.afhd
    public final java.lang.String a() {
        return "signal";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.afgt) {
            return this.a.equals(((defpackage.afgt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SignallingConfig{service=" + this.a.toString() + '}';
    }

    public afgt() {
        throw null;
    }
}
