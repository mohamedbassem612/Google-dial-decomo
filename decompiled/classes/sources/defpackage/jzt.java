package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzt extends defpackage.gcp {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/calllog/compose/data/CallLogPagingSource");
    private final java.util.List c;
    private final defpackage.kal d;

    public jzt(java.util.List list, defpackage.kal kalVar) {
        if (list == null) {
            defpackage.aooh.i("rows");
        }
        if (kalVar == null) {
            defpackage.aooh.i("realtimeDataRepository");
        }
        this.c = list;
        this.d = kalVar;
    }

    @Override // defpackage.gcp
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.gcq gcqVar) {
        defpackage.aooh.f(gcqVar, "state");
        java.lang.Integer num = gcqVar.b;
        if (num == null) {
            return null;
        }
        int i = gcqVar.c.a;
        int iIntValue = num.intValue();
        return java.lang.Integer.valueOf(iIntValue - (iIntValue % i));
    }

    @Override // defpackage.gcp
    public final java.lang.Object b(defpackage.gcl gclVar, defpackage.aoln aolnVar) {
        java.lang.Integer num;
        try {
            java.lang.Integer num2 = (java.lang.Integer) gclVar.a();
            int iIntValue = num2 != null ? num2.intValue() : 0;
            int i = iIntValue < 0 ? 0 : iIntValue;
            int i2 = gclVar.b;
            int i3 = i + i2;
            java.util.List list = this.c;
            int size = list.size();
            if (i3 > size) {
                i3 = size;
            }
            java.util.List listSubList = i < list.size() ? list.subList(i, i3) : defpackage.aokc.a;
            if (!listSubList.isEmpty()) {
                defpackage.kal kalVar = this.d;
                if (listSubList == null) {
                    defpackage.aooh.i("rows");
                }
                if (!listSubList.isEmpty()) {
                    defpackage.aoov.an(kalVar.b, null, 0, new jpj(kalVar, listSubList, (defpackage.aoln) null, 9), 3);
                }
            }
            if (i == 0) {
                num = null;
            } else {
                int i4 = i - i2;
                num = new java.lang.Integer(i4 >= 0 ? i4 : 0);
            }
            return new defpackage.gco(listSubList, num, i3 != list.size() ? new java.lang.Integer(i3) : null, i, list.size() - i3);
        } catch (java.lang.Exception e) {
            ((defpackage.aimw) ((defpackage.aimw) b.c()).k(e).l("com/android/dialer/calllog/compose/data/CallLogPagingSource", "load", 60, "CallLogPagingSource.kt")).v("can't load the paginated call log data");
            return new gcm(e);
        }
    }
}
