package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rji implements defpackage.ahjd {
    public static final aimz a = aimz.i("com/android/dialer/joyball/impl/gateway/JoyballGateway");
    public final android.content.Context b;
    public final aaco c;
    public final defpackage.rjj d;
    public final int e;

    public rji(android.content.Context context, int i, aaco aacoVar, defpackage.rjj rjjVar) {
        aooh.f(context, "appContext");
        aooh.f(rjjVar, "joyballLifecycleImpl");
        this.b = context;
        this.e = 5;
        this.c = aacoVar;
        this.d = rjjVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        return new defpackage.rjh(this, apjbVar, 0);
    }
}
