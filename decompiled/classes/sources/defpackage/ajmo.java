package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajmo {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public ajmo(defpackage.afaa afaaVar, java.lang.String str, final int i, final int i2) {
        j$.util.Objects.requireNonNull(afaaVar);
        this.c = afaaVar;
        this.b = str;
        this.a = new defpackage.aezy(new defpackage.ahzi() { // from class: aezz
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
                defpackage.akzx akzxVarM = defpackage.ajsy.a.m();
                defpackage.ajmo ajmoVar = this.c;
                int i3 = i;
                try {
                    java.lang.Object obj = ajmoVar.c;
                    android.content.res.Resources resourcesA = ((defpackage.afaa) obj).a();
                    if (resourcesA == null) {
                        android.util.Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from " + ((defpackage.afaa) ajmoVar.c).a);
                        return null;
                    }
                    try {
                        ajmoVar.b(akzxVarM, resourcesA, i3);
                        long jLongValue = ((java.lang.Long) ((defpackage.afaa) obj).c.eZ()).longValue();
                        akzxVarM.u();
                        defpackage.ajsy ajsyVar = (defpackage.ajsy) akzxVarM.b;
                        ajsyVar.b |= 128;
                        ajsyVar.n = jLongValue;
                        java.lang.String strC = defpackage.afab.c(ajsyVar.g);
                        java.lang.Object obj2 = ajmoVar.b;
                        defpackage.ahvr.cc(strC.equals(obj2), "Resource package does not match expected package, expected package: %s", obj2);
                        defpackage.ajsy ajsyVar2 = (defpackage.ajsy) akzxVarM.b;
                        java.lang.String strBE = ajsyVar2.g;
                        java.lang.Object obj3 = ajmoVar.c;
                        boolean z = ajsyVar2.h;
                        if (strBE.isEmpty()) {
                            throw new java.lang.IllegalArgumentException("Empty configuration package");
                        }
                        defpackage.afaa afaaVar2 = (defpackage.afaa) obj3;
                        java.lang.String str2 = afaaVar2.a;
                        if (z) {
                            if (strBE.indexOf(35) >= 0) {
                                throw new java.lang.IllegalArgumentException(java.lang.String.format("When %s is present, %s should not contain subpackage separator %s (config package=%s)", "auto-subpackage", "configuration-package", '#', strBE));
                            }
                            strBE = defpackage.a.bE(str2, (byte) 35, strBE);
                        }
                        if (((defpackage.ajsy) akzxVarM.b).c != 2) {
                            java.lang.Integer num = (java.lang.Integer) afaaVar2.d.eZ();
                            num.intValue();
                            akzxVarM.u();
                            defpackage.ajsy ajsyVar3 = (defpackage.ajsy) akzxVarM.b;
                            ajsyVar3.c = 2;
                            ajsyVar3.d = num;
                        }
                        int i4 = i2;
                        akzxVarM.u();
                        defpackage.ajsy ajsyVar4 = (defpackage.ajsy) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strBE);
                        ajsyVar4.b |= 1;
                        ajsyVar4.g = strBE;
                        akzxVarM.u();
                        defpackage.ajsy ajsyVar5 = (defpackage.ajsy) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str2);
                        ajsyVar5.e = 7;
                        ajsyVar5.f = str2;
                        akzxVarM.u();
                        defpackage.ajsy ajsyVar6 = (defpackage.ajsy) akzxVarM.b;
                        ajsyVar6.m = 3;
                        ajsyVar6.b |= 32;
                        if (i4 == 0) {
                            return (defpackage.ajsy) akzxVarM.r();
                        }
                        defpackage.akzx akzxVarM2 = defpackage.aezx.a.m();
                        try {
                            ajmoVar.b(akzxVarM2, resourcesA, i4);
                            java.lang.String str3 = ((defpackage.aezx) akzxVarM2.b).c;
                            java.lang.Object obj4 = ajmoVar.b;
                            defpackage.ahvr.ce(str3.equals(obj4), "Package in HeterodyneInfo binary %s does not match resource lookup for %s", ((defpackage.aezx) akzxVarM2.b).c, obj4);
                            akzxVarM2.u();
                            defpackage.aezx aezxVar = (defpackage.aezx) akzxVarM2.b;
                            aezxVar.b &= -2;
                            aezxVar.c = defpackage.aezx.a.c;
                            defpackage.akzc akzcVarF = ((defpackage.aezx) akzxVarM2.r()).f();
                            akzxVarM.u();
                            defpackage.ajsy ajsyVar7 = (defpackage.ajsy) akzxVarM.b;
                            j$.util.Objects.requireNonNull(akzcVarF);
                            ajsyVar7.b |= 256;
                            ajsyVar7.o = akzcVarF;
                            return (defpackage.ajsy) akzxVarM.r();
                        } catch (java.io.IOException unused) {
                            android.util.Log.i("PhenotypeResourceReader", "Failed to read Phenotype HeterodyneInfo resources from ".concat(java.lang.String.valueOf(((defpackage.afaa) ajmoVar.c).a)));
                            return null;
                        }
                    } catch (java.io.IOException | java.lang.NullPointerException unused2) {
                        android.util.Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(java.lang.String.valueOf(((defpackage.afaa) ajmoVar.c).a)));
                        return null;
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                    android.util.Log.i("PhenotypeResourceReader", "Failed to read Phenotype registration resources from ".concat(java.lang.String.valueOf(((defpackage.afaa) ajmoVar.c).a)));
                    return null;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahzi, java.lang.Object] */
    public final defpackage.ajsy a() {
        return (defpackage.ajsy) this.a.eZ();
    }

    public final void b(defpackage.albg albgVar, android.content.res.Resources resources, int i) throws java.io.IOException {
        java.io.InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        try {
            ((defpackage.afaa) this.c).f.a++;
            ((defpackage.akzx) albgVar).j(defpackage.akzf.J(inputStreamOpenRawResource, java.lang.Math.max(512, java.lang.Math.min(4096, inputStreamOpenRawResource.available()))), defpackage.akzq.a);
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
        } catch (java.lang.Throwable th) {
            if (inputStreamOpenRawResource != null) {
                try {
                    inputStreamOpenRawResource.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ajmn, java.lang.Object] */
    public final java.lang.Object c(defpackage.aiql aiqlVar) {
        return this.c.a(aiqlVar);
    }

    public ajmo(java.lang.Class cls, java.lang.Class cls2, defpackage.ajmn ajmnVar) {
        this.c = ajmnVar;
        this.a = cls;
        this.b = cls2;
    }
}
