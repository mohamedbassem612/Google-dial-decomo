package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ytk extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.ytm a;
    final /* synthetic */ java.lang.Boolean b;
    final /* synthetic */ aows c;

    public ytk(defpackage.ytm ytmVar, aows aowsVar, java.lang.Boolean bool) {
        this.a = ytmVar;
        this.c = aowsVar;
        this.b = bool;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:3:0x0015, B:5:0x001b, B:6:0x001f, B:8:0x0023, B:13:0x0034, B:11:0x002c, B:14:0x003a, B:19:0x004b, B:21:0x0051, B:17:0x0043), top: B:29:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:3:0x0015, B:5:0x001b, B:6:0x001f, B:8:0x0023, B:13:0x0034, B:11:0x002c, B:14:0x003a, B:19:0x004b, B:21:0x0051, B:17:0x0043), top: B:29:0x0015 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        aooh.f(intent, "intent");
        ahok ahokVarF = this.a.c.f(1185, "Broadcast to OnDeviceVersionFlow.of");
        aows aowsVar = this.c;
        java.lang.Boolean bool = this.b;
        try {
            java.lang.String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -810471698:
                        if (action.equals("android.intent.action.PACKAGE_REPLACED")) {
                            if (bool.booleanValue()) {
                                aowsVar.b(aojh.a);
                            }
                        }
                        break;
                    case 172491798:
                        if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                            if (bool.booleanValue()) {
                                aowsVar.b(aojh.a);
                            }
                        }
                        break;
                    case 525384130:
                        if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                            aowsVar.b(aojh.a);
                        }
                        break;
                    case 1544582882:
                        if (action.equals("android.intent.action.PACKAGE_ADDED")) {
                            aowsVar.b(aojh.a);
                        }
                        break;
                }
            }
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
