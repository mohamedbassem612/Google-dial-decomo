package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anuh implements defpackage.anuo {
    final /* synthetic */ defpackage.anuj a;

    public anuh(defpackage.anuj anujVar) {
        j$.util.Objects.requireNonNull(anujVar);
        this.a = anujVar;
    }

    @Override // defpackage.anuo
    public final void a(anqw anqwVar) {
        int i = defpackage.anui.i;
        defpackage.anuj anujVar = this.a;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            if (anuiVar.d) {
                return;
            }
            anuiVar.d = true;
            anuiVar.e = anqwVar;
            java.util.Collection collection = anuiVar.b;
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((defpackage.anug) it.next()).a.clear();
            }
            collection.clear();
            org.chromium.net.BidirectionalStream bidirectionalStream = anujVar.l;
            if (bidirectionalStream != null) {
                bidirectionalStream.cancel();
            } else {
                anujVar.j.a(anujVar, anqwVar);
            }
        }
    }

    @Override // defpackage.anuo
    public final void b(defpackage.aodu aoduVar, boolean z, boolean z2, int i) {
        java.nio.ByteBuffer byteBuffer;
        int i2 = defpackage.anui.i;
        defpackage.anuj anujVar = this.a;
        defpackage.anui anuiVar = anujVar.p;
        synchronized (anuiVar.a) {
            if (anuiVar.d) {
                return;
            }
            if (aoduVar != null) {
                byteBuffer = ((defpackage.anum) aoduVar).a;
                byteBuffer.flip();
            } else {
                byteBuffer = defpackage.anuj.a;
            }
            anujVar.w(byteBuffer.remaining());
            if (anuiVar.c) {
                anujVar.s(byteBuffer, z, z2);
            } else {
                anuiVar.b.add(new defpackage.anug(byteBuffer, z, z2));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    @Override // defpackage.anuo
    public final void c(anph anphVar) {
        java.lang.String str;
        byte[][] bArrA;
        int i;
        java.lang.String str2;
        defpackage.anuj anujVar = this.a;
        anujVar.k.run();
        if (anujVar.r != null) {
            defpackage.anuf anufVar = new defpackage.anuf(anujVar);
            java.lang.String str3 = anujVar.e;
            defpackage.anud anudVar = anujVar.r;
            java.util.concurrent.Executor executor = anujVar.h;
            boolean z = anudVar.b;
            org.chromium.net.BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = anudVar.a.newBidirectionalStreamBuilder(str3, anufVar, executor);
            if (z) {
                builderNewBidirectionalStreamBuilder.setTrafficStatsTag(anudVar.c);
            }
            if (anudVar.d) {
                builderNewBidirectionalStreamBuilder.setTrafficStatsUid(anudVar.e);
            }
            if (anujVar.m) {
                builderNewBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            java.lang.Object obj = anujVar.n;
            if (obj == null) {
                if (anujVar.o != null) {
                }
                java.lang.String str4 = anxo.j.a;
                builderNewBidirectionalStreamBuilder.addHeader(str4, anujVar.f);
                str = anxo.h.a;
                builderNewBidirectionalStreamBuilder.addHeader(str, "application/grpc");
                builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
                bArrA = defpackage.aodp.a(anujVar.i);
                for (i = 0; i < bArrA.length; i += 2) {
                    str2 = new java.lang.String(bArrA[i], java.nio.charset.StandardCharsets.UTF_8);
                    if (str.equalsIgnoreCase(str2) && !str4.equalsIgnoreCase(str2) && !anxo.i.a.equalsIgnoreCase(str2)) {
                        builderNewBidirectionalStreamBuilder.addHeader(str2, new java.lang.String(bArrA[i + 1], java.nio.charset.StandardCharsets.UTF_8));
                    }
                }
                anujVar.l = builderNewBidirectionalStreamBuilder.build();
                anujVar.l.start();
            }
            builderNewBidirectionalStreamBuilder.addRequestAnnotation(obj);
            java.util.Collection collection = anujVar.o;
            if (collection != null) {
                java.util.Iterator it = collection.iterator();
                while (it.hasNext()) {
                    builderNewBidirectionalStreamBuilder.addRequestAnnotation(it.next());
                }
            }
            java.lang.String str5 = anxo.j.a;
            builderNewBidirectionalStreamBuilder.addHeader(str5, anujVar.f);
            str = anxo.h.a;
            builderNewBidirectionalStreamBuilder.addHeader(str, "application/grpc");
            builderNewBidirectionalStreamBuilder.addHeader("te", "trailers");
            bArrA = defpackage.aodp.a(anujVar.i);
            while (i < bArrA.length) {
                str2 = new java.lang.String(bArrA[i], java.nio.charset.StandardCharsets.UTF_8);
                if (str.equalsIgnoreCase(str2)) {
                }
            }
            anujVar.l = builderNewBidirectionalStreamBuilder.build();
            anujVar.l.start();
        }
    }
}
