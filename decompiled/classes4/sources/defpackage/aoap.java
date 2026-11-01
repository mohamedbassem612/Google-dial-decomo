package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoap extends defpackage.anon {
    public static final java.util.logging.Logger f = java.util.logging.Logger.getLogger(defpackage.aoap.class.getName());
    static final boolean g;
    public final boolean h;
    public final defpackage.anof i;
    public final java.util.Map j;
    public final defpackage.aoak k;
    public int l;
    public boolean m;
    public anmm n;
    public anmm o;
    public boolean p;
    public defpackage.anwx q;
    public defpackage.apjb r;
    public defpackage.apjb s;
    private final boolean t;

    static {
        java.nio.charset.Charset charset = anxo.a;
        g = annb.a("GRPC_EXPERIMENTAL_PF_WEIGHTED_SHUFFLING", true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public aoap(defpackage.anof anofVar) {
        boolean z;
        if (j()) {
            z = false;
        } else {
            int i = aoau.b;
            java.nio.charset.Charset charset = anxo.a;
            if (annb.a("GRPC_PF_USE_HAPPY_EYEBALLS", false)) {
                z = true;
            } else {
                z = false;
            }
        }
        this.h = z;
        this.j = new java.util.HashMap();
        this.k = new defpackage.aoak(aike.a, z);
        this.l = 0;
        this.m = true;
        this.r = null;
        anmm anmmVar = anmm.d;
        this.n = anmmVar;
        this.o = anmmVar;
        this.p = true;
        this.s = null;
        this.t = j();
        this.i = anofVar;
    }

    static java.util.List e(java.util.List list, java.util.Random random) {
        if (!g) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            java.util.Collections.shuffle(arrayList, random);
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.anna annaVar = (defpackage.anna) it.next();
            java.lang.Long l = (java.lang.Long) annaVar.f.a(defpackage.annq.a);
            if (l == null) {
                l = 1L;
            }
            arrayList2.add(new defpackage.aoao(annaVar, java.lang.Math.pow(random.nextDouble(), 1.0d / l.longValue())));
        }
        java.util.Collections.sort(arrayList2, java.util.Collections.reverseOrder());
        return ahvr.aO(arrayList2, new defpackage.ammx(8));
    }

    static boolean j() {
        java.nio.charset.Charset charset = anxo.a;
        return annb.a("GRPC_SERIALIZE_RETRIES", false);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001c  */
    public static final java.net.SocketAddress k(defpackage.anok anokVar) {
        boolean z;
        defpackage.anut anutVar = (defpackage.anut) anokVar;
        anutVar.i.n.c();
        ahvr.bZ(anutVar.g, "not started");
        java.util.List list = anutVar.e;
        if (list != null) {
            z = list.size() == 1;
        }
        ahvr.cc(z, "%s does not have exactly one group", list);
        return (java.net.SocketAddress) ((defpackage.anna) list.get(0)).e.get(0);
    }

    private final void l() {
        if (this.h) {
            defpackage.apjb apjbVar = this.r;
            if (apjbVar == null || !apjbVar.k()) {
                defpackage.anof anofVar = this.i;
                this.r = anofVar.c().d(new defpackage.aoai(this, 2, (byte[]) null), 250L, java.util.concurrent.TimeUnit.MILLISECONDS, anofVar.d());
            }
        }
    }

    private final boolean m(aify aifyVar) {
        java.util.Map map = this.j;
        java.util.HashSet<java.net.SocketAddress> hashSet = new java.util.HashSet(map.keySet());
        java.util.HashSet hashSet2 = new java.util.HashSet();
        int size = aifyVar.size();
        for (int i = 0; i < size; i++) {
            hashSet2.addAll(((defpackage.anna) aifyVar.get(i)).e);
        }
        for (java.net.SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((defpackage.aoan) map.remove(socketAddress)).a.b();
            }
        }
        return hashSet.isEmpty();
    }

    @Override // defpackage.anon
    public final anqw a(defpackage.anoj anojVar) {
        defpackage.aoal aoalVar;
        java.lang.Boolean bool;
        if (this.n == anmm.e) {
            return anqw.i.f("Already shut down");
        }
        defpackage.anlw anlwVar = anojVar.b;
        java.lang.Boolean bool2 = (java.lang.Boolean) anlwVar.a(e);
        this.p = bool2 == null || !bool2.booleanValue();
        java.util.List<defpackage.anna> list = anojVar.a;
        if (list.isEmpty()) {
            anqw anqwVarF = anqw.l.f("NameResolver returned no usable address. addrs=" + java.lang.String.valueOf(list) + ", attrs=" + anlwVar.toString());
            b(anqwVarF);
            return anqwVarF;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((defpackage.anna) it.next()) == null) {
                anqw anqwVarF2 = anqw.l.f("NameResolver returned address list with null endpoint. addrs=" + java.lang.String.valueOf(list) + ", attrs=" + anlwVar.toString());
                b(anqwVarF2);
                return anqwVarF2;
            }
        }
        this.m = true;
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.List arrayList = new java.util.ArrayList();
        for (defpackage.anna annaVar : list) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.net.SocketAddress socketAddress : annaVar.e) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new defpackage.anna(arrayList2, annaVar.f));
            }
        }
        java.lang.Object obj = anojVar.c;
        if ((obj instanceof defpackage.aoal) && (bool = (aoalVar = (defpackage.aoal) obj).a) != null && bool.booleanValue()) {
            java.lang.Long l = aoalVar.b;
            arrayList = e(arrayList, new java.util.Random());
        }
        java.util.List listN = aify.n(arrayList);
        anmm anmmVar = this.n;
        anmm anmmVar2 = anmm.b;
        if (anmmVar == anmmVar2 || (anmmVar == anmm.a && (!this.h || this.k.f()))) {
            defpackage.aoak aoakVar = this.k;
            java.net.SocketAddress socketAddressB = aoakVar.b();
            aoakVar.d(listN);
            if (aoakVar.g(socketAddressB)) {
                defpackage.anok anokVar = ((defpackage.aoan) this.j.get(socketAddressB)).a;
                if (!aoakVar.f()) {
                    throw new java.lang.IllegalStateException("Index is past the end of the address group list");
                }
                defpackage.apjb apjbVar = (defpackage.apjb) aoakVar.a.get(aoakVar.b);
                anokVar.d(java.util.Collections.singletonList(new defpackage.anna((java.net.SocketAddress) apjbVar.b, (defpackage.anlw) apjbVar.a)));
                m(listN);
                return anqw.b;
            }
        } else {
            this.k.d(listN);
        }
        if (m(listN)) {
            anmm anmmVar3 = anmm.a;
            this.n = anmmVar3;
            h(anmmVar3, new defpackage.anoe(defpackage.anoh.d("pick_first: address list updated")));
        }
        anmm anmmVar4 = this.n;
        if (anmmVar4 == anmmVar2) {
            anmm anmmVar5 = anmm.d;
            this.n = anmmVar5;
            h(anmmVar5, new defpackage.aoam(this, this));
        } else if (anmmVar4 == anmm.a || anmmVar4 == anmm.c) {
            f();
            c();
        }
        return anqw.b;
    }

    @Override // defpackage.anon
    public final void b(anqw anqwVar) {
        if (this.n != anmm.e) {
            java.util.Map map = this.j;
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((defpackage.aoan) it.next()).a.b();
            }
            map.clear();
            this.k.d(aike.a);
            anmm anmmVar = anmm.c;
            this.n = anmmVar;
            h(anmmVar, new defpackage.anoe(defpackage.anoh.b(anqwVar)));
        }
    }

    @Override // defpackage.anon
    public final void c() {
        defpackage.aoak aoakVar = this.k;
        if (aoakVar.f() && this.n != anmm.e && this.s == null) {
            java.net.SocketAddress socketAddressB = aoakVar.b();
            java.util.Map map = this.j;
            defpackage.aoan aoanVar = (defpackage.aoan) map.get(socketAddressB);
            if (aoanVar == null) {
                if (!aoakVar.f()) {
                    throw new java.lang.IllegalStateException("Index is off the end of the address group list");
                }
                java.lang.Object obj = ((defpackage.apjb) aoakVar.a.get(aoakVar.b)).a;
                defpackage.aoaj aoajVar = new defpackage.aoaj(this);
                defpackage.anof anofVar = this.i;
                defpackage.anoa anoaVar = new defpackage.anoa();
                int i = 1;
                anoaVar.c(ahvr.aM(new defpackage.anna[]{new defpackage.anna(socketAddressB, (defpackage.anlw) obj)}));
                anoaVar.b(b, aoajVar);
                anoaVar.b(defpackage.anon.c, java.lang.Boolean.valueOf(this.t));
                defpackage.anok anokVarB = anofVar.b(anoaVar.a());
                defpackage.aoan aoanVar2 = new defpackage.aoan(anokVarB, anmm.d);
                aoajVar.a = aoanVar2;
                map.put(socketAddressB, aoanVar2);
                defpackage.anoc anocVar = ((defpackage.anut) anokVarB).a;
                if (this.p || anocVar.b.a(defpackage.anon.d) == null) {
                    aoanVar2.d = defpackage.anmn.a(anmm.b);
                }
                anokVarB.c(new defpackage.aoaq(this, aoanVar2, i));
                aoanVar = aoanVar2;
            }
            int iOrdinal = aoanVar.b.ordinal();
            if (iOrdinal == 0) {
                l();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    aoanVar.a.a();
                    aoanVar.b(anmm.a);
                    l();
                    return;
                }
                return;
            }
            if (!this.t) {
                aoakVar.e();
                c();
            } else if (!aoakVar.f()) {
                g();
            } else {
                aoanVar.a.a();
                aoanVar.b(anmm.a);
            }
        }
    }

    @Override // defpackage.anon
    public final void d() {
        java.util.logging.Logger logger = f;
        java.util.logging.Level level = java.util.logging.Level.FINE;
        java.util.Map map = this.j;
        logger.logp(level, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", java.lang.Integer.valueOf(map.size()));
        anmm anmmVar = anmm.e;
        this.n = anmmVar;
        this.o = anmmVar;
        f();
        defpackage.apjb apjbVar = this.s;
        if (apjbVar != null) {
            apjbVar.j();
            this.s = null;
        }
        this.q = null;
        java.util.Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((defpackage.aoan) it.next()).a.b();
        }
        map.clear();
    }

    public final void f() {
        defpackage.apjb apjbVar = this.r;
        if (apjbVar != null) {
            apjbVar.j();
            this.r = null;
        }
    }

    public final void g() {
        if (this.t && this.s == null) {
            defpackage.anwx anwxVar = this.q;
            if (anwxVar == null) {
                anwxVar = new defpackage.anwx();
                this.q = anwxVar;
            }
            long jA = anwxVar.a();
            defpackage.anof anofVar = this.i;
            this.s = anofVar.c().d(new defpackage.aoai(this, 0), jA, java.util.concurrent.TimeUnit.NANOSECONDS, anofVar.d());
        }
    }

    public final void h(anmm anmmVar, defpackage.anol anolVar) {
        if (anmmVar == this.o && (anmmVar == anmm.d || anmmVar == anmm.a)) {
            return;
        }
        this.o = anmmVar;
        this.i.f(anmmVar, anolVar);
    }

    public final void i(defpackage.aoan aoanVar) {
        anmm anmmVar = aoanVar.b;
        anmm anmmVar2 = anmm.b;
        if (anmmVar == anmmVar2) {
            if (this.p || aoanVar.a() == anmmVar2) {
                h(anmmVar2, new defpackage.anoe(defpackage.anoh.e(aoanVar.a)));
                return;
            }
            anmm anmmVarA = aoanVar.a();
            anmm anmmVar3 = anmm.c;
            if (anmmVarA == anmmVar3) {
                h(anmmVar3, new defpackage.anoe(defpackage.anoh.b(aoanVar.d.b)));
            } else if (this.o != anmmVar3) {
                h(aoanVar.a(), new defpackage.anoe(defpackage.anoh.d("health check state: ".concat(aoanVar.a().toString()))));
            }
        }
    }
}
