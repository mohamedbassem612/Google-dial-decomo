package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zop extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.zpc e;
    final /* synthetic */ defpackage.zoq f;
    final /* synthetic */ defpackage.zot g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zop(defpackage.zpc zpcVar, defpackage.zoq zoqVar, defpackage.zot zotVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = zpcVar;
        this.f = zoqVar;
        this.g = zotVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Exception exc;
        java.lang.Object obj2;
        aomy aomyVar;
        java.lang.Object obj3;
        aomy aomyVar2;
        java.lang.Object obj4;
        aomy aomyVar3;
        java.lang.Object obj5;
        java.lang.Object obj6;
        aolu aoluVar = aolu.a;
        int i = this.d;
        try {
            try {
                if (i != 0) {
                    try {
                        if (i != 1) {
                            java.lang.Object obj7 = this.c;
                            if (i != 2) {
                                obj2 = this.b;
                                exc = (java.lang.Exception) this.a;
                                aooc.af(obj);
                                obj3 = obj7;
                                try {
                                    ((defpackage.zoq) obj3).d = new defpackage.zou(exc);
                                    ((apdp) obj2).d();
                                    this.g.d.a(ajcm.a);
                                    return aojh.a;
                                } catch (java.lang.Throwable th) {
                                    ((apdp) obj2).d();
                                    throw th;
                                }
                            }
                            java.lang.Object obj8 = this.b;
                            obj4 = this.a;
                            aooc.af(obj);
                            obj6 = obj8;
                            obj5 = obj7;
                        } else {
                            aooc.af(obj);
                        }
                        ((defpackage.zoq) obj5).d = new defpackage.zow(obj4);
                        ((apdp) obj6).d();
                        this.g.d.a(ajcm.a);
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        ((apdp) obj6).d();
                        throw th2;
                    }
                }
                aooc.af(obj);
                defpackage.zpc zpcVar = this.e;
                if (zpcVar != null && (aomyVar2 = zpcVar.a) != null) {
                    aomyVar2.a();
                }
                aonj aonjVar = this.f.a;
                this.d = 1;
                obj = aonjVar.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                defpackage.zpc zpcVar2 = this.e;
                if (zpcVar2 != null && (aomyVar3 = zpcVar2.b) != null) {
                    aomyVar3.a();
                }
                defpackage.zoq zoqVar = this.f;
                apdp apdpVar = zoqVar.c;
                this.a = obj;
                this.b = apdpVar;
                this.c = zoqVar;
                this.d = 2;
                if (apdpVar.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj4 = obj;
                obj6 = apdpVar;
                obj5 = zoqVar;
                ((defpackage.zoq) obj5).d = new defpackage.zow(obj4);
                ((apdp) obj6).d();
                this.g.d.a(ajcm.a);
                return aojh.a;
            } catch (java.lang.Exception e) {
                exc = e;
                defpackage.zpc zpcVar3 = this.e;
                if (zpcVar3 != null && (aomyVar = zpcVar3.c) != null) {
                    aomyVar.a();
                }
                defpackage.zot.a.b().k(exc).l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache$CachedComputation", "startCacheComputation$<anonymous>$<anonymous>", 232, "BlockingInCallCache.kt").v("Computation failed.");
                defpackage.zoq zoqVar2 = this.f;
                apdp apdpVar2 = zoqVar2.c;
                this.a = exc;
                this.b = apdpVar2;
                this.c = zoqVar2;
                this.d = 3;
                if (apdpVar2.b(this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = apdpVar2;
                obj3 = zoqVar2;
            }
        } catch (java.lang.Throwable th3) {
            this.g.d.a(ajcm.a);
            throw th3;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.zop(this.e, this.f, this.g, aolnVar);
    }
}
