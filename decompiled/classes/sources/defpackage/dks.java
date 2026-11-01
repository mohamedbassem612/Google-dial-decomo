package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dks implements defpackage.djd {
    public final defpackage.doy a;
    public final long b;
    public final defpackage.dnd c;
    public final defpackage.dmw d;
    public final defpackage.dmx e;
    public final defpackage.dmq f;
    public final java.lang.String g;
    public final long h;
    public final defpackage.dok i;
    public final defpackage.doz j;
    public final defpackage.dnx k;
    public final long l;
    public final defpackage.dou m;
    public final defpackage.crc n;
    public final dkh o;
    public final defpackage.den p;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dks(long j, long j2, defpackage.dnd dndVar, defpackage.dmw dmwVar, defpackage.dmx dmxVar, defpackage.dmq dmqVar, java.lang.String str, long j3, defpackage.dok dokVar, defpackage.doz dozVar, defpackage.dnx dnxVar, long j4, defpackage.dou douVar, defpackage.crc crcVar, int i) {
        long jN;
        long j5;
        long jN2;
        if ((i & 1) != 0) {
            float[] fArr = defpackage.crp.a;
            jN = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        } else {
            jN = j;
        }
        long j6 = 2143289344;
        if ((i & 2) != 0) {
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
            j5 = 2143289344;
        } else {
            j5 = j2;
        }
        defpackage.dnd dndVar2 = (i & 4) != 0 ? null : dndVar;
        defpackage.dmw dmwVar2 = (i & 8) != 0 ? null : dmwVar;
        defpackage.dmx dmxVar2 = (i & 16) != 0 ? null : dmxVar;
        defpackage.dmq dmqVar2 = (i & 32) != 0 ? null : dmqVar;
        java.lang.String str2 = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            defpackage.dpt[] dptVarArr2 = defpackage.dps.a;
        } else {
            j6 = j3;
        }
        defpackage.dok dokVar2 = (i & 256) != 0 ? null : dokVar;
        defpackage.doz dozVar2 = (i & 512) != 0 ? null : dozVar;
        defpackage.dnx dnxVar2 = (i & 1024) != 0 ? null : dnxVar;
        if ((i & 2048) != 0) {
            float[] fArr2 = defpackage.crp.a;
            jN2 = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        } else {
            jN2 = j4;
        }
        this(jN, j5, dndVar2, dmwVar2, dmxVar2, dmqVar2, str2, j6, dokVar2, dozVar2, dnxVar2, jN2, (i & 4096) != 0 ? null : douVar, (i & 8192) != 0 ? null : crcVar);
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final defpackage.cqd c() {
        return this.a.c();
    }

    public final defpackage.dks d(defpackage.dks dksVar) {
        if (dksVar == null) {
            return this;
        }
        defpackage.doy doyVar = dksVar.a;
        return defpackage.dkt.a(this, doyVar.b(), doyVar.c(), doyVar.a(), dksVar.b, dksVar.c, dksVar.d, dksVar.e, dksVar.f, dksVar.g, dksVar.h, dksVar.i, dksVar.j, dksVar.k, dksVar.l, dksVar.m, dksVar.n, dksVar.p);
    }

    public final boolean e(defpackage.dks dksVar) {
        if (this == dksVar) {
            return true;
        }
        long j = this.b;
        long j2 = dksVar.b;
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        if (j != j2 || !defpackage.aooh.n(this.c, dksVar.c) || !defpackage.aooh.n(this.d, dksVar.d) || !defpackage.aooh.n(this.e, dksVar.e) || !defpackage.aooh.n(this.f, dksVar.f) || !defpackage.aooh.n(this.g, dksVar.g) || this.h != dksVar.h || !defpackage.aooh.n(this.i, dksVar.i) || !defpackage.aooh.n(this.j, dksVar.j) || !defpackage.aooh.n(this.k, dksVar.k) || this.l != dksVar.l) {
            return false;
        }
        dkh dkhVar = dksVar.o;
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dks) {
            defpackage.dks dksVar = (defpackage.dks) obj;
            if (e(dksVar) && f(dksVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(defpackage.dks dksVar) {
        return defpackage.aooh.n(this.a, dksVar.a) && defpackage.aooh.n(this.m, dksVar.m) && defpackage.aooh.n(this.n, dksVar.n) && defpackage.aooh.n(this.p, dksVar.p);
    }

    public final int hashCode() {
        long jB = b();
        long j = jB ^ (jB >>> 32);
        defpackage.cqd cqdVarC = c();
        int iHashCode = (((((int) j) * 31) + (cqdVarC != null ? cqdVarC.hashCode() : 0)) * 31) + java.lang.Float.floatToIntBits(a());
        long j2 = this.b;
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        defpackage.dnd dndVar = this.c;
        int i = ((((iHashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (dndVar != null ? dndVar.h : 0)) * 31;
        defpackage.dmw dmwVar = this.d;
        int i2 = (i + (dmwVar != null ? dmwVar.a : 0)) * 31;
        defpackage.dmx dmxVar = this.e;
        int i3 = (i2 + (dmxVar != null ? dmxVar.a : 0)) * 31;
        defpackage.dmq dmqVar = this.f;
        int iHashCode2 = (i3 + (dmqVar != null ? dmqVar.hashCode() : 0)) * 31;
        java.lang.String str = this.g;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        long j3 = this.h;
        int i4 = (((iHashCode2 + iHashCode3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        defpackage.dok dokVar = this.i;
        int iFloatToIntBits = (i4 + (dokVar != null ? java.lang.Float.floatToIntBits(dokVar.a) : 0)) * 31;
        defpackage.doz dozVar = this.j;
        int iHashCode4 = (iFloatToIntBits + (dozVar != null ? dozVar.hashCode() : 0)) * 31;
        defpackage.dnx dnxVar = this.k;
        int iHashCode5 = dnxVar != null ? dnxVar.hashCode() : 0;
        long j4 = this.l;
        int i5 = (((iHashCode4 + iHashCode5) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        defpackage.dou douVar = this.m;
        int i6 = (i5 + (douVar != null ? douVar.d : 0)) * 31;
        defpackage.crc crcVar = this.n;
        int iHashCode6 = i6 + (crcVar != null ? crcVar.hashCode() : 0);
        defpackage.den denVar = this.p;
        return (iHashCode6 * 961) + (denVar != null ? denVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String strG = defpackage.cqg.g(b());
        long j = this.l;
        long j2 = this.h;
        long j3 = this.b;
        return "SpanStyle(color=" + strG + ", brush=" + c() + ", alpha=" + a() + ", fontSize=" + defpackage.dps.c(j3) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + defpackage.dps.c(j2) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + defpackage.cqg.g(j) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=null, drawStyle=" + this.p + ')';
    }

    public dks(long j, long j2, defpackage.dnd dndVar, defpackage.dmw dmwVar, defpackage.dmx dmxVar, defpackage.dmq dmqVar, java.lang.String str, long j3, defpackage.dok dokVar, defpackage.doz dozVar, defpackage.dnx dnxVar, long j4, defpackage.dou douVar, defpackage.crc crcVar) {
        this(defpackage.dow.a(j), j2, dndVar, dmwVar, dmxVar, dmqVar, str, j3, dokVar, dozVar, dnxVar, j4, douVar, crcVar, (defpackage.den) null);
    }

    public dks(defpackage.doy doyVar, long j, defpackage.dnd dndVar, defpackage.dmw dmwVar, defpackage.dmx dmxVar, defpackage.dmq dmqVar, java.lang.String str, long j2, defpackage.dok dokVar, defpackage.doz dozVar, defpackage.dnx dnxVar, long j3, defpackage.dou douVar, defpackage.crc crcVar, defpackage.den denVar) {
        this.a = doyVar;
        this.b = j;
        this.c = dndVar;
        this.d = dmwVar;
        this.e = dmxVar;
        this.f = dmqVar;
        this.g = str;
        this.h = j2;
        this.i = dokVar;
        this.j = dozVar;
        this.k = dnxVar;
        this.l = j3;
        this.m = douVar;
        this.n = crcVar;
        this.o = null;
        this.p = denVar;
    }
}
