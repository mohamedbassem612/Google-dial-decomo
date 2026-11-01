package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nfo {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyPreconditions");
    private final ysb A;
    private final defpackage.ogj B;
    private final zjm C;
    private final kaw D;
    private final tpf E;
    private final afpl F;
    public final android.content.Context b;
    public final defpackage.mzp c;
    public final android.app.AppOpsManager d;
    public final rsr e;
    private final aoin f;
    private final aoin g;
    private final aolr h;
    private final aolr i;
    private final aoss j;
    private final java.lang.String k;
    private final defpackage.ihr l;
    private final oko m;
    private final mtd n;
    private final zrw o;
    private final zjl p;
    private final aoin q;
    private final defpackage.mqt r;
    private final defpackage.mba s;
    private final aoin t;
    private final aoin u;
    private final long v;
    private java.lang.Integer w;
    private java.lang.Integer x;
    private java.lang.Integer y;
    private final zpm z;

    public nfo(android.content.Context context, aoin aoinVar, aoin aoinVar2, aolr aolrVar, aolr aolrVar2, aoss aossVar, java.lang.String str, defpackage.ihr ihrVar, defpackage.mzp mzpVar, zpm zpmVar, oko okoVar, mtd mtdVar, afpl afplVar, zrw zrwVar, zjl zjlVar, ysb ysbVar, aoin aoinVar3, zjm zjmVar, defpackage.mqt mqtVar, defpackage.mba mbaVar, defpackage.ogj ogjVar, rsr rsrVar, aoin aoinVar4, tpf tpfVar, aoin aoinVar5, kaw kawVar, long j) {
        aooh.f(context, "appContext");
        aooh.f(aoinVar, "disableDobbyOnFiOttWifiCalling");
        aooh.f(aoinVar2, "enableCheckMicAccessBugfixV2");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aolrVar2, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(str, "callIdString");
        aooh.f(ihrVar, "audioPrismSession");
        aooh.f(mzpVar, "callScopedAudioPrismConfigProvider");
        aooh.f(zpmVar, "callScopes");
        aooh.f(mtdVar, "dobbyLatestVoteStorage");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(ysbVar, "aiCoreAvailability");
        aooh.f(aoinVar3, "enableAgenticCallScreen");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(aoinVar4, "useGeminiRunner");
        aooh.f(tpfVar, "dobbyUseCaseRunnerCoordinator");
        aooh.f(aoinVar5, "useCoroutinesLaunch");
        aooh.f(kawVar, "hasAnotherActiveCallCache");
        this.b = context;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = aolrVar;
        this.i = aolrVar2;
        this.j = aossVar;
        this.k = str;
        this.l = ihrVar;
        this.c = mzpVar;
        this.z = zpmVar;
        this.m = okoVar;
        this.n = mtdVar;
        this.F = afplVar;
        this.o = zrwVar;
        this.p = zjlVar;
        this.A = ysbVar;
        this.q = aoinVar3;
        this.C = zjmVar;
        this.r = mqtVar;
        this.s = mbaVar;
        this.B = ogjVar;
        this.e = rsrVar;
        this.t = aoinVar4;
        this.E = tpfVar;
        this.u = aoinVar5;
        this.D = kawVar;
        this.v = j;
        java.lang.Object systemService = context.getSystemService("appops");
        aooh.d(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
        this.d = (android.app.AppOpsManager) systemService;
    }

    private final boolean k(defpackage.nje njeVar) {
        int iOrdinal = njeVar.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            return false;
        }
        java.lang.Object objA = this.q.a();
        aooh.e(objA, "get(...)");
        return ((java.lang.Boolean) objA).booleanValue();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:57:0x011a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0149  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object a(defpackage.nje njeVar, aoln aolnVar) throws aois {
        defpackage.nfe nfeVar;
        defpackage.nje njeVar2;
        defpackage.nfc nfcVar;
        defpackage.nfc nfcVar2;
        defpackage.mqt mqtVar;
        defpackage.nvp nvpVar;
        defpackage.nfc nfcVar3;
        defpackage.nfc nfcVar4;
        defpackage.nms nmsVar;
        defpackage.nfc nfcVar5;
        defpackage.nfc nfcVar6;
        defpackage.mqt mqtVar2;
        defpackage.nfb nfbVarB;
        defpackage.nje njeVar3;
        defpackage.nfb nfbVarB2;
        aoss aossVar;
        defpackage.nea neaVar;
        if (aolnVar instanceof defpackage.nfe) {
            nfeVar = (defpackage.nfe) aolnVar;
            int i = nfeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfeVar.d = i - Integer.MIN_VALUE;
            } else {
                nfeVar = new defpackage.nfe(this, aolnVar);
            }
        } else {
            nfeVar = new defpackage.nfe(this, aolnVar);
        }
        java.lang.Object objB = nfeVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nfeVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                njeVar = (defpackage.nje) nfeVar.a;
                aooc.af(objB);
            } else if (i2 == 2) {
                nfcVar = nfeVar.e;
                njeVar2 = (defpackage.nje) nfeVar.a;
                aooc.af(objB);
                nfcVar2 = (defpackage.nfc) objB;
                if (nfcVar.c || !nfcVar2.c) {
                    mqtVar = this.r;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_PRECONDITIONS_NOT_MET;
                    nfeVar.a = njeVar2;
                    nfeVar.e = nfcVar;
                    nfeVar.f = nfcVar2;
                    nfeVar.d = 3;
                    if (mqtVar.x(nvpVar, nfeVar) != aoluVar) {
                        return aoluVar;
                    }
                    nfcVar3 = nfcVar;
                    nfcVar4 = nfcVar2;
                    mqtVar2 = this.r;
                    if (nfcVar3.c) {
                        nfbVarB = defpackage.nfb.b(nfcVar4.d);
                        if (nfbVarB == null) {
                            nfbVarB = defpackage.nfb.UNRECOGNIZED;
                        }
                    } else {
                        nfbVarB = defpackage.nfb.b(nfcVar3.d);
                        if (nfbVarB == null) {
                            nfbVarB = defpackage.nfb.UNRECOGNIZED;
                        }
                    }
                    nfeVar.a = njeVar2;
                    nfeVar.e = nfcVar3;
                    nfeVar.f = nfcVar4;
                    nfeVar.d = 4;
                    if (mqtVar2.m(nfbVarB, nfeVar) == aoluVar) {
                        return aoluVar;
                    }
                    nfcVar5 = nfcVar3;
                    njeVar3 = njeVar2;
                    this.s.b(mce.cO);
                    nfbVarB2 = defpackage.nfb.b(nfcVar5.d);
                    if (nfbVarB2 == null) {
                        nfbVarB2 = defpackage.nfb.UNRECOGNIZED;
                    }
                    if (nfbVarB2 == defpackage.nfb.REASON_GACS_AUDIOPRISM_MODEL_MISSING) {
                        aossVar = this.j;
                        neaVar = new defpackage.nea(this, njeVar3, (aoln) null, 2);
                        if (((java.lang.Boolean) this.u.a()).booleanValue()) {
                            aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(neaVar, (aoln) null, 19, (short[][]) null), 3);
                        } else {
                            aimz aimzVar = zih.a;
                            aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, neaVar, 18, (char[][]) null));
                        }
                    }
                    nfcVar6 = nfcVar4;
                } else {
                    int iOrdinal = njeVar2.ordinal();
                    if (iOrdinal == 0) {
                        nmsVar = defpackage.nms.CASE_MANUAL_SCREENING;
                    } else if (iOrdinal == 1) {
                        nmsVar = defpackage.nms.CASE_AUTO_SCREENING;
                    } else if (iOrdinal == 2) {
                        nmsVar = defpackage.nms.CASE_BAM;
                    } else if (iOrdinal == 3) {
                        nmsVar = defpackage.nms.CASE_BEESLY;
                    } else {
                        if (iOrdinal != 4) {
                            throw new aois();
                        }
                        nmsVar = defpackage.nms.CASE_CALL_SCREEN_LITE;
                    }
                    nfeVar.a = nfcVar;
                    nfeVar.e = nfcVar2;
                    nfeVar.d = 5;
                    defpackage.ogj ogjVar = this.B;
                    defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                    defpackage.nwj nwjVarM = mni.M(defpackage.nmc.a.m());
                    nwjVarM.z(nmsVar);
                    npwVarAB.K(nwjVarM.y());
                    java.lang.Object objB2 = ogjVar.b(npwVarAB.D(), nfeVar);
                    if (objB2 != aoluVar) {
                        objB2 = aojh.a;
                    }
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                    nfcVar5 = nfcVar;
                    nfcVar6 = nfcVar2;
                }
            } else if (i2 == 3) {
                nfcVar4 = nfeVar.f;
                defpackage.nfc nfcVar7 = nfeVar.e;
                defpackage.nje njeVar4 = (defpackage.nje) nfeVar.a;
                aooc.af(objB);
                nfcVar3 = nfcVar7;
                njeVar2 = njeVar4;
                mqtVar2 = this.r;
                if (nfcVar3.c) {
                    nfbVarB = defpackage.nfb.b(nfcVar3.d);
                    if (nfbVarB == null) {
                        nfbVarB = defpackage.nfb.UNRECOGNIZED;
                    }
                } else {
                    nfbVarB = defpackage.nfb.b(nfcVar4.d);
                    if (nfbVarB == null) {
                        nfbVarB = defpackage.nfb.UNRECOGNIZED;
                    }
                }
                nfeVar.a = njeVar2;
                nfeVar.e = nfcVar3;
                nfeVar.f = nfcVar4;
                nfeVar.d = 4;
                if (mqtVar2.m(nfbVarB, nfeVar) == aoluVar) {
                    return aoluVar;
                }
                nfcVar5 = nfcVar3;
                njeVar3 = njeVar2;
                this.s.b(mce.cO);
                nfbVarB2 = defpackage.nfb.b(nfcVar5.d);
                if (nfbVarB2 == null) {
                    nfbVarB2 = defpackage.nfb.UNRECOGNIZED;
                }
                if (nfbVarB2 == defpackage.nfb.REASON_GACS_AUDIOPRISM_MODEL_MISSING) {
                    aossVar = this.j;
                    neaVar = new defpackage.nea(this, njeVar3, (aoln) null, 2);
                    if (((java.lang.Boolean) this.u.a()).booleanValue()) {
                        aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(neaVar, (aoln) null, 19, (short[][]) null), 3);
                    } else {
                        aimz aimzVar2 = zih.a;
                        aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, neaVar, 18, (char[][]) null));
                    }
                }
                nfcVar6 = nfcVar4;
            } else if (i2 == 4) {
                nfcVar4 = nfeVar.f;
                nfcVar5 = nfeVar.e;
                njeVar3 = (defpackage.nje) nfeVar.a;
                aooc.af(objB);
                this.s.b(mce.cO);
                nfbVarB2 = defpackage.nfb.b(nfcVar5.d);
                if (nfbVarB2 == null) {
                    nfbVarB2 = defpackage.nfb.UNRECOGNIZED;
                }
                if (nfbVarB2 == defpackage.nfb.REASON_GACS_AUDIOPRISM_MODEL_MISSING) {
                    aossVar = this.j;
                    neaVar = new defpackage.nea(this, njeVar3, (aoln) null, 2);
                    if (((java.lang.Boolean) this.u.a()).booleanValue()) {
                        aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(neaVar, (aoln) null, 19, (short[][]) null), 3);
                    } else {
                        aimz aimzVar3 = zih.a;
                        aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, neaVar, 18, (char[][]) null));
                    }
                }
                nfcVar6 = nfcVar4;
            } else {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nfcVar6 = nfeVar.e;
                defpackage.nfc nfcVar8 = (defpackage.nfc) nfeVar.a;
                aooc.af(objB);
                nfcVar5 = nfcVar8;
            }
            if (nfcVar5.c) {
                return nfcVar6;
            }
            return nfcVar5;
        }
        aooc.af(objB);
        nfeVar.a = njeVar;
        nfeVar.d = 1;
        objB = b(njeVar, nfeVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.nfc nfcVar9 = (defpackage.nfc) objB;
        nfeVar.a = njeVar;
        nfeVar.e = nfcVar9;
        nfeVar.d = 2;
        java.lang.Object objD = d(njeVar, nfeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        njeVar2 = njeVar;
        nfcVar = nfcVar9;
        objB = objD;
        nfcVar2 = (defpackage.nfc) objB;
        if (nfcVar.c) {
        }
        mqtVar = this.r;
        nvpVar = defpackage.nvp.EVENT_DOBBY_PRECONDITIONS_NOT_MET;
        nfeVar.a = njeVar2;
        nfeVar.e = nfcVar;
        nfeVar.f = nfcVar2;
        nfeVar.d = 3;
        if (mqtVar.x(nvpVar, nfeVar) != aoluVar) {
            return aoluVar;
        }
        nfcVar3 = nfcVar;
        nfcVar4 = nfcVar2;
        mqtVar2 = this.r;
        if (nfcVar3.c) {
            nfbVarB = defpackage.nfb.b(nfcVar3.d);
            if (nfbVarB == null) {
                nfbVarB = defpackage.nfb.UNRECOGNIZED;
            }
        } else {
            nfbVarB = defpackage.nfb.b(nfcVar4.d);
            if (nfbVarB == null) {
                nfbVarB = defpackage.nfb.UNRECOGNIZED;
            }
        }
        nfeVar.a = njeVar2;
        nfeVar.e = nfcVar3;
        nfeVar.f = nfcVar4;
        nfeVar.d = 4;
        if (mqtVar2.m(nfbVarB, nfeVar) == aoluVar) {
            return aoluVar;
        }
        nfcVar5 = nfcVar3;
        njeVar3 = njeVar2;
        this.s.b(mce.cO);
        nfbVarB2 = defpackage.nfb.b(nfcVar5.d);
        if (nfbVarB2 == null) {
            nfbVarB2 = defpackage.nfb.UNRECOGNIZED;
        }
        if (nfbVarB2 == defpackage.nfb.REASON_GACS_AUDIOPRISM_MODEL_MISSING) {
            aossVar = this.j;
            neaVar = new defpackage.nea(this, njeVar3, (aoln) null, 2);
            if (((java.lang.Boolean) this.u.a()).booleanValue()) {
                aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(neaVar, (aoln) null, 19, (short[][]) null), 3);
            } else {
                aimz aimzVar4 = zih.a;
                aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, neaVar, 18, (char[][]) null));
            }
        }
        nfcVar6 = nfcVar4;
        if (nfcVar5.c) {
            return nfcVar6;
        }
        return nfcVar5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:100:0x03be  */
    /* JADX WARN: Code duplicated, block: B:101:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:104:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x0401  */
    /* JADX WARN: Code duplicated, block: B:110:0x0411  */
    /* JADX WARN: Code duplicated, block: B:113:0x041b  */
    /* JADX WARN: Code duplicated, block: B:114:0x041d  */
    /* JADX WARN: Code duplicated, block: B:115:0x041f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0423  */
    /* JADX WARN: Code duplicated, block: B:119:0x044d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0451  */
    /* JADX WARN: Code duplicated, block: B:125:0x046b  */
    /* JADX WARN: Code duplicated, block: B:131:0x04af  */
    /* JADX WARN: Code duplicated, block: B:133:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:139:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x051f A[PHI: r4 r5 r6
      0x051f: PHI (r4v31 ??) = (r4v47 ??), (r4v48 ??) binds: [B:134:0x04db, B:138:0x04f3] A[DONT_GENERATE, DONT_INLINE]
      0x051f: PHI (r5v14 aoot) = (r5v12 aoot), (r5v15 aoot) binds: [B:134:0x04db, B:138:0x04f3] A[DONT_GENERATE, DONT_INLINE]
      0x051f: PHI (r6v13 nje) = (r6v11 nje), (r6v14 nje) binds: [B:134:0x04db, B:138:0x04f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x0525  */
    /* JADX WARN: Code duplicated, block: B:147:0x0541  */
    /* JADX WARN: Code duplicated, block: B:153:0x0583  */
    /* JADX WARN: Code duplicated, block: B:155:0x0594  */
    /* JADX WARN: Code duplicated, block: B:157:0x059e  */
    /* JADX WARN: Code duplicated, block: B:160:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:163:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:165:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:167:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:169:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:172:0x05da  */
    /* JADX WARN: Code duplicated, block: B:173:0x0602  */
    /* JADX WARN: Code duplicated, block: B:175:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:? A[LOOP:0: B:36:0x013b->B:177:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    /* JADX WARN: Code duplicated, block: B:38:0x0141  */
    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0166  */
    /* JADX WARN: Code duplicated, block: B:49:0x018e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x0214  */
    /* JADX WARN: Code duplicated, block: B:65:0x022f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0259  */
    /* JADX WARN: Code duplicated, block: B:71:0x0277  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x0328  */
    /* JADX WARN: Code duplicated, block: B:87:0x033a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0344  */
    /* JADX WARN: Code duplicated, block: B:92:0x036e  */
    /* JADX WARN: Code duplicated, block: B:94:0x037e  */
    /* JADX WARN: Code duplicated, block: B:96:0x03a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [nfo] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, nfd] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, nfd] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, nfd] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v37, types: [nfd] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, nfd] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, nfd] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, nfd] */
    public final java.lang.Object b(defpackage.nje njeVar, aoln aolnVar) throws aois {
        defpackage.nff nffVar;
        aoot aootVar;
        defpackage.nje njeVar2;
        defpackage.nfd nfdVar;
        aihd aihdVarB;
        java.util.Iterator it;
        boolean z;
        java.lang.Boolean boolValueOf;
        defpackage.nje njeVar3;
        aoot aootVar2;
        ?? r4;
        ?? r5;
        ?? r6;
        ?? r7;
        ?? r8;
        ?? r9;
        ?? r10;
        aoot aootVar3;
        defpackage.nje njeVar4;
        ?? r11;
        ?? r12;
        defpackage.mta mtaVar;
        defpackage.msz mszVar;
        defpackage.irl irlVar;
        boolean z2;
        defpackage.nje njeVar5;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r18;
        ?? r19;
        ?? r20;
        ?? r21;
        ?? r22;
        defpackage.igi igiVar;
        defpackage.nje njeVar6;
        defpackage.npw npwVarO;
        java.lang.Object obj;
        defpackage.igh ighVarB;
        defpackage.nfb nfbVar;
        boolean zBooleanValue;
        aimz aimzVar;
        if (aolnVar instanceof defpackage.nff) {
            nffVar = (defpackage.nff) aolnVar;
            int i = nffVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nffVar.d = i - Integer.MIN_VALUE;
            } else {
                nffVar = new defpackage.nff(this, aolnVar);
            }
        } else {
            nffVar = new defpackage.nff(this, aolnVar);
        }
        java.lang.Object objD = nffVar.b;
        java.lang.Boolean bool = aolu.a;
        switch (nffVar.d) {
            case 0:
                aooc.af(objD);
                aootVar = new aoot();
                ajcq ajcqVarX = this.F.X();
                njeVar2 = njeVar;
                nffVar.e = njeVar2;
                nffVar.f = aootVar;
                nffVar.d = 1;
                objD = aosv.D(ajcqVarX, nffVar);
                if (objD == bool) {
                    return bool;
                }
                java.lang.Object objAr = aooc.ar(objD, defpackage.nfd.class);
                aooh.e(objAr, "get(...)");
                nfdVar = (defpackage.nfd) objAr;
                nffVar.e = njeVar2;
                nffVar.f = aootVar;
                nffVar.a = nfdVar;
                nffVar.d = 2;
                aihdVarB = this.z.b(zpo.f);
                aooh.e(aihdVarB, "getCallScopesWithState(...)");
                if ((aihdVarB instanceof java.util.Collection) || !aihdVarB.isEmpty()) {
                    it = aihdVarB.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                        } else if (!aooh.n(((apqr) it.next()).b, this.k)) {
                            z = true;
                        }
                    }
                } else {
                    z = false;
                }
                boolValueOf = java.lang.Boolean.valueOf(z);
                if (boolValueOf != bool) {
                    return bool;
                }
                njeVar3 = njeVar2;
                aootVar2 = aootVar;
                r4 = nfdVar;
                objD = boolValueOf;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 157, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO2 = mni.O(defpackage.nfc.a.m());
                    npwVarO2.S(false);
                    npwVarO2.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO2.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r4;
                nffVar.d = 3;
                objD = j(r4, nffVar);
                if (objD == bool) {
                    r5 = r4;
                    return bool;
                }
                r5 = r4;
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 164, "DobbyPreconditions.kt").v("call is not in a valid call state, not allowing Dobby to start");
                    defpackage.npw npwVarO3 = mni.O(defpackage.nfc.a.m());
                    npwVarO3.S(false);
                    npwVarO3.R(defpackage.nfb.REASON_INVALID_CALL_STATE);
                    return npwVarO3.Q();
                }
                ajcq ajcqVarAS = r5.aS();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r5;
                nffVar.d = 4;
                objD = aosv.D(ajcqVarAS, nffVar);
                if (objD == bool) {
                    r6 = r5;
                    return bool;
                }
                r6 = r5;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 171, "DobbyPreconditions.kt").v("call is a video call, not allowing Dobby to start");
                    defpackage.npw npwVarO4 = mni.O(defpackage.nfc.a.m());
                    npwVarO4.S(false);
                    npwVarO4.R(defpackage.nfb.REASON_VIDEO_CALL);
                    return npwVarO4.Q();
                }
                ajcq ajcqVarAM = r6.aM();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r6;
                nffVar.d = 5;
                objD = aosv.D(ajcqVarAM, nffVar);
                if (objD == bool) {
                    r7 = r6;
                    return bool;
                }
                r7 = r6;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 178, "DobbyPreconditions.kt").v("call is a RTT call, not allowing Dobby to start");
                    defpackage.npw npwVarO5 = mni.O(defpackage.nfc.a.m());
                    npwVarO5.S(false);
                    npwVarO5.R(defpackage.nfb.REASON_RTT_CALL);
                    return npwVarO5.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r7;
                nffVar.d = 6;
                objD = aoov.aj(this.i, new defpackage.mhq((defpackage.nfo) this, (aoln) null, 9, (byte[]) null), nffVar);
                if (objD == bool) {
                    r8 = r7;
                    return bool;
                }
                r8 = r7;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 185, "DobbyPreconditions.kt").v("TTY is enabled, not allowing Dobby to start");
                    defpackage.npw npwVarO6 = mni.O(defpackage.nfc.a.m());
                    npwVarO6.S(false);
                    npwVarO6.R(defpackage.nfb.REASON_TTY_ENABLED);
                    return npwVarO6.Q();
                }
                ajcq ajcqVarAG = r8.aG();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r8;
                nffVar.d = 7;
                objD = aosv.D(ajcqVarAG, nffVar);
                if (objD == bool) {
                    r9 = r8;
                    return bool;
                }
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO7 = mni.O(defpackage.nfc.a.m());
                    npwVarO7.S(false);
                    npwVarO7.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO7.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO8 = mni.O(defpackage.nfc.a.m());
                    npwVarO8.S(false);
                    npwVarO8.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO8.Q();
                }
                ajcq ajcqVarAC = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO9 = mni.O(defpackage.nfc.a.m());
                    npwVarO9.S(false);
                    npwVarO9.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO9.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO10 = mni.O(defpackage.nfc.a.m());
                    npwVarO10.S(false);
                    npwVarO10.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO10.Q();
                }
                mtd mtdVar = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO11 = mni.O(defpackage.nfc.a.m());
                    npwVarO11.S(false);
                    npwVarO11.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11.Q();
                }
                j$.util.Optional optionalG = this.C.g();
                aooh.e(optionalG, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO12 = mni.O(defpackage.nfc.a.m());
                    npwVarO12.S(false);
                    npwVarO12.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO12.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO13 = mni.O(defpackage.nfc.a.m());
                        npwVarO13.S(false);
                        npwVarO13.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO13.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO14 = mni.O(defpackage.nfc.a.m());
                    npwVarO14.S(false);
                    npwVarO14.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO14.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO15 = mni.O(defpackage.nfc.a.m());
                        npwVarO15.S(false);
                        npwVarO15.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO15.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar = this.A;
                        yse yseVar = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar.a(yseVar, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO16 = mni.O(defpackage.nfc.a.m());
                            npwVarO16.S(false);
                            npwVarO16.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO16.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar2 = this.A;
                        yse yseVar2 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar2.a(yseVar2, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO17 = mni.O(defpackage.nfc.a.m());
                            npwVarO17.S(false);
                            npwVarO17.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO17.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5) || ighVarB != defpackage.igh.FAILURE_MODELS_NOT_AVAILABLE) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_GACS_AUDIOPRISM_MODEL_MISSING;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO18 = mni.O(defpackage.nfc.a.m());
                    npwVarO18.S(true);
                    return npwVarO18.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO19 = mni.O(defpackage.nfc.a.m());
                npwVarO19.S(false);
                npwVarO19.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO19.Q();
            case 1:
                aootVar = nffVar.f;
                njeVar2 = nffVar.e;
                aooc.af(objD);
                java.lang.Object objAr2 = aooc.ar(objD, defpackage.nfd.class);
                aooh.e(objAr2, "get(...)");
                nfdVar = (defpackage.nfd) objAr2;
                nffVar.e = njeVar2;
                nffVar.f = aootVar;
                nffVar.a = nfdVar;
                nffVar.d = 2;
                aihdVarB = this.z.b(zpo.f);
                aooh.e(aihdVarB, "getCallScopesWithState(...)");
                if (aihdVarB instanceof java.util.Collection) {
                    it = aihdVarB.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                        } else if (!aooh.n(((apqr) it.next()).b, this.k)) {
                            z = true;
                        }
                    }
                } else {
                    it = aihdVarB.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                        } else if (!aooh.n(((apqr) it.next()).b, this.k)) {
                            z = true;
                        }
                    }
                }
                boolValueOf = java.lang.Boolean.valueOf(z);
                if (boolValueOf != bool) {
                    return bool;
                }
                njeVar3 = njeVar2;
                aootVar2 = aootVar;
                r4 = nfdVar;
                objD = boolValueOf;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 157, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO20 = mni.O(defpackage.nfc.a.m());
                    npwVarO20.S(false);
                    npwVarO20.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO20.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r4;
                nffVar.d = 3;
                objD = j(r4, nffVar);
                if (objD == bool) {
                    r5 = r4;
                    return bool;
                }
                r5 = r4;
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 164, "DobbyPreconditions.kt").v("call is not in a valid call state, not allowing Dobby to start");
                    defpackage.npw npwVarO21 = mni.O(defpackage.nfc.a.m());
                    npwVarO21.S(false);
                    npwVarO21.R(defpackage.nfb.REASON_INVALID_CALL_STATE);
                    return npwVarO21.Q();
                }
                ajcq ajcqVarAS2 = r5.aS();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r5;
                nffVar.d = 4;
                objD = aosv.D(ajcqVarAS2, nffVar);
                if (objD == bool) {
                    r6 = r5;
                    return bool;
                }
                r6 = r5;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 171, "DobbyPreconditions.kt").v("call is a video call, not allowing Dobby to start");
                    defpackage.npw npwVarO22 = mni.O(defpackage.nfc.a.m());
                    npwVarO22.S(false);
                    npwVarO22.R(defpackage.nfb.REASON_VIDEO_CALL);
                    return npwVarO22.Q();
                }
                ajcq ajcqVarAM2 = r6.aM();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r6;
                nffVar.d = 5;
                objD = aosv.D(ajcqVarAM2, nffVar);
                if (objD == bool) {
                    r7 = r6;
                    return bool;
                }
                r7 = r6;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 178, "DobbyPreconditions.kt").v("call is a RTT call, not allowing Dobby to start");
                    defpackage.npw npwVarO23 = mni.O(defpackage.nfc.a.m());
                    npwVarO23.S(false);
                    npwVarO23.R(defpackage.nfb.REASON_RTT_CALL);
                    return npwVarO23.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r7;
                nffVar.d = 6;
                objD = aoov.aj(this.i, new defpackage.mhq((defpackage.nfo) this, (aoln) null, 9, (byte[]) null), nffVar);
                if (objD == bool) {
                    r8 = r7;
                    return bool;
                }
                r8 = r7;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 185, "DobbyPreconditions.kt").v("TTY is enabled, not allowing Dobby to start");
                    defpackage.npw npwVarO24 = mni.O(defpackage.nfc.a.m());
                    npwVarO24.S(false);
                    npwVarO24.R(defpackage.nfb.REASON_TTY_ENABLED);
                    return npwVarO24.Q();
                }
                ajcq ajcqVarAG2 = r8.aG();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r8;
                nffVar.d = 7;
                objD = aosv.D(ajcqVarAG2, nffVar);
                if (objD == bool) {
                    r9 = r8;
                    return bool;
                }
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO25 = mni.O(defpackage.nfc.a.m());
                    npwVarO25.S(false);
                    npwVarO25.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO25.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO26 = mni.O(defpackage.nfc.a.m());
                    npwVarO26.S(false);
                    npwVarO26.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO26.Q();
                }
                ajcq ajcqVarAC2 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC2, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO27 = mni.O(defpackage.nfc.a.m());
                    npwVarO27.S(false);
                    npwVarO27.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO27.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO110 = mni.O(defpackage.nfc.a.m());
                    npwVarO110.S(false);
                    npwVarO110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO110.Q();
                }
                mtd mtdVar2 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar2.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO111 = mni.O(defpackage.nfc.a.m());
                    npwVarO111.S(false);
                    npwVarO111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111.Q();
                }
                j$.util.Optional optionalG2 = this.C.g();
                aooh.e(optionalG2, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG2);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO112 = mni.O(defpackage.nfc.a.m());
                    npwVarO112.S(false);
                    npwVarO112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar2 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar2.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO113 = mni.O(defpackage.nfc.a.m());
                        npwVarO113.S(false);
                        npwVarO113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar2 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar2.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO114 = mni.O(defpackage.nfc.a.m());
                    npwVarO114.S(false);
                    npwVarO114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO115 = mni.O(defpackage.nfc.a.m());
                        npwVarO115.S(false);
                        npwVarO115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar3 = this.A;
                        yse yseVar3 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar3.a(yseVar3, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO116 = mni.O(defpackage.nfc.a.m());
                            npwVarO116.S(false);
                            npwVarO116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar4 = this.A;
                        yse yseVar4 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar4.a(yseVar4, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO117 = mni.O(defpackage.nfc.a.m());
                            npwVarO117.S(false);
                            npwVarO117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO118 = mni.O(defpackage.nfc.a.m());
                    npwVarO118.S(true);
                    return npwVarO118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO119 = mni.O(defpackage.nfc.a.m());
                npwVarO119.S(false);
                npwVarO119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO119.Q();
            case 2:
                java.lang.Object obj2 = nffVar.a;
                aootVar2 = nffVar.f;
                njeVar3 = nffVar.e;
                aooc.af(objD);
                r4 = obj2;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 157, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO28 = mni.O(defpackage.nfc.a.m());
                    npwVarO28.S(false);
                    npwVarO28.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO28.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r4;
                nffVar.d = 3;
                objD = j(r4, nffVar);
                if (objD == bool) {
                    r5 = r4;
                    return bool;
                }
                r5 = r4;
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 164, "DobbyPreconditions.kt").v("call is not in a valid call state, not allowing Dobby to start");
                    defpackage.npw npwVarO29 = mni.O(defpackage.nfc.a.m());
                    npwVarO29.S(false);
                    npwVarO29.R(defpackage.nfb.REASON_INVALID_CALL_STATE);
                    return npwVarO29.Q();
                }
                ajcq ajcqVarAS3 = r5.aS();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r5;
                nffVar.d = 4;
                objD = aosv.D(ajcqVarAS3, nffVar);
                if (objD == bool) {
                    r6 = r5;
                    return bool;
                }
                r6 = r5;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 171, "DobbyPreconditions.kt").v("call is a video call, not allowing Dobby to start");
                    defpackage.npw npwVarO210 = mni.O(defpackage.nfc.a.m());
                    npwVarO210.S(false);
                    npwVarO210.R(defpackage.nfb.REASON_VIDEO_CALL);
                    return npwVarO210.Q();
                }
                ajcq ajcqVarAM3 = r6.aM();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r6;
                nffVar.d = 5;
                objD = aosv.D(ajcqVarAM3, nffVar);
                if (objD == bool) {
                    r7 = r6;
                    return bool;
                }
                r7 = r6;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 178, "DobbyPreconditions.kt").v("call is a RTT call, not allowing Dobby to start");
                    defpackage.npw npwVarO211 = mni.O(defpackage.nfc.a.m());
                    npwVarO211.S(false);
                    npwVarO211.R(defpackage.nfb.REASON_RTT_CALL);
                    return npwVarO211.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r7;
                nffVar.d = 6;
                objD = aoov.aj(this.i, new defpackage.mhq((defpackage.nfo) this, (aoln) null, 9, (byte[]) null), nffVar);
                if (objD == bool) {
                    r8 = r7;
                    return bool;
                }
                r8 = r7;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 185, "DobbyPreconditions.kt").v("TTY is enabled, not allowing Dobby to start");
                    defpackage.npw npwVarO212 = mni.O(defpackage.nfc.a.m());
                    npwVarO212.S(false);
                    npwVarO212.R(defpackage.nfb.REASON_TTY_ENABLED);
                    return npwVarO212.Q();
                }
                ajcq ajcqVarAG3 = r8.aG();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r8;
                nffVar.d = 7;
                objD = aosv.D(ajcqVarAG3, nffVar);
                if (objD == bool) {
                    r9 = r8;
                    return bool;
                }
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO213 = mni.O(defpackage.nfc.a.m());
                    npwVarO213.S(false);
                    npwVarO213.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO213.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO214 = mni.O(defpackage.nfc.a.m());
                    npwVarO214.S(false);
                    npwVarO214.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO214.Q();
                }
                ajcq ajcqVarAC3 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC3, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO215 = mni.O(defpackage.nfc.a.m());
                    npwVarO215.S(false);
                    npwVarO215.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO215.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO1110 = mni.O(defpackage.nfc.a.m());
                    npwVarO1110.S(false);
                    npwVarO1110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1110.Q();
                }
                mtd mtdVar3 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar3.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO1111 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111.S(false);
                    npwVarO1111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1111.Q();
                }
                j$.util.Optional optionalG3 = this.C.g();
                aooh.e(optionalG3, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG3);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO1112 = mni.O(defpackage.nfc.a.m());
                    npwVarO1112.S(false);
                    npwVarO1112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar3 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar3.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO1113 = mni.O(defpackage.nfc.a.m());
                        npwVarO1113.S(false);
                        npwVarO1113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO1113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar3 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar3.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO1114 = mni.O(defpackage.nfc.a.m());
                    npwVarO1114.S(false);
                    npwVarO1114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO1114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO1115 = mni.O(defpackage.nfc.a.m());
                        npwVarO1115.S(false);
                        npwVarO1115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO1115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar5 = this.A;
                        yse yseVar5 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar5.a(yseVar5, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1116 = mni.O(defpackage.nfc.a.m());
                            npwVarO1116.S(false);
                            npwVarO1116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar6 = this.A;
                        yse yseVar6 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar6.a(yseVar6, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1117 = mni.O(defpackage.nfc.a.m());
                            npwVarO1117.S(false);
                            npwVarO1117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO1118 = mni.O(defpackage.nfc.a.m());
                    npwVarO1118.S(true);
                    return npwVarO1118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO1119 = mni.O(defpackage.nfc.a.m());
                npwVarO1119.S(false);
                npwVarO1119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO1119.Q();
            case 3:
                java.lang.Object obj3 = nffVar.a;
                aootVar2 = nffVar.f;
                njeVar3 = nffVar.e;
                aooc.af(objD);
                r5 = obj3;
                r5 = r4;
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 164, "DobbyPreconditions.kt").v("call is not in a valid call state, not allowing Dobby to start");
                    defpackage.npw npwVarO216 = mni.O(defpackage.nfc.a.m());
                    npwVarO216.S(false);
                    npwVarO216.R(defpackage.nfb.REASON_INVALID_CALL_STATE);
                    return npwVarO216.Q();
                }
                ajcq ajcqVarAS4 = r5.aS();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r5;
                nffVar.d = 4;
                objD = aosv.D(ajcqVarAS4, nffVar);
                if (objD == bool) {
                    r6 = r5;
                    return bool;
                }
                r6 = r5;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 171, "DobbyPreconditions.kt").v("call is a video call, not allowing Dobby to start");
                    defpackage.npw npwVarO217 = mni.O(defpackage.nfc.a.m());
                    npwVarO217.S(false);
                    npwVarO217.R(defpackage.nfb.REASON_VIDEO_CALL);
                    return npwVarO217.Q();
                }
                ajcq ajcqVarAM4 = r6.aM();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r6;
                nffVar.d = 5;
                objD = aosv.D(ajcqVarAM4, nffVar);
                if (objD == bool) {
                    r7 = r6;
                    return bool;
                }
                r7 = r6;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 178, "DobbyPreconditions.kt").v("call is a RTT call, not allowing Dobby to start");
                    defpackage.npw npwVarO218 = mni.O(defpackage.nfc.a.m());
                    npwVarO218.S(false);
                    npwVarO218.R(defpackage.nfb.REASON_RTT_CALL);
                    return npwVarO218.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r7;
                nffVar.d = 6;
                objD = aoov.aj(this.i, new defpackage.mhq((defpackage.nfo) this, (aoln) null, 9, (byte[]) null), nffVar);
                if (objD == bool) {
                    r8 = r7;
                    return bool;
                }
                r8 = r7;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 185, "DobbyPreconditions.kt").v("TTY is enabled, not allowing Dobby to start");
                    defpackage.npw npwVarO219 = mni.O(defpackage.nfc.a.m());
                    npwVarO219.S(false);
                    npwVarO219.R(defpackage.nfb.REASON_TTY_ENABLED);
                    return npwVarO219.Q();
                }
                ajcq ajcqVarAG4 = r8.aG();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r8;
                nffVar.d = 7;
                objD = aosv.D(ajcqVarAG4, nffVar);
                if (objD == bool) {
                    r9 = r8;
                    return bool;
                }
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO2110 = mni.O(defpackage.nfc.a.m());
                    npwVarO2110.S(false);
                    npwVarO2110.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO2110.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO2111 = mni.O(defpackage.nfc.a.m());
                    npwVarO2111.S(false);
                    npwVarO2111.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO2111.Q();
                }
                ajcq ajcqVarAC4 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC4, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO2112 = mni.O(defpackage.nfc.a.m());
                    npwVarO2112.S(false);
                    npwVarO2112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO2112.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO11110 = mni.O(defpackage.nfc.a.m());
                    npwVarO11110.S(false);
                    npwVarO11110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11110.Q();
                }
                mtd mtdVar4 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar4.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO11111 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111.S(false);
                    npwVarO11111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11111.Q();
                }
                j$.util.Optional optionalG4 = this.C.g();
                aooh.e(optionalG4, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG4);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO11112 = mni.O(defpackage.nfc.a.m());
                    npwVarO11112.S(false);
                    npwVarO11112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar4 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar4.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO11113 = mni.O(defpackage.nfc.a.m());
                        npwVarO11113.S(false);
                        npwVarO11113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO11113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar4 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar4.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO11114 = mni.O(defpackage.nfc.a.m());
                    npwVarO11114.S(false);
                    npwVarO11114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO11114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO11115 = mni.O(defpackage.nfc.a.m());
                        npwVarO11115.S(false);
                        npwVarO11115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO11115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar7 = this.A;
                        yse yseVar7 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar7.a(yseVar7, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11116 = mni.O(defpackage.nfc.a.m());
                            npwVarO11116.S(false);
                            npwVarO11116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar8 = this.A;
                        yse yseVar8 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar8.a(yseVar8, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11117 = mni.O(defpackage.nfc.a.m());
                            npwVarO11117.S(false);
                            npwVarO11117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO11118 = mni.O(defpackage.nfc.a.m());
                    npwVarO11118.S(true);
                    return npwVarO11118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO11119 = mni.O(defpackage.nfc.a.m());
                npwVarO11119.S(false);
                npwVarO11119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO11119.Q();
            case 4:
                java.lang.Object obj4 = nffVar.a;
                aootVar2 = nffVar.f;
                njeVar3 = nffVar.e;
                aooc.af(objD);
                r6 = obj4;
                r6 = r5;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 171, "DobbyPreconditions.kt").v("call is a video call, not allowing Dobby to start");
                    defpackage.npw npwVarO2113 = mni.O(defpackage.nfc.a.m());
                    npwVarO2113.S(false);
                    npwVarO2113.R(defpackage.nfb.REASON_VIDEO_CALL);
                    return npwVarO2113.Q();
                }
                ajcq ajcqVarAM5 = r6.aM();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r6;
                nffVar.d = 5;
                objD = aosv.D(ajcqVarAM5, nffVar);
                if (objD == bool) {
                    r7 = r6;
                    return bool;
                }
                r7 = r6;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 178, "DobbyPreconditions.kt").v("call is a RTT call, not allowing Dobby to start");
                    defpackage.npw npwVarO2114 = mni.O(defpackage.nfc.a.m());
                    npwVarO2114.S(false);
                    npwVarO2114.R(defpackage.nfb.REASON_RTT_CALL);
                    return npwVarO2114.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r7;
                nffVar.d = 6;
                objD = aoov.aj(this.i, new defpackage.mhq((defpackage.nfo) this, (aoln) null, 9, (byte[]) null), nffVar);
                if (objD == bool) {
                    r8 = r7;
                    return bool;
                }
                r8 = r7;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 185, "DobbyPreconditions.kt").v("TTY is enabled, not allowing Dobby to start");
                    defpackage.npw npwVarO2115 = mni.O(defpackage.nfc.a.m());
                    npwVarO2115.S(false);
                    npwVarO2115.R(defpackage.nfb.REASON_TTY_ENABLED);
                    return npwVarO2115.Q();
                }
                ajcq ajcqVarAG5 = r8.aG();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r8;
                nffVar.d = 7;
                objD = aosv.D(ajcqVarAG5, nffVar);
                if (objD == bool) {
                    r9 = r8;
                    return bool;
                }
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO2116 = mni.O(defpackage.nfc.a.m());
                    npwVarO2116.S(false);
                    npwVarO2116.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO2116.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO2117 = mni.O(defpackage.nfc.a.m());
                    npwVarO2117.S(false);
                    npwVarO2117.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO2117.Q();
                }
                ajcq ajcqVarAC5 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC5, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO2118 = mni.O(defpackage.nfc.a.m());
                    npwVarO2118.S(false);
                    npwVarO2118.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO2118.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO111110.S(false);
                    npwVarO111110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111110.Q();
                }
                mtd mtdVar5 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar5.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111.S(false);
                    npwVarO111111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111111.Q();
                }
                j$.util.Optional optionalG5 = this.C.g();
                aooh.e(optionalG5, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG5);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO111112.S(false);
                    npwVarO111112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar5 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar5.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO111113 = mni.O(defpackage.nfc.a.m());
                        npwVarO111113.S(false);
                        npwVarO111113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO111113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar5 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar5.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO111114.S(false);
                    npwVarO111114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO111114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO111115 = mni.O(defpackage.nfc.a.m());
                        npwVarO111115.S(false);
                        npwVarO111115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO111115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar9 = this.A;
                        yse yseVar9 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar9.a(yseVar9, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO111116.S(false);
                            npwVarO111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO111116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar10 = this.A;
                        yse yseVar10 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar10.a(yseVar10, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO111117 = mni.O(defpackage.nfc.a.m());
                            npwVarO111117.S(false);
                            npwVarO111117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO111117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO111118.S(true);
                    return npwVarO111118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO111119 = mni.O(defpackage.nfc.a.m());
                npwVarO111119.S(false);
                npwVarO111119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO111119.Q();
            case 5:
                java.lang.Object obj5 = nffVar.a;
                aootVar2 = nffVar.f;
                njeVar3 = nffVar.e;
                aooc.af(objD);
                r7 = obj5;
                r7 = r6;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 178, "DobbyPreconditions.kt").v("call is a RTT call, not allowing Dobby to start");
                    defpackage.npw npwVarO2119 = mni.O(defpackage.nfc.a.m());
                    npwVarO2119.S(false);
                    npwVarO2119.R(defpackage.nfb.REASON_RTT_CALL);
                    return npwVarO2119.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r7;
                nffVar.d = 6;
                objD = aoov.aj(this.i, new defpackage.mhq((defpackage.nfo) this, (aoln) null, 9, (byte[]) null), nffVar);
                if (objD == bool) {
                    r8 = r7;
                    return bool;
                }
                r8 = r7;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 185, "DobbyPreconditions.kt").v("TTY is enabled, not allowing Dobby to start");
                    defpackage.npw npwVarO21110 = mni.O(defpackage.nfc.a.m());
                    npwVarO21110.S(false);
                    npwVarO21110.R(defpackage.nfb.REASON_TTY_ENABLED);
                    return npwVarO21110.Q();
                }
                ajcq ajcqVarAG6 = r8.aG();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r8;
                nffVar.d = 7;
                objD = aosv.D(ajcqVarAG6, nffVar);
                if (objD == bool) {
                    r9 = r8;
                    return bool;
                }
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO21111 = mni.O(defpackage.nfc.a.m());
                    npwVarO21111.S(false);
                    npwVarO21111.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO21111.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO21112 = mni.O(defpackage.nfc.a.m());
                    npwVarO21112.S(false);
                    npwVarO21112.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO21112.Q();
                }
                ajcq ajcqVarAC6 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC6, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO21113 = mni.O(defpackage.nfc.a.m());
                    npwVarO21113.S(false);
                    npwVarO21113.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO21113.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO1111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111110.S(false);
                    npwVarO1111110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1111110.Q();
                }
                mtd mtdVar6 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar6.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO1111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111.S(false);
                    npwVarO1111111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1111111.Q();
                }
                j$.util.Optional optionalG6 = this.C.g();
                aooh.e(optionalG6, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG6);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO1111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111112.S(false);
                    npwVarO1111112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1111112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar6 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar6.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO1111113 = mni.O(defpackage.nfc.a.m());
                        npwVarO1111113.S(false);
                        npwVarO1111113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO1111113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar6 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar6.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO1111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111114.S(false);
                    npwVarO1111114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO1111114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO1111115 = mni.O(defpackage.nfc.a.m());
                        npwVarO1111115.S(false);
                        npwVarO1111115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO1111115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar11 = this.A;
                        yse yseVar11 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar11.a(yseVar11, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO1111116.S(false);
                            npwVarO1111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1111116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar12 = this.A;
                        yse yseVar12 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar12.a(yseVar12, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1111117 = mni.O(defpackage.nfc.a.m());
                            npwVarO1111117.S(false);
                            npwVarO1111117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1111117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO1111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111118.S(true);
                    return npwVarO1111118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO1111119 = mni.O(defpackage.nfc.a.m());
                npwVarO1111119.S(false);
                npwVarO1111119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO1111119.Q();
            case 6:
                java.lang.Object obj6 = nffVar.a;
                aootVar2 = nffVar.f;
                njeVar3 = nffVar.e;
                aooc.af(objD);
                r8 = obj6;
                r8 = r7;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 185, "DobbyPreconditions.kt").v("TTY is enabled, not allowing Dobby to start");
                    defpackage.npw npwVarO21114 = mni.O(defpackage.nfc.a.m());
                    npwVarO21114.S(false);
                    npwVarO21114.R(defpackage.nfb.REASON_TTY_ENABLED);
                    return npwVarO21114.Q();
                }
                ajcq ajcqVarAG7 = r8.aG();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r8;
                nffVar.d = 7;
                objD = aosv.D(ajcqVarAG7, nffVar);
                if (objD == bool) {
                    r9 = r8;
                    return bool;
                }
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO21115 = mni.O(defpackage.nfc.a.m());
                    npwVarO21115.S(false);
                    npwVarO21115.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO21115.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO21116 = mni.O(defpackage.nfc.a.m());
                    npwVarO21116.S(false);
                    npwVarO21116.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO21116.Q();
                }
                ajcq ajcqVarAC7 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC7, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO21117 = mni.O(defpackage.nfc.a.m());
                    npwVarO21117.S(false);
                    npwVarO21117.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO21117.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO11111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111110.S(false);
                    npwVarO11111110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11111110.Q();
                }
                mtd mtdVar7 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar7.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO11111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111.S(false);
                    npwVarO11111111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11111111.Q();
                }
                j$.util.Optional optionalG7 = this.C.g();
                aooh.e(optionalG7, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG7);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO11111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111112.S(false);
                    npwVarO11111112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11111112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar7 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar7.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO11111113 = mni.O(defpackage.nfc.a.m());
                        npwVarO11111113.S(false);
                        npwVarO11111113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO11111113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar7 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar7.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO11111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111114.S(false);
                    npwVarO11111114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO11111114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO11111115 = mni.O(defpackage.nfc.a.m());
                        npwVarO11111115.S(false);
                        npwVarO11111115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO11111115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar13 = this.A;
                        yse yseVar13 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar13.a(yseVar13, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111116.S(false);
                            npwVarO11111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar14 = this.A;
                        yse yseVar14 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar14.a(yseVar14, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111117 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111117.S(false);
                            npwVarO11111117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO11111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111118.S(true);
                    return npwVarO11111118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO11111119 = mni.O(defpackage.nfc.a.m());
                npwVarO11111119.S(false);
                npwVarO11111119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO11111119.Q();
            case 7:
                java.lang.Object obj7 = nffVar.a;
                aootVar2 = nffVar.f;
                njeVar3 = nffVar.e;
                aooc.af(objD);
                r9 = obj7;
                r9 = r8;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 192, "DobbyPreconditions.kt").v("call is a emergency call, not allowing Dobby to start");
                    defpackage.npw npwVarO21118 = mni.O(defpackage.nfc.a.m());
                    npwVarO21118.S(false);
                    npwVarO21118.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO21118.Q();
                }
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r9;
                nffVar.d = 8;
                objD = e(r9, nffVar);
                if (objD == bool) {
                    r10 = r9;
                    return bool;
                }
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO21119 = mni.O(defpackage.nfc.a.m());
                    npwVarO21119.S(false);
                    npwVarO21119.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO21119.Q();
                }
                ajcq ajcqVarAC8 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC8, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO211110 = mni.O(defpackage.nfc.a.m());
                    npwVarO211110.S(false);
                    npwVarO211110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO211110.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO111111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111110.S(false);
                    npwVarO111111110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111111110.Q();
                }
                mtd mtdVar8 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar8.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO111111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111.S(false);
                    npwVarO111111111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111111111.Q();
                }
                j$.util.Optional optionalG8 = this.C.g();
                aooh.e(optionalG8, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG8);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO111111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111112.S(false);
                    npwVarO111111112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111111112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar8 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar8.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO111111113 = mni.O(defpackage.nfc.a.m());
                        npwVarO111111113.S(false);
                        npwVarO111111113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO111111113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar8 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar8.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO111111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111114.S(false);
                    npwVarO111111114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO111111114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO111111115 = mni.O(defpackage.nfc.a.m());
                        npwVarO111111115.S(false);
                        npwVarO111111115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO111111115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar15 = this.A;
                        yse yseVar15 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar15.a(yseVar15, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO111111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO111111116.S(false);
                            npwVarO111111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO111111116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar16 = this.A;
                        yse yseVar16 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar16.a(yseVar16, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO111111117 = mni.O(defpackage.nfc.a.m());
                            npwVarO111111117.S(false);
                            npwVarO111111117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO111111117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO111111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111118.S(true);
                    return npwVarO111111118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO111111119 = mni.O(defpackage.nfc.a.m());
                npwVarO111111119.S(false);
                npwVarO111111119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO111111119.Q();
            case 8:
                java.lang.Object obj8 = nffVar.a;
                aootVar2 = nffVar.f;
                njeVar3 = nffVar.e;
                aooc.af(objD);
                r10 = obj8;
                r10 = r9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 199, "DobbyPreconditions.kt").v("call is a emergency callback, not allowing Dobby to start");
                    defpackage.npw npwVarO211111 = mni.O(defpackage.nfc.a.m());
                    npwVarO211111.S(false);
                    npwVarO211111.R(defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK);
                    return npwVarO211111.Q();
                }
                ajcq ajcqVarAC9 = r10.aC();
                nffVar.e = njeVar3;
                nffVar.f = aootVar2;
                nffVar.a = r10;
                nffVar.d = 9;
                objD = aosv.D(ajcqVarAC9, nffVar);
                if (objD == bool) {
                    return bool;
                }
                aootVar3 = aootVar2;
                njeVar4 = njeVar3;
                r11 = r10;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO211112 = mni.O(defpackage.nfc.a.m());
                    npwVarO211112.S(false);
                    npwVarO211112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO211112.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO1111111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111110.S(false);
                    npwVarO1111111110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1111111110.Q();
                }
                mtd mtdVar9 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar9.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO1111111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111111.S(false);
                    npwVarO1111111111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1111111111.Q();
                }
                j$.util.Optional optionalG9 = this.C.g();
                aooh.e(optionalG9, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG9);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO1111111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111112.S(false);
                    npwVarO1111111112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO1111111112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar9 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar9.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO1111111113 = mni.O(defpackage.nfc.a.m());
                        npwVarO1111111113.S(false);
                        npwVarO1111111113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO1111111113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar9 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar9.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO1111111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111114.S(false);
                    npwVarO1111111114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO1111111114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO1111111115 = mni.O(defpackage.nfc.a.m());
                        npwVarO1111111115.S(false);
                        npwVarO1111111115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO1111111115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar17 = this.A;
                        yse yseVar17 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar17.a(yseVar17, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1111111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO1111111116.S(false);
                            npwVarO1111111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1111111116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar18 = this.A;
                        yse yseVar18 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar18.a(yseVar18, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1111111117 = mni.O(defpackage.nfc.a.m());
                            npwVarO1111111117.S(false);
                            npwVarO1111111117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1111111117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO1111111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111118.S(true);
                    return npwVarO1111111118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO1111111119 = mni.O(defpackage.nfc.a.m());
                npwVarO1111111119.S(false);
                npwVarO1111111119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO1111111119.Q();
            case 9:
                java.lang.Object obj9 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar4 = nffVar.e;
                aooc.af(objD);
                r11 = obj9;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 206, "DobbyPreconditions.kt").v("call is a conference call, not allowing Dobby to start");
                    defpackage.npw npwVarO211113 = mni.O(defpackage.nfc.a.m());
                    npwVarO211113.S(false);
                    npwVarO211113.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO211113.Q();
                }
                if (aooh.n(this.D.q(this.v), java.lang.Boolean.TRUE)) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 213, "DobbyPreconditions.kt").v("another call is active (cached), not allowing Dobby to start");
                    defpackage.npw npwVarO11111111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111110.S(false);
                    npwVarO11111111110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11111111110.Q();
                }
                mtd mtdVar10 = this.n;
                nffVar.e = njeVar4;
                nffVar.f = aootVar3;
                nffVar.a = r11;
                nffVar.d = 10;
                objD = mtdVar10.a(nffVar);
                if (objD == bool) {
                    r12 = r11;
                    return bool;
                }
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO11111111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111111.S(false);
                    npwVarO11111111111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11111111111.Q();
                }
                j$.util.Optional optionalG10 = this.C.g();
                aooh.e(optionalG10, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG10);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO11111111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111112.S(false);
                    npwVarO11111111112.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO11111111112.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar10 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar10.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO11111111113 = mni.O(defpackage.nfc.a.m());
                        npwVarO11111111113.S(false);
                        npwVarO11111111113.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO11111111113.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar10 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar10.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO11111111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111114.S(false);
                    npwVarO11111111114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO11111111114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO11111111115 = mni.O(defpackage.nfc.a.m());
                        npwVarO11111111115.S(false);
                        npwVarO11111111115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO11111111115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar19 = this.A;
                        yse yseVar19 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar19.a(yseVar19, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111111116.S(false);
                            npwVarO11111111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111111116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar110 = this.A;
                        yse yseVar110 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar110.a(yseVar110, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111111117 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111111117.S(false);
                            npwVarO11111111117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111111117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO11111111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111118.S(true);
                    return npwVarO11111111118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO11111111119 = mni.O(defpackage.nfc.a.m());
                npwVarO11111111119.S(false);
                npwVarO11111111119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO11111111119.Q();
            case 10:
                java.lang.Object obj10 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar4 = nffVar.e;
                aooc.af(objD);
                r12 = obj10;
                r12 = r11;
                mtaVar = (defpackage.mta) objD;
                if (mtaVar != null) {
                    mszVar = mtaVar.b;
                } else {
                    mszVar = null;
                }
                if (mszVar == defpackage.msz.d) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 222, "DobbyPreconditions.kt").v("another call is active, not allowing Dobby to start");
                    defpackage.npw npwVarO111111111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111110.S(false);
                    npwVarO111111111110.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111111111110.Q();
                }
                j$.util.Optional optionalG11 = this.C.g();
                aooh.e(optionalG11, "getFeature(...)");
                irlVar = (defpackage.irl) aooh.q(optionalG11);
                if (irlVar != null) {
                    nffVar.e = njeVar4;
                    nffVar.f = aootVar3;
                    nffVar.a = r12;
                    nffVar.d = 11;
                    objD = irlVar.c(nffVar);
                    if (objD == bool) {
                        return bool;
                    }
                    njeVar5 = njeVar4;
                    r14 = r12;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    njeVar5 = njeVar4;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO111111111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111111.S(false);
                    npwVarO111111111111.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111111111111.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar11 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar11.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO111111111112 = mni.O(defpackage.nfc.a.m());
                        npwVarO111111111112.S(false);
                        npwVarO111111111112.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO111111111112.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar11 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar11.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO111111111113 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111113.S(false);
                    npwVarO111111111113.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO111111111113.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO111111111114 = mni.O(defpackage.nfc.a.m());
                        npwVarO111111111114.S(false);
                        npwVarO111111111114.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO111111111114.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar111 = this.A;
                        yse yseVar111 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar111.a(yseVar111, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO111111111115 = mni.O(defpackage.nfc.a.m());
                            npwVarO111111111115.S(false);
                            npwVarO111111111115.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO111111111115.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar112 = this.A;
                        yse yseVar112 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar112.a(yseVar112, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO111111111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO111111111116.S(false);
                            npwVarO111111111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO111111111116.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO111111111117 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111117.S(true);
                    return npwVarO111111111117.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO111111111118 = mni.O(defpackage.nfc.a.m());
                npwVarO111111111118.S(false);
                npwVarO111111111118.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO111111111118.Q();
            case 11:
                java.lang.Object obj11 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar5 = nffVar.e;
                aooc.af(objD);
                r14 = obj11;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    r13 = r12;
                    r13 = r14;
                    r13 = r14;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 231, "DobbyPreconditions.kt").v("another call is active (beesly transit), not allowing Dobby to start");
                    defpackage.npw npwVarO111111111119 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111119.S(false);
                    npwVarO111111111119.R(defpackage.nfb.REASON_ANOTHER_CALL_ACTIVE);
                    return npwVarO111111111119.Q();
                }
                r13 = r12;
                r13 = r14;
                if (njeVar5 == defpackage.nje.b) {
                    oko okoVar12 = this.m;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r13;
                    nffVar.d = 12;
                    objD = okoVar12.L(nffVar);
                    if (objD == bool) {
                        r13 = r14;
                        r15 = r13;
                        r16 = r13;
                        return bool;
                    }
                    r13 = r14;
                    r15 = r13;
                    r16 = r13;
                    r15 = r16;
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                        defpackage.npw npwVarO1111111111110 = mni.O(defpackage.nfc.a.m());
                        npwVarO1111111111110.S(false);
                        npwVarO1111111111110.R(defpackage.nfb.REASON_CALL_ROAMING);
                        return npwVarO1111111111110.Q();
                    }
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar12 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar12.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO1111111111111 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111111111.S(false);
                    npwVarO1111111111111.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO1111111111111.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO1111111111112 = mni.O(defpackage.nfc.a.m());
                        npwVarO1111111111112.S(false);
                        npwVarO1111111111112.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO1111111111112.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar113 = this.A;
                        yse yseVar113 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar113.a(yseVar113, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1111111111113 = mni.O(defpackage.nfc.a.m());
                            npwVarO1111111111113.S(false);
                            npwVarO1111111111113.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1111111111113.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar114 = this.A;
                        yse yseVar114 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar114.a(yseVar114, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO1111111111114 = mni.O(defpackage.nfc.a.m());
                            npwVarO1111111111114.S(false);
                            npwVarO1111111111114.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO1111111111114.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO1111111111115 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111111115.S(true);
                    return npwVarO1111111111115.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO1111111111116 = mni.O(defpackage.nfc.a.m());
                npwVarO1111111111116.S(false);
                npwVarO1111111111116.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO1111111111116.Q();
            case 12:
                java.lang.Object obj12 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar5 = nffVar.e;
                aooc.af(objD);
                r16 = obj12;
                r13 = r14;
                r15 = r13;
                r16 = r13;
                r15 = r16;
                if (((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 240, "DobbyPreconditions.kt").v("Call is roaming, not allowing Dobby AUTO_SCREENING to start");
                    defpackage.npw npwVarO1111111111117 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111111117.S(false);
                    npwVarO1111111111117.R(defpackage.nfb.REASON_CALL_ROAMING);
                    return npwVarO1111111111117.Q();
                }
                r13 = r14;
                r15 = r13;
                zrw zrwVar13 = this.o;
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r15;
                nffVar.d = 13;
                objD = zrwVar13.p(nffVar);
                r17 = r15;
                if (objD == bool) {
                    return bool;
                }
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO1111111111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO1111111111118.S(false);
                    npwVarO1111111111118.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO1111111111118.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO1111111111119 = mni.O(defpackage.nfc.a.m());
                        npwVarO1111111111119.S(false);
                        npwVarO1111111111119.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO1111111111119.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar115 = this.A;
                        yse yseVar115 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar115.a(yseVar115, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111111111110 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111111111110.S(false);
                            npwVarO11111111111110.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111111111110.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar116 = this.A;
                        yse yseVar116 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar116.a(yseVar116, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111111111111 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111111111111.S(false);
                            npwVarO11111111111111.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111111111111.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO11111111111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111111112.S(true);
                    return npwVarO11111111111112.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO11111111111113 = mni.O(defpackage.nfc.a.m());
                npwVarO11111111111113.S(false);
                npwVarO11111111111113.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO11111111111113.Q();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.Object obj13 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar5 = nffVar.e;
                aooc.af(objD);
                r17 = obj13;
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 249, "DobbyPreconditions.kt").v("missing microphone permission, not allowing Dobby to start");
                    defpackage.npw npwVarO11111111111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111111114.S(false);
                    npwVarO11111111111114.R(defpackage.nfb.REASON_MIC_PERMISSION_MISSING);
                    return npwVarO11111111111114.Q();
                }
                if (njeVar5 == defpackage.nje.b) {
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r17;
                    nffVar.d = 14;
                    objD = h(nffVar);
                    if (objD == bool) {
                        r18 = r17;
                        r19 = r17;
                        return bool;
                    }
                    r18 = r17;
                    r19 = r17;
                    r18 = r19;
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                        defpackage.npw npwVarO11111111111115 = mni.O(defpackage.nfc.a.m());
                        npwVarO11111111111115.S(false);
                        npwVarO11111111111115.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                        return npwVarO11111111111115.Q();
                    }
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar117 = this.A;
                        yse yseVar117 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar117.a(yseVar117, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111111111116 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111111111116.S(false);
                            npwVarO11111111111116.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111111111116.Q();
                        }
                    }
                } else {
                    r18 = r17;
                    r20 = r18;
                    if (k(njeVar5)) {
                        ysb ysbVar118 = this.A;
                        yse yseVar118 = yse.i;
                        nffVar.e = njeVar5;
                        nffVar.f = aootVar3;
                        nffVar.a = r18;
                        nffVar.d = 15;
                        objD = ysbVar118.a(yseVar118, nffVar);
                        if (objD == bool) {
                            r21 = r18;
                            return bool;
                        }
                        r21 = r18;
                        r20 = r21;
                        if (!((ysc) objD).a()) {
                            a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                            defpackage.npw npwVarO11111111111117 = mni.O(defpackage.nfc.a.m());
                            npwVarO11111111111117.S(false);
                            npwVarO11111111111117.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                            return npwVarO11111111111117.Q();
                        }
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO11111111111118 = mni.O(defpackage.nfc.a.m());
                    npwVarO11111111111118.S(true);
                    return npwVarO11111111111118.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO11111111111119 = mni.O(defpackage.nfc.a.m());
                npwVarO11111111111119.S(false);
                npwVarO11111111111119.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO11111111111119.Q();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj14 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar5 = nffVar.e;
                aooc.af(objD);
                r19 = obj14;
                r18 = r17;
                r19 = r17;
                r18 = r19;
                if (!((java.lang.Boolean) objD).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 256, "DobbyPreconditions.kt").v("microphone access is blocked, not allowing Dobby to start");
                    defpackage.npw npwVarO111111111111110 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111111110.S(false);
                    npwVarO111111111111110.R(defpackage.nfb.REASON_MIC_ACCESS_BLOCKED);
                    return npwVarO111111111111110.Q();
                }
                r18 = r17;
                r20 = r18;
                if (k(njeVar5)) {
                    ysb ysbVar119 = this.A;
                    yse yseVar119 = yse.i;
                    nffVar.e = njeVar5;
                    nffVar.f = aootVar3;
                    nffVar.a = r18;
                    nffVar.d = 15;
                    objD = ysbVar119.a(yseVar119, nffVar);
                    if (objD == bool) {
                        r21 = r18;
                        return bool;
                    }
                    r21 = r18;
                    r20 = r21;
                    if (!((ysc) objD).a()) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                        defpackage.npw npwVarO111111111111111 = mni.O(defpackage.nfc.a.m());
                        npwVarO111111111111111.S(false);
                        npwVarO111111111111111.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                        return npwVarO111111111111111.Q();
                    }
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO111111111111112 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111111112.S(true);
                    return npwVarO111111111111112.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO111111111111113 = mni.O(defpackage.nfc.a.m());
                npwVarO111111111111113.S(false);
                npwVarO111111111111113.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO111111111111113.Q();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.Object obj15 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar5 = nffVar.e;
                aooc.af(objD);
                r21 = obj15;
                r21 = r18;
                r20 = r21;
                if (!((ysc) objD).a()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 266, "DobbyPreconditions.kt").y("GACS enabled for use case %s but GACS LoRa is not available.", njeVar5);
                    defpackage.npw npwVarO111111111111114 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111111114.S(false);
                    npwVarO111111111111114.R(defpackage.nfb.REASON_GACS_AICORE_MODEL_MISSING);
                    return npwVarO111111111111114.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = aootVar3;
                nffVar.a = r20;
                nffVar.d = 16;
                objD = c(njeVar5, nffVar);
                r22 = r20;
                if (objD == bool) {
                    return bool;
                }
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO111111111111115 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111111115.S(true);
                    return npwVarO111111111111115.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO111111111111116 = mni.O(defpackage.nfc.a.m());
                npwVarO111111111111116.S(false);
                npwVarO111111111111116.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO111111111111116.Q();
            case 16:
                java.lang.Object obj16 = nffVar.a;
                aootVar3 = nffVar.f;
                njeVar5 = nffVar.e;
                aooc.af(objD);
                r22 = obj16;
                igiVar = (defpackage.igi) objD;
                aootVar3.a = igiVar;
                if (!igiVar.d) {
                    npwVarO = mni.O(defpackage.nfc.a.m());
                    npwVarO.S(false);
                    obj = aootVar3.a;
                    if (obj == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                    ighVarB = defpackage.igh.b(((defpackage.igi) obj).e);
                    if (ighVarB == null) {
                        ighVarB = defpackage.igh.UNRECOGNIZED;
                    }
                    if (k(njeVar5)) {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    } else {
                        nfbVar = defpackage.nfb.REASON_AUDIO_PRISM_PRECONDITIONS_FAILED;
                    }
                    npwVarO.R(nfbVar);
                    return npwVarO.Q();
                }
                nffVar.e = njeVar5;
                nffVar.f = null;
                nffVar.a = null;
                nffVar.d = 17;
                objD = f(r22, nffVar);
                if (objD == bool) {
                    return bool;
                }
                njeVar6 = njeVar5;
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO111111111111117 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111111117.S(true);
                    return npwVarO111111111111117.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO111111111111118 = mni.O(defpackage.nfc.a.m());
                npwVarO111111111111118.S(false);
                npwVarO111111111111118.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO111111111111118.Q();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                njeVar6 = nffVar.e;
                aooc.af(objD);
                zBooleanValue = ((java.lang.Boolean) objD).booleanValue();
                aimzVar = a;
                if (zBooleanValue) {
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 289, "DobbyPreconditions.kt").I("All DobbyPreconditions passed successfully for use case: %s, callId: %s", njeVar6, this.k);
                    defpackage.npw npwVarO111111111111119 = mni.O(defpackage.nfc.a.m());
                    npwVarO111111111111119.S(true);
                    return npwVarO111111111111119.Q();
                }
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "check", 280, "DobbyPreconditions.kt").v("Fi Wi-Fi / VoIP calling is under fixing, not allowing Dobby to start");
                defpackage.npw npwVarO1111111111111110 = mni.O(defpackage.nfc.a.m());
                npwVarO1111111111111110.S(false);
                npwVarO1111111111111110.R(defpackage.nfb.REASON_FI_WIFI_CALLING_UNDER_FIXING);
                return npwVarO1111111111111110.Q();
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [ihr] */
    public final java.lang.Object c(defpackage.nje njeVar, aoln aolnVar) throws aois {
        defpackage.nfg nfgVar;
        ?? r6;
        defpackage.nje njeVar2;
        defpackage.igi igiVar;
        defpackage.igh ighVarB;
        if (aolnVar instanceof defpackage.nfg) {
            nfgVar = (defpackage.nfg) aolnVar;
            int i = nfgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfgVar.d = i - Integer.MIN_VALUE;
            } else {
                nfgVar = new defpackage.nfg(this, aolnVar);
            }
        } else {
            nfgVar = new defpackage.nfg(this, aolnVar);
        }
        java.lang.Object objA = nfgVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nfgVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = nfgVar.a;
                njeVar = nfgVar.e;
                aooc.af(objA);
                r6 = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                njeVar2 = nfgVar.e;
                aooc.af(objA);
            }
            igiVar = (defpackage.igi) objA;
            if (!igiVar.d) {
                aimw aimwVarL = a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "checkAudioPrismPreconditions$<anonymous>", 394, "DobbyPreconditions.kt");
                ighVarB = defpackage.igh.b(igiVar.e);
                if (ighVarB == null) {
                    ighVarB = defpackage.igh.UNRECOGNIZED;
                }
                aimwVarL.I("AudioPrism preconditions not met for use case %s. Reason: %s", njeVar2, ighVarB.name());
            }
            return objA;
        }
        aooc.af(objA);
        defpackage.ihr ihrVar = this.l;
        defpackage.mzp mzpVar = this.c;
        nfgVar.e = njeVar;
        nfgVar.a = ihrVar;
        nfgVar.d = 1;
        java.lang.Object objB = mzpVar.b(njeVar, nfgVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        objA = objB;
        r6 = ihrVar;
        nfgVar.e = njeVar;
        nfgVar.a = null;
        nfgVar.d = 2;
        objA = r6.a((igf) objA, nfgVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        njeVar2 = njeVar;
        igiVar = (defpackage.igi) objA;
        if (!igiVar.d) {
            aimw aimwVarL2 = a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "checkAudioPrismPreconditions$<anonymous>", 394, "DobbyPreconditions.kt");
            ighVarB = defpackage.igh.b(igiVar.e);
            if (ighVarB == null) {
                ighVarB = defpackage.igh.UNRECOGNIZED;
            }
            aimwVarL2.I("AudioPrism preconditions not met for use case %s. Reason: %s", njeVar2, ighVarB.name());
        }
        return objA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        if (r10 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.nje r11, aoln r12) throws aois {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfo.d(nje, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [nfd] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final java.lang.Object e(defpackage.nfd nfdVar, aoln aolnVar) {
        defpackage.nfi nfiVar;
        ?? r6;
        if (aolnVar instanceof defpackage.nfi) {
            nfiVar = (defpackage.nfi) aolnVar;
            int i = nfiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfiVar.d = i - Integer.MIN_VALUE;
            } else {
                nfiVar = new defpackage.nfi(this, aolnVar);
            }
        } else {
            nfiVar = new defpackage.nfi(this, aolnVar);
        }
        java.lang.Object objC = nfiVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nfiVar.d;
        if (i2 == 0) {
            aooc.af(objC);
            zjl zjlVar = this.p;
            nfiVar.a = nfdVar;
            nfiVar.d = 1;
            objC = zjlVar.c(nfiVar);
            if (objC != aoluVar) {
            }
            r6 = nfdVar;
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        java.lang.Object obj = nfiVar.a;
        aooc.af(objC);
        r6 = obj;
        r6 = nfdVar;
        if (((java.lang.Boolean) objC).booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        ajcq ajcqVarAH = r6.aH();
        nfiVar.a = null;
        nfiVar.d = 2;
        java.lang.Object objD = aosv.D(ajcqVarAH, nfiVar);
        if (objD != aoluVar) {
            return objD;
        }
        r6 = nfdVar;
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [nfo] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, nfd] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [nfd] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [nfd] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final java.lang.Object f(defpackage.nfd nfdVar, aoln aolnVar) {
        defpackage.nfj nfjVar;
        ?? r12;
        boolean zBooleanValue;
        java.lang.Object objD;
        ?? r2;
        boolean z;
        java.lang.Boolean bool;
        boolean zBooleanValue2;
        java.lang.Object objI;
        ?? r13;
        java.lang.Boolean bool2;
        if (aolnVar instanceof defpackage.nfj) {
            nfjVar = (defpackage.nfj) aolnVar;
            int i = nfjVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfjVar.e = i - Integer.MIN_VALUE;
            } else {
                nfjVar = new defpackage.nfj(this, aolnVar);
            }
        } else {
            nfjVar = new defpackage.nfj(this, aolnVar);
        }
        java.lang.Object objD2 = nfjVar.c;
        aolu aoluVar = aolu.a;
        int i2 = nfjVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = nfjVar.a;
                aooc.af(objD2);
                r12 = obj;
                r12 = nfdVar;
                zBooleanValue = ((java.lang.Boolean) objD2).booleanValue();
                ajcq ajcqVarAA = r12.aA();
                nfjVar.a = r12;
                nfjVar.b = zBooleanValue;
                nfjVar.e = 2;
                objD = aosv.D(ajcqVarAA, nfjVar);
                if (objD != aoluVar) {
                    r2 = r12;
                    z = zBooleanValue;
                    objD2 = objD;
                }
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            java.lang.Object obj2 = nfjVar.a;
                            aooc.af(objD2);
                            r13 = obj2;
                            r13 = nfdVar;
                            bool2 = (java.lang.Boolean) aooh.q((j$.util.Optional) objD2);
                            if (bool2 != null || !bool2.booleanValue()) {
                                return java.lang.Boolean.FALSE;
                            }
                            nfjVar.a = null;
                            nfjVar.e = 5;
                            java.lang.Object objG = g(r13, 1989, nfjVar);
                            if (objG != aoluVar) {
                                return objG;
                            }
                        } else if (i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    aooc.af(objD2);
                    return objD2;
                }
                z = nfjVar.b;
                java.lang.Object obj3 = nfjVar.a;
                aooc.af(objD2);
                r2 = obj3;
            }
            bool = (java.lang.Boolean) aooh.q((j$.util.Optional) objD2);
            if (bool != null) {
                zBooleanValue2 = bool.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            if (z && !zBooleanValue2) {
                return java.lang.Boolean.FALSE;
            }
            nfjVar.a = null;
            nfjVar.e = 3;
            objI = i(r2, 1989, nfjVar);
            if (objI != aoluVar) {
                return objI;
            }
        } else {
            aooc.af(objD2);
            if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                ajcq ajcqVarAV = nfdVar.aV();
                nfjVar.a = nfdVar;
                nfjVar.e = 1;
                objD2 = aosv.D(ajcqVarAV, nfjVar);
                if (objD2 != aoluVar) {
                    r12 = nfdVar;
                    zBooleanValue = ((java.lang.Boolean) objD2).booleanValue();
                    ajcq ajcqVarAA2 = r12.aA();
                    nfjVar.a = r12;
                    nfjVar.b = zBooleanValue;
                    nfjVar.e = 2;
                    objD = aosv.D(ajcqVarAA2, nfjVar);
                    if (objD != aoluVar) {
                        r2 = r12;
                        z = zBooleanValue;
                        objD2 = objD;
                        bool = (java.lang.Boolean) aooh.q((j$.util.Optional) objD2);
                        if (bool != null) {
                            zBooleanValue2 = bool.booleanValue();
                        } else {
                            zBooleanValue2 = false;
                        }
                        if (z) {
                        }
                        nfjVar.a = null;
                        nfjVar.e = 3;
                        objI = i(r2, 1989, nfjVar);
                        if (objI != aoluVar) {
                            return objI;
                        }
                    }
                }
            } else {
                ajcq ajcqVarAA3 = nfdVar.aA();
                nfjVar.a = nfdVar;
                nfjVar.e = 4;
                objD2 = aosv.D(ajcqVarAA3, nfjVar);
                if (objD2 != aoluVar) {
                    r13 = nfdVar;
                    bool2 = (java.lang.Boolean) aooh.q((j$.util.Optional) objD2);
                    if (bool2 != null) {
                    }
                    return java.lang.Boolean.FALSE;
                }
            }
        }
        r13 = nfdVar;
        r12 = nfdVar;
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.nfd nfdVar, int i, aoln aolnVar) {
        defpackage.nfk nfkVar;
        oko okoVar;
        defpackage.nfo nfoVar;
        int i2;
        defpackage.nfo nfoVar2;
        oko okoVar2;
        if (aolnVar instanceof defpackage.nfk) {
            nfkVar = (defpackage.nfk) aolnVar;
            int i3 = nfkVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nfkVar.d = i3 - Integer.MIN_VALUE;
            } else {
                nfkVar = new defpackage.nfk(this, aolnVar);
            }
        } else {
            nfkVar = new defpackage.nfk(this, aolnVar);
        }
        java.lang.Object objO = nfkVar.b;
        aolu aoluVar = aolu.a;
        int i4 = nfkVar.d;
        java.lang.Integer num = null;
        if (i4 == 0) {
            aooc.af(objO);
            if (this.y == null) {
                oko okoVar3 = this.m;
                ajcq ajcqVarBe = nfdVar.be();
                nfkVar.e = this;
                nfkVar.f = okoVar3;
                nfkVar.a = i;
                nfkVar.d = 1;
                java.lang.Object objD = aosv.D(ajcqVarBe, nfkVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                objO = objD;
                okoVar = okoVar3;
                nfoVar = this;
            }
            java.lang.Integer num2 = this.y;
            return java.lang.Boolean.valueOf(num2 == null && num2.intValue() == i);
        }
        if (i4 == 1) {
            i = nfkVar.a;
            okoVar = nfkVar.f;
            nfoVar = nfkVar.e;
            aooc.af(objO);
        } else {
            if (i4 == 2) {
                i2 = nfkVar.a;
                nfoVar2 = nfkVar.e;
                aooc.af(objO);
                okoVar2 = (oko) objO;
                if (okoVar2 != null) {
                    nfkVar.e = nfoVar2;
                    nfkVar.a = i2;
                    nfkVar.d = 3;
                    objO = okoVar2.J(nfkVar);
                    if (objO == aoluVar) {
                        return aoluVar;
                    }
                }
                nfoVar2.y = num;
                i = i2;
                java.lang.Integer num3 = this.y;
                return java.lang.Boolean.valueOf(num3 == null && num3.intValue() == i);
            }
            if (i4 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = nfkVar.a;
            nfoVar2 = nfkVar.e;
            aooc.af(objO);
        }
        num = (java.lang.Integer) objO;
        nfoVar2.y = num;
        i = i2;
        java.lang.Integer num4 = this.y;
        return java.lang.Boolean.valueOf(num4 == null && num4.intValue() == i);
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objO);
        nfkVar.e = nfoVar;
        nfkVar.f = null;
        nfkVar.a = i;
        nfkVar.d = 2;
        objO = okoVar.O(phoneAccountHandle, nfkVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        i2 = i;
        nfoVar2 = nfoVar;
        okoVar2 = (oko) objO;
        if (okoVar2 != null) {
            nfkVar.e = nfoVar2;
            nfkVar.a = i2;
            nfkVar.d = 3;
            objO = okoVar2.J(nfkVar);
            if (objO == aoluVar) {
                return aoluVar;
            }
            num = (java.lang.Integer) objO;
        }
        nfoVar2.y = num;
        i = i2;
        java.lang.Integer num5 = this.y;
        return java.lang.Boolean.valueOf(num5 == null && num5.intValue() == i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.nfl nflVar;
        if (aolnVar instanceof defpackage.nfl) {
            nflVar = (defpackage.nfl) aolnVar;
            int i = nflVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nflVar.c = i - Integer.MIN_VALUE;
            } else {
                nflVar = new defpackage.nfl(this, aolnVar);
            }
        } else {
            nflVar = new defpackage.nfl(this, aolnVar);
        }
        java.lang.Object objAj = nflVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nflVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objAj);
            if (!((java.lang.Boolean) this.g.a()).booleanValue()) {
                return java.lang.Boolean.TRUE;
            }
            aolr aolrVar = this.h;
            defpackage.mhq mhqVar = new defpackage.mhq(this, (aoln) null, 8);
            nflVar.c = 1;
            objAj = aoov.aj(aolrVar, mhqVar, nflVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        int iIntValue = ((java.lang.Number) objAj).intValue();
        if (iIntValue != 0 && iIntValue != 4) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[PHI: r2 r10
      0x00a8: PHI (r2v3 oko) = (r2v2 oko), (r2v4 oko) binds: [B:30:0x0093, B:34:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r10v7 int) = (r10v6 int), (r10v8 int) binds: [B:30:0x0093, B:34:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.nfd nfdVar, int i, aoln aolnVar) {
        defpackage.nfm nfmVar;
        oko okoVar;
        int i2;
        oko okoVar2;
        defpackage.nfo nfoVar;
        java.lang.Integer num;
        defpackage.nfo nfoVar2;
        if (aolnVar instanceof defpackage.nfm) {
            nfmVar = (defpackage.nfm) aolnVar;
            int i3 = nfmVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nfmVar.e = i3 - Integer.MIN_VALUE;
            } else {
                nfmVar = new defpackage.nfm(this, aolnVar);
            }
        } else {
            nfmVar = new defpackage.nfm(this, aolnVar);
        }
        java.lang.Object objO = nfmVar.c;
        aolu aoluVar = aolu.a;
        int i4 = nfmVar.e;
        if (i4 != 0) {
            if (i4 == 1) {
                i = nfmVar.a;
                okoVar = (oko) nfmVar.b;
                aooc.af(objO);
            } else {
                if (i4 == 2) {
                    i2 = nfmVar.a;
                    aooc.af(objO);
                    okoVar2 = (oko) objO;
                    if (okoVar2 == null) {
                        return java.lang.Boolean.FALSE;
                    }
                    if (this.w == null) {
                        nfmVar.b = okoVar2;
                        nfmVar.f = this;
                        nfmVar.a = i2;
                        nfmVar.e = 3;
                        objO = okoVar2.H(nfmVar);
                        if (objO != aoluVar) {
                            return aoluVar;
                        }
                        nfoVar = this;
                        nfoVar.w = (java.lang.Integer) objO;
                        num = this.w;
                        if (num == null) {
                        }
                        if (this.x == null) {
                            nfmVar.b = this;
                            nfmVar.f = null;
                            nfmVar.a = i2;
                            nfmVar.e = 4;
                            objO = okoVar2.J(nfmVar);
                            if (objO == aoluVar) {
                                return aoluVar;
                            }
                            nfoVar2 = this;
                        }
                    } else {
                        num = this.w;
                        if (num == null) {
                        }
                        if (this.x == null) {
                            nfmVar.b = this;
                            nfmVar.f = null;
                            nfmVar.a = i2;
                            nfmVar.e = 4;
                            objO = okoVar2.J(nfmVar);
                            if (objO == aoluVar) {
                                return aoluVar;
                            }
                            nfoVar2 = this;
                        }
                    }
                    java.lang.Integer num2 = this.x;
                    return java.lang.Boolean.valueOf(num2 == null && num2.intValue() == i2);
                }
                if (i4 == 3) {
                    i2 = nfmVar.a;
                    nfoVar = nfmVar.f;
                    okoVar2 = (oko) nfmVar.b;
                    aooc.af(objO);
                    nfoVar.w = (java.lang.Integer) objO;
                    num = this.w;
                    if (num == null && num.intValue() == i2) {
                        return java.lang.Boolean.TRUE;
                    }
                    if (this.x == null) {
                        nfmVar.b = this;
                        nfmVar.f = null;
                        nfmVar.a = i2;
                        nfmVar.e = 4;
                        objO = okoVar2.J(nfmVar);
                        if (objO == aoluVar) {
                            return aoluVar;
                        }
                        nfoVar2 = this;
                    }
                    java.lang.Integer num3 = this.x;
                    return java.lang.Boolean.valueOf(num3 == null && num3.intValue() == i2);
                }
                if (i4 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = nfmVar.a;
                nfoVar2 = (defpackage.nfo) nfmVar.b;
                aooc.af(objO);
            }
            nfoVar2.x = (java.lang.Integer) objO;
            java.lang.Integer num4 = this.x;
            return java.lang.Boolean.valueOf(num4 == null && num4.intValue() == i2);
        }
        aooc.af(objO);
        oko okoVar3 = this.m;
        ajcq ajcqVarBe = nfdVar.be();
        nfmVar.b = okoVar3;
        nfmVar.a = i;
        nfmVar.e = 1;
        java.lang.Object objD = aosv.D(ajcqVarBe, nfmVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        objO = objD;
        okoVar = okoVar3;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objO);
        nfmVar.b = null;
        nfmVar.a = i;
        nfmVar.e = 2;
        objO = okoVar.O(phoneAccountHandle, nfmVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        i2 = i;
        okoVar2 = (oko) objO;
        if (okoVar2 == null) {
            return java.lang.Boolean.FALSE;
        }
        if (this.w == null) {
            nfmVar.b = okoVar2;
            nfmVar.f = this;
            nfmVar.a = i2;
            nfmVar.e = 3;
            objO = okoVar2.H(nfmVar);
            if (objO != aoluVar) {
                return aoluVar;
            }
            nfoVar = this;
            nfoVar.w = (java.lang.Integer) objO;
            num = this.w;
            if (num == null) {
            }
            if (this.x == null) {
                nfmVar.b = this;
                nfmVar.f = null;
                nfmVar.a = i2;
                nfmVar.e = 4;
                objO = okoVar2.J(nfmVar);
                if (objO == aoluVar) {
                    return aoluVar;
                }
                nfoVar2 = this;
                nfoVar2.x = (java.lang.Integer) objO;
            }
        } else {
            num = this.w;
            if (num == null) {
            }
            if (this.x == null) {
                nfmVar.b = this;
                nfmVar.f = null;
                nfmVar.a = i2;
                nfmVar.e = 4;
                objO = okoVar2.J(nfmVar);
                if (objO == aoluVar) {
                    return aoluVar;
                }
                nfoVar2 = this;
                nfoVar2.x = (java.lang.Integer) objO;
            }
        }
        java.lang.Integer num5 = this.x;
        return java.lang.Boolean.valueOf(num5 == null && num5.intValue() == i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.nfd nfdVar, aoln aolnVar) {
        defpackage.nfn nfnVar;
        if (aolnVar instanceof defpackage.nfn) {
            nfnVar = (defpackage.nfn) aolnVar;
            int i = nfnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nfnVar.c = i - Integer.MIN_VALUE;
            } else {
                nfnVar = new defpackage.nfn(this, aolnVar);
            }
        } else {
            nfnVar = new defpackage.nfn(this, aolnVar);
        }
        java.lang.Object objD = nfnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nfnVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarY = nfdVar.y();
            nfnVar.c = 1;
            objD = aosv.D(ajcqVarY, nfnVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        zpo zpoVar = (zpo) objD;
        a.b().l("com/android/dialer/dobby/impl/service/DobbyPreconditions", "isValidCallState", 458, "DobbyPreconditions.kt").y("call state: %s", zpoVar.name());
        int iOrdinal = zpoVar.ordinal();
        if (iOrdinal != 1 && iOrdinal != 3 && iOrdinal != 11) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }
}
