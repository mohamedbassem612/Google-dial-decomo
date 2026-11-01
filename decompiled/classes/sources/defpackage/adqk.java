package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqk {
    public final j$.nio.file.Path a;
    public final java.lang.String b = "audio";

    public adqk(android.content.Context context, java.lang.String str) {
        this.a = j$.io.FileRetargetClass.toPath(context.getCacheDir()).resolve(str);
    }

    public static java.lang.String a(java.lang.String str) {
        return str.substring(0, java.lang.Math.min(50, str.length())).replaceAll("[\\W]", "_").toLowerCase(java.util.Locale.US);
    }
}
