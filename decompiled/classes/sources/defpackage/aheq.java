package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aheq implements defpackage.ajbc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aheq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aonn, java.lang.Object] */
    @Override // defpackage.ajbc
    public final java.lang.Object a(defpackage.ajyk ajykVar, java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ahbq ahbqVar = defpackage.ahew.k;
            defpackage.aooh.f(ajykVar, "closer");
            return this.a.a(ajykVar, obj);
        }
        if (i != 1) {
            defpackage.ahbq ahbqVar2 = defpackage.ahew.k;
            defpackage.aooh.f(ajykVar, "closer");
            return this.a.a(ajykVar, obj);
        }
        android.database.Cursor cursor = (android.database.Cursor) obj;
        java.util.HashMap map = new java.util.HashMap(defpackage.ahvr.aA(cursor.getCount()));
        while (cursor.moveToNext()) {
            map.put(cursor.getString(cursor.getColumnIndexOrThrow("key")), akmr.q(cursor.getBlob(cursor.getColumnIndexOrThrow("value")), (defpackage.albh) ((defpackage.ache) this.a).a.a()));
        }
        return map;
    }
}
