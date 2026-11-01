package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bbb implements aonj {
    private final /* synthetic */ int $cid;
    public static final defpackage.bbb p = new defpackage.bbb(16);
    public static final defpackage.bbb o = new defpackage.bbb(15);
    public static final defpackage.bbb n = new defpackage.bbb(14);
    public static final defpackage.bbb m = new defpackage.bbb(12);
    public static final defpackage.bbb l = new defpackage.bbb(11);
    public static final defpackage.bbb k = new defpackage.bbb(10);
    public static final defpackage.bbb j = new defpackage.bbb(9);
    public static final defpackage.bbb i = new defpackage.bbb(8);
    public static final defpackage.bbb h = new defpackage.bbb(7);
    public static final defpackage.bbb g = new defpackage.bbb(6);
    public static final defpackage.bbb f = new defpackage.bbb(5);
    public static final defpackage.bbb e = new defpackage.bbb(4);
    public static final defpackage.bbb d = new defpackage.bbb(3);
    public static final defpackage.bbb c = new defpackage.bbb(2);
    public static final defpackage.bbb b = new defpackage.bbb(1);
    public static final defpackage.bbb a = new defpackage.bbb(0);

    public bbb(int i2) {
        this.$cid = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        java.lang.String strA = null;
        switch (this.$cid) {
            case 0:
                ((java.lang.Number) obj).intValue();
                break;
            case 1:
                long j2 = ((cqg) obj).a;
                float[] fArr = crp.a;
                long jE = cqg.e(j2, crp.x);
                return new aiv(cqg.a(jE), cqg.d(jE), cqg.c(jE), cqg.b(jE));
            case 2:
                return mni.aN(obj);
            case 3:
                android.view.View view = (android.view.View) obj;
                aooh.f(view, "child");
                android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
                if (viewGroup != null) {
                    return dzl.b(viewGroup).a();
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                defpackage.kdy kdyVar = (defpackage.kdy) obj;
                aooh.f(kdyVar, "it");
                aooh.f(kdyVar, "annotatedCallLogEntry");
                return new defpackage.kks(kdyVar);
            case 7:
                return alad.B(spn.a, aguo.b(((aguo) obj).a, 0), akzq.a());
            case 8:
                android.database.Cursor cursor = ((aguo) obj).a;
                vqf vqfVarF = abxl.F(abwd.a.m());
                vqfVarF.ah(aguo.a(cursor, 1));
                vqfVarF.aj(cursor.isNull(3) ? "" : aguo.a(cursor, 3));
                vqfVarF.ai(cursor.getLong(2));
                java.lang.String string = android.provider.ContactsContract.Contacts.getLookupUri(cursor.getLong(0), aguo.a(cursor, 4)).toString();
                aooh.e(string, "toString(...)");
                vqfVarF.ag(string);
                return vqfVarF.ad();
            case 9:
                android.database.Cursor cursor2 = ((aguo) obj).a;
                return aguo.a(cursor2, cursor2.getColumnIndex("date"));
            case 10:
                android.database.Cursor cursor3 = ((aguo) obj).a;
                return aguo.a(cursor3, cursor3.getColumnIndex("date"));
            case 11:
                android.database.Cursor cursor4 = ((aguo) obj).a;
                return aojh.a;
            case 12:
                apqr apqrVar = (apqr) obj;
                aooh.f(apqrVar, "callScope");
                qax qaxVarAh = ((qaj) apqrVar.a(qaj.class)).ah();
                qax.a.b().l("com/android/dialer/incall/latencyreport/CallScopeLatencyTracker", "onInCallFragmentFirstDrawnBlocked", 302, "CallScopeLatencyTracker.java").v("InCall first fragment timer cancelled as the screen couldn't draw");
                qaxVarAh.d.isPresent();
                qaxVarAh.e.b(ruc.aH);
                qaxVarAh.p = -1L;
                qaxVarAh.s = j$.util.Optional.empty();
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                android.database.Cursor cursor5 = ((aguo) obj).a;
                int columnIndex = cursor5.getColumnIndex("number");
                if (columnIndex == -1) {
                    throw new java.lang.IllegalStateException("Failed to find column index for CallLog.Calls.NUMBER");
                }
                if (!cursor5.isNull(columnIndex)) {
                    aopu[] aopuVarArr = aoou.a;
                    aooa aooaVar = new aooa(java.lang.String.class);
                    if (aooh.n(aooaVar, new aooa(java.lang.String.class))) {
                        strA = aguo.a(cursor5, columnIndex);
                        if (strA == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (aooh.n(aooaVar, new aooa(java.lang.Integer.TYPE))) {
                        strA = (java.lang.String) java.lang.Integer.valueOf(cursor5.getInt(columnIndex));
                    } else if (aooh.n(aooaVar, new aooa(byte[].class))) {
                        byte[] bArrB = aguo.b(cursor5, columnIndex);
                        if (bArrB == 0) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        strA = (java.lang.String) bArrB;
                    } else if (aooh.n(aooaVar, new aooa(java.lang.Short.TYPE))) {
                        strA = (java.lang.String) java.lang.Short.valueOf(cursor5.getShort(columnIndex));
                    } else if (aooh.n(aooaVar, new aooa(java.lang.Long.TYPE))) {
                        strA = (java.lang.String) java.lang.Long.valueOf(cursor5.getLong(columnIndex));
                    } else if (aooh.n(aooaVar, new aooa(java.lang.Float.TYPE))) {
                        strA = (java.lang.String) java.lang.Float.valueOf(cursor5.getFloat(columnIndex));
                    } else {
                        if (!aooh.n(aooaVar, new aooa(java.lang.Double.TYPE))) {
                            throw new java.lang.IllegalArgumentException("Cursor value not recognized: ".concat(java.lang.String.valueOf(new aooa(java.lang.String.class).c())));
                        }
                        strA = (java.lang.String) java.lang.Double.valueOf(cursor5.getDouble(columnIndex));
                    }
                }
                if (strA == null) {
                    return "";
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return snl.q(obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return snl.q(obj);
            default:
                return snl.q(obj);
        }
        return strA;
    }
}
