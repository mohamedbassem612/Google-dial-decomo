package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaiy {
    public static final defpackage.aaiy a = new defpackage.aaiy();
    private defpackage.zzx b = null;

    public static defpackage.zzx b(android.content.Context context) {
        return a.a(context);
    }

    public final synchronized defpackage.zzx a(android.content.Context context) {
        defpackage.zzx zzxVar;
        zzxVar = this.b;
        if (zzxVar == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            zzxVar = new defpackage.zzx(context);
            this.b = zzxVar;
        }
        return zzxVar;
    }
}
