package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class acxv extends android.app.Service implements defpackage.amyq {
    private volatile amye a;
    private final java.lang.Object b = new java.lang.Object();
    private boolean c = false;

    @Override // defpackage.amyp
    public final java.lang.Object B() {
        return b().B();
    }

    @Override // defpackage.amyq
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
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
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            ((com.google.android.libraries.mdi.download.foreground.sting.ForegroundDownloadService) this).a = (defpackage.acwi) ((hkq) B()).b.ll.a();
        }
        super.onCreate();
    }
}
