package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzv implements defpackage.aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public fzv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v26, types: [aowi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v30, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [dxw, java.lang.Object] */
    @Override // defpackage.aoxi
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object objA = ((defpackage.aowj) this.a).a(((defpackage.gbo) obj).f(), aolnVar);
            return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
        }
        if (i == 1) {
            avi aviVar = (defpackage.avj) obj;
            if (aviVar instanceof defpackage.avh) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(aviVar);
            } else if (aviVar instanceof avi) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(aviVar.a);
            } else if (aviVar instanceof defpackage.avd) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(aviVar);
            } else if (aviVar instanceof ave) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((ave) aviVar).a);
            } else if (aviVar instanceof defpackage.avl) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(aviVar);
            } else if (aviVar instanceof avm) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((avm) aviVar).a);
            } else if (aviVar instanceof avk) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((avk) aviVar).a);
            } else if (aviVar instanceof defpackage.avb) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).add(aviVar);
            } else if (aviVar instanceof avc) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((avc) aviVar).a);
            } else if (aviVar instanceof ava) {
                ((androidx.compose.runtime.snapshots.SnapshotStateList) this.a).remove(((ava) aviVar).a);
            }
            return defpackage.aojh.a;
        }
        if (i == 2) {
            this.a.b((defpackage.aojh) obj);
            return defpackage.aojh.a;
        }
        if (i == 3) {
            ((defpackage.gat) this.a).d.b((defpackage.fzd) obj);
            return defpackage.aojh.a;
        }
        if (i != 4) {
            if (i != 5) {
                this.a.accept((defpackage.rki) obj);
                return defpackage.aojh.a;
            }
            ((defpackage.aimw) defpackage.jzr.a.b().l("com/android/dialer/calllog/compose/data/CallLogPagingData", "<anonymous>$<anonymous>", 126, "CallLogPagingData.kt")).y("Received contact update notification from %s", (java.lang.String) obj);
            defpackage.jzr jzrVar = (defpackage.jzr) this.a;
            jzrVar.c.d();
            defpackage.jzt jztVar = jzrVar.f;
            if (jztVar != null) {
                jztVar.c();
            }
            return defpackage.aojh.a;
        }
        defpackage.jzr jzrVar2 = (defpackage.jzr) this.a;
        jzrVar2.h.e((java.util.List) obj);
        defpackage.jzt jztVar2 = jzrVar2.f;
        if (jztVar2 != null) {
            jztVar2.c();
        }
        defpackage.kad kadVar = jzrVar2.e;
        defpackage.aoov.an(kadVar.a, null, 0, new defpackage.dgz(kadVar, (defpackage.aoln) null, 19), 3);
        defpackage.kab kabVar = jzrVar2.d;
        defpackage.aoov.an(kabVar.a, null, 0, new defpackage.dgz(kabVar, (defpackage.aoln) null, 18), 3);
        jzrVar2.c.d();
        return defpackage.aojh.a;
    }
}
