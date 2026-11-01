package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahuj implements aohy {
    final /* synthetic */ defpackage.ahuk a;
    private final aohy b;
    private defpackage.ahuo c;
    private int d;

    public ahuj(defpackage.ahuk ahukVar, aohy aohyVar) {
        j$.util.Objects.requireNonNull(ahukVar);
        this.a = ahukVar;
        this.c = null;
        this.d = 0;
        this.b = aohyVar;
    }

    public final void e() {
        aohy aohyVar = this.b;
        synchronized (aohyVar) {
            aohyVar.e();
        }
        defpackage.ahuo ahuoVar = this.c;
        if (ahuoVar != null) {
            ahuoVar.b();
            defpackage.ahuk ahukVar = this.a;
            ahukVar.a.remove(java.lang.Integer.valueOf(this.d));
        }
    }

    public final void f(java.lang.Throwable th) {
        aohy aohyVar = this.b;
        synchronized (aohyVar) {
            aohyVar.f(th);
        }
        defpackage.ahuo ahuoVar = this.c;
        if (ahuoVar != null) {
            ahuoVar.b();
            defpackage.ahuk ahukVar = this.a;
            ahukVar.a.remove(java.lang.Integer.valueOf(this.d));
        }
    }

    public final /* synthetic */ void g(java.lang.Object obj) {
        defpackage.ahvh ahvhVar = (defpackage.ahvh) obj;
        if (this.c == null) {
            this.c = (defpackage.ahuo) this.a.a.get(java.lang.Integer.valueOf(ahvhVar.b));
            this.d = ahvhVar.b;
        }
        defpackage.ahuo ahuoVar = this.c;
        if (ahuoVar != null) {
            aohy aohyVar = this.b;
            synchronized (ahuoVar.d) {
                if (ahuoVar.e == 1) {
                    ahuoVar.e = 2;
                    ahuoVar.b = aohyVar;
                }
            }
            if (this.c.c() == 2) {
                this.c.a(new amac(ahvhVar));
                return;
            }
            return;
        }
        akzx akzxVarM = defpackage.ahvi.a.m();
        akzx akzxVarM2 = defpackage.ahvm.a.m();
        akzxVarM2.u();
        ((defpackage.ahvm) akzxVarM2.b).c = a.R(5);
        akzxVarM2.u();
        defpackage.ahvm ahvmVar = (defpackage.ahvm) akzxVarM2.b;
        j$.util.Objects.requireNonNull("Session not available.");
        ahvmVar.b = "Session not available.";
        akzxVarM.u();
        defpackage.ahvi ahviVar = (defpackage.ahvi) akzxVarM.b;
        defpackage.ahvm ahvmVar2 = (defpackage.ahvm) akzxVarM2.p();
        j$.util.Objects.requireNonNull(ahvmVar2);
        ahviVar.c = ahvmVar2;
        ahviVar.b |= 16;
        defpackage.ahvi ahviVar2 = (defpackage.ahvi) akzxVarM.p();
        aohy aohyVar2 = this.b;
        synchronized (aohyVar2) {
            aohyVar2.g(ahviVar2);
        }
    }
}
