package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaaq extends defpackage.zyz {
    private final aify b;

    public aaaq(java.util.List list) {
        this.b = aify.n(list);
    }

    @Override // defpackage.zyz
    public final ajcq a(defpackage.zzs zzsVar) {
        aify aifyVar = this.b;
        aift aiftVarD = aify.d(aifyVar.size());
        int size = aifyVar.size();
        for (int i = 0; i < size; i++) {
            aiftVarD.i(((defpackage.zyz) aifyVar.get(i)).a(zzsVar));
        }
        return ajan.f(aiql.v(aiftVarD.h()), new defpackage.ymu(7), ajbm.a);
    }

    @Override // defpackage.zyz
    public final amtz b() {
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(this.b).flatMap(new defpackage.yoz(18)).collect(aido.a);
        if (aifyVar.isEmpty()) {
            return null;
        }
        akzx akzxVarM = amtz.a.m();
        int size = aifyVar.size();
        for (int i = 0; i < size; i++) {
            akzxVarM.z((amtz) aifyVar.get(i));
        }
        return akzxVarM.p();
    }
}
