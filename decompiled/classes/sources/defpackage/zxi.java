package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zxi {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/gms/auth/aang/migration/GoogleAuthClientWrapper");
    public final defpackage.zwx b;

    public zxi(android.content.Context context) {
        defpackage.aewq.d(context);
        this.b = new defpackage.zxh(context);
    }

    public static java.lang.Object a(defpackage.aaum aaumVar) {
        return defpackage.aais.d() ? ((defpackage.ajac) defpackage.aazc.e(aaumVar)).s() : defpackage.aazc.t(aaumVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: zws */
    public final java.lang.String b(android.content.Context context, android.accounts.Account account, java.lang.String str) throws zws, java.io.IOException, defpackage.zwj {
        android.os.Bundle bundle = new android.os.Bundle();
        if (defpackage.andi.d()) {
            c(account);
        }
        java.lang.String packageName = context.getPackageName();
        defpackage.zwx zwxVar = this.b;
        if (!defpackage.zxj.e(packageName, zwxVar, context)) {
            java.lang.String str2 = defpackage.zwk.a;
            return defpackage.zwq.d(context, account, str, bundle);
        }
        try {
            java.lang.String str3 = account.name;
            java.lang.String str4 = defpackage.zwk.a;
            java.lang.String strC = defpackage.zwq.c(context, str3);
            if (android.text.TextUtils.isEmpty(strC)) {
                throw new java.io.IOException("Could not fetch gaia id for account.");
            }
            return ((com.google.android.gms.auth.aang.GetTokenResponse) defpackage.aazc.t(zwxVar.c(defpackage.andi.a.eZ().h() ? defpackage.zxj.a(strC, str, bundle).a() : defpackage.zxj.b(account, str, zwxVar, bundle).a()))).a;
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.IOException();
        } catch (java.util.concurrent.ExecutionException e) {
            defpackage.zxj.c(e, "Unexpected exception while fetching token.");
            java.lang.String str5 = defpackage.zwk.a;
            return defpackage.zwq.d(context, account, str, bundle);
        }
    }

    public final void c(android.accounts.Account account) {
        if (account.type.equals("com.google") || account.type.equals("com.google.work")) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Account type " + account.type + " is not supported.");
    }
}
