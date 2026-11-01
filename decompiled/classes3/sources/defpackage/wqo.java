package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wqo {
    private static final aimz g = aimz.i("com/android/dialer/xatu/impl/storage/XatuCallAudioRecorder");
    public final java.util.concurrent.Executor a;
    public final ahzi b;
    public final ahzi c;
    private final android.content.Context h;
    public final akzx f = defpackage.wqn.a.m();
    public akzc d = akzc.d;
    private j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional e = j$.util.Optional.empty();

    public wqo(android.content.Context context, ajct ajctVar, aoin aoinVar, aoin aoinVar2) {
        this.h = context;
        this.a = new ajdc(ajctVar);
        this.b = ahvr.bI(new defpackage.wdn(aoinVar, 15));
        this.c = ahvr.bI(new defpackage.wdn(aoinVar2, 16));
    }

    public static int a(long j) {
        return ((int) j) * 32000;
    }

    public final j$.util.Optional b() throws java.io.IOException {
        if (!this.i.isPresent()) {
            g.b().l("com/android/dialer/xatu/impl/storage/XatuCallAudioRecorder", "finishWriting", 209, "XatuCallAudioRecorder.java").v("nothing logged");
            return j$.util.Optional.empty();
        }
        akzx akzxVar = this.f;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzxVar.u();
        defpackage.wqn wqnVar = (defpackage.wqn) akzxVar.b;
        defpackage.wqn wqnVar2 = defpackage.wqn.a;
        wqnVar.b |= 4;
        wqnVar.e = epochMilli;
        defpackage.wqn wqnVar3 = (defpackage.wqn) akzxVar.p();
        ((java.io.FileOutputStream) this.i.orElseThrow()).close();
        this.i = j$.util.Optional.empty();
        this.e = j$.util.Optional.empty();
        akzxVar.x();
        this.d = akzc.d;
        return j$.util.Optional.of(wqnVar3);
    }

    public final void c(akzc akzcVar) {
        if (akzcVar.C()) {
            return;
        }
        int i = 0;
        if (!this.i.isPresent()) {
            ahvr.bZ(this.e.isPresent(), "start time missing while initializing file output stream");
            java.io.File file = new java.io.File(this.h.getCacheDir(), java.lang.String.format(java.util.Locale.US, "xatu_call_recording_%d.pcm", this.e.orElseThrow()));
            akzx akzxVar = this.f;
            java.lang.String absolutePath = file.getAbsolutePath();
            akzxVar.u();
            defpackage.wqn wqnVar = (defpackage.wqn) akzxVar.b;
            defpackage.wqn wqnVar2 = defpackage.wqn.a;
            j$.util.Objects.requireNonNull(absolutePath);
            wqnVar.b |= 1;
            wqnVar.c = absolutePath;
            this.i = j$.util.Optional.of(new java.io.FileOutputStream(file));
        }
        akzx akzxVar2 = this.f;
        defpackage.wqm wqmVar = ((defpackage.wqn) akzxVar2.b).f;
        if (wqmVar == null) {
            wqmVar = defpackage.wqm.a;
        }
        akzcVar.m((java.io.OutputStream) this.i.orElseThrow());
        int iC = akzcVar.c();
        akyy akyyVarD = akzcVar.d();
        while (akyyVarD.hasNext()) {
            if (akyyVarD.a() == 0) {
                i++;
            }
        }
        akzx akzxVarM = defpackage.wqm.a.m();
        int i2 = wqmVar.c + iC;
        akzxVarM.u();
        defpackage.wqm wqmVar2 = (defpackage.wqm) akzxVarM.b;
        wqmVar2.b |= 1;
        wqmVar2.c = i2;
        int i3 = wqmVar.d + i;
        akzxVarM.u();
        defpackage.wqm wqmVar3 = (defpackage.wqm) akzxVarM.b;
        wqmVar3.b |= 2;
        wqmVar3.d = i3;
        defpackage.wqm wqmVar4 = (defpackage.wqm) akzxVarM.p();
        akzxVar2.u();
        defpackage.wqn wqnVar3 = (defpackage.wqn) akzxVar2.b;
        j$.util.Objects.requireNonNull(wqmVar4);
        wqnVar3.f = wqmVar4;
        wqnVar3.b |= 8;
        g.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/xatu/impl/storage/XatuCallAudioRecorder", "writeToFile", 201, "XatuCallAudioRecorder.java").z("so far, write data [bytes = %d, zero bytes = %d] into the recording file for xatu", wqmVar4.c, wqmVar4.d);
    }
}
