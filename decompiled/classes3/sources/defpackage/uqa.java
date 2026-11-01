package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uqa {
    public final long a;
    public final java.lang.String b;

    public uqa(long j, java.lang.String str) {
        this.a = j;
        if (str == null) {
            throw new java.lang.NullPointerException("Null lookupKey");
        }
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uqa) {
            defpackage.uqa uqaVar = (defpackage.uqa) obj;
            if (this.a == uqaVar.a && this.b.equals(uqaVar.b)) {
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
        return "ContactBasicInfo{contactId=" + this.a + ", lookupKey=" + this.b + '}';
    }

    public uqa() {
        throw null;
    }
}
