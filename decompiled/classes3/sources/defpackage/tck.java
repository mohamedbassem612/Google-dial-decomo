package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tck {
    public static final aimz a = aimz.i("com/android/dialer/ringing/OsloAction");
    public static final defpackage.amwp h = new defpackage.amwp();
    public final defpackage.adsr c;
    public boolean d;
    public final aoin e;
    public j$.util.Optional b = j$.util.Optional.empty();
    public final defpackage.sns i = new defpackage.sns();
    public final defpackage.akvt f = new defpackage.tci(this);
    public final defpackage.akvt g = new defpackage.tcj(this);
    private final java.lang.String j = android.os.Build.DEVICE;

    public tck(android.content.Context context, aoin aoinVar) {
        this.c = new defpackage.adsr(context);
        this.e = aoinVar;
    }

    public final boolean a() {
        java.lang.String str = this.j;
        return str.equals("coral") || str.equals("flame");
    }
}
