package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ntb {
    private static final aimz c = aimz.i("com/android/dialer/dobby/impl/tts/DobbyTtsSessionProvider");
    public volatile uxh a;
    public aosy b;
    private final ruc d;
    private final aoss e;
    private final aoin f;
    private final aoin g;
    private final aoin h;
    private final apdp i;
    private final ahda j;
    private final rai k;

    public ntb(ruc rucVar, rai raiVar, aoss aossVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(rucVar, "metrics");
        aooh.f(raiVar, "ttsSessionFactory");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aoinVar, "voicelmPrewarmMaxRetryCount");
        aooh.f(aoinVar2, "enableVoiceLmPrewarmRetry");
        aooh.f(aoinVar3, "enableTtsSpeechRateReset");
        this.d = rucVar;
        this.k = raiVar;
        this.e = aossVar;
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.j = new ahda((byte[]) null);
        this.i = new apdp();
    }

    public final java.lang.Object a(aoln aolnVar) {
        return ahvr.ag(this.e, this.j, new defpackage.mhq(this, (aoln) null, 15)).a(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(uwv uwvVar, aoln aolnVar) {
        defpackage.nsx nsxVar;
        aeun aeunVar;
        if (aolnVar instanceof defpackage.nsx) {
            nsxVar = (defpackage.nsx) aolnVar;
            int i = nsxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsxVar.c = i - Integer.MIN_VALUE;
            } else {
                nsxVar = new defpackage.nsx(this, aolnVar);
            }
        } else {
            nsxVar = new defpackage.nsx(this, aolnVar);
        }
        java.lang.Object obj = nsxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nsxVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalA = this.d.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar2 = (aeun) aooh.q(optionalA);
            vqf vqfVarBc = wsc.bc(uwt.a.m());
            vqfVarBc.m(uwvVar);
            uwt uwtVarL = vqfVarBc.l();
            nsxVar.d = aeunVar2;
            nsxVar.c = 1;
            if (f(uwtVarL, nsxVar) == aoluVar) {
                return aoluVar;
            }
            aeunVar = aeunVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aeunVar = nsxVar.d;
            aooc.af(obj);
        }
        if (aeunVar != null) {
            this.d.p(aeunVar, ruc.aR);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(uwx uwxVar, aoln aolnVar) {
        defpackage.nsw nswVar;
        aeun aeunVar;
        uwx uwxVar2;
        aeun aeunVar2;
        uwt uwtVarL;
        aeun aeunVar3;
        if (aolnVar instanceof defpackage.nsw) {
            nswVar = (defpackage.nsw) aolnVar;
            int i = nswVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nswVar.d = i - Integer.MIN_VALUE;
            } else {
                nswVar = new defpackage.nsw(this, aolnVar);
            }
        } else {
            nswVar = new defpackage.nsw(this, aolnVar);
        }
        java.lang.Object obj = nswVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nswVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                j$.util.Optional optionalA = this.d.a();
                aooh.e(optionalA, "startLocalTimer(...)");
                aeunVar = (aeun) aooh.q(optionalA);
                try {
                    vqf vqfVarBc = wsc.bc(uwt.a.m());
                    vqfVarBc.o(uwxVar);
                    uwt uwtVarL2 = vqfVarBc.l();
                    nswVar.a = uwxVar;
                    nswVar.e = aeunVar;
                    nswVar.d = 1;
                    if (f(uwtVarL2, nswVar) == aoluVar) {
                        return aoluVar;
                    }
                    uwxVar2 = uwxVar;
                    aeunVar2 = aeunVar;
                } catch (java.lang.Exception e) {
                    e = e;
                    c.d().k(e).l("com/android/dialer/dobby/impl/tts/DobbyTtsSessionProvider", "initializeSession", 83, "DobbyTtsSessionProvider.kt").v("Failed to initialize VoiceLM session, falling back to Dialer voice");
                    vqf vqfVarBc2 = wsc.bc(uwt.a.m());
                    vqf vqfVarBb = wsc.bb(uwv.a.m());
                    java.lang.String str = uwxVar.c;
                    aooh.e(str, "getLanguageTag(...)");
                    vqfVarBb.j(str);
                    vqfVarBb.k();
                    vqfVarBc2.m(vqfVarBb.i());
                    uwtVarL = vqfVarBc2.l();
                    nswVar.a = aeunVar;
                    nswVar.e = null;
                    nswVar.d = 2;
                    if (f(uwtVarL, nswVar) != aoluVar) {
                        return aoluVar;
                    }
                    aeunVar3 = aeunVar;
                    if (aeunVar3 != null) {
                        this.d.p(aeunVar3, ruc.aP);
                    }
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aeunVar3 = (aeun) nswVar.a;
                    aooc.af(obj);
                    if (aeunVar3 != null) {
                        this.d.p(aeunVar3, ruc.aP);
                    }
                    return aojh.a;
                }
                aeunVar2 = nswVar.e;
                uwxVar2 = (uwx) nswVar.a;
                try {
                    aooc.af(obj);
                } catch (java.lang.Exception e2) {
                    aeunVar = aeunVar2;
                    uwxVar = uwxVar2;
                    e = e2;
                    c.d().k(e).l("com/android/dialer/dobby/impl/tts/DobbyTtsSessionProvider", "initializeSession", 83, "DobbyTtsSessionProvider.kt").v("Failed to initialize VoiceLM session, falling back to Dialer voice");
                    vqf vqfVarBc3 = wsc.bc(uwt.a.m());
                    vqf vqfVarBb2 = wsc.bb(uwv.a.m());
                    java.lang.String str2 = uwxVar.c;
                    aooh.e(str2, "getLanguageTag(...)");
                    vqfVarBb2.j(str2);
                    vqfVarBb2.k();
                    vqfVarBc3.m(vqfVarBb2.i());
                    uwtVarL = vqfVarBc3.l();
                    nswVar.a = aeunVar;
                    nswVar.e = null;
                    nswVar.d = 2;
                    if (f(uwtVarL, nswVar) != aoluVar) {
                        return aoluVar;
                    }
                    aeunVar3 = aeunVar;
                    if (aeunVar3 != null) {
                        this.d.p(aeunVar3, ruc.aP);
                    }
                }
            }
            if (aeunVar2 != null) {
                this.d.p(aeunVar2, ruc.aO);
            }
            return aojh.a;
        } catch (java.util.concurrent.CancellationException e3) {
            throw e3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(altg altgVar, aoln aolnVar) throws aois {
        defpackage.nsy nsyVar;
        uww uwwVarJ;
        aeun aeunVar;
        if (aolnVar instanceof defpackage.nsy) {
            nsyVar = (defpackage.nsy) aolnVar;
            int i = nsyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsyVar.c = i - Integer.MIN_VALUE;
            } else {
                nsyVar = new defpackage.nsy(this, aolnVar);
            }
        } else {
            nsyVar = new defpackage.nsy(this, aolnVar);
        }
        java.lang.Object obj = nsyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nsyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalA = this.d.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar2 = (aeun) aooh.q(optionalA);
            vqf vqfVarBc = wsc.bc(uwt.a.m());
            aooh.f(altgVar, "<this>");
            int iOrdinal = altgVar.ordinal();
            if (iOrdinal == 0) {
                throw new java.lang.IllegalStateException("Duplex Voice not specified");
            }
            if (iOrdinal == 1) {
                vaa vaaVarBa = wsc.ba(uww.a.m());
                java.lang.String languageTag = java.util.Locale.US.toLanguageTag();
                aooh.e(languageTag, "toLanguageTag(...)");
                vaaVarBa.k(languageTag);
                vaaVarBa.l(3);
                uwwVarJ = vaaVarBa.j();
            } else if (iOrdinal == 2) {
                vaa vaaVarBa2 = wsc.ba(uww.a.m());
                java.lang.String languageTag2 = java.util.Locale.US.toLanguageTag();
                aooh.e(languageTag2, "toLanguageTag(...)");
                vaaVarBa2.k(languageTag2);
                vaaVarBa2.l(4);
                uwwVarJ = vaaVarBa2.j();
            } else {
                if (iOrdinal != 3) {
                    throw new aois();
                }
                vaa vaaVarBa3 = wsc.ba(uww.a.m());
                java.lang.String languageTag3 = java.util.Locale.US.toLanguageTag();
                aooh.e(languageTag3, "toLanguageTag(...)");
                vaaVarBa3.k(languageTag3);
                vaaVarBa3.l(2);
                uwwVarJ = vaaVarBa3.j();
            }
            vqfVarBc.n(uwwVarJ);
            uwt uwtVarL = vqfVarBc.l();
            nsyVar.d = aeunVar2;
            nsyVar.c = 1;
            if (f(uwtVarL, nsyVar) == aoluVar) {
                return aoluVar;
            }
            aeunVar = aeunVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aeunVar = nsyVar.d;
            aooc.af(obj);
        }
        if (aeunVar != null) {
            this.d.p(aeunVar, ruc.aQ);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f5 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #1 {all -> 0x0196, blocks: (B:18:0x004b, B:40:0x00f5, B:68:0x0189, B:69:0x0190, B:49:0x011e, B:70:0x0191, B:34:0x00e0, B:36:0x00ee), top: B:81:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f A[Catch: all -> 0x0186, TRY_ENTER, TryCatch #0 {all -> 0x0186, blocks: (B:51:0x0125, B:54:0x012f, B:57:0x0136, B:59:0x013e, B:64:0x016a, B:65:0x0185), top: B:79:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e A[Catch: all -> 0x0186, TryCatch #0 {all -> 0x0186, blocks: (B:51:0x0125, B:54:0x012f, B:57:0x0136, B:59:0x013e, B:64:0x016a, B:65:0x0185), top: B:79:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(uwt r18, aoln r19) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ntb.e(uwt, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(uwt uwtVar, aoln aolnVar) {
        defpackage.nta ntaVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.nta) {
            ntaVar = (defpackage.nta) aolnVar;
            int i = ntaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ntaVar.c = i - Integer.MIN_VALUE;
            } else {
                ntaVar = new defpackage.nta(this, aolnVar);
            }
        } else {
            ntaVar = new defpackage.nta(this, aolnVar);
        }
        java.lang.Object obj = ntaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ntaVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    apdp apdpVar2 = ntaVar.e;
                    uwt uwtVar2 = ntaVar.d;
                    aooc.af(obj);
                    apdpVar = apdpVar2;
                    uwtVar = uwtVar2;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            apdpVar = this.i;
            ntaVar.d = uwtVar;
            ntaVar.e = apdpVar;
            ntaVar.c = 1;
            if (apdpVar.b(ntaVar) == aoluVar) {
                return aoluVar;
            }
            if (this.a != null) {
                throw new java.lang.IllegalStateException("Session was already initialized!");
            }
            aosy aosyVarAg = this.b;
            if (aosyVarAg == null) {
                aosyVarAg = ahvr.ag(this.e, this.j, new defpackage.inm(this, uwtVar, (aoln) null, 8));
                this.b = aosyVarAg;
            }
            apdpVar.d();
            ntaVar.d = null;
            ntaVar.e = null;
            ntaVar.c = 2;
            if (aosyVarAg.a(ntaVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    public final boolean g() {
        return this.a != null;
    }
}
