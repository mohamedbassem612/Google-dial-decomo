package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lbq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/ttsprewarm/TtsPreWarm");
    public final java.util.concurrent.ScheduledExecutorService b;
    public final defpackage.ajct c;
    public final defpackage.kwt d;
    public final android.content.Context e;
    public final defpackage.ahda g = new defpackage.ahda();
    public final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference(j$.util.Optional.empty());

    public lbq(android.content.Context context, defpackage.kwt kwtVar, defpackage.ajct ajctVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.d = kwtVar;
        this.e = context;
        this.b = scheduledExecutorService;
        this.c = ajctVar;
    }
}
