package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apwb implements defpackage.apwn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ apwb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.apwn
    public final void a() throws java.io.IOException {
        java.util.List list;
        int i = this.$cid;
        if (i == 0) {
            defpackage.apwe apweVar = (defpackage.apwe) this.a;
            if (apweVar.i == null) {
                defpackage.apwm apwmVar = apweVar.k;
                apwmVar.l = 10;
                java.net.HttpURLConnection httpURLConnection = apweVar.h;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.connect();
                apwmVar.l = 12;
                apweVar.j = httpURLConnection.getOutputStream();
                apweVar.i = java.nio.channels.Channels.newChannel(apweVar.j);
            }
            apweVar.a.set(0);
            apweVar.b();
            return;
        }
        if (i == 1) {
            java.lang.Object obj = this.a;
            defpackage.apwe apweVar2 = (defpackage.apwe) obj;
            apweVar2.c.read((org.chromium.net.UploadDataSink) obj, apweVar2.d);
            apweVar2.b.execute(new defpackage.aobd(obj, 13));
            return;
        }
        android.net.Network network = null;
        int i2 = 2;
        if (i != 2) {
            if (i == 3) {
                ((org.chromium.net.UploadDataProvider) this.a).close();
                return;
            }
            java.lang.Object obj2 = this.a;
            if (i != 4) {
                defpackage.apwk apwkVar = (defpackage.apwk) obj2;
                defpackage.apwm apwmVar2 = apwkVar.d;
                if (apwmVar2.g.compareAndSet(1, 4)) {
                    apwkVar.a.onResponseStarted(apwmVar2, apwmVar2.o);
                    return;
                }
                return;
            }
            defpackage.apwm apwmVar3 = (defpackage.apwm) obj2;
            if (apwmVar3.q != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String headerField = "http/1.1";
                int i3 = 0;
                while (true) {
                    java.lang.String headerFieldKey = apwmVar3.q.getHeaderFieldKey(i3);
                    if (headerFieldKey == null) {
                        break;
                    }
                    if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                        headerField = apwmVar3.q.getHeaderField(i3);
                    }
                    if (!headerFieldKey.startsWith("X-Android")) {
                        arrayList.add(new java.util.AbstractMap.SimpleEntry(headerFieldKey, apwmVar3.q.getHeaderField(i3)));
                    }
                    i3++;
                }
                int responseCode = apwmVar3.q.getResponseCode();
                defpackage.apwu apwuVar = new defpackage.apwu(new java.util.ArrayList(apwmVar3.f), responseCode, apwmVar3.q.getResponseMessage(), j$.util.DesugarCollections.unmodifiableList(arrayList), headerField);
                if (responseCode >= 300 && responseCode < 400 && (list = (java.util.List) apwuVar.getAllHeaders().get("location")) != null) {
                    apwmVar3.j(1, 2, new defpackage.apwa(apwmVar3, (java.lang.String) list.get(0), apwuVar, i2));
                    return;
                }
                apwmVar3.o = apwuVar;
                apwmVar3.e();
                if (responseCode < 400) {
                    apwmVar3.n = apvw.a(apwmVar3.q.getInputStream());
                    apwmVar3.b.d();
                    return;
                } else {
                    java.io.InputStream errorStream = apwmVar3.q.getErrorStream();
                    apwmVar3.n = errorStream != null ? apvw.a(errorStream) : null;
                    apwmVar3.b.d();
                    return;
                }
            }
            return;
        }
        defpackage.apwm apwmVar4 = (defpackage.apwm) this.a;
        if (apwmVar4.g.get() != 8) {
            java.net.URL url = new java.net.URL(apwmVar4.m);
            java.net.HttpURLConnection httpURLConnection2 = apwmVar4.q;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
                apwmVar4.q = null;
            }
            long j = apwmVar4.u;
            if (j == -1) {
                apwmVar4.q = (java.net.HttpURLConnection) url.openConnection();
            } else {
                for (android.net.Network network2 : ((android.net.ConnectivityManager) apwmVar4.r.d.getSystemService("connectivity")).getAllNetworks()) {
                    if (network2.getNetworkHandle() == j) {
                        network = network2;
                        break;
                    }
                }
                if (network == null) {
                    throw new defpackage.apwp();
                }
                apwmVar4.q = (java.net.HttpURLConnection) network.openConnection(url);
            }
            apwmVar4.q.setInstanceFollowRedirects(false);
            java.util.Map map = apwmVar4.e;
            if (!map.containsKey("User-Agent")) {
                map.put("User-Agent", apwmVar4.d);
            }
            for (java.util.Map.Entry entry : map.entrySet()) {
                apwmVar4.q.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            apwmVar4.q.setRequestMethod(apwmVar4.i);
            defpackage.apwx apwxVar = apwmVar4.j;
            if (apwxVar != null) {
                apwmVar4.y = new defpackage.apwe(apwmVar4, apwmVar4.k, apwmVar4.c, apwmVar4.q, apwxVar);
                defpackage.apwe apweVar3 = apwmVar4.y;
                apweVar3.a(new defpackage.apwc(apweVar3, apwmVar4.f.size() == 1, 1), "start");
            } else {
                apwmVar4.l = 10;
                apwmVar4.q.connect();
                apwmVar4.g();
            }
        }
    }
}
