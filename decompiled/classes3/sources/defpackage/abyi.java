package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class abyi extends android.app.Service implements amyq {
    private volatile defpackage.amye a;
    private final java.lang.Object b = new java.lang.Object();
    private boolean c = false;

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.amye b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new defpackage.amye(this);
                }
            }
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService videoCallCheckerService = (com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService) this;
            him himVar = ((hkq) B()).b;
            videoCallCheckerService.c = himVar.a.U();
            videoCallCheckerService.e = himVar.mX();
        }
        super.onCreate();
    }
}
