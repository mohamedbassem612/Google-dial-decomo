package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class blu implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public blu(defpackage.aul aulVar, defpackage.ni niVar, int i) {
        this.$cid = i;
        this.b = aulVar;
        this.a = niVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aonj, java.lang.Object] */
    public final java.lang.Object invoke(cvr cvrVar, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object objD = defpackage.ro.d(cvrVar, new defpackage.blt((defpackage.blw) this.a, (aomy) this.b, (aoln) null, 0), aolnVar);
            return objD != aolu.a ? aojh.a : objD;
        }
        if (i == 1) {
            java.lang.Object objS = cvrVar.s(new defpackage.abor(aolnVar.u(), (defpackage.ni) this.a, ((defpackage.aul) this.b).e, (aoln) null, 1), aolnVar);
            aolu aoluVar = aolu.a;
            if (objS != aoluVar) {
                objS = aojh.a;
            }
            return objS != aoluVar ? aojh.a : objS;
        }
        abgq abgqVar = (abgq) this.a;
        java.lang.Object objD2 = defpackage.ro.d(cvrVar, new defpackage.abga(abgqVar, this.b, abgqVar.c.e * cvrVar.a() * 0.6f, null), aolnVar);
        aolu aoluVar2 = aolu.a;
        if (objD2 != aoluVar2) {
            objD2 = aojh.a;
        }
        return objD2 != aoluVar2 ? aojh.a : objD2;
    }

    public blu(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }
}
