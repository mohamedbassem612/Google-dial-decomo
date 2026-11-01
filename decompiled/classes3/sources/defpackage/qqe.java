package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qqe {
    public final defpackage.abwd a;

    public qqe(defpackage.abwd abwdVar) {
        if (abwdVar == null) {
            throw new java.lang.NullPointerException("Null photoInfo");
        }
        this.a = abwdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qqe) {
            return this.a.equals(((defpackage.qqe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "ProfilePhotoModel{photoInfo=" + this.a.toString() + '}';
    }

    public qqe() {
        throw null;
    }
}
