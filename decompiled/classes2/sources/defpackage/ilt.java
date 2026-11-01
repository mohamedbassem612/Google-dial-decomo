package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ilt {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaEventListenerRetriever");
    public final zzx b;
    private final android.content.Context c;
    private final java.util.Set d;

    public ilt(android.content.Context context, zzx zzxVar, java.util.Set set) {
        aooh.f(context, "appContext");
        this.c = context;
        this.b = zzxVar;
        this.d = set;
    }

    private static final java.util.Map b(java.util.Map map, java.util.Map map2, ifx ifxVar) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.imb imbVar = (defpackage.imb) map2.get(entry.getKey());
            if (imbVar != null) {
                ify ifyVar = imbVar.a.c;
                if (ifyVar == null) {
                    ifyVar = ify.a;
                }
                ifx ifxVarB = ifx.b(ifyVar.b);
                if (ifxVarB == null) {
                    ifxVarB = ifx.d;
                }
                if (ifxVarB == ifxVar) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final defpackage.ilq a(defpackage.igd igdVar, java.util.Map map) throws aois {
        aooh.f(igdVar, "audioSource");
        int iOrdinal = igdVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                aile aileVar = this.d;
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aileVar, 10));
                ailj ailjVarK = aileVar.k();
                while (ailjVarK.hasNext()) {
                    arrayList.add(new ils(defpackage.igd.AUDIO_SOURCE_DOWNLINK, (defpackage.ihn) ailjVarK.next()));
                }
                java.util.Set setCf = ajsz.cf(arrayList);
                zzx zzxVar = this.b;
                aigf aigfVarK = zzxVar.k();
                aooh.e(aigfVarK, "get(...)");
                java.util.Map mapB = b(aigfVarK, map, ifx.c);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(ajsz.aL(mapB.size()));
                for (java.util.Map.Entry entry : mapB.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    defpackage.igd igdVar2 = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                    java.lang.Object objA = ((aoin) entry.getValue()).a();
                    aooh.e(objA, "get(...)");
                    linkedHashMap.put(key, new ils(igdVar2, (defpackage.ihn) objA));
                }
                aigf aigfVarK2 = zzxVar.k();
                aooh.e(aigfVarK2, "get(...)");
                java.util.Map mapB2 = b(aigfVarK2, map, ifx.b);
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(ajsz.aL(mapB2.size()));
                for (java.util.Map.Entry entry2 : mapB2.entrySet()) {
                    java.lang.Object key2 = entry2.getKey();
                    defpackage.igd igdVar3 = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
                    java.lang.Object objA2 = ((aoin) entry2.getValue()).a();
                    aooh.e(objA2, "get(...)");
                    linkedHashMap2.put(key2, new ils(igdVar3, (defpackage.ihn) objA2));
                }
                android.content.Context context = this.c;
                java.util.Map mapAQ = ajsz.aQ(linkedHashMap, linkedHashMap2);
                aooh.f(context, "appContext");
                aooh.f(setCf, "internalListeners");
                return new defpackage.ilq(context, setCf, mapAQ, map);
            }
            if (iOrdinal == 2) {
                aile aileVar2 = this.d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(aileVar2, 10));
                ailj ailjVarK2 = aileVar2.k();
                while (ailjVarK2.hasNext()) {
                    arrayList2.add(new ils(defpackage.igd.AUDIO_SOURCE_UPLINK, (defpackage.ihn) ailjVarK2.next()));
                }
                java.util.Set setCf2 = ajsz.cf(arrayList2);
                aigf aigfVarK3 = this.b.k();
                aooh.e(aigfVarK3, "get(...)");
                java.util.Map mapB3 = b(aigfVarK3, map, ifx.c);
                java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap(ajsz.aL(mapB3.size()));
                for (java.util.Map.Entry entry3 : mapB3.entrySet()) {
                    java.lang.Object key3 = entry3.getKey();
                    defpackage.igd igdVar4 = defpackage.igd.AUDIO_SOURCE_UPLINK;
                    java.lang.Object objA3 = ((aoin) entry3.getValue()).a();
                    aooh.e(objA3, "get(...)");
                    linkedHashMap3.put(key3, new ils(igdVar4, (defpackage.ihn) objA3));
                }
                android.content.Context context2 = this.c;
                aooh.f(context2, "appContext");
                aooh.f(setCf2, "internalListeners");
                return new defpackage.ilq(context2, setCf2, linkedHashMap3, map);
            }
            if (iOrdinal != 3) {
                throw new aois();
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid audio source");
    }
}
