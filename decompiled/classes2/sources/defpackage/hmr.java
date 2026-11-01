package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmr {
    public static final java.lang.String a(android.database.Cursor cursor, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return cursor.isNull(columnIndex) ? "" : aguo.a(cursor, columnIndex);
    }

    public static hsn b(android.content.Context context) {
        return (hsn) agab.aH(context, hsn.class);
    }

    public static int c(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static final /* synthetic */ defpackage.jhw d(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static int e(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return 14;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return 15;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return 16;
            case 16:
                return 17;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 18;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return 19;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return 20;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                return 21;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                return 22;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                return 23;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                return 24;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return 25;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                return 26;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
            default:
                return 0;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return 28;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return 29;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return 34;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return 35;
        }
    }

    public static android.graphics.drawable.Drawable f(android.content.Context context, int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    public static void g(defpackage.al alVar, defpackage.juq juqVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.jui(juqVar, 6));
        ahvr.d(alVar, ahtf.class, new defpackage.jui(juqVar, 7));
    }

    public static void h(defpackage.al alVar, defpackage.jum jumVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.jui(jumVar, 4));
        ahvr.d(alVar, ahtf.class, new defpackage.jui(jumVar, 5));
    }

    public static void i(defpackage.al alVar, defpackage.juh juhVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.jui(juhVar, 0));
        ahvr.d(alVar, ahte.class, new defpackage.jui(juhVar, 2));
        ahvr.d(alVar, ahtf.class, new defpackage.jui(juhVar, 3));
    }

    public static final void j(com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity callerIdFeedbackDialogActivity, int i, java.lang.String str, java.lang.String str2) {
        aooh.f(callerIdFeedbackDialogActivity, "<this>");
        android.content.Intent intent = new android.content.Intent();
        if (str != null) {
            intent.putExtra("snackbar_message", str);
        }
        if (str2 != null) {
            intent.putExtra("suggested_caller_id", str2);
        }
        callerIdFeedbackDialogActivity.setResult(i, intent);
        callerIdFeedbackDialogActivity.finish();
    }

    public static void k(defpackage.al alVar, defpackage.jub jubVar) {
        ahvr.d(alVar, ahtd.class, new defpackage.hwo(jubVar, 19));
        ahvr.d(alVar, ahte.class, new defpackage.hwo(jubVar, 20));
        ahvr.d(alVar, ahtf.class, new defpackage.jui(jubVar, 1));
    }

    public static final /* synthetic */ defpackage.jhw l(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.jhw(akzxVar);
    }

    public static final /* synthetic */ defpackage.ni m(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }

    public static final /* synthetic */ defpackage.ni n(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ni(akzxVar);
    }
}
