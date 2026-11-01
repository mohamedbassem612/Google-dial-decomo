package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xzj {
    public final java.lang.String a;

    public xzj(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xzj) {
            return this.a.equals(((defpackage.xzj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
