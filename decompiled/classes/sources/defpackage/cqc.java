package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqc extends defpackage.cmv implements defpackage.dbd, defpackage.ddc {
    public defpackage.aonj a;

    public cqc(defpackage.aonj aonjVar) {
        this.a = aonjVar;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        defpackage.crd crdVar;
        boolean z;
        defpackage.dck dckVarB = defpackage.cfo.B(this, 2);
        if (dckVarB.H) {
            crdVar = dckVarB.D;
            z = dckVarB.G;
        } else {
            defpackage.cra craVar = defpackage.cfd.a;
            if (craVar == null) {
                defpackage.cfd.a = new defpackage.cra();
            } else {
                craVar.n();
            }
            defpackage.cra craVar2 = defpackage.cfd.a;
            if (craVar2 == null) {
                defpackage.aooh.g();
            }
            craVar2.r = dckVarB.w.r;
            craVar2.p = defpackage.dpy.l(dckVarB.c);
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                this.a.a(craVar2);
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                crdVar = craVar2.m;
                z = craVar2.n;
            } catch (java.lang.Throwable th) {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                throw th;
            }
        }
        if (z) {
            diqVar.a(defpackage.din.U, crdVar);
        }
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        defpackage.czc czcVarV = cydVar.v(j);
        return cyiVar.du(czcVarV.a, czcVarV.b, defpackage.aokd.a, new defpackage.bly(czcVarV, this, 19, null));
    }

    public final void d() {
        defpackage.cfo.v(this, this.a);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.c(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.d(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.e(new dbc(this), cxfVar, cxeVar, i);
    }

    @Override // defpackage.dbd
    public final /* synthetic */ int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return defpackage.ddt.f(new dbc(this), cxfVar, cxeVar, i);
    }

    public final java.lang.String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.a + ')';
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ddc
    public final boolean y() {
        return false;
    }
}
