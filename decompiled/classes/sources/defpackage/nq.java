package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nq implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ nq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        android.content.Context context = null;
        switch (this.$cid) {
            case 0:
                defpackage.cbd cbdVar = nr.a;
                for (android.content.Context baseContext = (android.content.Context) defpackage.den.aa((defpackage.cje) obj, defpackage.dep.b); baseContext instanceof android.content.ContextWrapper; baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof android.app.Activity) {
                        context = baseContext;
                        return (android.app.Activity) context;
                    }
                }
                return (android.app.Activity) context;
            case 1:
                android.content.res.Resources resources = (android.content.res.Resources) obj;
                defpackage.aooh.f(resources, "resources");
                return java.lang.Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 2:
                return null;
            case 3:
                defpackage.ajl ajlVar = defpackage.aen.a;
                return defpackage.aen.b;
            case 4:
            case 9:
                return obj;
            case 5:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return bool;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.nf(bbb.b, new aib((defpackage.crn) obj, 1));
            case 10:
                ((java.lang.Integer) obj).intValue();
                defpackage.aonj aonjVar = defpackage.aga.a;
                break;
            case 11:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.aonj aonjVar2 = defpackage.aga.a;
                return java.lang.Integer.valueOf((-iIntValue) / 2);
            case 12:
                ((java.lang.Integer) obj).intValue();
                defpackage.aonj aonjVar3 = defpackage.aga.a;
                break;
            case 13:
                defpackage.aonj aonjVar4 = defpackage.aga.a;
                return new defpackage.aku(1.0f, 1500.0f, null);
            case 14:
                return defpackage.aga.f;
            case 15:
                return java.lang.Boolean.valueOf(((defpackage.afr) obj) == defpackage.afr.b);
            case 16:
                return defpackage.aojh.a;
            case 17:
                return defpackage.aojh.a;
            case 18:
                ((java.lang.Long) obj).longValue();
                return defpackage.aojh.a;
            case 19:
                defpackage.dfb.n((defpackage.diq) obj, dia.a);
                return defpackage.aojh.a;
            default:
                return new aon(((java.lang.Integer) obj).intValue());
        }
        return 0;
    }
}
