package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ztw {
    public static final defpackage.ztw a;
    public static final defpackage.ztw b;
    public static final defpackage.ztw c = new defpackage.ztw("/dialer/get_default_voicemail_number", new defpackage.ztt(7), new defpackage.ztt(8));
    public static final defpackage.ztw d = new defpackage.ztw("/dialer/tethered_auto_call_screen", new defpackage.ztt(9), new defpackage.ztt(10));
    public static final defpackage.ztw e = new defpackage.ztw("/dialer/get_gnp_dialer_wear_app_state", new defpackage.ztt(11), new defpackage.ztt(12));
    public static final defpackage.ztw f = new defpackage.ztw("/dialer/featureplatform", new defpackage.ztt(4), new defpackage.ztt(5));
    public final java.lang.String g;
    public final defpackage.ztv h;
    public final defpackage.ztv i;

    static {
        int i = 3;
        int i2 = 6;
        a = new defpackage.ztw("/dialer/ping", new defpackage.ztt(i), new defpackage.ztt(i2));
        b = new defpackage.ztw("/dialer/is_synced_notification_available", new defpackage.ztt(i), new defpackage.ztt(i2));
    }

    public ztw(java.lang.String str, defpackage.ztv ztvVar, defpackage.ztv ztvVar2) {
        this.g = str;
        this.h = ztvVar;
        this.i = ztvVar2;
    }
}
