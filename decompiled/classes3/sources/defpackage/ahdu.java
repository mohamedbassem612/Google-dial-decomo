package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahdu extends aoof implements aonj {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdu(java.lang.Object obj, int i, byte[] bArr) {
        super(1, obj, ahct.class, "setRuntimePropertiesAndUpdateConfigs", "setRuntimePropertiesAndUpdateConfigs(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.String str = (java.lang.String) obj;
            aooh.f(str, "p0");
            return ((defpackage.ahdp) this.e).a(str);
        }
        int i2 = 2;
        if (i == 1) {
            java.util.List<ajsy> list = (java.util.List) obj;
            aooh.f(list, "p0");
            ahct ahctVar = (ahct) this.e;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
            for (ajsy ajsyVar : list) {
                ahoq ahoqVarX = ahvr.X(1368, "Setting runtime properties", ahot.a, true);
                try {
                    java.lang.Object obj2 = ahctVar.i;
                    java.lang.String str2 = ajsyVar.g;
                    aooh.e(str2, "getConfigPackage(...)");
                    ajcq ajcqVarY = ((gou) obj2).y(str2);
                    ahoqVarX.a(ajcqVarY);
                    ajsz.ak(ahoqVarX, (java.lang.Throwable) null);
                    arrayList.add(ahvr.I(ajcqVarY, new ahcs(new defpackage.agvo(ahctVar, ajsyVar, i2)), ajbm.a));
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarX, th);
                        throw th2;
                    }
                }
            }
            return aiql.v(arrayList);
        }
        if (i == 2) {
            defpackage.ynp ynpVar = (defpackage.ynp) obj;
            aooh.f(ynpVar, "p0");
            return alpv.b(ynpVar);
        }
        if (i == 3) {
            defpackage.yog yogVar = (defpackage.yog) obj;
            aooh.f(yogVar, "p0");
            aify aifyVar = yogVar.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(aifyVar, 10));
            java.util.Iterator it = aifyVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(((defpackage.yoj) it.next()).a);
            }
            return ahvr.bv(arrayList2);
        }
        if (i != 4) {
            if (i != 5) {
                ((aoue) this.e).a((java.lang.Throwable) obj);
                return aojh.a;
            }
            defpackage.ynp ynpVar2 = (defpackage.ynp) obj;
            aooh.f(ynpVar2, "p0");
            return alpv.b(ynpVar2);
        }
        defpackage.yoq yoqVar = (defpackage.yoq) obj;
        aooh.f(yoqVar, "p0");
        aify aifyVar2 = yoqVar.a;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(aifyVar2, 10));
        java.util.Iterator it2 = aifyVar2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((defpackage.you) it2.next()).a);
        }
        return ahvr.bv(arrayList3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdu(java.lang.Object obj, int i) {
        super(1, obj, defpackage.ahdp.class, "create", "create(Ljava/lang/String;)Lcom/google/apps/tiktok/experiments/phenotype/UserConfigurationCommitter;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdu(java.lang.Object obj, int i, char[] cArr) {
        super(1, obj, alpv.class, "parseLlmResult", "parseLlmResult(Lcom/google/android/apps/aicore/client/api/llm/LlmResult;)Lcom/google/common/collect/ImmutableList;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdu(java.lang.Object obj, int i, short[] sArr) {
        super(1, obj, alpv.class, "parseSmartReplyResult", "parseSmartReplyResult(Lcom/google/android/apps/aicore/client/api/smartreply/SmartReplyResult;)Lcom/google/common/collect/ImmutableList;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdu(java.lang.Object obj, int i, int[] iArr) {
        super(1, obj, alpv.class, "parseSummarizationResult", "parseSummarizationResult(Lcom/google/android/apps/aicore/client/api/summarization/SummarizationResult;)Lcom/google/common/collect/ImmutableList;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdu(java.lang.Object obj, int i, float[] fArr) {
        super(1, obj, aoue.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.$cid = i;
    }
}
