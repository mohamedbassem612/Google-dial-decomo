package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ache implements defpackage.acgr {
    public final defpackage.aoin a;
    public final java.lang.String b;
    public final java.lang.String c;
    private final defpackage.amwu d;

    public ache(defpackage.amwu amwuVar, java.lang.String str, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aoin aoinVar) {
        this.d = amwuVar;
        this.b = str;
        this.a = aoinVar;
        this.c = !accountRepresentation.b() ? accountRepresentation.a() : "signedout";
    }

    public static defpackage.adag g(java.lang.String str) {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("CREATE TABLE ");
        adagVar.n(str);
        adagVar.n(" (");
        adagVar.n("account TEXT NOT NULL,");
        adagVar.n("key TEXT NOT NULL,");
        adagVar.n("value BLOB NOT NULL,");
        adagVar.n(" PRIMARY KEY (account, key))");
        return adagVar.B();
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq a() {
        return ((defpackage.acgx) this.d.a()).d.F(new jsh(this, 19));
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq b(java.util.Map map) {
        return ((defpackage.acgx) this.d.a()).d.F(new ufj(this, map, 7));
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq c() {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("SELECT key, value");
        adagVar.n(" FROM ");
        adagVar.n(this.b);
        adagVar.n(" WHERE account = ?");
        adagVar.p(this.c);
        defpackage.ajbg ajbgVarM = ((defpackage.acgx) this.d.a()).d.M(adagVar.B());
        defpackage.aheq aheqVar = new defpackage.aheq(this, 1);
        long j = defpackage.ahqx.a;
        return ajbgVarM.c(new defpackage.ahqn(defpackage.ahns.c(false), aheqVar), defpackage.ajbm.INSTANCE).h();
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq d(java.lang.String str, defpackage.albh albhVar) {
        return ((defpackage.acgx) this.d.a()).d.G(new achd(this, str, albhVar));
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq e(java.lang.String str) {
        return ((defpackage.acgx) this.d.a()).d.G(new achg(this, str, 1));
    }

    @Override // defpackage.acgr
    public final defpackage.ajcq f(java.util.List list) {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("DELETE FROM ");
        adagVar.n(this.b);
        adagVar.n(" WHERE account = ?");
        adagVar.p(this.c);
        adagVar.n(" AND key in (?");
        adagVar.p((java.lang.String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            adagVar.n(", ?");
            adagVar.p((java.lang.String) list.get(i));
        }
        adagVar.n(")");
        return ((defpackage.acgx) this.d.a()).d.M(adagVar.B()).c(defpackage.ahqx.e(new vur(5)), defpackage.ajbm.INSTANCE).h();
    }

    public ache(defpackage.amwu amwuVar, defpackage.aoin aoinVar) {
        this.d = amwuVar;
        this.b = "capped_promos";
        this.a = aoinVar;
        this.c = "noaccount";
    }
}
