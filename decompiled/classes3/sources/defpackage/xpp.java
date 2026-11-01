package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xpp implements defpackage.xpa {
    public static final defpackage.xpo a = new defpackage.xpo();
    private final java.lang.String b;

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.xpp) && aooh.n(this.b, ((defpackage.xpp) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        return defpackage.xpo.g(this.b);
    }

    public final java.lang.String toString() {
        return "PersistableString(value=" + this.b + ')';
    }
}
