package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lge implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lge(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15, types: [adrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [adrs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Set] */
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
    @Override // java.lang.Runnable
    public final void run() {
        int i = 13;
        switch (this.$cid) {
            case 0:
                ((defpackage.lgg) this.a).k.a((ajcq) this.b);
                break;
            case 1:
                ((pgi) this.a).a.add(this.b);
                break;
            case 2:
                java.lang.Object obj = this.a;
                java.lang.Object obj2 = this.b;
                defpackage.lgi lgiVar = (defpackage.lgi) obj;
                lgiVar.f = j$.util.Optional.of(obj2);
                j$.util.Optional optional = lgiVar.k;
                defpackage.kwv kwvVar = new defpackage.kwv(obj2, 11);
                if (true == optional.isPresent()) {
                    ((szt) optional.get()).a((defpackage.lgp) kwvVar.a);
                }
                break;
            case 3:
                ((defpackage.lgi) this.a).k = j$.util.Optional.of(this.b);
                break;
            case 4:
                ((defpackage.lgi) this.a).g = j$.util.Optional.of(this.b);
                break;
            case 5:
                defpackage.lha.e(((defpackage.lha) this.b).a, (defpackage.lgo) this.a);
                break;
            case 6:
                int i2 = lja.c;
                this.b.o((adrr) this.a);
                break;
            case 7:
                int i3 = lja.c;
                this.b.n((adrr) this.a);
                break;
            case 8:
                ((defpackage.ljk) this.a).b.b((defpackage.adof) this.b);
                break;
            case 9:
                ((defpackage.ljk) this.a).b.c(this.b);
                break;
            case 10:
                ((defpackage.ljk) this.a).b.c(this.b);
                break;
            case 11:
                defpackage.mli mliVar = (defpackage.mli) this.b;
                j$.util.Optional optionalH = mliVar.y.h();
                if (true == optionalH.isPresent()) {
                    optionalH = j$.util.Optional.ofNullable(((apqr) optionalH.get()).b);
                }
                mliVar.z.i((java.lang.String) optionalH.orElse((java.lang.Object) null)).b((mce) this.a);
                break;
            case 12:
                java.lang.Object obj3 = this.b;
                defpackage.nld nldVar = (defpackage.nld) this.a;
                aoov.an(nldVar.c, (aolr) null, 0, new defpackage.nea((java.lang.Long) obj3, nldVar, (aoln) null, 13), 3);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.oby) this.b).u.i(((defpackage.obf) this.a).g).b(mce.aF);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.Object obj4 = this.b;
                otq otqVar = (otq) obj4;
                if (otqVar.o.a().size() > 1) {
                    otqVar.b();
                } else if (anty.Q(otqVar.c, otp.b, otp.a)) {
                    java.lang.Object obj5 = this.a;
                    otqVar.b.k((aenj) otq.a.get(obj5));
                    if (((oto) obj5).equals(oto.c)) {
                        otqVar.h = j$.util.Optional.of(otqVar.f.b(new defpackage.lye(obj4, i), ((java.lang.Long) otqVar.d.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS));
                    }
                }
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                long jLongValue = ((java.lang.Long) this.b).longValue();
                java.lang.Object obj6 = this.a;
                agsm.i(435, ((otz) obj6).s.i(jLongValue, defpackage.jxn.e), "Emitting event IN_CALL_ACTIVITY_RESUME_RECEIVED failed.", new java.lang.Object[0]);
                break;
            case 16:
                ((oud) this.b).c = (android.app.Activity) this.a;
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((pnb) this.a).g((java.lang.String) this.b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((pnb) this.a).g((java.lang.String) this.b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                pmy pmyVarC = ((pnb) this.a).c(((pom) this.b).a);
                if (pmyVarC != null) {
                    pmyVarC.ah().c();
                }
                break;
            default:
                java.lang.Object obj7 = this.a;
                pmz pmzVar = pmz.h;
                pnb pnbVar = (pnb) obj7;
                if (!pnbVar.h.contains(pmzVar)) {
                    java.lang.Object obj8 = this.b;
                    qbc qbcVar = qbc.fC;
                    java.lang.String str = ((pom) obj8).a;
                    pnbVar.h(str, qbcVar, pmzVar, false);
                    pnbVar.f(mce.aC, str);
                }
                break;
        }
    }

    public /* synthetic */ lge(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
