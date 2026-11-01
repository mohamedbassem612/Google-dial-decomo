package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xho implements defpackage.xhl {
    private final java.lang.String a;

    @Override // defpackage.xhl
    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.xho) && aooh.n(this.a, ((defpackage.xho) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "SensitiveString(" + this.a + ')';
    }
}
