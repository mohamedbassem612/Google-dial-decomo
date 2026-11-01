package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alua {
    public final java.io.InputStream a;

    public alua(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alua) {
            return this.a.equals(((defpackage.alua) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "UpLinkInputStreamWrapper{inputStream=" + this.a.toString() + '}';
    }

    public alua() {
        throw null;
    }
}
