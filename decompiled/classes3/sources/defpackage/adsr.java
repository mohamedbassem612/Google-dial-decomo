package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adsr {
    public final android.content.Context b;
    public volatile defpackage.yrk d;
    public defpackage.sns f;
    private final android.os.IBinder g = new android.os.Binder();
    public final defpackage.akvr c = new defpackage.akvr();
    public final defpackage.ylo e = new defpackage.ylo(this, 5);
    public final android.content.ServiceConnection a = new defpackage.adsq(this, 0);

    public adsr(android.content.Context context) {
        this.b = context;
    }

    public final void a(android.os.IBinder iBinder) {
        this.c.b(this.g, iBinder);
    }

    public final void b(android.os.IBinder iBinder, int i, defpackage.amwp amwpVar) {
        this.c.a(this.g, iBinder, i, amwpVar.d());
    }
}
