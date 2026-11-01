package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dkt {
    public static final long a = defpackage.dpy.g(14);
    public static final long b = defpackage.dpy.g(0);
    public static final long c = defpackage.cfd.M(0);
    public static final defpackage.doy d = defpackage.dow.a(-72057594037927936L);

    /* JADX WARN: Code duplicated, block: B:13:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[ADDED_TO_REGION] */
    public static final defpackage.dks a(defpackage.dks dksVar, long j, defpackage.cqd cqdVar, float f, long j2, defpackage.dnd dndVar, defpackage.dmw dmwVar, defpackage.dmx dmxVar, defpackage.dmq dmqVar, java.lang.String str, long j3, defpackage.dok dokVar, defpackage.doz dozVar, defpackage.dnx dnxVar, long j4, defpackage.dou douVar, defpackage.crc crcVar, defpackage.den denVar) {
        long j5;
        defpackage.doy doyVar;
        long j6;
        long j7;
        long j8;
        defpackage.dnd dndVar2 = dndVar;
        defpackage.dmw dmwVar2 = dmwVar;
        defpackage.dmx dmxVar2 = dmxVar;
        defpackage.dmq dmqVar2 = dmqVar;
        java.lang.String str2 = str;
        defpackage.dok dokVar2 = dokVar;
        defpackage.doz dozVar2 = dozVar;
        defpackage.dnx dnxVar2 = dnxVar;
        defpackage.dou douVar2 = douVar;
        defpackage.crc crcVar2 = crcVar;
        defpackage.den denVar2 = denVar;
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        long j9 = j2 & 1095216660480L;
        long j10 = j3 & 1095216660480L;
        if (j9 == 0 || j2 == dksVar.b) {
            if (cqdVar != null) {
                j5 = j;
                j = j5;
                if ((dmwVar2 != null || defpackage.aooh.n(dmwVar2, dksVar.d)) && ((dndVar2 == null || defpackage.aooh.n(dndVar2, dksVar.c)) && ((dmqVar2 == null || dmqVar2 == dksVar.f) && ((j10 == 0 || j3 == dksVar.h) && (douVar2 == null || defpackage.aooh.n(douVar2, dksVar.m)))))) {
                    doyVar = dksVar.a;
                    if (!defpackage.aooh.n(cqdVar, doyVar.c()) && ((cqdVar == null || f == doyVar.a()) && ((dmxVar2 == null || defpackage.aooh.n(dmxVar2, dksVar.e)) && ((str2 == null || defpackage.aooh.n(str2, dksVar.g)) && ((dokVar2 == null || defpackage.aooh.n(dokVar2, dksVar.i)) && ((dozVar2 == null || defpackage.aooh.n(dozVar2, dksVar.j)) && (dnxVar2 == null || defpackage.aooh.n(dnxVar2, dksVar.k)))))))) {
                        if (j4 == 16) {
                            j6 = 16;
                        } else if (j4 == dksVar.l) {
                            j6 = j4;
                        }
                        if ((crcVar2 == null || defpackage.aooh.n(crcVar2, dksVar.n)) && (denVar2 == null || defpackage.aooh.n(denVar2, dksVar.p))) {
                            return dksVar;
                        }
                        j7 = j6;
                        j8 = j;
                    }
                }
            } else if (j == 16) {
                j5 = 16;
                j = j5;
                if (dmwVar2 != null) {
                    doyVar = dksVar.a;
                    if (!defpackage.aooh.n(cqdVar, doyVar.c())) {
                    }
                } else {
                    doyVar = dksVar.a;
                    if (!defpackage.aooh.n(cqdVar, doyVar.c())) {
                    }
                }
            } else if (j == dksVar.a.b()) {
                j5 = j;
                j = j5;
                if (dmwVar2 != null) {
                    doyVar = dksVar.a;
                    if (!defpackage.aooh.n(cqdVar, doyVar.c())) {
                    }
                } else {
                    doyVar = dksVar.a;
                    if (!defpackage.aooh.n(cqdVar, doyVar.c())) {
                    }
                }
            }
            j8 = j;
            j7 = j4;
        } else {
            j8 = j;
            j7 = j4;
        }
        defpackage.doy doyVarD = dksVar.a.d(cqdVar != null ? defpackage.dow.b(cqdVar, f) : defpackage.dow.a(j8));
        if (dmqVar2 == null) {
            dmqVar2 = dksVar.f;
        }
        long j11 = j9 == 0 ? dksVar.b : j2;
        if (dndVar2 == null) {
            dndVar2 = dksVar.c;
        }
        if (dmwVar2 == null) {
            dmwVar2 = dksVar.d;
        }
        if (dmxVar2 == null) {
            dmxVar2 = dksVar.e;
        }
        if (str2 == null) {
            str2 = dksVar.g;
        }
        defpackage.dnd dndVar3 = dndVar2;
        long j12 = j10 == 0 ? dksVar.h : j3;
        if (dokVar2 == null) {
            dokVar2 = dksVar.i;
        }
        if (dozVar2 == null) {
            dozVar2 = dksVar.j;
        }
        if (dnxVar2 == null) {
            dnxVar2 = dksVar.k;
        }
        long j13 = j12;
        if (j7 == 16) {
            j7 = dksVar.l;
        }
        if (douVar2 == null) {
            douVar2 = dksVar.m;
        }
        if (crcVar2 == null) {
            crcVar2 = dksVar.n;
        }
        if (denVar2 == null) {
            denVar2 = dksVar.p;
        }
        return new defpackage.dks(doyVarD, j11, dndVar3, dmwVar2, dmxVar2, dmqVar2, str2, j13, dokVar2, dozVar2, dnxVar2, j7, douVar2, crcVar2, denVar2);
    }
}
