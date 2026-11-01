package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public abstract class aoid extends defpackage.anon {
    public static final java.util.logging.Logger f = java.util.logging.Logger.getLogger(defpackage.aoid.class.getName());
    private static final int l = new java.util.Random().nextInt();
    public final defpackage.anof h;
    protected boolean i;
    protected anmm k;
    public java.util.List g = new java.util.ArrayList(0);
    protected final anop j = new aoau();

    protected aoid(defpackage.anof anofVar) {
        this.h = anofVar;
        f.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    @Override // defpackage.anon
    public final anqw a(defpackage.anoj anojVar) {
        anqw anqwVarF;
        f.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddresses", "Received resolution result: {0}", anojVar);
        try {
            this.i = true;
            java.util.List<defpackage.anna> list = anojVar.a;
            java.util.LinkedHashMap linkedHashMapAH = ahvr.aH(list.size());
            for (defpackage.anna annaVar : list) {
                defpackage.anlw anlwVar = defpackage.anlw.a;
                java.util.List listSingletonList = java.util.Collections.singletonList(annaVar);
                defpackage.antt anttVar = new defpackage.antt(defpackage.anlw.a);
                anttVar.c(e, java.lang.Boolean.TRUE);
                linkedHashMapAH.put(new defpackage.aoic(annaVar), new defpackage.anoj(listSingletonList, anttVar.a(), null));
            }
            if (linkedHashMapAH.isEmpty()) {
                anqwVarF = anqw.l.f(hgb.k(anojVar, "NameResolver returned no usable address. "));
                b(anqwVarF);
            } else {
                java.util.LinkedHashMap linkedHashMapAH2 = ahvr.aH(this.g.size());
                for (defpackage.aoib aoibVar : this.g) {
                    linkedHashMapAH2.put(aoibVar.a, aoibVar);
                }
                anqw anqwVar = anqw.b;
                java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMapAH.size());
                for (java.util.Map.Entry entry : linkedHashMapAH.entrySet()) {
                    defpackage.aoib aoibVarE = (defpackage.aoib) linkedHashMapAH2.remove(entry.getKey());
                    if (aoibVarE == null) {
                        aoibVarE = e(entry.getKey());
                    }
                    arrayList.add(aoibVarE);
                }
                int iD = arrayList.isEmpty() ? 0 : (int) (ajee.d(l) % ajee.d(arrayList.size()));
                java.lang.Iterable iterableBg = ahvr.bg(arrayList, iD);
                ahvr.bN((boolean) ((iD ^ (-1)) >>> 31), "limit is negative");
                for (defpackage.aoib aoibVar2 : aieu.a(iterableBg, new aihw(arrayList, iD))) {
                    defpackage.anoj anojVar2 = (defpackage.anoj) linkedHashMapAH.get(aoibVar2.a);
                    if (anojVar2 != null) {
                        anqw anqwVarA = aoibVar2.b.a(anojVar2);
                        if (!anqwVarA.h()) {
                            anqwVar = anqwVarA;
                        }
                    }
                }
                this.g = arrayList;
                f();
                java.util.Iterator it = linkedHashMapAH2.values().iterator();
                while (it.hasNext()) {
                    ((defpackage.aoib) it.next()).b();
                }
                anqwVarF = anqwVar;
            }
            this.i = false;
            return anqwVarF;
        } catch (java.lang.Throwable th) {
            this.i = false;
            throw th;
        }
    }

    @Override // defpackage.anon
    public final void b(anqw anqwVar) {
        if (this.k != anmm.b) {
            this.h.f(anmm.c, new defpackage.anoe(defpackage.anoh.b(anqwVar)));
        }
    }

    @Override // defpackage.anon
    public final void d() {
        f.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        java.util.Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((defpackage.aoib) it.next()).b();
        }
        this.g.clear();
    }

    protected defpackage.aoib e(java.lang.Object obj) {
        throw null;
    }

    protected abstract void f();
}
