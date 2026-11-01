package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bje extends dap implements dbd, dat, dau, dan, dcp, dbb, ddj {
    public defpackage.bjf a;
    public final bjn b;
    public boolean c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    public bje(dji djiVar, dkz dkzVar, gat gatVar, dnx dnxVar, aonj aonjVar, int i, boolean z, int i2, int i3, java.util.List list, aonj aonjVar2, defpackage.bjf bjfVar) throws aoiq {
        this.a = bjfVar;
        bjn bjnVar = new bjn(djiVar, dkzVar, gatVar, dnxVar, aonjVar, i, z, i2, i3, list, aonjVar2, this.a, (aonj) null);
        V(bjnVar);
        this.b = bjnVar;
        if (this.a != null) {
            return;
        }
        defpackage.avo.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new aoiq();
    }

    public final void a(cxi cxiVar) {
        defpackage.bjf bjfVar = this.a;
        if (bjfVar != null) {
            bjfVar.c = defpackage.bjk.a(bjfVar.c, cxiVar, null, null, 6);
            defpackage.blz blzVar = bjfVar.f;
            blzVar.b = false;
            aonj aonjVar = blzVar.e;
            if (aonjVar != null) {
                aonjVar.a(java.lang.Long.valueOf(bjfVar.a));
            }
        }
    }

    public final boolean cO() {
        return false;
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        return this.b.cX(cyiVar, cydVar, j);
    }

    public final void d() {
        if (this.c) {
            this.c = false;
            defpackage.bjf bjfVar = this.a;
            if (bjfVar != null) {
                bjfVar.b();
            }
        }
    }

    public final void dc() {
        defpackage.bjf bjfVar = this.a;
        if (bjfVar != null) {
            bjfVar.c(k());
        }
    }

    public final int e(cxf cxfVar, cxe cxeVar, int i) {
        return this.b.e(cxfVar, cxeVar, i);
    }

    public final int f(cxf cxfVar, cxe cxeVar, int i) {
        return this.b.f(cxfVar, cxeVar, i);
    }

    public final void g(cxi cxiVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        defpackage.bjf bjfVar = this.a;
        if (bjfVar != null) {
            bjfVar.a();
        }
    }

    public final int i(cxf cxfVar, cxe cxeVar, int i) {
        return this.b.i(cxfVar, cxeVar, i);
    }

    public final int j(cxf cxfVar, cxe cxeVar, int i) {
        return this.b.j(cxfVar, cxeVar, i);
    }

    public final bek k() {
        aoot aootVar = new aoot();
        den.u(this, new defpackage.ny(aootVar, this, 14, null));
        return (bek) aootVar.a;
    }

    public final void o(dbm dbmVar) {
        this.b.o(dbmVar);
    }

    public final void u() {
        defpackage.bjf bjfVar = this.a;
        if (bjfVar != null) {
            bjfVar.c(null);
        }
    }

    public final void v() {
        defpackage.bjf bjfVar = this.a;
        if (bjfVar != null) {
            bjfVar.c(k());
        }
    }

    public final /* synthetic */ void m() {
    }

    public final /* synthetic */ void h(long j) {
    }
}
