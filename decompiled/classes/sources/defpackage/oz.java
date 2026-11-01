package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oz extends defpackage.or {
    @Override // defpackage.or
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(strArr, "input");
        return defpackage.den.bH(strArr);
    }

    @Override // defpackage.or
    public final /* synthetic */ oq getSynchronousResult(android.content.Context context, java.lang.Object obj) {
        java.lang.String[] strArr = (java.lang.String[]) obj;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(strArr, "input");
        if (strArr.length == 0) {
            return new oq(defpackage.aokd.a);
        }
        for (java.lang.String str : strArr) {
            if (defpackage.dvx.c(context, str) != 0) {
                return null;
            }
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(strArr.length), 16));
        for (java.lang.String str2 : strArr) {
            defpackage.aoiu aoiuVar = new defpackage.aoiu(str2, java.lang.Boolean.TRUE);
            linkedHashMap.put(aoiuVar.a, aoiuVar.b);
        }
        return new oq(linkedHashMap);
    }

    @Override // defpackage.or
    public final /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        if (i != -1 || intent == null) {
            return defpackage.aokd.a;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return defpackage.aokd.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(java.lang.Boolean.valueOf(i2 == 0));
        }
        return defpackage.ajsz.aR(defpackage.ajsz.cc(defpackage.ajsz.cR(stringArrayExtra), arrayList));
    }
}
