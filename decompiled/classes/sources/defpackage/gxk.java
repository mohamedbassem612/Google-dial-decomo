package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxk {
    public final java.lang.String a;
    public final defpackage.gsw b;
    public final defpackage.grp c;
    public final long d;
    public final long e;
    public final long f;
    public final defpackage.grn g;
    public final int h;
    public final defpackage.grj i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final java.util.List p;
    public final java.lang.String q;
    public final java.util.List r;

    public gxk(java.lang.String str, defpackage.gsw gswVar, defpackage.grp grpVar, long j, long j2, long j3, defpackage.grn grnVar, int i, defpackage.grj grjVar, long j4, long j5, int i2, int i3, long j6, int i4, java.util.List list, java.lang.String str2, java.util.List list2) {
        defpackage.aooh.f(str, "id");
        defpackage.aooh.f(grpVar, "output");
        defpackage.aooh.f(list, "tags");
        defpackage.aooh.f(str2, "workerClassName");
        defpackage.aooh.f(list2, "progress");
        this.a = str;
        this.b = gswVar;
        this.c = grpVar;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = grnVar;
        this.h = i;
        this.i = grjVar;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = str2;
        this.r = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gxk) {
            defpackage.gxk gxkVar = (defpackage.gxk) obj;
            if (defpackage.aooh.n(this.a, gxkVar.a) && this.b == gxkVar.b && defpackage.aooh.n(this.c, gxkVar.c) && this.d == gxkVar.d && this.e == gxkVar.e && this.f == gxkVar.f && defpackage.aooh.n(this.g, gxkVar.g) && this.h == gxkVar.h && this.i == gxkVar.i && this.j == gxkVar.j && this.k == gxkVar.k && this.l == gxkVar.l && this.m == gxkVar.m && this.n == gxkVar.n && this.o == gxkVar.o && defpackage.aooh.n(this.p, gxkVar.p) && defpackage.aooh.n(this.q, gxkVar.q) && defpackage.aooh.n(this.r, gxkVar.r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        defpackage.grn grnVar = this.g;
        long j = this.f;
        int iM = (((((((((((iHashCode * 31) + defpackage.anty.M(this.d)) * 31) + defpackage.anty.M(this.e)) * 31) + defpackage.anty.M(j)) * 31) + grnVar.hashCode()) * 31) + this.h) * 31) + this.i.hashCode();
        java.util.List list = this.p;
        long j2 = this.n;
        return (((((((((((((((((iM * 31) + defpackage.anty.M(this.j)) * 31) + defpackage.anty.M(this.k)) * 31) + this.l) * 31) + this.m) * 31) + defpackage.anty.M(j2)) * 31) + this.o) * 31) + list.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public final java.lang.String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", workerClassName=" + this.q + ", progress=" + this.r + ')';
    }
}
