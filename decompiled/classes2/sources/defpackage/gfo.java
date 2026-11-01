package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gfo extends android.os.RemoteCallbackList {
    final /* synthetic */ androidx.room.MultiInstanceInvalidationService a;

    public gfo(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final /* bridge */ /* synthetic */ void onCallbackDied(android.os.IInterface iInterface, java.lang.Object obj) {
        aooh.f((defpackage.gfk) iInterface, "callback");
        aooh.f(obj, "cookie");
        this.a.b.remove((java.lang.Integer) obj);
    }
}
