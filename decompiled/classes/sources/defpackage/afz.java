package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afz implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [cjx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aonj, java.lang.Object] */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.alj aljVar;
        defpackage.bay bayVar;
        defpackage.dkw dkwVarK = null;
        defpackage.bay bayVar2 = null;
        float f = 0.0f;
        int i = 0;
        switch (this.$cid) {
            case 0:
                long j = ((defpackage.dpp) obj).a;
                defpackage.aonj aonjVar = defpackage.aga.a;
                return new defpackage.dpp((((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) (j >> 32)))).intValue()) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L));
            case 1:
                long j2 = ((defpackage.dpp) obj).a;
                defpackage.aonj aonjVar2 = defpackage.aga.a;
                return new defpackage.dpp((((long) ((java.lang.Number) this.a.a(java.lang.Integer.valueOf((int) (j2 >> 32)))).intValue()) << 32) | (((long) ((int) (j2 & 4294967295L))) & 4294967295L));
            case 2:
                aljVar = new defpackage.alj(this.a, 0);
                break;
            case 3:
                long j3 = ((defpackage.cpm) obj).a;
                defpackage.ato atoVar = (defpackage.ato) this.a;
                return new defpackage.cpm(atoVar.c(atoVar.i, j3, atoVar.h));
            case 4:
                ((defpackage.czb) obj).u((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 5:
                ((defpackage.czb) obj).u((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.czb) obj).u((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((java.lang.Integer) obj).intValue();
                return this.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((java.lang.Integer) obj).intValue();
                return this.a;
            case 9:
                bem bemVar = (bem) obj;
                defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
                java.lang.Object obj2 = this.a;
                defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
                defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
                try {
                    int iB = ((defpackage.bbh) obj2).b();
                    defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                    defpackage.mni.bx(bemVar, iB);
                    return defpackage.aojh.a;
                } catch (java.lang.Throwable th) {
                    defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                    throw th;
                }
            case 10:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.bba bbaVar = (defpackage.bba) this.a;
                return bbaVar.a(iIntValue, bbaVar.a);
            case 11:
                float f2 = -((java.lang.Float) obj).floatValue();
                java.lang.Object obj3 = this.a;
                if ((f2 >= 0.0f || ((defpackage.bbh) obj3).g()) && (f2 <= 0.0f || ((defpackage.bbh) obj3).f())) {
                    defpackage.bbh bbhVar = (defpackage.bbh) obj3;
                    if (java.lang.Math.abs(bbhVar.g) > 0.5f) {
                        avo.d("entered drag with non-zero pending scroll");
                    }
                    bbhVar.d = true;
                    float f3 = bbhVar.g + f2;
                    bbhVar.g = f3;
                    if (java.lang.Math.abs(f3) > 0.5f) {
                        float f4 = bbhVar.g;
                        int iRound = java.lang.Math.round(f4);
                        defpackage.bay bayVarE = ((defpackage.bay) bbhVar.f.a()).e(iRound, !bbhVar.b);
                        if (bayVarE == null || (bayVar = bbhVar.c) == null) {
                            bayVar2 = bayVarE;
                        } else {
                            defpackage.bay bayVarE2 = bayVar.e(iRound, true);
                            if (bayVarE2 != null) {
                                bbhVar.c = bayVarE2;
                                bayVar2 = bayVarE;
                            }
                        }
                        if (bayVar2 != null) {
                            bbhVar.e(bayVar2, bbhVar.b, true);
                            bbhVar.o.b(defpackage.aojh.a);
                            bbhVar.k(f4 - bbhVar.g, bayVar2);
                        } else {
                            defpackage.dbk dbkVar = bbhVar.q;
                            if (dbkVar != null) {
                                dbkVar.C();
                            }
                            bbhVar.k(f4 - bbhVar.g, bbhVar.j());
                        }
                    }
                    if (java.lang.Math.abs(bbhVar.g) > 0.5f) {
                        f2 -= bbhVar.g;
                        bbhVar.g = 0.0f;
                    }
                    f = f2;
                }
                return java.lang.Float.valueOf(-f);
            case 12:
                ((defpackage.czb) obj).s((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 13:
                aljVar = new defpackage.alj(this.a, 2);
                break;
            case 14:
                aljVar = new defpackage.alj(this.a, 4);
                break;
            case 15:
                defpackage.bdy bdyVar = (defpackage.bdy) ((defpackage.bes) this.a).a.a();
                int iB2 = bdyVar.b();
                while (i < iB2) {
                    if (defpackage.aooh.n(bdyVar.d(i), obj)) {
                        return java.lang.Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return java.lang.Integer.valueOf(i);
            case 16:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj4 = this.a;
                defpackage.bes besVar = (defpackage.bes) obj4;
                defpackage.bdy bdyVar2 = (defpackage.bdy) besVar.a.a();
                if (iIntValue2 < 0 || iIntValue2 >= bdyVar2.b()) {
                    avo.c("Can't scroll to index " + iIntValue2 + ", it is out of bounds [0, " + bdyVar2.b() + ')');
                }
                defpackage.aoov.an(((defpackage.cmv) obj4).M(), null, 0, new hxo(besVar, iIntValue2, (defpackage.aoln) null, 1), 3);
                return java.lang.Boolean.TRUE;
            case 17:
                ?? r0 = this.a;
                return java.lang.Boolean.valueOf(r0 != 0 ? r0.e(obj) : true);
            case 18:
                ((defpackage.czb) obj).s((defpackage.czc) this.a, 0, 0, 0.0f);
                return defpackage.aojh.a;
            case 19:
                java.util.List list = (java.util.List) obj;
                defpackage.bjn bjnVar = (defpackage.bjn) this.a;
                defpackage.dkw dkwVar = bjnVar.d().c;
                if (dkwVar != null) {
                    defpackage.dkz dkzVar = bjnVar.b;
                    float[] fArr = defpackage.crp.a;
                    defpackage.dkz dkzVarY = defpackage.dkz.y(dkzVar, defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, defpackage.crp.u), 0L, null, null, 0L, 0, 0L, 16777214);
                    defpackage.dkv dkvVar = dkwVar.a;
                    dkwVarK = dkwVar.k(new defpackage.dkv(dkvVar.a, dkzVarY, dkvVar.c, dkvVar.d, dkvVar.e, dkvVar.f, dkvVar.g, dkvVar.h, dkvVar.k, dkvVar.i, dkvVar.j), dkwVar.c);
                    list.add(dkwVarK);
                }
                return java.lang.Boolean.valueOf(dkwVarK != null);
            default:
                defpackage.dji djiVar = (defpackage.dji) obj;
                defpackage.bjn bjnVar2 = (defpackage.bjn) this.a;
                bjm bjmVar = bjnVar2.i;
                if (bjmVar == null) {
                    bjm bjmVar2 = new bjm(bjnVar2.a, djiVar);
                    defpackage.bjb bjbVar = new defpackage.bjb(djiVar, bjnVar2.b, bjnVar2.j, bjnVar2.c, bjnVar2.d, bjnVar2.e, bjnVar2.f, bjnVar2.g, defpackage.aokc.a);
                    bjbVar.h(bjnVar2.d().b);
                    bjmVar2.d = bjbVar;
                    bjnVar2.i = bjmVar2;
                } else if (!defpackage.aooh.n(djiVar, bjmVar.b)) {
                    bjmVar.b = djiVar;
                    defpackage.bjb bjbVar2 = bjmVar.d;
                    if (bjbVar2 != null) {
                        bjbVar2.i(djiVar, bjnVar2.b, bjnVar2.j, bjnVar2.c, bjnVar2.d, bjnVar2.e, bjnVar2.f, bjnVar2.g, defpackage.aokc.a);
                    }
                }
                bjnVar2.k();
                return java.lang.Boolean.TRUE;
        }
        return aljVar;
    }
}
