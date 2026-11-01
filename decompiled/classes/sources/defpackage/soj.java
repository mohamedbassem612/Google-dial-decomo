package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class soj {
    public static final j$.time.format.DateTimeFormatter a = j$.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm:ss.SSS");
    public final android.content.Context b;
    public final defpackage.ajcu c;
    public final defpackage.soh d;
    public final defpackage.rlv e;
    public final defpackage.aoin f;
    public final java.util.concurrent.LinkedBlockingQueue g = new java.util.concurrent.LinkedBlockingQueue();
    public final defpackage.ajwr i = new defpackage.ajwr();
    public final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference(defpackage.ajcm.a);

    public soj(android.content.Context context, defpackage.ajcu ajcuVar, defpackage.soh sohVar, defpackage.rlv rlvVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.c = ajcuVar;
        this.d = sohVar;
        this.e = rlvVar;
        this.f = aoinVar;
    }

    public final defpackage.ajcq a() {
        defpackage.soh sohVar = this.d;
        java.util.concurrent.Callable callableI = defpackage.ahqx.i(new defpackage.raj(sohVar, 14));
        defpackage.ajct ajctVar = sohVar.c;
        return defpackage.ahrv.g(defpackage.ahrv.g(ajctVar.submit(callableI)).h(new soi(sohVar, 1), ajctVar)).h(new soi(this, 0), this.c);
    }
}
