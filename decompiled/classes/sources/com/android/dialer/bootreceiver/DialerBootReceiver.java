package com.android.dialer.bootreceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class DialerBootReceiver extends defpackage.jmy {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/bootreceiver/DialerBootReceiver");
    public defpackage.kjr a;

    @Override // defpackage.jmy, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (!this.b) {
            synchronized (this.c) {
                if (!this.b) {
                    ((defpackage.jmx) defpackage.ajsz.dC(context)).il(this);
                    this.b = true;
                }
            }
        }
        ((defpackage.aimw) ((defpackage.aimw) d.b()).l("com/android/dialer/bootreceiver/DialerBootReceiver", "onReceive", 29, "DialerBootReceiver.java")).v("received ACTION_BOOT_COMPLETED");
        defpackage.tvm.a(context);
        defpackage.ufa.d(context);
        this.a.b();
    }
}
