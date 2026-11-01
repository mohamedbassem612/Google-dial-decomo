package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amzd extends defpackage.amzf {
    private final java.lang.Throwable a;

    public amzd(java.lang.Throwable th) {
        this.a = th;
    }

    @Override // defpackage.amzf
    public final java.lang.Object a() throws java.util.concurrent.ExecutionException {
        throw new java.util.concurrent.ExecutionException(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amzd) {
            return this.a.equals(((defpackage.amzd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Produced[failed with " + this.a.getClass().getCanonicalName() + ']';
    }
}
