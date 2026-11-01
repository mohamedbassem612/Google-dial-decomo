package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dei extends defpackage.ebg {
    final /* synthetic */ defpackage.dem a;

    public dei(defpackage.dem demVar) {
        this.a = demVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ebg
    public final ebd a(int i) {
        defpackage.ajwz ajwzVar;
        ebd ebdVarR;
        defpackage.dem demVar = this.a;
        defpackage.deg degVar = demVar.a;
        if (degVar.e.b().P().a() == defpackage.emq.a || (ajwzVar = (defpackage.ajwz) demVar.q().a(i)) == null) {
            ebdVarR = demVar.r();
        } else {
            defpackage.dij dijVar = (defpackage.dij) ajwzVar.c;
            boolean zN = defpackage.aooh.n(dijVar.h().g(defpackage.din.o), java.lang.Boolean.TRUE);
            if (!zN || demVar.D()) {
                ebd ebdVarB = ebd.b();
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    rp$.ExternalSyntheticApiModelOutline0.m(ebdVarB.a, zN);
                } else {
                    ebdVarB.n(64, zN);
                }
                if (i == -1) {
                    android.view.ViewParent parentForAccessibility = degVar.getParentForAccessibility();
                    ebdVarB.J(parentForAccessibility instanceof android.view.View ? (android.view.View) parentForAccessibility : null);
                } else {
                    defpackage.dij dijVarJ = dijVar.j();
                    java.lang.Integer numValueOf = dijVarJ != null ? java.lang.Integer.valueOf(dijVarJ.c) : null;
                    if (numValueOf == null) {
                        defpackage.cwh.b(defpackage.a.bs(i, "semanticsNode ", " has null parent"));
                        throw new defpackage.aoiq();
                    }
                    defpackage.dik dikVar = degVar.p;
                    int iIntValue = numValueOf.intValue();
                    ebdVarB.K(degVar, iIntValue != dikVar.a().c ? iIntValue : -1);
                }
                ebdVarB.P(degVar, i);
                ebdVarB.p(demVar.L(ajwzVar));
                demVar.v(i, ebdVarB, dijVar);
                ebdVarR = ebdVarB;
            } else {
                ebdVarR = null;
            }
        }
        if (demVar.h) {
            if (i == demVar.d) {
                demVar.f = ebdVarR;
            }
            if (i == demVar.e) {
                demVar.g = ebdVarR;
            }
        }
        return ebdVarR;
    }

    @Override // defpackage.ebg
    public final ebd b(int i) {
        if (i != 1) {
            if (i == 2) {
                return a(this.a.d);
            }
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Unknown focus type: "));
        }
        int i2 = this.a.e;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.ebg
    public final void c(int i, ebd ebdVar, java.lang.String str, android.os.Bundle bundle) {
        this.a.t(i, ebdVar, str, bundle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x0211  */
    /* JADX WARN: Code duplicated, block: B:182:0x039b  */
    /* JADX WARN: Code duplicated, block: B:184:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:189:0x03af  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:193:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:196:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:197:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:207:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:216:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x044a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0467  */
    /* JADX WARN: Code duplicated, block: B:243:0x0490  */
    /* JADX WARN: Code duplicated, block: B:246:0x049c  */
    /* JADX WARN: Code duplicated, block: B:248:0x04a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x0521  */
    /* JADX WARN: Code duplicated, block: B:284:0x052b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x052f  */
    /* JADX WARN: Code duplicated, block: B:287:0x0534  */
    /* JADX WARN: Code duplicated, block: B:289:0x053d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:290:0x053f  */
    /* JADX WARN: Code duplicated, block: B:293:0x0544  */
    /* JADX WARN: Code duplicated, block: B:296:0x054b  */
    /* JADX WARN: Code duplicated, block: B:298:0x0553  */
    /* JADX WARN: Code duplicated, block: B:304:0x0574  */
    /* JADX WARN: Code duplicated, block: B:306:0x0578  */
    /* JADX WARN: Code duplicated, block: B:307:0x0581  */
    /* JADX WARN: Code duplicated, block: B:309:0x0589  */
    /* JADX WARN: Code duplicated, block: B:390:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:430:0x076a  */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x016c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Integer, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28 */
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
    @Override // defpackage.ebg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r22, int r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instruction units count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dei.d(int, int, android.os.Bundle):boolean");
    }
}
