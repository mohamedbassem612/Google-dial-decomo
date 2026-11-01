package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achh implements defpackage.acgt {
    final java.lang.String a = "user_experiments_store";
    private final defpackage.amwu b;
    private final defpackage.aduj c;

    public achh(defpackage.amwu amwuVar, defpackage.aduj adujVar) {
        this.b = amwuVar;
        this.c = adujVar;
    }

    public static defpackage.adag d(java.lang.String str) {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("CREATE TABLE ");
        adagVar.n(str);
        adagVar.n(" (");
        adagVar.n("account TEXT NOT NULL, ");
        adagVar.n("key TEXT NOT NULL, ");
        adagVar.n("message BLOB NOT NULL, ");
        adagVar.n("windowStartTimestamp INTEGER NOT NULL, ");
        adagVar.n("windowEndTimestamp INTEGER NOT NULL, ");
        adagVar.n("PRIMARY KEY (account, key))");
        return adagVar.B();
    }

    @Override // defpackage.acgt
    public final defpackage.ajcq a(long j) {
        wsk wskVar = new wsk(this.a);
        wskVar.e("windowEndTimestamp < ?");
        wskVar.f(java.lang.String.valueOf(j));
        wsk wskVarH = wskVar.h();
        this.c.e();
        return ((defpackage.acgx) this.b.a()).d.F(new jsh(wskVarH, 20));
    }

    @Override // defpackage.acgt
    public final defpackage.ajcq b() {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("SELECT * FROM ");
        adagVar.n(this.a);
        defpackage.adag adagVarB = adagVar.B();
        this.c.e();
        return ((defpackage.acgx) this.b.a()).d.M(adagVarB).c(new defpackage.achf(0), defpackage.ajbm.INSTANCE).h();
    }

    @Override // defpackage.acgt
    public final defpackage.ajcq c(java.util.Collection collection) {
        return ((defpackage.acgx) this.b.a()).d.G(new achg(this, collection, 0));
    }
}
