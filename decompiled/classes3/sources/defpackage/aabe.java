package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aabe extends android.content.BroadcastReceiver {
    public static java.lang.ref.SoftReference a;
    private static java.lang.ref.SoftReference b;

    protected abstract int a(android.content.Context context, com.google.android.gms.cloudmessaging.CloudMessage cloudMessage);

    protected void b(android.os.Bundle bundle) {
        throw null;
    }

    public final int c(android.content.Intent intent) {
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
                android.util.Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new android.os.Bundle();
        }
        if (j$.util.Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            b(extras);
            return -1;
        }
        android.util.Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final android.content.Context context, final android.content.Intent intent) {
        java.util.concurrent.ExecutorService executorService;
        if (intent != null) {
            final boolean zIsOrderedBroadcast = isOrderedBroadcast();
            final android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (defpackage.aabe.class) {
                java.lang.ref.SoftReference softReference = b;
                java.util.concurrent.ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (java.util.concurrent.ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    aazc aazcVar = aang.a;
                    executorServiceUnconfigurableExecutorService = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new aaiv("firebase-iid-executor")));
                    b = new java.lang.ref.SoftReference(executorServiceUnconfigurableExecutorService);
                }
                executorService = executorServiceUnconfigurableExecutorService;
            }
            executorService.execute(new java.lang.Runnable() { // from class: aabd
                @Override // java.lang.Runnable
                public final void run() {
                    java.util.concurrent.Executor executorV;
                    int iC;
                    android.content.Intent intent2 = intent;
                    android.content.BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        android.os.Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                        android.content.Intent intent3 = parcelableExtra instanceof android.content.Intent ? (android.content.Intent) parcelableExtra : null;
                        android.content.Context context2 = context;
                        defpackage.aabe aabeVar = this.a;
                        if (intent3 != null) {
                            iC = aabeVar.c(intent3);
                        } else if (intent2.getExtras() == null) {
                            iC = 500;
                        } else {
                            com.google.android.gms.cloudmessaging.CloudMessage cloudMessage = new com.google.android.gms.cloudmessaging.CloudMessage(intent2);
                            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                            synchronized (defpackage.aabe.class) {
                                java.lang.ref.SoftReference softReference2 = defpackage.aabe.a;
                                executorV = softReference2 != null ? (java.util.concurrent.Executor) softReference2.get() : null;
                                if (executorV == null) {
                                    aazc aazcVar2 = aang.a;
                                    executorV = aazc.v(1, new aaiv("pscm-ack-executor"));
                                    defpackage.aabe.a = new java.lang.ref.SoftReference(executorV);
                                }
                            }
                            executorV.execute(new opo(context2, cloudMessage, countDownLatch, 19, (short[]) null));
                            int iA = aabeVar.a(context2, cloudMessage);
                            try {
                                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                                if (!countDownLatch.await(1000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                                    android.util.Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (java.lang.InterruptedException e) {
                                android.util.Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                            }
                            iC = iA;
                        }
                        if (zIsOrderedBroadcast && pendingResult != null) {
                            pendingResult.setResultCode(iC);
                        }
                        if (pendingResult != null) {
                            pendingResult.finish();
                        }
                    } catch (java.lang.Throwable th) {
                        if (pendingResult == null) {
                            throw th;
                        }
                        pendingResult.finish();
                        throw th;
                    }
                }
            });
        }
    }
}
