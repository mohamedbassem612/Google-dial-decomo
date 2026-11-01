package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmm {
    public static final aimz a = aimz.i("com/android/dialer/incall/statusbarnotification/ui/CallStyleBuilder");
    public final android.content.Context b;
    public final defpackage.qkj c;

    public qmm(android.content.Context context, defpackage.qkj qkjVar) {
        this.b = context;
        this.c = qkjVar;
    }

    public final android.app.Notification.CallStyle a(android.app.Notification.CallStyle callStyle, j$.util.Optional optional) {
        defpackage.qml qmlVar = new defpackage.qml(this, callStyle);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            defpackage.qmm qmmVar = qmlVar.a;
            android.app.Notification.CallStyle callStyle2 = qmlVar.b;
            android.content.Context context = qmmVar.b;
            aooh.f(context, "context");
            android.graphics.drawable.Icon iconCreateWithResource = android.graphics.drawable.Icon.createWithResource(context, 2131231941);
            aooh.e(iconCreateWithResource, "createWithResource(...)");
            optional = j$.util.Optional.ofNullable(mp$.ExternalSyntheticApiModelOutline0.m(callStyle2, iconCreateWithResource));
        }
        return mp$.ExternalSyntheticApiModelOutline0.m(optional.orElse(callStyle));
    }
}
