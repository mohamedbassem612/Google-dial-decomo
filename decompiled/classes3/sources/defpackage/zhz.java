package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhz {
    private final java.lang.Integer a;

    public zhz(java.lang.Integer num) {
        this.a = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.zhz) {
            return this.a.equals(((defpackage.zhz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "ProductData{productId=" + this.a + '}';
    }

    public zhz() {
        throw null;
    }
}
