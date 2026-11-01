package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class achu {
    public albh a;
    public long b;
    public long c;
    public final java.lang.String d;
    public final java.lang.String e;

    public achu(java.lang.String str, java.lang.String str2) {
        this.d = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null key");
        }
        this.e = str2;
    }

    public static defpackage.achu a(java.lang.String str, java.lang.String str2, albh albhVar, long j, long j2) {
        defpackage.achu achuVar = new defpackage.achu(str, str2);
        achuVar.a = albhVar;
        achuVar.b = j;
        achuVar.c = j2;
        return achuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.achu) {
            defpackage.achu achuVar = (defpackage.achu) obj;
            java.lang.String str = this.d;
            if (str != null ? str.equals(achuVar.d) : achuVar.d == null) {
                if (this.e.equals(achuVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.d;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "TimeWindowStoreRecord{accountName=" + this.d + ", key=" + this.e + '}';
    }

    public achu() {
        throw null;
    }
}
