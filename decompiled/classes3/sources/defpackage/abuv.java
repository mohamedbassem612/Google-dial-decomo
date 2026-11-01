package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuv implements defpackage.abuw {
    public final java.lang.String a;
    public final java.lang.String b;

    public abuv(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "phoneNumber");
        aooh.f(str2, "lookupKey");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.abuw
    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier a() {
        defpackage.aarq aarqVar = new defpackage.aarq();
        aarqVar.b(2);
        aarqVar.b = this.a;
        return aarqVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abuv) {
            defpackage.abuv abuvVar = (defpackage.abuv) obj;
            if (aooh.n(this.a, abuvVar.a) && aooh.n(this.b, abuvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneNumber(phoneNumber=" + this.a + ", lookupKey=" + this.b + ')';
    }
}
