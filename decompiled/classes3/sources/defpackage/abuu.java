package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuu implements defpackage.abuw {
    public final long a;

    public abuu(long j) {
        this.a = j;
    }

    @Override // defpackage.abuw
    public final com.google.android.gms.people.cpg.callingcard.v2.Identifier a() {
        defpackage.aarq aarqVar = new defpackage.aarq();
        aarqVar.b(1);
        aarqVar.a = java.lang.Long.valueOf(this.a);
        return aarqVar.a();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abuu) && this.a == ((defpackage.abuu) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "CallingCardId(callingCardId=" + this.a + ')';
    }
}
