package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adoo {
    public final defpackage.adnw a;

    public adoo(defpackage.adnw adnwVar) {
        this.a = adnwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.adoo) && this.a.equals(((defpackage.adoo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final java.lang.String toString() {
        return "UserIntent{type=0, playMessageArgs=" + this.a.toString() + '}';
    }

    public adoo() {
        throw null;
    }
}
