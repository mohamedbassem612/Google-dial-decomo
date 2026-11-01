package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbb extends ajsz {
    public final java.lang.Object a;
    public final java.util.Queue b;
    final /* synthetic */ anmc c;
    final /* synthetic */ anpk d;
    final /* synthetic */ anmb e;
    final /* synthetic */ anmv f;
    public ajsz g;

    public akbb(ahsc ahscVar, anmc anmcVar, anpk anpkVar, anmb anmbVar, anmv anmvVar) {
        this.c = anmcVar;
        this.d = anpkVar;
        this.e = anmbVar;
        this.f = anmvVar;
        j$.util.Objects.requireNonNull(ahscVar);
        this.a = new java.lang.Object();
        this.b = new java.util.ArrayDeque();
        this.g = anmcVar.b(anpkVar, anmbVar);
    }

    public final void a(anty antyVar, anph anphVar) {
        synchronized (this.a) {
            anph anphVar2 = new anph();
            anphVar2.g(anphVar);
            this.b.add(new akaz(this, antyVar, anphVar2, 2));
            c().a(new defpackage.akba(this, antyVar), anphVar);
        }
    }

    public final ajsz c() {
        ajsz ajszVar;
        synchronized (this.a) {
            ajszVar = this.g;
        }
        return ajszVar;
    }

    public final void dv(java.lang.String str, java.lang.Throwable th) {
        synchronized (this.a) {
            this.b.add(new akaz(this, str, th, 0));
            c().dv(str, th);
        }
    }

    public final void dw() {
        synchronized (this.a) {
            this.b.add(new defpackage.ahts(this, 12));
            c().dw();
        }
    }

    public final void dx(int i) {
        synchronized (this.a) {
            this.b.add(new akbd(this, i, 1));
            c().dx(i);
        }
    }

    public final void dy(java.lang.Object obj) {
        synchronized (this.a) {
            this.b.add(new defpackage.agrz(this, obj, 17));
            c().dy(obj);
        }
    }
}
