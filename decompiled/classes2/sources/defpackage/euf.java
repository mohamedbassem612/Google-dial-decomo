package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class euf extends java.lang.IllegalStateException {
    public final int a;
    public final int b;

    public euf(int i, int i2) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? a.bs(i2, "Player stuck suppressed for ", " ms") : a.bs(i2, "Player stuck playing without ending for ", " ms") : a.bs(i2, "Player stuck playing with no progress for ", " ms") : a.bs(i2, "Player stuck buffering with no progress for ", " ms") : a.bs(i2, "Player stuck buffering and not loading for ", " ms"));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.euf eufVar = (defpackage.euf) obj;
            if (this.a == eufVar.a && this.b == eufVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b;
    }
}
