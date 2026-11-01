package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anuf extends org.chromium.net.BidirectionalStream.Callback {
    final /* synthetic */ defpackage.anuj a;
    private java.util.List b;

    public anuf(defpackage.anuj anujVar) {
        j$.util.Objects.requireNonNull(anujVar);
        this.a = anujVar;
    }

    private final void a(java.util.List list, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            arrayList.add((java.lang.String) entry.getKey());
            arrayList.add((java.lang.String) entry.getValue());
        }
        byte[][] bArr = new byte[arrayList.size()][];
        for (int i = 0; i < arrayList.size(); i += 2) {
            bArr[i] = ((java.lang.String) arrayList.get(i)).getBytes(java.nio.charset.StandardCharsets.UTF_8);
            int i2 = i + 1;
            bArr[i2] = ((java.lang.String) arrayList.get(i2)).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        byte[][] bArrB = defpackage.aodp.b(bArr);
        java.nio.charset.Charset charset = annu.a;
        anph anphVar = new anph(bArrB);
        defpackage.anuj anujVar = this.a;
        int i3 = defpackage.anui.i;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            try {
                if (z) {
                    anuiVar.p(anphVar);
                } else {
                    anuiVar.o(anphVar);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static final anqw b(org.chromium.net.UrlResponseInfo urlResponseInfo) {
        return anxo.a(urlResponseInfo.getHttpStatusCode());
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onCanceled(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        anqw anqwVarB;
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onCanceled");
        }
        defpackage.anuj anujVar = this.a;
        int i = defpackage.anui.i;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            anqwVarB = anuiVar.e;
            if (anqwVarB == null) {
                anqwVarB = urlResponseInfo != null ? b(urlResponseInfo) : anqw.c.f("stream cancelled without reason");
            }
        }
        this.a.r(anqwVarB);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onFailed(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.CronetException cronetException) {
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onFailed");
        }
        this.a.r(anqw.l.e(cronetException));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onReadCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
        java.util.List list;
        byteBuffer.flip();
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onReadCompleted. Size=" + byteBuffer.remaining());
        }
        defpackage.anuj anujVar = this.a;
        int i = defpackage.anui.i;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            anuiVar.f = z;
            if (byteBuffer.remaining() != 0) {
                anuiVar.f(byteBuffer);
            }
        }
        if (!z || (list = this.b) == null) {
            return;
        }
        a(list, true);
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseHeadersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onResponseHeadersReceived. Header=".concat(java.lang.String.valueOf(java.lang.String.valueOf(urlResponseInfo.getAllHeadersAsList()))));
            android.util.Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        a(urlResponseInfo.getAllHeadersAsList(), false);
        bidirectionalStream.read(java.nio.ByteBuffer.allocateDirect(this.a.q));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onResponseTrailersReceived(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, org.chromium.net.UrlResponseInfo.HeaderBlock headerBlock) {
        boolean z;
        java.util.List asList = headerBlock.getAsList();
        this.b = asList;
        int i = defpackage.anui.i;
        defpackage.anui anuiVar = this.a.p;
        synchronized (anuiVar.a) {
            z = anuiVar.f;
        }
        if (z) {
            a(asList, true);
        }
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onResponseTrailersReceived. Trailer=".concat(java.lang.String.valueOf(asList.toString())));
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onStreamReady(org.chromium.net.BidirectionalStream bidirectionalStream) {
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onStreamReady");
        }
        defpackage.anuj anujVar = this.a;
        int i = defpackage.anui.i;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            anuiVar.d();
            anuiVar.c = true;
            java.util.Collection<defpackage.anug> collection = anuiVar.b;
            for (defpackage.anug anugVar : collection) {
                anuiVar.h.s(anugVar.a, anugVar.b, anugVar.c);
            }
            collection.clear();
        }
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onSucceeded(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo) {
        boolean z;
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onSucceeded");
        }
        defpackage.anuj anujVar = this.a;
        int i = defpackage.anui.i;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            z = false;
            if (this.b != null && anuiVar.f) {
                z = true;
            }
        }
        if (!z) {
            java.util.List list = this.b;
            if (list != null) {
                a(list, true);
            } else {
                if (urlResponseInfo == null) {
                    throw new java.lang.AssertionError("No response header or trailer");
                }
                a(urlResponseInfo.getAllHeadersAsList(), true);
            }
        }
        this.a.r(b(urlResponseInfo));
    }

    @Override // org.chromium.net.BidirectionalStream.Callback
    public final void onWriteCompleted(org.chromium.net.BidirectionalStream bidirectionalStream, org.chromium.net.UrlResponseInfo urlResponseInfo, java.nio.ByteBuffer byteBuffer, boolean z) {
        if (android.util.Log.isLoggable("grpc-java-cronet", 2)) {
            android.util.Log.v("grpc-java-cronet", "onWriteCompleted");
        }
        defpackage.anuj anujVar = this.a;
        int i = defpackage.anui.i;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            if (!anuiVar.g) {
                anuiVar.g = true;
                anujVar.g.a();
            }
            anuiVar.h(byteBuffer.position());
        }
    }
}
