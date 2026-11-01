package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ilj extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ defpackage.ilq c;
    final /* synthetic */ aono d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.String f;
    final /* synthetic */ java.lang.Long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilj(defpackage.ilq ilqVar, aono aonoVar, java.lang.Object obj, java.lang.String str, java.lang.Long l, aoln aolnVar) {
        super(2, aolnVar);
        this.c = ilqVar;
        this.d = aonoVar;
        this.e = obj;
        this.f = str;
        this.g = l;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084 A[Catch: Exception -> 0x00c4, TryCatch #0 {Exception -> 0x00c4, blocks: (B:6:0x0013, B:23:0x0076, B:25:0x0084, B:27:0x0090, B:30:0x00a4, B:31:0x00c3), top: B:36:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x006a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0043 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c5 -> B:20:0x006a). Please report as a decompilation issue!!! */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? it;
        java.util.Map.Entry entry;
        java.lang.Object obj2;
        aono aonoVar;
        java.lang.Object value;
        java.lang.Object obj3;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            it = this.a;
            if (i != 1) {
                try {
                    aooc.af(obj);
                    it = it;
                } catch (java.lang.Exception e) {
                    defpackage.ilt.a.b().k(e).l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaEventListenerRetriever$AggregatedListener", "notifyRelevantAsyncAndLogOnFailure$<anonymous>", 315, "AudioPrismSodaEventListenerRetriever.kt").y("%s", this.f);
                    it = it;
                }
            } else {
                try {
                    aooc.af(obj);
                    it = it;
                } catch (java.lang.Exception e2) {
                    defpackage.ilt.a.b().k(e2).l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaEventListenerRetriever$AggregatedListener", "notifyRelevantAsyncAndLogOnFailure$<anonymous>", 301, "AudioPrismSodaEventListenerRetriever.kt").y("%s", this.f);
                    it = it;
                }
            }
            while (it.hasNext()) {
                entry = (java.util.Map.Entry) it.next();
                obj2 = this.c.c.get(entry.getKey());
                if (obj2 != null) {
                    throw new java.lang.IllegalStateException("AudioPrismSodaFeatureState for " + entry.getKey() + " does not exist");
                }
                if (((defpackage.imb) obj2).b.a(this.g)) {
                    aonoVar = this.d;
                    value = entry.getValue();
                    obj3 = this.e;
                    this.a = it;
                    this.b = 2;
                    if (aonoVar.a(value, obj3, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        it = this.c.a.iterator();
        while (it.hasNext()) {
            ils ilsVar = (ils) it.next();
            aono aonoVar2 = this.d;
            java.lang.Object obj4 = this.e;
            this.a = it;
            this.b = 1;
            if (aonoVar2.a(ilsVar, obj4, this) == aoluVar) {
                return aoluVar;
            }
        }
        it = this.c.b.entrySet().iterator();
        while (it.hasNext()) {
            entry = (java.util.Map.Entry) it.next();
            obj2 = this.c.c.get(entry.getKey());
            if (obj2 != null) {
                throw new java.lang.IllegalStateException("AudioPrismSodaFeatureState for " + entry.getKey() + " does not exist");
            }
            if (((defpackage.imb) obj2).b.a(this.g)) {
                aonoVar = this.d;
                value = entry.getValue();
                obj3 = this.e;
                this.a = it;
                this.b = 2;
                if (aonoVar.a(value, obj3, this) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ilj(this.c, this.d, this.e, this.f, this.g, aolnVar);
    }
}
