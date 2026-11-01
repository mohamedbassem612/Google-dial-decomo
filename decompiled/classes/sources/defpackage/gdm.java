package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gdm extends defpackage.aomh implements defpackage.aonn {
    java.lang.Object a;
    java.lang.Object b;
    boolean c;
    int d;
    final /* synthetic */ defpackage.aonj e;
    final /* synthetic */ defpackage.kaw f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdm(defpackage.kaw kawVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        super(2, aolnVar);
        this.f = kawVar;
        this.e = aonjVar;
    }

    @Override // defpackage.aonn
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.gdm) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aoss] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [ajxw] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aoub] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aoub] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [aoln, gdm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aoln, gdm] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [ajxw] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        java.lang.Object obj3;
        boolean zBooleanValue;
        ?? r0 = (defpackage.aoss) this.g;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        ?? r2 = this.d;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    java.lang.Object obj4 = this.a;
                    defpackage.aooc.af(obj);
                    obj3 = obj4;
                } else if (r2 == 2) {
                    boolean z = this.c;
                    java.lang.Object obj5 = this.a;
                    defpackage.aooc.af(obj);
                    r0 = z;
                    r2 = obj5;
                    r0 = zBooleanValue;
                    r2 = obj3;
                    defpackage.kaw kawVar = this.f;
                    this.g = null;
                    this.a = null;
                    this.c = r0;
                    this.d = 3;
                    this = ((defpackage.ajxw) kawVar.a).g(r2, this);
                    if (this == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (r2 != 3) {
                        obj2 = this.b;
                        defpackage.aooc.af(obj);
                        throw ((java.lang.Throwable) obj2);
                    }
                    defpackage.aooc.af(obj);
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj);
            defpackage.aolp aolpVar = r0.c().get(defpackage.aoub.d);
            if (aolpVar == null) {
                throw new java.lang.IllegalStateException("Internal error. coroutineScope should've created a job.");
            }
            defpackage.kaw kawVar2 = this.f;
            defpackage.aoub aoubVar = (defpackage.aoub) aolpVar;
            this.g = null;
            this.a = aoubVar;
            this.d = 1;
            java.lang.Object objH = ((defpackage.ajxw) kawVar2.a).h(aoubVar, this);
            if (objH == aoluVar) {
                return aoluVar;
            }
            obj3 = aoubVar;
            obj = objH;
            zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            if (zBooleanValue) {
                defpackage.aonj aonjVar = this.e;
                this.g = null;
                this.a = obj3;
                this.c = true;
                this.d = 2;
                if (aonjVar.a(this) == aoluVar) {
                    r0 = zBooleanValue;
                    r2 = obj3;
                    return aoluVar;
                }
                r0 = zBooleanValue;
                r2 = obj3;
                defpackage.kaw kawVar3 = this.f;
                this.g = null;
                this.a = null;
                this.c = r0;
                this.d = 3;
                this = ((defpackage.ajxw) kawVar3.a).g(r2, this);
                if (this == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        } catch (java.lang.Throwable th) {
            defpackage.kaw kawVar4 = this.f;
            this.g = null;
            this.a = null;
            this.b = th;
            this.c = r0;
            this.d = 4;
            if (((defpackage.ajxw) kawVar4.a).g(r2, this) == aoluVar) {
                return aoluVar;
            }
            obj2 = th;
        }
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.gdm gdmVar = new defpackage.gdm(this.f, this.e, aolnVar);
        gdmVar.g = obj;
        return gdmVar;
    }
}
