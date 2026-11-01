package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzt extends defpackage.agzu {
    private final java.lang.Object a;

    public agzt(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Null data");
        }
        this.a = obj;
    }

    @Override // defpackage.agzu
    public final java.lang.Object a() {
        return this.a;
    }

    @Override // defpackage.agzu
    public final boolean b() {
        return true;
    }

    @Override // defpackage.agzu
    public final java.lang.Throwable c() {
        throw new java.lang.IllegalStateException("This Result was a success, and is being polled for an error.");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agzt) {
            return this.a.equals(((defpackage.agzt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "Success{data=" + this.a.toString() + '}';
    }

    public agzt() {
        throw null;
    }
}
