package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mjj implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ mjj(java.lang.Object obj, int i, int i2, int i3) {
        this.$cid = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        if (this.$cid == 0) {
            defpackage.mjk mjkVar = (defpackage.mjk) this.c;
            if (!mjkVar.c || !mjkVar.b.isPresent()) {
                return java.lang.Boolean.FALSE;
            }
            int iC = mjkVar.g.c();
            if (iC == 0 || iC == 1) {
                return java.lang.Boolean.FALSE;
            }
            ((android.media.ToneGenerator) mjkVar.b.orElseThrow()).startTone(this.a, this.b);
            return java.lang.Boolean.TRUE;
        }
        defpackage.kww.a.b().l("com/android/dialer/callrecording/impl/logger/CallRecordingLogger", "logRecordingForCall", 206, "CallRecordingLogger.java").v("logging single recording");
        defpackage.kww kwwVar = (defpackage.kww) this.c;
        akzx akzxVar = kwwVar.k;
        akzxVar.u();
        amoy amoyVar = akzxVar.b;
        amoy amoyVar2 = amoy.a;
        amoyVar.b |= 1;
        amoyVar.c = true;
        akzxVar.u();
        amoy amoyVar3 = akzxVar.b;
        amoyVar3.b |= 8;
        amoyVar3.f = this.a;
        akzxVar.u();
        amoy amoyVar4 = akzxVar.b;
        amoyVar4.b |= 2;
        amoyVar4.d = this.b;
        kwwVar.f.add(akzxVar.p());
        kwwVar.c();
        return null;
    }
}
