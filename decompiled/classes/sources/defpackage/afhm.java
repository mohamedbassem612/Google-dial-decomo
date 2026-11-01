package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afhm implements defpackage.afig {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afhm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [afii, java.lang.Object] */
    @Override // defpackage.afig
    public final java.lang.Object a(defpackage.adag adagVar) {
        defpackage.aigf aigfVarE;
        defpackage.aigf aigfVar = null;
        if (this.$cid != 0) {
            defpackage.aimz aimzVar = defpackage.jwu.a;
            defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
            adagVar2.n("SELECT call_creation_time_millis,calling_network_features FROM calling_network_properties WHERE last_modified_timestamp_millis > ?");
            adagVar2.o((java.lang.Long) this.a);
            android.database.Cursor cursorY = adagVar.y(adagVar2.B());
            try {
                if (cursorY.moveToFirst()) {
                    int columnIndexOrThrow = cursorY.getColumnIndexOrThrow("call_creation_time_millis");
                    int columnIndexOrThrow2 = cursorY.getColumnIndexOrThrow("calling_network_features");
                    defpackage.aigb aigbVar = new defpackage.aigb(4);
                    do {
                        aigbVar.i(java.lang.Long.valueOf(cursorY.getLong(columnIndexOrThrow)), ((defpackage.akzx) jvz.a.m().h(cursorY.getBlob(columnIndexOrThrow2), defpackage.akzq.a())).r());
                    } while (cursorY.moveToNext());
                    aigfVarE = aigbVar.e(true);
                } else {
                    aigfVarE = defpackage.aikj.b;
                }
                aigfVar = aigfVarE;
                if (cursorY != null) {
                    cursorY.close();
                }
            } catch (java.lang.Throwable th) {
                if (cursorY != null) {
                    try {
                        cursorY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } else {
            this.a.a(adagVar);
        }
        return aigfVar;
    }
}
