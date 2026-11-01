package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akxb {
    public final aihd a;

    public akxb(aihd aihdVar) {
        if (aihdVar == null) {
            throw new java.lang.NullPointerException("Null userConsents");
        }
        this.a = aihdVar;
    }

    public static defpackage.akxb a(java.lang.Iterable iterable) {
        return new defpackage.akxb(aihd.n(iterable));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof defpackage.akxb) && this.a.equals(((defpackage.akxb) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003;
    }

    public final java.lang.String toString() {
        return "Dma52UserConsentsSnapshot{userConsents=" + this.a.toString() + ", stalenessMillis=0}";
    }

    public akxb() {
        throw null;
    }
}
