package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xfk extends defpackage.xkb {
    final /* synthetic */ defpackage.xfp a;

    public xfk(defpackage.xfp xfpVar) {
        this.a = xfpVar;
    }

    @Override // defpackage.xka
    public final android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        return this.a.performCreateIntent(context, obj);
    }

    @Override // defpackage.xkb
    public final oq b(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        return this.a.performGetSynchronousResult(context, obj);
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.a.getNodeComponent();
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return this.a.getNodeName();
    }
}
