package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ons implements defpackage.kfh {
    public final defpackage.ajct a;
    public final defpackage.onv b;
    public final defpackage.ajct c;
    public final java.util.concurrent.atomic.AtomicLong d = new java.util.concurrent.atomic.AtomicLong();
    public final defpackage.rsr e;
    private final defpackage.kaw f;
    private final defpackage.aogc g;

    public ons(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.aogc aogcVar, defpackage.kaw kawVar, defpackage.onv onvVar, defpackage.rsr rsrVar) {
        this.a = ajctVar;
        this.c = ajctVar2;
        this.g = aogcVar;
        this.f = kawVar;
        this.b = onvVar;
        this.e = rsrVar;
    }

    @Override // defpackage.kfh
    public final defpackage.aenj a() {
        return new defpackage.aenj("FidesCallDataSource");
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq b(defpackage.kfj kfjVar) {
        defpackage.ajcq ajcqVarO;
        defpackage.ajcq ajcqVarH;
        defpackage.ajcq ajcqVarI;
        defpackage.kfk kfkVar = (defpackage.kfk) kfjVar;
        java.util.Map map = kfkVar.a;
        defpackage.ajcq[] ajcqVarArr = new defpackage.ajcq[3];
        boolean zIsEmpty = map.isEmpty();
        java.util.Map map2 = kfkVar.b;
        if (zIsEmpty && map2.isEmpty()) {
            ajcqVarH = defpackage.ajcm.a;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(map.entrySet());
            arrayList.addAll(map2.entrySet());
            defpackage.aihd aihdVar = (defpackage.aihd) j$.util.Collection.-EL.stream(arrayList).map(new old(10)).filter(new mif(4)).collect(defpackage.aido.b);
            defpackage.onv onvVar = this.b;
            if (aihdVar.isEmpty()) {
                ajcqVarO = defpackage.aiql.z(defpackage.aikj.b);
            } else {
                java.lang.Iterable<java.util.List> iterableBf = defpackage.ahvr.bf(aihdVar, 999);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.util.List list : iterableBf) {
                    defpackage.adag adagVar = new defpackage.adag((byte[]) null);
                    adagVar.n("SELECT call_creation_time_millis,fides_details FROM fides WHERE call_creation_time_millis IN (?");
                    java.util.Iterator it = list.iterator();
                    adagVar.o((java.lang.Long) it.next());
                    while (it.hasNext()) {
                        adagVar.n(",?");
                        adagVar.o((java.lang.Long) it.next());
                    }
                    adagVar.n(")");
                    arrayList2.add(onvVar.a(adagVar.B()));
                }
                ajcqVarO = defpackage.ahvr.aj(arrayList2).o(new omj(arrayList2, 4), onvVar.a);
            }
            ajcqVarH = defpackage.ahvr.H(ajcqVarO, new mjl(arrayList, 12), this.c);
        }
        ajcqVarArr[0] = ajcqVarH;
        java.util.Set set = kfkVar.c;
        if (set.isEmpty()) {
            ajcqVarI = defpackage.ajcm.a;
        } else {
            defpackage.ajcq ajcqVarZ = set.isEmpty() ? defpackage.aiql.z(defpackage.aike.a) : defpackage.ahvr.H(this.e.ab(set), new onp(0), this.c);
            defpackage.onv onvVar2 = this.b;
            j$.util.Objects.requireNonNull(onvVar2);
            ajcqVarI = defpackage.ahvr.I(ajcqVarZ, new ocj(onvVar2, 4), defpackage.ajbm.INSTANCE);
        }
        ajcqVarArr[1] = ajcqVarI;
        defpackage.ajcq ajcqVarBk = this.g.bk();
        onp onpVar = new onp(2);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        defpackage.ajcq ajcqVarH2 = defpackage.ahvr.H(ajcqVarBk, onpVar, ajbmVar);
        ajcqVarArr[2] = defpackage.ahrv.g(ajcqVarH2).i(new ocj(this, 3), ajbmVar).i(new juo(this, ajcqVarH2, kfjVar, 14, (byte[]) null), this.c);
        return defpackage.ahvr.ak(ajcqVarArr).o(new onq(0), ajbmVar);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq d() {
        return defpackage.aiql.z(java.lang.Boolean.FALSE);
    }

    @Override // defpackage.kfh
    public final defpackage.ajcq e() {
        long j = this.d.get();
        return j > 0 ? this.f.p(this.g.bl(new jwe(j, 5))) : defpackage.ajcm.a;
    }
}
