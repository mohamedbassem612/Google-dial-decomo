package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acna {
    public final java.util.List c;
    public final android.util.SparseIntArray d;
    private final int g;
    public final aiwd a = aclm.a();
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.List e = new java.util.ArrayList();
    public final android.util.SparseIntArray f = new android.util.SparseIntArray();

    public acna(int i, int i2) {
        this.g = i;
        this.c = new java.util.ArrayList(i2);
        this.d = new android.util.SparseIntArray(i2);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Set] */
    final acmi a(defpackage.acmd acmdVar, int i) {
        acmdVar.b = this.g;
        java.util.List list = this.c;
        int size = list.size();
        int iD = acmdVar.d();
        akzz akzzVar = acmdVar.c;
        akzzVar.u();
        acmi acmiVar = akzzVar.b;
        acmi acmiVar2 = acmi.a;
        int i2 = iD - 1;
        if (iD == 0) {
            throw null;
        }
        acmiVar.e = i2;
        acmiVar.b |= 2;
        aiwd aiwdVar = this.a;
        aiwc aiwcVar = akzzVar.b.d;
        if (aiwcVar == null) {
            aiwcVar = aiwc.a;
        }
        akzx akzxVarP = aiwcVar.p();
        akzxVarP.u();
        aiwc aiwcVar2 = akzxVarP.b;
        j$.util.Objects.requireNonNull(aiwdVar);
        aiwcVar2.e = aiwdVar;
        aiwcVar2.b |= 2048;
        akzxVarP.u();
        aiwc aiwcVar3 = akzxVarP.b;
        aiwcVar3.b |= 1;
        aiwcVar3.c = size;
        aiwc aiwcVarP = akzxVarP.p();
        akzzVar.u();
        acmi acmiVar3 = akzzVar.b;
        j$.util.Objects.requireNonNull(aiwcVarP);
        acmiVar3.d = aiwcVarP;
        acmiVar3.b |= 1;
        ?? r2 = acmdVar.d.a;
        if (!r2.isEmpty()) {
            if (android.util.Log.isLoggable("GIL", 2)) {
                android.util.Log.v("GIL", "ImpressionSet: ".concat(acmdVar.toString()));
            }
            for (defpackage.aprf aprfVar : r2) {
            }
        }
        acmi acmiVarA = acmdVar.a();
        list.add(acmiVarA);
        this.d.append(size, i);
        return acmiVarA;
    }

    final void b(defpackage.acnj acnjVar) {
        if (acnjVar.b == 1) {
            ahvr.bM(this.d.valueAt(acnjVar.c()) == -1);
        }
        this.b.add(acnjVar);
    }
}
