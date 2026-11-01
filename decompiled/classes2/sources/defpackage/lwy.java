package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lwy extends aomh implements aonn {
    boolean a;
    int b;
    final /* synthetic */ tfn c;
    final /* synthetic */ defpackage.lxa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwy(tfn tfnVar, defpackage.lxa lxaVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = tfnVar;
        this.d = lxaVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x010d  */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        boolean zBooleanValue;
        boolean z;
        java.lang.Exception e;
        kiu kiuVarAq;
        defpackage.lxa lxaVar;
        tfk tfkVar;
        boolean zD;
        aokv aokvVar;
        tfb tfbVar;
        aolu aoluVar = aolu.a;
        int i = this.b;
        try {
            if (i == 0) {
                aooc.af(obj);
                tfn tfnVar = this.c;
                java.util.List list = tfo.a;
                aooh.f(tfnVar, "<this>");
                if (!aooh.n(tfnVar.b, tfo.a)) {
                    return tfnVar;
                }
                defpackage.lxa lxaVar2 = this.d;
                this.b = 1;
                obj = lxaVar2.g.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    z = this.a;
                    try {
                        aooc.af(obj);
                        kiuVarAq = snl.aq((kiv) ((j$.util.Optional) obj).orElse(kiv.a), this.c.a.f.a, new sso(this.d.b));
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        if (!(e instanceof java.util.concurrent.CancellationException)) {
                            throw e;
                        }
                        defpackage.lxa.a.d().k(e).l("com/android/dialer/contactsearch/SearchResultDataMapper", "getDetailedUiModel$<anonymous>", 170, "SearchResultDataMapper.kt").v("Failed to retrieve coallesced rows");
                        kiuVarAq = null;
                    }
                    tfn tfnVar2 = this.c;
                    lxaVar = this.d;
                    tfkVar = tfnVar2.a;
                    zD = rcr.d(lxaVar.b, tfkVar.i);
                    aokvVar = new aokv(10);
                    if (z) {
                        aokvVar.add(tff.a);
                    }
                    if (zD) {
                        tfbVar = new tfb(tfkVar.d, true);
                    } else {
                        nwu nwuVar = lxaVar.c;
                        tfbVar = (((java.lang.Boolean) lxaVar.d.a()).booleanValue() ? !nwuVar.l() : nwuVar.a() != nwv.d || tfkVar.j == defpackage.nwx.UNREACHABLE) ? new tfb(false, false) : tfc.a;
                    }
                    aokvVar.add(tfbVar);
                    aokvVar.add(tfg.a);
                    aokvVar.add(new tfd(kiuVarAq != null));
                    return tfn.a(tfnVar2, (tfk) null, ajsz.aX(aokvVar), 1);
                }
                aooc.af(obj);
            }
            ajcq ajcqVarX = this.d.j.x();
            this.a = zBooleanValue;
            this.b = 2;
            java.lang.Object objG = defpackage.yt.g(ajcqVarX, this);
            if (objG == aoluVar) {
                return aoluVar;
            }
            z = zBooleanValue;
            obj = objG;
            kiuVarAq = snl.aq((kiv) ((j$.util.Optional) obj).orElse(kiv.a), this.c.a.f.a, new sso(this.d.b));
            tfn tfnVar3 = this.c;
            lxaVar = this.d;
            tfkVar = tfnVar3.a;
            zD = rcr.d(lxaVar.b, tfkVar.i);
            aokvVar = new aokv(10);
            if (z) {
                aokvVar.add(tff.a);
            }
            if (zD) {
                tfbVar = new tfb(tfkVar.d, true);
            } else {
                nwu nwuVar2 = lxaVar.c;
                if (((java.lang.Boolean) lxaVar.d.a()).booleanValue()) {
                }
            }
            aokvVar.add(tfbVar);
            aokvVar.add(tfg.a);
            aokvVar.add(new tfd(kiuVarAq != null));
            return tfn.a(tfnVar3, (tfk) null, ajsz.aX(aokvVar), 1);
        } catch (java.lang.Exception e3) {
            z = zBooleanValue;
            e = e3;
            if (!(e instanceof java.util.concurrent.CancellationException)) {
                throw e;
            }
            defpackage.lxa.a.d().k(e).l("com/android/dialer/contactsearch/SearchResultDataMapper", "getDetailedUiModel$<anonymous>", 170, "SearchResultDataMapper.kt").v("Failed to retrieve coallesced rows");
            kiuVarAq = null;
        }
        zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.lwy(this.c, this.d, aolnVar);
    }
}
