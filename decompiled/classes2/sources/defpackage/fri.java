package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fri extends defpackage.ewx implements defpackage.frk {
    private final defpackage.frt c;

    public fri(defpackage.frt frtVar) {
        super(new defpackage.fro[2], new defpackage.frp[2]);
        ahvr.bY(this.b == this.a.length);
        for (defpackage.ewu ewuVar : this.a) {
            ewuVar.d(1024);
        }
        this.c = frtVar;
    }

    @Override // defpackage.ewx
    protected final /* synthetic */ defpackage.ews g(java.lang.Throwable th) {
        return new defpackage.frl(th);
    }

    @Override // defpackage.ewx
    protected final /* bridge */ /* synthetic */ defpackage.ews h(defpackage.ewu ewuVar, defpackage.ewv ewvVar, boolean z) {
        defpackage.fro froVar = (defpackage.fro) ewuVar;
        defpackage.frp frpVar = (defpackage.frp) ewvVar;
        try {
            java.nio.ByteBuffer byteBuffer = froVar.d;
            ahvr.ci(byteBuffer);
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            if (z) {
                this.c.c();
            }
            frpVar.f(froVar.f, this.c.a(bArrArray, 0, iLimit), froVar.h);
            frpVar.d = false;
            return null;
        } catch (defpackage.frl e) {
            return e;
        }
    }

    @Override // defpackage.ewx
    protected final /* synthetic */ defpackage.ewu i() {
        return new defpackage.fro();
    }

    @Override // defpackage.ewx
    protected final /* synthetic */ defpackage.ewv k() {
        return new defpackage.frh(this);
    }

    @Override // defpackage.frk
    public final void p(long j) {
    }
}
