package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agqo {
    public static final ahkk a = new ahkk(1, 2);
    public final com.google.apps.tiktok.account.AccountId b;
    public final ajct c;
    public final ajwr d;

    public agqo(ajwr ajwrVar, com.google.apps.tiktok.account.AccountId accountId, ajct ajctVar) {
        this.d = ajwrVar;
        this.b = accountId;
        this.c = ajctVar;
        ahvr.bZ(accountId.a() != -1, "Account Id is invalid");
    }

    public static java.lang.String a(com.google.apps.tiktok.account.AccountId accountId) {
        return "accounts" + java.io.File.separator + accountId.a();
    }
}
