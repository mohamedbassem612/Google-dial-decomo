package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbw extends ajsz {
    public final java.util.concurrent.Executor a;
    public int d;
    public defpackage.akbv e;
    public final defpackage.akbu g;
    public anty k;
    public ajsz l;
    private final anmc m;
    private final anpk n;
    private final aify o;
    private anmb s;
    private int u;
    private anph v;
    public final java.util.Set b = ahvr.as();
    private final java.util.LinkedHashMap p = new java.util.LinkedHashMap();
    private final java.util.Set q = ahvr.as();
    public boolean f = false;
    public boolean j = false;
    public final java.util.Deque c = new java.util.ArrayDeque();
    private final java.util.Queue t = new java.util.ArrayDeque();
    private final java.util.Queue r = new java.util.ArrayDeque();
    private final anmv w = anmv.k();

    public akbw(anmc anmcVar, anpk anpkVar, anmb anmbVar, aify aifyVar) {
        this.m = anmcVar;
        this.n = anpkVar;
        this.s = anmbVar;
        this.o = aifyVar;
        this.e = new defpackage.akbv(((aike) aifyVar).d, 1, 0, 0);
        ajbm ajbmVar = anmbVar.c;
        defpackage.akbu akbuVar = new defpackage.akbu(ajbmVar == null ? ajbm.a : ajbmVar);
        this.g = akbuVar;
        this.a = new apwd(this, new ajdc(akbuVar), 1);
    }

    private final void dN() {
        while (true) {
            java.util.Deque deque = this.c;
            if (deque.isEmpty()) {
                return;
            }
            defpackage.akbt akbtVar = (defpackage.akbt) deque.peek();
            if (!akbtVar.b.isEmpty() || akbtVar.c != akbtVar.d.e.a) {
                return;
            }
            java.lang.Object obj = ((defpackage.akbt) deque.poll()).a;
            if (this.e.e == 4) {
                this.l.dy(obj);
            } else {
                this.r.add(obj);
            }
        }
    }

    private final void dO(defpackage.akbt akbtVar, int i, int i2) {
        defpackage.agwm agwmVar = new defpackage.agwm(akbtVar.a, (byte[]) null);
        while (i < i2) {
            aify aifyVar = (aify) this.o.get(i);
            int size = aifyVar.size();
            int i3 = 0;
            while (i3 < size) {
                defpackage.akbp akbpVar = (defpackage.akbp) aifyVar.get(i3);
                defpackage.akcc akccVarD = akbpVar.d();
                if (akccVarD.c == 4) {
                    ajcq ajcqVarA = akccVarD.a();
                    akbtVar.b.put(akbpVar, ajcqVarA);
                    ajcqVarA.c(ahqx.h(new akaz(this, agwmVar, akbtVar, 6)), this.a);
                }
                i3++;
                if (dQ(akccVarD)) {
                    return;
                }
            }
            i++;
        }
        akbtVar.c = i2;
        if (akbtVar.b.isEmpty()) {
            dN();
            c();
        }
    }

    private final void dP() {
        defpackage.akbv akbvVar;
        defpackage.akbv akbvVar2 = this.e;
        int i = akbvVar2.e;
        ahvr.bZ(!(i == 4), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if (i == 3) {
            akbvVar = new defpackage.akbv(akbvVar2.a, 4, akbvVar2.b, akbvVar2.c);
        } else {
            if (i == 1) {
                boolean z = akbvVar2.d;
            }
            int i2 = akbvVar2.b;
            int i3 = i2 + 1;
            int i4 = akbvVar2.a;
            int i5 = akbvVar2.c;
            akbvVar = i3 < i4 ? new defpackage.akbv(i4, 1, i3, i5) : new defpackage.akbv(i4, 3, i2, i5);
        }
        this.e = akbvVar;
        int i6 = akbvVar.e - 1;
        if (i6 == 0) {
            e(this.v);
            return;
        }
        if (i6 != 2) {
            d();
            return;
        }
        ajsz ajszVarW = defpackage.agwm.w(this.w, this.m, this.n, this.s);
        this.l = ajszVarW;
        ajszVarW.a(this.k, this.v);
        int i7 = this.d;
        if (i7 > 0) {
            this.l.dx(i7);
        }
        java.util.Iterator it = this.r.iterator();
        while (it.hasNext()) {
            this.l.dy(it.next());
        }
        if (this.f && this.c.isEmpty()) {
            this.l.dw();
        }
        dP();
    }

    private final boolean dQ(defpackage.akcc akccVar) {
        int i = akccVar.c - 1;
        if (i == 0) {
            return dR(akccVar);
        }
        if (i != 1) {
            if (i != 3) {
                throw null;
            }
            ajcq ajcqVarA = akccVar.a();
            this.b.add(ajcqVarA);
            ajcqVarA.c(ahqx.h(new akbr(this, ajcqVarA, 0)), this.a);
            return dR(akccVar);
        }
        apjb apjbVar = akccVar.d;
        anty antyVar = this.k;
        anqw anqwVar = (anqw) apjbVar.a;
        antyVar.a(anqwVar, (anph) apjbVar.b);
        if (this.e.e == 4) {
            this.l.dv("Aborted RPC with exception", anqwVar.q);
        }
        this.j = true;
        return true;
    }

    private final boolean dR(defpackage.akcc akccVar) {
        anmb anmbVar = akccVar.b;
        if (anmbVar != null) {
            if (this.e.e != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("Cannot return *WithCallOptions() from message processing methods");
                this.k.a(anqw.d(illegalStateException), new anph());
                if (this.e.e != 4) {
                    return true;
                }
                this.l.dv("Interceptor returned invalid outcome", illegalStateException);
                return true;
            }
            this.s = anmbVar;
        }
        return false;
    }

    private final defpackage.aljf dS(anmb anmbVar, anph anphVar, java.lang.String str) {
        ahvr.ci(anmbVar);
        ahvr.ci(anphVar);
        ahvr.ci(str);
        return new defpackage.aljf(this.n, anmbVar, anphVar, str);
    }

    private final defpackage.aljf dT(defpackage.aljf aljfVar) {
        anmb anmbVar = this.s;
        if (anmbVar == aljfVar.a) {
            return aljfVar;
        }
        return dS(anmbVar, (anph) aljfVar.d, (java.lang.String) aljfVar.b);
    }

    public final void a(anty antyVar, anph anphVar) {
        anty antyVarT = defpackage.agwm.t(this.w, this.s, antyVar);
        aify aifyVar = this.o;
        java.util.Set set = this.q;
        java.util.concurrent.Executor executor = this.a;
        this.k = new defpackage.akbs(this, new defpackage.akce(new akby(antyVarT, aifyVar, set, executor)));
        this.v = anphVar;
        executor.execute(ahqx.h(new akbr(this, anphVar, 2, (byte[]) null)));
    }

    public final void c() {
        if (this.f) {
            defpackage.akbt akbtVar = (defpackage.akbt) this.c.peekLast();
            int i = this.e.e - 1;
            if (i != 1) {
                if (i == 3 && akbtVar == null) {
                    this.l.dw();
                    return;
                }
                return;
            }
            if (akbtVar == null || (akbtVar.b.isEmpty() && akbtVar.c == akbtVar.d.e.c + 1)) {
                dP();
            }
        }
    }

    public final void d() {
        int i = this.e.e - 1;
        if (i != 1) {
            if (i == 3) {
                for (defpackage.akbt akbtVar : this.c) {
                    dO(akbtVar, akbtVar.c, this.e.a);
                }
                return;
            }
            return;
        }
        for (defpackage.akbt akbtVar2 : this.c) {
            int i2 = akbtVar2.c;
            int i3 = this.e.c;
            if (i2 <= i3) {
                dO(akbtVar2, i2, i3 + 1);
            }
        }
    }

    public final void dM(defpackage.agwm agwmVar, defpackage.akbt akbtVar) {
        java.util.LinkedHashMap linkedHashMap = akbtVar.b;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!((ajcq) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            defpackage.akbp akbpVar = (defpackage.akbp) entry.getKey();
            defpackage.akcc akccVarA = akbpVar.a();
            if (akccVarA.c == 4) {
                ajcq ajcqVarA = akccVarA.a();
                linkedHashMap.put(akbpVar, ajcqVarA);
                ajcqVarA.c(ahqx.h(new akaz(this, agwmVar, akbtVar, 8)), this.a);
            }
            if (dQ(akccVarA)) {
                return;
            }
        }
        if (linkedHashMap.isEmpty()) {
            dN();
            c();
        }
    }

    public final void dv(java.lang.String str, java.lang.Throwable th) {
        this.a.execute(ahqx.h(new akaz(this, str, th, 7)));
    }

    public final void dw() {
        this.a.execute(ahqx.h(new defpackage.ahts(this, 15)));
    }

    public final void dx(int i) {
        synchronized (this.t) {
            this.u += i;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.Queue queue = this.t;
        synchronized (queue) {
            if (!queue.isEmpty()) {
                int i2 = this.u;
                for (int i3 = 0; i3 < i2; i3++) {
                    java.lang.Object objPoll = queue.poll();
                    if (objPoll != null) {
                        arrayDeque.add(objPoll);
                        this.u--;
                    }
                }
                boolean zIsEmpty = queue.isEmpty();
                java.util.Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    this.k.d(it.next());
                }
                if (zIsEmpty) {
                    this.k.a(anqw.b, (anph) null);
                }
            }
        }
        this.a.execute(ahqx.h(new akbd(this, i, 3)));
    }

    public final void dy(java.lang.Object obj) {
        this.a.execute(ahqx.h(new akbr(this, obj, 3, (byte[]) null)));
    }

    public final void e(anph anphVar) {
        defpackage.aljf aljfVarDS = dS(this.s, anphVar, this.m.a());
        aify aifyVar = (aify) this.o.get(this.e.b);
        int size = aifyVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.akbp akbpVar = (defpackage.akbp) aifyVar.get(i);
            defpackage.akcc akccVarH = akbpVar.h(dT(aljfVarDS));
            if (akccVarH.c == 4) {
                ajcq ajcqVarA = akccVarH.a();
                this.p.put(akbpVar, ajcqVarA);
                ajcqVarA.c(ahqx.h(new akbr(this, aljfVarDS, 4)), this.a);
            }
            if (dQ(akccVarH)) {
                return;
            }
            this.q.add(akbpVar);
        }
        if (this.p.isEmpty()) {
            dP();
        }
    }

    public final void f(defpackage.aljf aljfVar) {
        java.util.LinkedHashMap linkedHashMap = this.p;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!((ajcq) entry.getValue()).isDone()) {
                break;
            }
            it.remove();
            defpackage.akbp akbpVar = (defpackage.akbp) entry.getKey();
            defpackage.akcc akccVarG = akbpVar.g(dT(aljfVar));
            if (akccVarG.c == 4) {
                ajcq ajcqVarA = akccVarG.a();
                linkedHashMap.put(akbpVar, ajcqVarA);
                ajcqVarA.c(ahqx.h(new akbr(this, aljfVar, 6)), this.a);
            }
            if (dQ(akccVarG)) {
                return;
            }
        }
        if (!linkedHashMap.isEmpty() || this.j) {
            return;
        }
        dP();
    }
}
