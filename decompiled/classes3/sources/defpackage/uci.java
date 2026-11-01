package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uci extends defpackage.uck {
    private final defpackage.uab a;

    public uci(defpackage.uab uabVar) {
        if (uabVar == null) {
            throw new java.lang.NullPointerException("Null key");
        }
        this.a = uabVar;
    }

    @Override // defpackage.uck
    public final defpackage.uab a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uck) {
            return this.a.equals(((defpackage.uck) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SonicGridItemClickEvent{key=" + this.a.g + '}';
    }
}
