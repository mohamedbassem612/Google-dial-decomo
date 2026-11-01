package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lip extends defpackage.lir {
    private final defpackage.liq a;

    public lip(defpackage.liq liqVar) {
        if (liqVar == null) {
            throw new java.lang.NullPointerException("Null bannerModel");
        }
        this.a = liqVar;
    }

    @Override // defpackage.lir
    public final defpackage.liq a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.lir) {
            return this.a.equals(((defpackage.lir) obj).a());
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
