package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fay implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ fay(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v29, types: [fgx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v52, types: [android.view.Choreographer$VsyncCallback, java.lang.Object] */
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
        switch (this.$cid) {
            case 0:
                java.lang.String str = eum.a;
                defpackage.ezv ezvVar = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar.F(ezvVar.E(), 1012, new defpackage.exv(6));
                return;
            case 1:
                java.lang.String str2 = eum.a;
                defpackage.ezv ezvVar2 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar2.F(ezvVar2.E(), 1008, new defpackage.exv(19));
                return;
            case 2:
                defpackage.eto etoVar = (defpackage.eto) this.a;
                if (etoVar.g()) {
                    etoVar.e(-1, new defpackage.ezt(10));
                    return;
                }
                return;
            case 3:
                defpackage.fbw fbwVar = (defpackage.fbw) this.a;
                if (fbwVar.P >= 300000) {
                    ((defpackage.fca) fbwVar.V.a).m = true;
                    fbwVar.P = 0L;
                    return;
                }
                return;
            case 4:
                java.lang.Object obj = this.a;
                defpackage.fcp fcpVar = (defpackage.fcp) obj;
                if (fcpVar.b) {
                    return;
                }
                defpackage.fcs fcsVar = fcpVar.a;
                if (fcsVar != null) {
                    fcsVar.o(fcpVar.d);
                }
                fcpVar.c.c.remove(obj);
                fcpVar.b = true;
                return;
            case 5:
                ((defpackage.fcm) this.a).o(null);
                return;
            case 6:
                java.lang.Object obj2 = this.a;
                java.lang.Object obj3 = ((defpackage.fdv) obj2).a;
                synchronized (obj3) {
                    if (((defpackage.fdv) obj2).h) {
                        return;
                    }
                    long j = ((defpackage.fdv) obj2).g - 1;
                    ((defpackage.fdv) obj2).g = j;
                    if (j > 0) {
                        return;
                    }
                    if (j >= 0) {
                        ((defpackage.fdv) obj2).a();
                        return;
                    }
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException();
                    synchronized (obj3) {
                        try {
                            ((defpackage.fdv) obj2).i = illegalStateException;
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
            case 7:
                ((defpackage.fgm) this.a).p = true;
                return;
            case 8:
                ((defpackage.fgm) this.a).u();
                return;
            case 9:
                ?? r9 = this.a;
                defpackage.fgm fgmVar = (defpackage.fgm) r9;
                if (fgmVar.r || fgmVar.u.f()) {
                    return;
                }
                fgmVar.q = true;
                defpackage.ffr ffrVar = fgmVar.h;
                ahvr.ci(ffrVar);
                ffrVar.c(r9);
                return;
            case 10:
                ((defpackage.fih) this.a).e();
                return;
            case 11:
                ((defpackage.fjf) this.a).c.c();
                return;
            case 12:
                ((defpackage.fjf) ((defpackage.fje) this.a).b).c.b();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.fjf) ((defpackage.fje) this.a).b).c.d();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((defpackage.fjf) ((defpackage.fje) this.a).b).c.e();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                ((defpackage.fjw) this.a).n--;
                return;
            case 16:
                ?? r10 = this.a;
                ae$.ExternalSyntheticApiModelOutline0.m(((defpackage.fke) r10).a, (android.view.Choreographer$VsyncCallback) r10);
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.String str3 = eum.a;
                defpackage.ezv ezvVar3 = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar3.F(ezvVar3.E(), 1016, new defpackage.ezt(2));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.String str4 = eum.a;
                defpackage.ezv ezvVar4 = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar4.F(ezvVar4.E(), 1019, new defpackage.ezp(1));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.String str5 = eum.a;
                defpackage.ezv ezvVar5 = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar5.F(ezvVar5.D(), 1018, new defpackage.ezp(0));
                return;
            default:
                java.lang.String str6 = eum.a;
                defpackage.ezv ezvVar6 = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar6.F(ezvVar6.D(), 1021, new defpackage.ezp(7));
                return;
        }
    }
}
