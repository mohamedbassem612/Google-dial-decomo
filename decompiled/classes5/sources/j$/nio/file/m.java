package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class m {
    public final j$.nio.file.Path a;
    public final java.lang.Object b;
    public final java.nio.file.DirectoryStream c;
    public final java.util.Iterator d;
    public boolean e;

    public m(j$.nio.file.Path path, java.lang.Object obj, java.nio.file.DirectoryStream directoryStream) {
        this.a = path;
        this.b = obj;
        this.c = directoryStream;
        this.d = directoryStream.iterator();
    }
}
