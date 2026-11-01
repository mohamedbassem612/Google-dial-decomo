package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class hkv extends defpackage.hkc {
    private boolean c = false;
    private final defpackage.amxp d = new defpackage.amxp(new defpackage.apnt(this));

    @Override // defpackage.ahft
    public final defpackage.amxp a() {
        return this.d;
    }

    @Override // defpackage.ahft, defpackage.amyq
    public final /* synthetic */ defpackage.amyp b() {
        return this.d;
    }

    @Override // defpackage.hkc, defpackage.ahfu, android.app.Application
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            com.android.dialer.Dialer_Application dialer_Application = (com.android.dialer.Dialer_Application) this;
            hip hipVar = ((him) B()).b.a;
            dialer_Application.a = (defpackage.ahpz) hipVar.a.bb.a();
            dialer_Application.b = hipVar.cj;
        }
        super.onCreate();
    }
}
