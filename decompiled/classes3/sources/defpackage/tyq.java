package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tyq extends defpackage.tyr {
    private final defpackage.tyw a;

    public tyq(defpackage.tyw tywVar) {
        if (tywVar == null) {
            throw new java.lang.NullPointerException("Null bannerModel");
        }
        this.a = tywVar;
    }

    @Override // defpackage.tyr
    public final defpackage.tyw a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.tyr) {
            return this.a.equals(((defpackage.tyr) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "ButtonClickEvent{bannerModel=" + this.a.toString() + '}';
    }
}
