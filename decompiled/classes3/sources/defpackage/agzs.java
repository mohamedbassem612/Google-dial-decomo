package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzs extends defpackage.agzu {
    private final java.lang.Throwable a;

    public agzs(java.lang.Throwable th) {
        if (th == null) {
            throw new java.lang.NullPointerException("Null error");
        }
        this.a = th;
    }

    @Override // defpackage.agzu
    public final java.lang.Object a() {
        throw new java.lang.IllegalStateException("This Result was a failure, and is being polled for data.");
    }

    @Override // defpackage.agzu
    public final boolean b() {
        return false;
    }

    @Override // defpackage.agzu
    public final java.lang.Throwable c() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agzs) {
            return this.a.equals(((defpackage.agzs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "Failure{error=" + this.a.toString() + '}';
    }

    public agzs() {
        throw null;
    }
}
