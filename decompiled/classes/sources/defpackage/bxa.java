package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bxa implements defpackage.cbm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public bxa(android.content.Context context, aciu aciuVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = context;
        this.b = aciuVar;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [aciu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [emx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [emw, java.lang.Object] */
    @Override // defpackage.cbm
    public final void a() {
        android.app.Activity activity;
        int i = this.$cid;
        if (i == 0) {
            this.a.a();
            this.b.P().d(this.c);
            return;
        }
        if (i == 1) {
            java.lang.Object obj = this.a;
            ((androidx.compose.runtime.snapshots.SnapshotStateList) this.b).remove(obj);
            ((defpackage.aex) this.c).d.i(obj);
            return;
        }
        if (i == 2) {
            this.b.P().d(this.c);
            eol eolVar = (eol) ((defpackage.aoot) this.a).a;
            if (eolVar != null) {
                eolVar.a();
                return;
            }
            return;
        }
        if (i == 3) {
            java.lang.Object obj2 = this.a;
            java.lang.Object obj3 = this.b;
            ((fxg) obj2).h((fvs) obj3);
            ((androidx.compose.runtime.snapshots.SnapshotStateList) this.c).remove(obj3);
            return;
        }
        java.lang.Object baseContext = this.c;
        while (true) {
            if (!(baseContext instanceof android.content.ContextWrapper)) {
                activity = null;
                break;
            } else if (baseContext instanceof android.app.Activity) {
                activity = (android.app.Activity) baseContext;
                break;
            } else {
                baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext();
                defpackage.aooh.e(baseContext, "getBaseContext(...)");
            }
        }
        if (activity == null || !activity.isChangingConfigurations()) {
            this.b.b((java.lang.String) this.a);
        }
    }

    public bxa(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, java.lang.Object obj, defpackage.aex aexVar, int i) {
        this.$cid = i;
        this.b = snapshotStateList;
        this.a = obj;
        this.c = aexVar;
    }

    public bxa(defpackage.emx emxVar, defpackage.emv emvVar, defpackage.aoot aootVar, int i) {
        this.$cid = i;
        this.b = emxVar;
        this.c = emvVar;
        this.a = aootVar;
    }

    public bxa(java.lang.Object obj, defpackage.emx emxVar, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = emxVar;
        this.c = obj2;
    }
}
