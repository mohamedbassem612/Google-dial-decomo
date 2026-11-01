package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class baq implements defpackage.aonp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ baq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [giv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aono, java.lang.Object] */
    @Override // defpackage.aonp
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i;
        int i2 = this.$cid;
        if (i2 == 0) {
            defpackage.nf nfVar = (defpackage.nf) obj;
            ((java.lang.Integer) obj2).intValue();
            defpackage.cav cavVar = (defpackage.cav) obj3;
            int iIntValue = ((java.lang.Integer) obj4).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true != cavVar.B(nfVar) ? 2 : 4;
            }
            if (cavVar.H((iIntValue & 131) != 130, iIntValue & 1)) {
                this.a.a(nfVar, cavVar, java.lang.Integer.valueOf(iIntValue & 14));
            } else {
                cavVar.s();
            }
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                android.database.sqlite.SQLiteCursorDriver sQLiteCursorDriver = (android.database.sqlite.SQLiteCursorDriver) obj2;
                java.lang.String str = (java.lang.String) obj3;
                android.database.sqlite.SQLiteQuery sQLiteQuery = (android.database.sqlite.SQLiteQuery) obj4;
                defpackage.aoir aoirVar = defpackage.giz.a;
                if (sQLiteQuery == null) {
                    defpackage.aooh.g();
                }
                this.a.g(new defpackage.gjf(sQLiteQuery));
                return new android.database.sqlite.SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
            int i3 = ((defpackage.dmw) obj3).a;
            int i4 = ((defpackage.dmx) obj4).a;
            defpackage.djc djcVar = (defpackage.djc) this.a;
            defpackage.cer cerVarN = djcVar.g.n((defpackage.dmq) obj, (defpackage.dnd) obj2, i3, i4);
            if (cerVarN instanceof defpackage.dnl) {
                java.lang.Object obj5 = ((defpackage.dnl) cerVarN).a;
                if (obj5 == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.graphics.Typeface");
                }
                return (android.graphics.Typeface) obj5;
            }
            defpackage.izg izgVar = new defpackage.izg(cerVarN, djcVar.h);
            djcVar.h = izgVar;
            java.lang.Object obj6 = izgVar.b;
            if (obj6 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type android.graphics.Typeface");
            }
            return (android.graphics.Typeface) obj6;
        }
        defpackage.ahj ahjVar = (defpackage.ahj) obj;
        defpackage.cmw cmwVar = (defpackage.cmw) obj2;
        defpackage.cav cavVar2 = (defpackage.cav) obj3;
        int iIntValue2 = ((java.lang.Integer) obj4).intValue();
        int i5 = iIntValue2 & 6;
        defpackage.aku akuVar = defpackage.ahk.a;
        if (i5 == 0) {
            i = (true != cavVar2.B(ahjVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != cavVar2.B(cmwVar) ? 16 : 32;
        }
        if (cavVar2.H((i & 147) != 146, i & 1)) {
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            long jA = cavVar2.a();
            long j = jA ^ (jA >>> 32);
            defpackage.cje cjeVarM = cavVar2.M();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVar2, cmwVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVar2.L();
            cavVar2.v();
            if (cavVar2.F()) {
                cavVar2.j(aomyVar);
            } else {
                cavVar2.x();
            }
            ?? r6 = this.a;
            defpackage.cev.c(cavVar2, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVar2, cjeVarM, defpackage.dam.d);
            defpackage.cev.a(cavVar2, java.lang.Integer.valueOf((int) j), defpackage.dam.f);
            cavVar2.i(defpackage.aojh.a, new defpackage.bae(defpackage.dam.g, 7));
            defpackage.cev.c(cavVar2, cmwVarM, defpackage.dam.c);
            r6.a(ahjVar, cavVar2, java.lang.Integer.valueOf(i & 14));
            cavVar2.n();
        } else {
            cavVar2.s();
        }
        return defpackage.aojh.a;
    }
}
