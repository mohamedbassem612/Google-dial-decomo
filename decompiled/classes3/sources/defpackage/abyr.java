package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abyr {
    public final ahyn a;
    private final ahyn b = ahwt.a;

    public abyr(android.accounts.Account account) {
        this.a = ahyn.h(account);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.abyr)) {
            return false;
        }
        defpackage.abyr abyrVar = (defpackage.abyr) obj;
        return this.a.equals(abyrVar.a) && this.b.equals(abyrVar.b);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b});
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
