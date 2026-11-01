package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class khu extends android.app.Service implements amyq {
    private volatile amye a;
    private final java.lang.Object b = new java.lang.Object();
    private boolean c = false;

    public final java.lang.Object B() {
        return b().B();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final amye b() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new amye(this);
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
            ((com.android.dialer.calllog.halo.impl.flagvalueprovider.HaloFlagValueProviderService) this).a = defpackage.hkq.f();
        }
        super.onCreate();
    }
}
