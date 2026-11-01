package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kww {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/logger/CallRecordingLogger");
    public final aoin b;
    public final ajct c;
    public final ajcu d;
    public final aazc l;
    public final ahda m = new ahda();
    public final ahda n = new ahda();
    public j$.util.Optional e = j$.util.Optional.empty();
    public final java.util.ArrayList f = new java.util.ArrayList();
    public akzx k = amoy.a.m();
    public j$.util.Optional g = j$.util.Optional.empty();
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional j = j$.util.Optional.empty();

    public kww(aoin aoinVar, ajct ajctVar, ajcu ajcuVar, aazc aazcVar) {
        this.b = aoinVar;
        this.c = ajctVar;
        this.d = ajcuVar;
        this.l = aazcVar;
    }

    public final ajcq a() {
        return this.m.g(new defpackage.jyr(this, 6), this.c);
    }

    public final ajcq b() {
        return this.m.g(new defpackage.jww(this, android.os.SystemClock.elapsedRealtime(), 4), this.c);
    }

    public final void c() {
        this.k = amoy.a.m();
        this.g = j$.util.Optional.empty();
    }
}
