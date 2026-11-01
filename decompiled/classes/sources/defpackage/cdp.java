package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdp extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.cds d;
    final /* synthetic */ defpackage.aono e;
    final /* synthetic */ defpackage.cci f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdp(defpackage.cds cdsVar, defpackage.aono aonoVar, defpackage.cci cciVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.d = cdsVar;
        this.e = aonoVar;
        this.f = cciVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.cdp) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0111 A[Catch: all -> 0x0129, TryCatch #3 {, blocks: (B:56:0x010d, B:58:0x0111, B:59:0x0113, B:61:0x0119), top: B:100:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0119 A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #3 {, blocks: (B:56:0x010d, B:58:0x0111, B:59:0x0113, B:61:0x0119), top: B:100:0x010d }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142 A[Catch: all -> 0x0158, TryCatch #2 {, blocks: (B:75:0x013e, B:77:0x0142, B:78:0x0144, B:80:0x014a), top: B:98:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:80:0x014a A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #2 {, blocks: (B:75:0x013e, B:77:0x0142, B:78:0x0144, B:80:0x014a), top: B:98:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.aozj aozjVar;
        defpackage.cir cirVar;
        defpackage.cir cirVar2;
        java.lang.Object obj2;
        java.lang.Throwable th;
        java.lang.Object obj3;
        java.util.List listB;
        defpackage.cds cdsVar;
        defpackage.cds cdsVar2;
        defpackage.aoss aossVar = (defpackage.aoss) this.g;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        if (this.c != 0) {
            obj3 = this.b;
            obj2 = this.a;
            try {
                defpackage.aooc.af(obj);
                ((defpackage.apnt) obj3).u();
                cdsVar2 = this.d;
                synchronized (cdsVar2.b) {
                    if (cdsVar2.c == obj2) {
                        cdsVar2.c = null;
                    }
                    if (cdsVar2.C() != null) {
                        defpackage.cax.b("called outside of runRecomposeAndApplyChanges");
                    }
                }
                defpackage.cdh.l(this.d.r);
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                th = th2;
                ((defpackage.apnt) obj3).u();
                cdsVar = this.d;
                synchronized (cdsVar.b) {
                    if (cdsVar.c == obj2) {
                        cdsVar.c = null;
                    }
                    if (cdsVar.C() != null) {
                        defpackage.cax.b("called outside of runRecomposeAndApplyChanges");
                    }
                    defpackage.cdh.l(this.d.r);
                    throw th;
                }
            }
        }
        defpackage.aooc.af(obj);
        defpackage.aoub aoubVarV = defpackage.aooc.V(aossVar.c());
        defpackage.cds cdsVar3 = this.d;
        synchronized (cdsVar3.b) {
            java.lang.Throwable th3 = cdsVar3.d;
            if (th3 != null) {
                throw th3;
            }
            if (((defpackage.cdm) cdsVar3.k.c()).compareTo(defpackage.cdm.b) <= 0) {
                throw new java.lang.IllegalStateException("Recomposer shut down");
            }
            if (cdsVar3.c != null) {
                throw new java.lang.IllegalStateException("Recomposer already running");
            }
            cdsVar3.c = aoubVarV;
            if (cdsVar3.C() != null) {
                defpackage.cax.b("called outside of runRecomposeAndApplyChanges");
            }
        }
        defpackage.cds cdsVar4 = this.d;
        defpackage.apnt apntVarV = defpackage.cfd.V(new defpackage.bae(cdsVar4, 4));
        do {
            defpackage.cdh cdhVar = cdsVar4.r;
            aozjVar = defpackage.cds.j;
            cirVar = (defpackage.cir) aozjVar.c();
            defpackage.cic cicVar = cirVar.d;
            if (cicVar.containsKey(cdhVar)) {
                cirVar2 = cirVar;
            } else if (cirVar.isEmpty()) {
                defpackage.ciu ciuVar = defpackage.ciu.a;
                cirVar2 = new defpackage.cir(cdhVar, cdhVar, cicVar.c(cdhVar, new defpackage.nf(ciuVar, ciuVar)));
            } else {
                java.lang.Object obj4 = cirVar.c;
                java.lang.Object obj5 = cicVar.get(obj4);
                if (obj5 == null) {
                    defpackage.aooh.g();
                }
                cirVar2 = new defpackage.cir(cirVar.b, cdhVar, cicVar.c(obj4, ((defpackage.nf) obj5).R(cdhVar)).c(cdhVar, new defpackage.nf(obj4, defpackage.ciu.a)));
            }
            if (cirVar == cirVar2) {
                break;
            }
        } while (!aozjVar.f(cirVar, cirVar2));
        try {
            synchronized (cdsVar4.b) {
                listB = cdsVar4.B();
            }
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                for (java.lang.Object obj6 : ((defpackage.cfm) ((defpackage.cbb) listB.get(i)).e).c) {
                    defpackage.cdk cdkVar = obj6 instanceof defpackage.cdk ? (defpackage.cdk) obj6 : null;
                    if (cdkVar != null) {
                        cdkVar.a();
                    }
                }
            }
            defpackage.fzq fzqVar = new defpackage.fzq(this.e, this.f, (defpackage.aoln) null, 1);
            this.g = null;
            this.a = aoubVarV;
            this.b = apntVarV;
            this.c = 1;
            if (defpackage.aosv.m(fzqVar, this) == aoluVar) {
                return aoluVar;
            }
            obj2 = aoubVarV;
            obj3 = apntVarV;
            ((defpackage.apnt) obj3).u();
            cdsVar2 = this.d;
            synchronized (cdsVar2.b) {
                if (cdsVar2.c == obj2) {
                    cdsVar2.c = null;
                }
                if (cdsVar2.C() != null) {
                    defpackage.cax.b("called outside of runRecomposeAndApplyChanges");
                }
                defpackage.cdh.l(this.d.r);
                return defpackage.aojh.a;
            }
        } catch (java.lang.Throwable th4) {
            obj2 = aoubVarV;
            th = th4;
            obj3 = apntVarV;
            ((defpackage.apnt) obj3).u();
            cdsVar = this.d;
            synchronized (cdsVar.b) {
                if (cdsVar.c == obj2) {
                    cdsVar.c = null;
                }
                if (cdsVar.C() != null) {
                    defpackage.cax.b("called outside of runRecomposeAndApplyChanges");
                }
            }
            defpackage.cdh.l(this.d.r);
            throw th;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.cdp cdpVar = new defpackage.cdp(this.d, this.e, this.f, aolnVar);
        cdpVar.g = obj;
        return cdpVar;
    }
}
