package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abvy extends android.os.Handler {
    public final /* synthetic */ com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abvy(com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService messageBasedBlockingService, android.os.Looper looper) {
        super(looper);
        j$.util.Objects.requireNonNull(messageBasedBlockingService);
        this.a = messageBasedBlockingService;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        android.os.Messenger messenger = message.replyTo;
        if (message == null || message.peekData() == null || message.replyTo == null || !message.peekData().containsKey("phoneNumbers")) {
            com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.d(com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.c(2, "Invalid message"), messenger, i);
            return;
        }
        com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService messageBasedBlockingService = this.a;
        if (!messageBasedBlockingService.e.y()) {
            com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.d(com.google.android.libraries.dialer.blocking.messagebased.MessageBasedBlockingService.c(3, "Service is not running in default dialer app"), messenger, i);
            return;
        }
        android.os.Bundle bundlePeekData = message.peekData();
        int i2 = message.sendingUid;
        aiql.I(ajan.g(!"com.google.android.contacts".equals(messageBasedBlockingService.getPackageManager().getNameForUid(i2)) ? aiql.z(java.lang.Boolean.FALSE) : messageBasedBlockingService.a.eU(ahqx.i(new lqh(messageBasedBlockingService, i2, 10))), ahqx.c(new lgl(this, i, bundlePeekData, 2)), messageBasedBlockingService.a), ahqx.f(new defpackage.abvx(this, messenger, i)), messageBasedBlockingService.b);
    }
}
