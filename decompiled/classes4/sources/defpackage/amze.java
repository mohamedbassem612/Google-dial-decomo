package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amze extends amzf {
    private final java.lang.Object a;

    public amze(java.lang.Object obj) {
        this.a = obj;
    }

    public final java.lang.Object a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amze) {
            return j$.util.Objects.equals(this.a, ((defpackage.amze) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final java.lang.String toString() {
        return "Produced[" + this.a + ']';
    }
}
