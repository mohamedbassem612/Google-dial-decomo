package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abur implements defpackage.abut {
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.lang.String c;

    public abur(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        aooh.f(str, "accountName");
        aooh.f(str2, "accountType");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.abuw
    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier a() {
        defpackage.aarq aarqVar = new defpackage.aarq();
        aarqVar.b(3);
        aarqVar.c = new com.google.android.gms.people.cpg.callingcard.v2.AccountInfo(this.a, this.b, this.c);
        return aarqVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abur) {
            defpackage.abur aburVar = (defpackage.abur) obj;
            if (aooh.n(this.a, aburVar.a) && aooh.n(this.b, aburVar.b) && aooh.n(this.c, aburVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.c;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "AccountWithDataSet(accountName=" + this.a + ", accountType=" + this.b + ", dataSet=" + this.c + ')';
    }
}
