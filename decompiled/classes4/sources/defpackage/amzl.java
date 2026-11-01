package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class amzl implements amzn {
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean();
    public final defpackage.amzk a = new defpackage.amzk();

    protected amzl() {
    }

    public final ajcq d() {
        if (this.b.compareAndSet(false, true)) {
            this.a.q(dS());
        }
        return this.a;
    }

    public final amzg dR() {
        return new defpackage.amzj(this);
    }

    protected abstract ajcq dS();

    public final amzg dT(defpackage.amzo amzoVar) {
        defpackage.amzj amzjVar = new defpackage.amzj(this);
        amzjVar.a.c(new defpackage.alvh(amzjVar, amzoVar, 4), ajbm.a);
        return amzjVar;
    }

    public final void dU(boolean z) {
        this.b.set(true);
        this.a.d(z);
    }
}
