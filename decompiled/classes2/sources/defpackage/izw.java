package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izw extends defpackage.hhe {
    private final java.lang.String a = "empty_state_row_id";

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.izw) && aooh.n(this.a, ((defpackage.izw) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.hhe
    public final java.lang.String r() {
        return this.a;
    }

    public final java.lang.String toString() {
        return "EmptyUiRow(id=" + this.a + ')';
    }
}
