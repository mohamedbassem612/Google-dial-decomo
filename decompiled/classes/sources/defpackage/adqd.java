package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adqd implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ adqd(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.Executor, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ajct, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.Executor] */
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
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        defpackage.ajsu ajsuVar;
        int i = this.$cid;
        if (i == 0) {
            ?? r0 = this.b;
            java.lang.Object obj = this.a;
            defpackage.adqe adqeVar = (defpackage.adqe) obj;
            adqeVar.d = defpackage.aiql.r(r0);
            adqeVar.e = (defpackage.adon) this.c;
            defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.nya(obj, 5));
            r0.execute(ajdkVar);
            return ajdkVar;
        }
        if (i == 1) {
            return defpackage.ahvr.H((defpackage.ajcq) ((defpackage.jvv) this.a).c.eZ(), new jvq(2), this.b);
        }
        int i2 = 3;
        if (i == 2) {
            ?? r1 = this.b;
            r1.getClass();
            java.lang.Object obj2 = this.c;
            obj2.getClass();
            defpackage.adqn adqnVar = (defpackage.adqn) this.a;
            defpackage.adon adonVar = (defpackage.adon) obj2;
            return defpackage.ajck.w(adqnVar.c.c(r1, adonVar)).y(new defpackage.accg(adqnVar, (java.util.concurrent.ExecutorService) r1, adonVar, i2), r1);
        }
        int i3 = 0;
        if (i == 3) {
            ((defpackage.aimw) ((defpackage.aimw) defpackage.adrg.a.b()).l("com/google/android/libraries/micore/telephony/common/resourcemanagers/superpacks/SuperpacksWrapperImpl", "initializeWithManifestDir", 75, "SuperpacksWrapperImpl.java")).v("initialize(): starting to initialize SuperpacksWrapperImpl.");
            java.lang.Object obj3 = this.c;
            ?? r2 = this.b;
            return r2.submit(new defpackage.adre((defpackage.adrg) this.a, (android.content.Context) obj3, r2, i3));
        }
        if (i == 4) {
            int i4 = defpackage.airu.a;
            int i5 = defpackage.airz.a;
            defpackage.airy airyVar = new defpackage.airy();
            airyVar.h(((java.lang.String) this.a).getBytes());
            airyVar.a.put((byte) 0);
            airyVar.d();
            airyVar.h(((java.lang.String) this.b).getBytes());
            return ((defpackage.aish) ((defpackage.aogc) this.c).a).k(airyVar.o().d());
        }
        java.lang.Object obj4 = this.b;
        java.lang.Object obj5 = this.a;
        java.lang.Object obj6 = this.c;
        try {
            java.lang.Object obj7 = ((defpackage.afab) obj5).b;
            defpackage.ajsu ajsuVar2 = defpackage.ajsv.a;
            if (obj7 == null || obj4 == null) {
                throw null;
            }
            android.content.Intent intent = new android.content.Intent("com.google.android.build.data.Properties");
            intent.setPackage((java.lang.String) obj4);
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = ((android.content.pm.PackageManager) obj7).queryIntentServices(intent, 787072);
            if (listQueryIntentServices.isEmpty()) {
                ajsuVar = defpackage.ajsv.a;
            } else {
                if (listQueryIntentServices.size() > 1) {
                    throw new java.io.IOException("Failed to resolve target AndroidBuildData");
                }
                int i6 = listQueryIntentServices.get(0).serviceInfo.metaData.getInt("com.google.android.build.data.properties");
                if (i6 == 0) {
                    ajsuVar = defpackage.ajsv.a;
                } else {
                    try {
                        java.io.InputStream inputStreamOpenRawResource = ((defpackage.afaa) obj6).a().openRawResource(i6);
                        defpackage.alad aladVarD = defpackage.alad.D(defpackage.ajsu.a, defpackage.akzf.J(inputStreamOpenRawResource, 4096), defpackage.akzq.a);
                        defpackage.alad.V(aladVarD);
                        ajsuVar = (defpackage.ajsu) aladVarD;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        ajsuVar = defpackage.ajsv.a;
                    }
                }
            }
            return java.lang.Long.valueOf(ajsuVar.b);
        } catch (java.io.IOException e) {
            android.util.Log.e("PhenotypeResourceReader", "Failed to read baseline CL for package ".concat(java.lang.String.valueOf(obj4)), e);
            return -1L;
        }
    }

    public /* synthetic */ adqd(java.lang.Object obj, java.util.concurrent.ExecutorService executorService, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = executorService;
        this.c = obj2;
    }

    public /* synthetic */ adqd(defpackage.jvv jvvVar, defpackage.jvs jvsVar, defpackage.ajct ajctVar, int i) {
        this.$cid = i;
        this.a = jvvVar;
        this.c = jvsVar;
        this.b = ajctVar;
    }
}
