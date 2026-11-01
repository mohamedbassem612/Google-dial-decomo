package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yfn implements defpackage.xuo {
    private final java.lang.Object b;

    public yfn(java.lang.Object obj) {
        anty.aI(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yfn) {
            return this.b.equals(((defpackage.yfn) obj).b);
        }
        return false;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ObjectKey{object=" + this.b.toString() + '}';
    }
}
