package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abkw implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ defpackage.aonj a;
    final /* synthetic */ defpackage.aomy b;
    final /* synthetic */ defpackage.aomy c;
    final /* synthetic */ defpackage.aonn d;
    final /* synthetic */ defpackage.agii e;

    public abkw(defpackage.aonj aonjVar, defpackage.agii agiiVar, defpackage.aomy aomyVar, defpackage.aomy aomyVar2, defpackage.aonn aonnVar) {
        this.a = aonjVar;
        this.e = agiiVar;
        this.b = aomyVar;
        this.c = aomyVar2;
        this.d = aonnVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.cvr cvrVar, defpackage.aoln aolnVar) {
        defpackage.aonj aonjVar = this.a;
        defpackage.agii agiiVar = this.e;
        java.lang.Object objD = ro.d(cvrVar, new ard(new abdu(aonjVar, agiiVar, 6), new xtu(this.b, agiiVar, 5, (byte[]) null), new xtu(this.c, agiiVar, 6, (byte[]) null), new zjn(this.d, agiiVar, 9), (defpackage.aoln) null), aolnVar);
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (objD != aoluVar) {
            objD = defpackage.aojh.a;
        }
        return objD != aoluVar ? defpackage.aojh.a : objD;
    }
}
