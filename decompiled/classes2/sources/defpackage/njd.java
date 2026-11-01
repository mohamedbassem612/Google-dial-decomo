package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class njd {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector");
    public final aolr b;
    public final aolr c;
    public final uxy d;
    public final aoin e;
    public final defpackage.mqt f;
    public final defpackage.nrv g;
    public final defpackage.mba h;
    public final defpackage.ntb i;
    public final ruc j;
    public final aoin k;
    public defpackage.hxf l;
    public aosy m;
    public boolean n;
    public final defpackage.idh o;
    public final qbe p;
    public final apdp q;
    public final aazc r;
    private final aoin s;
    private final defpackage.nbr t;
    private final aoin u;
    private final aoin v;
    private final aoin w;
    private boolean x;
    private final ptx y;
    private final defpackage.ogj z;

    public njd(aolr aolrVar, aolr aolrVar2, defpackage.idh idhVar, uxy uxyVar, aoin aoinVar, aoin aoinVar2, defpackage.mqt mqtVar, defpackage.ogj ogjVar, defpackage.nrv nrvVar, defpackage.nbr nbrVar, defpackage.mba mbaVar, defpackage.ntb ntbVar, ptx ptxVar, ruc rucVar, qbe qbeVar, aazc aazcVar, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(idhVar, "tidepodsCallAudio");
        aooh.f(aoinVar, "maxLoops");
        aooh.f(aoinVar2, "timeoutOnStopPlayingInMillis");
        aooh.f(mqtVar, "loggingCoordinator");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(nrvVar, "dobbySessionWriter");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(ntbVar, "dobbyTtsSessionProvider");
        aooh.f(ptxVar, "callProperties");
        aooh.f(rucVar, "metrics");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar3, "audioPlayingGracePeriodMillis");
        aooh.f(aoinVar4, "audioPlayingActiveTimeoutPhase1");
        aooh.f(aoinVar5, "audioPlayingActiveTimeoutPhase2");
        aooh.f(aoinVar6, "ignoreDialtonePlayingOnWrongStates");
        this.b = aolrVar;
        this.c = aolrVar2;
        this.o = idhVar;
        this.d = uxyVar;
        this.e = aoinVar;
        this.s = aoinVar2;
        this.f = mqtVar;
        this.z = ogjVar;
        this.g = nrvVar;
        this.t = nbrVar;
        this.h = mbaVar;
        this.i = ntbVar;
        this.y = ptxVar;
        this.j = rucVar;
        this.p = qbeVar;
        this.r = aazcVar;
        this.u = aoinVar3;
        this.v = aoinVar4;
        this.w = aoinVar5;
        this.k = aoinVar6;
        this.q = new apdp();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public static final boolean q(alta altaVar) throws aois {
        alsy alsyVarB = alsy.b(altaVar.e);
        if (alsyVarB == null) {
            alsyVarB = alsy.a;
        }
        switch (alsyVarB.ordinal()) {
            case 0:
            case 6:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                throw new aois();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(defpackage.hxf hxfVar, int i, long j, aoln aolnVar) {
        defpackage.nil nilVar;
        if (aolnVar instanceof defpackage.nil) {
            nilVar = (defpackage.nil) aolnVar;
            int i2 = nilVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nilVar.e = i2 - Integer.MIN_VALUE;
            } else {
                nilVar = new defpackage.nil(this, aolnVar);
            }
        } else {
            nilVar = new defpackage.nil(this, aolnVar);
        }
        java.lang.Object objK = nilVar.c;
        aolu aoluVar = aolu.a;
        int i3 = nilVar.e;
        try {
            if (i3 == 0) {
                aooc.af(objK);
                long j2 = i;
                java.lang.Object objA = this.u.a();
                aooh.e(objA, "get(...)");
                long jLongValue = j2 + ((java.lang.Number) objA).longValue();
                defpackage.nht nhtVar = new defpackage.nht(hxfVar, (aoln) null, 3);
                nilVar.a = i;
                nilVar.b = j;
                nilVar.e = 1;
                objK = aooh.K(jLongValue, nhtVar, nilVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = nilVar.b;
                i = nilVar.a;
                aooc.af(objK);
            }
            return (defpackage.hxe) objK;
        } catch (aovk unused) {
            this.p.a(qbc.aZ);
            this.h.a(mcd.S);
            this.x = true;
            a.d().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "awaitPlaybackSessionWithTimeout", 440, "DobbyUplinkAudioInjector.kt").I("NGCS.AudioPlaying.Timeout duration(%ss) played(%ss)", new aepb(i), new aepb(j$.time.Instant.now().toEpochMilli() - j));
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(aenj aenjVar, aoln aolnVar) {
        defpackage.nim nimVar;
        aepc aepcVar;
        aepc aepcVar2;
        aepc aepcVar3;
        aepc aepcVar4;
        aepc aepcVar5;
        java.lang.Object[] objArr;
        java.lang.String str;
        aepc aepcVar6;
        aepc aepcVar7;
        aimw aimwVar;
        java.lang.Object[] objArr2;
        aepc aepcVar8;
        aepg aepgVar;
        aepc aepcVar9;
        if (aolnVar instanceof defpackage.nim) {
            nimVar = (defpackage.nim) aolnVar;
            int i = nimVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nimVar.d = i - Integer.MIN_VALUE;
            } else {
                nimVar = new defpackage.nim(this, aolnVar);
            }
        } else {
            nimVar = new defpackage.nim(this, aolnVar);
        }
        java.lang.Object objA = nimVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nimVar.d;
        if (i2 == 0) {
            aooc.af(objA);
            aimw aimwVarL = a.d().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "dumpCallPropties", 948, "DobbyUplinkAudioInjector.kt");
            aepg aepgVar2 = new aepg(aenjVar);
            ptx ptxVar = this.y;
            aepc aepcVar10 = new aepc(ptxVar.p());
            aepc aepcVar11 = new aepc(ptxVar.n());
            aepc aepcVar12 = new aepc(ptxVar.j());
            aepcVar = new aepc(ptxVar.l());
            aepc aepcVar13 = new aepc(ptxVar.s());
            aepc aepcVar14 = new aepc(ptxVar.o());
            aepc aepcVar15 = new aepc(ptxVar.r());
            aepc aepcVar16 = new aepc(ptxVar.q());
            aepc aepcVar17 = new aepc(ptxVar.k());
            defpackage.mqt mqtVar = this.f;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            nimVar.e = objArr3;
            nimVar.a = aimwVarL;
            nimVar.f = "NGCS wrong states playing %s: \n isConnected: %s\n isAnswering: %s\n hasConnected: %s\n isActive: %s\n isSuspended: %s\n isAudioProcessing: %s\n isDisconnectingInitiated: %s\n isDisconnecting: %s\n hasDisconnectedDuringAnswering: %s\n events:%s";
            nimVar.g = aepgVar2;
            nimVar.h = aepcVar10;
            nimVar.i = aepcVar11;
            nimVar.j = aepcVar12;
            nimVar.k = aepcVar;
            nimVar.l = aepcVar13;
            nimVar.m = aepcVar14;
            nimVar.n = aepcVar15;
            nimVar.o = aepcVar16;
            nimVar.p = aepcVar17;
            nimVar.q = objArr3;
            nimVar.d = 1;
            objA = mqtVar.a(nimVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            aepcVar2 = aepcVar14;
            aepcVar3 = aepcVar11;
            aepcVar4 = aepcVar13;
            aepcVar5 = aepcVar12;
            objArr = objArr3;
            str = "NGCS wrong states playing %s: \n isConnected: %s\n isAnswering: %s\n hasConnected: %s\n isActive: %s\n isSuspended: %s\n isAudioProcessing: %s\n isDisconnectingInitiated: %s\n isDisconnecting: %s\n hasDisconnectedDuringAnswering: %s\n events:%s";
            aepcVar6 = aepcVar10;
            aepcVar7 = aepcVar15;
            aimwVar = aimwVarL;
            objArr2 = objArr;
            aepcVar8 = aepcVar17;
            aepgVar = aepgVar2;
            aepcVar9 = aepcVar16;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objArr = nimVar.q;
            aepc aepcVar18 = nimVar.p;
            aepc aepcVar19 = nimVar.o;
            aepc aepcVar20 = nimVar.n;
            aepc aepcVar21 = nimVar.m;
            aepc aepcVar22 = nimVar.l;
            aepcVar = nimVar.k;
            aepc aepcVar23 = nimVar.j;
            aepc aepcVar24 = nimVar.i;
            aepc aepcVar25 = nimVar.h;
            aepg aepgVar3 = nimVar.g;
            java.lang.String str2 = nimVar.f;
            java.lang.Object obj = nimVar.a;
            java.lang.Object[] objArr4 = nimVar.e;
            aooc.af(objA);
            objArr2 = objArr4;
            aimwVar = obj;
            aepcVar8 = aepcVar18;
            str = str2;
            aepcVar9 = aepcVar19;
            aepgVar = aepgVar3;
            aepcVar7 = aepcVar20;
            aepcVar6 = aepcVar25;
            aepcVar2 = aepcVar21;
            aepcVar3 = aepcVar24;
            aepcVar4 = aepcVar22;
            aepcVar5 = aepcVar23;
        }
        objArr[0] = new aepg((aenj) objA);
        aimwVar.R(str, aepgVar, aepcVar6, aepcVar3, aepcVar5, aepcVar, aepcVar4, aepcVar2, aepcVar7, aepcVar9, aepcVar8, objArr2);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(alsn alsnVar, boolean z, aoln aolnVar) {
        defpackage.nin ninVar;
        int i;
        int i2;
        defpackage.nih nihVar;
        if (aolnVar instanceof defpackage.nin) {
            ninVar = (defpackage.nin) aolnVar;
            int i3 = ninVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ninVar.d = i3 - Integer.MIN_VALUE;
            } else {
                ninVar = new defpackage.nin(this, aolnVar);
            }
        } else {
            ninVar = new defpackage.nin(this, aolnVar);
        }
        java.lang.Object obj = ninVar.b;
        aolu aoluVar = aolu.a;
        int i4 = ninVar.d;
        if (i4 != 0) {
            if (i4 == 1) {
                aooc.af(obj);
                a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "evaluateRecordingPlaybackStart", 255, "DobbyUplinkAudioInjector.kt").v("file does not exist");
                this.h.a(mcd.J);
                return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_FAILED);
            }
            if (i4 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = ninVar.a;
            aooc.af(obj);
            nihVar = (defpackage.nih) obj;
            if ((nihVar != null ? nihVar.a : null) == null || !this.n) {
                return new defpackage.nij(nihVar, 1 == i2);
            }
            this.p.a(qbc.ba);
            return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_CANCELLED_UNDER_WRONG_STATES);
        }
        aooc.af(obj);
        if ((alsnVar.b & 2) == 0) {
            a.c().m(aioa.b).i(zct.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "evaluateRecordingPlaybackStart", 247, "DobbyUplinkAudioInjector.kt").v("received no recording file, not playing anything");
            this.h.a(mcd.I);
            return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_FAILED);
        }
        alsm alsmVar = alsnVar.d;
        if (alsmVar == null) {
            alsmVar = alsm.a;
        }
        if (!new java.io.File(alsmVar.c).exists()) {
            defpackage.mqt mqtVar = this.f;
            defpackage.nvp nvpVar = defpackage.nvp.EVENT_DOBBY_PLAY_RECORDING_ERROR;
            ninVar.d = 1;
            if (mqtVar.x(nvpVar, ninVar) == aoluVar) {
                return aoluVar;
            }
            a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "evaluateRecordingPlaybackStart", 255, "DobbyUplinkAudioInjector.kt").v("file does not exist");
            this.h.a(mcd.J);
            return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_FAILED);
        }
        alsm alsmVar2 = alsnVar.d;
        if (alsmVar2 == null) {
            alsmVar2 = alsm.a;
        }
        java.lang.String str = alsmVar2.c;
        if (str == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        if (aoov.r(str, ".amr", false)) {
            a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "evaluateRecordingPlaybackStart", 266, "DobbyUplinkAudioInjector.kt").v("custom greeting is used for disclaimer...");
            i = 1;
        } else {
            alsm alsmVar3 = alsnVar.d;
            if (alsmVar3 == null) {
                alsmVar3 = alsm.a;
            }
            java.lang.String str2 = alsmVar3.c;
            if (str2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            if (aoov.r(str2, ".m4a", false)) {
                a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "evaluateRecordingPlaybackStart", 266, "DobbyUplinkAudioInjector.kt").v("custom greeting is used for disclaimer...");
                i = 1;
            } else {
                i = 0;
            }
        }
        if (((java.lang.Boolean) this.w.a()).booleanValue() && this.x && z) {
            this.p.a(qbc.ba);
            return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_CANCELLED_DUE_TO_AUDIO_PLAYING_ISSUES_DETECTED);
        }
        ninVar.a = i;
        ninVar.d = 2;
        java.lang.Object objAj = aoov.aj(this.b, new defpackage.niv(this, alsnVar, (aoln) null, 0), ninVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        int i5 = i;
        obj = objAj;
        i2 = i5;
        nihVar = (defpackage.nih) obj;
        if ((nihVar != null ? nihVar.a : null) == null) {
        }
        return new defpackage.nij(nihVar, 1 == i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(altf altfVar, boolean z, aoln aolnVar) {
        defpackage.nio nioVar;
        if (aolnVar instanceof defpackage.nio) {
            nioVar = (defpackage.nio) aolnVar;
            int i = nioVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nioVar.c = i - Integer.MIN_VALUE;
            } else {
                nioVar = new defpackage.nio(this, aolnVar);
            }
        } else {
            nioVar = new defpackage.nio(this, aolnVar);
        }
        java.lang.Object objI = nioVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nioVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objI);
                if ((altfVar.b & 1) == 0) {
                    a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "evaluateTtsPlaybackStart", 205, "DobbyUplinkAudioInjector.kt").v("received TtsRequest without text, not playing anything");
                    this.h.a(mcd.K);
                    return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_FAILED);
                }
                if (((java.lang.Boolean) this.w.a()).booleanValue() && this.x && z) {
                    this.p.a(qbc.ba);
                    return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_CANCELLED_DUE_TO_AUDIO_PLAYING_ISSUES_DETECTED);
                }
                java.lang.String str = altfVar.c;
                aooh.e(str, "getText(...)");
                nioVar.c = 1;
                objI = i(str, nioVar);
                if (objI == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            defpackage.nih nihVar = (defpackage.nih) objI;
            if ((nihVar != null ? nihVar.a : null) != null || !this.n) {
                return new defpackage.nij(nihVar, false);
            }
            this.p.a(qbc.ba);
            return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_CANCELLED_UNDER_WRONG_STATES);
        } catch (java.lang.IllegalStateException unused) {
            a.d().m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "evaluateTtsPlaybackStart", 230, "DobbyUplinkAudioInjector.kt").v("failed to play TtsRequest");
            this.h.a(mcd.M);
            return new defpackage.nii(defpackage.Cnew.PLAY_RECORDING_FAILED);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (r1 != r9) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.nih r18, long r19, alta r21, boolean r22, defpackage.nid r23, aoln r24) throws aois {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njd.e(nih, long, alta, boolean, nid, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0151  */
    /* JADX WARN: Code duplicated, block: B:35:0x0153  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:42:0x020f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0213  */
    /* JADX WARN: Code duplicated, block: B:46:0x021a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0233  */
    /* JADX WARN: Code duplicated, block: B:55:0x026c  */
    /* JADX WARN: Code duplicated, block: B:58:0x027a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0284  */
    /* JADX WARN: Code duplicated, block: B:63:0x028e  */
    /* JADX WARN: Code duplicated, block: B:65:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x031f  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object f(defpackage.hxe hxeVar, int i, defpackage.nih nihVar, long j, alta altaVar, boolean z, aoln aolnVar) {
        defpackage.niq niqVar;
        java.lang.String str;
        alta altaVar2;
        int i2;
        int i3;
        boolean z2;
        long j2;
        java.lang.String str2;
        java.lang.Long l;
        defpackage.hxe hxeVar2;
        defpackage.njd njdVar;
        defpackage.njd njdVar2;
        java.lang.String str3;
        java.lang.Object obj;
        boolean z3;
        defpackage.hxe hxeVar3;
        boolean z4;
        akzx akzxVarM;
        java.lang.Object objB;
        alta altaVar3;
        defpackage.hxe hxeVar4;
        boolean z5;
        defpackage.hxe hxeVar5;
        alro alroVarD;
        defpackage.hxe hxeVar6;
        java.lang.Object objAj;
        defpackage.mqt mqtVar;
        defpackage.nvp nvpVar;
        ptx ptxVar;
        java.lang.Object objB2;
        if (aolnVar instanceof defpackage.niq) {
            niqVar = (defpackage.niq) aolnVar;
            int i4 = niqVar.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                niqVar.f = i4 - Integer.MIN_VALUE;
            } else {
                niqVar = new defpackage.niq(this, aolnVar);
            }
        } else {
            niqVar = new defpackage.niq(this, aolnVar);
        }
        java.lang.Object objG = niqVar.d;
        aolu aoluVar = aolu.a;
        java.lang.String str4 = "handlePlaybackSessionResult";
        switch (niqVar.f) {
            case 0:
                aooc.af(objG);
                long epochMilli = j$.time.Instant.now().toEpochMilli() - nihVar.c;
                long j3 = i;
                str = "DobbyUplinkAudioInjector.kt";
                a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "handlePlaybackSessionResult", 461, "DobbyUplinkAudioInjector.kt").M("Complete playing. duration(%ss) played(%ss) Result: %s", new aepb(j3), new aepb(epochMilli), new aepg(hxeVar));
                java.lang.Object objA = this.u.a();
                aooh.e(objA, "get(...)");
                if (epochMilli > j3 + ((java.lang.Number) objA).longValue()) {
                    this.x = true;
                    this.p.a(qbc.aZ);
                }
                java.lang.String str5 = nihVar.b;
                int i5 = hxeVar == defpackage.hxe.a ? 1 : 0;
                if (hxeVar == defpackage.hxe.b) {
                    defpackage.nrv nrvVar = this.g;
                    niqVar.g = hxeVar;
                    altaVar2 = altaVar;
                    niqVar.h = altaVar2;
                    niqVar.i = this;
                    niqVar.j = str5;
                    niqVar.a = z;
                    niqVar.b = j;
                    niqVar.c = i5;
                    i2 = 1;
                    niqVar.f = 1;
                    java.lang.Object objD = nrvVar.d(niqVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    njdVar2 = this;
                    str3 = str5;
                    hxeVar2 = hxeVar;
                    i3 = i5;
                    z2 = z;
                    obj = objD;
                    j2 = j;
                    java.lang.String str6 = str3;
                    l = (java.lang.Long) obj;
                    str2 = str6;
                    njdVar = njdVar2;
                } else {
                    altaVar2 = altaVar;
                    i2 = 1;
                    i3 = i5;
                    z2 = z;
                    j2 = j;
                    str2 = str5;
                    l = null;
                    hxeVar2 = hxeVar;
                    njdVar = this;
                }
                if (i2 != i3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                niqVar.g = hxeVar2;
                niqVar.h = altaVar2;
                niqVar.i = null;
                niqVar.j = null;
                niqVar.a = z2;
                niqVar.f = 2;
                defpackage.ogj ogjVar = njdVar.z;
                defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                hxeVar3 = hxeVar2;
                akzx akzxVarM2 = defpackage.nlz.a.m();
                aooh.f(akzxVarM2, "builder");
                z4 = z2;
                akzxVarM = defpackage.nmp.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                ((defpackage.nmp) akzxVarM.b).c = j2;
                aooh.f(str2, "value");
                akzxVarM.u();
                defpackage.nmp nmpVar = (defpackage.nmp) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                nmpVar.d = str2;
                akzxVarM.u();
                ((defpackage.nmp) akzxVarM.b).e = z3;
                if (l != null) {
                    l.longValue();
                    long jLongValue = l.longValue();
                    akzxVarM.u();
                    defpackage.nmp nmpVar2 = (defpackage.nmp) akzxVarM.b;
                    nmpVar2.b |= 1;
                    nmpVar2.f = jLongValue;
                }
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.nmp nmpVar3 = (defpackage.nmp) aladVarP;
                aooh.f(nmpVar3, "value");
                akzxVarM2.u();
                defpackage.nlz nlzVar = (defpackage.nlz) akzxVarM2.b;
                j$.util.Objects.requireNonNull(nmpVar3);
                nlzVar.c = nmpVar3;
                nlzVar.b |= 1;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.nlz nlzVar2 = (defpackage.nlz) aladVarP2;
                aooh.f(nlzVar2, "value");
                akzx akzxVar = (akzx) r26.a;
                akzxVar.u();
                defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
                j$.util.Objects.requireNonNull(nlzVar2);
                nmkVar.c = nlzVar2;
                nmkVar.b = 4;
                objB = ogjVar.b(npwVarAB.D(), niqVar);
                if (objB != aoluVar) {
                    objB = aojh.a;
                }
                if (objB != aoluVar) {
                    return aoluVar;
                }
                altaVar3 = altaVar2;
                hxeVar4 = hxeVar3;
                z5 = z4;
                if (altaVar3 != null) {
                    alroVarD = defpackage.mzp.d(altaVar3);
                    niqVar.g = hxeVar4;
                    niqVar.h = null;
                    niqVar.a = z5;
                    niqVar.f = 3;
                    if (k(alroVarD, niqVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                hxeVar5 = hxeVar4;
                if (hxeVar5 == defpackage.hxe.c) {
                    mqtVar = this.f;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_PLAY_RECORDING_ERROR;
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 4;
                    if (mqtVar.x(nvpVar, niqVar) == aoluVar) {
                        return aoluVar;
                    }
                    a.d().i(zct.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", str4, 487, str).v("playback session completed with reason FAILED, return false");
                    ptxVar = this.y;
                    if (!ptxVar.r() || ptxVar.p()) {
                        this.h.b(mce.bR);
                    } else {
                        this.h.a(mcd.R);
                    }
                    return defpackage.Cnew.PLAY_RECORDING_FAILED;
                }
                this.h.b(mce.cc);
                hxeVar6 = null;
                if (z5) {
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 5;
                    objAj = aoov.aj(this.b, new defpackage.hnj(this, (aoln) null, 13), niqVar);
                    if (objAj != aoluVar) {
                        objAj = aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                }
                niqVar.g = hxeVar6;
                niqVar.h = hxeVar6;
                niqVar.f = 6;
                objG = g(niqVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    niqVar.f = 7;
                    defpackage.ogj ogjVar2 = this.z;
                    defpackage.npw npwVarAB2 = mni.aB(defpackage.nmk.a.m());
                    akzx akzxVarM3 = defpackage.nlo.a.m();
                    aooh.f(akzxVarM3, "builder");
                    akzxVarM3.u();
                    ((defpackage.nlo) akzxVarM3.b).c = true;
                    long epochMilli2 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM3.u();
                    defpackage.nlo nloVar = (defpackage.nlo) akzxVarM3.b;
                    nloVar.b |= 1;
                    nloVar.d = epochMilli2;
                    alad aladVarP3 = akzxVarM3.p();
                    aooh.e(aladVarP3, "build(...)");
                    defpackage.nlo nloVar2 = (defpackage.nlo) aladVarP3;
                    aooh.f(nloVar2, "value");
                    akzx akzxVar2 = (akzx) npwVarAB2.a;
                    akzxVar2.u();
                    defpackage.nmk nmkVar2 = (defpackage.nmk) akzxVar2.b;
                    j$.util.Objects.requireNonNull(nloVar2);
                    nmkVar2.c = nloVar2;
                    nmkVar2.b = 16;
                    objB2 = ogjVar2.b(npwVarAB2.D(), niqVar);
                    if (objB2 != aoluVar) {
                        objB2 = aojh.a;
                    }
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.Cnew.PLAY_RECORDING_COMPLETED;
            case 1:
                int i6 = niqVar.c;
                j2 = niqVar.b;
                boolean z6 = niqVar.a;
                java.lang.String str7 = niqVar.j;
                defpackage.njd njdVar3 = niqVar.i;
                alta altaVar4 = niqVar.h;
                defpackage.hxe hxeVar7 = niqVar.g;
                aooc.af(objG);
                str3 = str7;
                njdVar2 = njdVar3;
                str = "DobbyUplinkAudioInjector.kt";
                i3 = i6;
                altaVar2 = altaVar4;
                obj = objG;
                z2 = z6;
                hxeVar2 = hxeVar7;
                i2 = 1;
                java.lang.String str8 = str3;
                l = (java.lang.Long) obj;
                str2 = str8;
                njdVar = njdVar2;
                if (i2 != i3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                niqVar.g = hxeVar2;
                niqVar.h = altaVar2;
                niqVar.i = null;
                niqVar.j = null;
                niqVar.a = z2;
                niqVar.f = 2;
                defpackage.ogj ogjVar3 = njdVar.z;
                defpackage.npw npwVarAB3 = mni.aB(defpackage.nmk.a.m());
                hxeVar3 = hxeVar2;
                akzx akzxVarM4 = defpackage.nlz.a.m();
                aooh.f(akzxVarM4, "builder");
                z4 = z2;
                akzxVarM = defpackage.nmp.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                ((defpackage.nmp) akzxVarM.b).c = j2;
                aooh.f(str2, "value");
                akzxVarM.u();
                defpackage.nmp nmpVar4 = (defpackage.nmp) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                nmpVar4.d = str2;
                akzxVarM.u();
                ((defpackage.nmp) akzxVarM.b).e = z3;
                if (l != null) {
                    l.longValue();
                    long jLongValue2 = l.longValue();
                    akzxVarM.u();
                    defpackage.nmp nmpVar5 = (defpackage.nmp) akzxVarM.b;
                    nmpVar5.b |= 1;
                    nmpVar5.f = jLongValue2;
                }
                alad aladVarP4 = akzxVarM.p();
                aooh.e(aladVarP4, "build(...)");
                defpackage.nmp nmpVar6 = (defpackage.nmp) aladVarP4;
                aooh.f(nmpVar6, "value");
                akzxVarM4.u();
                defpackage.nlz nlzVar3 = (defpackage.nlz) akzxVarM4.b;
                j$.util.Objects.requireNonNull(nmpVar6);
                nlzVar3.c = nmpVar6;
                nlzVar3.b |= 1;
                alad aladVarP5 = akzxVarM4.p();
                aooh.e(aladVarP5, "build(...)");
                defpackage.nlz nlzVar4 = (defpackage.nlz) aladVarP5;
                aooh.f(nlzVar4, "value");
                akzx akzxVar3 = (akzx) r26.a;
                akzxVar3.u();
                defpackage.nmk nmkVar3 = (defpackage.nmk) akzxVar3.b;
                j$.util.Objects.requireNonNull(nlzVar4);
                nmkVar3.c = nlzVar4;
                nmkVar3.b = 4;
                objB = ogjVar3.b(npwVarAB3.D(), niqVar);
                if (objB != aoluVar) {
                    objB = aojh.a;
                }
                if (objB != aoluVar) {
                    return aoluVar;
                }
                altaVar3 = altaVar2;
                hxeVar4 = hxeVar3;
                z5 = z4;
                if (altaVar3 != null) {
                    alroVarD = defpackage.mzp.d(altaVar3);
                    niqVar.g = hxeVar4;
                    niqVar.h = null;
                    niqVar.a = z5;
                    niqVar.f = 3;
                    if (k(alroVarD, niqVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                hxeVar5 = hxeVar4;
                if (hxeVar5 == defpackage.hxe.c) {
                    mqtVar = this.f;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_PLAY_RECORDING_ERROR;
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 4;
                    if (mqtVar.x(nvpVar, niqVar) == aoluVar) {
                        return aoluVar;
                    }
                    a.d().i(zct.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", str4, 487, str).v("playback session completed with reason FAILED, return false");
                    ptxVar = this.y;
                    if (ptxVar.r()) {
                        this.h.b(mce.bR);
                    } else {
                        this.h.b(mce.bR);
                    }
                    return defpackage.Cnew.PLAY_RECORDING_FAILED;
                }
                this.h.b(mce.cc);
                hxeVar6 = null;
                if (z5) {
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 5;
                    objAj = aoov.aj(this.b, new defpackage.hnj(this, (aoln) null, 13), niqVar);
                    if (objAj != aoluVar) {
                        objAj = aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                }
                niqVar.g = hxeVar6;
                niqVar.h = hxeVar6;
                niqVar.f = 6;
                objG = g(niqVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    niqVar.f = 7;
                    defpackage.ogj ogjVar4 = this.z;
                    defpackage.npw npwVarAB4 = mni.aB(defpackage.nmk.a.m());
                    akzx akzxVarM5 = defpackage.nlo.a.m();
                    aooh.f(akzxVarM5, "builder");
                    akzxVarM5.u();
                    ((defpackage.nlo) akzxVarM5.b).c = true;
                    long epochMilli3 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM5.u();
                    defpackage.nlo nloVar3 = (defpackage.nlo) akzxVarM5.b;
                    nloVar3.b |= 1;
                    nloVar3.d = epochMilli3;
                    alad aladVarP6 = akzxVarM5.p();
                    aooh.e(aladVarP6, "build(...)");
                    defpackage.nlo nloVar4 = (defpackage.nlo) aladVarP6;
                    aooh.f(nloVar4, "value");
                    akzx akzxVar4 = (akzx) npwVarAB4.a;
                    akzxVar4.u();
                    defpackage.nmk nmkVar4 = (defpackage.nmk) akzxVar4.b;
                    j$.util.Objects.requireNonNull(nloVar4);
                    nmkVar4.c = nloVar4;
                    nmkVar4.b = 16;
                    objB2 = ogjVar4.b(npwVarAB4.D(), niqVar);
                    if (objB2 != aoluVar) {
                        objB2 = aojh.a;
                    }
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.Cnew.PLAY_RECORDING_COMPLETED;
            case 2:
                z5 = niqVar.a;
                altaVar3 = niqVar.h;
                hxeVar4 = niqVar.g;
                aooc.af(objG);
                str = "DobbyUplinkAudioInjector.kt";
                str4 = "handlePlaybackSessionResult";
                if (altaVar3 != null) {
                    alroVarD = defpackage.mzp.d(altaVar3);
                    niqVar.g = hxeVar4;
                    niqVar.h = null;
                    niqVar.a = z5;
                    niqVar.f = 3;
                    if (k(alroVarD, niqVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                hxeVar5 = hxeVar4;
                if (hxeVar5 == defpackage.hxe.c) {
                    mqtVar = this.f;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_PLAY_RECORDING_ERROR;
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 4;
                    if (mqtVar.x(nvpVar, niqVar) == aoluVar) {
                        return aoluVar;
                    }
                    a.d().i(zct.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", str4, 487, str).v("playback session completed with reason FAILED, return false");
                    ptxVar = this.y;
                    if (ptxVar.r()) {
                        this.h.b(mce.bR);
                    } else {
                        this.h.b(mce.bR);
                    }
                    return defpackage.Cnew.PLAY_RECORDING_FAILED;
                }
                this.h.b(mce.cc);
                hxeVar6 = null;
                if (z5) {
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 5;
                    objAj = aoov.aj(this.b, new defpackage.hnj(this, (aoln) null, 13), niqVar);
                    if (objAj != aoluVar) {
                        objAj = aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                }
                niqVar.g = hxeVar6;
                niqVar.h = hxeVar6;
                niqVar.f = 6;
                objG = g(niqVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    niqVar.f = 7;
                    defpackage.ogj ogjVar5 = this.z;
                    defpackage.npw npwVarAB5 = mni.aB(defpackage.nmk.a.m());
                    akzx akzxVarM6 = defpackage.nlo.a.m();
                    aooh.f(akzxVarM6, "builder");
                    akzxVarM6.u();
                    ((defpackage.nlo) akzxVarM6.b).c = true;
                    long epochMilli4 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM6.u();
                    defpackage.nlo nloVar5 = (defpackage.nlo) akzxVarM6.b;
                    nloVar5.b |= 1;
                    nloVar5.d = epochMilli4;
                    alad aladVarP7 = akzxVarM6.p();
                    aooh.e(aladVarP7, "build(...)");
                    defpackage.nlo nloVar6 = (defpackage.nlo) aladVarP7;
                    aooh.f(nloVar6, "value");
                    akzx akzxVar5 = (akzx) npwVarAB5.a;
                    akzxVar5.u();
                    defpackage.nmk nmkVar5 = (defpackage.nmk) akzxVar5.b;
                    j$.util.Objects.requireNonNull(nloVar6);
                    nmkVar5.c = nloVar6;
                    nmkVar5.b = 16;
                    objB2 = ogjVar5.b(npwVarAB5.D(), niqVar);
                    if (objB2 != aoluVar) {
                        objB2 = aojh.a;
                    }
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.Cnew.PLAY_RECORDING_COMPLETED;
            case 3:
                z5 = niqVar.a;
                hxeVar5 = niqVar.g;
                aooc.af(objG);
                str = "DobbyUplinkAudioInjector.kt";
                str4 = "handlePlaybackSessionResult";
                if (hxeVar5 == defpackage.hxe.c) {
                    mqtVar = this.f;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_PLAY_RECORDING_ERROR;
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 4;
                    if (mqtVar.x(nvpVar, niqVar) == aoluVar) {
                        return aoluVar;
                    }
                    a.d().i(zct.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", str4, 487, str).v("playback session completed with reason FAILED, return false");
                    ptxVar = this.y;
                    if (ptxVar.r()) {
                        this.h.b(mce.bR);
                    } else {
                        this.h.b(mce.bR);
                    }
                    return defpackage.Cnew.PLAY_RECORDING_FAILED;
                }
                this.h.b(mce.cc);
                hxeVar6 = null;
                if (z5) {
                    niqVar.g = null;
                    niqVar.h = null;
                    niqVar.f = 5;
                    objAj = aoov.aj(this.b, new defpackage.hnj(this, (aoln) null, 13), niqVar);
                    if (objAj != aoluVar) {
                        objAj = aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                }
                niqVar.g = hxeVar6;
                niqVar.h = hxeVar6;
                niqVar.f = 6;
                objG = g(niqVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    niqVar.f = 7;
                    defpackage.ogj ogjVar6 = this.z;
                    defpackage.npw npwVarAB6 = mni.aB(defpackage.nmk.a.m());
                    akzx akzxVarM7 = defpackage.nlo.a.m();
                    aooh.f(akzxVarM7, "builder");
                    akzxVarM7.u();
                    ((defpackage.nlo) akzxVarM7.b).c = true;
                    long epochMilli5 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM7.u();
                    defpackage.nlo nloVar7 = (defpackage.nlo) akzxVarM7.b;
                    nloVar7.b |= 1;
                    nloVar7.d = epochMilli5;
                    alad aladVarP8 = akzxVarM7.p();
                    aooh.e(aladVarP8, "build(...)");
                    defpackage.nlo nloVar8 = (defpackage.nlo) aladVarP8;
                    aooh.f(nloVar8, "value");
                    akzx akzxVar6 = (akzx) npwVarAB6.a;
                    akzxVar6.u();
                    defpackage.nmk nmkVar6 = (defpackage.nmk) akzxVar6.b;
                    j$.util.Objects.requireNonNull(nloVar8);
                    nmkVar6.c = nloVar8;
                    nmkVar6.b = 16;
                    objB2 = ogjVar6.b(npwVarAB6.D(), niqVar);
                    if (objB2 != aoluVar) {
                        objB2 = aojh.a;
                    }
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.Cnew.PLAY_RECORDING_COMPLETED;
            case 4:
                aooc.af(objG);
                str = "DobbyUplinkAudioInjector.kt";
                str4 = "handlePlaybackSessionResult";
                a.d().i(zct.b).l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", str4, 487, str).v("playback session completed with reason FAILED, return false");
                ptxVar = this.y;
                if (ptxVar.r()) {
                    this.h.b(mce.bR);
                } else {
                    this.h.b(mce.bR);
                }
                return defpackage.Cnew.PLAY_RECORDING_FAILED;
            case 5:
                aooc.af(objG);
                hxeVar6 = null;
                niqVar.g = hxeVar6;
                niqVar.h = hxeVar6;
                niqVar.f = 6;
                objG = g(niqVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    niqVar.f = 7;
                    defpackage.ogj ogjVar7 = this.z;
                    defpackage.npw npwVarAB7 = mni.aB(defpackage.nmk.a.m());
                    akzx akzxVarM8 = defpackage.nlo.a.m();
                    aooh.f(akzxVarM8, "builder");
                    akzxVarM8.u();
                    ((defpackage.nlo) akzxVarM8.b).c = true;
                    long epochMilli6 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM8.u();
                    defpackage.nlo nloVar9 = (defpackage.nlo) akzxVarM8.b;
                    nloVar9.b |= 1;
                    nloVar9.d = epochMilli6;
                    alad aladVarP9 = akzxVarM8.p();
                    aooh.e(aladVarP9, "build(...)");
                    defpackage.nlo nloVar10 = (defpackage.nlo) aladVarP9;
                    aooh.f(nloVar10, "value");
                    akzx akzxVar7 = (akzx) npwVarAB7.a;
                    akzxVar7.u();
                    defpackage.nmk nmkVar7 = (defpackage.nmk) akzxVar7.b;
                    j$.util.Objects.requireNonNull(nloVar10);
                    nmkVar7.c = nloVar10;
                    nmkVar7.b = 16;
                    objB2 = ogjVar7.b(npwVarAB7.D(), niqVar);
                    if (objB2 != aoluVar) {
                        objB2 = aojh.a;
                    }
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.Cnew.PLAY_RECORDING_COMPLETED;
            case 6:
                aooc.af(objG);
                if (((java.lang.Boolean) objG).booleanValue()) {
                    niqVar.f = 7;
                    defpackage.ogj ogjVar8 = this.z;
                    defpackage.npw npwVarAB8 = mni.aB(defpackage.nmk.a.m());
                    akzx akzxVarM9 = defpackage.nlo.a.m();
                    aooh.f(akzxVarM9, "builder");
                    akzxVarM9.u();
                    ((defpackage.nlo) akzxVarM9.b).c = true;
                    long epochMilli7 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM9.u();
                    defpackage.nlo nloVar11 = (defpackage.nlo) akzxVarM9.b;
                    nloVar11.b |= 1;
                    nloVar11.d = epochMilli7;
                    alad aladVarP10 = akzxVarM9.p();
                    aooh.e(aladVarP10, "build(...)");
                    defpackage.nlo nloVar12 = (defpackage.nlo) aladVarP10;
                    aooh.f(nloVar12, "value");
                    akzx akzxVar8 = (akzx) npwVarAB8.a;
                    akzxVar8.u();
                    defpackage.nmk nmkVar8 = (defpackage.nmk) akzxVar8.b;
                    j$.util.Objects.requireNonNull(nloVar12);
                    nmkVar8.c = nloVar12;
                    nmkVar8.b = 16;
                    objB2 = ogjVar8.b(npwVarAB8.D(), niqVar);
                    if (objB2 != aoluVar) {
                        objB2 = aojh.a;
                    }
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                }
                return defpackage.Cnew.PLAY_RECORDING_COMPLETED;
            case 7:
                aooc.af(objG);
                return defpackage.Cnew.PLAY_RECORDING_COMPLETED;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.nir nirVar;
        defpackage.nmo nmoVarB;
        if (aolnVar instanceof defpackage.nir) {
            nirVar = (defpackage.nir) aolnVar;
            int i = nirVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nirVar.c = i - Integer.MIN_VALUE;
            } else {
                nirVar = new defpackage.nir(this, aolnVar);
            }
        } else {
            nirVar = new defpackage.nir(this, aolnVar);
        }
        java.lang.Object objA = nirVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nirVar.c;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
            if (nmoVarB == null) {
                nmoVarB = defpackage.nmo.UNRECOGNIZED;
            }
            if (nmoVarB != defpackage.nmo.BEESLY_WITH_UI) {
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objA);
        defpackage.ogj ogjVar = this.z;
        nirVar.c = 1;
        objA = ogjVar.a(nirVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.nmo nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) objA).c);
        if (nmoVarB2 == null) {
            nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
        }
        if (nmoVarB2 != defpackage.nmo.BEESLY) {
            defpackage.ogj ogjVar2 = this.z;
            nirVar.c = 2;
            objA = ogjVar2.a(nirVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
            if (nmoVarB == null) {
                nmoVarB = defpackage.nmo.UNRECOGNIZED;
            }
            if (nmoVarB != defpackage.nmo.BEESLY_WITH_UI) {
                z = false;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.nis nisVar;
        if (aolnVar instanceof defpackage.nis) {
            nisVar = (defpackage.nis) aolnVar;
            int i = nisVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nisVar.c = i - Integer.MIN_VALUE;
            } else {
                nisVar = new defpackage.nis(this, aolnVar);
            }
        } else {
            nisVar = new defpackage.nis(this, aolnVar);
        }
        java.lang.Object objA = nisVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nisVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.ogj ogjVar = this.z;
            nisVar.c = 1;
            objA = ogjVar.a(nisVar);
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
        if (nmsVarB == null) {
            nmsVarB = defpackage.nms.UNRECOGNIZED;
        }
        return java.lang.Boolean.valueOf(nmsVarB == defpackage.nms.CASE_BEESLY);
    }

    public final java.lang.Object i(java.lang.String str, aoln aolnVar) {
        return aoov.aj(this.b, new defpackage.niy(this, str, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:27:0x0135  */
    /* JADX WARN: Code duplicated, block: B:30:0x0198  */
    /* JADX WARN: Code duplicated, block: B:32:0x019c  */
    /* JADX WARN: Code duplicated, block: B:34:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f7 A[PHI: r4 r6 r9 r10
      0x01f7: PHI (r4v27 long) = (r4v25 long), (r4v29 long) binds: [B:39:0x01d4, B:43:0x01ed] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r6v15 java.lang.Integer) = (r6v12 java.lang.Integer), (r6v17 java.lang.Integer) binds: [B:39:0x01d4, B:43:0x01ed] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r9v12 alta) = (r9v10 alta), (r9v14 alta) binds: [B:39:0x01d4, B:43:0x01ed] A[DONT_GENERATE, DONT_INLINE]
      0x01f7: PHI (r10v19 hxf) = (r10v16 hxf), (r10v21 hxf) binds: [B:39:0x01d4, B:43:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0239  */
    /* JADX WARN: Code duplicated, block: B:59:0x0255  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object j(defpackage.hxf hxfVar, long j, alta altaVar, defpackage.nid nidVar, aoln aolnVar) {
        defpackage.niz nizVar;
        defpackage.hxf hxfVar2;
        alta altaVar2;
        defpackage.nid nidVar2;
        long j2;
        long j3;
        alta altaVar3;
        defpackage.hxf hxfVar3;
        java.lang.Integer num;
        java.lang.Object objB;
        defpackage.hxf hxfVar4;
        alta altaVar4;
        java.lang.Integer num2;
        alro alroVarE;
        java.lang.Integer num3;
        defpackage.hxe hxeVar;
        if (aolnVar instanceof defpackage.niz) {
            nizVar = (defpackage.niz) aolnVar;
            int i = nizVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nizVar.f = i - Integer.MIN_VALUE;
            } else {
                nizVar = new defpackage.niz(this, aolnVar);
            }
        } else {
            nizVar = new defpackage.niz(this, aolnVar);
        }
        java.lang.Object objD = nizVar.d;
        aolu aoluVar = aolu.a;
        switch (nizVar.f) {
            case 0:
                aooc.af(objD);
                a.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playbackSessionStartAndWait", 386, "DobbyUplinkAudioInjector.kt").v("waiting for playback to start");
                ajcq ajcqVarC = hxfVar.c();
                aooh.e(ajcqVarC, "playbackStartedFuture(...)");
                nizVar.a = hxfVar;
                nizVar.g = altaVar;
                nizVar.b = nidVar;
                nizVar.c = j;
                nizVar.f = 1;
                if (aosv.D(ajcqVarC, nizVar) == aoluVar) {
                    return aoluVar;
                }
                hxfVar2 = hxfVar;
                altaVar2 = altaVar;
                nidVar2 = nidVar;
                j2 = j;
                if (nidVar2 != null) {
                    this.j.p(nidVar2.a, nidVar2.b);
                }
                aimz aimzVar = a;
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playbackSessionStartAndWait", 389, "DobbyUplinkAudioInjector.kt").v("sending bot speech started event");
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playbackSessionStartAndWait", 390, "DobbyUplinkAudioInjector.kt").x("NGCS.AudioPlaying.Timeout started(%d)", j$.time.Instant.now().toEpochMilli());
                ajcq ajcqVarA = hxfVar2.a();
                aooh.e(ajcqVarA, "durationMillis(...)");
                nizVar.a = hxfVar2;
                nizVar.g = altaVar2;
                nizVar.b = null;
                nizVar.c = j2;
                nizVar.f = 2;
                objD = aosv.D(ajcqVarA, nizVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                j3 = j2;
                altaVar3 = altaVar2;
                hxfVar3 = hxfVar2;
                num = (java.lang.Integer) objD;
                nizVar.a = hxfVar3;
                nizVar.g = altaVar3;
                nizVar.b = num;
                nizVar.c = j3;
                nizVar.f = 3;
                defpackage.ogj ogjVar = this.z;
                defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                akzx akzxVarM = defpackage.nlm.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                defpackage.nlm nlmVar = (defpackage.nlm) akzxVarM.b;
                nlmVar.b |= 1;
                nlmVar.c = true;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.nlm nlmVar2 = (defpackage.nlm) aladVarP;
                aooh.f(nlmVar2, "value");
                akzx akzxVar = (akzx) npwVarAB.a;
                akzxVar.u();
                defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
                j$.util.Objects.requireNonNull(nlmVar2);
                nmkVar.c = nlmVar2;
                nmkVar.b = 12;
                objB = ogjVar.b(npwVarAB.D(), nizVar);
                if (objB != aoluVar) {
                    objB = aojh.a;
                }
                if (objB == aoluVar) {
                    return aoluVar;
                }
                hxfVar4 = hxfVar3;
                altaVar4 = altaVar3;
                num2 = num;
                if (altaVar4 != null) {
                    aooh.c(num2);
                    alroVarE = defpackage.mzp.e(altaVar4, num2.intValue());
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 4;
                    if (k(alroVarE, nizVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                nizVar.a = hxfVar4;
                nizVar.g = altaVar4;
                nizVar.b = num2;
                nizVar.c = j3;
                nizVar.f = 5;
                objD = h(nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objD).booleanValue()) {
                    this.h.b(mce.ha);
                } else {
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 6;
                    objD = g(nizVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        this.h.b(mce.ha);
                    } else {
                        this.h.b(mce.bQ);
                    }
                }
                if (((java.lang.Boolean) this.v.a()).booleanValue() || altaVar4 == null || !q(altaVar4)) {
                    ajcq ajcqVarB = hxfVar4.b();
                    aooh.e(ajcqVarB, "playbackEndedFuture(...)");
                    nizVar.a = num2;
                    nizVar.g = null;
                    nizVar.b = null;
                    nizVar.f = 8;
                    objD = aosv.D(ajcqVarB, nizVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    num3 = num2;
                    hxeVar = (defpackage.hxe) objD;
                    aooh.c(hxeVar);
                    aooh.c(num3);
                    return new defpackage.nie(hxeVar, num3.intValue());
                }
                aooh.c(num2);
                int iIntValue = num2.intValue();
                nizVar.a = num2;
                nizVar.g = null;
                nizVar.b = null;
                nizVar.f = 7;
                objD = a(hxfVar4, iIntValue, j3, nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                num3 = num2;
                hxeVar = (defpackage.hxe) objD;
                if (hxeVar == null) {
                    return defpackage.nif.a;
                }
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 1:
                j2 = nizVar.c;
                nidVar2 = (defpackage.nid) nizVar.b;
                altaVar2 = nizVar.g;
                hxfVar2 = (defpackage.hxf) nizVar.a;
                aooc.af(objD);
                if (nidVar2 != null) {
                    this.j.p(nidVar2.a, nidVar2.b);
                }
                aimz aimzVar2 = a;
                aimzVar2.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playbackSessionStartAndWait", 389, "DobbyUplinkAudioInjector.kt").v("sending bot speech started event");
                aimzVar2.b().l("com/android/dialer/dobby/impl/service/DobbyUplinkAudioInjector", "playbackSessionStartAndWait", 390, "DobbyUplinkAudioInjector.kt").x("NGCS.AudioPlaying.Timeout started(%d)", j$.time.Instant.now().toEpochMilli());
                ajcq ajcqVarA2 = hxfVar2.a();
                aooh.e(ajcqVarA2, "durationMillis(...)");
                nizVar.a = hxfVar2;
                nizVar.g = altaVar2;
                nizVar.b = null;
                nizVar.c = j2;
                nizVar.f = 2;
                objD = aosv.D(ajcqVarA2, nizVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                j3 = j2;
                altaVar3 = altaVar2;
                hxfVar3 = hxfVar2;
                num = (java.lang.Integer) objD;
                nizVar.a = hxfVar3;
                nizVar.g = altaVar3;
                nizVar.b = num;
                nizVar.c = j3;
                nizVar.f = 3;
                defpackage.ogj ogjVar2 = this.z;
                defpackage.npw npwVarAB2 = mni.aB(defpackage.nmk.a.m());
                akzx akzxVarM2 = defpackage.nlm.a.m();
                aooh.f(akzxVarM2, "builder");
                akzxVarM2.u();
                defpackage.nlm nlmVar3 = (defpackage.nlm) akzxVarM2.b;
                nlmVar3.b |= 1;
                nlmVar3.c = true;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.nlm nlmVar4 = (defpackage.nlm) aladVarP2;
                aooh.f(nlmVar4, "value");
                akzx akzxVar2 = (akzx) npwVarAB2.a;
                akzxVar2.u();
                defpackage.nmk nmkVar2 = (defpackage.nmk) akzxVar2.b;
                j$.util.Objects.requireNonNull(nlmVar4);
                nmkVar2.c = nlmVar4;
                nmkVar2.b = 12;
                objB = ogjVar2.b(npwVarAB2.D(), nizVar);
                if (objB != aoluVar) {
                    objB = aojh.a;
                }
                if (objB == aoluVar) {
                    return aoluVar;
                }
                hxfVar4 = hxfVar3;
                altaVar4 = altaVar3;
                num2 = num;
                if (altaVar4 != null) {
                    aooh.c(num2);
                    alroVarE = defpackage.mzp.e(altaVar4, num2.intValue());
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 4;
                    if (k(alroVarE, nizVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                nizVar.a = hxfVar4;
                nizVar.g = altaVar4;
                nizVar.b = num2;
                nizVar.c = j3;
                nizVar.f = 5;
                objD = h(nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objD).booleanValue()) {
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 6;
                    objD = g(nizVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        this.h.b(mce.bQ);
                    } else {
                        this.h.b(mce.ha);
                    }
                } else {
                    this.h.b(mce.ha);
                }
                if (((java.lang.Boolean) this.v.a()).booleanValue()) {
                }
                ajcq ajcqVarB2 = hxfVar4.b();
                aooh.e(ajcqVarB2, "playbackEndedFuture(...)");
                nizVar.a = num2;
                nizVar.g = null;
                nizVar.b = null;
                nizVar.f = 8;
                objD = aosv.D(ajcqVarB2, nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                num3 = num2;
                hxeVar = (defpackage.hxe) objD;
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 2:
                j3 = nizVar.c;
                altaVar3 = nizVar.g;
                hxfVar3 = (defpackage.hxf) nizVar.a;
                aooc.af(objD);
                num = (java.lang.Integer) objD;
                nizVar.a = hxfVar3;
                nizVar.g = altaVar3;
                nizVar.b = num;
                nizVar.c = j3;
                nizVar.f = 3;
                defpackage.ogj ogjVar3 = this.z;
                defpackage.npw npwVarAB3 = mni.aB(defpackage.nmk.a.m());
                akzx akzxVarM3 = defpackage.nlm.a.m();
                aooh.f(akzxVarM3, "builder");
                akzxVarM3.u();
                defpackage.nlm nlmVar5 = (defpackage.nlm) akzxVarM3.b;
                nlmVar5.b |= 1;
                nlmVar5.c = true;
                alad aladVarP3 = akzxVarM3.p();
                aooh.e(aladVarP3, "build(...)");
                defpackage.nlm nlmVar6 = (defpackage.nlm) aladVarP3;
                aooh.f(nlmVar6, "value");
                akzx akzxVar3 = (akzx) npwVarAB3.a;
                akzxVar3.u();
                defpackage.nmk nmkVar3 = (defpackage.nmk) akzxVar3.b;
                j$.util.Objects.requireNonNull(nlmVar6);
                nmkVar3.c = nlmVar6;
                nmkVar3.b = 12;
                objB = ogjVar3.b(npwVarAB3.D(), nizVar);
                if (objB != aoluVar) {
                    objB = aojh.a;
                }
                if (objB == aoluVar) {
                    return aoluVar;
                }
                hxfVar4 = hxfVar3;
                altaVar4 = altaVar3;
                num2 = num;
                if (altaVar4 != null) {
                    aooh.c(num2);
                    alroVarE = defpackage.mzp.e(altaVar4, num2.intValue());
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 4;
                    if (k(alroVarE, nizVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                nizVar.a = hxfVar4;
                nizVar.g = altaVar4;
                nizVar.b = num2;
                nizVar.c = j3;
                nizVar.f = 5;
                objD = h(nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objD).booleanValue()) {
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 6;
                    objD = g(nizVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        this.h.b(mce.bQ);
                    } else {
                        this.h.b(mce.ha);
                    }
                } else {
                    this.h.b(mce.ha);
                }
                if (((java.lang.Boolean) this.v.a()).booleanValue()) {
                }
                ajcq ajcqVarB3 = hxfVar4.b();
                aooh.e(ajcqVarB3, "playbackEndedFuture(...)");
                nizVar.a = num2;
                nizVar.g = null;
                nizVar.b = null;
                nizVar.f = 8;
                objD = aosv.D(ajcqVarB3, nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                num3 = num2;
                hxeVar = (defpackage.hxe) objD;
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 3:
                j3 = nizVar.c;
                num2 = (java.lang.Integer) nizVar.b;
                altaVar4 = nizVar.g;
                hxfVar4 = (defpackage.hxf) nizVar.a;
                aooc.af(objD);
                if (altaVar4 != null) {
                    aooh.c(num2);
                    alroVarE = defpackage.mzp.e(altaVar4, num2.intValue());
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 4;
                    if (k(alroVarE, nizVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                nizVar.a = hxfVar4;
                nizVar.g = altaVar4;
                nizVar.b = num2;
                nizVar.c = j3;
                nizVar.f = 5;
                objD = h(nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objD).booleanValue()) {
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 6;
                    objD = g(nizVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        this.h.b(mce.bQ);
                    } else {
                        this.h.b(mce.ha);
                    }
                } else {
                    this.h.b(mce.ha);
                }
                if (((java.lang.Boolean) this.v.a()).booleanValue()) {
                }
                ajcq ajcqVarB4 = hxfVar4.b();
                aooh.e(ajcqVarB4, "playbackEndedFuture(...)");
                nizVar.a = num2;
                nizVar.g = null;
                nizVar.b = null;
                nizVar.f = 8;
                objD = aosv.D(ajcqVarB4, nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                num3 = num2;
                hxeVar = (defpackage.hxe) objD;
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 4:
                j3 = nizVar.c;
                num2 = (java.lang.Integer) nizVar.b;
                altaVar4 = nizVar.g;
                hxfVar4 = (defpackage.hxf) nizVar.a;
                aooc.af(objD);
                nizVar.a = hxfVar4;
                nizVar.g = altaVar4;
                nizVar.b = num2;
                nizVar.c = j3;
                nizVar.f = 5;
                objD = h(nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objD).booleanValue()) {
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 6;
                    objD = g(nizVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        this.h.b(mce.bQ);
                    } else {
                        this.h.b(mce.ha);
                    }
                } else {
                    this.h.b(mce.ha);
                }
                if (((java.lang.Boolean) this.v.a()).booleanValue()) {
                }
                ajcq ajcqVarB5 = hxfVar4.b();
                aooh.e(ajcqVarB5, "playbackEndedFuture(...)");
                nizVar.a = num2;
                nizVar.g = null;
                nizVar.b = null;
                nizVar.f = 8;
                objD = aosv.D(ajcqVarB5, nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                num3 = num2;
                hxeVar = (defpackage.hxe) objD;
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 5:
                j3 = nizVar.c;
                num2 = (java.lang.Integer) nizVar.b;
                altaVar4 = nizVar.g;
                hxfVar4 = (defpackage.hxf) nizVar.a;
                aooc.af(objD);
                if (((java.lang.Boolean) objD).booleanValue()) {
                    nizVar.a = hxfVar4;
                    nizVar.g = altaVar4;
                    nizVar.b = num2;
                    nizVar.c = j3;
                    nizVar.f = 6;
                    objD = g(nizVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        this.h.b(mce.bQ);
                    } else {
                        this.h.b(mce.ha);
                    }
                } else {
                    this.h.b(mce.ha);
                }
                if (((java.lang.Boolean) this.v.a()).booleanValue()) {
                }
                ajcq ajcqVarB6 = hxfVar4.b();
                aooh.e(ajcqVarB6, "playbackEndedFuture(...)");
                nizVar.a = num2;
                nizVar.g = null;
                nizVar.b = null;
                nizVar.f = 8;
                objD = aosv.D(ajcqVarB6, nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                num3 = num2;
                hxeVar = (defpackage.hxe) objD;
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 6:
                j3 = nizVar.c;
                num2 = (java.lang.Integer) nizVar.b;
                altaVar4 = nizVar.g;
                hxfVar4 = (defpackage.hxf) nizVar.a;
                aooc.af(objD);
                if (((java.lang.Boolean) objD).booleanValue()) {
                    this.h.b(mce.bQ);
                } else {
                    this.h.b(mce.ha);
                }
                if (((java.lang.Boolean) this.v.a()).booleanValue()) {
                }
                ajcq ajcqVarB7 = hxfVar4.b();
                aooh.e(ajcqVarB7, "playbackEndedFuture(...)");
                nizVar.a = num2;
                nizVar.g = null;
                nizVar.b = null;
                nizVar.f = 8;
                objD = aosv.D(ajcqVarB7, nizVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                num3 = num2;
                hxeVar = (defpackage.hxe) objD;
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 7:
                num3 = (java.lang.Integer) nizVar.a;
                aooc.af(objD);
                hxeVar = (defpackage.hxe) objD;
                if (hxeVar == null) {
                    return defpackage.nif.a;
                }
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            case 8:
                num3 = (java.lang.Integer) nizVar.a;
                aooc.af(objD);
                hxeVar = (defpackage.hxe) objD;
                aooh.c(hxeVar);
                aooh.c(num3);
                return new defpackage.nie(hxeVar, num3.intValue());
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(alro alroVar, aoln aolnVar) {
        defpackage.nja njaVar;
        if (aolnVar instanceof defpackage.nja) {
            njaVar = (defpackage.nja) aolnVar;
            int i = njaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njaVar.c = i - Integer.MIN_VALUE;
            } else {
                njaVar = new defpackage.nja(this, aolnVar);
            }
        } else {
            njaVar = new defpackage.nja(this, aolnVar);
        }
        java.lang.Object obj = njaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = njaVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.nbr nbrVar = this.t;
            njaVar.c = 1;
            if (nbrVar.a(alroVar, njaVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final java.lang.Object l(java.lang.String str, java.lang.String str2, aoln aolnVar) {
        return aoov.aj(this.b, new defpackage.njb(str2, this, str, null, 1, null), aolnVar);
    }

    public final java.lang.Object m(java.lang.String str, java.lang.String str2, aoln aolnVar) {
        return aoov.aj(this.b, new defpackage.njb(str2, this, str, (aoln) null, 0), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r13.b(r0) != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [apdp] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [apdp] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [apdp] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v10, types: [aimw] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(aoln r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njd.n(aoln):java.lang.Object");
    }

    public final boolean o() {
        ptx ptxVar = this.y;
        return ptxVar.o() || ptxVar.n();
    }

    public final boolean p() {
        ajcq ajcqVarB;
        aosy aosyVar = this.m;
        if (aosyVar != null && aosyVar.t()) {
            return true;
        }
        defpackage.hxf hxfVar = this.l;
        return hxfVar != null && ((ajcqVarB = hxfVar.b()) == null || !ajcqVarB.isDone());
    }
}
