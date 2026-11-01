package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerx extends defpackage.agab implements defpackage.aeqv {
    public final defpackage.aequ a;
    public final android.content.Context b;
    public final java.util.concurrent.Executor c;
    public final defpackage.aoin d;
    public final defpackage.amwu e;
    public final defpackage.aoin f;
    public final defpackage.aoin g;
    public final defpackage.aoin h;
    public final defpackage.aerv i;
    public final defpackage.aeod j;
    public final defpackage.ahbz k;

    public aerx(defpackage.gou gouVar, android.content.Context context, java.util.concurrent.Executor executor, defpackage.aerv aervVar, defpackage.aoin aoinVar, defpackage.amwu amwuVar, defpackage.aeod aeodVar, defpackage.ahbz ahbzVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.a = gouVar.D(executor, amwuVar, null);
        this.b = context;
        this.c = executor;
        this.i = aervVar;
        this.d = aoinVar;
        this.j = aeodVar;
        this.k = ahbzVar;
        this.e = amwuVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
    }

    @Override // defpackage.aeqv
    public final void n() {
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.nya(this, 8));
        java.util.concurrent.Executor executor = this.c;
        executor.execute(ajdkVar);
        executor.execute(new defpackage.ajdk(java.util.concurrent.Executors.callable(new defpackage.abqg(this, 4), null)));
    }
}
