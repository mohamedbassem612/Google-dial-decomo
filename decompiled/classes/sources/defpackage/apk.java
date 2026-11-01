package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class apk implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ apk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.TRUE;
            case 1:
                float fFloatValue = ((java.lang.Float) obj).floatValue();
                defpackage.aiq aiqVar = api.a;
                return java.lang.Float.valueOf(fFloatValue / 2.0f);
            case 2:
                ((java.lang.Integer) obj).intValue();
                return java.lang.Float.valueOf(Float.NaN);
            case 3:
                return java.lang.Boolean.TRUE;
            case 4:
                return defpackage.aojh.a;
            case 5:
                return java.lang.Boolean.TRUE;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((java.lang.Long) obj).longValue();
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Float) obj).floatValue();
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                cvm cvmVar = (cvm) obj;
                boolean z = false;
                if (cvmVar.d && cvmVar.h) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                return java.lang.Boolean.TRUE;
            case 10:
                return java.lang.Boolean.TRUE;
            case 11:
                return java.lang.Boolean.TRUE;
            case 12:
                return java.lang.Boolean.TRUE;
            case 13:
                return defpackage.aojh.a;
            case 14:
                return defpackage.aojh.a;
            case 15:
                return defpackage.aojh.a;
            case 16:
                return ((baa) obj).g;
            case 17:
                return ((baa) obj).f;
            case 18:
                return defpackage.aojh.a;
            case 19:
                ((java.lang.Integer) obj).intValue();
                return null;
            default:
                return defpackage.aojh.a;
        }
    }
}
