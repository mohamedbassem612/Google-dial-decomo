package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aefb implements defpackage.aefa {
    private final android.content.Context a;

    static {
        aiof.i("GnpSdk");
    }

    public aefb(android.content.Context context) {
        aooh.f(context, "context");
        this.a = context;
    }

    @Override // defpackage.aefa
    public final adtz a() {
        adty adtyVar = adty.aa;
        try {
            android.content.Context context = this.a;
            android.accounts.AccountManager accountManager = android.accounts.AccountManager.get(context);
            android.content.ContentResolver contentResolver = context.getContentResolver();
            aooh.e(contentResolver, "getContentResolver(...)");
            if (defpackage.anfh.a.eZ().a()) {
                android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.auth.accounts", 0);
                if (providerInfoResolveContentProvider == null) {
                    throw new defpackage.aeez("Failed to resolve ContentProvider for accounts");
                }
                if (!aaco.a(context).b(providerInfoResolveContentProvider.packageName)) {
                    throw new defpackage.aeez("ContentProvider for accounts is not signed by Google");
                }
            }
            android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient("com.google.android.gms.auth.accounts");
            try {
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new defpackage.aeez("Failed to get ContentProviderClient for accounts from GmsCore");
                }
                try {
                    java.util.Set<android.accounts.Account> setCf = null;
                    android.os.Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("get_accounts", "com.google", null);
                    if (bundleCall == null) {
                        throw new java.lang.IllegalStateException("Received null bundle when fetching device accounts via GMS Core.");
                    }
                    if (dwz.b()) {
                        android.accounts.Account[] accountArr = (android.accounts.Account[]) bundleCall.getParcelableArray("accounts", android.accounts.Account.class);
                        if (accountArr != null) {
                            setCf = ajsz.cW(accountArr);
                        }
                    } else {
                        android.os.Parcelable[] parcelableArray = bundleCall.getParcelableArray("accounts");
                        if (parcelableArray != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArray.length);
                            for (android.os.Parcelable parcelable : parcelableArray) {
                                aooh.d(parcelable, "null cannot be cast to non-null type android.accounts.Account");
                                arrayList.add((android.accounts.Account) parcelable);
                            }
                            setCf = ajsz.cf(arrayList);
                        }
                    }
                    if (setCf == null) {
                        setCf = aoke.a;
                    }
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(setCf, 10)), 16));
                    for (android.accounts.Account account : setCf) {
                        aoiu aoiuVar = new aoiu(account.name, accountManager.getPreviousName(account));
                        linkedHashMap.put(aoiuVar.a, aoiuVar.b);
                    }
                    return new adub(linkedHashMap);
                } catch (java.lang.Exception e) {
                    throw new defpackage.aeez(e);
                }
            } catch (java.lang.Throwable th) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
                throw th;
            }
        } catch (java.lang.Exception e2) {
            return new defpackage.adtw(e2, adtyVar);
        }
    }
}
