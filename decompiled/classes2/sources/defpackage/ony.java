package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ony {
    public static final aimz a = aimz.i("com/android/dialer/fliptosilence/FlipToShushSettings");
    public final android.content.Context b;
    public final ojo c;
    public final zzx d;
    private final ajct e;

    public ony(ajct ajctVar, android.content.Context context, zzx zzxVar, ojo ojoVar) {
        this.e = ajctVar;
        this.b = context;
        this.d = zzxVar;
        this.c = ojoVar;
    }

    public static android.content.Intent a() {
        return new android.content.Intent().setPackage("com.google.android.apps.wellbeing").setAction("com.google.android.apps.wellbeing.action.AUTO_DND");
    }

    public static boolean c(android.content.Context context) {
        return !context.getPackageManager().queryIntentActivities(a(), 65536).isEmpty();
    }

    public final ajcq b() {
        return this.e.eU(ahqx.i(new defpackage.omj(this, 5)));
    }
}
