package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wyi {
    public final int a;
    public final j$.util.Optional b;

    public wyi(int i, j$.util.Optional optional) {
        this.a = i;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null tag");
        }
        this.b = optional;
    }

    public static defpackage.wyi a(int i) {
        return new defpackage.wyi(i, j$.util.Optional.empty());
    }

    public static defpackage.wyi b(int i, java.lang.String str) {
        return new defpackage.wyi(i, j$.util.Optional.of(str));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wyi) {
            defpackage.wyi wyiVar = (defpackage.wyi) obj;
            if (this.a == wyiVar.a && this.b.equals(wyiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "AudioRes{resId=" + this.a + ", tag=" + this.b.toString() + '}';
    }

    public wyi() {
        throw null;
    }
}
