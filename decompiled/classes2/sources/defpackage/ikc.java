package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ikc {
    private static final aimz a = aimz.i("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCallScopedCompositeModelAvailabilityImpl");
    private final java.util.Map b = new java.util.LinkedHashMap();
    private final ils c;

    public ikc(ils ilsVar) {
        this.c = ilsVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(igs igsVar, aoln aolnVar) {
        defpackage.ikb ikbVar;
        if (aolnVar instanceof defpackage.ikb) {
            ikbVar = (defpackage.ikb) aolnVar;
            int i = ikbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikbVar.c = i - Integer.MIN_VALUE;
            } else {
                ikbVar = new defpackage.ikb(this, aolnVar);
            }
        } else {
            ikbVar = new defpackage.ikb(this, aolnVar);
        }
        java.lang.Object objC = ikbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ikbVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            objC = (defpackage.igp) this.b.get(igsVar);
            if (objC != null) {
                a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/audioprism/internal/models/composite/impl/AudioPrismCallScopedCompositeModelAvailabilityImpl", "check$<anonymous>", 27, "AudioPrismCallScopedCompositeModelAvailabilityImpl.kt").v("found cached availability");
            } else {
                ils ilsVar = this.c;
                ikbVar.d = igsVar;
                ikbVar.c = 1;
                objC = ilsVar.c(igsVar, ikbVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            }
            return objC;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        igsVar = ikbVar.d;
        aooc.af(objC);
        this.b.put(igsVar, (defpackage.igp) objC);
        return objC;
    }
}
