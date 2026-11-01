package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class onr {
    public final long a;
    public final defpackage.omz b;

    public onr(long j, defpackage.omz omzVar) {
        this.a = j;
        if (omzVar == null) {
            throw new java.lang.NullPointerException("Null fidesDetails");
        }
        this.b = omzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.onr) {
            defpackage.onr onrVar = (defpackage.onr) obj;
            if (this.a == onrVar.a && this.b.equals(onrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FidesDetailsEntry{callCreationTimeMillis=" + this.a + ", fidesDetails=" + this.b.toString() + '}';
    }

    public onr() {
        throw null;
    }
}
