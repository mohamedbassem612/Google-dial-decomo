package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alpw extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.alqc b;
    final /* synthetic */ java.util.function.Consumer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpw(defpackage.alqc alqcVar, java.util.function.Consumer consumer, aoln aolnVar) {
        super(2, aolnVar);
        this.b = alqcVar;
        this.c = consumer;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:5:0x0009, B:13:0x0036, B:14:0x004b, B:16:0x0051, B:18:0x006b, B:19:0x0077, B:20:0x008c, B:22:0x0092, B:24:0x00a7, B:26:0x00ac, B:25:0x00aa, B:27:0x00b0, B:6:0x000d, B:11:0x0026, B:9:0x0014), top: B:33:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0092 A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:5:0x0009, B:13:0x0036, B:14:0x004b, B:16:0x0051, B:18:0x006b, B:19:0x0077, B:20:0x008c, B:22:0x0092, B:24:0x00a7, B:26:0x00ac, B:25:0x00aa, B:27:0x00b0, B:6:0x000d, B:11:0x0026, B:9:0x0014), top: B:33:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a7 A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:5:0x0009, B:13:0x0036, B:14:0x004b, B:16:0x0051, B:18:0x006b, B:19:0x0077, B:20:0x008c, B:22:0x0092, B:24:0x00a7, B:26:0x00ac, B:25:0x00aa, B:27:0x00b0, B:6:0x000d, B:11:0x0026, B:9:0x0014), top: B:33:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00aa A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:5:0x0009, B:13:0x0036, B:14:0x004b, B:16:0x0051, B:18:0x006b, B:19:0x0077, B:20:0x008c, B:22:0x0092, B:24:0x00a7, B:26:0x00ac, B:25:0x00aa, B:27:0x00b0, B:6:0x000d, B:11:0x0026, B:9:0x0014), top: B:33:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x004b A[SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.util.LinkedHashMap linkedHashMap;
        java.util.LinkedHashMap linkedHashMap2;
        defpackage.alpl alplVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        try {
            if (i != 0) {
                if (i != 1) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                }
                java.util.function.Consumer consumer = this.c;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.b.e;
                linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (defpackage.alqc.c.contains(java.lang.Integer.valueOf(((defpackage.alpu) entry.getValue()).b))) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap2 = new java.util.LinkedHashMap(ajsz.aL(linkedHashMap.size()));
                for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
                    java.lang.Object key = entry2.getKey();
                    if (((defpackage.alpu) entry2.getValue()).b == 3) {
                        alplVar = defpackage.alpl.a;
                    } else {
                        alplVar = defpackage.alpl.b;
                    }
                    linkedHashMap2.put(key, alplVar);
                }
                consumer.accept(new defpackage.alpm(ahvr.bw(linkedHashMap2)));
                return aojh.a;
            }
            aooc.af(obj);
            ajcq ajcqVarE = this.b.g().e();
            this.a = 1;
            obj = aosv.D(ajcqVarE, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            java.util.List list = (aify) obj;
            defpackage.alqc alqcVar = this.b;
            aooh.c(list);
            this.a = 2;
            if (alqcVar.i(list, this) == aoluVar) {
                return aoluVar;
            }
            java.util.function.Consumer consumer2 = this.c;
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.b.e;
            linkedHashMap = new java.util.LinkedHashMap();
            while (r1.hasNext()) {
                if (defpackage.alqc.c.contains(java.lang.Integer.valueOf(((defpackage.alpu) entry.getValue()).b))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap2 = new java.util.LinkedHashMap(ajsz.aL(linkedHashMap.size()));
            while (r2.hasNext()) {
                java.lang.Object key2 = entry2.getKey();
                if (((defpackage.alpu) entry2.getValue()).b == 3) {
                    alplVar = defpackage.alpl.a;
                } else {
                    alplVar = defpackage.alpl.b;
                }
                linkedHashMap2.put(key2, alplVar);
            }
            consumer2.accept(new defpackage.alpm(ahvr.bw(linkedHashMap2)));
        } catch (java.lang.Throwable th) {
            defpackage.alqc.b.d().k(th).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidDuplexAiCoreClient", "cacheAndConsumeAvailableFeatures$<anonymous>", 108, "AndroidDuplexAiCoreClient.kt").v("AiCore could not list features.");
            this.c.accept(new defpackage.alpm(aikj.b));
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.alpw(this.b, this.c, aolnVar);
    }
}
