package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class goq {
    public static final defpackage.goq b = new defpackage.gop(1.0f);
    public static final defpackage.goq c = new defpackage.goq("hinge");
    private final java.lang.String a;

    public goq(java.lang.String str) {
        this.a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.goq) {
            return aooh.n(this.a, ((defpackage.goq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }

    public goq() {
        throw null;
    }
}
