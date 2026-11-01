package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qcr {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public qcr(zpz zpzVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        this.a = zpzVar;
        new java.util.concurrent.atomic.AtomicBoolean();
        this.b = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public final void a(boolean z) {
        if (((java.util.concurrent.atomic.AtomicBoolean) this.b).getAndSet(z) != z) {
            ((zpz) this.a).a(ajcm.a);
        }
    }

    public final boolean b() {
        return ((java.util.concurrent.atomic.AtomicBoolean) this.b).get();
    }

    public qcr(zpz zpzVar, zzx zzxVar) {
        this.b = zpzVar;
        this.a = zzxVar;
    }

    public qcr(com.android.dialer.incall.postchardialog.impl.ui.TidepodsPostCharDialogActivity tidepodsPostCharDialogActivity, urg urgVar) {
        this.a = tidepodsPostCharDialogActivity;
        this.b = urgVar;
    }

    public qcr(zpz zpzVar, byte[] bArr) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        this.a = zpzVar;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }
}
