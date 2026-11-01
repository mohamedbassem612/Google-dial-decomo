package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rph implements defpackage.agyz {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public rph(rvw rvwVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(rvwVar);
        this.a = rvwVar;
    }

    @Override // defpackage.agyz
    public final agxk a() {
        int i = this.$cid;
        if (i == 0) {
            return rpl.a;
        }
        if (i == 1) {
            return iep.d;
        }
        if (i != 2) {
            return i != 3 ? rvw.a : defpackage.rsz.a;
        }
        return defpackage.rqw.a;
    }

    /* JADX WARN: Type inference failed for: r9v16, types: [aoss, java.lang.Object] */
    @Override // defpackage.agyz
    public final ajcq b() {
        int i = this.$cid;
        int i2 = 3;
        if (i == 0) {
            rpj rpjVar = (rpj) this.a;
            return aosv.F(rpjVar.b, 0, new defpackage.roy(rpjVar, (aoln) null, 3, (byte[]) null), 3);
        }
        int i3 = 2;
        if (i == 1) {
            iep iepVar = (iep) this.a;
            return aosv.F(iepVar.e, 0, new icp(iepVar, (aoln) null, 2), 3);
        }
        if (i == 2) {
            return aiql.z(((defpackage.rqw) this.a).b.a);
        }
        java.lang.Object obj = this.a;
        int i4 = 5;
        if (i == 3) {
            defpackage.qhr qhrVar = (defpackage.qhr) obj;
            return aosv.F((aoss) qhrVar.b, 0, new defpackage.roy(qhrVar, (aoln) null, 5), 3);
        }
        rvw rvwVar = (rvw) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) rvwVar.c.k().f());
        j$.util.List.-EL.sort(arrayList, (java.util.Comparator) null);
        ajcq ajcqVarV = aiql.v((java.util.ArrayList) j$.util.Collection.-EL.stream(arrayList).map(new defpackage.pei(obj, 14)).collect(j$.util.stream.Collectors.toCollection(new defpackage.rqc(i3))));
        defpackage.rht rhtVar = new defpackage.rht(i3);
        ajct ajctVar = rvwVar.b;
        ajcq ajcqVarH = ahvr.H(ajcqVarV, rhtVar, ajctVar);
        aigf aigfVarF = aitt.k(rvwVar.d.k()).c(new defpackage.rat(i4)).f();
        ajcq ajcqVarH2 = ahvr.H(ahvr.aj(aigfVarF.c()).o(new raj(aigfVarF, 9), ajctVar), new defpackage.rht(i2), ajctVar);
        return ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarH2}).o(new defpackage.qfb(ajcqVarH, ajcqVarH2, 11), ajctVar);
    }

    public rph(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
