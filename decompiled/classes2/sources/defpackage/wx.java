package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class wx {
    public static final float a(aolr aolrVar) {
        cmy cmyVar = aolrVar.get(cmy.a);
        float fA = cmyVar != null ? cmyVar.a() : 1.0f;
        if (fA < 0.0f) {
            defpackage.akf.b("negative scale factor");
        }
        return fA;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0114 -> B:41:0x0117). Please report as a decompilation issue!!! */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final java.lang.Object b(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Type inference failed for: r10v1, types: [aonj, java.lang.Object] */
    public static final java.lang.Object c(float f, float f2, float f3, aiq aiqVar, aonn aonnVar, aoln aolnVar) {
        nf nfVar = alo.a;
        java.lang.Float f4 = new java.lang.Float(f);
        java.lang.Float f5 = new java.lang.Float(f2);
        java.lang.Float f6 = new java.lang.Float(f3);
        ?? r10 = nfVar.a;
        aiw aiwVarC = (aiw) r10.a(f6);
        if (aiwVarC == null) {
            aiwVarC = ((aiw) r10.a(f4)).c();
        }
        aiw aiwVar = aiwVarC;
        java.lang.Object objB = b(new air(nfVar, f4, aiwVar, Long.MIN_VALUE, Long.MIN_VALUE, false), new defpackage.ala(aiqVar, nfVar, f4, f5, aiwVar), Long.MIN_VALUE, new nz(aonnVar, nfVar, 10, (byte[]) null), aolnVar);
        aolu aoluVar = aolu.a;
        if (objB != aoluVar) {
            objB = aojh.a;
        }
        return objB != aoluVar ? aojh.a : objB;
    }

    public static final java.lang.Object d(air airVar, java.lang.Object obj, aiq aiqVar, boolean z, aonj aonjVar, aoln aolnVar) {
        java.lang.Object objB = b(airVar, new defpackage.ala(aiqVar, airVar.e, airVar.a(), obj, airVar.a), z ? airVar.b : Long.MIN_VALUE, aonjVar, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    public static final void e(defpackage.aip aipVar, long j, float f, defpackage.ain ainVar, air airVar, aonj aonjVar) {
        long jA = f == 0.0f ? ainVar.a() : (long) ((j - aipVar.a) / f);
        aipVar.d = j;
        aipVar.b.b(ainVar.c(jA));
        aipVar.c = ainVar.b(jA);
        if (ainVar.d(jA)) {
            aipVar.e = aipVar.d;
            aipVar.d();
        }
        f(aipVar, airVar);
        aonjVar.a(aipVar);
    }

    public static final void f(defpackage.aip aipVar, air airVar) {
        airVar.c(aipVar.a());
        aiw aiwVar = airVar.a;
        aiw aiwVar2 = aipVar.c;
        int iB = aiwVar.b();
        for (int i = 0; i < iB; i++) {
            aiwVar.e(i, aiwVar2.a(i));
        }
        airVar.c = aipVar.e;
        airVar.b = aipVar.d;
        airVar.d = aipVar.c();
    }

    public static /* synthetic */ java.lang.Object g(float f, float f2, aiq aiqVar, aonn aonnVar, aoln aolnVar, int i) {
        if ((i & 8) != 0) {
            aiqVar = new aku(1.0f, 1500.0f, (java.lang.Object) null);
        }
        return c(f, f2, 0.0f, aiqVar, aonnVar, aolnVar);
    }

    public static final boolean h(defpackage.dkx dkxVar) {
        if (dkxVar != null) {
            return dkxVar.a == null && dkxVar.b == null && dkxVar.c == null && dkxVar.d == null;
        }
        return true;
    }

    public static final defpackage.dje i(djg djgVar) {
        return new defpackage.dje(djgVar.a, djgVar.b, djgVar.c, djgVar.d);
    }

    public static final dja j(boolean z) {
        return z ? dja.a : dja.b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final void k(vx vxVar, android.content.Context context, java.lang.CharSequence charSequence, long j) {
        if (dky.f(j) || ((dji) charSequence).a() == 0) {
            return;
        }
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        ?? A = defpackage.bhb.a.a(context);
        if (A.isEmpty()) {
            return;
        }
        vxVar.m();
        int size = A.size();
        for (int i = 0; i < size; i++) {
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) A.get(i);
            defpackage.xa.j(vxVar, new defpackage.bhc(i), resolveInfo.loadLabel(packageManager).toString(), 0, new defpackage.abeu(context, resolveInfo, charSequence, j, 1));
        }
        vxVar.m();
    }

    public static final java.lang.Object l(air airVar, kaw kawVar, boolean z, aonj aonjVar, aoln aolnVar) {
        java.lang.Object objB = b(airVar, new defpackage.ajc(kawVar, airVar.e, airVar.a(), airVar.a), z ? airVar.b : Long.MIN_VALUE, aonjVar, aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    private static final java.lang.Object m(defpackage.ain ainVar, aonj aonjVar, aoln aolnVar) {
        if (ainVar.e()) {
            return defpackage.wt.a(aonjVar, aolnVar);
        }
        return cdh.d(aolnVar.u()).a(new agb(aonjVar, 9), aolnVar);
    }
}
