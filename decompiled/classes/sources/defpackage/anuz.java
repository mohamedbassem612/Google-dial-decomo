package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anuz extends defpackage.anop {
    public final defpackage.anop a;
    private final defpackage.anoq b;

    public anuz(defpackage.anoq anoqVar) {
        if (anoqVar == null) {
            throw new java.lang.NullPointerException("registry");
        }
        this.b = anoqVar;
        defpackage.anop anopVarA = anoqVar.a("pick_first");
        if (anopVarA == null) {
            defpackage.anqw anqwVarF = defpackage.anqw.k.f(defpackage.a.bk("pick_first", "Could not find policy '", "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            anopVarA = new anxb(defpackage.anmm.c, new anoe(anoh.b(anqwVarF)), anqwVarF);
        }
        this.a = anopVarA;
    }

    @Override // defpackage.anod
    public final /* synthetic */ anon a(anof anofVar) {
        return new anuy(this, anofVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    @Override // defpackage.anop
    public final defpackage.anpr b(java.util.Map map) {
        java.util.List<aoda> listUnmodifiableList;
        java.lang.String strF;
        if (map != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (map.containsKey("loadBalancingConfig")) {
                    arrayList.addAll(defpackage.aodc.h(map, "loadBalancingConfig"));
                }
                if (arrayList.isEmpty() && (strF = defpackage.aodc.f(map, "loadBalancingPolicy")) != null) {
                    arrayList.add(java.util.Collections.singletonMap(strF.toLowerCase(java.util.Locale.ROOT), java.util.Collections.EMPTY_MAP));
                }
                java.util.List<java.util.Map> listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(arrayList);
                if (listUnmodifiableList2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.util.Map map2 : listUnmodifiableList2) {
                        if (map2.size() != 1) {
                            throw new java.lang.RuntimeException("There are " + map2.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + java.lang.String.valueOf(map2));
                        }
                        java.lang.String str = (java.lang.String) ((java.util.Map.Entry) map2.entrySet().iterator().next()).getKey();
                        arrayList2.add(new aoda(str, defpackage.aodc.j(map2, str)));
                    }
                    listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    listUnmodifiableList = null;
                }
            } catch (java.lang.RuntimeException e) {
                return new defpackage.anpr(defpackage.anqw.d.f("can't parse load balancer configuration").e(e));
            }
        } else {
            listUnmodifiableList = null;
        }
        if (listUnmodifiableList == null || listUnmodifiableList.isEmpty()) {
            return null;
        }
        defpackage.anoq anoqVar = this.b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (aoda aodaVar : listUnmodifiableList) {
            java.lang.String str2 = aodaVar.a;
            defpackage.anop anopVarA = anoqVar.a(str2);
            if (anopVarA != null) {
                if (!arrayList3.isEmpty()) {
                    java.util.logging.Logger.getLogger(defpackage.aodc.class.getName()).logp(java.util.logging.Level.FINEST, "io.grpc.internal.ServiceConfigUtil", "selectLbPolicyFromList", "{0} specified by Service Config are not available", arrayList3);
                }
                defpackage.anpr anprVarB = anopVarA.b(aodaVar.b);
                return anprVarB.a == null ? new defpackage.anpr(new aodb(anopVarA, anprVarB.b)) : anprVarB;
            }
            arrayList3.add(str2);
        }
        return new defpackage.anpr(defpackage.anqw.d.f(defpackage.a.bJ(arrayList3, "None of ", " specified by Service Config are available.")));
    }

    @Override // defpackage.anop
    public final java.lang.String c() {
        return "auto_configured_internal";
    }

    @Override // defpackage.anop
    public final void d() {
    }

    @Override // defpackage.anop
    public final void e() {
    }
}
