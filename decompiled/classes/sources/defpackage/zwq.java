package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class zwq {
    public static final java.lang.String[] b = {"com.google", "com.google.work", "cn.google"};
    public static final java.lang.String c = "androidPackageName";
    public static final android.content.ComponentName d = new android.content.ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    private static final defpackage.aaif a = new defpackage.aaif("Auth", "GoogleAuthUtil");

    /* JADX INFO: Thrown type has an unknown type hierarchy: zws */
    public static com.google.android.gms.auth.TokenData a(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle, long j, java.util.concurrent.Executor executor) throws java.lang.Exception {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.aogc aogcVarBD = defpackage.aogc.bD(context);
        try {
            defpackage.aais.am("Calling this from your main thread can lead to deadlock");
            defpackage.aais.aq(str, "Scope cannot be empty or null.");
            l(account);
            f(context, 8400000);
            android.os.Bundle bundle2 = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
            k(context, bundle2);
            try {
                return (com.google.android.gms.auth.TokenData) b(context, d, new zwm(account, str, bundle2, context, aogcVarBD, jCurrentTimeMillis, jElapsedRealtime), j, executor);
            } catch (java.lang.Exception e) {
                e = e;
                aogcVarBD.al(1709, 13, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
                throw e;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    public static java.lang.Object b(android.content.Context context, android.content.ComponentName componentName, defpackage.zwp zwpVar, long j, java.util.concurrent.Executor executor) throws java.io.IOException {
        java.lang.Object objA;
        defpackage.aabt aabtVar = new defpackage.aabt();
        defpackage.aagv aagvVarB = defpackage.aagv.b(context);
        try {
            if (!aagvVarB.c(new defpackage.aagu(componentName), aabtVar, "GoogleAuthUtil", executor).d()) {
                throw new java.io.IOException("Could not bind to service.");
            }
            try {
                try {
                    if (j > 0) {
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        defpackage.aais.am("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
                        if (aabtVar.a) {
                            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
                        }
                        aabtVar.a = true;
                        android.os.IBinder iBinder = (android.os.IBinder) aabtVar.b.poll(j, timeUnit);
                        if (iBinder == null) {
                            throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
                        }
                        objA = zwpVar.a(iBinder);
                    } else {
                        defpackage.aais.am("BlockingServiceConnection.getService() called on main thread");
                        if (aabtVar.a) {
                            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
                        }
                        aabtVar.a = true;
                        objA = zwpVar.a((android.os.IBinder) aabtVar.b.take());
                    }
                    aagvVarB.e(componentName, aabtVar);
                    return objA;
                } catch (java.lang.Throwable th) {
                    aagvVarB.e(componentName, aabtVar);
                    throw th;
                }
            } catch (android.os.RemoteException | java.lang.InterruptedException | java.util.concurrent.TimeoutException e) {
                android.util.Log.i("GoogleAuthUtil", "Error on service connection.", e);
                throw new java.io.IOException("Error on service connection.", e);
            }
        } catch (java.lang.SecurityException e2) {
            android.util.Log.w("GoogleAuthUtil", java.lang.String.format("SecurityException while bind to auth service: %s", e2.getMessage()));
            throw new java.io.IOException("SecurityException while binding to Auth service.", e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zws */
    public static java.lang.String c(android.content.Context context, java.lang.String str) throws zws, defpackage.zwj {
        defpackage.aais.aq(str, "accountName must be provided");
        defpackage.aais.am("Calling this from your main thread can lead to deadlock");
        f(context, 8400000);
        return d(context, new android.accounts.Account(str, "com.google"), "^^_account_id_^^", new android.os.Bundle());
    }

    public static java.lang.String d(android.content.Context context, android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) {
        l(account);
        return a(context, account, str, bundle, 0L, null).b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zws */
    public static void e(android.content.Context context, java.lang.String str, long j) throws java.lang.Exception {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.aogc aogcVarBD = defpackage.aogc.bD(context);
        try {
            defpackage.aais.am("Calling this from your main thread can lead to deadlock");
            f(context, 8400000);
            android.os.Bundle bundle = new android.os.Bundle();
            k(context, bundle);
            b(context, d, new zwn(str, bundle), j, null);
            aogcVarBD.al(1707, 0, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
        } catch (java.lang.Exception e) {
            aogcVarBD.al(1707, 13, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
            throw e;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zws */
    public static void f(android.content.Context context, int i) throws zws, defpackage.zwj {
        try {
            defpackage.aacn.d(context.getApplicationContext(), i);
        } catch (defpackage.aacl e) {
            e = e;
            throw new defpackage.zwj(e.getMessage(), e);
        } catch (defpackage.aacm e2) {
            throw new zws(e2.getMessage(), e2.a());
        } catch (com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException e3) {
            e = e3;
            throw new defpackage.zwj(e.getMessage(), e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.auth.UserRecoverableAuthException */
    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2, android.content.Intent intent, android.app.PendingIntent pendingIntent) throws com.google.android.gms.auth.UserRecoverableAuthException, java.io.IOException, defpackage.zwj {
        zyu zyuVarA = zyu.a(str2);
        defpackage.aaif aaifVar = a;
        aaifVar.e(java.lang.String.format("[GoogleAuthUtil] error status:%s with method:%s", zyuVarA, str));
        if (!zyu.i.equals(zyuVarA) && !zyu.s.equals(zyuVarA) && !zyu.w.equals(zyuVarA) && !zyu.x.equals(zyuVarA) && !zyu.n.equals(zyuVarA) && !zyu.z.equals(zyuVarA) && !zyu.N.equals(zyuVarA) && !zyu.F.equals(zyuVarA) && !zyu.G.equals(zyuVarA) && !zyu.H.equals(zyuVarA) && !zyu.I.equals(zyuVarA) && !zyu.J.equals(zyuVarA) && !zyu.K.equals(zyuVarA) && !zyu.M.equals(zyuVarA) && !zyu.E.equals(zyuVarA) && !zyu.L.equals(zyuVarA)) {
            if (!zyu.e.equals(zyuVarA) && !zyu.f.equals(zyuVarA) && !zyu.g.equals(zyuVarA) && !zyu.af.equals(zyuVarA)) {
                throw new defpackage.zwj(str2);
            }
            throw new java.io.IOException(str2);
        }
        if (pendingIntent != null && intent != null) {
            throw com.google.android.gms.auth.UserRecoverableAuthException.a(str2, intent);
        }
        defpackage.aabx aabxVar = defpackage.aabx.a;
        int iA = defpackage.aacn.a(context);
        if (iA >= 233800000 && pendingIntent == null) {
            aaifVar.d(java.lang.String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", java.lang.Integer.valueOf(iA), str, 233800000));
        }
        if (intent == null) {
            aaifVar.d(java.lang.String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str));
        }
        throw new com.google.android.gms.auth.UserRecoverableAuthException(str2, intent, 1);
    }

    public static android.accounts.Account[] h(android.content.Context context) throws java.lang.Exception {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        defpackage.aogc aogcVarBD = defpackage.aogc.bD(context);
        try {
            defpackage.aais.ap("com.google");
            try {
                int i = defpackage.aaby.c;
                defpackage.aacn.d(context, 8400000);
                defpackage.aais.as(context);
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient("com.google.android.gms.auth.accounts");
                try {
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        throw new android.os.RemoteException("The com.google.android.gms.auth.accounts provider is not available.");
                    }
                    try {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("callingActivity", context instanceof android.app.Activity ? ((android.app.Activity) context).getComponentName().getClassName() : "");
                        android.os.Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_accounts", "com.google", bundle);
                        if (bundleCall == null) {
                            throw new android.os.RemoteException("Null result from AccountChimeraContentProvider");
                        }
                        android.os.Parcelable[] parcelableArrU = defpackage.dpe.u(bundleCall, android.accounts.Account.class);
                        if (parcelableArrU == null) {
                            throw new android.os.RemoteException("Key_Accounts is Null");
                        }
                        android.accounts.Account[] accountArr = new android.accounts.Account[parcelableArrU.length];
                        for (int i2 = 0; i2 < parcelableArrU.length; i2++) {
                            accountArr[i2] = (android.accounts.Account) parcelableArrU[i2];
                        }
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        aogcVarBD.al(1708, 0, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
                        return accountArr;
                    } catch (android.os.RemoteException e) {
                        a.c("RemoteException when fetching accounts", e);
                        throw e;
                    } catch (java.lang.Exception e2) {
                        a.c("Exception when getting accounts", e2);
                        throw new android.os.RemoteException("Accounts ContentProvider failed: " + e2.getMessage());
                    }
                } catch (java.lang.Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            } catch (com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException unused) {
                throw new defpackage.aacl(18);
            }
        } catch (java.lang.Exception e3) {
            aogcVarBD.al(1708, 13, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
            throw e3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zws */
    public static android.accounts.Account[] i(android.content.Context context, final java.lang.String[] strArr) throws java.lang.Exception {
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        final long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        final defpackage.aogc aogcVarBD = defpackage.aogc.bD(context);
        try {
            defpackage.aais.as(context);
            defpackage.aais.ap("com.google");
            f(context, 8400000);
            final java.lang.String className = context instanceof android.app.Activity ? ((android.app.Activity) context).getComponentName().getClassName() : "";
            try {
                defpackage.zwp zwpVar = new defpackage.zwp() { // from class: zwl
                    public final /* synthetic */ java.lang.String a = "com.google";

                    @Override // defpackage.zwp
                    public final java.lang.Object a(android.os.IBinder iBinder) throws java.io.IOException {
                        defpackage.yru yruVar;
                        android.os.Parcelable[] parcelableArrU;
                        java.lang.String[] strArr2 = defpackage.zwq.b;
                        if (iBinder == null) {
                            yruVar = null;
                        } else {
                            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
                            yruVar = iInterfaceQueryLocalInterface instanceof defpackage.yru ? (defpackage.yru) iInterfaceQueryLocalInterface : new defpackage.yru(iBinder);
                        }
                        java.lang.String str = className;
                        java.lang.String[] strArr3 = strArr;
                        java.lang.String str2 = this.a;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("accountType", str2);
                        bundle.putStringArray("account_features", strArr3);
                        bundle.putString("callingActivity", str);
                        android.os.Parcel parcelEP = yruVar.eP();
                        defpackage.yld.d(parcelEP, bundle);
                        android.os.Parcel parcelEQ = yruVar.eQ(6, parcelEP);
                        android.os.Bundle bundle2 = (android.os.Bundle) defpackage.yld.a(parcelEQ, android.os.Bundle.CREATOR);
                        parcelEQ.recycle();
                        if (bundle2 == null || (parcelableArrU = defpackage.dpe.u(bundle2, android.accounts.Account.class)) == null) {
                            throw new java.io.IOException("Receive null result from service call.");
                        }
                        android.accounts.Account[] accountArr = new android.accounts.Account[parcelableArrU.length];
                        for (int i = 0; i < parcelableArrU.length; i++) {
                            accountArr[i] = (android.accounts.Account) parcelableArrU[i];
                        }
                        aogcVarBD.al(1708, 0, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
                        return accountArr;
                    }
                };
                aogcVarBD = aogcVarBD;
                return (android.accounts.Account[]) b(context, d, zwpVar, 0L, null);
            } catch (java.lang.Exception e) {
                e = e;
                aogcVarBD = aogcVarBD;
                java.lang.Exception exc = e;
                aogcVarBD.al(1708, 13, jCurrentTimeMillis, java.lang.System.currentTimeMillis(), jElapsedRealtime);
                throw exc;
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
    }

    public static void j(java.lang.Object obj) throws java.io.IOException {
        if (obj != null) {
            return;
        }
        a.e("Service call returned null.");
        throw new java.io.IOException("Service unavailable.");
    }

    private static void k(android.content.Context context, android.os.Bundle bundle) {
        java.lang.String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        java.lang.String str2 = c;
        if (android.text.TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", android.os.SystemClock.elapsedRealtime());
    }

    private static void l(android.accounts.Account account) {
        if (account == null) {
            throw new java.lang.IllegalArgumentException("Account cannot be null");
        }
        if (android.text.TextUtils.isEmpty(account.name)) {
            throw new java.lang.IllegalArgumentException("Account name cannot be empty!");
        }
        java.lang.String[] strArr = b;
        for (int i = 0; i < 3; i++) {
            if (strArr[i].equals(account.type)) {
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Account type not supported");
    }
}
