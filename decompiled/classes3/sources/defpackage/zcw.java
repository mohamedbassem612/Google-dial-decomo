package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zcw implements defpackage.akbp {
    private static final aimz a = aimz.i("com/google/android/callingshared/grpc/GetTokenForAccountInterceptor");
    private final defpackage.zcu b;
    private final android.content.Context c;
    private ajcq d;

    public zcw(android.content.Context context, defpackage.zcu zcuVar) {
        this.c = context;
        this.b = zcuVar;
    }

    private static defpackage.akcc k() {
        return defpackage.akcc.b(anqw.g, new anph());
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc a() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd b() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd c() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcc d() {
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd e() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd f() {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final defpackage.akcc g(defpackage.aljf aljfVar) {
        defpackage.zcv zcvVar = (defpackage.zcv) ((anmb) aljfVar.a).f(defpackage.zcv.a);
        int i = zcvVar == null ? 4 : zcvVar.c;
        try {
            java.lang.String str = (java.lang.String) aiql.H(this.d);
            anoz anozVar = anph.b;
            int i2 = anpc.d;
            ((anph) aljfVar.d).h(new anoy("authorization", anozVar), "Bearer ".concat(java.lang.String.valueOf(str)));
            return defpackage.akcc.a;
        } catch (java.util.concurrent.ExecutionException e) {
            a.bq(a.c(), "failed to get token.", "com/google/android/callingshared/grpc/GetTokenForAccountInterceptor", "continueRequestHeaderProcessing", 'X', "GetTokenForAccountInterceptor.java", e, zct.b);
            return i == 3 ? k() : defpackage.akcc.a;
        }
    }

    @Override // defpackage.akbp
    public final defpackage.akcc h(defpackage.aljf aljfVar) {
        defpackage.zcv zcvVar = (defpackage.zcv) ((anmb) aljfVar.a).f(defpackage.zcv.a);
        int i = zcvVar == null ? 4 : zcvVar.c;
        if (i != 2) {
            j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(zcvVar);
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = ((defpackage.zcv) optionalOfNullable.get()).b;
                optionalOfNullable.getClass();
            }
            android.accounts.Account account = (android.accounts.Account) optionalOfNullable.orElse((java.lang.Object) null);
            if (account == null) {
                android.accounts.Account[] accountsByType = android.accounts.AccountManager.get(this.c).getAccountsByType("com.google");
                if (accountsByType.length != 0) {
                    account = accountsByType[0];
                } else if (i == 3) {
                    return k();
                }
            }
            ajcq ajcqVarA = this.b.a(account);
            this.d = ajcqVarA;
            return defpackage.akcc.c(ajcqVarA);
        }
        return defpackage.akcc.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd i(apjb apjbVar) {
        return defpackage.akcd.a;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ defpackage.akcd j(apjb apjbVar) {
        return defpackage.akcd.a;
    }
}
