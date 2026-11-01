package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hty extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hty(defpackage.qa qaVar, defpackage.qz qzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = qaVar;
        this.c = "android";
        this.d = qzVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aows) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoxi) obj, (aoln) obj2).b(aojh.a);
        }
        return c((defpackage.arl) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Type inference failed for: r11v9, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, qa] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        java.lang.Exception exc;
        aows aowsVar;
        int i = this.$cid;
        if (i != 0) {
            if (i == 1) {
                defpackage.arl arlVar = (defpackage.arl) this.e;
                aolu aoluVar = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                if (i2 == 0) {
                    ?? r11 = this.c;
                    afx afxVar = new afx(arlVar, this.b, this.d, 3, (char[]) null);
                    this.e = null;
                    this.a = 1;
                    if (r11.a(afxVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 == 0) {
                aoxi aoxiVar = (aoxi) this.e;
                java.lang.Object obj2 = this.d;
                tgq tgqVar = (tgq) obj2;
                aoxh aoxhVarA = tgqVar.a((tei) this.b, (java.util.List) this.c);
                this.a = 1;
                if (aoov.aG(aoxiVar, aoxhVarA, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        aolu aoluVar3 = aolu.a;
        if (this.a != 0) {
            aowsVar = (aows) this.e;
            try {
                aooc.af(obj);
            } catch (java.lang.Exception e) {
                exc = e;
                if (!(exc instanceof java.util.concurrent.CancellationException)) {
                    throw exc;
                }
                defpackage.htz.a.d().k(exc).l("com/android/dialer/appsearch/GlobalSearchSessionProviderKt", "observeChanges$<anonymous>", 46, "GlobalSearchSessionProvider.kt").v("Failed to register app search observer.");
                aowsVar.e((java.lang.Throwable) null);
            }
        } else {
            aooc.af(obj);
            aows aowsVar2 = (aows) this.e;
            defpackage.htx htxVar = new defpackage.htx(aowsVar2);
            try {
                ?? r4 = this.b;
                java.lang.Object obj3 = this.c;
                java.lang.String str = (java.lang.String) obj3;
                r4.d(str, (defpackage.qz) this.d, ajbm.a, htxVar);
                defpackage.af afVar = new defpackage.af(r4, htxVar, 14);
                this.e = aowsVar2;
                this.a = 1;
                if (aooh.D(aowsVar2, afVar, this) == aoluVar3) {
                    return aoluVar3;
                }
            } catch (java.lang.Exception e2) {
                exc = e2;
                aowsVar = aowsVar2;
                if (!(exc instanceof java.util.concurrent.CancellationException)) {
                    throw exc;
                }
                defpackage.htz.a.d().k(exc).l("com/android/dialer/appsearch/GlobalSearchSessionProviderKt", "observeChanges$<anonymous>", 46, "GlobalSearchSessionProvider.kt").v("Failed to register app search observer.");
                aowsVar.e((java.lang.Throwable) null);
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, qa] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.hty htyVar = new defpackage.hty(this.b, (defpackage.qz) this.d, aolnVar, 0);
            htyVar.e = obj;
            return htyVar;
        }
        if (i == 1) {
            defpackage.hty htyVar2 = new defpackage.hty((aonn) this.c, (defpackage.arq) this.b, (aso) this.d, aolnVar, 1);
            htyVar2.e = obj;
            return htyVar2;
        }
        java.lang.Object obj2 = this.d;
        tgq tgqVar = (tgq) obj2;
        defpackage.hty htyVar3 = new defpackage.hty(tgqVar, (tei) this.b, (java.util.List) this.c, aolnVar, 2);
        htyVar3.e = obj;
        return htyVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hty(aonn aonnVar, defpackage.arq arqVar, aso asoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aonnVar;
        this.b = arqVar;
        this.d = asoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hty(tgq tgqVar, tei teiVar, java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = tgqVar;
        this.b = teiVar;
        this.c = list;
    }
}
