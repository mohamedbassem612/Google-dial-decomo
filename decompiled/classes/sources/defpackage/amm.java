package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class amm implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ defpackage.amn a;

    public amm(defpackage.amn amnVar) {
        this.a = amnVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.cvr cvrVar, defpackage.aoln aolnVar) {
        java.lang.Object objD = ro.d(cvrVar, new bxr(this.a, (defpackage.aoln) null, 1), aolnVar);
        return objD != defpackage.aolu.a ? defpackage.aojh.a : objD;
    }
}
