package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qml implements java.util.function.Function {
    public final /* synthetic */ defpackage.qmm a;
    public final /* synthetic */ android.app.Notification.CallStyle b;

    public /* synthetic */ qml(defpackage.qmm qmmVar, android.app.Notification.CallStyle callStyle) {
        this.a = qmmVar;
        this.b = callStyle;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        android.content.Context context = this.a.b;
        aooh.f(context, "context");
        android.graphics.drawable.Icon iconCreateWithResource = android.graphics.drawable.Icon.createWithResource(context, 2131231941);
        aooh.e(iconCreateWithResource, "createWithResource(...)");
        return mp$.ExternalSyntheticApiModelOutline0.m(this.b, iconCreateWithResource);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
