package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agqd implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ agqd(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aift aiftVar = new aift(4);
                java.util.Iterator it = j$.util.DesugarCollections.unmodifiableMap(((agqk) obj).d).values().iterator();
                while (it.hasNext()) {
                    aiftVar.i(aogc.H((agqm) it.next()));
                }
                return aiftVar.h();
            case 1:
                return j$.util.DesugarCollections.unmodifiableMap(((agqk) obj).d).keySet();
            case 2:
                defpackage.agqp.a.c().k((java.lang.Throwable) obj).l("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "sync", 90, "WipeoutAccountsSynclet.java").v("Wipeout accounts task failed.");
                return null;
            case 3:
                aimz aimzVar = defpackage.agqp.a;
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, (albh) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return defpackage.ahas.d;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aigb aigbVar = new aigb(4);
                for (java.util.AbstractMap.SimpleEntry simpleEntry : (java.util.List) obj) {
                    if (simpleEntry.getValue() != defpackage.ahas.d) {
                        aigbVar.g(simpleEntry);
                    }
                }
                return aigbVar.e(true);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new gsf();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new gse();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aimz aimzVar2 = ahme.a;
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((java.lang.Iterable) obj).iterator();
            case 15:
                return ((java.util.Map.Entry) obj).getValue();
            case 16:
                return ((java.util.Map.Entry) obj).getKey();
            case 17:
                java.lang.String str = (java.lang.String) obj;
                if (aizb.a.h(str) && !str.isEmpty()) {
                    return str;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 16);
                sb.append('\"');
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == '\\') {
                        sb.append('\\');
                    } else if (cCharAt == '\"') {
                        cCharAt = '\"';
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                }
                sb.append('\"');
                return sb.toString();
            case 18:
                aigy aigyVar = (java.util.Collection) obj;
                if (aigyVar instanceof aigy) {
                    aigy aigyVar2 = aigyVar;
                    aigyVar2.l();
                    return aigyVar2;
                }
                aigv aigvVar = new aigv(aigyVar instanceof aijo ? ((aijo) aigyVar).i().size() : 11);
                aigvVar.b(aigyVar);
                return aigvVar.a();
            case 19:
                android.util.Log.e("ClientLoggingBackend", "Logging to Clearcut failed.", (java.lang.Exception) obj);
                return null;
            default:
                return ((defpackage.akxb) obj).a;
        }
    }
}
