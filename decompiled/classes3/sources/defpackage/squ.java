package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class squ implements java.util.concurrent.Callable {
    public final /* synthetic */ sqv a;
    public final /* synthetic */ aihd b;
    public final /* synthetic */ java.util.function.Predicate c;

    public /* synthetic */ squ(sqv sqvVar, aihd aihdVar, java.util.function.Predicate predicate) {
        this.a = sqvVar;
        this.b = aihdVar;
        this.c = predicate;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        java.lang.String[] strArr = (java.lang.String[]) j$.util.Collection.-EL.stream(this.b).map(new defpackage.rat(11)).toArray(new via(1));
        rsr rsrVar = new rsr();
        rsrVar.aC(new kaw("normalized_number").aG(strArr));
        rsr rsrVarAB = rsrVar.aB();
        java.lang.Object obj = rsrVarAB.b;
        java.lang.String[] strArr2 = (java.lang.String[]) rsrVarAB.a;
        java.lang.String str = (java.lang.String) obj;
        android.database.Cursor cursorB = this.a.b.b(sro.a, new java.lang.String[]{"phone_lookup_info"}, str, strArr2, (java.lang.String) null);
        java.util.function.Predicate predicate = this.c;
        try {
            if (cursorB == null) {
                sqv.a.d().i(zct.b).l("com/android/dialer/phonelookup/cp2/MissingPermissionsOperations", "isDirtyForMissingPermissions", 100, "MissingPermissionsOperations.java").v("null cursor");
                return java.lang.Boolean.FALSE;
            }
            if (cursorB.moveToFirst()) {
                int columnIndexOrThrow = cursorB.getColumnIndexOrThrow("phone_lookup_info");
                do {
                    try {
                        if (aa$.ExternalSyntheticApiModelOutline1.m$1(predicate, (defpackage.spn) alad.B(defpackage.spn.a, cursorB.getBlob(columnIndexOrThrow), akzq.a()))) {
                            java.lang.Boolean bool = java.lang.Boolean.TRUE;
                            cursorB.close();
                            return bool;
                        }
                    } catch (alaz e) {
                        throw new java.lang.IllegalStateException((java.lang.Throwable) e);
                    }
                } while (cursorB.moveToNext());
            }
            cursorB.close();
            return java.lang.Boolean.FALSE;
        } catch (java.lang.Throwable th) {
            if (cursorB == null) {
                throw th;
            }
            try {
                cursorB.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
