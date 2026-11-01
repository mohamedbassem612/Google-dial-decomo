package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aelb implements defpackage.xuo {
    public final defpackage.aekx b;

    public aelb(defpackage.aekx aekxVar) {
        this.b = aekxVar;
    }

    public static defpackage.aelb b(java.lang.Object obj, defpackage.aehm aehmVar) {
        return new defpackage.aelb(new defpackage.aekx(aehmVar.b(obj), aehmVar.c(obj), aehmVar.e(obj), aehmVar.d(obj), aehmVar.g(obj)));
    }

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aelb) {
            return this.b.equals(((defpackage.aelb) obj).b);
        }
        return false;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "aelb:" + super.toString();
    }

    public aelb() {
        throw null;
    }
}
