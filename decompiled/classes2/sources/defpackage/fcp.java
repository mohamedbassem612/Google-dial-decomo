package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fcp implements defpackage.fcw {
    public defpackage.fcs a;
    public boolean b;
    public final /* synthetic */ defpackage.fcq c;
    public final alic d;

    public fcp(defpackage.fcq fcqVar, alic alicVar) {
        j$.util.Objects.requireNonNull(fcqVar);
        this.c = fcqVar;
        this.d = alicVar;
    }

    @Override // defpackage.fcw
    public final void a() {
        android.os.Handler handler = this.c.i;
        ahvr.ci(handler);
        eum.af(handler, new defpackage.fay(this, 4));
    }
}
