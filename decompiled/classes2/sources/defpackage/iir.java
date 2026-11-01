package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class iir {
    private static final aimz a = aimz.i("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismRawAudioListenerRetriever$AggregatedListener");
    private final java.util.Set b;

    public iir(java.util.Set set) {
        this.b = set;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14, types: [igc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [igc, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x007c -> B:17:0x003c). Please report as a decompilation issue!!! */
    public final java.lang.Object a(defpackage.igb igbVar, aoln aolnVar) {
        defpackage.iiq iiqVar;
        ?? it;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.iiq) {
            iiqVar = (defpackage.iiq) aolnVar;
            int i = iiqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                iiqVar.d = i - Integer.MIN_VALUE;
            } else {
                iiqVar = new defpackage.iiq(this, aolnVar);
            }
        } else {
            iiqVar = new defpackage.iiq(this, aolnVar);
        }
        java.lang.Object obj = iiqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = iiqVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            it = this.b.iterator();
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = iiqVar.a;
            igbVar = iiqVar.e;
            try {
                aooc.af(obj);
                it = it;
            } catch (java.lang.Exception e) {
                a.b().k(e).l("com/android/dialer/audioprism/internal/callaudio/impl/AudioPrismRawAudioListenerRetriever$AggregatedListener", "notifyAllAndLogOnFailure", 203, "AudioPrismRawAudioListenerRetriever.kt").v("failed to pass audio chunk to listener");
                it = it;
            }
        }
        while (it.hasNext()) {
            defpackage.kvt kvtVar = (defpackage.kvt) it.next();
            iiqVar.e = igbVar;
            iiqVar.a = it;
            iiqVar.d = 1;
            int iOrdinal = ((defpackage.igd) kvtVar.a).ordinal();
            if (iOrdinal == 1) {
                objA = kvtVar.b.a(igbVar, iiqVar);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
            } else {
                if (iOrdinal != 2) {
                    throw new java.lang.IllegalStateException("Single channel listener cannot be created for other sources");
                }
                objA = kvtVar.b.b(igbVar, iiqVar);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
            }
            if (objA == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
