package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoxx implements defpackage.aoxi {
    final /* synthetic */ defpackage.aoor a;
    final /* synthetic */ int b;
    final /* synthetic */ defpackage.aoxi c;

    public aoxx(defpackage.aoor aoorVar, int i, defpackage.aoxi aoxiVar) {
        this.a = aoorVar;
        this.b = i;
        this.c = aoxiVar;
    }

    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.aoor aoorVar = this.a;
        int i = aoorVar.a;
        if (i >= this.b) {
            java.lang.Object objA = this.c.a(obj, aolnVar);
            if (objA == defpackage.aolu.a) {
                return objA;
            }
        } else {
            aoorVar.a = i + 1;
        }
        return defpackage.aojh.a;
    }
}
