package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxg {
    public static final aimz a = aimz.i("com/android/dialer/incall/core/video/impl/VideoStateMonitor");
    public final android.telecom.Call d;
    public final java.util.concurrent.Executor e;
    public final zzx g;
    final zog b = new les(this, 7);
    public final defpackage.znc c = new defpackage.pte(this, 3);
    public final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();

    public pxg(android.telecom.Call call, zzx zzxVar, ajct ajctVar) {
        this.d = call;
        this.g = zzxVar;
        this.e = new ajdc(ajctVar);
    }
}
