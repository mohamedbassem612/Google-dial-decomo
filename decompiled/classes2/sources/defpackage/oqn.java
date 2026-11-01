package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oqn implements defpackage.oqk {
    private final aprf a;

    public oqn(aprf aprfVar) {
        this.a = aprfVar;
    }

    @Override // defpackage.oqk
    public final ajcq a() {
        aift aiftVar = new aift(4);
        java.util.List listH = this.a.h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(((akzc) it.next()).A());
        }
        aiftVar.i(new dxy("dialer_experiment_id", arrayList.toString()));
        return aiql.z(aiftVar.h());
    }
}
