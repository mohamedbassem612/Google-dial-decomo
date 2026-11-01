package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahta {
    public final aenj a;
    public final apev b;
    public final apfr c;
    private final long d;
    private final long e;
    private final boolean f;
    private final defpackage.apha g;

    public ahta(aenj aenjVar, apev apevVar, long j, long j2, boolean z, apfr apfrVar, defpackage.apha aphaVar) {
        this.a = aenjVar;
        this.b = apevVar;
        this.d = j;
        this.e = j2;
        this.f = z;
        if (apfrVar == null) {
            throw new java.lang.NullPointerException("Null trace");
        }
        this.c = apfrVar;
        if (aphaVar == null) {
            throw new java.lang.NullPointerException("Null traceMetadata");
        }
        this.g = aphaVar;
    }

    public final boolean equals(java.lang.Object obj) {
        apev apevVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahta) {
            defpackage.ahta ahtaVar = (defpackage.ahta) obj;
            if (this.a.equals(ahtaVar.a) && ((apevVar = this.b) != null ? apevVar.equals(ahtaVar.b) : ahtaVar.b == null) && this.d == ahtaVar.d && this.e == ahtaVar.e && this.f == ahtaVar.f && this.c.equals(ahtaVar.c) && this.g.equals(ahtaVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        apev apevVar = this.b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (apevVar == null ? 0 : apevVar.hashCode())) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        long j2 = this.e;
        return (((((((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
    }

    public final java.lang.String toString() {
        return "TraceData{eventName=" + this.a.a + ", metricExtension=" + java.lang.String.valueOf(this.b) + ", startTime=" + this.d + ", endTime=" + this.e + ", empty=" + this.f + ", trace=" + this.c.toString() + ", traceMetadata=" + this.g.toString() + ", activeCuiId=null}";
    }

    public ahta() {
        throw null;
    }
}
