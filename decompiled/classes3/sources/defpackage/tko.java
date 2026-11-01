package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tko implements abwm {
    private final /* synthetic */ int $cid;
    private final kjr a;

    public tko(kjr kjrVar, int i) {
        this.$cid = i;
        aooh.f(kjrVar, "annotatedCallLogRefreshStarter");
        this.a = kjrVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.Map] */
    public final java.lang.Object a(ahbq ahbqVar, aoln aolnVar) {
        isp ispVar;
        java.lang.Boolean boolValueOf;
        defpackage.abwk abwkVar;
        boolean z = true;
        if (this.$cid == 0) {
            aooh.f(ahbqVar, "<this>");
            java.util.Collection<defpackage.abwl> collectionValues = ahbqVar.c.values();
            if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                for (defpackage.abwl abwlVar : collectionValues) {
                    defpackage.ttk ttkVar = (defpackage.ttk) abwlVar.b();
                    tkj tkjVarA = ttkVar != null ? ttj.a(ttkVar) : null;
                    defpackage.ttk ttkVar2 = (defpackage.ttk) abwlVar.a();
                    if (!aooh.n(tkjVarA, ttkVar2 != null ? ttj.a(ttkVar2) : null)) {
                        kjr kjrVar = this.a;
                        kjr.a.b().l("com/android/dialer/calllog/refresh/impl/AnnotatedCallLogRefreshStarterImpl", "refreshConversationHistoryOnly", 41, "AnnotatedCallLogRefreshStarterImpl.java").v("refreshConversationHistoryOnly");
                        kjrVar.b.b(1);
                        break;
                    }
                }
            }
            return aojh.a;
        }
        if (aolnVar instanceof isp) {
            ispVar = (isp) aolnVar;
            int i = ispVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ispVar.b = i - Integer.MIN_VALUE;
            } else {
                ispVar = new isp(this, aolnVar);
            }
        } else {
            ispVar = new isp(this, aolnVar);
        }
        java.lang.Object obj = ispVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ispVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ispVar.b = 1;
            if (ahbqVar.b.isEmpty() && ahbqVar.d.isEmpty()) {
                java.util.Collection collectionValues2 = ahbqVar.a.values();
                if ((collectionValues2 instanceof java.util.Collection) && collectionValues2.isEmpty()) {
                    z = false;
                    break;
                }
                java.util.Iterator it = collectionValues2.iterator();
                do {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    abwkVar = (defpackage.abwk) it.next();
                } while (aooh.n(kcq.A((itc) abwkVar.a), kcq.A((itc) abwkVar.b)));
                boolValueOf = java.lang.Boolean.valueOf(z);
            } else {
                boolValueOf = java.lang.Boolean.TRUE;
            }
            obj = boolValueOf;
            if (obj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.a.a();
        }
        return aojh.a;
    }

    public tko(kjr kjrVar, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(kjrVar, "annotatedCallLogRefreshStarter");
        this.a = kjrVar;
    }
}
