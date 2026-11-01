package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkz {
    public static final defpackage.dkz a = new defpackage.dkz(0, 0, null, 0, 0, 0, 16777215);
    public final defpackage.dks b;
    public final defpackage.dkd c;
    public final defpackage.dki d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dkz(long j, long j2, defpackage.dnd dndVar, long j3, int i, long j4, int i2) {
        long jN;
        long j5;
        long j6;
        long jN2;
        long j7;
        if ((i2 & 1) != 0) {
            float[] fArr = defpackage.crp.a;
            jN = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        } else {
            jN = j;
        }
        if ((i2 & 2) != 0) {
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
            j5 = 2143289344;
        } else {
            j5 = j2;
        }
        defpackage.dnd dndVar2 = (i2 & 4) != 0 ? null : dndVar;
        if ((i2 & 128) != 0) {
            defpackage.dpt[] dptVarArr2 = defpackage.dps.a;
            j6 = 2143289344;
        } else {
            j6 = j3;
        }
        if ((i2 & 2048) != 0) {
            float[] fArr2 = defpackage.crp.a;
            jN2 = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        } else {
            jN2 = 0;
        }
        long j8 = jN2;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            defpackage.dpt[] dptVarArr3 = defpackage.dps.a;
            j7 = 2143289344;
        } else {
            j7 = j4;
        }
        this(new defpackage.dks(jN, j5, dndVar2, null, null, null, null, j6, null, null, null, j8, null, null), new defpackage.dkd(i3, 0, j7, null, null, null, 0, 0, null), null);
    }

    public static /* synthetic */ defpackage.dkz y(defpackage.dkz dkzVar, long j, long j2, defpackage.dnd dndVar, defpackage.dmq dmqVar, long j3, int i, long j4, int i2) {
        long jN;
        long j5;
        long j6;
        long jN2;
        long j7;
        if ((i2 & 1) != 0) {
            float[] fArr = defpackage.crp.a;
            jN = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        } else {
            jN = j;
        }
        if ((i2 & 2) != 0) {
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
            j5 = 2143289344;
        } else {
            j5 = j2;
        }
        defpackage.dnd dndVar2 = (i2 & 4) != 0 ? null : dndVar;
        defpackage.dmq dmqVar2 = (i2 & 32) != 0 ? null : dmqVar;
        if ((i2 & 128) != 0) {
            defpackage.dpt[] dptVarArr2 = defpackage.dps.a;
            j6 = 2143289344;
        } else {
            j6 = j3;
        }
        if ((i2 & 2048) != 0) {
            float[] fArr2 = defpackage.crp.a;
            jN2 = defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u);
        } else {
            jN2 = 0;
        }
        long j8 = jN2;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            defpackage.dpt[] dptVarArr3 = defpackage.dps.a;
            j7 = 2143289344;
        } else {
            j7 = j4;
        }
        defpackage.dks dksVar = dkzVar.b;
        defpackage.dks dksVarA = defpackage.dkt.a(dksVar, jN, null, Float.NaN, j5, dndVar2, null, null, dmqVar2, null, j6, null, null, null, j8, null, null, null);
        defpackage.dkd dkdVar = dkzVar.c;
        defpackage.dkd dkdVarA = defpackage.dke.a(dkdVar, i3, 0, j7, null, null, null, 0, 0, null);
        return (dksVar == dksVarA && dkdVar == dkdVarA) ? dkzVar : new defpackage.dkz(dksVarA, dkdVarA);
    }

    public static /* synthetic */ defpackage.dkz z(defpackage.dkz dkzVar, long j, long j2, defpackage.dnd dndVar, defpackage.dmw dmwVar, defpackage.dmq dmqVar, java.lang.String str, long j3, long j4, defpackage.dou douVar, int i, long j5, defpackage.dki dkiVar, defpackage.dos dosVar, int i2, int i3, int i4) {
        long jB = (i4 & 1) != 0 ? dkzVar.b.b() : j;
        long j6 = (i4 & 2) != 0 ? dkzVar.b.b : j2;
        defpackage.dnd dndVar2 = (i4 & 4) != 0 ? dkzVar.b.c : dndVar;
        defpackage.dmw dmwVar2 = (i4 & 8) != 0 ? dkzVar.b.d : dmwVar;
        defpackage.dmx dmxVar = (i4 & 16) != 0 ? dkzVar.b.e : null;
        defpackage.dmq dmqVar2 = (i4 & 32) != 0 ? dkzVar.b.f : dmqVar;
        java.lang.String str2 = (i4 & 64) != 0 ? dkzVar.b.g : str;
        long j7 = (i4 & 128) != 0 ? dkzVar.b.h : j3;
        defpackage.dok dokVar = (i4 & 256) != 0 ? dkzVar.b.i : null;
        defpackage.doz dozVar = (i4 & 512) != 0 ? dkzVar.b.j : null;
        defpackage.dnx dnxVar = (i4 & 1024) != 0 ? dkzVar.b.k : null;
        long j8 = jB;
        long j9 = (i4 & 2048) != 0 ? dkzVar.b.l : j4;
        defpackage.dou douVar2 = (i4 & 4096) != 0 ? dkzVar.b.m : douVar;
        defpackage.crc crcVar = (i4 & 8192) != 0 ? dkzVar.b.n : null;
        defpackage.dou douVar3 = douVar2;
        defpackage.den denVar = (i4 & 16384) != 0 ? dkzVar.b.p : null;
        int i5 = (i4 & 32768) != 0 ? dkzVar.c.a : 0;
        int i6 = (i4 & 65536) != 0 ? dkzVar.c.b : i;
        long j10 = (i4 & 131072) != 0 ? dkzVar.c.c : j5;
        defpackage.dpa dpaVar = (i4 & 262144) != 0 ? dkzVar.c.d : null;
        defpackage.dki dkiVar2 = (i4 & 524288) != 0 ? dkzVar.d : dkiVar;
        defpackage.dos dosVar2 = (i4 & 1048576) != 0 ? dkzVar.c.f : dosVar;
        int i7 = (i4 & 2097152) != 0 ? dkzVar.c.g : i2;
        if ((i4 & 4194304) != 0) {
            i3 = dkzVar.c.h;
        }
        defpackage.dpc dpcVar = dkzVar.c.i;
        defpackage.dks dksVar = dkzVar.b;
        return new defpackage.dkz(new defpackage.dks(j8 == dksVar.b() ? dksVar.a : defpackage.dow.a(j8), j6, dndVar2, dmwVar2, dmxVar, dmqVar2, str2, j7, dokVar, dozVar, dnxVar, j9, douVar3, crcVar, denVar), new defpackage.dkd(i5, i6, j10, dpaVar, dkiVar2 != null ? dkiVar2.b : null, dosVar2, i7, i3, dpcVar), dkiVar2);
    }

    public final defpackage.den A() {
        return this.b.p;
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dkz) {
            defpackage.dkz dkzVar = (defpackage.dkz) obj;
            if (defpackage.aooh.n(this.b, dkzVar.b) && defpackage.aooh.n(this.c, dkzVar.c) && defpackage.aooh.n(this.d, dkzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.b.b();
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.b.h;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        defpackage.dki dkiVar = this.d;
        return (iHashCode * 31) + (dkiVar != null ? dkiVar.hashCode() : 0);
    }

    public final long i() {
        return this.c.c;
    }

    public final defpackage.cqd j() {
        return this.b.c();
    }

    public final defpackage.crc k() {
        return this.b.n;
    }

    public final defpackage.dkz l(defpackage.dkz dkzVar) {
        if (dkzVar == null || defpackage.aooh.n(dkzVar, a)) {
            return this;
        }
        return new defpackage.dkz(this.b.d(dkzVar.b), this.c.a(dkzVar.c));
    }

    public final defpackage.dmq m() {
        return this.b.f;
    }

    public final defpackage.dmw n() {
        return this.b.d;
    }

    public final defpackage.dmx o() {
        return this.b.e;
    }

    public final defpackage.dnd p() {
        return this.b.c;
    }

    public final defpackage.dnx q() {
        return this.b.k;
    }

    public final defpackage.dok r() {
        return this.b.i;
    }

    public final defpackage.dos s() {
        return this.c.f;
    }

    public final defpackage.dou t() {
        return this.b.m;
    }

    public final java.lang.String toString() {
        java.lang.String strG = defpackage.cqg.g(f());
        defpackage.cqd cqdVarJ = j();
        float fA = a();
        java.lang.String strC = defpackage.dps.c(g());
        defpackage.dnd dndVarP = p();
        defpackage.dmw dmwVarN = n();
        defpackage.dmx dmxVarO = o();
        defpackage.dmq dmqVarM = m();
        java.lang.String strC2 = defpackage.dps.c(h());
        defpackage.dok dokVarR = r();
        defpackage.dnx dnxVarQ = q();
        java.lang.String strG2 = defpackage.cqg.g(e());
        defpackage.dou douVarT = t();
        defpackage.crc crcVarK = k();
        defpackage.den denVarA = A();
        java.lang.String strA = defpackage.dot.a(c());
        java.lang.String strA2 = defpackage.dov.a(d());
        java.lang.String strC3 = defpackage.dps.c(i());
        defpackage.dpa dpaVarU = u();
        defpackage.dos dosVarS = s();
        java.lang.String strA3 = defpackage.doo.a(b());
        defpackage.dpc dpcVarV = v();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextStyle(color=");
        sb.append(strG);
        sb.append(", brush=");
        sb.append(cqdVarJ);
        sb.append(", alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strC);
        sb.append(", fontWeight=");
        sb.append(dndVarP);
        sb.append(", fontStyle=");
        sb.append(dmwVarN);
        sb.append(", fontSynthesis=");
        sb.append(dmxVarO);
        sb.append(", fontFamily=");
        sb.append(dmqVarM);
        sb.append(", fontFeatureSettings=");
        defpackage.dks dksVar = this.b;
        sb.append(dksVar.g);
        sb.append(", letterSpacing=");
        sb.append(strC2);
        sb.append(", baselineShift=");
        sb.append(dokVarR);
        sb.append(", textGeometricTransform=");
        sb.append(dksVar.j);
        sb.append(", localeList=");
        sb.append(dnxVarQ);
        sb.append(", background=");
        sb.append(strG2);
        sb.append(", textDecoration=");
        sb.append(douVarT);
        sb.append(", shadow=");
        sb.append(crcVarK);
        sb.append(", drawStyle=");
        sb.append(denVarA);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        sb.append(strA2);
        sb.append(", lineHeight=");
        sb.append(strC3);
        sb.append(", textIndent=");
        sb.append(dpaVarU);
        defpackage.dki dkiVar = this.d;
        defpackage.dkd dkdVar = this.c;
        sb.append(", platformStyle=");
        sb.append(dkiVar);
        sb.append(", lineHeightStyle=");
        sb.append(dosVarS);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(defpackage.don.a(dkdVar.h));
        sb.append(", textMotion=");
        sb.append(dpcVarV);
        sb.append(')');
        return sb.toString();
    }

    public final defpackage.dpa u() {
        return this.c.d;
    }

    public final defpackage.dpc v() {
        return this.c.i;
    }

    public final boolean w(defpackage.dkz dkzVar) {
        return this == dkzVar || this.b.f(dkzVar.b);
    }

    public final boolean x(defpackage.dkz dkzVar) {
        if (this != dkzVar) {
            return defpackage.aooh.n(this.c, dkzVar.c) && this.b.e(dkzVar.b);
        }
        return true;
    }

    public dkz(defpackage.dks dksVar, defpackage.dkd dkdVar, defpackage.dki dkiVar) {
        this.b = dksVar;
        this.c = dkdVar;
        this.d = dkiVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dkz(defpackage.dks dksVar, defpackage.dkd dkdVar) {
        defpackage.dkg dkgVar = dkdVar.e;
        this(dksVar, dkdVar, dkgVar == null ? null : new defpackage.dki(dkgVar));
    }
}
