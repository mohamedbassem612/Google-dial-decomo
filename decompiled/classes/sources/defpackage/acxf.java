package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acxf {
    public final java.lang.String a;
    public final long b;
    public final defpackage.ahyn c;
    public final int d;
    private final defpackage.ahyn e;
    private final long f;

    public acxf(java.lang.String str, long j, int i, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, long j2) {
        this.a = str;
        this.b = j;
        this.d = i;
        this.c = ahynVar;
        this.e = ahynVar2;
        this.f = j2;
    }

    public static defpackage.acxe a() {
        defpackage.acxe acxeVar = new defpackage.acxe();
        acxeVar.d(-1L);
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        acxeVar.b = ahwtVar;
        acxeVar.b(ahwtVar);
        return acxeVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acxf) {
            defpackage.acxf acxfVar = (defpackage.acxf) obj;
            if (this.a.equals(acxfVar.a) && this.b == acxfVar.b) {
                int i = this.d;
                int i2 = acxfVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.c.equals(acxfVar.c) && this.e.equals(acxfVar.e) && this.f == acxfVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.d;
        defpackage.anty.aJ(i);
        long j = this.b;
        int iHashCode2 = ((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j2 = this.f;
        return ((iHashCode2 ^ 2040732332) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final java.lang.String toString() {
        defpackage.ahyn ahynVar = this.e;
        return "TaskParams{tag=" + this.a + ", periodSeconds=" + this.b + ", networkState=" + defpackage.agab.cr(this.d) + ", constraintOverridesOptional=" + java.lang.String.valueOf(this.c) + ", flexIntervalOptional=" + java.lang.String.valueOf(ahynVar) + ", nextScheduleTimeOverride=" + this.f + '}';
    }

    public acxf() {
        throw null;
    }
}
