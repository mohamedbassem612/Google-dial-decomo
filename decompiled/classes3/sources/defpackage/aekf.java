package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aekf implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ aekf(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v37, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ahzi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aemg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r6v6, types: [aemg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                defpackage.aekj aekjVar = ((defpackage.aekg) this.a).a;
                aekjVar.m((aify) this.b, aekjVar.h.a.a());
                return;
            case 1:
                defpackage.aekj aekjVar2 = ((defpackage.aekg) this.a).a;
                aekjVar2.m(aekjVar2.h.a.d(), this.b);
                return;
            case 2:
                ((aemh) ((java.util.concurrent.atomic.AtomicReference) ((aenc) this.b).b).get()).e((defpackage.aemg) this.a);
                return;
            case 3:
                aenc aencVar = (aenc) this.a;
                ((java.util.concurrent.atomic.AtomicReference) aencVar.b).set((aemh) aencVar.a.eZ());
                this.b.run();
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                ((aemh) ((java.util.concurrent.atomic.AtomicReference) ((aenc) this.b).b).get()).d((defpackage.aemg) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                int i = ((defpackage.aenq) this.a).a;
                if (i != 0) {
                    android.os.Process.setThreadPriority(i);
                }
                this.b.run();
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((aeqg) this.b).d.remove(((aenj) this.a).a);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ((aeta) this.b).c.d.a(5, ((aenj) this.a).a);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.content.SharedPreferences sharedPreferences = ((android.content.Context) this.a).getSharedPreferences("PhenotypeStickyAccount", 0);
                android.content.SharedPreferences.Editor editorEdit = null;
                for (java.util.Map.Entry<java.lang.String, ?> entry : sharedPreferences.getAll().entrySet()) {
                    if (entry.getValue() instanceof java.lang.String) {
                        if (entry.getValue().equals(this.b)) {
                            if (editorEdit == null) {
                                editorEdit = sharedPreferences.edit();
                            }
                            editorEdit.remove(entry.getKey());
                        }
                    }
                }
                if (editorEdit != null) {
                    editorEdit.commit();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                try {
                    aiql.H((java.util.concurrent.Future) this.b);
                    return;
                } catch (java.lang.Exception e) {
                    android.util.Log.w("FlagStore", "Failed to store account on flag read for: " + ((aeyy) this.a).d + " which may lead to stale flags.", e);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((aeyy) this.a).c((ajcq) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                afjq afjqVar = (afjq) this.a;
                afjqVar.e.b(afjqVar.a((amhl) this.b));
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                afjq afjqVar2 = (afjq) this.b;
                afjqVar2.e.a(afjqVar2.b, (defpackage.afjd) this.a);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((com.google.android.libraries.surveys.internal.view.SurveyViewPager) this.a).x().q((java.lang.String) this.b);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((gmr) this.a).b(((androidx.viewpager.widget.ViewPager) this.b).d);
                return;
            case 15:
                try {
                    ((defpackage.afmn) this.a).d.set((aec) aiql.H((java.util.concurrent.Future) this.b));
                    return;
                } catch (java.util.concurrent.ExecutionException e2) {
                    throw new java.lang.RuntimeException(e2);
                }
            case 16:
                this.b.run();
                com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) this.a;
                materialButton.i();
                materialButton.requestLayout();
                return;
            case 17:
                ((com.google.android.material.button.MaterialButton) this.b).m((android.graphics.drawable.Drawable) this.a);
                return;
            case 18:
                android.content.Context context = ((defpackage.aggf) this.b).a;
                if (defpackage.agfz.u(context) && defpackage.aftt.z(context)) {
                    ((android.widget.Button) this.a).requestFocus();
                    return;
                }
                return;
            case 19:
                defpackage.aggf aggfVar = (defpackage.aggf) this.b;
                android.content.Context context2 = aggfVar.a;
                if (defpackage.agfz.u(context2) && defpackage.aftt.z(context2)) {
                    if (aggfVar.i == 0 || aggfVar.c() == null || aggfVar.c().getVisibility() != 0) {
                        ((android.widget.Button) this.a).requestFocus();
                        return;
                    }
                    return;
                }
                return;
            default:
                defpackage.aggf aggfVar2 = (defpackage.aggf) this.b;
                if (aggfVar2.u) {
                    aggfVar2.s((android.widget.Button) this.a);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ aekf(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
