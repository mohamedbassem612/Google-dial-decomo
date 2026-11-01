package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aabx extends defpackage.aaby {
    private static volatile java.lang.Boolean f;
    private aagg g;
    private static final java.lang.Object e = new java.lang.Object();
    public static final defpackage.aabx a = new defpackage.aabx();
    public static final int b = defpackage.aaby.c;

    public final android.app.PendingIntent a(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        return connectionResult.c() ? connectionResult.a() : super.n(context, connectionResult.c, null);
    }

    public final defpackage.aaum b(defpackage.aadf aadfVar, defpackage.aadf... aadfVarArr) {
        return c(defpackage.aaup.a, aadfVar, aadfVarArr);
    }

    public final defpackage.aaum c(java.util.concurrent.Executor executor, defpackage.aadf aadfVar, defpackage.aadf... aadfVarArr) {
        defpackage.aaet aaetVar;
        defpackage.aais.at(aadfVar, "Requested API must not be null.");
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(aadfVar);
        arrayList.addAll(java.util.Arrays.asList(aadfVarArr));
        synchronized (defpackage.aaet.c) {
            defpackage.aais.at(defpackage.aaet.d, "Must guarantee manager is non-null before using getInstance");
            aaetVar = defpackage.aaet.d;
        }
        aady aadyVar = new aady(arrayList);
        android.os.Handler handler = aaetVar.r;
        handler.sendMessage(handler.obtainMessage(2, aadyVar));
        defpackage.zzx zzxVar = aadyVar.c;
        return ((defpackage.aaum) zzxVar.a).e(executor, new aabv(0));
    }

    public final void d(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult, boolean z) {
        java.lang.Integer num = connectionResult.e;
        com.google.android.gms.common.internal.ClientNotificationEvent clientNotificationEvent = new com.google.android.gms.common.internal.ClientNotificationEvent(num == null ? -1 : num.intValue(), context.getPackageName(), java.lang.System.currentTimeMillis(), connectionResult.c, z);
        if (this.g == null) {
            this.g = new aahz(context);
        }
        this.g.a(clientNotificationEvent);
    }

    public final void e(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof defpackage.az) {
                defpackage.bo boVarA = ((defpackage.az) activity).a();
                aacp aacpVar = new aacp();
                defpackage.aais.at(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                aacpVar.ak = dialog;
                if (onCancelListener != null) {
                    aacpVar.al = onCancelListener;
                }
                aacpVar.q(boVarA, str);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        android.app.FragmentManager fragmentManager = activity.getFragmentManager();
        aabu aabuVar = new aabu();
        defpackage.aais.at(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        aabuVar.a = dialog;
        if (onCancelListener != null) {
            aabuVar.b = onCancelListener;
        }
        aabuVar.show(fragmentManager, str);
    }

    public final boolean f(int i) {
        if (i != 9) {
            switch (i) {
                default:
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                            break;
                        default:
                            return false;
                    }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    public final android.app.Dialog g(android.content.Context context, int i, aago aagoVar, android.content.DialogInterface.OnCancelListener onCancelListener, android.os.Bundle bundle) {
        java.lang.String strC;
        java.lang.String strB;
        java.lang.String strD;
        if (i == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(context);
        }
        int i2 = aagk.a;
        if (bundle != null) {
            strC = bundle.getString("errorText");
            if (android.text.TextUtils.isEmpty(strC)) {
                strC = aagk.c(context, i);
            }
        } else {
            strC = aagk.c(context, i);
        }
        builder.setMessage(strC);
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        if (bundle != null) {
            strB = bundle.getString("buttonText");
            if (android.text.TextUtils.isEmpty(strB)) {
                strB = aagk.b(context, i);
            }
        } else {
            strB = aagk.b(context, i);
        }
        if (strB != null) {
            builder.setPositiveButton((java.lang.CharSequence) strB, (android.content.DialogInterface.OnClickListener) aagoVar);
        }
        if (bundle != null) {
            strD = bundle.getString("errorTitle");
            if (android.text.TextUtils.isEmpty(strD)) {
                strD = aagk.d(context, i);
            }
        } else {
            strD = aagk.d(context, i);
        }
        if (strD != null) {
            builder.setTitle(strD);
        }
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", java.lang.Integer.valueOf(i)), new java.lang.IllegalArgumentException());
        return builder.create();
    }

    public final void h(android.app.Activity activity, int i, int i2, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog dialogG = g(activity, i, new aagl(m(activity, i, "d"), activity, i2), onCancelListener, null);
        if (dialogG != null) {
            e(activity, dialogG, "GooglePlayServicesErrorDialog", onCancelListener);
        }
    }

    public final void i(android.content.Context context, int i) {
        j(context, new com.google.android.gms.common.ConnectionResult(1, i, super.n(context, i, "n"), null, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    public final void j(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        java.lang.String strD;
        java.lang.String strE;
        java.lang.String string;
        int i;
        java.lang.Object obj = e;
        synchronized (obj) {
            if (f == null) {
                f = java.lang.Boolean.FALSE;
            }
        }
        int i2 = connectionResult.c;
        f.booleanValue();
        android.util.Log.w("GoogleApiAvailability", java.lang.String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", java.lang.Integer.valueOf(i2), connectionResult.e, null), new java.lang.IllegalArgumentException());
        if (i2 == 18) {
            new aabw(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        android.app.PendingIntent pendingIntentA = a(context, connectionResult);
        if (pendingIntentA == null) {
            if (i2 == 6) {
                android.util.Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        android.os.Bundle bundle = connectionResult.f;
        int i3 = aagk.a;
        if (bundle != null) {
            strD = bundle.getString("notificationTitle");
            if (android.text.TextUtils.isEmpty(strD)) {
                if (i2 == 6) {
                    strD = aagk.f(context, "common_google_play_services_resolution_required_title");
                    i2 = 6;
                } else {
                    strD = aagk.d(context, i2);
                }
                if (strD == null) {
                    strD = context.getResources().getString(2132018057);
                }
            }
        } else {
            if (i2 == 6) {
                strD = aagk.f(context, "common_google_play_services_resolution_required_title");
                i2 = 6;
            } else {
                strD = aagk.d(context, i2);
            }
            if (strD == null) {
                strD = context.getResources().getString(2132018057);
            }
        }
        if (bundle != null) {
            strE = bundle.getString("notificationText");
            if (android.text.TextUtils.isEmpty(strE)) {
                if (i2 != 6 || i2 == 19) {
                    strE = aagk.e(context, "common_google_play_services_resolution_required_text", aagk.a(context));
                } else {
                    strE = aagk.c(context, i2);
                }
            }
        } else if (i2 != 6) {
            strE = aagk.e(context, "common_google_play_services_resolution_required_text", aagk.a(context));
        } else {
            strE = aagk.e(context, "common_google_play_services_resolution_required_text", aagk.a(context));
        }
        if (bundle != null) {
            string = bundle.getString("notificationTicker");
            if (android.text.TextUtils.isEmpty(string)) {
                string = context.getResources().getString(2132018053);
            }
        } else {
            string = context.getResources().getString(2132018053);
        }
        java.lang.Object systemService = context.getSystemService("notification");
        defpackage.aais.as(systemService);
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) systemService;
        dva dvaVar = new dva(context, (java.lang.String) null);
        dvaVar.q = true;
        dvaVar.d(16, true);
        dvaVar.h(strD);
        duz duzVar = new duz();
        duzVar.c(strE);
        dvaVar.o(duzVar);
        boolean zC = defpackage.aain.c(context);
        int i4 = android.R.drawable.stat_sys_warning;
        if (zC) {
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            dvaVar.n(i4);
            dvaVar.j = 2;
            if (defpackage.aain.e(context)) {
                dvaVar.e(2131230973, context.getResources().getString(2132018067), pendingIntentA);
            } else {
                dvaVar.g = pendingIntentA;
            }
        } else {
            dvaVar.n(android.R.drawable.stat_sys_warning);
            dvaVar.p(string);
            dvaVar.r(java.lang.System.currentTimeMillis());
            dvaVar.g = pendingIntentA;
            dvaVar.g(strE);
        }
        synchronized (obj) {
        }
        android.app.NotificationChannel notificationChannelM = aa$.ExternalSyntheticApiModelOutline0.m(notificationManager, "com.google.android.gms.availability");
        java.lang.String string2 = context.getResources().getString(2132018052);
        if (notificationChannelM == null) {
            aa$.ExternalSyntheticApiModelOutline0.m(notificationManager, new android.app.NotificationChannel("com.google.android.gms.availability", string2, 4));
        } else if (!string2.contentEquals(aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM))) {
            aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM, string2);
            aa$.ExternalSyntheticApiModelOutline0.m(notificationManager, notificationChannelM);
        }
        dvaVar.w = "com.google.android.gms.availability";
        android.app.Notification notificationA = dvaVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 21) {
            defpackage.aacn.c.set(false);
            i = 10436;
        } else {
            i = 39789;
        }
        notificationManager.notify(i, notificationA);
        d(context, connectionResult, false);
    }
}
