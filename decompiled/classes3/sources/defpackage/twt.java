package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class twt extends aomh implements aonn {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ defpackage.twu c;
    final /* synthetic */ java.io.File d;
    final /* synthetic */ aosi e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twt(aoln aolnVar, boolean z, defpackage.twu twuVar, aosi aosiVar, java.io.File file) {
        super(2, aolnVar);
        this.b = z;
        this.c = twuVar;
        this.e = aosiVar;
        this.d = file;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d2 A[Catch: all -> 0x0116, twe -> 0x0132, TRY_ENTER, TryCatch #6 {twe -> 0x0132, all -> 0x0116, blocks: (B:36:0x00d2, B:37:0x00f5, B:39:0x0110), top: B:66:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f5 A[Catch: all -> 0x0116, twe -> 0x0132, TryCatch #6 {twe -> 0x0132, all -> 0x0116, blocks: (B:36:0x00d2, B:37:0x00f5, B:39:0x0110), top: B:66:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0110 A[Catch: all -> 0x0116, twe -> 0x0132, TRY_LEAVE, TryCatch #6 {twe -> 0x0132, all -> 0x0116, blocks: (B:36:0x00d2, B:37:0x00f5, B:39:0x0110), top: B:66:0x00d0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x013b A[Catch: Exception -> 0x0178, TRY_LEAVE, TryCatch #3 {Exception -> 0x0178, blocks: (B:49:0x013b, B:44:0x0118, B:47:0x0134, B:55:0x015c, B:16:0x002d, B:33:0x00cd, B:17:0x0034, B:30:0x00b9, B:20:0x0042, B:22:0x005d, B:26:0x0074, B:28:0x0093, B:31:0x00bc, B:7:0x0018, B:51:0x014f), top: B:63:0x0010, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.lang.Object objB;
        java.lang.Object objB2;
        defpackage.twi twiVar;
        defpackage.twi twiVar2;
        defpackage.twi twiVar3;
        java.lang.Object objAj;
        aolu aoluVar = aolu.a;
        int i = this.a;
        try {
            try {
                if (i == 0) {
                    aooc.af(obj);
                    defpackage.twd twdVar = defpackage.twd.a;
                    defpackage.uzx uzxVarCq = wsc.cq(twdVar.m());
                    defpackage.twc twcVar = defpackage.twc.YIELD;
                    uzxVarCq.J(twcVar);
                    uzxVarCq.I(8000);
                    uzxVarCq.H(true);
                    boolean z = this.b;
                    boolean z2 = !z && ((java.lang.Number) this.c.g.a()).doubleValue() > 1.0d;
                    java.lang.Object obj2 = uzxVarCq.a;
                    ((akzx) obj2).u();
                    defpackage.twd twdVar2 = (defpackage.twd) ((akzx) obj2).b;
                    twdVar2.b |= 512;
                    twdVar2.m = z2;
                    defpackage.twd twdVarG = uzxVarCq.G();
                    defpackage.twu twuVar = this.c;
                    if (!z) {
                        txc txcVar = twuVar.f;
                        defpackage.tws twsVar = new defpackage.tws(this.e, twuVar);
                        this.a = 2;
                        objB = txcVar.b(twdVarG, twsVar, true, this);
                        if (objB == aoluVar) {
                            return aoluVar;
                        }
                        twiVar = (defpackage.twi) objB;
                        twiVar2 = twiVar;
                        if (twiVar2 == null) {
                            defpackage.twu.a.d().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 152, "SodaFileTranscriberImpl.kt").v("Soda failed to start.");
                            this.e.c(new defpackage.twe("Transcriber busy, try again later", defpackage.twg.c));
                        } else {
                            defpackage.twu twuVar2 = this.c;
                            twuVar2.h = false;
                            java.io.File file = this.d;
                            this.f = twiVar2;
                            this.a = 3;
                            objAj = aoov.aj(twuVar2.d, new defpackage.rjk(file, twuVar2, twiVar2, (aoln) null, 17), this);
                            if (objAj != aoluVar) {
                                objAj = aojh.a;
                            }
                            if (objAj != aoluVar) {
                                return aoluVar;
                            }
                            twiVar3 = twiVar2;
                            if (twiVar3 != null) {
                                defpackage.twu.a.b().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 167, "SodaFileTranscriberImpl.kt").v("Successfully added audio data");
                                this.f = null;
                                this.a = 4;
                                if (twiVar3.d(this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        return aojh.a;
                    }
                    txc txcVar2 = twuVar.f;
                    defpackage.tws twsVar2 = new defpackage.tws(this.e, twuVar);
                    this.a = 1;
                    defpackage.uzx uzxVarCq2 = wsc.cq(twdVar.m());
                    uzxVarCq2.J(twcVar);
                    uzxVarCq2.I(8000);
                    uzxVarCq2.H(true);
                    objB2 = txcVar2.b(uzxVarCq2.G(), twsVar2, false, this);
                    if (objB2 == aoluVar) {
                        return aoluVar;
                    }
                    twiVar = (defpackage.twi) objB2;
                    twiVar2 = twiVar;
                    if (twiVar2 == null) {
                        defpackage.twu.a.d().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 152, "SodaFileTranscriberImpl.kt").v("Soda failed to start.");
                        this.e.c(new defpackage.twe("Transcriber busy, try again later", defpackage.twg.c));
                    } else {
                        defpackage.twu twuVar3 = this.c;
                        twuVar3.h = false;
                        java.io.File file2 = this.d;
                        this.f = twiVar2;
                        this.a = 3;
                        objAj = aoov.aj(twuVar3.d, new defpackage.rjk(file2, twuVar3, twiVar2, (aoln) null, 17), this);
                        if (objAj != aoluVar) {
                            objAj = aojh.a;
                        }
                        if (objAj != aoluVar) {
                            return aoluVar;
                        }
                        twiVar3 = twiVar2;
                        if (twiVar3 != null) {
                            defpackage.twu.a.b().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 167, "SodaFileTranscriberImpl.kt").v("Successfully added audio data");
                            this.f = null;
                            this.a = 4;
                            if (twiVar3.d(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    return aojh.a;
                }
                if (i == 1) {
                    aooc.af(obj);
                    objB2 = obj;
                    twiVar = (defpackage.twi) objB2;
                    twiVar2 = twiVar;
                    if (twiVar2 == null) {
                        defpackage.twu.a.d().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 152, "SodaFileTranscriberImpl.kt").v("Soda failed to start.");
                        this.e.c(new defpackage.twe("Transcriber busy, try again later", defpackage.twg.c));
                    } else {
                        defpackage.twu twuVar4 = this.c;
                        twuVar4.h = false;
                        java.io.File file3 = this.d;
                        this.f = twiVar2;
                        this.a = 3;
                        objAj = aoov.aj(twuVar4.d, new defpackage.rjk(file3, twuVar4, twiVar2, (aoln) null, 17), this);
                        if (objAj != aoluVar) {
                            objAj = aojh.a;
                        }
                        if (objAj != aoluVar) {
                            return aoluVar;
                        }
                        twiVar3 = twiVar2;
                        if (twiVar3 != null) {
                            defpackage.twu.a.b().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 167, "SodaFileTranscriberImpl.kt").v("Successfully added audio data");
                            this.f = null;
                            this.a = 4;
                            if (twiVar3.d(this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    return aojh.a;
                }
                if (i == 2) {
                    aooc.af(obj);
                    objB = obj;
                    twiVar = (defpackage.twi) objB;
                    twiVar2 = twiVar;
                    try {
                        if (twiVar2 == null) {
                            defpackage.twu.a.d().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 152, "SodaFileTranscriberImpl.kt").v("Soda failed to start.");
                            this.e.c(new defpackage.twe("Transcriber busy, try again later", defpackage.twg.c));
                        } else {
                            defpackage.twu twuVar5 = this.c;
                            twuVar5.h = false;
                            java.io.File file4 = this.d;
                            this.f = twiVar2;
                            this.a = 3;
                            objAj = aoov.aj(twuVar5.d, new defpackage.rjk(file4, twuVar5, twiVar2, (aoln) null, 17), this);
                            if (objAj != aoluVar) {
                                objAj = aojh.a;
                            }
                            if (objAj != aoluVar) {
                                return aoluVar;
                            }
                            twiVar3 = twiVar2;
                            if (twiVar3 != null) {
                                defpackage.twu.a.b().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 167, "SodaFileTranscriberImpl.kt").v("Successfully added audio data");
                                this.f = null;
                                this.a = 4;
                                if (twiVar3.d(this) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    } catch (defpackage.twe e) {
                        e = e;
                        twiVar3 = twiVar2;
                        this.e.c(e);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        twiVar3 = twiVar2;
                        defpackage.twu.a.b().k(th).l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 163, "SodaFileTranscriberImpl.kt").v("Failed to add audio data");
                    }
                    return aojh.a;
                }
                if (i == 3) {
                    twiVar3 = (defpackage.twi) this.f;
                    try {
                        aooc.af(obj);
                    } catch (defpackage.twe e2) {
                        e = e2;
                        this.e.c(e);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defpackage.twu.a.b().k(th).l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 163, "SodaFileTranscriberImpl.kt").v("Failed to add audio data");
                    }
                    if (twiVar3 != null) {
                        defpackage.twu.a.b().l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 167, "SodaFileTranscriberImpl.kt").v("Successfully added audio data");
                        this.f = null;
                        this.a = 4;
                        if (twiVar3.d(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return aojh.a;
                }
                aooc.af(obj);
            } catch (java.lang.Throwable th3) {
                defpackage.twu.a.c().k(th3).l("com/android/dialer/sodatranscription/impl/SodaFileTranscriberImpl", "startTranscriptionInternal$<anonymous>$<anonymous>", 171, "SodaFileTranscriberImpl.kt").v("failed to stop SODA");
            }
            return aojh.a;
        } catch (java.lang.Exception e3) {
            if (!(e3 instanceof java.util.concurrent.CancellationException)) {
                aimz aimzVar = zih.a;
                zih.a.c().k(e3).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
            }
            throw e3;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.twt twtVar = new defpackage.twt(aolnVar, this.b, this.c, this.e, this.d);
        twtVar.f = obj;
        return twtVar;
    }
}
