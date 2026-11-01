package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoaq implements defpackage.anom {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ defpackage.anon b;

    public aoaq(defpackage.aoat aoatVar, defpackage.anok anokVar, int i) {
        this.$cid = i;
        this.a = anokVar;
        j$.util.Objects.requireNonNull(aoatVar);
        this.b = aoatVar;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    @Override // defpackage.anom
    public final void a(defpackage.anmn anmnVar) {
        anmm anmmVar;
        defpackage.anol anoeVar;
        defpackage.anoe anoeVar2;
        anmm anmmVar2;
        if (this.$cid == 0) {
            defpackage.anon anonVar = this.b;
            defpackage.aoat aoatVar = (defpackage.aoat) anonVar;
            defpackage.anok anokVar = aoatVar.h;
            java.lang.Object obj = this.a;
            if (obj != anokVar || (anmmVar = anmnVar.a) == anmm.e) {
                return;
            }
            anmm anmmVar3 = anmm.c;
            if (anmmVar == anmmVar3 || anmmVar == anmm.d) {
                aoatVar.g.e();
            }
            if (aoatVar.i == anmmVar3) {
                if (anmmVar == anmm.a) {
                    return;
                }
                if (anmmVar == anmm.d) {
                    anonVar.c();
                    return;
                }
            }
            int iOrdinal = anmmVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    anoeVar2 = new defpackage.anoe(defpackage.anoh.e((defpackage.anok) obj));
                } else if (iOrdinal == 2) {
                    anoeVar2 = new defpackage.anoe(defpackage.anoh.b(anmnVar.b));
                } else {
                    if (iOrdinal != 3) {
                        throw new java.lang.IllegalArgumentException("Unsupported state:".concat(anmmVar.toString()));
                    }
                    anoeVar = new defpackage.aoas(aoatVar);
                }
                anoeVar = anoeVar2;
            } else {
                anoeVar = new defpackage.anoe(defpackage.aoat.f);
            }
            aoatVar.e(anmmVar, anoeVar);
            return;
        }
        java.lang.Object obj2 = this.a;
        defpackage.aoan aoanVar = (defpackage.aoan) obj2;
        defpackage.anok anokVar2 = aoanVar.a;
        defpackage.anon anonVar2 = this.b;
        java.net.SocketAddress socketAddressK = defpackage.aoap.k(anokVar2);
        defpackage.aoap aoapVar = (defpackage.aoap) anonVar2;
        java.util.Map map = aoapVar.j;
        if (obj2 != map.get(socketAddressK) || (anmmVar2 = anmnVar.a) == anmm.e) {
            return;
        }
        anmm anmmVar4 = anmm.d;
        if (anmmVar2 == anmmVar4 && aoanVar.b == anmm.b) {
            aoapVar.i.e();
        }
        aoanVar.b(anmmVar2);
        anmm anmmVar5 = aoapVar.n;
        anmm anmmVar6 = anmm.c;
        if (anmmVar5 == anmmVar6 || aoapVar.o == anmmVar6) {
            if (anmmVar2 == anmm.a) {
                return;
            }
            if (anmmVar2 == anmmVar4) {
                anonVar2.c();
                return;
            }
        }
        int iOrdinal2 = anmmVar2.ordinal();
        if (iOrdinal2 == 0) {
            anmm anmmVar7 = anmm.a;
            aoapVar.n = anmmVar7;
            if (aoapVar.h || aoapVar.k.f()) {
                defpackage.aoak aoakVar = aoapVar.k;
                if (aoakVar.f() && !map.containsKey(aoakVar.b())) {
                    aoapVar.k.g(defpackage.aoap.k(anokVar2));
                }
            } else {
                aoapVar.k.g(defpackage.aoap.k(anokVar2));
            }
            aoapVar.h(anmmVar7, new defpackage.anoe(defpackage.anoh.d("pick_first: attempting to connect")));
            return;
        }
        if (iOrdinal2 == 1) {
            defpackage.apjb apjbVar = aoapVar.s;
            if (apjbVar != null) {
                apjbVar.j();
                aoapVar.s = null;
            }
            aoapVar.q = null;
            aoapVar.f();
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                defpackage.anok anokVar3 = ((defpackage.aoan) it.next()).a;
                if (!anokVar3.equals(anokVar2)) {
                    anokVar3.b();
                }
            }
            map.clear();
            anmm anmmVar8 = anmm.b;
            aoanVar.b(anmmVar8);
            map.put(defpackage.aoap.k(anokVar2), obj2);
            aoapVar.k.g(defpackage.aoap.k(anokVar2));
            aoapVar.n = anmmVar8;
            aoapVar.i(aoanVar);
            return;
        }
        if (iOrdinal2 != 2) {
            if (iOrdinal2 != 3) {
                throw new java.lang.IllegalArgumentException("Unsupported state:".concat(anmmVar2.toString()));
            }
            aoapVar.k.c();
            aoapVar.n = anmmVar4;
            aoapVar.h(anmmVar4, new defpackage.aoam(aoapVar, aoapVar));
            return;
        }
        defpackage.aoak aoakVar2 = aoapVar.k;
        if (aoakVar2.f() && map.get(aoakVar2.b()) == obj2) {
            if (aoakVar2.e()) {
                aoapVar.f();
                anonVar2.c();
            } else if (map.size() >= aoakVar2.a()) {
                aoapVar.g();
            } else {
                aoakVar2.c();
                anonVar2.c();
            }
        }
        if (map.size() >= aoakVar2.a()) {
            java.util.Iterator it2 = map.values().iterator();
            while (it2.hasNext()) {
                if (!((defpackage.aoan) it2.next()).c) {
                    return;
                }
            }
            aoapVar.n = anmmVar6;
            aoapVar.h(anmmVar6, new defpackage.anoe(defpackage.anoh.b(anmnVar.b)));
            int i = aoapVar.l + 1;
            aoapVar.l = i;
            if (i >= aoakVar2.a() || aoapVar.m) {
                aoapVar.m = false;
                aoapVar.l = 0;
                aoapVar.i.e();
            }
        }
    }

    public /* synthetic */ aoaq(defpackage.aoap aoapVar, defpackage.aoan aoanVar, int i) {
        this.$cid = i;
        this.b = aoapVar;
        this.a = aoanVar;
    }
}
