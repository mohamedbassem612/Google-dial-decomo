package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acps {
    public static final defpackage.acps a = new defpackage.acps();

    public final long a(android.content.Context context, int i) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        return ((long) context.getResources().getColor(i, context.getTheme())) << 32;
    }
}
