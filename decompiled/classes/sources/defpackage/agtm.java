package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agtm extends defpackage.agtj implements defpackage.emj {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl");
    private defpackage.agtn b;
    private final defpackage.aoin c;
    private final defpackage.eoi d;
    private final defpackage.ems e;
    private final defpackage.agtl f = new defpackage.agtl();
    private boolean g = false;
    private boolean h = false;
    private final java.util.Set i = new java.util.HashSet();

    public agtm(defpackage.aoin aoinVar, defpackage.eoi eoiVar, defpackage.ems emsVar) {
        this.c = aoinVar;
        this.d = eoiVar;
        emsVar.c(this);
        this.e = emsVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    private final void l() throws afeb {
        this.h = true;
        android.os.Handler handlerA = defpackage.afec.a();
        defpackage.agtl agtlVar = this.f;
        handlerA.removeCallbacks(agtlVar);
        agtlVar.a.clear();
        agtlVar.b = null;
        this.g = true;
        defpackage.agtn agtnVar = this.b;
        agtnVar.e = true;
        defpackage.agti agtiVar = agtnVar.b;
        agtiVar.g();
        for (com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture parcelableFuture : agtnVar.c) {
            if (parcelableFuture.b) {
                try {
                    agtiVar.b(parcelableFuture.a);
                } catch (java.lang.NullPointerException e) {
                    throw new java.lang.IllegalStateException("future=".concat(java.lang.String.valueOf(java.lang.String.valueOf(parcelableFuture))), e);
                }
            } else {
                defpackage.agtn.a((defpackage.agtk) agtiVar.b(parcelableFuture.a), parcelableFuture);
            }
            parcelableFuture.c(agtnVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.emj
    public final void a(defpackage.emx emxVar) throws afeb {
        this.b = (defpackage.agtn) new defpackage.eog(this.d).a(defpackage.agtn.class);
        java.util.Set set = this.i;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            this.b.c((defpackage.agtk) it.next());
        }
        set.clear();
    }

    @Override // defpackage.emj
    public final void b(defpackage.emx emxVar) {
        defpackage.agtn agtnVar = this.b;
        defpackage.ahvr.bZ(!agtnVar.e, "FuturesMixinViewModel.stopCallbacks() must be called before it becomes detached from its parent.");
        agtnVar.b.c();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.emj
    public final void e(defpackage.emx emxVar) throws afeb {
        defpackage.ahvr.bZ(!this.g, "FuturesMixin.onStart() was manually invoked, and is now re-running.");
        l();
    }

    @Override // defpackage.emj
    public final void f(defpackage.emx emxVar) {
        if (this.g) {
            defpackage.agtn agtnVar = this.b;
            agtnVar.e = false;
            java.util.Iterator it = agtnVar.c.iterator();
            while (it.hasNext()) {
                ((com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture) it.next()).c((defpackage.agtn) null);
            }
            this.g = false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.emj
    public final void fn(defpackage.emx emxVar) throws afeb {
        if (this.g) {
            return;
        }
        l();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.agtj
    protected final void g(defpackage.ajcq ajcqVar, java.lang.Object obj, defpackage.agtk agtkVar) throws afeb {
        defpackage.afec.c();
        defpackage.ahvr.bZ(!((defpackage.bo) this.c.a()).ac(), "Futures should not be triggered by lifecycle changes, and cannot be listened to while a Fragment is stopped. Consider using SubscriptionMixin instead. See go/tiktok/concurrent/futuresmixin.md. listen() was called while the Fragment's state is saved - work started at this point in the lifecycle can't be persisted, and can lose state.");
        defpackage.ahou ahouVar = defpackage.ahpc.a;
        defpackage.ahpj ahpjVarB = defpackage.ahns.b();
        if (ahpjVarB != null) {
            defpackage.ahor ahorVarK = ahpjVarB.k(defpackage.ahpc.b);
            if (ahorVarK.b() && ((java.lang.Boolean) ahorVarK.a()).booleanValue()) {
                android.os.StrictMode.noteSlowCall("FuturesMixin called from Lifecycle");
            }
        }
        this.b.b(ajcqVar, obj, agtkVar);
        if (this.g) {
            return;
        }
        java.lang.Throwable th = new java.lang.Throwable();
        th.fillInStackTrace();
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(th)).l("com/google/apps/tiktok/concurrent/futuresmixin/FuturesMixinImpl", "listen", (char) 216, "FuturesMixinImpl.java")).v("listen() called outside listening window");
        defpackage.agtl agtlVar = this.f;
        agtlVar.a.add(agtkVar);
        agtlVar.b = defpackage.ahqx.h(new fvl(this, 20));
        defpackage.afec.f(agtlVar);
        defpackage.afec.e(agtlVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    @Override // defpackage.agtj
    public final void h(defpackage.agtk agtkVar) throws afeb {
        defpackage.afec.c();
        defpackage.ahvr.bZ(!this.h, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        defpackage.ahvr.bZ(!this.e.a().a(defpackage.emq.d), "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        defpackage.ahvr.bZ(!this.g, "FuturesMixin.registerCallback() was called after creation. FuturesMixin.registerCallback() must be called exactly once for each callback, in the peer's constructor or onCreate().");
        defpackage.agtn agtnVar = this.b;
        if (agtnVar != null) {
            agtnVar.c(agtkVar);
        } else {
            this.i.add(agtkVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ajcq, java.lang.Object] */
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
    @Override // defpackage.agtj
    public final void k(zoe zoeVar, zoe zoeVar2, defpackage.agtk agtkVar) throws afeb {
        defpackage.afec.c();
        defpackage.ahvr.bZ(!((defpackage.bo) this.c.a()).ac(), "Listen called outside safe window. State loss is possible.");
        this.b.b(zoeVar.a, zoeVar2.a, agtkVar);
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }
}
