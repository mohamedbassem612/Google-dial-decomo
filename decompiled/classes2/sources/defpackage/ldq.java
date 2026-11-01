package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ldq {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/mdd/CallScreenVoicePackDownloader");
    public final android.content.Context b;
    public final ahzi c;
    public final lcx d;
    public final ldu e;
    public final ajct f;
    public final ajct g;
    public j$.util.Optional h = j$.util.Optional.empty();
    public final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final rsr j;
    public final aogc k;
    private final java.util.concurrent.Executor l;

    public ldq(android.content.Context context, ahzi ahziVar, aogc aogcVar, lcx lcxVar, ldu lduVar, ajct ajctVar, ajct ajctVar2, rsr rsrVar) {
        this.b = context;
        this.c = ahziVar;
        this.k = aogcVar;
        this.d = lcxVar;
        this.e = lduVar;
        this.f = ajctVar;
        this.g = ajctVar2;
        this.l = new ajdc(ajctVar2);
        this.j = rsrVar;
    }

    public final ajcq a(j$.util.Optional optional) {
        return ahvr.G(new defpackage.ibi(this, optional, 11), this.l);
    }
}
