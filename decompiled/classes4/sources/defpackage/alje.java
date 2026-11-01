package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alje {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/BGConversationImpl");
    public final defpackage.aljg b;
    public final defpackage.amgt c;
    public final defpackage.alud d;
    public defpackage.alit f;
    public defpackage.alqk g;
    public defpackage.amgv h;
    public ajcu i;
    private final java.lang.String j;
    private final aizr m;
    private final defpackage.alqh n;
    private final java.util.concurrent.atomic.AtomicBoolean k = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean l = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final aljc e = new aljc();

    public alje(defpackage.aljg aljgVar, java.lang.String str, defpackage.amgt amgtVar, aizr aizrVar, defpackage.alud aludVar, defpackage.alqh alqhVar) {
        this.c = amgtVar;
        this.b = aljgVar;
        this.j = str;
        this.m = aizrVar;
        this.d = aludVar;
        this.n = alqhVar;
    }

    public final void a(defpackage.alqg alqgVar, defpackage.alqk alqkVar, defpackage.alit alitVar, ajcu ajcuVar) throws defpackage.alio {
        this.f = alitVar;
        aizr aizrVar = this.m;
        this.h = new defpackage.amgv(aizrVar, this.c);
        this.g = alqkVar;
        this.i = ajcuVar;
        try {
            aljc aljcVar = this.e;
            aljcVar.b = ajcuVar;
            aljcVar.c = new java.util.HashMap();
            aljcVar.d.set(false);
            defpackage.aljg aljgVar = this.b;
            java.lang.String str = this.j;
            aljgVar.e(str, aizrVar, alqgVar, ajcuVar, this.h);
            aljgVar.f(new aprf(this));
            defpackage.alud aludVar = this.d;
            aludVar.d(str, this.n, alqkVar, ajcuVar, this.h);
            aludVar.g(new defpackage.amfc(this, 1));
            this.l.set(true);
        } catch (defpackage.alio e) {
            this.c.b(new achb(e, 10));
            c();
            throw e;
        }
    }

    public final void b(defpackage.alro alroVar) {
        defpackage.alro alroVar2;
        if (this.l.get()) {
            defpackage.amgv amgvVar = this.h;
            int iA = this.b.a();
            apdi apdiVar = alrc.f;
            alroVar.c(apdiVar);
            if (!((alaa) alroVar).n.l((alac) apdiVar.a)) {
                apdi apdiVar2 = defpackage.alqv.f;
                alroVar.c(apdiVar2);
                if (!((alaa) alroVar).n.l((alac) apdiVar2.a)) {
                    apdi apdiVar3 = alre.e;
                    alroVar.c(apdiVar3);
                    akzs akzsVar = ((alaa) alroVar).n;
                    alac alacVar = (alac) apdiVar3.a;
                    if (akzsVar.l(alacVar)) {
                        alroVar.c(apdiVar3);
                        java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
                        if (objJ == null) {
                            objJ = apdiVar3.b;
                        } else {
                            apdiVar3.c(objJ);
                        }
                        akzz akzzVarP = alroVar.p();
                        akzx akzxVarP = ((alre) objJ).p();
                        akzxVarP.u();
                        alre alreVar = akzxVarP.b;
                        alreVar.b &= -3;
                        alreVar.d = alre.a.d;
                        akzzVarP.bV(apdiVar3, akzxVarP.p());
                        alroVar2 = (defpackage.alro) akzzVarP.p();
                    } else {
                        alroVar2 = alroVar;
                    }
                    akzx akzxVarM = defpackage.altn.a.m();
                    akzxVarM.u();
                    defpackage.altn altnVar = (defpackage.altn) akzxVarM.b;
                    j$.util.Objects.requireNonNull(alroVar2);
                    altnVar.c = alroVar2;
                    altnVar.b = 7;
                    amgvVar.h(akzxVarM, j$.time.Duration.ofMillis(iA));
                }
            }
            this.d.e(alroVar);
        }
    }

    public final void c() {
        defpackage.aljg aljgVar = this.b;
        if (aljgVar != null) {
            aljgVar.b();
        }
    }

    public final void d(java.io.InputStream inputStream) {
        try {
            try {
                this.b.c(inputStream);
                this.c.b(new defpackage.aljd(0));
            } catch (defpackage.alio e) {
                this.c.b(new achb(e, 9));
            }
        } finally {
            c();
        }
    }

    public final void e(j$.util.Optional optional) {
        try {
            h();
            this.h.a(this.g, this.b.a());
            if (this.g.d) {
                optional.ifPresentOrElse(new achb(this, 14), new ahts(this, 19));
                return;
            }
            int i = 15;
            try {
                this.d.h(j$.util.Optional.empty());
                this.i.execute(new defpackage.akbr(this, optional, i, null));
            } catch (defpackage.alio e) {
                this.c.b(new achb(e, 15));
                c();
            }
        } catch (defpackage.alio e2) {
            this.c.b(new achb(e2, 13));
            c();
        }
    }

    public final void f(j$.util.Optional optional) {
        try {
            this.d.h(optional);
        } catch (defpackage.alio e) {
            this.c.b(new achb(e, 11));
            c();
        }
    }

    public final void g() {
        boolean andSet = this.k.getAndSet(false);
        aimz aimzVar = a;
        if (!andSet) {
            aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/BGConversationImpl", "stop", 152, "BGConversationImpl.java").v("not currently running");
            return;
        }
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/BGConversationImpl", "stop", 156, "BGConversationImpl.java").v("stop(): starting close sequence");
        this.b.d();
        this.d.i();
        this.e.d.set(true);
        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/BGConversationImpl", "stop", 160, "BGConversationImpl.java").v("stop(): completed");
    }

    public final void h() throws defpackage.alio {
        if (this.k.getAndSet(true)) {
            throw new defpackage.alio("Called start while another session is in progress.", defpackage.alti.START_DUPLEX_CALLED_WHILE_IN_PROGRESS);
        }
        if (!this.l.getAndSet(true)) {
            throw new defpackage.alio("Called start before Duplex is initialized.", defpackage.alti.START_DUPLEX_CALLED_BEFORE_INITIALIZATION);
        }
    }
}
