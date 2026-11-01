package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zis implements defpackage.zkd {
    public static final aimz a = aimz.i("com/google/android/dialershared/crosssurfacefeature/relay/integration/featureplatform/FeaturePlatformOutboundEventDispatcher");
    public final defpackage.zip b;
    public final apdp c;
    private final aoss d;
    private final aonj e;
    private final zzx f;
    private final defpackage.afpl g;

    public zis(defpackage.afpl afplVar, aoss aossVar, defpackage.zip zipVar, zzx zzxVar, aonj aonjVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zipVar, "featurePlatformOutboundEventCallScopeCache");
        this.g = afplVar;
        this.d = aossVar;
        this.b = zipVar;
        this.f = zzxVar;
        this.e = aonjVar;
        this.c = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(albh albhVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.ziq ziqVar;
        albh albhVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.ziq) {
            ziqVar = (defpackage.ziq) aolnVar;
            int i = ziqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ziqVar.d = i - Integer.MIN_VALUE;
            } else {
                ziqVar = new defpackage.ziq(this, aolnVar);
            }
        } else {
            ziqVar = new defpackage.ziq(this, aolnVar);
        }
        java.lang.Object obj = ziqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ziqVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.c;
                ziqVar.a = albhVar;
                ziqVar.e = apdpVar3;
                ziqVar.d = 1;
                if (apdpVar3.b(ziqVar) == aoluVar) {
                    return aoluVar;
                }
                albhVar2 = albhVar;
                apdpVar = apdpVar3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = (apdp) ziqVar.a;
                    try {
                        aooc.af(obj);
                        apdpVar2.d();
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdpVar = ziqVar.e;
                albhVar2 = (albh) ziqVar.a;
                aooc.af(obj);
            }
            ziqVar.a = apdpVar;
            ziqVar.e = null;
            ziqVar.d = 2;
            if (c(albhVar2, ziqVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar2 = apdpVar;
            apdpVar2.d();
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    @Override // defpackage.zkd
    public final void b() {
        a.b().l("com/google/android/dialershared/crosssurfacefeature/relay/integration/featureplatform/FeaturePlatformOutboundEventDispatcher", "onFeaturePlatformReady", 73, "FeaturePlatformOutboundEventDispatcher.kt").v("enter");
        aoov.an(this.d, (aolr) null, 0, new defpackage.zeb(this, (aoln) null, 2), 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [albh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7, types: [zip] */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    public final java.lang.Object c(albh albhVar, aoln aolnVar) throws aois {
        defpackage.zir zirVar;
        ?? r11;
        ?? r2;
        defpackage.zke zkeVar;
        java.lang.Object objK;
        ?? r3;
        ailj ailjVar;
        defpackage.ziu ziuVar;
        if (aolnVar instanceof defpackage.zir) {
            zirVar = (defpackage.zir) aolnVar;
            int i = zirVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zirVar.e = i - Integer.MIN_VALUE;
            } else {
                zirVar = new defpackage.zir(this, aolnVar);
            }
        } else {
            zirVar = new defpackage.zir(this, aolnVar);
        }
        java.lang.Object objAe = zirVar.c;
        aolu aoluVar = aolu.a;
        int i2 = zirVar.e;
        if (i2 == 0) {
            aooc.af(objAe);
            defpackage.zki zkiVar = (defpackage.zki) this.e.a(albhVar);
            if (zkiVar != null) {
                defpackage.afpl afplVar = this.g;
                zirVar.a = albhVar;
                zirVar.e = 1;
                objAe = afplVar.ae(zkiVar, zirVar);
                if (objAe == aoluVar) {
                    r11 = albhVar;
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i2 == 1) {
            java.lang.Object obj = zirVar.a;
            aooc.af(objAe);
            r11 = obj;
        } else if (i2 == 2) {
            zkeVar = zirVar.f;
            java.lang.Object obj2 = zirVar.a;
            aooc.af(objAe);
            r2 = obj2;
            objK = this.f.e().k();
            aooh.e(objK, "iterator(...)");
            r3 = r2;
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objK = zirVar.b;
            zkeVar = zirVar.f;
            java.lang.Object obj3 = zirVar.a;
            aooc.af(objAe);
            r3 = obj3;
        }
        do {
            ailjVar = (ailj) objK;
            if (!ailjVar.hasNext()) {
                return aojh.a;
            }
            ziuVar = (defpackage.ziu) ailjVar.next();
            zirVar.a = r3;
            zirVar.f = zkeVar;
            zirVar.b = objK;
            zirVar.e = 3;
        } while (ziuVar.a() != aoluVar);
        return aoluVar;
        r11 = albhVar;
        defpackage.zke zkeVar2 = (defpackage.zke) ajsz.bG((java.util.List) objAe);
        aimz aimzVar = a;
        aimzVar.b().l("com/google/android/dialershared/crosssurfacefeature/relay/integration/featureplatform/FeaturePlatformOutboundEventDispatcher", "sendOutboundEventThroughDfp", 99, "FeaturePlatformOutboundEventDispatcher.kt").I("Message sent status %s for outbound event %s", zkeVar2, (java.lang.Object) r11);
        if (zkeVar2 != null) {
            if (zkeVar2 == defpackage.zke.SYNTHETIC_ID_NOT_AVAILABLE) {
                aimzVar.b().l("com/google/android/dialershared/crosssurfacefeature/relay/integration/featureplatform/FeaturePlatformOutboundEventDispatcher", "sendOutboundEventThroughDfp", 105, "FeaturePlatformOutboundEventDispatcher.kt").v("Synthetic call ID not available, waiting for synthetic call ID to send event.");
                ?? r4 = this.b;
                zirVar.a = r11;
                zirVar.f = zkeVar2;
                zirVar.e = 2;
                if (r4.b(r11, zirVar) == aoluVar) {
                    return aoluVar;
                }
            }
            r2 = r11;
            zkeVar = zkeVar2;
            objK = this.f.e().k();
            aooh.e(objK, "iterator(...)");
            r3 = r2;
            do {
                ailjVar = (ailj) objK;
                if (!ailjVar.hasNext()) {
                    ziuVar = (defpackage.ziu) ailjVar.next();
                    zirVar.a = r3;
                    zirVar.f = zkeVar;
                    zirVar.b = objK;
                    zirVar.e = 3;
                }
            } while (ziuVar.a() != aoluVar);
            return aoluVar;
        }
        return aojh.a;
    }
}
