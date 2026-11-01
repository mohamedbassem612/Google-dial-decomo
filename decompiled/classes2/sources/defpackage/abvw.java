package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class abvw extends android.app.Service implements amyq {
    private volatile amye a;
    private final java.lang.Object b = new java.lang.Object();
    private boolean c = false;

    public final java.lang.Object B() {
        return b().B();
    }

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
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService messageBasedBlockingService = (com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService) this;
            defpackage.him himVar = ((defpackage.hkq) B()).b;
            messageBasedBlockingService.a = (ajct) himVar.L.a();
            messageBasedBlockingService.b = (ajcu) himVar.aN.a();
            messageBasedBlockingService.c = himVar.a.U();
            messageBasedBlockingService.h = himVar.w();
            messageBasedBlockingService.d = himVar.cx();
            messageBasedBlockingService.g = (uhs) himVar.iu.a();
            messageBasedBlockingService.i = (kgl) himVar.BQ.a();
            messageBasedBlockingService.e = (zjs) himVar.cn.a();
            messageBasedBlockingService.f = (agsm) himVar.aT.a();
        }
        super.onCreate();
    }
}
