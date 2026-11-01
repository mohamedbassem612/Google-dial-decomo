package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abgg implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public abgg(abgx abgxVar, defpackage.abfs abfsVar, defpackage.abgq abgqVar, int i) {
        this.$cid = i;
        this.a = abgxVar;
        this.b = abfsVar;
        this.c = abgqVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ccp, java.lang.Object] */
    public final java.lang.Object invoke(cvr cvrVar, aoln aolnVar) {
        if (this.$cid == 0) {
            java.lang.Object objE = atv.e(cvrVar, new defpackage.abgf((abgx) this.a, null), new defpackage.abdu(this.b, this.c, 2, null), aolnVar, 3);
            return objE != aolu.a ? aojh.a : objE;
        }
        java.lang.Object objM = aosv.m(new defpackage.abos(cvrVar, (aonj) new mkm(defpackage.abew.b(this.c), defpackage.abew.a(this.b), this.a, 12, (char[]) null), new abow(cvrVar), (aoln) null, 0), aolnVar);
        aolu aoluVar = aolu.a;
        if (objM != aoluVar) {
            objM = aojh.a;
        }
        if (objM != aoluVar) {
            objM = aojh.a;
        }
        return objM != aoluVar ? aojh.a : objM;
    }

    public abgg(java.util.List list, ccp ccpVar, ccp ccpVar2, int i) {
        this.$cid = i;
        this.a = list;
        this.c = ccpVar;
        this.b = ccpVar2;
    }
}
