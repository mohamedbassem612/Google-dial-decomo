package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aagk {
    public static final /* synthetic */ int a = 0;
    private static final aec b = new aec(0);
    private static java.util.Locale c;

    public static java.lang.String a(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        try {
            java.lang.Object obj = aaiy.b(context).a;
            return ((android.content.Context) obj).getPackageManager().getApplicationLabel(((android.content.Context) obj).getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.NullPointerException unused) {
            java.lang.String str = context.getApplicationInfo().name;
            return !android.text.TextUtils.isEmpty(str) ? str : packageName;
        }
    }

    public static java.lang.String b(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(2132018049);
        }
        if (i != 2) {
            return i != 3 ? resources.getString(android.R.string.ok) : resources.getString(2132018046);
        }
        return resources.getString(2132018061);
    }

    public static java.lang.String c(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strA = a(context);
        if (i == 1) {
            return resources.getString(2132018050, strA);
        }
        if (i != 2) {
            if (i == 3) {
                return resources.getString(2132018047, strA);
            }
            if (i == 4) {
                return resources.getString(2132018054, strA);
            }
            if (i == 5) {
                return e(context, "common_google_play_services_invalid_account_text", strA);
            }
            if (i == 7) {
                return e(context, "common_google_play_services_network_error_text", strA);
            }
            if (i == 9) {
                return resources.getString(2132018059, strA);
            }
            if (i == 20) {
                return e(context, "common_google_play_services_restricted_profile_text", strA);
            }
            if (i != 21) {
                switch (i) {
                    case 16:
                        return e(context, "common_google_play_services_api_unavailable_text", strA);
                    case 17:
                        return e(context, "common_google_play_services_sign_in_failed_text", strA);
                    case 18:
                        return resources.getString(2132018065, strA);
                    default:
                        return resources.getString(2132018056, strA);
                }
            }
        }
        return aain.e(context) ? resources.getString(2132018066, strA) : resources.getString(2132018062, strA);
    }

    public static java.lang.String d(android.content.Context context, int i) {
        android.content.res.Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(2132018051);
            case 2:
            case 21:
                return resources.getString(2132018063);
            case 3:
                return resources.getString(2132018048);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                android.util.Log.e("GoogleApiAvailability", "Sign-in is required to use this API.");
                return resources.getString(2132018055);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.util.Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                android.util.Log.e("GoogleApiAvailability", "Google Play services requires resolution.");
                return f(context, "common_google_play_services_resolution_required_title");
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                android.util.Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.util.Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return resources.getString(2132018060);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                android.util.Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                android.util.Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
            case 15:
            default:
                android.util.Log.e("GoogleApiAvailability", a.bj(i, "Unexpected error code "));
                return null;
            case 16:
                android.util.Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                android.util.Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 18:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is updating.");
                return resources.getString(2132018064);
            case 19:
                android.util.Log.e("GoogleApiAvailability", "Google Play services is missing a required permission.");
                return f(context, "common_google_play_services_resolution_required_title");
            case 20:
                android.util.Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static java.lang.String e(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.res.Resources resources = context.getResources();
        java.lang.String strF = f(context, str);
        if (strF == null) {
            strF = resources.getString(2132018058);
        }
        return java.lang.String.format(resources.getConfiguration().locale, strF, str2);
    }

    public static java.lang.String f(android.content.Context context, java.lang.String str) {
        android.content.res.Resources resourcesForApplication;
        aec aecVar = b;
        synchronized (aecVar) {
            java.util.Locale localeF = dpe.q(context.getResources().getConfiguration()).f(0);
            if (!localeF.equals(c)) {
                aecVar.clear();
                c = localeF;
            }
            java.lang.String str2 = (java.lang.String) aecVar.get(str);
            if (str2 != null) {
                return str2;
            }
            boolean z = aacn.a;
            try {
                resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                resourcesForApplication = null;
            }
            if (resourcesForApplication == null) {
                return null;
            }
            int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                android.util.Log.w("GoogleApiAvailability", a.bx(str, "Missing resource: "));
                return null;
            }
            java.lang.String string = resourcesForApplication.getString(identifier);
            if (android.text.TextUtils.isEmpty(string)) {
                android.util.Log.w("GoogleApiAvailability", a.bx(str, "Got empty resource: "));
                return null;
            }
            b.put(str, string);
            return string;
        }
    }
}
