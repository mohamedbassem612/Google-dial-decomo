package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lki implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lki(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, rlv] */
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            j$.util.Optional optional = ((lkk) this.b).b;
            optional.isPresent();
            return ((lkr) optional.orElseThrow()).c(this.a);
        }
        if (i == 1) {
            gat gatVar = (gat) this.b;
            gatVar.a.o(rmx.jH);
            return gatVar.j(this.a);
        }
        if (i == 2) {
            long j = this.a;
            java.lang.Object obj = this.b;
            java.lang.Long lValueOf = java.lang.Long.valueOf(j);
            tbm tbmVar = (tbm) obj;
            java.util.Map map = tbmVar.c;
            if (!map.containsKey(lValueOf)) {
                return aiql.z(j$.util.Optional.empty());
            }
            tbmVar.d.add(lValueOf);
            akzx akzxVar = (akzx) map.get(lValueOf);
            ahvr.bZ(akzxVar != null, "No RevelioMetrics.Builder for given callCreationTimeMillis");
            return ahvr.H(tbmVar.b(j), new soi(akzxVar, 19), tbmVar.e);
        }
        if (i == 3) {
            adag adagVar = new adag((byte[]) null);
            adagVar.n("SELECT call_history FROM timekeeper_call_history WHERE call_creation_time_millis = ?");
            adagVar.o(java.lang.Long.valueOf(this.a));
            return ((usj) this.b).b.a.F(new defpackage.jsh(adagVar.B(), 12));
        }
        if (i != 4) {
            long j2 = this.a;
            java.lang.Object obj2 = this.b;
            wys wysVar = (wys) obj2;
            wyr wyrVar = (wyr) wysVar.g.get(java.lang.Long.valueOf(j2));
            if (wyrVar == null) {
                return wysVar.b.a(j2);
            }
            ahrv ahrvVarG = ahrv.g(wyrVar.b());
            long jLongValue = ((java.lang.Long) wysVar.e.a()).longValue();
            ajcu ajcuVar = wysVar.d;
            return ahrv.g(ahrvVarG.j(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS, ajcuVar).e(java.util.concurrent.TimeoutException.class, new vmm(obj2, j2, 2), ajcuVar)).i(new defpackage.jwi(obj2, j2, 14), ajcuVar);
        }
        aigb aigbVar = new aigb(4);
        uvk uvkVar = (uvk) this.b;
        zzx zzxVar = uvkVar.d;
        ailj ailjVarK = zzxVar.k().f().k();
        while (ailjVarK.hasNext()) {
            long j3 = this.a;
            uty utyVar = (uty) ailjVarK.next();
            aigbVar.i(utyVar, ((utx) ((aoin) zzxVar.k().get(utyVar)).a()).h(j3));
        }
        aigf aigfVarE = aigbVar.e(true);
        return ahvr.aj(aigfVarE.c()).o(new tvg(aigfVarE, 17), uvkVar.b);
    }
}
