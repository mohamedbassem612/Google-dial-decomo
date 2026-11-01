package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afeg {
    public static final android.accounts.Account a = new android.accounts.Account("shared", "mobstore");

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static android.accounts.Account a(java.lang.String str) {
        if ("shared".equals(str)) {
            return a;
        }
        int iIndexOf = str.indexOf(58);
        defpackage.agab.ah((iIndexOf ^ (-1)) >>> 31, "Malformed account", new java.lang.Object[0]);
        return new android.accounts.Account(str.substring(iIndexOf + 1), str.substring(0, iIndexOf));
    }

    public static java.lang.String b(android.accounts.Account account) {
        defpackage.agab.ah(account.type.indexOf(58) == -1, "Account type contains ':'.", new java.lang.Object[0]);
        defpackage.agab.ah(account.type.indexOf(47) == -1, "Account type contains '/'.", new java.lang.Object[0]);
        defpackage.agab.ah(account.name.indexOf(47) == -1, "Account name contains '/'.", new java.lang.Object[0]);
        if (c(account)) {
            return "shared";
        }
        return account.type + ':' + account.name;
    }

    public static boolean c(android.accounts.Account account) {
        return a.equals(account);
    }
}
