package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wjt implements ihg {
    private static final aimz g = aimz.i("com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismDuplexEventListener");
    public final aoss a;
    public final java.util.List b;
    public final java.util.List c;
    public amgq d;
    public final defpackage.wle e;
    public final ahda f;

    public wjt(defpackage.wle wleVar, aoss aossVar) {
        aooh.f(wleVar, "xatuAudioPrismPipelineResultListener");
        aooh.f(aossVar, "lightweightScope");
        this.e = wleVar;
        this.a = aossVar;
        this.f = new ahda((byte[]) null);
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
    }

    public final java.lang.Object a(alio alioVar, aoln aolnVar) {
        g.c().m(aioa.b).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/xatu/impl/pipeline/audioprism/XatuAudioPrismDuplexEventListener", "onError", 63, "XatuAudioPrismDuplexEventListener.kt").y("Duplex error: %s", alioVar);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(altn altnVar, aoln aolnVar) {
        defpackage.wjs wjsVar;
        if (aolnVar instanceof defpackage.wjs) {
            wjsVar = (defpackage.wjs) aolnVar;
            int i = wjsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wjsVar.c = i - Integer.MIN_VALUE;
            } else {
                wjsVar = new defpackage.wjs(this, aolnVar);
            }
        } else {
            wjsVar = new defpackage.wjs(this, aolnVar);
        }
        java.lang.Object obj = wjsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = wjsVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aosy aosyVarAg = ahvr.ag(this.a, this.f, new defpackage.tyf(this, altnVar, (aoln) null, 6));
            wjsVar.c = 1;
            if (aosyVarAg.a(wjsVar) == aoluVar) {
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

    public final java.lang.Object c(alsi alsiVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.a, this.f, new defpackage.tyf(alsiVar, this, (aoln) null, 7)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }
}
