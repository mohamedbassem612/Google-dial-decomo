package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xcc {
    public static final aimz a = aimz.i("com/android/incallui/atlas/ui/impl/tidepods/service/callvolumemonitor/HoldForMeCallVolumeMonitor");
    public static final aihd b = aihd.r(0, 6);
    public final defpackage.xcn c;
    public final android.media.AudioManager d;
    public final android.content.Context e;
    public final ahpz f;
    public final zjv g;
    public final ajct h;
    public boolean i = false;
    public final defpackage.xcb j = new defpackage.xcb(this);
    public final ahda k = new ahda();

    public xcc(android.content.Context context, ajct ajctVar, defpackage.xcn xcnVar, android.media.AudioManager audioManager, ahpz ahpzVar, zjv zjvVar) {
        this.e = context;
        this.h = ajctVar;
        this.c = xcnVar;
        this.d = audioManager;
        this.f = ahpzVar;
        this.g = zjvVar;
    }

    public final ajcq a() {
        return this.k.g(new defpackage.wwy(this, 13), this.h);
    }
}
