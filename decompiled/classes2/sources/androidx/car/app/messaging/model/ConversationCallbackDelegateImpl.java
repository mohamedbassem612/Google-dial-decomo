package androidx.car.app.messaging.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class ConversationCallbackDelegateImpl implements defpackage.vr {
    private final androidx.car.app.messaging.model.IConversationCallback mConversationCallbackBinder;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class ConversationCallbackStub extends androidx.car.app.messaging.model.IConversationCallback.Stub {
        private final defpackage.vq mConversationCallback;

        public ConversationCallbackStub(defpackage.vq vqVar) {
            this.mConversationCallback = vqVar;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onMarkAsRead$0$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m34xf996ad9e() {
            this.mConversationCallback.a();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onTextReply$0$androidx-car-app-messaging-model-ConversationCallbackDelegateImpl$ConversationCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m35xc4d0116e(java.lang.String str) {
            this.mConversationCallback.b();
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onMarkAsRead", new defpackage.abc() { // from class: vt
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m34xf996ad9e();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(androidx.car.app.IOnDoneCallback iOnDoneCallback, final java.lang.String str) {
            defpackage.rx.f(iOnDoneCallback, "onReply", new defpackage.abc() { // from class: vs
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m35xc4d0116e(str);
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(defpackage.vq vqVar) {
        this.mConversationCallbackBinder = new androidx.car.app.messaging.model.ConversationCallbackDelegateImpl.ConversationCallbackStub(vqVar);
    }

    public void sendMarkAsRead(defpackage.tz tzVar) {
        try {
            ((androidx.car.app.messaging.model.IConversationCallback) j$.util.Objects.requireNonNull(this.mConversationCallbackBinder)).onMarkAsRead(new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendTextReply(java.lang.String str, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.messaging.model.IConversationCallback) j$.util.Objects.requireNonNull(this.mConversationCallbackBinder)).onTextReply(new androidx.car.app.utils.RemoteUtils$1(tzVar), str);
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
