package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acdc implements defpackage.accr {
    private final /* synthetic */ int $cid;
    private final defpackage.acbd a;
    private final defpackage.accq b;
    private final java.lang.Object c;

    public acdc(android.content.Context context, defpackage.acbd acbdVar, int i, char[] cArr) {
        this.$cid = i;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.a = acbdVar;
        java.lang.Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            defpackage.aooh.h("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.c = (android.net.ConnectivityManager) systemService;
        this.b = defpackage.accq.d;
    }

    private final boolean c() {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) this.c).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    @Override // defpackage.accr
    public final defpackage.accq a() {
        int i = this.$cid;
        return this.b;
    }

    @Override // defpackage.accu
    public final boolean b(akkj akkjVar, acct acctVar) {
        int i;
        android.content.pm.PackageInfo packageInfo;
        int i2 = this.$cid;
        java.lang.Integer numValueOf = null;
        if (i2 == 0) {
            defpackage.aooh.f(akkjVar, "triggeringConditions");
            if (akkjVar.f.isEmpty()) {
                return true;
            }
            for (akjm akjmVar : akkjVar.f) {
                akgx akgxVar = akjmVar.c;
                if (akgxVar == null) {
                    akgxVar = akgx.a;
                }
                java.lang.String str = akgxVar.c == 4 ? (java.lang.String) akgxVar.d : "";
                defpackage.aooh.e(str, "getAndroidPackageName(...)");
                akgx akgxVar2 = akjmVar.c;
                if (akgxVar2 == null) {
                    akgxVar2 = akgx.a;
                }
                java.lang.String str2 = akgxVar2.e;
                defpackage.aooh.e(str2, "getAppVersion(...)");
                if (str2.length() == 0) {
                    i = 0;
                } else {
                    akgx akgxVar3 = akjmVar.c;
                    if (akgxVar3 == null) {
                        akgxVar3 = akgx.a;
                    }
                    java.lang.String str3 = akgxVar3.e;
                    defpackage.aooh.e(str3, "getAppVersion(...)");
                    i = java.lang.Integer.parseInt(str3);
                }
                try {
                    packageInfo = ((android.content.pm.PackageManager) this.c).getPackageInfo(str, 0);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                } catch (java.lang.Exception e) {
                    this.a.e(acctVar.b, e, str);
                }
                int iAQ = defpackage.a.aQ(akjmVar.d);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                int i3 = iAQ - 1;
                if (i3 != 1) {
                    if (i3 != 2) {
                        defpackage.acbd acbdVar = this.a;
                        com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext = acctVar.b;
                        int iAQ2 = defpackage.a.aQ(akjmVar.d);
                        acbdVar.c(promoContext, "Invalid InstallStatus for %s: %s", str, (iAQ2 == 0 || iAQ2 == 1) ? "UNKNOWN" : iAQ2 != 2 ? "INSTALLED" : "NOT_INSTALLED");
                    } else if (packageInfo == null) {
                        this.a.b(acctVar.b, "App is not installed (null package info)", new java.lang.Object[0]);
                    } else if (packageInfo.versionCode < i) {
                        this.a.b(acctVar.b, "Want version: %s \nHave version: %s", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(packageInfo.versionCode));
                    }
                } else if (packageInfo != null && packageInfo.versionCode >= i) {
                    this.a.b(acctVar.b, "App is installed AND has version: %s but want less than version %s", java.lang.Integer.valueOf(packageInfo.versionCode), java.lang.Integer.valueOf(i));
                }
            }
            return true;
        }
        if (i2 != 1) {
            defpackage.aooh.f(akkjVar, "triggeringConditions");
            akjs akjsVar = akkjVar.c;
            if (akjsVar == null) {
                akjsVar = akjs.a;
            }
            akhb akhbVarB = akhb.b(akjsVar.c);
            if (akhbVarB == null) {
                akhbVarB = akhb.a;
            }
            int iOrdinal = akhbVarB.ordinal();
            if (iOrdinal == 0) {
                return true;
            }
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    this.a.c(acctVar.b, "Invalid Connectivity value: %s", akhbVarB);
                    return true;
                }
                if (!c()) {
                    this.a.b(acctVar.b, "Offline but want online", new java.lang.Object[0]);
                }
                return c();
            }
            if (c()) {
                this.a.b(acctVar.b, "Online but want offline", new java.lang.Object[0]);
            }
            if (!c()) {
                return true;
            }
        } else {
            defpackage.aooh.f(akkjVar, "triggeringConditions");
            int i4 = akkjVar.d;
            if (i4 < 0 || i4 > 100) {
                this.a.c(acctVar.b, "Min battery percentage is not between 0 and 100", new java.lang.Object[0]);
            } else {
                if (i4 == 0) {
                    return true;
                }
                android.content.Intent intentRegisterReceiver = ((android.content.Context) this.c).registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver != null) {
                    int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra >= 0 && intExtra2 >= 0) {
                        numValueOf = java.lang.Integer.valueOf((int) ((((double) intExtra) * 100.0d) / ((double) intExtra2)));
                    }
                }
                if (numValueOf == null) {
                    this.a.b(acctVar.b, "Unable to retrieve current battery percentage", new java.lang.Object[0]);
                } else {
                    if (numValueOf.intValue() >= i4) {
                        return true;
                    }
                    this.a.b(acctVar.b, "Battery percentage below minimum.", new java.lang.Object[0]);
                }
            }
        }
        return false;
    }

    public acdc(android.content.Context context, defpackage.acbd acbdVar, int i) {
        this.$cid = i;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.a = acbdVar;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        defpackage.aooh.e(packageManager, "getPackageManager(...)");
        this.c = packageManager;
        this.b = defpackage.accq.c;
    }

    public acdc(android.content.Context context, defpackage.acbd acbdVar, int i, byte[] bArr) {
        this.$cid = i;
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (acbdVar == null) {
            defpackage.aooh.i("promoEvalLogger");
        }
        this.c = context;
        this.a = acbdVar;
        this.b = defpackage.accq.b;
    }
}
