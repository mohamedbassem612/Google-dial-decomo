package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycn {
    private static volatile boolean a = true;

    public static android.graphics.drawable.Drawable a(android.content.Context context, android.content.Context context2, int i, android.content.res.Resources.Theme theme) {
        android.content.Context pcVar;
        try {
            if (a) {
                if (theme != null) {
                    pcVar = new pc(context2, theme);
                    pcVar.a(theme.getResources().getConfiguration());
                } else {
                    pcVar = context2;
                }
                return den.bO(pcVar, i);
            }
        } catch (android.content.res.Resources.NotFoundException unused) {
        } catch (java.lang.IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (java.lang.NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        android.content.res.Resources resources = context2.getResources();
        int i2 = dwk.a;
        return resources.getDrawable(i, theme);
    }
}
