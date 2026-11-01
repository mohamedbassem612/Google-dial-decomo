package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ikv extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikv(aoln aolnVar, aosy aosyVar, defpackage.iin iinVar, ifv ifvVar, aonj aonjVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aosyVar;
        this.b = iinVar;
        this.c = ifvVar;
        this.e = aonjVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoln, ikv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ikv] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r2v17, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [aosy, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.lang.Object objA;
        java.lang.Object objA2;
        java.lang.Object objA3;
        ?? r1 = this;
        if (r1.$cid == 0) {
            aolu aoluVar = aolu.a;
            try {
                try {
                    if (r1.a == 0) {
                        aooc.af(obj);
                        java.lang.Object obj2 = r1.c;
                        aoin aoinVar = (aoin) ((defpackage.ili) obj2).m.k().get(((defpackage.ili) obj2).i);
                        defpackage.ihg ihgVar = aoinVar != null ? (defpackage.ihg) aoinVar.a() : null;
                        if (ihgVar == null) {
                            defpackage.ili.b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "notifyListenerAsyncAndLogOnFailure$<anonymous>", 553, "AudioPrismDuplexModelRunner.kt").v("skip: not running");
                        } else {
                            ?? r5 = r1.d;
                            java.lang.Object obj3 = r1.b;
                            r1.a = 1;
                            objA = r5.a(ihgVar, obj3, (java.lang.Object) r1);
                            if (objA == aoluVar) {
                                r1 = objA;
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    }
                    aooc.af(obj);
                    r1 = r1;
                    r1 = objA;
                } catch (java.lang.Exception e) {
                    defpackage.ili.b.c().k(e).l("com/android/dialer/audioprism/internal/models/duplex/impl/AudioPrismDuplexModelRunner", "notifyListenerAsyncAndLogOnFailure$<anonymous>", 559, "AudioPrismDuplexModelRunner.kt").y("%s", r1.e);
                }
                return aojh.a;
            } catch (java.lang.Exception e2) {
                if (!(e2 instanceof java.util.concurrent.CancellationException)) {
                    aimz aimzVar = zih.a;
                    zih.a.c().k(e2).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
                }
                throw e2;
            }
        }
        aolu aoluVar2 = aolu.a;
        int i = r1.a;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        aooc.af(obj);
                        objA2 = obj;
                    } else if (i != 2) {
                        aooc.af(obj);
                        objA3 = obj;
                    } else {
                        aooc.af(obj);
                        ?? r2 = r1.e;
                        r1.a = 3;
                        objA3 = r2.a((java.lang.Object) r1);
                        if (objA3 == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                    defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "readAllAndMaybeRestart$<anonymous>", 275, "AudioPrismCallAudioReaderImpl.kt").y("restart result: %s", (defpackage.iga) objA3);
                    return aojh.a;
                }
                aooc.af(obj);
                ?? r9 = r1.d;
                r1.a = 1;
                objA2 = r9.a((aoln) r1);
                if (objA2 == aoluVar2) {
                    return aoluVar2;
                }
                java.util.Set set = (java.util.Set) objA2;
                if (set != null && set.contains(defpackage.hxb.c)) {
                    defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "readAllAndMaybeRestart$<anonymous>", 268, "AudioPrismCallAudioReaderImpl.kt").v("audio format changed, restarting");
                    java.lang.Object obj4 = r1.b;
                    java.lang.Object obj5 = r1.c;
                    r1.a = 2;
                    java.lang.Object objA4 = ahvr.ag(((defpackage.iin) obj4).c, ((defpackage.iin) obj4).j, new huk((defpackage.iin) obj4, (ifv) obj5, (aoln) null, 11)).a((aoln) r1);
                    if (objA4 != aoluVar2) {
                        objA4 = aojh.a;
                    }
                    if (objA4 == aoluVar2) {
                        return aoluVar2;
                    }
                    ?? r3 = r1.e;
                    r1.a = 3;
                    objA3 = r3.a((java.lang.Object) r1);
                    if (objA3 == aoluVar2) {
                        return aoluVar2;
                    }
                    defpackage.iin.a.b().l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "readAllAndMaybeRestart$<anonymous>", 275, "AudioPrismCallAudioReaderImpl.kt").y("restart result: %s", (defpackage.iga) objA3);
                }
            } catch (java.lang.Throwable th) {
                defpackage.iin.a.b().k(th).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismCallAudioReaderImpl", "readAllAndMaybeRestart$<anonymous>", 277, "AudioPrismCallAudioReaderImpl.kt").v("failed to restart");
            }
            return aojh.a;
        } catch (java.lang.Exception e3) {
            if (!(e3 instanceof java.util.concurrent.CancellationException)) {
                aimz aimzVar2 = zih.a;
                zih.a.c().k(e3).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
            }
            throw e3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aosy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aonj, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid == 0) {
            defpackage.ikv ikvVar = new defpackage.ikv(aolnVar, (defpackage.ili) this.c, (aono) this.d, this.b, (java.lang.String) this.e, 0);
            ikvVar.f = obj;
            return ikvVar;
        }
        ?? r2 = this.d;
        java.lang.Object obj2 = this.b;
        defpackage.iin iinVar = (defpackage.iin) obj2;
        defpackage.ikv ikvVar2 = new defpackage.ikv(aolnVar, (aosy) r2, iinVar, (ifv) this.c, (aonj) this.e, 1);
        ikvVar2.f = obj;
        return ikvVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikv(aoln aolnVar, defpackage.ili iliVar, aono aonoVar, java.lang.Object obj, java.lang.String str, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = iliVar;
        this.d = aonoVar;
        this.b = obj;
        this.e = str;
    }
}
