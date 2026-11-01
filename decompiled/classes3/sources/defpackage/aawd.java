package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawd extends aada {
    public aawd(android.content.Context context) {
        super(context, (android.app.Activity) null, defpackage.aals.a, aacu.q, aacz.a);
        defpackage.aayx.b(context.getApplicationContext());
    }

    public static android.graphics.Bitmap e(android.view.View view) {
        try {
            android.graphics.Picture picture = new android.graphics.Picture();
            android.graphics.Canvas canvasBeginRecording = picture.beginRecording(view.getWidth(), view.getHeight());
            canvasBeginRecording.drawRect(0.0f, 0.0f, view.getWidth(), view.getHeight(), new android.graphics.Paint());
            view.draw(canvasBeginRecording);
            picture.endRecording();
            return ft$.ExternalSyntheticApiModelOutline0.m(picture, view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.RGB_565);
        } catch (java.lang.Error | java.lang.Exception e) {
            android.util.Log.w("gF_FeedbackClient", "Get screenshot failed!", e);
            return null;
        }
    }

    public final aaum a(java.lang.String str) {
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aarg((java.lang.Object) this, (java.lang.Object) str, 5);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aawc.q};
        aafqVar.c = 24025;
        return super.i(0, aafqVar.a());
    }

    public final aaum b(java.lang.String str, java.lang.String str2, byte[] bArr) {
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aaxq(this, str, str2, bArr, 1);
        aafqVar.c = 24020;
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aawc.y};
        return super.i(0, aafqVar.a());
    }

    public final aaum c(java.lang.String str, java.lang.String str2, byte[] bArr) {
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aaxq(this, str, str2, bArr, 0);
        aafqVar.c = 24006;
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aawc.y};
        return super.i(0, aafqVar.a());
    }

    public final aaum d(com.google.android.gms.wearable.ChannelClient$Channel channelClient$Channel) {
        ahvr.cj(channelClient$Channel, "channel must not be null");
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aarg((java.lang.Object) this, (java.lang.Object) ((com.google.android.gms.wearable.internal.ChannelImpl) channelClient$Channel).a, 4);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aawc.y};
        return super.i(0, aafqVar.a());
    }

    public final aaum m(com.google.android.gms.feedback.FeedbackOptions feedbackOptions, defpackage.uwk uwkVar) {
        long jNanoTime = java.lang.System.nanoTime();
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aalt(feedbackOptions, jNanoTime, uwkVar, 0);
        aafqVar.c = 6005;
        return super.i(1, aafqVar.a());
    }

    public final void n(com.google.android.gms.feedback.FeedbackOptions feedbackOptions, android.os.Bundle bundle, long j) {
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aalt(feedbackOptions, bundle, j, 1);
        aafqVar.c = 6011;
        super.i(1, aafqVar.a());
    }

    public final void o(android.os.Bundle bundle, long j) {
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.aaps(bundle, j, 1);
        aafqVar.c = 6010;
        super.i(1, aafqVar.a());
    }

    public aawd(android.content.Context context, aacz aaczVar, char[] cArr) {
        super(context, (android.app.Activity) null, defpackage.aawg.a, defpackage.aawf.a, aaczVar);
    }

    public aawd(android.content.Context context, aacz aaczVar, byte[] bArr) {
        super(context, (android.app.Activity) null, defpackage.aawg.a, defpackage.aawf.a, aaczVar);
    }

    public aawd(android.content.Context context, aacz aaczVar) {
        super(context, (android.app.Activity) null, defpackage.aawg.a, defpackage.aawf.a, aaczVar);
    }
}
