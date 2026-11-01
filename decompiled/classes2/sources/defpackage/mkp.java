package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mkp extends mlc {
    private final java.lang.String a;

    public mkp(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null query");
        }
        this.a = str;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mlc) {
            return this.a.equals(((mlc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "PreCallDialpadQueryEvent{query=" + this.a + '}';
    }
}
