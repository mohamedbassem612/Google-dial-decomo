package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqj {
    private final j$.nio.file.Path a;
    private final java.lang.String b = "audio";

    public adqj(android.content.Context context, java.lang.String str) {
        this.a = j$.io.FileRetargetClass.toPath(context.getCacheDir()).resolve(str);
    }

    private static java.lang.String c(java.lang.String str) {
        return str.substring(0, java.lang.Math.min(50, str.length())).replaceAll("[\\W]", "_").toLowerCase(java.util.Locale.US);
    }

    public final java.io.File a(java.lang.String str, java.lang.String str2) {
        java.lang.String string = this.a.toString();
        if (str.isEmpty()) {
            throw new java.lang.IllegalArgumentException("invalid empty voiceId");
        }
        int i = defpackage.airu.a;
        defpackage.airr airrVar = defpackage.aisb.a;
        java.lang.String str3 = java.lang.String.format("%s-%s", airrVar.b(str, java.nio.charset.StandardCharsets.UTF_8).toString(), c(str));
        if (str2.isEmpty()) {
            throw new java.lang.IllegalArgumentException("voiceMessage cannot be empty");
        }
        return j$.nio.file.Path.-CC.of(string, new java.lang.String[]{str3, java.lang.String.format(java.util.Locale.US, "%s-%s.%s", airrVar.b(str2, java.nio.charset.StandardCharsets.UTF_8).toString(), c(str2), this.b)}).toFile();
    }

    public final java.io.File b(java.lang.String str, java.lang.String str2) {
        java.io.File fileA = a(str, str2);
        j$.nio.file.Files.createDirectories(j$.io.FileRetargetClass.toPath(fileA.getParentFile()), new j$.nio.file.attribute.FileAttribute[0]);
        return fileA;
    }
}
