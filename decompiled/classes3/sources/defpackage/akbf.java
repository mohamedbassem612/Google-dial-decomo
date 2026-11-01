package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbf extends ajsz {
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.Queue b = new java.util.ArrayDeque();
    final /* synthetic */ anmc c;
    final /* synthetic */ anpk d;
    final /* synthetic */ anmb e;
    final /* synthetic */ anmv f;
    final /* synthetic */ defpackage.akbg g;
    public ajsz j;

    public akbf(anmc anmcVar, anpk anpkVar, anmb anmbVar, anmv anmvVar, defpackage.akbg akbgVar) {
        this.c = anmcVar;
        this.d = anpkVar;
        this.e = anmbVar;
        this.f = anmvVar;
        this.g = akbgVar;
        this.j = anmcVar.b(anpkVar, anmbVar);
    }

    public final void a(anty antyVar, anph anphVar) {
        aooh.f(antyVar, "listener");
        aooh.f(anphVar, "metadata");
        synchronized (this.a) {
            anph anphVar2 = new anph();
            anphVar2.g(anphVar);
            this.b.add(new akaz(this, antyVar, anphVar2, 4));
            c().a(new defpackage.akbe(this, antyVar), anphVar);
        }
    }

    public final ajsz c() {
        ajsz ajszVar;
        synchronized (this.a) {
            ajszVar = this.j;
        }
        return ajszVar;
    }

    public final void dv(java.lang.String str, java.lang.Throwable th) {
        synchronized (this.a) {
            this.b.add(new akaz(this, str, th, 3));
            c().dv(str, th);
        }
    }

    public final void dw() {
        synchronized (this.a) {
            this.b.add(new defpackage.ahts(this, 13));
            c().dw();
        }
    }

    public final void dx(int i) {
        synchronized (this.a) {
            this.b.add(new akbd(this, i, 0));
            c().dx(i);
        }
    }

    public final void dy(java.lang.Object obj) {
        synchronized (this.a) {
            this.b.add(new defpackage.agrz(this, obj, 18));
            c().dy(obj);
        }
    }
}
