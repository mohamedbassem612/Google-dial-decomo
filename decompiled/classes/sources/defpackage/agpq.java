package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agpq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/account/data/google/GcoreAccountName");
    public final boolean b;
    private final defpackage.ahyn c;
    private final defpackage.ahyn d;

    public agpq(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.ahyn ahynVar3) {
        this.c = ahynVar;
        this.d = ahynVar2;
        this.b = !((java.lang.Boolean) ahynVar3.d(java.lang.Boolean.FALSE)).booleanValue();
    }

    public static java.lang.String d(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        return g(lowerCase) ? java.lang.String.valueOf(lowerCase.substring(0, lowerCase.lastIndexOf("@")).replace(".", "").replace('i', 'l').replace('1', 'l').replace('0', 'o').replace('2', 'z').replace('5', 's')).concat("@gmail.com") : lowerCase;
    }

    public static boolean g(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        return lowerCase.endsWith("@googlemail.com") || lowerCase.endsWith("@gmail.com");
    }

    public static final boolean h(defpackage.agoq agoqVar) {
        return !agoqVar.i;
    }

    public final defpackage.ajcq a(com.google.apps.tiktok.account.AccountId accountId) {
        return defpackage.ajan.f(b(accountId), defpackage.ahqx.a(new defpackage.aeqw(18)), defpackage.ajbm.INSTANCE);
    }

    public final defpackage.ajcq b(com.google.apps.tiktok.account.AccountId accountId) {
        if (accountId == null) {
            return defpackage.aiql.y(new agpf());
        }
        defpackage.ajcq ajcqVarG = ((defpackage.adag) ((defpackage.ahys) this.c).a).g(accountId);
        defpackage.ahyc ahycVarA = defpackage.ahqx.a(new agnw(this, 3));
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        return defpackage.aizu.f(defpackage.ajan.f(ajcqVarG, ahycVarA, ajbmVar), java.lang.IllegalArgumentException.class, defpackage.ahqx.a(new defpackage.aeqw(17)), ajbmVar);
    }

    public final defpackage.ajcq c(java.lang.String str) {
        return str != null ? defpackage.ajan.f(((defpackage.adag) ((defpackage.ahys) this.c).a).h(), defpackage.ahqx.a(new agnx(this, str, 2)), defpackage.ajbm.INSTANCE) : defpackage.aiql.y(new agpf());
    }

    public final java.lang.String e(defpackage.agoq agoqVar) {
        if (((java.lang.String) ((defpackage.ahys) this.d).a).equals(agoqVar.j)) {
            return agoqVar.g;
        }
        return null;
    }

    public final boolean f(defpackage.agoq agoqVar) {
        return ((java.lang.String) ((defpackage.ahys) this.d).a).equals(agoqVar.j);
    }
}
