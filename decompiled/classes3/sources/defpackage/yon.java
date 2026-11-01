package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yon {
    public final java.lang.String a;

    public yon(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null message");
        }
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yon) {
            return this.a.equals(((defpackage.yon) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SummarizationMessage{message=" + this.a + '}';
    }

    public yon() {
        throw null;
    }
}
