package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class not implements agxi {
    public static final agxj a = new agxj("DobbySettingsMainFragmentModelKey");
    public static final aimz b;
    private static final j$.time.Duration j;
    private static final j$.time.Duration k;
    public final tzb c;
    public final mvy d;
    public final aoin e;
    public final aoin f;
    public final ysb g;
    public final aazc h;
    public final vaa i;
    private final aoss l;
    private final android.content.Context m;
    private final nnx n;
    private final mns o;
    private final defpackage.now p;
    private final mnl q;
    private final noe r;
    private final aoin s;
    private final aoin t;
    private final ils u;
    private final uyg v;

    static {
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(3L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        j = durationOfSeconds;
        j$.time.Duration durationOfSeconds2 = j$.time.Duration.ofSeconds(1L);
        aooh.e(durationOfSeconds2, "ofSeconds(...)");
        k = durationOfSeconds2;
        b = aimz.i("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource");
    }

    public not(aoss aossVar, android.content.Context context, nnx nnxVar, tzb tzbVar, vaa vaaVar, ils ilsVar, mns mnsVar, aazc aazcVar, defpackage.now nowVar, mnl mnlVar, mvy mvyVar, noe noeVar, ysb ysbVar, uyg uygVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(context, "appContext");
        aooh.f(mnsVar, "dobbySingletonAudioPrismConfigProvider");
        aooh.f(aazcVar, "clock");
        aooh.f(nowVar, "fragmentState");
        aooh.f(mvyVar, "localeProvider");
        aooh.f(ysbVar, "aiCoreAvailability");
        aooh.f(uygVar, "aiCoreModelDownloadProgressFlow");
        aooh.f(aoinVar, "enableLlmSmartReplyConsentFlow");
        aooh.f(aoinVar2, "enableParallelSettingsExternalStatesFetch");
        aooh.f(aoinVar3, "enableDobbyGemini");
        aooh.f(aoinVar4, "enableAgenticCallScreen");
        this.l = aossVar;
        this.m = context;
        this.n = nnxVar;
        this.c = tzbVar;
        this.i = vaaVar;
        this.u = ilsVar;
        this.o = mnsVar;
        this.h = aazcVar;
        this.p = nowVar;
        this.q = mnlVar;
        this.d = mvyVar;
        this.r = noeVar;
        this.g = ysbVar;
        this.v = uygVar;
        this.s = aoinVar;
        this.t = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
    }

    private final boolean k() {
        return this.q.a() == mnm.c;
    }

    public final ajbg a() {
        return new ajbg(aosv.F(this.l, 0, new defpackage.nht(this, (aoln) null, 12, (short[]) null), 3));
    }

    public final ajcq b() {
        return aosv.F(this.l, 0, new defpackage.nht(this, (aoln) null, 9), 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:104:0x027f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0294  */
    /* JADX WARN: Code duplicated, block: B:110:0x0298  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:118:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:120:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:130:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:133:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:142:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:143:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:144:0x0300  */
    /* JADX WARN: Code duplicated, block: B:145:0x0303  */
    /* JADX WARN: Code duplicated, block: B:146:0x0306  */
    /* JADX WARN: Code duplicated, block: B:149:0x032f  */
    /* JADX WARN: Code duplicated, block: B:150:0x034d  */
    /* JADX WARN: Code duplicated, block: B:152:0x035b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0361  */
    /* JADX WARN: Code duplicated, block: B:158:0x0385  */
    /* JADX WARN: Code duplicated, block: B:161:0x038b  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:172:0x0411  */
    /* JADX WARN: Code duplicated, block: B:174:0x041b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0445 A[PHI: r1 r5 r7 r11 r19
      0x0445: PHI (r1v79 npw) = (r1v49 npw), (r1v80 npw) binds: [B:171:0x040f, B:180:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r5v53 npw) = (r5v47 npw), (r5v54 npw) binds: [B:171:0x040f, B:180:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r7v12 aolu) = (r7v5 aolu), (r7v13 aolu) binds: [B:171:0x040f, B:180:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r11v49 nok) = (r11v42 nok), (r11v50 nok) binds: [B:171:0x040f, B:180:0x043f] A[DONT_GENERATE, DONT_INLINE]
      0x0445: PHI (r19v14 java.lang.String) = (r19v9 java.lang.String), (r19v15 java.lang.String) binds: [B:171:0x040f, B:180:0x043f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:184:0x0448  */
    /* JADX WARN: Code duplicated, block: B:186:0x044c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0454  */
    /* JADX WARN: Code duplicated, block: B:191:0x0458  */
    /* JADX WARN: Code duplicated, block: B:194:0x045e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0472  */
    /* JADX WARN: Code duplicated, block: B:200:0x0478  */
    /* JADX WARN: Code duplicated, block: B:201:0x047b  */
    /* JADX WARN: Code duplicated, block: B:202:0x047e  */
    /* JADX WARN: Code duplicated, block: B:203:0x0481  */
    /* JADX WARN: Code duplicated, block: B:204:0x0484  */
    /* JADX WARN: Code duplicated, block: B:205:0x0487  */
    /* JADX WARN: Code duplicated, block: B:206:0x048a  */
    /* JADX WARN: Code duplicated, block: B:207:0x048d  */
    /* JADX WARN: Code duplicated, block: B:210:0x049c  */
    /* JADX WARN: Code duplicated, block: B:211:0x049f  */
    /* JADX WARN: Code duplicated, block: B:213:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:215:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:216:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:220:0x0509  */
    /* JADX WARN: Code duplicated, block: B:222:0x0528  */
    /* JADX WARN: Code duplicated, block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:28:0x0110  */
    /* JADX WARN: Code duplicated, block: B:31:0x011c  */
    /* JADX WARN: Code duplicated, block: B:36:0x012a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0144  */
    /* JADX WARN: Code duplicated, block: B:42:0x0156  */
    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:48:0x016b  */
    /* JADX WARN: Code duplicated, block: B:49:0x016d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0173  */
    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0197  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Code duplicated, block: B:93:0x025e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:0x0275  */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0431, code lost:
    
        if (r2 != r7) goto L177;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(nok r23, aoln r24) throws aois {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.not.c(nok, aoln):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x017f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Code duplicated, block: B:71:0x018d  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(nok nokVar, aoln aolnVar) throws aois {
        defpackage.nom nomVar;
        nok nokVar2;
        defpackage.npw npwVar;
        defpackage.npw npwVar2;
        defpackage.npw npwVar3;
        boolean z;
        defpackage.npw npwVar4;
        defpackage.noi noiVar;
        int iOrdinal;
        java.lang.String str;
        defpackage.npw npwVar5;
        nok nokVar3;
        defpackage.npw npwVar6;
        int iOrdinal2;
        java.lang.String string;
        defpackage.nof nofVarB;
        if (aolnVar instanceof defpackage.nom) {
            nomVar = (defpackage.nom) aolnVar;
            int i = nomVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nomVar.d = i - Integer.MIN_VALUE;
            } else {
                nomVar = new defpackage.nom(this, aolnVar);
            }
        } else {
            nomVar = new defpackage.nom(this, aolnVar);
        }
        java.lang.Object objC = nomVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nomVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                npwVar = nomVar.g;
                npwVar2 = nomVar.f;
                nokVar2 = nomVar.e;
                aooc.af(objC);
            } else if (i2 == 2) {
                z = nomVar.a;
                npwVar3 = nomVar.g;
                defpackage.npw npwVar7 = nomVar.f;
                nok nokVar4 = nomVar.e;
                aooc.af(objC);
                npwVar4 = npwVar7;
                nokVar2 = nokVar4;
                noiVar = (defpackage.noi) objC;
                aooh.f(noiVar, "<this>");
                iOrdinal = noiVar.ordinal();
                if (iOrdinal == 0) {
                    str = "dobby_preference_protection_level_unspecified";
                } else if (iOrdinal != 1) {
                    str = "dobby_preference_protection_level_basic";
                } else if (iOrdinal != 2) {
                    str = "dobby_preference_protection_level_medium";
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new aois();
                    }
                    str = "dobby_preference_protection_level_unspecified";
                } else {
                    str = "dobby_preference_protection_level_maximum";
                }
                if (z && !aooh.n(str, "dobby_preference_protection_level_unspecified")) {
                    akzx akzxVar = (akzx) npwVar3.a;
                    akzxVar.u();
                    defpackage.nou nouVar = (defpackage.nou) akzxVar.b;
                    defpackage.nou nouVar2 = defpackage.nou.a;
                    j$.util.Objects.requireNonNull(str);
                    nouVar.b |= 1;
                    nouVar.e = str;
                    iOrdinal2 = noiVar.ordinal();
                    if (iOrdinal2 == 0) {
                        string = null;
                    } else if (iOrdinal2 != 1) {
                        string = this.m.getString(2132018453);
                    } else if (iOrdinal2 != 2) {
                        string = this.m.getString(2132018461);
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new aois();
                        }
                        string = null;
                    } else {
                        string = this.m.getString(2132018457);
                    }
                    akzxVar.u();
                    defpackage.nou nouVar3 = (defpackage.nou) akzxVar.b;
                    if (string == null) {
                        string = "";
                    }
                    j$.util.Objects.requireNonNull(string);
                    nouVar3.b |= 64;
                    nouVar3.j = string;
                }
                noe noeVar = this.r;
                nomVar.e = nokVar2;
                nomVar.f = npwVar4;
                nomVar.g = npwVar3;
                nomVar.d = 3;
                objC = noeVar.c(nomVar);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                npwVar5 = npwVar3;
                nokVar3 = nokVar2;
                npwVar6 = npwVar4;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                npwVar5 = nomVar.g;
                npwVar6 = nomVar.f;
                nokVar3 = nomVar.e;
                aooc.af(objC);
            }
            boolean zBooleanValue = ((java.lang.Boolean) objC).booleanValue();
            npwVar5.b(!zBooleanValue);
            npwVar5.c(true);
            if (((java.lang.Boolean) this.s.a()).booleanValue()) {
                nofVarB = defpackage.nof.b(nokVar3.j);
                if (nofVarB == null) {
                    nofVarB = defpackage.nof.UNRECOGNIZED;
                }
                boolean z2 = nofVarB == defpackage.nof.CONSENT_USER_OPTED_IN;
                akzx akzxVar2 = (akzx) npwVar5.a;
                akzxVar2.u();
                defpackage.nou nouVar4 = (defpackage.nou) akzxVar2.b;
                defpackage.nou nouVar5 = defpackage.nou.a;
                nouVar4.b |= 128;
                nouVar4.k = z2;
            }
            boolean z3 = nokVar3.f;
            akzx akzxVar3 = (akzx) npwVar5.a;
            akzxVar3.u();
            defpackage.nou nouVar6 = (defpackage.nou) akzxVar3.b;
            defpackage.nou nouVar7 = defpackage.nou.a;
            nouVar6.b |= 8;
            nouVar6.g = z3;
            boolean z4 = nokVar3.g;
            akzxVar3.u();
            defpackage.nou nouVar8 = (defpackage.nou) akzxVar3.b;
            nouVar8.b |= 16;
            nouVar8.h = z4;
            long jA = this.n.a();
            akzxVar3.u();
            defpackage.nou nouVar9 = (defpackage.nou) akzxVar3.b;
            nouVar9.b |= 32;
            nouVar9.i = jA;
            akzxVar3.u();
            defpackage.nou nouVar10 = (defpackage.nou) akzxVar3.b;
            nouVar10.b |= 256;
            nouVar10.l = zBooleanValue;
            return npwVar6.a();
        }
        aooc.af(objC);
        defpackage.npw npwVarAu = mni.au(defpackage.nou.a.m());
        noe noeVar2 = this.r;
        defpackage.noh nohVarB = defpackage.noh.b(nokVar.c);
        if (nohVarB == null) {
            nohVarB = defpackage.noh.UNRECOGNIZED;
        }
        nomVar.e = nokVar;
        nomVar.f = npwVarAu;
        nomVar.g = npwVarAu;
        nomVar.d = 1;
        java.lang.Object objF = noeVar2.f(nohVarB, nomVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        nokVar2 = nokVar;
        npwVar = npwVarAu;
        objC = objF;
        npwVar2 = npwVar;
        boolean zBooleanValue2 = ((java.lang.Boolean) objC).booleanValue();
        akzx akzxVar4 = (akzx) npwVar.a;
        akzxVar4.u();
        defpackage.nou nouVar11 = (defpackage.nou) akzxVar4.b;
        defpackage.nou nouVar12 = defpackage.nou.a;
        nouVar11.c = zBooleanValue2;
        akzxVar4.u();
        ((defpackage.nou) akzxVar4.b).d = zBooleanValue2;
        noe noeVar3 = this.r;
        defpackage.noi noiVarB = defpackage.noi.b(nokVar2.d);
        if (noiVarB == null) {
            noiVarB = defpackage.noi.UNRECOGNIZED;
        }
        nomVar.e = nokVar2;
        nomVar.f = npwVar2;
        nomVar.g = npwVar;
        nomVar.a = zBooleanValue2;
        nomVar.d = 2;
        java.lang.Object objB = noeVar3.b(noiVarB, nomVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.npw npwVar8 = npwVar2;
        npwVar3 = npwVar;
        z = zBooleanValue2;
        objC = objB;
        npwVar4 = npwVar8;
        noiVar = (defpackage.noi) objC;
        aooh.f(noiVar, "<this>");
        iOrdinal = noiVar.ordinal();
        if (iOrdinal == 0) {
            str = "dobby_preference_protection_level_unspecified";
        } else if (iOrdinal != 1) {
            str = "dobby_preference_protection_level_basic";
        } else if (iOrdinal != 2) {
            str = "dobby_preference_protection_level_medium";
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new aois();
            }
            str = "dobby_preference_protection_level_unspecified";
        } else {
            str = "dobby_preference_protection_level_maximum";
        }
        if (z) {
            akzx akzxVar5 = (akzx) npwVar3.a;
            akzxVar5.u();
            defpackage.nou nouVar13 = (defpackage.nou) akzxVar5.b;
            defpackage.nou nouVar14 = defpackage.nou.a;
            j$.util.Objects.requireNonNull(str);
            nouVar13.b |= 1;
            nouVar13.e = str;
            iOrdinal2 = noiVar.ordinal();
            if (iOrdinal2 == 0) {
                string = null;
            } else if (iOrdinal2 != 1) {
                string = this.m.getString(2132018453);
            } else if (iOrdinal2 != 2) {
                string = this.m.getString(2132018461);
            } else if (iOrdinal2 != 3) {
                if (iOrdinal2 != 4) {
                    throw new aois();
                }
                string = null;
            } else {
                string = this.m.getString(2132018457);
            }
            akzxVar5.u();
            defpackage.nou nouVar15 = (defpackage.nou) akzxVar5.b;
            if (string == null) {
                string = "";
            }
            j$.util.Objects.requireNonNull(string);
            nouVar15.b |= 64;
            nouVar15.j = string;
        }
        noe noeVar4 = this.r;
        nomVar.e = nokVar2;
        nomVar.f = npwVar4;
        nomVar.g = npwVar3;
        nomVar.d = 3;
        objC = noeVar4.c(nomVar);
        if (objC != aoluVar) {
            return aoluVar;
        }
        npwVar5 = npwVar3;
        nokVar3 = nokVar2;
        npwVar6 = npwVar4;
        boolean zBooleanValue3 = ((java.lang.Boolean) objC).booleanValue();
        npwVar5.b(!zBooleanValue3);
        npwVar5.c(true);
        if (((java.lang.Boolean) this.s.a()).booleanValue()) {
            nofVarB = defpackage.nof.b(nokVar3.j);
            if (nofVarB == null) {
                nofVarB = defpackage.nof.UNRECOGNIZED;
            }
            if (nofVarB == defpackage.nof.CONSENT_USER_OPTED_IN) {
            }
            akzx akzxVar6 = (akzx) npwVar5.a;
            akzxVar6.u();
            defpackage.nou nouVar16 = (defpackage.nou) akzxVar6.b;
            defpackage.nou nouVar17 = defpackage.nou.a;
            nouVar16.b |= 128;
            nouVar16.k = z2;
        }
        boolean z5 = nokVar3.f;
        akzx akzxVar7 = (akzx) npwVar5.a;
        akzxVar7.u();
        defpackage.nou nouVar18 = (defpackage.nou) akzxVar7.b;
        defpackage.nou nouVar19 = defpackage.nou.a;
        nouVar18.b |= 8;
        nouVar18.g = z5;
        boolean z6 = nokVar3.g;
        akzxVar7.u();
        defpackage.nou nouVar20 = (defpackage.nou) akzxVar7.b;
        nouVar20.b |= 16;
        nouVar20.h = z6;
        long jA2 = this.n.a();
        akzxVar7.u();
        defpackage.nou nouVar21 = (defpackage.nou) akzxVar7.b;
        nouVar21.b |= 32;
        nouVar21.i = jA2;
        akzxVar7.u();
        defpackage.nou nouVar110 = (defpackage.nou) akzxVar7.b;
        nouVar110.b |= 256;
        nouVar110.l = zBooleanValue3;
        return npwVar6.a();
    }

    public final /* synthetic */ java.lang.Object e() {
        return a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x012c  */
    /* JADX WARN: Code duplicated, block: B:41:0x013b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0155  */
    /* JADX WARN: Code duplicated, block: B:48:0x0167  */
    /* JADX WARN: Code duplicated, block: B:50:0x0172 A[PHI: r2 r6
      0x0172: PHI (r2v29 nwj) = (r2v14 nwj), (r2v31 nwj) binds: [B:45:0x0153, B:49:0x0168] A[DONT_GENERATE, DONT_INLINE]
      0x0172: PHI (r6v6 nwj) = (r6v3 nwj), (r6v7 nwj) binds: [B:45:0x0153, B:49:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.non nonVar;
        defpackage.nwj nwjVarI;
        defpackage.nwj nwjVar;
        defpackage.nwj nwjVar2;
        defpackage.nwj nwjVar3;
        defpackage.nwj nwjVar4;
        defpackage.nwj nwjVar5;
        defpackage.nwj nwjVar6;
        defpackage.nwj nwjVar7;
        defpackage.nwj nwjVar8;
        defpackage.ntd ntdVar;
        defpackage.ntc ntcVarB;
        defpackage.nwj nwjVar9;
        defpackage.nwj nwjVar10;
        defpackage.nwj nwjVar11;
        if (aolnVar instanceof defpackage.non) {
            nonVar = (defpackage.non) aolnVar;
            int i = nonVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonVar.c = i - Integer.MIN_VALUE;
            } else {
                nonVar = new defpackage.non(this, aolnVar);
            }
        } else {
            nonVar = new defpackage.non(this, aolnVar);
        }
        java.lang.Object objB = nonVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nonVar.c;
        if (i2 == 0) {
            aooc.af(objB);
            if (((java.lang.Boolean) this.t.a()).booleanValue()) {
                nonVar.c = 1;
                java.lang.Object objM = aosv.m(new defpackage.noo(this, null), nonVar);
                if (objM != aoluVar) {
                    return objM;
                }
            } else {
                aimw aimwVarL = b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates", 114, "DobbySettingsMainFragmentDataSource.kt");
                mvy mvyVar = this.d;
                aoir aoirVar = mvyVar.j;
                aimwVarL.y("fetch SODA in locale: %s", aoirVar.a());
                akff akffVarA = akff.a((java.lang.String) aoirVar.a());
                nwjVarI = mni.I(nog.a.m());
                tzb tzbVar = this.c;
                java.lang.Integer numB = mvyVar.b();
                nonVar.d = nwjVarI;
                nonVar.e = nwjVarI;
                nonVar.f = nwjVarI;
                nonVar.c = 2;
                objB = tzbVar.b(akffVarA, numB, nonVar);
                if (objB != aoluVar) {
                    nwjVar = nwjVarI;
                    nwjVar2 = nwjVar;
                }
            }
            return aoluVar;
        }
        if (i2 == 1) {
            aooc.af(objB);
            return objB;
        }
        if (i2 == 2) {
            nwjVar = nonVar.f;
            nwjVar2 = nonVar.e;
            nwjVarI = nonVar.d;
            aooc.af(objB);
        } else {
            if (i2 == 3) {
                nwjVar5 = nonVar.f;
                nwjVar6 = nonVar.e;
                nwjVar7 = nonVar.d;
                aooc.af(objB);
                nwjVar5.r((defpackage.ntd) objB);
                aimw aimwVarL2 = b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates$<anonymous>", 125, "DobbySettingsMainFragmentDataSource.kt");
                ntdVar = ((akzx) nwjVar6.a).b.f;
                if (ntdVar == null) {
                    ntdVar = defpackage.ntd.a;
                }
                aooh.e(ntdVar, "getTtsStatus(...)");
                ntcVarB = defpackage.ntc.b(ntdVar.d);
                if (ntcVarB == null) {
                    ntcVarB = defpackage.ntc.UNRECOGNIZED;
                }
                aimwVarL2.y("fetched TTS status: %s", ntcVarB);
                nwjVar3 = nwjVar6;
                nwjVar4 = nwjVar7;
                if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                    ysb ysbVar = this.g;
                    yse yseVar = yse.i;
                    nonVar.d = nwjVar4;
                    nonVar.e = nwjVar3;
                    nonVar.f = nwjVar3;
                    nonVar.c = 4;
                    objB = ysbVar.a(yseVar, nonVar);
                    if (objB != aoluVar) {
                        nwjVar8 = nwjVar3;
                        nwjVar3.o(mni.B((ysc) objB));
                        nwjVar3 = nwjVar8;
                        nonVar.d = nwjVar4;
                        nonVar.e = nwjVar3;
                        nonVar.f = nwjVar3;
                        nonVar.c = 5;
                        objB = h(nonVar);
                        if (objB != aoluVar) {
                            nwjVar9 = nwjVar3;
                            nwjVar10 = nwjVar9;
                            nwjVar11 = nwjVar4;
                        }
                    }
                } else {
                    nonVar.d = nwjVar4;
                    nonVar.e = nwjVar3;
                    nonVar.f = nwjVar3;
                    nonVar.c = 5;
                    objB = h(nonVar);
                    if (objB != aoluVar) {
                        nwjVar9 = nwjVar3;
                        nwjVar10 = nwjVar9;
                        nwjVar11 = nwjVar4;
                    }
                }
                return aoluVar;
            }
            if (i2 == 4) {
                nwjVar3 = nonVar.f;
                nwjVar8 = nonVar.e;
                nwjVar4 = nonVar.d;
                aooc.af(objB);
                nwjVar3.o(mni.B((ysc) objB));
                nwjVar3 = nwjVar8;
                nonVar.d = nwjVar4;
                nonVar.e = nwjVar3;
                nonVar.f = nwjVar3;
                nonVar.c = 5;
                objB = h(nonVar);
                if (objB != aoluVar) {
                    nwjVar9 = nwjVar3;
                    nwjVar10 = nwjVar9;
                    nwjVar11 = nwjVar4;
                }
                return aoluVar;
            }
            if (i2 != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nwjVar9 = nonVar.f;
            nwjVar10 = nonVar.e;
            nwjVar11 = nonVar.d;
            aooc.af(objB);
        }
        nwjVar9.n((defpackage.igp) objB);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        nwjVar10.p(aooc.au(instantNow));
        nog nogVarM = nwjVar11.m();
        b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates", 138, "DobbySettingsMainFragmentDataSource.kt").y("external cached states: %s", nogVarM);
        return nogVarM;
        nwjVar.q((tyz) objB);
        if (((java.lang.Boolean) this.e.a()).booleanValue()) {
            vaa vaaVar = this.i;
            java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag((java.lang.String) this.d.j.a());
            aooh.e(localeForLanguageTag, "forLanguageTag(...)");
            nonVar.d = nwjVarI;
            nonVar.e = nwjVar2;
            nonVar.f = nwjVar2;
            nonVar.c = 3;
            objB = vaaVar.i(localeForLanguageTag, nonVar);
            if (objB != aoluVar) {
                nwjVar5 = nwjVar2;
                nwjVar6 = nwjVar5;
                nwjVar7 = nwjVarI;
                nwjVar5.r((defpackage.ntd) objB);
                aimw aimwVarL3 = b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates$<anonymous>", 125, "DobbySettingsMainFragmentDataSource.kt");
                ntdVar = ((akzx) nwjVar6.a).b.f;
                if (ntdVar == null) {
                    ntdVar = defpackage.ntd.a;
                }
                aooh.e(ntdVar, "getTtsStatus(...)");
                ntcVarB = defpackage.ntc.b(ntdVar.d);
                if (ntcVarB == null) {
                    ntcVarB = defpackage.ntc.UNRECOGNIZED;
                }
                aimwVarL3.y("fetched TTS status: %s", ntcVarB);
                nwjVar3 = nwjVar6;
                nwjVar4 = nwjVar7;
                if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                    ysb ysbVar2 = this.g;
                    yse yseVar2 = yse.i;
                    nonVar.d = nwjVar4;
                    nonVar.e = nwjVar3;
                    nonVar.f = nwjVar3;
                    nonVar.c = 4;
                    objB = ysbVar2.a(yseVar2, nonVar);
                    if (objB != aoluVar) {
                        nwjVar8 = nwjVar3;
                        nwjVar3.o(mni.B((ysc) objB));
                        nwjVar3 = nwjVar8;
                        nonVar.d = nwjVar4;
                        nonVar.e = nwjVar3;
                        nonVar.f = nwjVar3;
                        nonVar.c = 5;
                        objB = h(nonVar);
                        if (objB != aoluVar) {
                            nwjVar9 = nwjVar3;
                            nwjVar10 = nwjVar9;
                            nwjVar11 = nwjVar4;
                            nwjVar9.n((defpackage.igp) objB);
                            j$.time.Instant instantNow2 = j$.time.Instant.now();
                            aooh.e(instantNow2, "instant(...)");
                            nwjVar10.p(aooc.au(instantNow2));
                            nog nogVarM2 = nwjVar11.m();
                            b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates", 138, "DobbySettingsMainFragmentDataSource.kt").y("external cached states: %s", nogVarM2);
                            return nogVarM2;
                        }
                    }
                } else {
                    nonVar.d = nwjVar4;
                    nonVar.e = nwjVar3;
                    nonVar.f = nwjVar3;
                    nonVar.c = 5;
                    objB = h(nonVar);
                    if (objB != aoluVar) {
                        nwjVar9 = nwjVar3;
                        nwjVar10 = nwjVar9;
                        nwjVar11 = nwjVar4;
                        nwjVar9.n((defpackage.igp) objB);
                        j$.time.Instant instantNow3 = j$.time.Instant.now();
                        aooh.e(instantNow3, "instant(...)");
                        nwjVar10.p(aooc.au(instantNow3));
                        nog nogVarM3 = nwjVar11.m();
                        b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates", 138, "DobbySettingsMainFragmentDataSource.kt").y("external cached states: %s", nogVarM3);
                        return nogVarM3;
                    }
                }
            }
        } else {
            nwjVar3 = nwjVar2;
            nwjVar4 = nwjVarI;
            if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                ysb ysbVar3 = this.g;
                yse yseVar3 = yse.i;
                nonVar.d = nwjVar4;
                nonVar.e = nwjVar3;
                nonVar.f = nwjVar3;
                nonVar.c = 4;
                objB = ysbVar3.a(yseVar3, nonVar);
                if (objB != aoluVar) {
                    nwjVar8 = nwjVar3;
                    nwjVar3.o(mni.B((ysc) objB));
                    nwjVar3 = nwjVar8;
                    nonVar.d = nwjVar4;
                    nonVar.e = nwjVar3;
                    nonVar.f = nwjVar3;
                    nonVar.c = 5;
                    objB = h(nonVar);
                    if (objB != aoluVar) {
                        nwjVar9 = nwjVar3;
                        nwjVar10 = nwjVar9;
                        nwjVar11 = nwjVar4;
                        nwjVar9.n((defpackage.igp) objB);
                        j$.time.Instant instantNow4 = j$.time.Instant.now();
                        aooh.e(instantNow4, "instant(...)");
                        nwjVar10.p(aooc.au(instantNow4));
                        nog nogVarM4 = nwjVar11.m();
                        b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates", 138, "DobbySettingsMainFragmentDataSource.kt").y("external cached states: %s", nogVarM4);
                        return nogVarM4;
                    }
                }
            } else {
                nonVar.d = nwjVar4;
                nonVar.e = nwjVar3;
                nonVar.f = nwjVar3;
                nonVar.c = 5;
                objB = h(nonVar);
                if (objB != aoluVar) {
                    nwjVar9 = nwjVar3;
                    nwjVar10 = nwjVar9;
                    nwjVar11 = nwjVar4;
                    nwjVar9.n((defpackage.igp) objB);
                    j$.time.Instant instantNow5 = j$.time.Instant.now();
                    aooh.e(instantNow5, "instant(...)");
                    nwjVar10.p(aooc.au(instantNow5));
                    nog nogVarM5 = nwjVar11.m();
                    b.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchCachedExternalStates", 138, "DobbySettingsMainFragmentDataSource.kt").y("external cached states: %s", nogVarM5);
                    return nogVarM5;
                }
            }
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(java.util.Locale locale, aoln aolnVar) {
        defpackage.nop nopVar;
        long millis;
        if (aolnVar instanceof defpackage.nop) {
            nopVar = (defpackage.nop) aolnVar;
            int i = nopVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nopVar.c = i - Integer.MIN_VALUE;
            } else {
                nopVar = new defpackage.nop(this, aolnVar);
            }
        } else {
            nopVar = new defpackage.nop(this, aolnVar);
        }
        java.lang.Object objM = nopVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nopVar.c;
        if (i2 == 0) {
            aooc.af(objM);
            j$.time.Duration duration = k;
            defpackage.nea neaVar = new defpackage.nea(this, locale, (aoln) null, 16);
            nopVar.d = locale;
            nopVar.c = 1;
            if (duration.compareTo(j$.time.Duration.ZERO) <= 0) {
                millis = 0;
            } else if (duration.compareTo(j$.time.temporal.ChronoUnit.MILLIS.getDuration()) <= 0) {
                millis = 1;
            } else if (duration.getSeconds() >= 9223372036854775L) {
                millis = Long.MAX_VALUE;
                if (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000) {
                    millis = duration.toMillis();
                }
            } else {
                millis = duration.toMillis();
            }
            objM = aooh.M(millis, neaVar, nopVar);
            if (objM == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locale = nopVar.d;
            aooc.af(objM);
        }
        defpackage.ntd ntdVar = (defpackage.ntd) objM;
        aimz aimzVar = b;
        if (ntdVar != null) {
            aimw aimwVarL = aimzVar.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchTtsStatusWithTimeout", 197, "DobbySettingsMainFragmentDataSource.kt");
            defpackage.ntc ntcVarB = defpackage.ntc.b(ntdVar.d);
            if (ntcVarB == null) {
                ntcVarB = defpackage.ntc.UNRECOGNIZED;
            }
            aimwVarL.y("fetched TTS status: %s", ntcVarB);
            return ntdVar;
        }
        aimzVar.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsMainFragmentDataSource", "fetchTtsStatusWithTimeout", 191, "DobbySettingsMainFragmentDataSource.kt").y("TTS status check timed out after %s, treating as unavailable", k);
        defpackage.nwj nwjVarAl = mni.al(defpackage.ntd.a.m());
        java.lang.String languageTag = locale.toLanguageTag();
        aooh.e(languageTag, "toLanguageTag(...)");
        nwjVarAl.g(languageTag);
        nwjVarAl.i(defpackage.ntc.UNAVAILABLE);
        return nwjVarAl.f();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.noq noqVar;
        ils ilsVar;
        if (aolnVar instanceof defpackage.noq) {
            noqVar = (defpackage.noq) aolnVar;
            int i = noqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                noqVar.c = i - Integer.MIN_VALUE;
            } else {
                noqVar = new defpackage.noq(this, aolnVar);
            }
        } else {
            noqVar = new defpackage.noq(this, aolnVar);
        }
        java.lang.Object obj = noqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = noqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ils ilsVar2 = this.u;
            mns mnsVar = this.o;
            noqVar.d = ilsVar2;
            noqVar.c = 1;
            java.lang.Object objA = mnsVar.a(noqVar);
            if (objA != aoluVar) {
                obj = objA;
                ilsVar = ilsVar2;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return obj;
        }
        ilsVar = noqVar.d;
        aooc.af(obj);
        igs igsVar = ((igf) obj).f;
        if (igsVar == null) {
            igsVar = igs.a;
        }
        aooh.e(igsVar, "getCompositeModelConfig(...)");
        noqVar.d = null;
        noqVar.c = 2;
        java.lang.Object objC = ilsVar.c(igsVar, noqVar);
        if (objC != aoluVar) {
            return objC;
        }
        return aoluVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        if (aooh.n(r2.c, r10.d.j.a()) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(aoln r11) throws aois {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.not.i(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(nog nogVar, aoln aolnVar) {
        defpackage.nos nosVar;
        defpackage.nwj nwjVarI;
        nnx nnxVar;
        defpackage.nwj nwjVar;
        defpackage.nwj nwjVar2;
        if (aolnVar instanceof defpackage.nos) {
            nosVar = (defpackage.nos) aolnVar;
            int i = nosVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nosVar.c = i - Integer.MIN_VALUE;
            } else {
                nosVar = new defpackage.nos(this, aolnVar);
            }
        } else {
            nosVar = new defpackage.nos(this, aolnVar);
        }
        java.lang.Object obj = nosVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nosVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                nnxVar = nosVar.d;
                nwjVarI = nosVar.g;
                nwjVar = nosVar.f;
                nwjVar2 = nosVar.e;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        nnx nnxVar2 = this.n;
        nwjVarI = mni.I(nogVar.p());
        nosVar.e = nwjVarI;
        nosVar.f = nwjVarI;
        nosVar.g = nwjVarI;
        nosVar.d = nnxVar2;
        nosVar.c = 1;
        java.lang.Object objH = h(nosVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        obj = objH;
        nnxVar = nnxVar2;
        nwjVar = nwjVarI;
        nwjVar2 = nwjVar;
        nwjVarI.n((defpackage.igp) obj);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        nwjVar.p(aooc.au(instantNow));
        nog nogVarM = nwjVar2.m();
        nosVar.e = null;
        nosVar.f = null;
        nosVar.g = null;
        nosVar.d = null;
        nosVar.c = 2;
        if (nnxVar.e(nogVarM, nosVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }
}
