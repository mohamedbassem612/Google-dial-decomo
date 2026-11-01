package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class by extends android.transition.Transition.EpicenterCallback {
    final /* synthetic */ android.graphics.Rect a;

    public by(android.graphics.Rect rect) {
        this.a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final android.graphics.Rect onGetEpicenter(android.transition.Transition transition) {
        return this.a;
    }
}
