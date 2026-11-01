package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amxk implements defpackage.eoe {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public amxk(defpackage.amxg amxgVar, defpackage.hjo hjoVar, int i) {
        this.$cid = i;
        this.a = hjoVar;
        j$.util.Objects.requireNonNull(amxgVar);
    }

    @Override // defpackage.eoe
    public final /* synthetic */ defpackage.eoa a(java.lang.Class cls) {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.enn.d(cls);
        }
        if (i != 1) {
            return i != 2 ? defpackage.enn.d(cls) : defpackage.enn.d(cls);
        }
        return defpackage.enn.d(cls);
    }

    @Override // defpackage.eoe
    public final defpackage.eoa b(java.lang.Class cls, defpackage.eoq eoqVar) {
        defpackage.eoa eoaVar;
        defpackage.amwz amwzVarC;
        int i = this.$cid;
        if (i == 0) {
            defpackage.amxw amxwVar = new defpackage.amxw(eoqVar);
            defpackage.amyl amylVar = (defpackage.amyl) eoqVar.a(defpackage.amyj.a);
            defpackage.agxr agxrVarNt = ((defpackage.amxl) defpackage.aooc.ar(defpackage.anty.aA(((android.content.Context) this.a).getApplicationContext()), defpackage.amxl.class)).nt();
            agxrVarNt.c = amxwVar;
            if (amylVar == null) {
                amylVar = defpackage.amyl.a;
            }
            agxrVarNt.b = amylVar;
            defpackage.aooc.an(agxrVarNt.c, defpackage.amxw.class);
            defpackage.aooc.an(agxrVarNt.b, defpackage.amyl.class);
            return new defpackage.amxm(new defpackage.hkh((him) agxrVarNt.a, (defpackage.amxw) agxrVarNt.c), amxwVar);
        }
        if (i != 1) {
            if (i != 2) {
                defpackage.amxw amxwVar2 = new defpackage.amxw(eoqVar);
                defpackage.amyl amylVar2 = (defpackage.amyl) eoqVar.a(defpackage.amyj.c);
                java.lang.Object obj = this.a;
                if (!(obj instanceof defpackage.amyq)) {
                    throw new java.lang.IllegalStateException("ScreenRetainedComponent cannot be instantiated without a host");
                }
                defpackage.hjd hjdVarD = ((defpackage.amxz) defpackage.aooc.ar(((defpackage.amxj) ((defpackage.amyq) obj).b()).b(), defpackage.amxz.class)).d();
                hjdVarD.b = amxwVar2;
                if (amylVar2 == null) {
                    amylVar2 = defpackage.amyl.a;
                }
                hjdVarD.c = amylVar2;
                defpackage.aooc.an(hjdVarD.b, defpackage.amxw.class);
                defpackage.aooc.an(hjdVarD.c, defpackage.amyl.class);
                return new defpackage.amya(new defpackage.hkp(hjdVarD.a, hjdVarD.d), amxwVar2);
            }
            defpackage.amxw amxwVar3 = new defpackage.amxw(eoqVar);
            java.lang.Object obj2 = this.a;
            java.lang.Object obj3 = obj2;
            while (true) {
                if (obj3 == null) {
                    defpackage.aw awVar = (defpackage.aw) obj2;
                    defpackage.ajsz.dA(awVar.X() instanceof defpackage.amyq, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", awVar.X().getClass());
                    amwzVarC = ((defpackage.amxj) ((defpackage.amyq) awVar.X()).b()).c();
                    break;
                }
                if (obj3 instanceof defpackage.amyq) {
                    defpackage.amyp amypVarB = ((defpackage.amyq) obj3).b();
                    if (amypVarB instanceof defpackage.amxj) {
                        amwzVarC = ((defpackage.amxj) amypVarB).c();
                        break;
                    }
                }
                obj3 = ((defpackage.aw) obj3).E;
            }
            defpackage.amyl amylVar3 = (defpackage.amyl) eoqVar.a(defpackage.amyj.b);
            defpackage.hjd hjdVarB = ((defpackage.amxs) defpackage.aooc.ar(amwzVarC, defpackage.amxs.class)).b();
            hjdVarB.b = amxwVar3;
            if (amylVar3 == null) {
                amylVar3 = defpackage.amyl.a;
            }
            hjdVarB.c = amylVar3;
            defpackage.aooc.an(hjdVarB.b, defpackage.amxw.class);
            defpackage.aooc.an(hjdVarB.c, defpackage.amyl.class);
            return new defpackage.amxt(new defpackage.hkk(hjdVarB.a, hjdVarB.d), amxwVar3);
        }
        final defpackage.amxh amxhVar = new defpackage.amxh();
        defpackage.amyk amykVar = (defpackage.amyk) eoqVar.a(defpackage.amyk.b);
        if (amykVar == null) {
            amykVar = defpackage.amyk.a;
        }
        defpackage.amyl amylVar4 = (defpackage.amyl) eoqVar.a(defpackage.amyj.d);
        defpackage.hjo hjoVar = (defpackage.hjo) this.a;
        hjoVar.b = defpackage.env.a(eoqVar);
        hjoVar.c = amxhVar;
        amykVar.getClass();
        hjoVar.d = amykVar;
        if (amylVar4 == null) {
            amylVar4 = defpackage.amyl.a;
        }
        hjoVar.e = amylVar4;
        defpackage.aooc.an(hjoVar.b, defpackage.enr.class);
        defpackage.aooc.an(hjoVar.c, defpackage.amww.class);
        defpackage.aooc.an(hjoVar.d, defpackage.amyk.class);
        defpackage.aooc.an(hjoVar.e, defpackage.amyl.class);
        defpackage.hkt hktVar = new defpackage.hkt(hjoVar.a, hjoVar.f, hjoVar.b, hjoVar.c);
        defpackage.aoin aoinVar = (defpackage.aoin) ((defpackage.amxf) defpackage.aooc.ar(hktVar, defpackage.amxf.class)).b().get(cls);
        defpackage.aonj aonjVar = (defpackage.aonj) eoqVar.a(defpackage.amxg.a);
        java.lang.Object obj4 = ((defpackage.amxf) defpackage.aooc.ar(hktVar, defpackage.amxf.class)).a().get(cls);
        if (obj4 == null) {
            if (aonjVar != null) {
                throw new java.lang.IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
            }
            if (aoinVar == null) {
                throw new java.lang.IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
            }
            eoaVar = (defpackage.eoa) aoinVar.a();
        } else {
            if (aoinVar != null) {
                throw new java.lang.AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            if (aonjVar == null) {
                throw new java.lang.IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
            }
            eoaVar = (defpackage.eoa) aonjVar.a(obj4);
        }
        j$.util.Objects.requireNonNull(amxhVar);
        java.lang.AutoCloseable autoCloseable = new java.lang.AutoCloseable() { // from class: amxd
            @Override // java.lang.AutoCloseable
            public final void close() {
                amxhVar.b();
            }
        };
        defpackage.epa epaVar = eoaVar.h;
        if (epaVar.c) {
            defpackage.epa.a(autoCloseable);
            return eoaVar;
        }
        synchronized (epaVar.d) {
            epaVar.b.add(autoCloseable);
        }
        return eoaVar;
    }

    @Override // defpackage.eoe
    public final /* synthetic */ defpackage.eoa c(defpackage.aopu aopuVar, defpackage.eoq eoqVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Class cls = ((defpackage.aooa) aopuVar).b;
            if (cls == null) {
                defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            }
            return b(cls, eoqVar);
        }
        if (i == 1) {
            return defpackage.enn.c(this, aopuVar, eoqVar);
        }
        if (i != 2) {
            java.lang.Class cls2 = ((defpackage.aooa) aopuVar).b;
            if (cls2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            }
            return b(cls2, eoqVar);
        }
        java.lang.Class cls3 = ((defpackage.aooa) aopuVar).b;
        if (cls3 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        }
        return b(cls3, eoqVar);
    }

    public amxk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public amxk(defpackage.amxo amxoVar, android.content.Context context, int i) {
        this.$cid = i;
        this.a = context;
        j$.util.Objects.requireNonNull(amxoVar);
    }
}
