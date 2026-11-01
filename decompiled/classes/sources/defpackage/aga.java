package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aga {
    public static final defpackage.aonj a = new defpackage.afv(2);
    public static final defpackage.aonj b = new defpackage.afv(3);
    public static final defpackage.nf h = new defpackage.nf(new defpackage.afv(4), new defpackage.afv(5));
    public static final defpackage.aku c = new defpackage.aku(1.0f, 400.0f, null);
    public static final defpackage.aku d = new defpackage.aku(1.0f, 400.0f, java.lang.Float.valueOf(0.002f));
    public static final defpackage.aku e = new defpackage.aku(1.0f, 400.0f, null);
    public static final defpackage.aku f = new defpackage.aku(1.0f, 400.0f, new defpackage.dpn(4294967297L));
    public static final defpackage.aku g = new defpackage.aku(1.0f, 400.0f, new defpackage.dpp(4294967297L));

    public static final defpackage.agf a(defpackage.ajl ajlVar, defpackage.cmj cmjVar, boolean z, defpackage.aonj aonjVar) {
        return new defpackage.agf(new defpackage.afs(null, null, new defpackage.afm(cmjVar, aonjVar, ajlVar, z), null, false, null, 123));
    }

    public static final defpackage.agf b(defpackage.ajl ajlVar, float f2, long j) {
        return new defpackage.agf(new defpackage.afs(null, null, null, new defpackage.ags(f2, j, ajlVar), false, null, 119));
    }

    public static final defpackage.agf c(defpackage.ajl ajlVar, defpackage.aonj aonjVar) {
        return new defpackage.agf(new defpackage.afs(null, new ahv(aonjVar, ajlVar), null, null, false, null, 125));
    }

    public static final defpackage.agf d(defpackage.ajl ajlVar, defpackage.aonj aonjVar) {
        return c(ajlVar, new defpackage.nm(aonjVar, 16));
    }

    public static final defpackage.agg e(defpackage.ajl ajlVar, defpackage.cmj cmjVar, boolean z, defpackage.aonj aonjVar) {
        return new defpackage.agg(new defpackage.afs(null, null, new defpackage.afm(cmjVar, aonjVar, ajlVar, z), null, false, null, 123));
    }

    public static final defpackage.agg f(defpackage.ajl ajlVar, defpackage.aonj aonjVar) {
        return new defpackage.agg(new defpackage.afs(null, new ahv(aonjVar, ajlVar), null, null, false, null, 125));
    }

    public static final defpackage.agg g(defpackage.ajl ajlVar, defpackage.aonj aonjVar) {
        return f(ajlVar, new defpackage.nm(aonjVar, 19));
    }

    public static /* synthetic */ defpackage.agf h(defpackage.ajl ajlVar, defpackage.cmj cmjVar, defpackage.aonj aonjVar, int i) {
        if ((i & 1) != 0) {
            ajlVar = new defpackage.aku(1.0f, 400.0f, new defpackage.dpp(4294967297L));
        }
        if ((i & 2) != 0) {
            cmjVar = defpackage.cmh.i;
        }
        boolean z = (i & 4) != 0;
        int i2 = 8;
        if ((i & 8) != 0) {
            aonjVar = new defpackage.afv(i2);
        }
        return a(ajlVar, cmjVar, z, aonjVar);
    }

    public static /* synthetic */ defpackage.agf i(defpackage.ajl ajlVar, defpackage.cmn cmnVar, int i) {
        if ((i & 1) != 0) {
            ajlVar = new defpackage.aku(1.0f, 400.0f, new defpackage.dpp(4294967297L));
        }
        if ((i & 2) != 0) {
            cmnVar = defpackage.cmh.o;
        }
        return a(ajlVar, u(cmnVar), (i & 4) != 0, new defpackage.nm(new defpackage.nq(12), 20));
    }

    public static /* synthetic */ defpackage.agf j(defpackage.ajl ajlVar, float f2, long j, int i) {
        if ((i & 1) != 0) {
            ajlVar = d;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            j = defpackage.mni.bj(0.5f, 0.5f);
        }
        return b(ajlVar, f2, j);
    }

    public static /* synthetic */ defpackage.agg k(defpackage.ajl ajlVar, float f2, long j, int i) {
        if ((i & 1) != 0) {
            ajlVar = d;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            j = defpackage.mni.bj(0.5f, 0.5f);
        }
        return new defpackage.agg(new defpackage.afs(null, null, null, new defpackage.ags(f2, j, ajlVar), false, null, 119));
    }

    public static /* synthetic */ defpackage.agg l(defpackage.ajl ajlVar, defpackage.cmj cmjVar, int i) {
        if ((i & 1) != 0) {
            ajlVar = new defpackage.aku(1.0f, 400.0f, new defpackage.dpp(4294967297L));
        }
        if ((i & 2) != 0) {
            cmjVar = defpackage.cmh.i;
        }
        return e(ajlVar, cmjVar, true, new defpackage.afv(0));
    }

    public static /* synthetic */ defpackage.agg m(defpackage.ajl ajlVar, defpackage.cmn cmnVar, int i) {
        if ((i & 1) != 0) {
            ajlVar = new defpackage.aku(1.0f, 400.0f, new defpackage.dpp(4294967297L));
        }
        if ((i & 2) != 0) {
            cmnVar = defpackage.cmh.o;
        }
        return e(ajlVar, u(cmnVar), (i & 4) != 0, new defpackage.agb(new defpackage.nq(10), 1));
    }

    public static /* synthetic */ defpackage.agf n(defpackage.ajl ajlVar, int i) {
        if ((i & 1) != 0) {
            ajlVar = new defpackage.aku(1.0f, 400.0f, null);
        }
        return new defpackage.agf(new defpackage.afs(new defpackage.agh(0.0f, ajlVar), null, null, null, false, null, 126));
    }

    public static /* synthetic */ defpackage.agg o(defpackage.ajl ajlVar, int i) {
        if ((i & 1) != 0) {
            ajlVar = new defpackage.aku(1.0f, 400.0f, null);
        }
        return new defpackage.agg(new defpackage.afs(new defpackage.agh(0.0f, ajlVar), null, null, null, false, null, 126));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0269  */
    /* JADX WARN: Code duplicated, block: B:110:0x028e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0297  */
    /* JADX WARN: Code duplicated, block: B:116:0x029d  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x020b  */
    /* JADX WARN: Code duplicated, block: B:94:0x021f  */
    public static final defpackage.cmw r(defpackage.alg algVar, defpackage.izg izgVar, java.lang.String str, defpackage.cav cavVar, int i) {
        long j;
        boolean z;
        defpackage.afm afmVar;
        boolean z2;
        int i2;
        ett ettVarF;
        ett ettVar;
        ett ettVar2;
        ett ettVar3;
        defpackage.afm afmVar2;
        boolean z3;
        defpackage.csb csbVar;
        defpackage.agg aggVar;
        boolean z4;
        defpackage.ahc ahcVar;
        aia aiaVar;
        java.lang.Boolean bool;
        boolean z5;
        boolean z6;
        int i3;
        ett ettVarF2;
        ett ettVarF3;
        ett ettVar4;
        boolean zD;
        java.lang.Object objG;
        defpackage.ahc ahcVar2;
        defpackage.agg aggVar2;
        defpackage.aomy aomyVar;
        boolean z7;
        java.lang.Object objG2;
        java.lang.Object objG3;
        java.lang.Object objG4;
        java.lang.Object objG5;
        java.lang.Object objG6;
        java.lang.Object objG7;
        java.lang.Object objG8;
        java.lang.Object objG9 = cavVar.g();
        java.lang.Object obj = defpackage.cau.a;
        if (objG9 == obj) {
            objG9 = new defpackage.nu(3);
            cavVar.w(objG9);
        }
        java.lang.Object obj2 = izgVar.a;
        java.lang.Object obj3 = izgVar.b;
        java.lang.Object obj4 = izgVar.c;
        defpackage.agf agfVar = (defpackage.agf) obj2;
        defpackage.afs afsVar = agfVar.b;
        ahv ahvVar = afsVar.b;
        defpackage.agg aggVar3 = (defpackage.agg) obj3;
        defpackage.afs afsVar2 = aggVar3.b;
        defpackage.aomy aomyVar2 = (defpackage.aomy) objG9;
        defpackage.ahc ahcVar3 = (defpackage.ahc) obj4;
        long j2 = ahcVar3.d;
        boolean z8 = true;
        if (ahvVar == null && afsVar2.b == null) {
            j = j2;
            if (ahcVar3.h == 0) {
                z = false;
            }
            afmVar = afsVar.c;
            if (afmVar == null || afsVar2.c != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            i2 = i & 14;
            ettVarF = null;
            if (z) {
                int i4 = i2 | 384;
                cavVar.u(-194250641);
                defpackage.nf nfVar = defpackage.alo.g;
                objG8 = cavVar.g();
                if (objG8 == obj) {
                    objG8 = str.concat(" slide");
                    cavVar.w(objG8);
                }
                ett ettVarF4 = defpackage.alk.f(algVar, nfVar, cavVar, i4);
                cavVar.o();
                ettVar = ettVarF4;
            } else {
                cavVar.u(-194144838);
                cavVar.o();
                ettVar = null;
            }
            if (z2 != 0) {
                int i5 = i2 | 384;
                cavVar.u(-194053047);
                defpackage.nf nfVar2 = defpackage.alo.h;
                objG7 = cavVar.g();
                if (objG7 == obj) {
                    objG7 = str.concat(" shrink/expand");
                    cavVar.w(objG7);
                }
                ett ettVarF5 = defpackage.alk.f(algVar, nfVar2, cavVar, i5);
                cavVar.o();
                ettVar2 = ettVarF5;
            } else {
                cavVar.u(-193942223);
                cavVar.o();
                ettVar2 = null;
            }
            if (z2 != 0) {
                int i6 = i2 | 384;
                cavVar.u(-193868597);
                defpackage.nf nfVar3 = defpackage.alo.g;
                objG6 = cavVar.g();
                if (objG6 == obj) {
                    objG6 = str.concat(" InterruptionHandlingOffset");
                    cavVar.w(objG6);
                }
                ett ettVarF6 = defpackage.alk.f(algVar, nfVar3, cavVar, i6);
                cavVar.o();
                ettVar3 = ettVarF6;
            } else {
                cavVar.u(-193698191);
                cavVar.o();
                ettVar3 = null;
            }
            z3 = (afmVar == null && !afmVar.d) || !(((afmVar2 = afsVar2.c) == null || afmVar2.d) && z2);
            float[] fArr = defpackage.crp.a;
            csbVar = defpackage.crp.e;
            if (j != 0) {
                int i7 = i2 | 384;
                cavVar.u(-193159193);
                java.lang.Object objA = afn.a.a(csbVar);
                objG5 = cavVar.g();
                if (objG5 == obj) {
                    objG5 = str.concat(" veil");
                    cavVar.w(objG5);
                }
                aggVar = aggVar3;
                z4 = z3;
                aiaVar = new aia(algVar, defpackage.alk.f(algVar, (defpackage.nf) objA, cavVar, i7), agfVar, aggVar, ahcVar3);
                ahcVar = ahcVar3;
                agfVar = agfVar;
                cavVar.o();
            } else {
                aggVar = aggVar3;
                z4 = z3;
                ahcVar = ahcVar3;
                cavVar.u(-192861066);
                cavVar.o();
                aiaVar = defpackage.cmw.c;
            }
            if (ahcVar.w != null) {
                bool = java.lang.Boolean.FALSE;
            } else {
                bool = null;
            }
            if (bool != null) {
                bool.booleanValue();
            }
            int i8 = i2 | 4096;
            int i9 = i << 3;
            aia aiaVar2 = aiaVar;
            if (afsVar.a != null && afsVar2.a == null && ahcVar.e == 1.0f) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (afsVar.d != null && afsVar2.d == null && ahcVar.f == 1.0f) {
                z6 = false;
            } else {
                z6 = true;
            }
            int i10 = i8 | (i9 & 57344);
            i3 = i10 & 14;
            if (z5) {
                int i11 = i3 | 384;
                cavVar.u(-1511858627);
                defpackage.nf nfVar4 = defpackage.alo.a;
                objG4 = cavVar.g();
                if (objG4 == obj) {
                    objG4 = str.concat(" alpha");
                    cavVar.w(objG4);
                }
                ettVarF2 = defpackage.alk.f(algVar, nfVar4, cavVar, i11);
                cavVar.o();
            } else {
                cavVar.u(-1511689182);
                cavVar.o();
                ettVarF2 = null;
            }
            if (z6) {
                int i12 = i3 | 384;
                cavVar.u(-1511621539);
                defpackage.nf nfVar5 = defpackage.alo.a;
                objG3 = cavVar.g();
                if (objG3 == obj) {
                    objG3 = str.concat(" scale");
                    cavVar.w(objG3);
                }
                ettVarF3 = defpackage.alk.f(algVar, nfVar5, cavVar, i12);
                cavVar.o();
            } else {
                cavVar.u(-1511452094);
                cavVar.o();
                ettVarF3 = null;
            }
            if (z6) {
                cavVar.u(-1511374438);
                ettVarF = defpackage.alk.f(algVar, h, cavVar, i3 | 384);
                cavVar.o();
            } else {
                cavVar.u(-1511202110);
                cavVar.o();
            }
            ettVar4 = ettVarF;
            zD = cavVar.D(ettVarF2) | cavVar.B(obj2) | cavVar.B(obj3) | cavVar.D(obj4) | cavVar.D(ettVarF3) | (((i3 ^ 6) <= 4 && cavVar.B(algVar)) || (i10 & 6) == 4) | cavVar.D(ettVar4);
            objG = cavVar.g();
            if (!zD || objG == obj) {
                ett ettVar5 = ettVarF3;
                defpackage.agg aggVar4 = aggVar;
                ahcVar2 = ahcVar;
                java.lang.Object afuVar = new defpackage.afu(ettVarF2, ahcVar2, ettVar5, algVar, agfVar, aggVar4, ettVar4);
                aggVar2 = aggVar4;
                cavVar.w(afuVar);
                objG = afuVar;
            } else {
                aggVar2 = aggVar;
                ahcVar2 = ahcVar;
            }
            defpackage.afu afuVar2 = (defpackage.afu) objG;
            boolean zC = cavVar.C(z4);
            if (((i & 896) ^ 384) > 256) {
                aomyVar = aomyVar2;
                if (!cavVar.B(aomyVar)) {
                }
                z7 = zC | z8;
                objG2 = cavVar.g();
                if (z7 || objG2 == obj) {
                    objG2 = new defpackage.afw(z4, aomyVar, 0);
                    cavVar.w(objG2);
                }
                return new defpackage.cqb((defpackage.aonj) objG2).a(new defpackage.aft(algVar, ettVar2, ettVar3, ettVar, agfVar, aggVar2, ahcVar2, aomyVar, afuVar2)).a(aiaVar2);
            }
            aomyVar = aomyVar2;
            if ((i & 384) != 256) {
                z8 = false;
            }
            z7 = zC | z8;
            objG2 = cavVar.g();
            if (z7) {
                objG2 = new defpackage.afw(z4, aomyVar, 0);
                cavVar.w(objG2);
            } else {
                objG2 = new defpackage.afw(z4, aomyVar, 0);
                cavVar.w(objG2);
            }
            return new defpackage.cqb((defpackage.aonj) objG2).a(new defpackage.aft(algVar, ettVar2, ettVar3, ettVar, agfVar, aggVar2, ahcVar2, aomyVar, afuVar2)).a(aiaVar2);
        }
        j = j2;
        z = true;
        afmVar = afsVar.c;
        if (afmVar == null) {
            z2 = true;
        } else {
            z2 = true;
        }
        i2 = i & 14;
        ettVarF = null;
        if (z) {
            int i13 = i2 | 384;
            cavVar.u(-194250641);
            defpackage.nf nfVar6 = defpackage.alo.g;
            objG8 = cavVar.g();
            if (objG8 == obj) {
                objG8 = str.concat(" slide");
                cavVar.w(objG8);
            }
            ett ettVarF7 = defpackage.alk.f(algVar, nfVar6, cavVar, i13);
            cavVar.o();
            ettVar = ettVarF7;
        } else {
            cavVar.u(-194144838);
            cavVar.o();
            ettVar = null;
        }
        if (z2 != 0) {
            int i14 = i2 | 384;
            cavVar.u(-194053047);
            defpackage.nf nfVar7 = defpackage.alo.h;
            objG7 = cavVar.g();
            if (objG7 == obj) {
                objG7 = str.concat(" shrink/expand");
                cavVar.w(objG7);
            }
            ett ettVarF8 = defpackage.alk.f(algVar, nfVar7, cavVar, i14);
            cavVar.o();
            ettVar2 = ettVarF8;
        } else {
            cavVar.u(-193942223);
            cavVar.o();
            ettVar2 = null;
        }
        if (z2 != 0) {
            int i15 = i2 | 384;
            cavVar.u(-193868597);
            defpackage.nf nfVar8 = defpackage.alo.g;
            objG6 = cavVar.g();
            if (objG6 == obj) {
                objG6 = str.concat(" InterruptionHandlingOffset");
                cavVar.w(objG6);
            }
            ett ettVarF9 = defpackage.alk.f(algVar, nfVar8, cavVar, i15);
            cavVar.o();
            ettVar3 = ettVarF9;
        } else {
            cavVar.u(-193698191);
            cavVar.o();
            ettVar3 = null;
        }
        if (afmVar == null) {
        }
        float[] fArr2 = defpackage.crp.a;
        csbVar = defpackage.crp.e;
        if (j != 0) {
            int i16 = i2 | 384;
            cavVar.u(-193159193);
            java.lang.Object objA2 = afn.a.a(csbVar);
            objG5 = cavVar.g();
            if (objG5 == obj) {
                objG5 = str.concat(" veil");
                cavVar.w(objG5);
            }
            aggVar = aggVar3;
            z4 = z3;
            aiaVar = new aia(algVar, defpackage.alk.f(algVar, (defpackage.nf) objA2, cavVar, i16), agfVar, aggVar, ahcVar3);
            ahcVar = ahcVar3;
            agfVar = agfVar;
            cavVar.o();
        } else {
            aggVar = aggVar3;
            z4 = z3;
            ahcVar = ahcVar3;
            cavVar.u(-192861066);
            cavVar.o();
            aiaVar = defpackage.cmw.c;
        }
        if (ahcVar.w != null) {
            bool = java.lang.Boolean.FALSE;
        } else {
            bool = null;
        }
        if (bool != null) {
            bool.booleanValue();
        }
        int i17 = i2 | 4096;
        int i18 = i << 3;
        aia aiaVar3 = aiaVar;
        if (afsVar.a != null) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (afsVar.d != null) {
            z6 = true;
        } else {
            z6 = true;
        }
        int i19 = i17 | (i18 & 57344);
        i3 = i19 & 14;
        if (z5) {
            int i110 = i3 | 384;
            cavVar.u(-1511858627);
            defpackage.nf nfVar9 = defpackage.alo.a;
            objG4 = cavVar.g();
            if (objG4 == obj) {
                objG4 = str.concat(" alpha");
                cavVar.w(objG4);
            }
            ettVarF2 = defpackage.alk.f(algVar, nfVar9, cavVar, i110);
            cavVar.o();
        } else {
            cavVar.u(-1511689182);
            cavVar.o();
            ettVarF2 = null;
        }
        if (z6) {
            int i111 = i3 | 384;
            cavVar.u(-1511621539);
            defpackage.nf nfVar10 = defpackage.alo.a;
            objG3 = cavVar.g();
            if (objG3 == obj) {
                objG3 = str.concat(" scale");
                cavVar.w(objG3);
            }
            ettVarF3 = defpackage.alk.f(algVar, nfVar10, cavVar, i111);
            cavVar.o();
        } else {
            cavVar.u(-1511452094);
            cavVar.o();
            ettVarF3 = null;
        }
        if (z6) {
            cavVar.u(-1511374438);
            ettVarF = defpackage.alk.f(algVar, h, cavVar, i3 | 384);
            cavVar.o();
        } else {
            cavVar.u(-1511202110);
            cavVar.o();
        }
        ettVar4 = ettVarF;
        zD = cavVar.D(ettVarF2) | cavVar.B(obj2) | cavVar.B(obj3) | cavVar.D(obj4) | cavVar.D(ettVarF3) | (((i3 ^ 6) <= 4 && cavVar.B(algVar)) || (i19 & 6) == 4) | cavVar.D(ettVar4);
        objG = cavVar.g();
        if (zD) {
            ett ettVar6 = ettVarF3;
            defpackage.agg aggVar5 = aggVar;
            ahcVar2 = ahcVar;
            java.lang.Object afuVar3 = new defpackage.afu(ettVarF2, ahcVar2, ettVar6, algVar, agfVar, aggVar5, ettVar4);
            aggVar2 = aggVar5;
            cavVar.w(afuVar3);
            objG = afuVar3;
        } else {
            ett ettVar7 = ettVarF3;
            defpackage.agg aggVar6 = aggVar;
            ahcVar2 = ahcVar;
            java.lang.Object afuVar4 = new defpackage.afu(ettVarF2, ahcVar2, ettVar7, algVar, agfVar, aggVar6, ettVar4);
            aggVar2 = aggVar6;
            cavVar.w(afuVar4);
            objG = afuVar4;
        }
        defpackage.afu afuVar5 = (defpackage.afu) objG;
        boolean zC2 = cavVar.C(z4);
        if (((i & 896) ^ 384) > 256) {
            aomyVar = aomyVar2;
            if (!cavVar.B(aomyVar)) {
            }
            z7 = zC2 | z8;
            objG2 = cavVar.g();
            if (z7) {
                objG2 = new defpackage.afw(z4, aomyVar, 0);
                cavVar.w(objG2);
            } else {
                objG2 = new defpackage.afw(z4, aomyVar, 0);
                cavVar.w(objG2);
            }
            return new defpackage.cqb((defpackage.aonj) objG2).a(new defpackage.aft(algVar, ettVar2, ettVar3, ettVar, agfVar, aggVar2, ahcVar2, aomyVar, afuVar5)).a(aiaVar3);
        }
        aomyVar = aomyVar2;
        if ((i & 384) != 256) {
            z8 = false;
        }
        z7 = zC2 | z8;
        objG2 = cavVar.g();
        if (z7) {
            objG2 = new defpackage.afw(z4, aomyVar, 0);
            cavVar.w(objG2);
        } else {
            objG2 = new defpackage.afw(z4, aomyVar, 0);
            cavVar.w(objG2);
        }
        return new defpackage.cqb((defpackage.aonj) objG2).a(new defpackage.aft(algVar, ettVar2, ettVar3, ettVar, agfVar, aggVar2, ahcVar2, aomyVar, afuVar5)).a(aiaVar3);
    }

    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final defpackage.izg s(defpackage.alg r22, defpackage.agf r23, defpackage.agg r24, defpackage.den r25, defpackage.cav r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aga.s(alg, agf, agg, den, cav, int, int):izg");
    }

    private static final defpackage.cmj t(defpackage.cmi cmiVar) {
        if (defpackage.aooh.n(cmiVar, defpackage.cmh.j)) {
            return defpackage.cmh.d;
        }
        return defpackage.aooh.n(cmiVar, defpackage.cmh.l) ? defpackage.cmh.f : defpackage.cmh.e;
    }

    private static final defpackage.cmj u(defpackage.cmn cmnVar) {
        if (defpackage.aooh.n(cmnVar, defpackage.cmh.m)) {
            return defpackage.cmh.b;
        }
        return defpackage.aooh.n(cmnVar, defpackage.cmh.o) ? defpackage.cmh.h : defpackage.cmh.e;
    }
}
