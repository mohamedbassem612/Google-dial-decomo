package j$.adapter;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class b {
    public static final j$.nio.file.spi.c a;

    static {
        j$.nio.file.spi.c aVar;
        if (j$.adapter.a.b) {
            java.nio.file.spi.FileSystemProvider fileSystemProviderProvider = java.nio.file.FileSystems.getDefault().provider();
            int i = j$.nio.file.spi.a.c;
            if (fileSystemProviderProvider == null) {
                aVar = null;
            } else {
                aVar = fileSystemProviderProvider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) fileSystemProviderProvider).a : new j$.nio.file.spi.a(fileSystemProviderProvider);
            }
        } else {
            if (j$.adapter.a.c) {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(android.os.StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            aVar = j$.desugar.sun.nio.fs.d.a;
        }
        a = aVar;
        aVar.j(java.net.URI.create("file:///"));
    }
}
