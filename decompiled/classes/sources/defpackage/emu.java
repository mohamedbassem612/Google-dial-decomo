package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class emu extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emu(defpackage.dxx dxxVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = dxxVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.emu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return ((defpackage.emu) c(obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i == 2) {
            return ((defpackage.emu) c((defpackage.kiu) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 3) {
            return ((defpackage.emu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.emu) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [emw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [dxx, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.kiu kiuVarE;
        int i = this.$cid;
        if (i == 0) {
            defpackage.aoss aossVar = (defpackage.aoss) this.b;
            defpackage.aooc.af(obj);
            ?? r4 = this.a;
            defpackage.ems emsVar = ((defpackage.emt) r4).a;
            if (emsVar.a().compareTo(defpackage.emq.b) >= 0) {
                emsVar.c(r4);
            } else {
                defpackage.aooc.W(aossVar.c(), null);
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            java.lang.Object obj2 = this.b;
            defpackage.aooc.af(obj);
            java.lang.Object objA = this.a.a(obj2);
            defpackage.aooh.e(objA, "apply(...)");
            return objA;
        }
        if (i != 2) {
            if (i != 3) {
                defpackage.aooc.af(obj);
                defpackage.aoss aossVar2 = (defpackage.aoss) this.b;
                defpackage.vvz vvzVar = (defpackage.vvz) this.a;
                return defpackage.ahvr.ag(aossVar2, vvzVar.n, new defpackage.unj(vvzVar, (defpackage.aoln) null, 8, (char[]) null));
            }
            defpackage.aooc.af(obj);
            defpackage.aoss aossVar3 = (defpackage.aoss) this.b;
            defpackage.rpa rpaVar = (defpackage.rpa) this.a;
            return defpackage.ahvr.ag(aossVar3, rpaVar.m, new defpackage.mev(rpaVar, (defpackage.aoln) null, 11, (short[]) null));
        }
        defpackage.aooc.af(obj);
        defpackage.kiu kiuVar = (defpackage.kiu) this.b;
        defpackage.aooh.f(kiuVar, "row");
        defpackage.kal kalVar = ((defpackage.jzr) this.a).c;
        kam kamVar = (jlr) kalVar.d.get(kalVar.a(kiuVar));
        if (kamVar != null) {
            defpackage.kag kagVar = kalVar.a;
            defpackage.aooh.f(kiuVar, "row");
            j$.util.Objects.checkIndex(0, 3);
            if (kamVar instanceof kam) {
                defpackage.akzx akzxVarAK = defpackage.gus.aK(kamVar.b);
                defpackage.kgz kgzVarB = kagVar.b();
                if (kgzVarB != null && kgzVarB.b(kiuVar) != null) {
                    kiw kiwVarR = akzxVarAK.r();
                    defpackage.aooh.e(kiwVarR, "build(...)");
                    akzxVarAK = defpackage.kgz.e(kiwVarR).L();
                }
                defpackage.akzx akzxVarL = kiuVar.L();
                akzxVarL.u();
                defpackage.kiu kiuVar2 = (defpackage.kiu) akzxVarL.b;
                kiw kiwVarR2 = akzxVarAK.r();
                j$.util.Objects.requireNonNull(kiwVarR2);
                kiuVar2.r = kiwVarR2;
                kiuVar2.b |= 16384;
                defpackage.alad aladVarR = akzxVarL.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                return (defpackage.kiu) aladVarR;
            }
            if (!(kamVar instanceof kan)) {
                throw new defpackage.aois();
            }
            defpackage.kgz kgzVarB2 = kagVar.b();
            if (kgzVarB2 != null) {
                soe soeVar = ((kan) kamVar).b;
                defpackage.aooh.f(kiuVar, "coalescedRow");
                defpackage.aooh.f(soeVar, "peopleInfo");
                defpackage.kgu kguVarB = kgzVarB2.b(kiuVar);
                if (kguVarB == null) {
                    ((defpackage.aimw) defpackage.kgz.a.d().l("com/android/dialer/calllog/halo/impl/HaloImpl", "updateThirdPartyContactInfo", 84, "HaloImpl.kt")).v("Requested to update contact information of a non Halo entry.");
                    kiuVarE = kiuVar;
                } else {
                    jhw jhwVarG = hgt.G(kguVarB.L());
                    jhwVarG.y(soeVar.d);
                    jhwVarG.A(soeVar.e);
                    jhwVarG.z(soeVar.b);
                    jhwVarG.x(soeVar.f);
                    defpackage.kgu kguVarW = jhwVarG.w();
                    ni niVarJ = hgt.J(kiuVar.L());
                    niVarJ.G();
                    java.lang.String str = ((defpackage.ken) kgzVarB2.e.b).k;
                    kgzVarB2.b.d();
                    defpackage.akzc akzcVarB = defpackage.ker.b(kguVarW);
                    defpackage.aooh.f(str, "key");
                    java.lang.Object obj3 = niVarJ.a;
                    j$.util.Objects.requireNonNull(str);
                    j$.util.Objects.requireNonNull(akzcVarB);
                    defpackage.akzx akzxVar = (defpackage.akzx) obj3;
                    akzxVar.u();
                    ((defpackage.kiu) akzxVar.b).b().put(str, akzcVarB);
                    kiuVarE = niVarJ.E();
                }
                if (kiuVarE != null) {
                    return kiuVarE;
                }
            }
        }
        return kiuVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [dxx, java.lang.Object] */
    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.emu emuVar = new defpackage.emu((defpackage.emt) this.a, aolnVar, 0);
            emuVar.b = obj;
            return emuVar;
        }
        if (i == 1) {
            defpackage.emu emuVar2 = new defpackage.emu((defpackage.dxx) this.a, aolnVar, 1);
            emuVar2.b = obj;
            return emuVar2;
        }
        if (i == 2) {
            defpackage.emu emuVar3 = new defpackage.emu((defpackage.jzr) this.a, aolnVar, 2);
            emuVar3.b = obj;
            return emuVar3;
        }
        java.lang.Object obj2 = this.a;
        if (i != 3) {
            defpackage.emu emuVar4 = new defpackage.emu((defpackage.vvz) obj2, aolnVar, 4);
            emuVar4.b = obj;
            return emuVar4;
        }
        defpackage.emu emuVar5 = new defpackage.emu((defpackage.rpa) obj2, aolnVar, 3);
        emuVar5.b = obj;
        return emuVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emu(defpackage.emt emtVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = emtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emu(defpackage.jzr jzrVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = jzrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emu(defpackage.rpa rpaVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rpaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emu(defpackage.vvz vvzVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = vvzVar;
    }
}
