package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class hrn implements defpackage.hru {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ hrn(defpackage.hrs hrsVar, android.view.ViewPropertyAnimator viewPropertyAnimator, ld ldVar, int i) {
        this.$cid = i;
        this.a = hrsVar;
        this.b = viewPropertyAnimator;
        this.c = ldVar;
    }

    @Override // defpackage.hru
    public final void a(boolean z) {
        int i = this.$cid;
        if (i == 0) {
            ((android.view.ViewPropertyAnimator) this.b).setListener(null);
            java.lang.Object obj = this.a;
            defpackage.hrs hrsVar = (defpackage.hrs) obj;
            defpackage.hrq hrqVar = hrsVar.b;
            java.lang.Object obj2 = this.c;
            ld ldVar = (ld) obj2;
            hrqVar.l(ldVar);
            ((km) obj).l(ldVar);
            hrsVar.g.remove(obj2);
            hrsVar.a();
            return;
        }
        if (i == 1) {
            ((android.view.ViewPropertyAnimator) this.b).setListener(null);
            java.lang.Object obj3 = this.a;
            defpackage.hrs hrsVar2 = (defpackage.hrs) obj3;
            defpackage.hrq hrqVar2 = hrsVar2.b;
            java.lang.Object obj4 = this.c;
            ld ldVar2 = (ld) obj4;
            hrqVar2.m(ldVar2);
            ((km) obj3).l(ldVar2);
            hrsVar2.j.remove(obj4);
            hrsVar2.a();
            return;
        }
        if (i == 2) {
            ((android.view.ViewPropertyAnimator) this.b).setListener(null);
            java.lang.Object obj5 = this.a;
            defpackage.hrs hrsVar3 = (defpackage.hrs) obj5;
            defpackage.hrq hrqVar3 = hrsVar3.b;
            java.lang.Object obj6 = this.c;
            ld ldVar3 = (ld) obj6;
            hrqVar3.j(ldVar3);
            ((km) obj5).l(ldVar3);
            hrsVar3.k.remove(obj6);
            hrsVar3.a();
            return;
        }
        if (i == 3) {
            ((android.view.ViewPropertyAnimator) this.b).setListener(null);
            java.lang.Object obj7 = this.a;
            defpackage.hrs hrsVar4 = (defpackage.hrs) obj7;
            defpackage.hrq hrqVar4 = hrsVar4.b;
            java.lang.Object obj8 = this.c;
            ld ldVar4 = (ld) obj8;
            hrqVar4.i(ldVar4);
            ((km) obj7).l(ldVar4);
            hrsVar4.f.remove(obj8);
            hrsVar4.a();
            return;
        }
        if (z) {
            return;
        }
        java.lang.Object obj9 = this.a;
        pyj pyjVar = (pyj) obj9;
        if (((java.lang.Boolean) pyjVar.b.a()).booleanValue()) {
            java.lang.Object obj10 = this.c;
            j$.util.Optional optionalB = pyjVar.b();
            defpackage.hvp hvpVar = new defpackage.hvp(obj9, obj10, 18);
            if (true == optionalB.isPresent()) {
                java.lang.Object obj11 = optionalB.get();
                java.lang.Object obj12 = hvpVar.a;
                java.lang.Object obj13 = hvpVar.b;
                if (((aw) obj11).equals(obj13)) {
                    u uVar = new u(((pyj) obj12).a.I());
                    aw awVar = (aw) obj13;
                    uVar.j(awVar);
                    uVar.c();
                    awVar.aC(false);
                }
            }
        } else {
            bo boVarI = pyjVar.a.I();
            j$.util.Optional optionalB2 = pyjVar.b();
            if (optionalB2.isPresent()) {
                u uVar2 = new u(boVarI);
                uVar2.j((aw) optionalB2.orElseThrow());
                uVar2.c();
                ((aw) optionalB2.orElseThrow()).aC(false);
            }
        }
        j$.lang.Iterable.-EL.forEach(pyjVar.a((pyi) this.b), new defpackage.lct(7));
    }

    public /* synthetic */ hrn(pyj pyjVar, aw awVar, pyi pyiVar, int i) {
        this.$cid = i;
        this.a = pyjVar;
        this.c = awVar;
        this.b = pyiVar;
    }
}
