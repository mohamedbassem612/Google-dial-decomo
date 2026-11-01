package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afhl implements defpackage.ajba {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afhl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15, types: [afig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [ajcq, java.lang.Object] */
    @Override // defpackage.ajba
    public final defpackage.ajbg a(defpackage.ajyk ajykVar, java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.adag adagVar = (defpackage.adag) this.a;
            java.lang.Object obj2 = adagVar.a;
            java.lang.Object obj3 = adagVar.b;
            defpackage.afhr afhrVar = (defpackage.afhr) obj;
            defpackage.ahoq ahoqVarZ = defpackage.ahvr.Z(1262, "ExecSQL: ".concat((java.lang.String) obj3));
            try {
                defpackage.jio jioVar = new defpackage.jio(afhrVar, obj3, obj2, 7);
                afhrVar.b();
                defpackage.ajcr ajcrVar = new defpackage.ajcr(defpackage.ahqx.i(new defpackage.nyf(afhrVar, jioVar, 16)));
                afhrVar.b.execute(ajcrVar);
                ahoqVarZ.a(ajcrVar);
                ahoqVarZ.close();
                return new defpackage.ajbg(ajcrVar);
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarZ.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        int i2 = 1;
        if (i == 1) {
            defpackage.afhr afhrVar2 = (defpackage.afhr) obj;
            afhrVar2.b();
            defpackage.adag adagVar2 = (defpackage.adag) this.a;
            defpackage.afhn afhnVar = new defpackage.afhn(afhrVar2, (java.lang.Object[]) adagVar2.a, (java.lang.String) adagVar2.b);
            int i3 = defpackage.afia.a;
            defpackage.afhy afhyVar = new defpackage.afhy(afhnVar);
            afhyVar.e(afhrVar2.b);
            return defpackage.ajbg.b(afhyVar, defpackage.ajbm.INSTANCE);
        }
        if (i == 2) {
            return new defpackage.ajbg(((defpackage.afhr) obj).a(this.a));
        }
        int i4 = 0;
        if (i == 3) {
            return new defpackage.ajbg(((defpackage.afhr) obj).a(new defpackage.afhm(this.a, i4)));
        }
        if (i != 4) {
            return new defpackage.ajbg(this.a);
        }
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) obj;
        boolean zIsWriteAheadLoggingEnabled = sQLiteDatabase.isWriteAheadLoggingEnabled();
        defpackage.afhx afhxVar = (defpackage.afhx) this.a;
        java.util.concurrent.Executor executor = afhxVar.j;
        defpackage.afhr afhrVar3 = zIsWriteAheadLoggingEnabled ? new defpackage.afhr(sQLiteDatabase, afhxVar.c, executor, afhxVar.q) : new defpackage.afhr(sQLiteDatabase, executor, executor, afhxVar.q);
        defpackage.ajcm ajcmVar = new defpackage.ajcm(afhrVar3);
        j$.util.Objects.requireNonNull(afhrVar3);
        return defpackage.afhx.a(ajcmVar, new defpackage.afhs(afhrVar3, i2));
    }
}
