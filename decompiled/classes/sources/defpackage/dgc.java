package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dgc {
    public final defpackage.dga a;
    public final defpackage.cjp b;
    public boolean c;
    private cal d;

    public dgc() {
        defpackage.dga dgaVar = new defpackage.dga(new defpackage.cjn());
        this.a = dgaVar;
        this.b = dgaVar;
    }

    public final void a(cal calVar) {
        cal calVar2 = this.d;
        if (calVar2 != null) {
            calVar2.a();
        }
        this.d = calVar;
    }

    public final void b(defpackage.dgb dgbVar) {
        cal calVarA;
        if (this.a.b()) {
            try {
                calVarA = dgbVar.a(new bup(this, 17));
            } catch (java.util.concurrent.CancellationException unused) {
                this.a.a();
                calVarA = null;
            }
            a(calVarA);
        }
    }
}
