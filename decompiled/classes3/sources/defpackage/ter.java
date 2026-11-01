package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ter implements defpackage.tet {
    private final java.lang.Throwable a;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ter) && aooh.n(this.a, ((defpackage.ter) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(throwable=" + this.a + ')';
    }
}
