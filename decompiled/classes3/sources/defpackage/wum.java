package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class wum extends android.telecom.InCallService implements amyq {
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
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            B();
            ((com.android.incallui.InCallServiceImpl) this).a = hkq.f();
        }
        super.onCreate();
    }
}
