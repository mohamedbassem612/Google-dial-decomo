package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nbn implements defpackage.ihg {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyDuplexListener");
    public final defpackage.nej b;
    public final defpackage.mqt c;
    public final defpackage.nrv d;
    public final defpackage.mba e;
    public final mgu f;
    public final defpackage.mfz g;
    public final aoin h;
    public final aoin i;
    public alta j;
    public final ptx k;
    public final defpackage.ogj l;
    private final aolr m;
    private final aoss n;
    private final aoin o;
    private final odp p;
    private final defpackage.nbr q;
    private final pzm r;
    private final defpackage.ntb s;
    private final aoin t;
    private final aoin u;
    private final ruc v;
    private final zzx w;
    private final ahda x;

    public nbn(aolr aolrVar, aoss aossVar, defpackage.ogj ogjVar, defpackage.nej nejVar, defpackage.mqt mqtVar, defpackage.nrv nrvVar, aoin aoinVar, defpackage.mba mbaVar, zzx zzxVar, odp odpVar, mgu mguVar, defpackage.mfz mfzVar, defpackage.nbr nbrVar, pzm pzmVar, defpackage.ntb ntbVar, ptx ptxVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, ruc rucVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(nejVar, "dobbyLifecycleController");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nrvVar, "dobbySessionWriter");
        aooh.f(aoinVar, "dtmfTonePlayDurationMillis");
        aooh.f(mguVar, "recorder");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(pzmVar, "dtmfTonesPlayer");
        aooh.f(ntbVar, "dobbyTtsSessionProvider");
        aooh.f(ptxVar, "callProperties");
        aooh.f(aoinVar2, "enforceSingleFinalCallAction");
        aooh.f(aoinVar3, "ignorePlayingFallbackWithPendingCallAction");
        aooh.f(aoinVar4, "ignoreBotsAfterCallActionBot");
        aooh.f(aoinVar5, "enableKeepSelectedReplyChipState");
        aooh.f(rucVar, "metrics");
        this.m = aolrVar;
        this.n = aossVar;
        this.l = ogjVar;
        this.b = nejVar;
        this.c = mqtVar;
        this.d = nrvVar;
        this.o = aoinVar;
        this.e = mbaVar;
        this.w = zzxVar;
        this.p = odpVar;
        this.f = mguVar;
        this.g = mfzVar;
        this.q = nbrVar;
        this.r = pzmVar;
        this.s = ntbVar;
        this.k = ptxVar;
        this.h = aoinVar2;
        this.i = aoinVar3;
        this.t = aoinVar4;
        this.u = aoinVar5;
        this.v = rucVar;
        this.x = new ahda((byte[]) null);
    }

    public static final boolean t(alwp alwpVar) {
        apdi apdiVar = alwz.d;
        alwpVar.c(apdiVar);
        return ((alaa) alwpVar).n.l((alac) apdiVar.a);
    }

    public static final boolean u(alwp alwpVar) {
        apdi apdiVar = alxg.b;
        alwpVar.c(apdiVar);
        return ((alaa) alwpVar).n.l((alac) apdiVar.a);
    }

    public static final boolean v(alsi alsiVar) {
        apdi apdiVar = alst.d;
        alsiVar.c(apdiVar);
        return ((alaa) alsiVar).n.l((alac) apdiVar.a);
    }

    public static final boolean w(alwp alwpVar) {
        apdi apdiVar = alxy.i;
        alwpVar.c(apdiVar);
        return ((alaa) alwpVar).n.l((alac) apdiVar.a);
    }

    public static final boolean x(alsi alsiVar) {
        apdi apdiVar = alta.g;
        alsiVar.c(apdiVar);
        return ((alaa) alsiVar).n.l((alac) apdiVar.a);
    }

    private final int y(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            alww alwwVar = (alww) obj;
            int i = alwwVar.c;
            if (alwv.a(i) == alwv.a) {
                int iAQ = a.aQ((i == 3 ? (alyp) alwwVar.d : alyp.a).c);
                if (iAQ != 0 && iAQ == 2) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size();
    }

    private static final boolean z(alsy alsyVar) {
        int iOrdinal = alsyVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 3 || iOrdinal == 5;
    }

    @Override // defpackage.ihg
    public final java.lang.Object a(alio alioVar, aoln aolnVar) {
        java.lang.Object objF = f(ruc.bg, new defpackage.nbj(this, alioVar, null), aolnVar);
        return objF != aolu.a ? aojh.a : objF;
    }

    @Override // defpackage.ihg
    public final java.lang.Object b(altn altnVar, aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.m, new defpackage.msi(this, altnVar, (aoln) null, 19), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    @Override // defpackage.ihg
    public final java.lang.Object c(alsi alsiVar, aoln aolnVar) {
        aenj aenjVar;
        if (x(alsiVar)) {
            aenjVar = ruc.bb;
        } else if (v(alsiVar)) {
            aenjVar = ruc.bd;
        } else {
            apdi apdiVar = alwp.b;
            alsiVar.c(apdiVar);
            if (((alaa) alsiVar).n.l((alac) apdiVar.a)) {
                aooh.e(apdiVar, "callAssistantOutboundEvent");
                alwp alwpVar = (alwp) akmr.x(alsiVar, apdiVar);
                aooh.c(alwpVar);
                if (t(alwpVar)) {
                    aenjVar = ruc.bc;
                } else if (w(alwpVar)) {
                    aenjVar = ruc.be;
                } else if (u(alwpVar)) {
                    aenjVar = ruc.bf;
                } else {
                    aenjVar = null;
                }
            } else {
                aenjVar = null;
            }
        }
        java.lang.Object objF = f(aenjVar, new defpackage.nbl(this, alsiVar, null), aolnVar);
        return objF != aolu.a ? aojh.a : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.nab nabVar;
        if (aolnVar instanceof defpackage.nab) {
            nabVar = (defpackage.nab) aolnVar;
            int i = nabVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nabVar.c = i - Integer.MIN_VALUE;
            } else {
                nabVar = new defpackage.nab(this, aolnVar);
            }
        } else {
            nabVar = new defpackage.nab(this, aolnVar);
        }
        java.lang.Object objA = nabVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nabVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.ogj ogjVar = this.l;
            nabVar.c = 1;
            objA = ogjVar.a(nabVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.nms nmsVarB = defpackage.nms.b(((defpackage.nmu) objA).t);
        return nmsVarB == null ? defpackage.nms.UNRECOGNIZED : nmsVarB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.nac nacVar;
        if (aolnVar instanceof defpackage.nac) {
            nacVar = (defpackage.nac) aolnVar;
            int i = nacVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nacVar.c = i - Integer.MIN_VALUE;
            } else {
                nacVar = new defpackage.nac(this, aolnVar);
            }
        } else {
            nacVar = new defpackage.nac(this, aolnVar);
        }
        java.lang.Object objA = nacVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nacVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.ogj ogjVar = this.l;
            nacVar.c = 1;
            objA = ogjVar.a(nacVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.nms nmsVarB = defpackage.nms.b(((defpackage.nmu) objA).s);
        return nmsVarB == null ? defpackage.nms.UNRECOGNIZED : nmsVarB;
    }

    public final java.lang.Object f(aenj aenjVar, aonj aonjVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.n, this.x, new defpackage.muz(pez.aR(this.v, ruc.ba, aenjVar, new defpackage.kqu(aonjVar, (aoln) null, 8)), (aoln) null, 14, (byte[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(alwp alwpVar, aoln aolnVar) {
        defpackage.nad nadVar;
        if (aolnVar instanceof defpackage.nad) {
            nadVar = (defpackage.nad) aolnVar;
            int i = nadVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nadVar.c = i - Integer.MIN_VALUE;
            } else {
                nadVar = new defpackage.nad(this, aolnVar);
            }
        } else {
            nadVar = new defpackage.nad(this, aolnVar);
        }
        java.lang.Object obj = nadVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nadVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                alwpVar = nadVar.d;
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
        a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleAudioMatchEvent", 999, "DobbyDuplexListener.kt").v("handling audio match event");
        defpackage.mqt mqtVar = this.c;
        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DUPLEX_AUDIO_MATCH_DETECTED;
        nadVar.d = alwpVar;
        nadVar.c = 1;
        if (mqtVar.x(nvpVar, nadVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.mqt mqtVar2 = this.c;
        apdi apdiVar = alwg.c;
        aooh.e(apdiVar, "audioMatchOutboundEvent");
        alag alagVar = ((alwg) akmr.x(alwpVar, apdiVar)).b;
        aooh.e(alagVar, "getMeasuredDistancesList(...)");
        nadVar.d = null;
        nadVar.c = 2;
        if (mqtVar2.f(alagVar, nadVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:101:0x0248  */
    /* JADX WARN: Code duplicated, block: B:104:0x0250  */
    /* JADX WARN: Code duplicated, block: B:105:0x0252  */
    /* JADX WARN: Code duplicated, block: B:106:0x0254  */
    /* JADX WARN: Code duplicated, block: B:107:0x0256  */
    /* JADX WARN: Code duplicated, block: B:112:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0126  */
    /* JADX WARN: Code duplicated, block: B:49:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x018f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0194  */
    /* JADX WARN: Code duplicated, block: B:59:0x0197  */
    /* JADX WARN: Code duplicated, block: B:61:0x019a  */
    /* JADX WARN: Code duplicated, block: B:62:0x019c  */
    /* JADX WARN: Code duplicated, block: B:63:0x019e  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x020e  */
    /* JADX WARN: Code duplicated, block: B:89:0x022f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0237  */
    /* JADX WARN: Code duplicated, block: B:94:0x023c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0242  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245  */
    public final java.lang.Object h(alwp alwpVar, aoln aolnVar) throws aois {
        aoln naeVar;
        alwz alwzVar;
        defpackage.nmk nmkVarD;
        alwy alwyVar;
        defpackage.nbn nbnVar;
        alwy alwyVar2;
        int iY;
        alat alatVar;
        defpackage.ogj ogjVar;
        alwz alwzVar2;
        alwy alwyVar3;
        alyg alygVar;
        defpackage.mqt mqtVar;
        java.util.ArrayList arrayList;
        alyg alygVar2;
        akzx akzxVarM;
        int iAN;
        int i;
        int i2;
        alyh alyhVarB;
        int iOrdinal;
        defpackage.njf njfVar;
        defpackage.njg njgVar;
        alak alakVar;
        int iR;
        int i3;
        int i4;
        defpackage.mqt mqtVar2;
        defpackage.nvp nvpVar;
        java.util.ArrayList arrayList2;
        java.util.Iterator it;
        defpackage.mqt mqtVar3;
        defpackage.nvp nvpVar2;
        alyh alyhVarB2;
        if (aolnVar instanceof defpackage.nae) {
            naeVar = (defpackage.nae) aolnVar;
            int i5 = naeVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                naeVar.d = i5 - Integer.MIN_VALUE;
            } else {
                naeVar = new defpackage.nae(this, aolnVar);
            }
        } else {
            naeVar = new defpackage.nae(this, aolnVar);
        }
        java.lang.Object objA = naeVar.b;
        aolu aoluVar = aolu.a;
        switch (naeVar.d) {
            case 0:
                aooc.af(objA);
                apdi apdiVar = alwz.d;
                aooh.e(apdiVar, "conversationStateUpdateOutboundEvent");
                alwzVar = (alwz) akmr.x(alwpVar, apdiVar);
                defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                defpackage.nlw nlwVar = defpackage.nlw.a;
                defpackage.nwj nwjVarN = mni.N(nlwVar.m());
                alwy alwyVar4 = alwzVar.c;
                if (alwyVar4 == null) {
                    alwyVar4 = alwy.a;
                }
                aooh.e(alwyVar4, "getConversationState(...)");
                nwjVarN.B(alwyVar4);
                npwVarAB.J(nwjVarN.A());
                nmkVarD = npwVarAB.D();
                if (nmkVarD.b == 2) {
                    nlwVar = (defpackage.nlw) nmkVarD.c;
                }
                alwy alwyVar5 = nlwVar.c;
                if (alwyVar5 == null) {
                    alwyVar5 = alwy.a;
                }
                alwyVar = alwyVar5;
                aooh.e(alwyVar, "getNewConversationState(...)");
                defpackage.ogj ogjVar2 = this.l;
                naeVar.a = alwzVar;
                naeVar.e = nmkVarD;
                naeVar.f = this;
                naeVar.g = alwyVar;
                naeVar.d = 1;
                objA = ogjVar2.a(naeVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                nbnVar = this;
                alwyVar2 = ((defpackage.nmu) objA).d;
                if (alwyVar2 == null) {
                    alwyVar2 = alwy.a;
                }
                aooh.e(alwyVar2, "getConversationState(...)");
                alat alatVar2 = alwyVar.c;
                aooh.e(alatVar2, "getConversationItemsList(...)");
                iY = nbnVar.y(alatVar2);
                alatVar = alwyVar2.c;
                aooh.e(alatVar, "getConversationItemsList(...)");
                if (iY > nbnVar.y(alatVar)) {
                    nbnVar.e.b(mce.bP);
                }
                ogjVar = this.l;
                naeVar.a = alwzVar;
                naeVar.e = null;
                naeVar.f = null;
                naeVar.g = null;
                naeVar.d = 2;
                if (ogjVar.b(nmkVarD, naeVar) != aoluVar) {
                    return aoluVar;
                }
                alwzVar2 = alwzVar;
                aooh.c(alwzVar2);
                naeVar.a = alwzVar2;
                naeVar.d = 3;
                if (r(alwzVar2, naeVar) == aoluVar) {
                    return aoluVar;
                }
                alwyVar3 = alwzVar2.c;
                if (alwyVar3 == null) {
                    alwyVar3 = alwy.a;
                }
                alygVar = alwyVar3.d;
                if (alygVar == null) {
                    alygVar = alyg.a;
                }
                aooh.e(alygVar, "getLatestSuggestedReplies(...)");
                if (alygVar.d) {
                    mqtVar = this.c;
                    alat<alyi> alatVar3 = alygVar.c;
                    aooh.e(alatVar3, "getSuggestedRepliesList(...)");
                    arrayList = new java.util.ArrayList(ajsz.bl(alatVar3, 10));
                    for (alyi alyiVar : alatVar3) {
                        aooh.c(alyiVar);
                        aooh.f(alyiVar, "duplexSuggestedReply");
                        akzxVarM = defpackage.njg.b.m();
                        aooh.f(akzxVarM, "builder");
                        long j = alyiVar.c;
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).d = j;
                        java.lang.String str = alyiVar.d;
                        aooh.e(str, "getText(...)");
                        aooh.f(str, "value");
                        akzxVarM.u();
                        defpackage.njg njgVar2 = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        njgVar2.e = str;
                        iAN = a.aN(alyiVar.e);
                        if (iAN == 0) {
                            iAN = 1;
                        }
                        i = iAN - 1;
                        if (i != 1) {
                            i2 = 3;
                        } else if (i != 2) {
                            i2 = 4;
                        } else if (i != 3) {
                            i2 = 2;
                        } else {
                            i2 = 5;
                        }
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).f = a.Q(i2);
                        new alct(new alam(((defpackage.njg) akzxVarM.b).g, defpackage.njg.a));
                        alyhVarB = alyh.b(alyiVar.f);
                        if (alyhVarB == null) {
                            alyhVarB = alyh.a;
                        }
                        iOrdinal = alyhVarB.ordinal();
                        if (iOrdinal != 1) {
                            njfVar = defpackage.njf.REPORT_SPAM;
                        } else if (iOrdinal != 2) {
                            njfVar = defpackage.njf.END_CALL;
                        } else if (iOrdinal != 3) {
                            njfVar = defpackage.njf.PLAY_DTMF_TONE;
                        } else if (iOrdinal != 4) {
                            njfVar = defpackage.njf.UNKNOWN_ACTION;
                        } else {
                            njfVar = defpackage.njf.ASK_FOR_CONSENT_FOR_AI_REPLIES;
                        }
                        akzxVarM.u();
                        njgVar = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(njfVar);
                        alakVar = njgVar.g;
                        if (!alakVar.c()) {
                            njgVar.g = alad.H(alakVar);
                        }
                        njgVar.g.g(njfVar.a());
                        if ((alyiVar.b & 16) != 0) {
                            java.lang.String str2 = alyiVar.g;
                            aooh.e(str2, "getContentId(...)");
                            aooh.f(str2, "value");
                            akzxVarM.u();
                            defpackage.njg njgVar3 = (defpackage.njg) akzxVarM.b;
                            j$.util.Objects.requireNonNull(str2);
                            njgVar3.c |= 1;
                            njgVar3.h = str2;
                        }
                        if ((alyiVar.b & 32) == 0) {
                            iR = defpackage.airh.r(alyiVar.h);
                            if (iR == 0) {
                                iR = 1;
                            }
                            i3 = iR - 1;
                            if (i3 != 0) {
                                i4 = 2;
                            } else if (i3 != 2) {
                                i4 = 3;
                            } else if (i3 != 3) {
                                i4 = 4;
                            } else if (i3 != 4) {
                                i4 = 5;
                            } else {
                                if (i3 == 5) {
                                    throw new aois();
                                }
                                i4 = 6;
                            }
                            akzxVarM.u();
                            defpackage.njg njgVar4 = (defpackage.njg) akzxVarM.b;
                            njgVar4.i = a.R(i4);
                            njgVar4.c |= 2;
                        }
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        arrayList.add((defpackage.njg) aladVarP);
                    }
                    naeVar.a = alygVar;
                    naeVar.d = 4;
                    if (mqtVar.D(arrayList, naeVar) != aoluVar) {
                        return aoluVar;
                    }
                    alygVar2 = alygVar;
                    mqtVar2 = this.c;
                    nvpVar = defpackage.nvp.EVENT_DUPLEX_SUGGESTED_REPLY_CHIPS_DISPLAYED;
                    naeVar.a = alygVar2;
                    naeVar.d = 5;
                    if (mqtVar2.x(nvpVar, naeVar) == aoluVar) {
                        return aoluVar;
                    }
                    alat alatVar4 = alygVar2.c;
                    aooh.e(alatVar4, "getSuggestedRepliesList(...)");
                    arrayList2 = new java.util.ArrayList(ajsz.bl(alatVar4, 10));
                    it = alatVar4.iterator();
                    while (it.hasNext()) {
                        alyhVarB2 = alyh.b(((alyi) it.next()).f);
                        if (alyhVarB2 == null) {
                            alyhVarB2 = alyh.a;
                        }
                        arrayList2.add(alyhVarB2);
                    }
                    if (arrayList2.contains(alyh.e)) {
                        mqtVar3 = this.c;
                        nvpVar2 = defpackage.nvp.EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED;
                        naeVar.a = null;
                        naeVar.d = 6;
                        if (mqtVar3.x(nvpVar2, naeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 1:
                alwyVar = naeVar.g;
                nbnVar = naeVar.f;
                nmkVarD = naeVar.e;
                alwzVar = (alwz) naeVar.a;
                aooc.af(objA);
                alwyVar2 = ((defpackage.nmu) objA).d;
                if (alwyVar2 == null) {
                    alwyVar2 = alwy.a;
                }
                aooh.e(alwyVar2, "getConversationState(...)");
                alat alatVar5 = alwyVar.c;
                aooh.e(alatVar5, "getConversationItemsList(...)");
                iY = nbnVar.y(alatVar5);
                alatVar = alwyVar2.c;
                aooh.e(alatVar, "getConversationItemsList(...)");
                if (iY > nbnVar.y(alatVar)) {
                    nbnVar.e.b(mce.bP);
                }
                ogjVar = this.l;
                naeVar.a = alwzVar;
                naeVar.e = null;
                naeVar.f = null;
                naeVar.g = null;
                naeVar.d = 2;
                if (ogjVar.b(nmkVarD, naeVar) != aoluVar) {
                    return aoluVar;
                }
                alwzVar2 = alwzVar;
                aooh.c(alwzVar2);
                naeVar.a = alwzVar2;
                naeVar.d = 3;
                if (r(alwzVar2, naeVar) == aoluVar) {
                    return aoluVar;
                }
                alwyVar3 = alwzVar2.c;
                if (alwyVar3 == null) {
                    alwyVar3 = alwy.a;
                }
                alygVar = alwyVar3.d;
                if (alygVar == null) {
                    alygVar = alyg.a;
                }
                aooh.e(alygVar, "getLatestSuggestedReplies(...)");
                if (alygVar.d) {
                    mqtVar = this.c;
                    alat<alyi> alatVar6 = alygVar.c;
                    aooh.e(alatVar6, "getSuggestedRepliesList(...)");
                    arrayList = new java.util.ArrayList(ajsz.bl(alatVar6, 10));
                    while (r5.hasNext()) {
                        aooh.c(alyiVar);
                        aooh.f(alyiVar, "duplexSuggestedReply");
                        akzxVarM = defpackage.njg.b.m();
                        aooh.f(akzxVarM, "builder");
                        long j2 = alyiVar.c;
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).d = j2;
                        java.lang.String str3 = alyiVar.d;
                        aooh.e(str3, "getText(...)");
                        aooh.f(str3, "value");
                        akzxVarM.u();
                        defpackage.njg njgVar5 = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str3);
                        njgVar5.e = str3;
                        iAN = a.aN(alyiVar.e);
                        if (iAN == 0) {
                            iAN = 1;
                        }
                        i = iAN - 1;
                        if (i != 1) {
                            i2 = 3;
                        } else if (i != 2) {
                            i2 = 4;
                        } else if (i != 3) {
                            i2 = 2;
                        } else {
                            i2 = 5;
                        }
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).f = a.Q(i2);
                        new alct(new alam(((defpackage.njg) akzxVarM.b).g, defpackage.njg.a));
                        alyhVarB = alyh.b(alyiVar.f);
                        if (alyhVarB == null) {
                            alyhVarB = alyh.a;
                        }
                        iOrdinal = alyhVarB.ordinal();
                        if (iOrdinal != 1) {
                            njfVar = defpackage.njf.REPORT_SPAM;
                        } else if (iOrdinal != 2) {
                            njfVar = defpackage.njf.END_CALL;
                        } else if (iOrdinal != 3) {
                            njfVar = defpackage.njf.PLAY_DTMF_TONE;
                        } else if (iOrdinal != 4) {
                            njfVar = defpackage.njf.UNKNOWN_ACTION;
                        } else {
                            njfVar = defpackage.njf.ASK_FOR_CONSENT_FOR_AI_REPLIES;
                        }
                        akzxVarM.u();
                        njgVar = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(njfVar);
                        alakVar = njgVar.g;
                        if (!alakVar.c()) {
                            njgVar.g = alad.H(alakVar);
                        }
                        njgVar.g.g(njfVar.a());
                        if ((alyiVar.b & 16) != 0) {
                            java.lang.String str4 = alyiVar.g;
                            aooh.e(str4, "getContentId(...)");
                            aooh.f(str4, "value");
                            akzxVarM.u();
                            defpackage.njg njgVar6 = (defpackage.njg) akzxVarM.b;
                            j$.util.Objects.requireNonNull(str4);
                            njgVar6.c |= 1;
                            njgVar6.h = str4;
                        }
                        if ((alyiVar.b & 32) == 0) {
                            iR = defpackage.airh.r(alyiVar.h);
                            if (iR == 0) {
                                iR = 1;
                            }
                            i3 = iR - 1;
                            if (i3 != 0) {
                                i4 = 2;
                            } else if (i3 != 2) {
                                i4 = 3;
                            } else if (i3 != 3) {
                                i4 = 4;
                            } else if (i3 != 4) {
                                i4 = 5;
                            } else {
                                if (i3 == 5) {
                                    throw new aois();
                                }
                                i4 = 6;
                            }
                            akzxVarM.u();
                            defpackage.njg njgVar7 = (defpackage.njg) akzxVarM.b;
                            njgVar7.i = a.R(i4);
                            njgVar7.c |= 2;
                        }
                        alad aladVarP2 = akzxVarM.p();
                        aooh.e(aladVarP2, "build(...)");
                        arrayList.add((defpackage.njg) aladVarP2);
                    }
                    naeVar.a = alygVar;
                    naeVar.d = 4;
                    if (mqtVar.D(arrayList, naeVar) != aoluVar) {
                        return aoluVar;
                    }
                    alygVar2 = alygVar;
                    mqtVar2 = this.c;
                    nvpVar = defpackage.nvp.EVENT_DUPLEX_SUGGESTED_REPLY_CHIPS_DISPLAYED;
                    naeVar.a = alygVar2;
                    naeVar.d = 5;
                    if (mqtVar2.x(nvpVar, naeVar) == aoluVar) {
                        return aoluVar;
                    }
                    alat alatVar7 = alygVar2.c;
                    aooh.e(alatVar7, "getSuggestedRepliesList(...)");
                    arrayList2 = new java.util.ArrayList(ajsz.bl(alatVar7, 10));
                    it = alatVar7.iterator();
                    while (it.hasNext()) {
                        alyhVarB2 = alyh.b(((alyi) it.next()).f);
                        if (alyhVarB2 == null) {
                            alyhVarB2 = alyh.a;
                        }
                        arrayList2.add(alyhVarB2);
                    }
                    if (arrayList2.contains(alyh.e)) {
                        mqtVar3 = this.c;
                        nvpVar2 = defpackage.nvp.EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED;
                        naeVar.a = null;
                        naeVar.d = 6;
                        if (mqtVar3.x(nvpVar2, naeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 2:
                alwzVar2 = (alwz) naeVar.a;
                aooc.af(objA);
                aooh.c(alwzVar2);
                naeVar.a = alwzVar2;
                naeVar.d = 3;
                if (r(alwzVar2, naeVar) == aoluVar) {
                    return aoluVar;
                }
                alwyVar3 = alwzVar2.c;
                if (alwyVar3 == null) {
                    alwyVar3 = alwy.a;
                }
                alygVar = alwyVar3.d;
                if (alygVar == null) {
                    alygVar = alyg.a;
                }
                aooh.e(alygVar, "getLatestSuggestedReplies(...)");
                if (alygVar.d) {
                    mqtVar = this.c;
                    alat<alyi> alatVar8 = alygVar.c;
                    aooh.e(alatVar8, "getSuggestedRepliesList(...)");
                    arrayList = new java.util.ArrayList(ajsz.bl(alatVar8, 10));
                    while (r5.hasNext()) {
                        aooh.c(alyiVar);
                        aooh.f(alyiVar, "duplexSuggestedReply");
                        akzxVarM = defpackage.njg.b.m();
                        aooh.f(akzxVarM, "builder");
                        long j3 = alyiVar.c;
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).d = j3;
                        java.lang.String str5 = alyiVar.d;
                        aooh.e(str5, "getText(...)");
                        aooh.f(str5, "value");
                        akzxVarM.u();
                        defpackage.njg njgVar8 = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str5);
                        njgVar8.e = str5;
                        iAN = a.aN(alyiVar.e);
                        if (iAN == 0) {
                            iAN = 1;
                        }
                        i = iAN - 1;
                        if (i != 1) {
                            i2 = 3;
                        } else if (i != 2) {
                            i2 = 4;
                        } else if (i != 3) {
                            i2 = 2;
                        } else {
                            i2 = 5;
                        }
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).f = a.Q(i2);
                        new alct(new alam(((defpackage.njg) akzxVarM.b).g, defpackage.njg.a));
                        alyhVarB = alyh.b(alyiVar.f);
                        if (alyhVarB == null) {
                            alyhVarB = alyh.a;
                        }
                        iOrdinal = alyhVarB.ordinal();
                        if (iOrdinal != 1) {
                            njfVar = defpackage.njf.REPORT_SPAM;
                        } else if (iOrdinal != 2) {
                            njfVar = defpackage.njf.END_CALL;
                        } else if (iOrdinal != 3) {
                            njfVar = defpackage.njf.PLAY_DTMF_TONE;
                        } else if (iOrdinal != 4) {
                            njfVar = defpackage.njf.UNKNOWN_ACTION;
                        } else {
                            njfVar = defpackage.njf.ASK_FOR_CONSENT_FOR_AI_REPLIES;
                        }
                        akzxVarM.u();
                        njgVar = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(njfVar);
                        alakVar = njgVar.g;
                        if (!alakVar.c()) {
                            njgVar.g = alad.H(alakVar);
                        }
                        njgVar.g.g(njfVar.a());
                        if ((alyiVar.b & 16) != 0) {
                            java.lang.String str6 = alyiVar.g;
                            aooh.e(str6, "getContentId(...)");
                            aooh.f(str6, "value");
                            akzxVarM.u();
                            defpackage.njg njgVar9 = (defpackage.njg) akzxVarM.b;
                            j$.util.Objects.requireNonNull(str6);
                            njgVar9.c |= 1;
                            njgVar9.h = str6;
                        }
                        if ((alyiVar.b & 32) == 0) {
                            iR = defpackage.airh.r(alyiVar.h);
                            if (iR == 0) {
                                iR = 1;
                            }
                            i3 = iR - 1;
                            if (i3 != 0) {
                                i4 = 2;
                            } else if (i3 != 2) {
                                i4 = 3;
                            } else if (i3 != 3) {
                                i4 = 4;
                            } else if (i3 != 4) {
                                i4 = 5;
                            } else {
                                if (i3 == 5) {
                                    throw new aois();
                                }
                                i4 = 6;
                            }
                            akzxVarM.u();
                            defpackage.njg njgVar10 = (defpackage.njg) akzxVarM.b;
                            njgVar10.i = a.R(i4);
                            njgVar10.c |= 2;
                        }
                        alad aladVarP3 = akzxVarM.p();
                        aooh.e(aladVarP3, "build(...)");
                        arrayList.add((defpackage.njg) aladVarP3);
                    }
                    naeVar.a = alygVar;
                    naeVar.d = 4;
                    if (mqtVar.D(arrayList, naeVar) != aoluVar) {
                        return aoluVar;
                    }
                    alygVar2 = alygVar;
                    mqtVar2 = this.c;
                    nvpVar = defpackage.nvp.EVENT_DUPLEX_SUGGESTED_REPLY_CHIPS_DISPLAYED;
                    naeVar.a = alygVar2;
                    naeVar.d = 5;
                    if (mqtVar2.x(nvpVar, naeVar) == aoluVar) {
                        return aoluVar;
                    }
                    alat alatVar9 = alygVar2.c;
                    aooh.e(alatVar9, "getSuggestedRepliesList(...)");
                    arrayList2 = new java.util.ArrayList(ajsz.bl(alatVar9, 10));
                    it = alatVar9.iterator();
                    while (it.hasNext()) {
                        alyhVarB2 = alyh.b(((alyi) it.next()).f);
                        if (alyhVarB2 == null) {
                            alyhVarB2 = alyh.a;
                        }
                        arrayList2.add(alyhVarB2);
                    }
                    if (arrayList2.contains(alyh.e)) {
                        mqtVar3 = this.c;
                        nvpVar2 = defpackage.nvp.EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED;
                        naeVar.a = null;
                        naeVar.d = 6;
                        if (mqtVar3.x(nvpVar2, naeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 3:
                alwzVar2 = (alwz) naeVar.a;
                aooc.af(objA);
                alwyVar3 = alwzVar2.c;
                if (alwyVar3 == null) {
                    alwyVar3 = alwy.a;
                }
                alygVar = alwyVar3.d;
                if (alygVar == null) {
                    alygVar = alyg.a;
                }
                aooh.e(alygVar, "getLatestSuggestedReplies(...)");
                if (alygVar.d) {
                    mqtVar = this.c;
                    alat<alyi> alatVar10 = alygVar.c;
                    aooh.e(alatVar10, "getSuggestedRepliesList(...)");
                    arrayList = new java.util.ArrayList(ajsz.bl(alatVar10, 10));
                    while (r5.hasNext()) {
                        aooh.c(alyiVar);
                        aooh.f(alyiVar, "duplexSuggestedReply");
                        akzxVarM = defpackage.njg.b.m();
                        aooh.f(akzxVarM, "builder");
                        long j4 = alyiVar.c;
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).d = j4;
                        java.lang.String str7 = alyiVar.d;
                        aooh.e(str7, "getText(...)");
                        aooh.f(str7, "value");
                        akzxVarM.u();
                        defpackage.njg njgVar11 = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str7);
                        njgVar11.e = str7;
                        iAN = a.aN(alyiVar.e);
                        if (iAN == 0) {
                            iAN = 1;
                        }
                        i = iAN - 1;
                        if (i != 1) {
                            i2 = 3;
                        } else if (i != 2) {
                            i2 = 4;
                        } else if (i != 3) {
                            i2 = 2;
                        } else {
                            i2 = 5;
                        }
                        akzxVarM.u();
                        ((defpackage.njg) akzxVarM.b).f = a.Q(i2);
                        new alct(new alam(((defpackage.njg) akzxVarM.b).g, defpackage.njg.a));
                        alyhVarB = alyh.b(alyiVar.f);
                        if (alyhVarB == null) {
                            alyhVarB = alyh.a;
                        }
                        iOrdinal = alyhVarB.ordinal();
                        if (iOrdinal != 1) {
                            njfVar = defpackage.njf.REPORT_SPAM;
                        } else if (iOrdinal != 2) {
                            njfVar = defpackage.njf.END_CALL;
                        } else if (iOrdinal != 3) {
                            njfVar = defpackage.njf.PLAY_DTMF_TONE;
                        } else if (iOrdinal != 4) {
                            njfVar = defpackage.njf.UNKNOWN_ACTION;
                        } else {
                            njfVar = defpackage.njf.ASK_FOR_CONSENT_FOR_AI_REPLIES;
                        }
                        akzxVarM.u();
                        njgVar = (defpackage.njg) akzxVarM.b;
                        j$.util.Objects.requireNonNull(njfVar);
                        alakVar = njgVar.g;
                        if (!alakVar.c()) {
                            njgVar.g = alad.H(alakVar);
                        }
                        njgVar.g.g(njfVar.a());
                        if ((alyiVar.b & 16) != 0) {
                            java.lang.String str8 = alyiVar.g;
                            aooh.e(str8, "getContentId(...)");
                            aooh.f(str8, "value");
                            akzxVarM.u();
                            defpackage.njg njgVar12 = (defpackage.njg) akzxVarM.b;
                            j$.util.Objects.requireNonNull(str8);
                            njgVar12.c |= 1;
                            njgVar12.h = str8;
                        }
                        if ((alyiVar.b & 32) == 0) {
                            iR = defpackage.airh.r(alyiVar.h);
                            if (iR == 0) {
                                iR = 1;
                            }
                            i3 = iR - 1;
                            if (i3 != 0) {
                                i4 = 2;
                            } else if (i3 != 2) {
                                i4 = 3;
                            } else if (i3 != 3) {
                                i4 = 4;
                            } else if (i3 != 4) {
                                i4 = 5;
                            } else {
                                if (i3 == 5) {
                                    throw new aois();
                                }
                                i4 = 6;
                            }
                            akzxVarM.u();
                            defpackage.njg njgVar13 = (defpackage.njg) akzxVarM.b;
                            njgVar13.i = a.R(i4);
                            njgVar13.c |= 2;
                        }
                        alad aladVarP4 = akzxVarM.p();
                        aooh.e(aladVarP4, "build(...)");
                        arrayList.add((defpackage.njg) aladVarP4);
                    }
                    naeVar.a = alygVar;
                    naeVar.d = 4;
                    if (mqtVar.D(arrayList, naeVar) != aoluVar) {
                        return aoluVar;
                    }
                    alygVar2 = alygVar;
                    mqtVar2 = this.c;
                    nvpVar = defpackage.nvp.EVENT_DUPLEX_SUGGESTED_REPLY_CHIPS_DISPLAYED;
                    naeVar.a = alygVar2;
                    naeVar.d = 5;
                    if (mqtVar2.x(nvpVar, naeVar) == aoluVar) {
                        return aoluVar;
                    }
                    alat alatVar11 = alygVar2.c;
                    aooh.e(alatVar11, "getSuggestedRepliesList(...)");
                    arrayList2 = new java.util.ArrayList(ajsz.bl(alatVar11, 10));
                    it = alatVar11.iterator();
                    while (it.hasNext()) {
                        alyhVarB2 = alyh.b(((alyi) it.next()).f);
                        if (alyhVarB2 == null) {
                            alyhVarB2 = alyh.a;
                        }
                        arrayList2.add(alyhVarB2);
                    }
                    if (arrayList2.contains(alyh.e)) {
                        mqtVar3 = this.c;
                        nvpVar2 = defpackage.nvp.EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED;
                        naeVar.a = null;
                        naeVar.d = 6;
                        if (mqtVar3.x(nvpVar2, naeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 4:
                alygVar2 = (alyg) naeVar.a;
                aooc.af(objA);
                mqtVar2 = this.c;
                nvpVar = defpackage.nvp.EVENT_DUPLEX_SUGGESTED_REPLY_CHIPS_DISPLAYED;
                naeVar.a = alygVar2;
                naeVar.d = 5;
                if (mqtVar2.x(nvpVar, naeVar) == aoluVar) {
                    return aoluVar;
                }
                alat alatVar12 = alygVar2.c;
                aooh.e(alatVar12, "getSuggestedRepliesList(...)");
                arrayList2 = new java.util.ArrayList(ajsz.bl(alatVar12, 10));
                it = alatVar12.iterator();
                while (it.hasNext()) {
                    alyhVarB2 = alyh.b(((alyi) it.next()).f);
                    if (alyhVarB2 == null) {
                        alyhVarB2 = alyh.a;
                    }
                    arrayList2.add(alyhVarB2);
                }
                if (arrayList2.contains(alyh.e)) {
                    mqtVar3 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED;
                    naeVar.a = null;
                    naeVar.d = 6;
                    if (mqtVar3.x(nvpVar2, naeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 5:
                alygVar2 = (alyg) naeVar.a;
                aooc.af(objA);
                alat alatVar13 = alygVar2.c;
                aooh.e(alatVar13, "getSuggestedRepliesList(...)");
                arrayList2 = new java.util.ArrayList(ajsz.bl(alatVar13, 10));
                it = alatVar13.iterator();
                while (it.hasNext()) {
                    alyhVarB2 = alyh.b(((alyi) it.next()).f);
                    if (alyhVarB2 == null) {
                        alyhVarB2 = alyh.a;
                    }
                    arrayList2.add(alyhVarB2);
                }
                if (arrayList2.contains(alyh.e)) {
                    mqtVar3 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED;
                    naeVar.a = null;
                    naeVar.d = 6;
                    if (mqtVar3.x(nvpVar2, naeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 6:
                aooc.af(objA);
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:67:0x0117  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:75:0x0131  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object i(alsi alsiVar, aoln aolnVar) throws aois {
        defpackage.naf nafVar;
        alrm alrmVar;
        int i;
        int i2;
        defpackage.mqt mqtVar;
        alrk alrkVar;
        alry alryVar;
        alrx alrxVarB;
        if (aolnVar instanceof defpackage.naf) {
            nafVar = (defpackage.naf) aolnVar;
            int i3 = nafVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nafVar.c = i3 - Integer.MIN_VALUE;
            } else {
                nafVar = new defpackage.naf(this, aolnVar);
            }
        } else {
            nafVar = new defpackage.naf(this, aolnVar);
        }
        java.lang.Object obj = nafVar.a;
        aolu aoluVar = aolu.a;
        int i4 = nafVar.c;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    alrmVar = nafVar.d;
                    aooc.af(obj);
                    mqtVar = this.c;
                    if (alrmVar.b == 2) {
                        alrkVar = (alrk) alrmVar.c;
                    } else {
                        alrkVar = alrk.a;
                    }
                    if (alrkVar.b == 1) {
                        alryVar = (alry) alrkVar.c;
                    } else {
                        alryVar = alry.a;
                    }
                    alrxVarB = alrx.b(alryVar.c);
                    if (alrxVarB == null) {
                        alrxVarB = alrx.a;
                    }
                    nafVar.d = null;
                    nafVar.c = 3;
                    if (mqtVar.s(alrxVarB, nafVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i4 != 3 && i4 != 4 && i4 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            aooc.af(obj);
        } else {
            aooc.af(obj);
            aimz aimzVar = a;
            aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleExtractionResultEvent", 962, "DobbyDuplexListener.kt").v("handling extraction result event");
            apdi apdiVar = alrm.d;
            aooh.e(apdiVar, "extractionResultEvent");
            alrmVar = (alrm) akmr.x(alsiVar, apdiVar);
            int i5 = alrmVar.b;
            if (i5 == 0) {
                i = 3;
            } else if (i5 != 1) {
                i = i5 != 2 ? 0 : 2;
            } else {
                i = 1;
            }
            if (i == 0) {
                throw null;
            }
            int i6 = i - 1;
            if (i6 == 0) {
                defpackage.mqt mqtVar2 = this.c;
                defpackage.nvp nvpVar = defpackage.nvp.EVENT_DUPLEX_EXTRACTION_SUCCESS;
                nafVar.c = 1;
                if (mqtVar2.x(nvpVar, nafVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i6 == 1) {
                int i7 = (i5 == 2 ? (alrk) alrmVar.c : alrk.a).b;
                if (i7 == 0) {
                    i2 = 4;
                } else if (i7 == 1) {
                    i2 = 1;
                } else if (i7 != 2) {
                    i2 = i7 != 3 ? 0 : 3;
                } else {
                    i2 = 2;
                }
                int i8 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    defpackage.mqt mqtVar3 = this.c;
                    defpackage.nvp nvpVar2 = defpackage.nvp.EVENT_DUPLEX_EXTRACTION_LLM_INFERENCE_FAILURE;
                    nafVar.d = alrmVar;
                    nafVar.c = 2;
                    if (mqtVar3.x(nvpVar2, nafVar) == aoluVar) {
                        return aoluVar;
                    }
                    mqtVar = this.c;
                    if (alrmVar.b == 2) {
                        alrkVar = (alrk) alrmVar.c;
                    } else {
                        alrkVar = alrk.a;
                    }
                    if (alrkVar.b == 1) {
                        alryVar = (alry) alrkVar.c;
                    } else {
                        alryVar = alry.a;
                    }
                    alrxVarB = alrx.b(alryVar.c);
                    if (alrxVarB == null) {
                        alrxVarB = alrx.a;
                    }
                    nafVar.d = null;
                    nafVar.c = 3;
                    if (mqtVar.s(alrxVarB, nafVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i8 == 1) {
                    defpackage.mqt mqtVar4 = this.c;
                    defpackage.nvp nvpVar3 = defpackage.nvp.EVENT_DUPLEX_EXTRACTION_PARSING_FAILURE;
                    nafVar.c = 5;
                    if (mqtVar4.x(nvpVar3, nafVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i8 == 2) {
                    defpackage.mqt mqtVar5 = this.c;
                    defpackage.nvp nvpVar4 = defpackage.nvp.EVENT_DUPLEX_EXTRACTION_EMPTY_OUTPUT_FAILURE;
                    nafVar.c = 4;
                    if (mqtVar5.x(nvpVar4, nafVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i8 != 3) {
                        throw new aois();
                    }
                    aimzVar.d().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleExtractionResultEvent", 984, "DobbyDuplexListener.kt").v("ExtractionResultEvent has no failure");
                }
            } else {
                if (i6 != 2) {
                    throw new aois();
                }
                aimzVar.d().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleExtractionResultEvent", 987, "DobbyDuplexListener.kt").v("ExtractionResultEvent has no result");
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object j(alta altaVar, aoln aolnVar) {
        defpackage.nba nbaVar;
        alrg alrgVar;
        j$.time.Duration durationOfMillis;
        alta altaVar2;
        java.util.Iterator it;
        j$.time.Duration duration;
        defpackage.nbr nbrVar;
        alro alroVarD;
        alrf alrfVar;
        int i;
        pzm pzmVar;
        alta altaVar3 = altaVar;
        if (aolnVar instanceof defpackage.nba) {
            nbaVar = (defpackage.nba) aolnVar;
            int i2 = nbaVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nbaVar.e = i2 - Integer.MIN_VALUE;
            } else {
                nbaVar = new defpackage.nba(this, aolnVar);
            }
        } else {
            nbaVar = new defpackage.nba(this, aolnVar);
        }
        java.lang.Object obj = nbaVar.c;
        aolu aoluVar = aolu.a;
        int i3 = nbaVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                j$.time.Duration duration2 = (j$.time.Duration) nbaVar.b;
                alrgVar = (alrg) nbaVar.a;
                alta altaVar4 = nbaVar.f;
                aooc.af(obj);
                durationOfMillis = duration2;
                altaVar3 = altaVar4;
            } else if (i3 == 2) {
                it = (java.util.Iterator) nbaVar.b;
                duration = (j$.time.Duration) nbaVar.a;
                altaVar2 = nbaVar.f;
                aooc.af(obj);
                while (it.hasNext()) {
                    alrfVar = (alrf) it.next();
                    if (alrfVar != null) {
                        switch (alrfVar.ordinal()) {
                            case 1:
                                i = 48;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 2:
                                i = 49;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 3:
                                i = 50;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 4:
                                i = 51;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 5:
                                i = 52;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 6:
                                i = 53;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 7:
                                i = 54;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 8:
                                i = 55;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 9:
                                i = 56;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 10:
                                i = 57;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 11:
                                i = 42;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            case 12:
                                i = 35;
                                pzmVar = this.r;
                                aooh.c(duration);
                                nbaVar.f = altaVar2;
                                nbaVar.a = duration;
                                nbaVar.b = it;
                                nbaVar.e = 2;
                                if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                                    return aoluVar;
                                }
                                break;
                            default:
                                break;
                        }
                    }
                    a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handlePlayDtmfToneEvent", 863, "DobbyDuplexListener.kt").y("not a playable DTMF tone: %s", new aepg(alrfVar));
                }
                nbrVar = this.q;
                alroVarD = defpackage.mzp.d(altaVar2);
                nbaVar.f = null;
                nbaVar.a = null;
                nbaVar.b = null;
                nbaVar.e = 3;
                if (nbrVar.a(alroVarD, nbaVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        alsw alswVar = altaVar3.d;
        if (alswVar == null) {
            alswVar = alsw.a;
        }
        alrgVar = alswVar.b == 3 ? (alrg) alswVar.c : alrg.b;
        aooh.e(alrgVar, "getDtmfToneRequest(...)");
        alak alakVar = alrgVar.c;
        alal alalVar = alrg.a;
        if (new alam(alakVar, alalVar).isEmpty()) {
            a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handlePlayDtmfToneEvent", 833, "DobbyDuplexListener.kt").v("received DTMF request with no DTMF key");
            return aojh.a;
        }
        java.lang.Object objA = this.o.a();
        aooh.e(objA, "get(...)");
        durationOfMillis = j$.time.Duration.ofMillis(((java.lang.Number) objA).longValue());
        defpackage.nbr nbrVar2 = this.q;
        alro alroVarE = defpackage.mzp.e(altaVar3, ((int) durationOfMillis.toMillis()) * new alam(alrgVar.c, alalVar).size());
        nbaVar.f = altaVar3;
        nbaVar.a = alrgVar;
        nbaVar.b = durationOfMillis;
        nbaVar.e = 1;
        if (nbrVar2.a(alroVarE, nbaVar) == aoluVar) {
            return aoluVar;
        }
        altaVar2 = altaVar3;
        it = new alam(alrgVar.c, alrg.a).iterator();
        duration = durationOfMillis;
        while (it.hasNext()) {
            alrfVar = (alrf) it.next();
            if (alrfVar != null) {
                switch (alrfVar.ordinal()) {
                    case 1:
                        i = 48;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 2:
                        i = 49;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 3:
                        i = 50;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 4:
                        i = 51;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 5:
                        i = 52;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 6:
                        i = 53;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 7:
                        i = 54;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 8:
                        i = 55;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 9:
                        i = 56;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 10:
                        i = 57;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 11:
                        i = 42;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    case 12:
                        i = 35;
                        pzmVar = this.r;
                        aooh.c(duration);
                        nbaVar.f = altaVar2;
                        nbaVar.a = duration;
                        nbaVar.b = it;
                        nbaVar.e = 2;
                        if (pzmVar.c((char) i, duration, nbaVar) == aoluVar) {
                            return aoluVar;
                        }
                        break;
                    default:
                        break;
                }
            }
            a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handlePlayDtmfToneEvent", 863, "DobbyDuplexListener.kt").y("not a playable DTMF tone: %s", new aepg(alrfVar));
        }
        nbrVar = this.q;
        alroVarD = defpackage.mzp.d(altaVar2);
        nbaVar.f = null;
        nbaVar.a = null;
        nbaVar.b = null;
        nbaVar.e = 3;
        if (nbrVar.a(alroVarD, nbaVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(alsi alsiVar, aoln aolnVar) {
        defpackage.nbb nbbVar;
        alsl alslVar;
        if (aolnVar instanceof defpackage.nbb) {
            nbbVar = (defpackage.nbb) aolnVar;
            int i = nbbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbbVar.c = i - Integer.MIN_VALUE;
            } else {
                nbbVar = new defpackage.nbb(this, aolnVar);
            }
        } else {
            nbbVar = new defpackage.nbb(this, aolnVar);
        }
        java.lang.Object obj = nbbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nbbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                alslVar = nbbVar.d;
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
        apdi apdiVar = alsl.c;
        aooh.e(apdiVar, "quickReplyChipsReadyEvent");
        alslVar = (alsl) akmr.x(alsiVar, apdiVar);
        a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleQuickReplyChipsReadyEvent", 576, "DobbyDuplexListener.kt").v("handling quick reply chip ready event");
        defpackage.mqt mqtVar = this.c;
        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DUPLEX_POST_SCREENING_QUICK_REPLY_CHIPS_RECEIVED;
        nbbVar.d = alslVar;
        nbbVar.c = 1;
        if (mqtVar.x(nvpVar, nbbVar) == aoluVar) {
            return aoluVar;
        }
        alat alatVar = alslVar.b;
        aooh.e(alatVar, "getQuickReplyChipsList(...)");
        if (!alatVar.isEmpty()) {
            defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
            akzx akzxVarM = defpackage.nly.a.m();
            aooh.f(akzxVarM, "builder");
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.nly) akzxVarM.b).b);
            aooh.e(listUnmodifiableList, "getDuplexQuickReplyChipsList(...)");
            new alct(listUnmodifiableList);
            alat alatVar2 = alslVar.b;
            aooh.e(alatVar2, "getQuickReplyChipsList(...)");
            aooh.f(alatVar2, "values");
            akzxVarM.u();
            defpackage.nly nlyVar = (defpackage.nly) akzxVarM.b;
            alat alatVar3 = nlyVar.b;
            if (!alatVar3.c()) {
                nlyVar.b = alad.J(alatVar3);
            }
            akyl.i(alatVar2, nlyVar.b);
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.nly nlyVar2 = (defpackage.nly) aladVarP;
            aooh.f(nlyVar2, "value");
            akzx akzxVar = (akzx) npwVarAB.a;
            akzxVar.u();
            defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
            j$.util.Objects.requireNonNull(nlyVar2);
            nmkVar.c = nlyVar2;
            nmkVar.b = 8;
            defpackage.nmk nmkVarD = npwVarAB.D();
            defpackage.ogj ogjVar = this.l;
            nbbVar.d = null;
            nbbVar.c = 2;
            if (ogjVar.b(nmkVarD, nbbVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e7 A[Catch: IllegalStateException -> 0x0162, TryCatch #0 {IllegalStateException -> 0x0162, blocks: (B:13:0x0035, B:14:0x003a, B:42:0x0154, B:15:0x003f, B:38:0x0105, B:16:0x0044, B:34:0x00dd, B:36:0x00e7, B:40:0x0108, B:19:0x004b, B:32:0x00cd, B:20:0x0050, B:30:0x00ac, B:21:0x0054, B:28:0x00a1, B:26:0x0085), top: B:50:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0108 A[Catch: IllegalStateException -> 0x0162, TryCatch #0 {IllegalStateException -> 0x0162, blocks: (B:13:0x0035, B:14:0x003a, B:42:0x0154, B:15:0x003f, B:38:0x0105, B:16:0x0044, B:34:0x00dd, B:36:0x00e7, B:40:0x0108, B:19:0x004b, B:32:0x00cd, B:20:0x0050, B:30:0x00ac, B:21:0x0054, B:28:0x00a1, B:26:0x0085), top: B:50:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(alsi alsiVar, aoln aolnVar) {
        defpackage.nbc nbcVar;
        uxh uxhVar;
        boolean zBooleanValue;
        aimz aimzVar;
        alro alroVarBa;
        defpackage.nbr nbrVar;
        defpackage.mqt mqtVar;
        defpackage.nvp nvpVar;
        defpackage.mqt mqtVar2;
        defpackage.nvp nvpVar2;
        if (aolnVar instanceof defpackage.nbc) {
            nbcVar = (defpackage.nbc) aolnVar;
            int i = nbcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbcVar.c = i - Integer.MIN_VALUE;
            } else {
                nbcVar = new defpackage.nbc(this, aolnVar);
            }
        } else {
            nbcVar = new defpackage.nbc(this, aolnVar);
        }
        java.lang.Object objA = nbcVar.a;
        aolu aoluVar = aolu.a;
        try {
            switch (nbcVar.c) {
                case 0:
                    aooc.af(objA);
                    aimz aimzVar2 = a;
                    aimzVar2.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 883, "DobbyDuplexListener.kt").v("handling set TTS voice event");
                    apdi apdiVar = alst.d;
                    aooh.e(apdiVar, "setTtsVoiceEvent");
                    altg altgVarB = altg.b(((alst) akmr.x(alsiVar, apdiVar)).c);
                    if (altgVarB == null) {
                        altgVarB = altg.a;
                    }
                    aimzVar2.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 887, "DobbyDuplexListener.kt").v("TTS Infra is enabled. Initializing session.");
                    defpackage.ntb ntbVar = this.s;
                    nbcVar.c = 1;
                    if (ntbVar.d(altgVarB, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.ntb ntbVar2 = this.s;
                    nbcVar.c = 2;
                    objA = ntbVar2.a(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    uxhVar = (uxh) objA;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 890, "DobbyDuplexListener.kt").v("TTS session is initialized. Prewarming synthesizer.");
                    nbcVar.d = uxhVar;
                    nbcVar.c = 3;
                    objA = uxhVar.b(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    ((java.lang.Boolean) objA).booleanValue();
                    nbcVar.d = null;
                    nbcVar.c = 4;
                    objA = uxhVar.a(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    aimzVar = a;
                    if (!zBooleanValue) {
                        aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 896, "DobbyDuplexListener.kt").v("Voice is not downloaded. TTS is NOT ready.");
                        mqtVar = this.c;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_TTS_UNAVAILABLE;
                        nbcVar.c = 5;
                        if (mqtVar.x(nvpVar, nbcVar) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 901, "DobbyDuplexListener.kt").v("Sending TTS Available event");
                    ajyi ajyiVarI = ahus.I(alro.a.m());
                    apdi apdiVar2 = alte.b;
                    aooh.e(apdiVar2, "ttsAvailableEvent");
                    akzx akzxVarM = alte.a.m();
                    aooh.f(akzxVarM, "builder");
                    alte alteVarP = akzxVarM.p();
                    aooh.e(alteVarP, "build(...)");
                    ajyiVarI.be(apdiVar2, alteVarP);
                    alroVarBa = ajyiVarI.ba();
                    nbrVar = this.q;
                    nbcVar.c = 6;
                    if (nbrVar.a(alroVarBa, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    mqtVar2 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_DOBBY_TTS_AVAILABLE;
                    nbcVar.c = 7;
                    if (mqtVar2.x(nvpVar2, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 1:
                    aooc.af(objA);
                    defpackage.ntb ntbVar3 = this.s;
                    nbcVar.c = 2;
                    objA = ntbVar3.a(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    uxhVar = (uxh) objA;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 890, "DobbyDuplexListener.kt").v("TTS session is initialized. Prewarming synthesizer.");
                    nbcVar.d = uxhVar;
                    nbcVar.c = 3;
                    objA = uxhVar.b(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    ((java.lang.Boolean) objA).booleanValue();
                    nbcVar.d = null;
                    nbcVar.c = 4;
                    objA = uxhVar.a(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    aimzVar = a;
                    if (!zBooleanValue) {
                        aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 896, "DobbyDuplexListener.kt").v("Voice is not downloaded. TTS is NOT ready.");
                        mqtVar = this.c;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_TTS_UNAVAILABLE;
                        nbcVar.c = 5;
                        if (mqtVar.x(nvpVar, nbcVar) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 901, "DobbyDuplexListener.kt").v("Sending TTS Available event");
                    ajyi ajyiVarI2 = ahus.I(alro.a.m());
                    apdi apdiVar3 = alte.b;
                    aooh.e(apdiVar3, "ttsAvailableEvent");
                    akzx akzxVarM2 = alte.a.m();
                    aooh.f(akzxVarM2, "builder");
                    alte alteVarP2 = akzxVarM2.p();
                    aooh.e(alteVarP2, "build(...)");
                    ajyiVarI2.be(apdiVar3, alteVarP2);
                    alroVarBa = ajyiVarI2.ba();
                    nbrVar = this.q;
                    nbcVar.c = 6;
                    if (nbrVar.a(alroVarBa, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    mqtVar2 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_DOBBY_TTS_AVAILABLE;
                    nbcVar.c = 7;
                    if (mqtVar2.x(nvpVar2, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 2:
                    aooc.af(objA);
                    uxhVar = (uxh) objA;
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 890, "DobbyDuplexListener.kt").v("TTS session is initialized. Prewarming synthesizer.");
                    nbcVar.d = uxhVar;
                    nbcVar.c = 3;
                    objA = uxhVar.b(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    ((java.lang.Boolean) objA).booleanValue();
                    nbcVar.d = null;
                    nbcVar.c = 4;
                    objA = uxhVar.a(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    aimzVar = a;
                    if (!zBooleanValue) {
                        aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 896, "DobbyDuplexListener.kt").v("Voice is not downloaded. TTS is NOT ready.");
                        mqtVar = this.c;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_TTS_UNAVAILABLE;
                        nbcVar.c = 5;
                        if (mqtVar.x(nvpVar, nbcVar) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 901, "DobbyDuplexListener.kt").v("Sending TTS Available event");
                    ajyi ajyiVarI3 = ahus.I(alro.a.m());
                    apdi apdiVar4 = alte.b;
                    aooh.e(apdiVar4, "ttsAvailableEvent");
                    akzx akzxVarM3 = alte.a.m();
                    aooh.f(akzxVarM3, "builder");
                    alte alteVarP3 = akzxVarM3.p();
                    aooh.e(alteVarP3, "build(...)");
                    ajyiVarI3.be(apdiVar4, alteVarP3);
                    alroVarBa = ajyiVarI3.ba();
                    nbrVar = this.q;
                    nbcVar.c = 6;
                    if (nbrVar.a(alroVarBa, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    mqtVar2 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_DOBBY_TTS_AVAILABLE;
                    nbcVar.c = 7;
                    if (mqtVar2.x(nvpVar2, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 3:
                    uxhVar = nbcVar.d;
                    aooc.af(objA);
                    ((java.lang.Boolean) objA).booleanValue();
                    nbcVar.d = null;
                    nbcVar.c = 4;
                    objA = uxhVar.a(nbcVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    aimzVar = a;
                    if (!zBooleanValue) {
                        aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 896, "DobbyDuplexListener.kt").v("Voice is not downloaded. TTS is NOT ready.");
                        mqtVar = this.c;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_TTS_UNAVAILABLE;
                        nbcVar.c = 5;
                        if (mqtVar.x(nvpVar, nbcVar) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 901, "DobbyDuplexListener.kt").v("Sending TTS Available event");
                    ajyi ajyiVarI4 = ahus.I(alro.a.m());
                    apdi apdiVar5 = alte.b;
                    aooh.e(apdiVar5, "ttsAvailableEvent");
                    akzx akzxVarM4 = alte.a.m();
                    aooh.f(akzxVarM4, "builder");
                    alte alteVarP4 = akzxVarM4.p();
                    aooh.e(alteVarP4, "build(...)");
                    ajyiVarI4.be(apdiVar5, alteVarP4);
                    alroVarBa = ajyiVarI4.ba();
                    nbrVar = this.q;
                    nbcVar.c = 6;
                    if (nbrVar.a(alroVarBa, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    mqtVar2 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_DOBBY_TTS_AVAILABLE;
                    nbcVar.c = 7;
                    if (mqtVar2.x(nvpVar2, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 4:
                    aooc.af(objA);
                    zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                    aimzVar = a;
                    if (!zBooleanValue) {
                        aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 896, "DobbyDuplexListener.kt").v("Voice is not downloaded. TTS is NOT ready.");
                        mqtVar = this.c;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_TTS_UNAVAILABLE;
                        nbcVar.c = 5;
                        if (mqtVar.x(nvpVar, nbcVar) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                    aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 901, "DobbyDuplexListener.kt").v("Sending TTS Available event");
                    ajyi ajyiVarI5 = ahus.I(alro.a.m());
                    apdi apdiVar6 = alte.b;
                    aooh.e(apdiVar6, "ttsAvailableEvent");
                    akzx akzxVarM5 = alte.a.m();
                    aooh.f(akzxVarM5, "builder");
                    alte alteVarP5 = akzxVarM5.p();
                    aooh.e(alteVarP5, "build(...)");
                    ajyiVarI5.be(apdiVar6, alteVarP5);
                    alroVarBa = ajyiVarI5.ba();
                    nbrVar = this.q;
                    nbcVar.c = 6;
                    if (nbrVar.a(alroVarBa, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    mqtVar2 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_DOBBY_TTS_AVAILABLE;
                    nbcVar.c = 7;
                    if (mqtVar2.x(nvpVar2, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 5:
                    aooc.af(objA);
                    return aojh.a;
                case 6:
                    aooc.af(objA);
                    mqtVar2 = this.c;
                    nvpVar2 = defpackage.nvp.EVENT_DOBBY_TTS_AVAILABLE;
                    nbcVar.c = 7;
                    if (mqtVar2.x(nvpVar2, nbcVar) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                case 7:
                    aooc.af(objA);
                    return aojh.a;
                case 8:
                    aooc.af(objA);
                    return aojh.a;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.IllegalStateException e) {
            a.d().k(e).l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSetTtsVoiceEvent", 908, "DobbyDuplexListener.kt").v("Dobby TTS is unavailable.");
            defpackage.mqt mqtVar3 = this.c;
            defpackage.nvp nvpVar3 = defpackage.nvp.EVENT_DOBBY_TTS_UNAVAILABLE;
            nbcVar.d = null;
            nbcVar.c = 8;
            if (mqtVar3.x(nvpVar3, nbcVar) == aoluVar) {
                return aoluVar;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object m(alwp alwpVar, aoln aolnVar) throws aois {
        defpackage.nbd nbdVar;
        alxy alxyVar;
        defpackage.nmq nmqVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.nbd) {
            nbdVar = (defpackage.nbd) aolnVar;
            int i = nbdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbdVar.c = i - Integer.MIN_VALUE;
            } else {
                nbdVar = new defpackage.nbd(this, aolnVar);
            }
        } else {
            nbdVar = new defpackage.nbd(this, aolnVar);
        }
        defpackage.nbd nbdVar2 = nbdVar;
        java.lang.Object obj = nbdVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = nbdVar2.c;
        if (i2 != 0) {
            if (i2 == 1) {
                alxyVar = nbdVar2.d;
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
        apdi apdiVar = alxy.i;
        aooh.e(apdiVar, "spamDecisionOutboundEvent");
        alxyVar = (alxy) akmr.x(alwpVar, apdiVar);
        if ((alxyVar.b & 1) != 0) {
            aimw aimwVarL = a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSpamDecisionEvent", 520, "DobbyDuplexListener.kt");
            alxx alxxVarB = alxx.b(alxyVar.c);
            if (alxxVarB == null) {
                alxxVarB = alxx.a;
            }
            aimwVarL.y("spam decision is %s", alxxVarB.name());
            int i3 = alxyVar.c;
            alxx alxxVarB2 = alxx.b(i3);
            if (alxxVarB2 == null) {
                alxxVarB2 = alxx.a;
            }
            if (alxxVarB2 == alxx.b) {
                aoov.an(this.n, (aolr) null, 0, new defpackage.msi(this, alxyVar, (aoln) null, 17), 3);
            } else {
                alxx alxxVarB3 = alxx.b(i3);
                if (alxxVarB3 == null) {
                    alxxVarB3 = alxx.a;
                }
                if (alxxVarB3 == alxx.c) {
                    aoov.an(this.n, (aolr) null, 0, new defpackage.msi(this, alxyVar, (aoln) null, 18, (byte[]) null), 3);
                }
            }
            alxx alxxVarB4 = alxx.b(alxyVar.c);
            if (alxxVarB4 == null) {
                alxxVarB4 = alxx.a;
            }
            nbdVar2.d = alxyVar;
            nbdVar2.c = 1;
            defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
            akzx akzxVarM = defpackage.nma.a.m();
            aooh.f(akzxVarM, "builder");
            int iOrdinal = alxxVarB4.ordinal();
            if (iOrdinal == 0) {
                nmqVar = defpackage.nmq.DECISION_UNKNOWN_IF_SPAM;
            } else if (iOrdinal == 1) {
                nmqVar = defpackage.nmq.DECISION_SPAM;
            } else if (iOrdinal == 2) {
                nmqVar = defpackage.nmq.DECISION_NOT_SPAM;
            } else {
                if (iOrdinal != 3) {
                    throw new aois();
                }
                nmqVar = defpackage.nmq.NO_DECISION;
            }
            akzxVarM.u();
            ((defpackage.nma) akzxVarM.b).b = nmqVar.a();
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.nma nmaVar = (defpackage.nma) aladVarP;
            aooh.f(nmaVar, "value");
            akzx akzxVar = (akzx) npwVarAB.a;
            akzxVar.u();
            defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
            j$.util.Objects.requireNonNull(nmaVar);
            nmkVar.c = nmaVar;
            nmkVar.b = 5;
            java.lang.Object objB = this.l.b(npwVarAB.D(), nbdVar2);
            if (objB != aoluVar) {
                objB = aojh.a;
            }
            if (objB == aoluVar) {
                return aoluVar;
            }
        }
        if ((alxyVar.b & 4) != 0) {
            aimw aimwVarL2 = a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSpamDecisionEvent", 557, "DobbyDuplexListener.kt");
            alxx alxxVarB5 = alxx.b(alxyVar.e);
            if (alxxVarB5 == null) {
                alxxVarB5 = alxx.a;
            }
            aimwVarL2.y("original spam decision is %s", alxxVarB5.name());
        }
        if ((alxyVar.b & 2) != 0) {
            aimw aimwVarL3 = a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSpamDecisionEvent", 560, "DobbyDuplexListener.kt");
            int iAN = a.aN(alxyVar.d);
            if (iAN == 0 || iAN == 1) {
                str = "UNKNOWN";
            } else if (iAN != 2) {
                str = iAN != 3 ? "HIGH" : "MEDIUM";
            } else {
                str = "LOW";
            }
            aimwVarL3.y("confidence level is %s", str);
        }
        defpackage.mqt mqtVar = this.c;
        aooh.c(alxyVar);
        nbdVar2.d = null;
        nbdVar2.c = 2;
        if (mqtVar.w(alxyVar, nbdVar2) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b9  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        if (((java.lang.Boolean) r21.t.a()).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dd, code lost:
    
        if (((java.lang.Boolean) r21.h.a()).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e2, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:?, code lost:
    
        return aojh.a;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(alsi r22, aoln r23) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbn.n(alsi, aoln):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:39:0x0118  */
    /* JADX WARN: Code duplicated, block: B:40:0x011b  */
    /* JADX WARN: Code duplicated, block: B:41:0x011e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:43:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:52:0x015b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(alwp alwpVar, aoln aolnVar) throws aois {
        defpackage.nbg nbgVar;
        alyf alyfVar;
        alwy alwyVar;
        akzx akzxVarM;
        int i;
        defpackage.nmk nmkVarD;
        defpackage.ogj ogjVar;
        akzx akzxVarM2;
        alsy alsyVarB;
        alyh alyhVar;
        int i2;
        int iR;
        java.lang.String str;
        if (aolnVar instanceof defpackage.nbg) {
            nbgVar = (defpackage.nbg) aolnVar;
            int i3 = nbgVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nbgVar.c = i3 - Integer.MIN_VALUE;
            } else {
                nbgVar = new defpackage.nbg(this, aolnVar);
            }
        } else {
            nbgVar = new defpackage.nbg(this, aolnVar);
        }
        java.lang.Object objA = nbgVar.a;
        aolu aoluVar = aolu.a;
        int i4 = nbgVar.c;
        if (i4 != 0) {
            if (i4 == 1) {
                alyfVar = nbgVar.d;
                aooc.af(objA);
            } else if (i4 == 2) {
                alyfVar = nbgVar.d;
                aooc.af(objA);
                alwyVar = ((defpackage.nmu) objA).d;
                if (alwyVar == null) {
                    alwyVar = alwy.a;
                }
                aooh.e(alwyVar, "getConversationState(...)");
                akzxVarM = alyg.a.m();
                aooh.e(akzxVarM, "newBuilder(...)");
                i = 0;
                for (alxf alxfVar : alyfVar.c) {
                    int i5 = i + 1;
                    akzxVarM2 = alyi.a.m();
                    long j = i;
                    akzxVarM2.u();
                    alyi alyiVar = akzxVarM2.b;
                    alyiVar.b |= 1;
                    alyiVar.c = j;
                    java.lang.String str2 = alxfVar.e;
                    akzxVarM2.u();
                    alyi alyiVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str2);
                    alyiVar2.b |= 2;
                    alyiVar2.d = str2;
                    akzxVarM2.u();
                    alyi alyiVar3 = akzxVarM2.b;
                    alyiVar3.e = 2;
                    alyiVar3.b |= 4;
                    alsyVarB = alsy.b(alxfVar.f);
                    if (alsyVarB == null) {
                        alsyVarB = alsy.a;
                    }
                    switch (alsyVarB.ordinal()) {
                        case 0:
                        case 2:
                        case 4:
                        case 5:
                            alyhVar = alyh.a;
                            break;
                        case 1:
                        case 6:
                            alyhVar = alyh.c;
                            break;
                        case 3:
                            alyhVar = alyh.b;
                            break;
                        case 7:
                            alyhVar = alyh.e;
                            break;
                        case 8:
                            alyhVar = alyh.d;
                            break;
                        default:
                            throw new aois();
                    }
                    akzxVarM2.u();
                    alyi alyiVar4 = akzxVarM2.b;
                    alyiVar4.f = alyhVar.f;
                    alyiVar4.b |= 8;
                    i2 = alxfVar.c;
                    if (i2 == 4) {
                        if (i2 == 4) {
                            str = (java.lang.String) alxfVar.d;
                        } else {
                            str = "";
                        }
                        akzxVarM2.u();
                        alyi alyiVar5 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str);
                        alyiVar5.b |= 16;
                        alyiVar5.g = str;
                    }
                    if ((alxfVar.b & 4) == 0) {
                        iR = defpackage.airh.r(alxfVar.g);
                        if (iR == 0) {
                            iR = 1;
                        }
                        akzxVarM2.u();
                        alyi alyiVar6 = akzxVarM2.b;
                        alyiVar6.h = iR - 1;
                        alyiVar6.b |= 32;
                    }
                    alyi alyiVarP = akzxVarM2.p();
                    akzxVarM.u();
                    alyg alygVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(alyiVarP);
                    alygVar.b();
                    alygVar.c.add(alyiVarP);
                    i = i5;
                }
                akzx akzxVarP = alwyVar.p();
                alyg alygVarP = akzxVarM.p();
                akzxVarP.u();
                alwy alwyVar2 = akzxVarP.b;
                j$.util.Objects.requireNonNull(alygVarP);
                alwyVar2.d = alygVarP;
                alwyVar2.b |= 1;
                alwy alwyVarP = akzxVarP.p();
                aooh.e(alwyVarP, "build(...)");
                defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                defpackage.nwj nwjVarN = mni.N(defpackage.nlw.a.m());
                nwjVarN.B(alwyVarP);
                npwVarAB.J(nwjVarN.A());
                nmkVarD = npwVarAB.D();
                ogjVar = this.l;
                nbgVar.d = null;
                nbgVar.c = 3;
                if (ogjVar.b(nmkVarD, nbgVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i4 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleSuggestSmartRepliesEvent", 1019, "DobbyDuplexListener.kt").v("handling suggest smart replies event");
        apdi apdiVar = alyf.e;
        aooh.e(apdiVar, "suggestSmartRepliesOutboundEvent");
        alyfVar = (alyf) akmr.x(alwpVar, apdiVar);
        if ((alyfVar.b & 1) != 0) {
            defpackage.mqt mqtVar = this.c;
            java.lang.String str3 = alyfVar.d;
            aooh.e(str3, "getPredictedGroupIntent(...)");
            nbgVar.d = alyfVar;
            nbgVar.c = 1;
            if (mqtVar.A(str3, nbgVar) == aoluVar) {
                return aoluVar;
            }
        }
        if (!((java.lang.Boolean) this.u.a()).booleanValue()) {
            defpackage.ogj ogjVar2 = this.l;
            nbgVar.d = alyfVar;
            nbgVar.c = 2;
            objA = ogjVar2.a(nbgVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            alwyVar = ((defpackage.nmu) objA).d;
            if (alwyVar == null) {
                alwyVar = alwy.a;
            }
            aooh.e(alwyVar, "getConversationState(...)");
            akzxVarM = alyg.a.m();
            aooh.e(akzxVarM, "newBuilder(...)");
            i = 0;
            while (r14.hasNext()) {
                int i6 = i + 1;
                akzxVarM2 = alyi.a.m();
                long j2 = i;
                akzxVarM2.u();
                alyi alyiVar7 = akzxVarM2.b;
                alyiVar7.b |= 1;
                alyiVar7.c = j2;
                java.lang.String str4 = alxfVar.e;
                akzxVarM2.u();
                alyi alyiVar8 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                alyiVar8.b |= 2;
                alyiVar8.d = str4;
                akzxVarM2.u();
                alyi alyiVar9 = akzxVarM2.b;
                alyiVar9.e = 2;
                alyiVar9.b |= 4;
                alsyVarB = alsy.b(alxfVar.f);
                if (alsyVarB == null) {
                    alsyVarB = alsy.a;
                }
                switch (alsyVarB.ordinal()) {
                    case 0:
                    case 2:
                    case 4:
                    case 5:
                        alyhVar = alyh.a;
                        break;
                    case 1:
                    case 6:
                        alyhVar = alyh.c;
                        break;
                    case 3:
                        alyhVar = alyh.b;
                        break;
                    case 7:
                        alyhVar = alyh.e;
                        break;
                    case 8:
                        alyhVar = alyh.d;
                        break;
                    default:
                        throw new aois();
                }
                akzxVarM2.u();
                alyi alyiVar10 = akzxVarM2.b;
                alyiVar10.f = alyhVar.f;
                alyiVar10.b |= 8;
                i2 = alxfVar.c;
                if (i2 == 4) {
                    if (i2 == 4) {
                        str = (java.lang.String) alxfVar.d;
                    } else {
                        str = "";
                    }
                    akzxVarM2.u();
                    alyi alyiVar11 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str);
                    alyiVar11.b |= 16;
                    alyiVar11.g = str;
                }
                if ((alxfVar.b & 4) == 0) {
                    iR = defpackage.airh.r(alxfVar.g);
                    if (iR == 0) {
                        iR = 1;
                    }
                    akzxVarM2.u();
                    alyi alyiVar12 = akzxVarM2.b;
                    alyiVar12.h = iR - 1;
                    alyiVar12.b |= 32;
                }
                alyi alyiVarP2 = akzxVarM2.p();
                akzxVarM.u();
                alyg alygVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(alyiVarP2);
                alygVar2.b();
                alygVar2.c.add(alyiVarP2);
                i = i6;
            }
            akzx akzxVarP2 = alwyVar.p();
            alyg alygVarP2 = akzxVarM.p();
            akzxVarP2.u();
            alwy alwyVar3 = akzxVarP2.b;
            j$.util.Objects.requireNonNull(alygVarP2);
            alwyVar3.d = alygVarP2;
            alwyVar3.b |= 1;
            alwy alwyVarP2 = akzxVarP2.p();
            aooh.e(alwyVarP2, "build(...)");
            defpackage.npw npwVarAB2 = mni.aB(defpackage.nmk.a.m());
            defpackage.nwj nwjVarN2 = mni.N(defpackage.nlw.a.m());
            nwjVarN2.B(alwyVarP2);
            npwVarAB2.J(nwjVarN2.A());
            nmkVarD = npwVarAB2.D();
            ogjVar = this.l;
            nbgVar.d = null;
            nbgVar.c = 3;
            if (ogjVar.b(nmkVarD, nbgVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(alwp alwpVar, aoln aolnVar) {
        defpackage.nbh nbhVar;
        if (aolnVar instanceof defpackage.nbh) {
            nbhVar = (defpackage.nbh) aolnVar;
            int i = nbhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbhVar.c = i - Integer.MIN_VALUE;
            } else {
                nbhVar = new defpackage.nbh(this, aolnVar);
            }
        } else {
            nbhVar = new defpackage.nbh(this, aolnVar);
        }
        java.lang.Object obj = nbhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nbhVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                alwpVar = nbhVar.d;
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
        defpackage.mqt mqtVar = this.c;
        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DUPLEX_NOTIFY_TRANSCRIPTION_SUMMARY;
        nbhVar.d = alwpVar;
        nbhVar.c = 1;
        if (mqtVar.x(nvpVar, nbhVar) == aoluVar) {
            return aoluVar;
        }
        apdi apdiVar = alyn.e;
        aooh.e(apdiVar, "transcriptionSummary");
        alyn alynVar = (alyn) akmr.x(alwpVar, apdiVar);
        defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
        defpackage.nwj nwjVarL = mni.L(defpackage.nme.a.m());
        alwf alwfVar = alynVar.c;
        if (alwfVar == null) {
            alwfVar = alwf.a;
        }
        aooh.e(alwfVar, "getTranscription(...)");
        nwjVarL.x(alwfVar);
        nwjVarL.w(alynVar.d);
        npwVarAB.L(nwjVarL.v());
        defpackage.nmk nmkVarD = npwVarAB.D();
        defpackage.ogj ogjVar = this.l;
        nbhVar.d = null;
        nbhVar.c = 2;
        if (ogjVar.b(nmkVarD, nbhVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(aoln aolnVar) {
        defpackage.nbi nbiVar;
        if (aolnVar instanceof defpackage.nbi) {
            nbiVar = (defpackage.nbi) aolnVar;
            int i = nbiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbiVar.c = i - Integer.MIN_VALUE;
            } else {
                nbiVar = new defpackage.nbi(this, aolnVar);
            }
        } else {
            nbiVar = new defpackage.nbi(this, aolnVar);
        }
        java.lang.Object objE = nbiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nbiVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            nbiVar.c = 1;
            objE = e(nbiVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        return java.lang.Boolean.valueOf(objE != defpackage.nms.CASE_NO_SESSION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(alwz alwzVar, aoln aolnVar) {
        defpackage.nbm nbmVar;
        if (aolnVar instanceof defpackage.nbm) {
            nbmVar = (defpackage.nbm) aolnVar;
            int i = nbmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbmVar.c = i - Integer.MIN_VALUE;
            } else {
                nbmVar = new defpackage.nbm(this, aolnVar);
            }
        } else {
            nbmVar = new defpackage.nbm(this, aolnVar);
        }
        java.lang.Object objA = nbmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nbmVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                alwzVar = nbmVar.d;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        defpackage.ogj ogjVar = this.l;
        nbmVar.d = alwzVar;
        nbmVar.c = 1;
        objA = ogjVar.a(nbmVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        if (nmoVarB == defpackage.nmo.BAM) {
            aoin aoinVar = (aoin) this.w.k().get(defpackage.nvd.b);
            defpackage.nvh nvhVar = aoinVar != null ? (defpackage.nvh) aoinVar.a() : null;
            if (nvhVar == null) {
                this.p.a(new java.lang.IllegalStateException("BamSyncEventListener for NewConversationStateReceived is missing when the call has transitioned to BAM."));
            } else {
                defpackage.nwj nwjVarAh = mni.ah(defpackage.nvg.a.m());
                akzx akzxVarM = defpackage.nvf.a.m();
                aooh.f(akzxVarM, "builder");
                alwy alwyVar = alwzVar.c;
                if (alwyVar == null) {
                    alwyVar = alwy.a;
                }
                aooh.e(alwyVar, "getConversationState(...)");
                aooh.f(alwyVar, "value");
                akzxVarM.u();
                defpackage.nvf nvfVar = (defpackage.nvf) akzxVarM.b;
                j$.util.Objects.requireNonNull(alwyVar);
                nvfVar.c = alwyVar;
                nvfVar.b |= 1;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.nvf nvfVar2 = (defpackage.nvf) aladVarP;
                aooh.f(nvfVar2, "value");
                akzx akzxVar = (akzx) nwjVarAh.a;
                akzxVar.u();
                defpackage.nvg nvgVar = (defpackage.nvg) akzxVar.b;
                j$.util.Objects.requireNonNull(nvfVar2);
                nvgVar.c = nvfVar2;
                nvgVar.b = 2;
                defpackage.nvg nvgVarD = nwjVarAh.d();
                nbmVar.d = null;
                nbmVar.c = 2;
                if (nvhVar.a(nvgVarD, nbmVar) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }
}
