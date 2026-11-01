package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class TelephoneKeypadEventListenerDelegateImpl implements defpackage.hhm {
    private final androidx.car.app.model.ITelephoneKeypadEventListener binder;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public final class TelephoneKeypadEventBinder extends androidx.car.app.model.ITelephoneKeypadEventListener.Stub {
        private final defpackage.hhl clientListener;

        public TelephoneKeypadEventBinder(defpackage.hhl hhlVar) {
            aooh.f(hhlVar, "clientListener");
            this.clientListener = hhlVar;
        }

        public static final java.lang.Object onKeyDown$lambda$0(com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder telephoneKeypadEventBinder, int i) {
            telephoneKeypadEventBinder.clientListener.a(i);
            return null;
        }

        public static final java.lang.Object onKeyLongPress$lambda$0(com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder telephoneKeypadEventBinder, int i) {
            telephoneKeypadEventBinder.clientListener.b(i);
            return null;
        }

        public static final java.lang.Object onKeyUp$lambda$0(com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder telephoneKeypadEventBinder, int i) {
            telephoneKeypadEventBinder.clientListener.c();
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyDown(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            aooh.f(iOnDoneCallback, "callback");
            defpackage.rx.f(iOnDoneCallback, "TelephoneKeypadEventBinder#onKeyDown", new defpackage.abc() { // from class: hho
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder.onKeyDown$lambda$0(this.a, i);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyLongPress(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            aooh.f(iOnDoneCallback, "callback");
            defpackage.rx.f(iOnDoneCallback, "TelephoneKeypadEventBinder#onKeyLongPress", new defpackage.abc() { // from class: hhp
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder.onKeyLongPress$lambda$0(this.a, i);
                    return null;
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadEventListener
        public void onKeyUp(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            aooh.f(iOnDoneCallback, "callback");
            defpackage.rx.f(iOnDoneCallback, "TelephoneKeypadEventBinder#onKeyUp", new defpackage.abc() { // from class: hhn
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder.onKeyUp$lambda$0(this.a, i);
                    return null;
                }
            });
        }
    }

    public TelephoneKeypadEventListenerDelegateImpl(defpackage.hhl hhlVar) {
        this.binder = hhlVar != null ? new com.android.car.libraries.apphost.external.model.TelephoneKeypadEventListenerDelegateImpl.TelephoneKeypadEventBinder(hhlVar) : new androidx.car.app.model.ITelephoneKeypadEventListener.Default();
    }

    public void sendKeyDown(int i, defpackage.tz tzVar) {
        aooh.f(tzVar, "callback");
        try {
            this.binder.onKeyDown(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendKeyLongPress(int i, defpackage.tz tzVar) {
        aooh.f(tzVar, "callback");
        try {
            this.binder.onKeyLongPress(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendKeyUp(int i, defpackage.tz tzVar) {
        aooh.f(tzVar, "callback");
        try {
            this.binder.onKeyUp(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TelephoneKeypadEventListenerDelegateImpl() {
        defpackage.hhl hhlVar = null;
        this(hhlVar, 1, hhlVar);
    }

    public /* synthetic */ TelephoneKeypadEventListenerDelegateImpl(defpackage.hhl hhlVar, int i, aooc aoocVar) {
        this(1 == (i & 1) ? null : hhlVar);
    }
}
