package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zcx implements defpackage.zcu {
    public static final aimz a = aimz.i("com/google/android/callingshared/grpc/impl/GmsAuthTokenFetcher");
    public static final aihd b = aihd.s("https://www.googleapis.com/auth/userinfo.email", "https://www.googleapis.com/auth/cloud-platform", "https://www.googleapis.com/auth/myphonenumbers");
    public final akab c;
    public final java.util.Map d = new j$.util.concurrent.ConcurrentHashMap();
    public final zzx e;
    private final ajct f;

    public zcx(ajct ajctVar, zzx zzxVar, akab akabVar) {
        this.f = ajctVar;
        this.e = zzxVar;
        this.c = akabVar;
    }

    @Override // defpackage.zcu
    public final ajcq a(android.accounts.Account account) {
        return ahvr.F(new defpackage.wzc(this, account, 8, null), this.f);
    }
}
