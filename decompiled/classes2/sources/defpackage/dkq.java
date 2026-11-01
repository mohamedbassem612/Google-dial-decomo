package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class dkq implements aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ dkq(int i) {
        this.$cid = i;
    }

    public final java.lang.Object a(java.lang.Object obj) throws java.io.IOException {
        java.lang.String strValueOf;
        int i = 1;
        switch (this.$cid) {
            case 0:
                aooh.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(0);
                dpb dpbVar = (aooh.n(obj2, java.lang.Boolean.FALSE) || obj2 == null) ? null : (dpb) defpackage.dkr.e.a(obj2);
                aooh.c(dpbVar);
                java.lang.Object obj3 = list.get(1);
                java.lang.Boolean bool = obj3 != null ? (java.lang.Boolean) obj3 : null;
                int i2 = dpbVar.a;
                aooh.c(bool);
                return new dpc(i2, bool.booleanValue());
            case 1:
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new doo(((java.lang.Integer) obj).intValue());
            case 2:
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new dpb(((java.lang.Integer) obj).intValue());
            case 3:
                return mni.aQ(obj);
            case 4:
                return mni.aQ(obj);
            case 5:
                defpackage.dqc dqcVar = (defpackage.dqc) obj;
                dqcVar.getHandler().post(new defpackage.drn(dqcVar.s, i));
                return aojh.a;
            case 6:
                return aojh.a;
            case 7:
                return mni.aN(obj);
            case 8:
                return aojh.a;
            case 9:
                dfb.c((diq) obj);
                return aojh.a;
            case 10:
                cbd cbdVar = defpackage.dra.a;
                dip dipVar = din.y;
                aojh aojhVar = aojh.a;
                ((diq) obj).a(dipVar, aojhVar);
                return aojhVar;
            case 11:
                ((java.lang.Long) obj).longValue();
                return aojh.a;
            case 12:
                return mni.aN(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                defpackage.drq drqVar = (defpackage.drq) obj;
                if (drqVar.isAttachedToWindow()) {
                    drqVar.n();
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                if (((android.content.Context) obj) == null) {
                    aooh.i("it");
                }
                return aokc.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                aooh.f(entry, "entry");
                java.lang.Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    aooh.f(bArr, "<this>");
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    aooh.f(bArr, "<this>");
                    sb.append((java.lang.CharSequence) "[");
                    int i3 = 0;
                    for (byte b : bArr) {
                        i3++;
                        if (i3 > 1) {
                            sb.append((java.lang.CharSequence) ", ");
                        }
                        sb.append((java.lang.CharSequence) java.lang.String.valueOf((int) b));
                    }
                    sb.append((java.lang.CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = java.lang.String.valueOf(entry.getValue());
                }
                return "  " + ((efw) entry.getKey()).a + " = " + strValueOf;
            case 16:
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.yz((ccp) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                defpackage.ell ellVar = (defpackage.ell) obj;
                aooh.f(ellVar, "it");
                return "[" + ellVar + ']';
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                android.content.Context context = (android.content.Context) obj;
                aooh.f(context, "it");
                if (context instanceof android.content.ContextWrapper) {
                    return ((android.content.ContextWrapper) context).getBaseContext();
                }
                return null;
            default:
                eoq eoqVar = (eoq) obj;
                aooh.f(eoqVar, "$this$initializer");
                return new defpackage.fwq(env.a(eoqVar));
        }
    }
}
