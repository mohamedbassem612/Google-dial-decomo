package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agtr implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ agtr(android.widget.TextView textView, com.google.android.libraries.communications.ux.views.captionsview.CaptionsView captionsView, android.widget.TextView textView2, aonj aonjVar, android.widget.TextView textView3, int i) {
        this.$cid = i;
        this.a = textView;
        this.d = captionsView;
        this.c = textView2;
        this.b = aonjVar;
        this.e = textView3;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [aonj, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj) {
        byte[] bArr = null;
        if (this.$cid != 0) {
            defpackage.aboy aboyVar = (defpackage.aboy) obj;
            aooh.f(aboyVar, "$this$ofFloat");
            android.widget.TextView textView = (android.widget.TextView) this.a;
            float alpha = textView.getAlpha();
            java.lang.Object obj2 = this.c;
            aboyVar.a(alpha, 0.0f, new defpackage.abph(obj2, 2));
            aboyVar.b(new defpackage.abmn(obj2, 4));
            float lineHeight = textView.getLineHeight();
            java.lang.Object obj3 = this.d;
            aboyVar.a(0.0f, -lineHeight, new defpackage.sba(obj3, 16, (int[][][]) null));
            aboyVar.b(new defpackage.xtu(obj3, obj2, 7, bArr));
            aboyVar.b(new defpackage.xtu(this.b, this.e, 8, bArr));
            aboyVar.start();
            return aojh.a;
        }
        final android.os.CancellationSignal cancellationSignal = (android.os.CancellationSignal) obj;
        aooh.f(cancellationSignal, "cancellationSignal");
        java.lang.Object obj4 = this.c;
        java.lang.Object obj5 = this.b;
        final android.net.Uri uri = (android.net.Uri) this.a;
        final java.lang.String[] strArr = (java.lang.String[]) obj5;
        final android.os.Bundle bundle = (android.os.Bundle) obj4;
        android.database.Cursor cursorM = ((apni) ((aogc) this.e).a).m(uri, strArr, new aguf() { // from class: agua
            public final android.database.Cursor a(android.content.ContentProviderClient contentProviderClient) {
                return contentProviderClient.query(uri, strArr, bundle, cancellationSignal);
            }
        }, new ahzi() { // from class: agub
            public final java.lang.Object eZ() {
                java.lang.String string;
                java.lang.String string2;
                android.os.Bundle bundle2 = bundle;
                if (bundle2 == null) {
                    string2 = null;
                    string = null;
                } else {
                    string = bundle2.getString("android:query-arg-sql-selection");
                    string2 = bundle2.getString("android:query-arg-sql-sort-order");
                }
                return apni.r(strArr, uri, string, string2);
            }
        });
        try {
            aify aifyVarBa = agab.ba(cursorM, (aonj) this.d);
            ajsz.ak(cursorM, (java.lang.Throwable) null);
            return aifyVarBa;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(cursorM, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ agtr(aogc aogcVar, android.net.Uri uri, java.lang.String[] strArr, android.os.Bundle bundle, aonj aonjVar, int i) {
        this.$cid = i;
        this.e = aogcVar;
        this.a = uri;
        this.b = strArr;
        this.c = bundle;
        this.d = aonjVar;
    }
}
