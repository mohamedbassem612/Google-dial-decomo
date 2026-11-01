package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class cls implements defpackage.clr {
    private final defpackage.civ a = new defpackage.civ();

    @Override // defpackage.clr
    public /* synthetic */ defpackage.clt g(defpackage.clt cltVar, defpackage.clt cltVar2, defpackage.clt cltVar3) {
        return null;
    }

    public final void i(int i) {
        defpackage.civ civVar;
        int i2;
        do {
            civVar = this.a;
            i2 = civVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!civVar.compareAndSet(i2, i2 | i));
    }

    public final boolean j(int i) {
        return (this.a.get() & i) != 0;
    }
}
