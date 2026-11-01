package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aigv extends defpackage.aifn {
    public defpackage.aijx a;
    public boolean b = false;
    public boolean c = false;

    public aigv(int i) {
        this.a = new defpackage.aijx(i);
    }

    @Override // defpackage.aifn
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.aigy g() {
        j$.util.Objects.requireNonNull(this.a);
        defpackage.aijx aijxVar = this.a;
        if (aijxVar.c == 0) {
            return defpackage.aikm.a;
        }
        if (this.c) {
            this.a = new defpackage.aijx(aijxVar);
            this.c = false;
        }
        this.b = true;
        return new defpackage.aikm(this.a);
    }

    public final void b(java.lang.Iterable iterable) {
        j$.util.Objects.requireNonNull(this.a);
        if (!(iterable instanceof defpackage.aijo)) {
            super.e(iterable);
            return;
        }
        defpackage.aijo aijoVar = (defpackage.aijo) iterable;
        defpackage.aijx aijxVar = aijoVar instanceof defpackage.aikm ? ((defpackage.aikm) aijoVar).b : aijoVar instanceof defpackage.aicv ? ((defpackage.aicv) aijoVar).a : null;
        if (aijxVar != null) {
            defpackage.aijx aijxVar2 = this.a;
            aijxVar2.j(java.lang.Math.max(aijxVar2.c, aijxVar.c));
            for (int iA = aijxVar.a(); iA >= 0; iA = aijxVar.e(iA)) {
                d(aijxVar.i(iA), aijxVar.c(iA));
            }
            return;
        }
        java.util.Set setJ = aijoVar.j();
        defpackage.aijx aijxVar3 = this.a;
        aijxVar3.j(java.lang.Math.max(aijxVar3.c, setJ.size()));
        for (aijp aijpVar : aijoVar.j()) {
            d(aijpVar.a, aijpVar.a());
        }
    }

    @Override // defpackage.aifn
    public final /* synthetic */ void c(java.lang.Object obj) {
        d(obj, 1);
    }

    public final void d(java.lang.Object obj, int i) {
        j$.util.Objects.requireNonNull(this.a);
        if (i != 0) {
            if (this.b) {
                this.a = new defpackage.aijx(this.a);
                this.c = false;
            }
            this.b = false;
            obj.getClass();
            defpackage.aijx aijxVar = this.a;
            aijxVar.f(obj, i + aijxVar.b(obj));
        }
    }
}
