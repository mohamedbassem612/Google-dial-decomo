package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezt {
    public final defpackage.aewq a;
    public final defpackage.ahzi b;
    public final java.lang.String c;
    public final boolean d;
    private final java.lang.String e;

    public aezt(final defpackage.aewq aewqVar, final java.lang.String str, final java.lang.String str2, final boolean z) {
        this.a = aewqVar;
        this.c = str;
        this.e = str2;
        this.d = z;
        this.b = defpackage.ahvr.bI(new defpackage.ahzi() { // from class: aezp
            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                boolean z2 = z;
                defpackage.aewq aewqVar2 = aewqVar;
                android.content.Context contextA = z2 ? defpackage.abyl.a(aewqVar2.c) : aewqVar2.c;
                java.lang.String str3 = str2;
                return java.lang.String.valueOf(defpackage.aewo.b(contextA)) + java.io.File.separator + "phenotype" + java.io.File.separator + "shared" + java.io.File.separator + (str3.isEmpty() ? "" : java.lang.String.valueOf(str3).concat(java.lang.String.valueOf(java.io.File.separator))) + str + ".pb";
            }
        });
    }

    public static aezu b(defpackage.aexg aexgVar) {
        defpackage.akzx akzxVarM = aezu.a.m();
        if (aexgVar == null) {
            return akzxVarM.r();
        }
        for (defpackage.aexh aexhVar : aexgVar.f) {
            defpackage.akzx akzxVarM2 = aezv.a.m();
            java.lang.String str = aexhVar.e;
            akzxVarM2.u();
            aezv aezvVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            aezvVar.b |= 1;
            aezvVar.e = str;
            int i = aexhVar.c;
            int iAs = defpackage.agab.as(i);
            if (iAs == 0) {
                throw null;
            }
            int i2 = iAs - 1;
            if (i2 == 0) {
                long jLongValue = i == 1 ? ((java.lang.Long) aexhVar.d).longValue() : 0L;
                akzxVarM2.u();
                aezv aezvVar2 = akzxVarM2.b;
                aezvVar2.c = 2;
                aezvVar2.d = java.lang.Long.valueOf(jLongValue);
            } else if (i2 == 1) {
                boolean zBooleanValue = i == 2 ? ((java.lang.Boolean) aexhVar.d).booleanValue() : false;
                akzxVarM2.u();
                aezv aezvVar3 = akzxVarM2.b;
                aezvVar3.c = 3;
                aezvVar3.d = java.lang.Boolean.valueOf(zBooleanValue);
            } else if (i2 == 2) {
                double dDoubleValue = i == 3 ? ((java.lang.Double) aexhVar.d).doubleValue() : 0.0d;
                akzxVarM2.u();
                aezv aezvVar4 = akzxVarM2.b;
                aezvVar4.c = 4;
                aezvVar4.d = java.lang.Double.valueOf(dDoubleValue);
            } else if (i2 == 3) {
                java.lang.String str2 = i == 4 ? (java.lang.String) aexhVar.d : "";
                akzxVarM2.u();
                aezv aezvVar5 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                aezvVar5.c = 5;
                aezvVar5.d = str2;
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("No known flag type");
                }
                defpackage.akzc akzcVar = i == 5 ? (defpackage.akzc) aexhVar.d : defpackage.akzc.d;
                akzxVarM2.u();
                aezv aezvVar6 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(akzcVar);
                aezvVar6.c = 6;
                aezvVar6.d = akzcVar;
            }
            aezv aezvVarR = akzxVarM2.r();
            akzxVarM.u();
            aezu aezuVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(aezvVarR);
            defpackage.alat alatVar = aezuVar.g;
            if (!alatVar.c()) {
                aezuVar.g = defpackage.alad.J(alatVar);
            }
            aezuVar.g.add(aezvVarR);
        }
        java.lang.String str3 = aexgVar.e;
        akzxVarM.u();
        aezu aezuVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        aezuVar2.b |= 4;
        aezuVar2.e = str3;
        java.lang.String str4 = aexgVar.c;
        akzxVarM.u();
        aezu aezuVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str4);
        aezuVar3.b |= 1;
        aezuVar3.c = str4;
        long j = aexgVar.i;
        akzxVarM.u();
        aezu aezuVar4 = akzxVarM.b;
        aezuVar4.b |= 8;
        aezuVar4.f = j;
        if ((aexgVar.b & 2) != 0) {
            defpackage.akzc akzcVar2 = aexgVar.d;
            akzxVarM.u();
            aezu aezuVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVar2);
            aezuVar5.b |= 2;
            aezuVar5.d = akzcVar2;
        }
        return akzxVarM.r();
    }

    public final defpackage.aezs a() {
        defpackage.aezq aezqVar;
        defpackage.aezq aezqVar2;
        boolean z = this.d;
        if (!z && !defpackage.abyl.h(this.a.c)) {
            return new defpackage.aezs(aezu.a, new defpackage.aezr(3, 17, false));
        }
        if (defpackage.aewo.d()) {
            return new defpackage.aezs(aezu.a, new defpackage.aezr(3, 18, false));
        }
        defpackage.aewq aewqVar = this.a;
        defpackage.aezn aeznVarC = aewqVar.f.c(z);
        java.lang.String str = this.c;
        int iA = aeznVarC.a(defpackage.ajsw.FILE, defpackage.aewo.c(str));
        if (iA != 0) {
            aezqVar2 = new defpackage.aezq(null, new defpackage.aezr(iA, true));
        } else {
            try {
                java.lang.String strM = aeznVarC.c;
                if (strM.isEmpty()) {
                    defpackage.ahyn ahynVar = (defpackage.ahyn) aewqVar.g.eZ();
                    if (!ahynVar.f()) {
                        defpackage.agab.au(java.util.logging.Level.WARNING, aewqVar.c(), null, "Unable to get GMS application info, using defaults.", new java.lang.Object[0]);
                        aezqVar = new defpackage.aezq(defpackage.aext.a, new defpackage.aezr(3, 7, false));
                        aezqVar2 = aezqVar;
                    } else if (z) {
                        int i = defpackage.abyl.a;
                        strM = aa$.ExternalSyntheticApiModelOutline1.m((android.content.pm.ApplicationInfo) ahynVar.b());
                    } else {
                        strM = ((android.content.pm.ApplicationInfo) ahynVar.b()).dataDir;
                    }
                }
                defpackage.aogc aogcVar = new defpackage.aogc(aeznVarC.a, str, this.e);
                try {
                    try {
                        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(strM + java.io.File.separator + aeznVarC.b + java.io.File.separator + aogcVar.U().toString());
                        try {
                            int i2 = defpackage.akzf.i;
                            defpackage.aezq aezqVar3 = new defpackage.aezq(defpackage.aext.c(new defpackage.akze(fileInputStream, 4096)), new defpackage.aezr(5, 2, false));
                            fileInputStream.close();
                            aezqVar2 = aezqVar3;
                        } catch (java.lang.Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (java.io.FileNotFoundException unused) {
                        defpackage.agab.au(java.util.logging.Level.INFO, this.a.c(), null, "Shared storage file not found for %s", this.c);
                        aezqVar2 = new defpackage.aezq(null, new defpackage.aezr(8, false));
                    }
                } catch (defpackage.alaz e) {
                    defpackage.agab.au(java.util.logging.Level.SEVERE, this.a.c(), e, "Failed to parse snapshot from shared storage for %s", this.c);
                    aezqVar2 = new defpackage.aezq(null, new defpackage.aezr(9, false));
                }
            } catch (java.lang.Exception e2) {
                defpackage.agab.au(java.util.logging.Level.WARNING, this.a.c(), e2, "Failed to read shared file for %s", this.c);
                aezqVar = new defpackage.aezq(defpackage.aext.a, new defpackage.aezr(3, 10, false));
            }
        }
        if (aezqVar2.a != null) {
            defpackage.aext aextVar = aezqVar2.a;
            aextVar.getClass();
            return new defpackage.aezs(aextVar, aezqVar2.b);
        }
        defpackage.aezr aezrVar = aezqVar2.b;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream((java.lang.String) this.b.eZ());
            try {
                defpackage.akzq akzqVar = defpackage.akzq.a;
                aezu aezuVar = aezu.a;
                int i3 = defpackage.akzf.i;
                aezu aezuVarD = defpackage.alad.D(aezuVar, new defpackage.akze(fileInputStream2, 4096), akzqVar);
                defpackage.alad.V(aezuVarD);
                defpackage.aezs aezsVar = new defpackage.aezs(aezuVarD, new defpackage.aezr(4, aezrVar.c, aezrVar.a));
                fileInputStream2.close();
                return aezsVar;
            } catch (java.lang.Throwable th3) {
                try {
                    fileInputStream2.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException | java.lang.RuntimeException unused2) {
            defpackage.agab.au(java.util.logging.Level.INFO, this.a.c(), null, "Unable to retrieve flag snapshot for %s, using defaults.", this.c);
            return aezrVar.a ? new defpackage.aezs(aezu.a, new defpackage.aezr(3, 11, true)) : new defpackage.aezs(defpackage.aext.a, new defpackage.aezr(3, 16, false));
        }
    }

    public final defpackage.ajcq c(java.lang.String str) {
        defpackage.aewq aewqVar = this.a;
        return defpackage.ajan.f(aewqVar.b().d(this.c, str), new defpackage.aeqw(8), aewqVar.c());
    }

    public final defpackage.ajcq d(aezu aezuVar) {
        return defpackage.aiql.D(new wzc(this, aezuVar, 20), this.a.c());
    }
}
