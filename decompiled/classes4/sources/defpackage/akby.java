package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akby extends anqa {
    public final java.util.LinkedHashMap a;
    public final java.util.LinkedHashMap b;
    public boolean c;
    public anqw d;
    public anph e;
    private final java.util.concurrent.Executor g;
    private final aify h;
    private final java.util.Queue i;
    private final java.util.Set j;
    private int k;
    private boolean l;
    private boolean m;
    private anph n;

    public akby(anty antyVar, aify aifyVar, java.util.Set set, java.util.concurrent.Executor executor) {
        super(antyVar);
        this.a = new java.util.LinkedHashMap();
        this.i = new java.util.ArrayDeque();
        this.b = new java.util.LinkedHashMap();
        this.h = aifyVar;
        this.k = ((aike) aifyVar).d;
        this.j = set;
        this.g = executor;
    }

    private final void aV() {
        if (i() || !this.i.isEmpty() || !this.m || this.c) {
            return;
        }
        g();
    }

    public final void a(anqw anqwVar, anph anphVar) {
        this.d = anqwVar;
        this.e = anphVar;
        this.m = true;
        aV();
    }

    public final void c(anph anphVar) {
        this.n = anphVar;
        h();
    }

    public final void d(java.lang.Object obj) {
        this.i.add(new akbx(this, obj, this.h.d));
        f();
    }

    public final void f() {
        if (this.l) {
            for (akbx akbxVar : this.i) {
                java.util.Iterator it = ahvr.aN(this.h.b(0, akbxVar.b)).iterator();
                while (it.hasNext()) {
                    for (akbp akbpVar : ahvr.aN((java.util.List) it.next())) {
                        if (this.j.contains(akbpVar)) {
                            try {
                                j(new agwm(akbxVar.a), akbpVar, akbpVar.f(), akbxVar);
                            } catch (java.lang.Throwable th) {
                                this.d = anqw.d(th);
                                this.e = new anph();
                                g();
                                this.c = true;
                                return;
                            }
                        }
                    }
                    if (!akbxVar.a()) {
                        return;
                    } else {
                        akbxVar.b--;
                    }
                }
            }
            while (true) {
                java.util.Queue queue = this.i;
                if (queue.isEmpty()) {
                    break;
                }
                akbx akbxVar2 = (akbx) queue.peek();
                if (!akbxVar2.a() || akbxVar2.b != 0) {
                    break;
                } else {
                    ((anqa) this).f.d(((akbx) queue.poll()).a);
                }
            }
            aV();
        }
    }

    public final void g() {
        java.util.Iterator it = ahvr.aN(this.h).iterator();
        while (it.hasNext()) {
            for (akbp akbpVar : ahvr.aN((java.util.List) it.next())) {
                defpackage.apjb apjbVar = new defpackage.apjb(this.d, this.e, (byte[]) null);
                if (this.j.contains(akbpVar)) {
                    try {
                        l(apjbVar, akbpVar, akbpVar.j(apjbVar));
                    } catch (java.lang.Throwable th) {
                        this.d = anqw.d(th);
                        this.e = new anph();
                    }
                }
            }
        }
        if (this.b.isEmpty()) {
            ((anqa) this).f.a(this.d, this.e);
        }
    }

    public final void h() {
        agwm agwmVar = new agwm(this.n);
        for (java.util.List list : ahvr.aN(this.h.b(0, this.k))) {
            this.k--;
            for (akbp akbpVar : ahvr.aN(list)) {
                if (this.j.contains(akbpVar)) {
                    try {
                        k(agwmVar, akbpVar, akbpVar.e());
                    } catch (java.lang.Throwable th) {
                        this.d = anqw.d(th);
                        this.e = new anph();
                        g();
                        return;
                    }
                }
            }
            if (i()) {
                return;
            }
        }
        ((anqa) this).f.c(this.n);
        this.l = true;
        f();
    }

    public final boolean i() {
        return !this.a.isEmpty();
    }

    public final void j(agwm agwmVar, akbp akbpVar, akcd akcdVar, akbx akbxVar) {
        int i = akcdVar.c - 1;
        if (i != 0) {
            if (i == 1) {
                throw null;
            }
            ajcq ajcqVar = akcdVar.b;
            ((java.util.LinkedHashMap) akbxVar.c).put(akbpVar, ajcqVar);
            ajcqVar.c(ahqx.h(new defpackage.akaz(this, agwmVar, akbxVar, 10)), this.g);
        }
    }

    public final void k(agwm agwmVar, akbp akbpVar, akcd akcdVar) {
        int i = akcdVar.c - 1;
        if (i != 0) {
            if (i == 1) {
                throw null;
            }
            ajcq ajcqVar = akcdVar.b;
            this.a.put(akbpVar, ajcqVar);
            ajcqVar.c(ahqx.h(new defpackage.akbr(this, agwmVar, 9)), this.g);
        }
    }

    public final void l(defpackage.apjb apjbVar, akbp akbpVar, akcd akcdVar) {
        int i = akcdVar.c - 1;
        if (i == 1) {
            throw null;
        }
        if (i == 2) {
            ajcq ajcqVar = akcdVar.b;
            ajcqVar.c(ahqx.h(new defpackage.akbr(this, apjbVar, 10)), this.g);
            this.b.put(akbpVar, ajcqVar);
        }
    }
}
