package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agns {
    public final android.content.Intent a;

    public agns(android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.NullPointerException("Null intent");
        }
        this.a = intent;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agns) {
            return this.a.equals(((defpackage.agns) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SelectorContext{intent=" + this.a.toString() + '}';
    }

    public agns() {
        throw null;
    }
}
