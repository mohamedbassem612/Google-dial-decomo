package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ijy extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.ijx b;
    final /* synthetic */ double c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijy(aoln aolnVar, defpackage.ijx ijxVar, double d) {
        super(2, aolnVar);
        this.b = ijxVar;
        this.c = d;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        aojh aojhVar = aolu.a;
        try {
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                defpackage.ijx ijxVar = this.b;
                vqf vqfVar = ijxVar.b;
                akzx akzxVarM = defpackage.ign.a.m();
                aooh.f(akzxVarM, "builder");
                boolean z = this.c > ((double) ijxVar.a.d);
                akzxVarM.u();
                ((defpackage.ign) akzxVarM.b).b = z;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                this.a = 1;
                boolean z2 = ((defpackage.ign) aladVarP).b;
                java.lang.Object obj2 = vqfVar.a;
                if (((wle) obj2).d()) {
                    if (z2) {
                        ((wle) obj2).g.b(((wle) obj2).e, 27);
                        abtr abtrVar = ((wle) obj2).l;
                        akzx akzxVarM2 = wor.a.m();
                        wnu wnuVar = wnu.a;
                        akzxVarM2.u();
                        wor worVar = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(wnuVar);
                        worVar.c = wnuVar;
                        worVar.b = 20;
                        agsm.i(1096, abtrVar.o(akzxVarM2.p()), "failed to show audio error prompt", new java.lang.Object[0]);
                    } else {
                        abtr abtrVar2 = ((wle) obj2).l;
                        akzx akzxVarM3 = wor.a.m();
                        wno wnoVar = wno.a;
                        akzxVarM3.u();
                        wor worVar2 = akzxVarM3.b;
                        j$.util.Objects.requireNonNull(wnoVar);
                        worVar2.c = wnoVar;
                        worVar2.b = 21;
                        agsm.i(1093, abtrVar2.o(akzxVarM3.p()), "failed to hide audio error prompt", new java.lang.Object[0]);
                    }
                }
                if (aojh.a == aojhVar) {
                    return aojhVar;
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ika.a.c().i(zct.b).k(th).l("com/android/dialer/audioprism/internal/models/audioqualitymonitor/impl/AudioPrismAudioQualityMonitorModelRunner", "checkMissingBytesAndNotify$<anonymous>", 138, "AudioPrismAudioQualityMonitorModelRunner.kt").v("failed to notify listener");
            } catch (java.lang.Exception e) {
                if (!(e instanceof java.util.concurrent.CancellationException)) {
                    aimz aimzVar = zih.a;
                    zih.a.c().k(e).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
                }
                throw e;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.ijy ijyVar = new defpackage.ijy(aolnVar, this.b, this.c);
        ijyVar.d = obj;
        return ijyVar;
    }
}
