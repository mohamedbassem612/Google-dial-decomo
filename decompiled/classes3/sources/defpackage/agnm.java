package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agnm {
    public static final aimz a = aimz.i("com/google/apps/tiktok/account/api/controller/AccountIntents");

    public static void a(android.content.Intent intent, com.google.apps.tiktok.account.AccountId accountId) {
        ahvr.bM(accountId.a() != -1);
        intent.putExtra("account_id", accountId.a());
        intent.putExtra("$tiktok$account_id_owned", true);
    }
}
