package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abzz implements defpackage.abzy {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final android.content.Context b;
    public final defpackage.adym c;
    private final defpackage.aolr d;

    public abzz(android.content.Context context, defpackage.adym adymVar, defpackage.aolr aolrVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (adymVar == null) {
            defpackage.aooh.i("authUtil");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        this.b = context;
        this.c = adymVar;
        this.d = aolrVar;
    }

    @Override // defpackage.abzy
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new acbt(this, (defpackage.aoln) null, 1), aolnVar);
    }

    @Override // defpackage.abzy
    public final java.util.List b() {
        java.util.ArrayList arrayList;
        if (!defpackage.angy.a.eZ().f()) {
            return defpackage.aokc.a;
        }
        defpackage.adtz adtzVarF = this.c.f();
        if (adtzVarF instanceof defpackage.adub) {
            java.util.List list = (java.util.List) ((defpackage.adub) adtzVarF).a;
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((android.accounts.Account) it.next()).name);
            }
        } else {
            if (adtzVarF instanceof defpackage.adtv) {
                ((defpackage.aiob) ((defpackage.aiob) a.d()).k(((defpackage.adtv) adtzVarF).b())).v("Failed to get accounts using GoogleAuthUtil");
            }
            android.content.Context context = this.b;
            if (defpackage.dvx.c(context, "android.permission.GET_ACCOUNTS") != 0) {
                ((defpackage.aiob) a.d()).v("Failed to get accounts using AccountManager, missing permission GET_ACCOUNTS");
                return defpackage.aokc.a;
            }
            android.accounts.Account[] accountsByType = android.accounts.AccountManager.get(context).getAccountsByType("com.google");
            defpackage.aooh.e(accountsByType, "getAccountsByType(...)");
            arrayList = new java.util.ArrayList(accountsByType.length);
            for (android.accounts.Account account : accountsByType) {
                arrayList.add(account.name);
            }
        }
        return arrayList;
    }
}
