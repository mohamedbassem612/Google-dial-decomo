package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gsx {
    public final java.util.UUID a;
    public final defpackage.gsw b;
    public final java.util.Set c;
    public final defpackage.grn d;
    private final defpackage.grp e;
    private final defpackage.grp f;
    private final int g;
    private final int h;
    private final long i;
    private final defpackage.gsv j;
    private final long k;
    private final int l;
    private final java.lang.String m;

    public gsx(java.util.UUID uuid, defpackage.gsw gswVar, java.util.Set set, defpackage.grp grpVar, defpackage.grp grpVar2, int i, int i2, defpackage.grn grnVar, long j, defpackage.gsv gsvVar, long j2, int i3, java.lang.String str) {
        defpackage.aooh.f(uuid, "id");
        defpackage.aooh.f(grpVar, "outputData");
        defpackage.aooh.f(grpVar2, "progress");
        this.a = uuid;
        this.b = gswVar;
        this.c = set;
        this.e = grpVar;
        this.f = grpVar2;
        this.g = i;
        this.h = i2;
        this.d = grnVar;
        this.i = j;
        this.j = gsvVar;
        this.k = j2;
        this.l = i3;
        this.m = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && defpackage.aooh.n(getClass(), obj.getClass())) {
            defpackage.gsx gsxVar = (defpackage.gsx) obj;
            if (this.g == gsxVar.g && this.h == gsxVar.h && defpackage.aooh.n(this.a, gsxVar.a) && this.b == gsxVar.b && defpackage.aooh.n(this.e, gsxVar.e) && defpackage.aooh.n(this.d, gsxVar.d) && this.i == gsxVar.i && defpackage.aooh.n(this.j, gsxVar.j) && this.k == gsxVar.k && this.l == gsxVar.l && defpackage.aooh.n(this.m, gsxVar.m) && defpackage.aooh.n(this.c, gsxVar.c)) {
                return defpackage.aooh.n(this.f, gsxVar.f);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        defpackage.gsv gsvVar = this.j;
        int iM = ((((((((iHashCode * 31) + defpackage.anty.M(this.i)) * 31) + (gsvVar != null ? gsvVar.hashCode() : 0)) * 31) + defpackage.anty.M(this.k)) * 31) + this.l) * 31;
        java.lang.String str = this.m;
        return iM + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.e + ", tags=" + this.c + ", progress=" + this.f + ", runAttemptCount=" + this.g + ", generation=" + this.h + ", constraints=" + this.d + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l + ", workerClassName=" + this.m;
    }
}
