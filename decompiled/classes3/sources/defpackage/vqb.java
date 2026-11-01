package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vqb {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/settings/greeting/single/impl/ui/GreetingEntryPlayer");
    public static final android.media.AudioFocusRequest b;
    private static final android.media.AudioAttributes l;
    public final android.content.Context c;
    public final oju d;
    public final ajct e;
    public final agsm f;
    public final rlv g;
    private final defpackage.uss m;
    public final ahda k = new ahda();
    public j$.util.Optional h = j$.util.Optional.empty();
    public boolean i = false;
    public j$.util.Optional j = j$.util.Optional.empty();

    static {
        android.media.AudioAttributes audioAttributesBuild = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(1).build();
        l = audioAttributesBuild;
        b = da$.ExternalSyntheticApiModelOutline1.m(da$.ExternalSyntheticApiModelOutline1.m(new android.media.AudioFocusRequest.Builder(2), audioAttributesBuild));
    }

    public vqb(android.content.Context context, oju ojuVar, agsm agsmVar, defpackage.uss ussVar, ajct ajctVar, rlv rlvVar) {
        this.c = context;
        this.d = ojuVar;
        this.m = ussVar;
        this.e = ajctVar;
        this.f = agsmVar;
        this.g = rlvVar;
    }

    public final void a() {
        if (!this.i) {
            c().d();
            return;
        }
        oju ojuVar = this.d;
        android.media.AudioFocusRequest audioFocusRequest = b;
        aooh.f(audioFocusRequest, "focusRequest");
        ajcq ajcqVarF = aosv.F(ojuVar.b, 0, new ojt(ojuVar, audioFocusRequest, (aoln) null), 3);
        defpackage.vmb vmbVar = new defpackage.vmb(this, 13);
        ajct ajctVar = this.e;
        this.f.g(this.k.h(new defpackage.viv(ahvr.H(ajcqVarF, vmbVar, ajctVar), 3), ajctVar), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final boolean b() {
        return this.i && ((oii) this.j.orElseThrow()).o();
    }

    public final oii c() {
        if (this.j.isEmpty()) {
            a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/GreetingEntryPlayer", "getDialerMediaPlayer", 202, "GreetingEntryPlayer.java").v("DialerMediaPlayer doesn't exist, start the setup");
            j$.util.Optional optionalOf = j$.util.Optional.of(this.m.o());
            this.j = optionalOf;
            ((oii) optionalOf.orElseThrow()).h(l);
        }
        return (oii) this.j.orElseThrow();
    }
}
